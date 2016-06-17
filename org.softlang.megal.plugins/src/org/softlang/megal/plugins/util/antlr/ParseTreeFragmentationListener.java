package org.softlang.megal.plugins.util.antlr;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.api.Artifact;
import org.softlang.megal.plugins.util.Fragments.Fragment;

import java.util.Collection;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;

/**
 * ANTLR ParseTreeListener for code fragmentation
 * @author maxmeffert
 *
 */
public class ParseTreeFragmentationListener implements ParseTreeListener {

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
	private Collection<ParseTreeFragmentationRule> rules;
	
	/**
	 * Stack for collected fragments
	 */
	private Stack<Fragment> fragments = new Stack<Fragment>();
	
	public ParseTreeFragmentationListener (Entity entity, Artifact artifact, Collection<ParseTreeFragmentationRule> rules) {
		this.entity = entity;
		this.artifact = artifact;
		this.rules = rules;
	}
	
	/**
	 * Getter for collected fragments
	 * @return The list of collected fragments
	 */
	public List<Fragment> getFragments() {
		return fragments;
	}
	
	
	/**
	 * Collects fragments depending on fragmentation rules
	 */
	@Override
	public void exitEveryRule (ParserRuleContext context) {
		
		// for each fragmentation rule
		for (ParseTreeFragmentationRule rule : rules) {

			// if the rule is applicable
			if (rule.test(context)) {
				
				// create a fragment from the parser rule context
				Fragment fragment = rule.create(entity, artifact, context);
				
				// if the rule is for 'compound' fragment, add previously collected fragments as parts
				// previously collected fragments are children of the AST nodes of the current fragment
				while(rule.hasParts() && !fragments.isEmpty()) {
					
					fragment.addPart(fragments.pop());
					
				}
				
				// push the current fragment onto the stack
				fragments.push(fragment);
				
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
