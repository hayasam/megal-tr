package org.softlang.megal.plugins.util.antlr;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.api.Artifact;
import org.softlang.megal.plugins.util.Fragments.Fragment;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 * ANTLR ParseTreeListener for code fragmentation
 * @author maxmeffert
 *
 */
public class FragmentationListener implements ParseTreeListener {

	/**
	 * 
	 */
	private Entity entity;
	
	/**
	 * 
	 */
	private Artifact artifact;
	
	/**
	 * A List of fragmentation rules
	 */
	private Collection<FragmentationListenerRule> rules;
	
	/**
	 * Stack for collected fragments
	 */
	private Queue<Fragment> fragments = new LinkedList<Fragment>();
	
	public FragmentationListener (Entity entity, Artifact artifact, Collection<FragmentationListenerRule> rules) {
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
		for (FragmentationListenerRule rule : rules) {

			// if the rule is applicable
			if (rule.test(context)) {
				
				// create a fragment from the parser rule context
				Fragment fragment = rule.create(entity, artifact, context);
				
				// if the rule is for 'compound' fragment, add previously collected fragments as parts
				// previously collected fragments are children of the AST nodes of the current fragment
				while(!rule.isLeaf(context) && !fragments.isEmpty()) {
					
					fragment.addPart(fragments.remove());
					
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
