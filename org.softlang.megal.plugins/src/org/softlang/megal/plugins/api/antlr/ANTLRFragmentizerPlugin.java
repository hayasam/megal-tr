package org.softlang.megal.plugins.api.antlr;

import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

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

		abstract protected Class<C> contextType ();
		
		/**
		 * Whether the rule is for 'compound' fragments which contains further fragment parts.
		 * Defaults to false.
		 * 
		 * @return Whether the rule is for 'compound' fragments
		 */
		abstract protected boolean isLeaf (C context);
		
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
		
		final public boolean accept (ParserRuleContext context) {
			return contextType().isInstance(context) 
					&& test(contextType().cast(context));
		}
		
		final public boolean hasParts (ParserRuleContext context) {
			return !isLeaf(contextType().cast(context));
		}
		
		final public Fragment getFragment (Entity entity, Artifact artifact, ParserRuleContext context) {
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
					Fragment fragment = rule.getFragment(entity, artifact, context);
					
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
		FragmentationListener listener = new FragmentationListener(entity, artifact, getRules());
		
		// Create a new parse tree walker
		ParseTreeWalker walker = new ParseTreeWalker();
		
		try {
			
			// Create a new from the input stream above
			ParseTree parseTree = getParserFactory().getParseTree(artifact);

			// Walk the parse tree with the fragmentation listener to collect fragments
			walker.walk(listener, parseTree);
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
		// Return the collected fragments
		return listener.getFragments();
		
	}
	
}
