package org.softlang.megal.plugins.api.antlr;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.api.Artifact;
import org.softlang.megal.plugins.api.FragmentizerPlugin;
import org.softlang.megal.plugins.api.fragmentation.Fragments.Fragment;

/**
 * Abstract base class for ANTLR base fragmentation reasoners
 * @author maxmeffert
 *
 */
public abstract class ANTLRFragmentizerPlugin<P extends Parser, L extends Lexer> extends FragmentizerPlugin {

	
	/**
	 * Interface for ANTLR parse tree fragmentation rules
	 * 
	 * @author maxmeffert
	 *
	 */
	static public abstract class FragmentationRule<C extends ParserRuleContext> {

		static final public class IllegalContextException extends IllegalArgumentException {

			private static final long serialVersionUID = -4814695582039036934L;
			
			public IllegalContextException (Class<? extends ParserRuleContext> contextType) {
				super("Parameter 'context' must be instance of " + contextType.getName() + "! "
					+ "Test FragmentationRule.accept(context) first!");
			}
			
			
		}
		
		abstract protected Class<C> contextType ();
		
		/**
		 * Whether the rule is for 'compound' fragments which contains further fragment parts.
		 * Defaults to false.
		 * 
		 * @return Whether the rule is for 'compound' fragments
		 */
		abstract protected boolean isAtom (C context);
		
		/**
		 * Tests whether the rule is applicable to the current parser rule context
		 * 
		 * @param context The parser rule context to test 
		 * @return Whether the rule is applicable to the current parser rule context
		 */
		abstract protected boolean test (C context);
		
		/**
		 * Creates a new fragment from a parser rule context
		 * 
		 * @param context The parser rule context from which the fragment is created
		 * @return A new fragment
		 */
		abstract protected Fragment createFragment (Entity entity, Artifact artifact, C context);
		
		//================================================================
		// Hack for contra-variant method calls
		
		final public boolean accept (ParserRuleContext context) {
			return contextType().isInstance(context) 
					&& test(contextType().cast(context));
		}
		
		final public boolean hasParts (ParserRuleContext context) {
			if (!contextType().isInstance(context)) {
				throw new IllegalContextException(contextType());
			}
			return !isAtom(contextType().cast(context));
		}
		
		final public Fragment newFragment (Entity entity, Artifact artifact, ParserRuleContext context) {
			if (!contextType().isInstance(context)) {
				throw new IllegalContextException(contextType());
			}
			return createFragment(entity, artifact, contextType().cast(context));
		}
		
	}
	 
	/**
	 * ANTLR ParseTreeListener for code fragmentation
	 * @author maxmeffert
	 *
	 */
	static public class FragmentationListener implements ParseTreeListener {
		
		/**
		 * The containing entity of the fragments to collect
		 */
		private Entity entity;
		
		/**
		 * The containing artifact of the fragments to collect
		 */
		private Artifact artifact;
		
		/**
		 * A List of fragmentation rules
		 */
		private Collection<FragmentationRule<? extends ParserRuleContext>> rules;
		
		/**
		 * Queue for collected fragments
		 */
		private Queue<Fragment> fragments = new LinkedList<Fragment>();
		
		/**
		 * Constructs a new FragmentationListener
		 * @param entity
		 * @param artifact
		 * @param rules
		 */
		public FragmentationListener (Entity entity, Artifact artifact, Collection<FragmentationRule<? extends ParserRuleContext>> rules) {
			this.entity = entity;
			this.artifact = artifact;
			this.rules = rules;
		}
		
		/**
		 * Getter for collected fragments
		 * @return The list of collected fragments
		 */
		public Collection<Fragment> getFragments() {
			return fragments;
		}
		
		/**
		 * Collects fragments depending on fragmentation rules
		 */
		
		@Override
		public void exitEveryRule (ParserRuleContext context) {
			
			// for each fragmentation rule
			for (FragmentationRule<?> rule : rules) {
				
				// if the rule is applicable
				if (rule.accept(context)) {
					
					// create a fragment from the parser rule context
					Fragment fragment = rule.newFragment(entity, artifact, context);
					
					// check whether the rule is for a leaf fragment
					if (rule.hasParts(context)) {
						
						// while the rule is not for a leaf fragment, 
						while(!fragments.isEmpty()) {
							
							// add previously collected fragments as parts 
							// (previously collected fragments are children of the AST nodes of the current fragment)
							fragment.addPart(fragments.remove());
							
						}
						
					}
					
					
					
					// push the current fragment onto the stack
					fragments.add(fragment);
					
				}
				
			}
			
		}

		@Override
		public void enterEveryRule(ParserRuleContext arg0) {
			// do nothing		
		}

		@Override
		public void visitErrorNode(ErrorNode arg0) {
			// do nothing
		}

		@Override
		public void visitTerminal(TerminalNode arg0) {
			// do nothing
		}
		
		
		
	}

	static private class FListener implements ParseTreeListener {

		private Entity entity;
		private Artifact artifact;
		private Collection<FragmentationRule<?>> rules;
		
		private Stack<ParserRuleContext> stack = new Stack<ParserRuleContext>();
		private Map<ParserRuleContext,Fragment> fragments = new HashMap<ParserRuleContext,Fragment>();
		
		public FListener (Entity entity, Artifact artifact, Collection<FragmentationRule<? extends ParserRuleContext>> rules) {
			this.entity = entity;
			this.artifact = artifact;
			this.rules = rules;
		}
		
		public Collection<Fragment> getFragments () {
			return fragments.values().stream()
					.filter( f -> f.isRoot() )
					.collect(Collectors.toList());
		}
		
		@Override
		public void enterEveryRule(ParserRuleContext context) {
			
			for (FragmentationRule<?> rule : rules) {
				
				if (rule.accept(context)) {
					
					Fragment f = rule.newFragment(entity, artifact, context);

					if (rule.hasParts(context)) {
						
						stack.push(context);
						
					}
					
					fragments.put(context, f);
					
					if (!stack.isEmpty()
							&& fragments.containsKey(stack.peek())) {

						Fragment p = fragments.get(stack.peek());

						p.addPart(f);
						
						
					}
					
					
				}
				
			}
			
		}

		@Override
		public void exitEveryRule(ParserRuleContext context) {
			
			if (!stack.isEmpty() && stack.peek() == context) {
				
				stack.pop();
				
				if (!stack.isEmpty() 
						&& fragments.containsKey(stack.peek())
						&& fragments.containsKey(context)) {
					
					fragments.get(stack.peek()).addPart(fragments.get(context));
					
				}
				
			}
			
		}

		@Override
		public void visitErrorNode(ErrorNode arg0) {
			// do nothing			
		}

		@Override
		public void visitTerminal(TerminalNode arg0) {
			// do nothing			
		}
		
	}
	
	/**
	 * Gets the collection for fragmentation rules
	 * @return
	 */
	abstract public Collection<FragmentationRule<? extends ParserRuleContext>> getRules ();
		
	abstract public ANTLRParserFactory<P, L> getParserFactory ();
	
	/**
	 * Gets the fragments of a given entity and its associated artifact
	 */
	@Override
	final public Collection<Fragment> getFragments(Entity entity, Artifact artifact) {
		
		// Create a new fragmentation listener
		FListener listener = new FListener(entity, artifact, getRules());
		
		// Create a new parse tree walker
		ParseTreeWalker walker = new ParseTreeWalker();
		
		try {
			
			// Create a new from the input stream above
			ParseTree parseTree = getParserFactory().getParseTree(artifact);
			
			// Walk the parse tree with the fragmentation listener to collect fragments
			walker.walk(listener, parseTree);
			
				
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} catch (Throwable e) {
			
			e.printStackTrace();
			
		}
		
		// Return the collected fragments
		return listener.getFragments();
		
	}
	
}
