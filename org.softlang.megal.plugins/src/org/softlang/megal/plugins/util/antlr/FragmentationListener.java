package org.softlang.megal.plugins.util.antlr;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.softlang.megal.plugins.api.FragmentationPlugin;
import org.softlang.megal.plugins.api.FragmentationPlugin.Fragment;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;

public class FragmentationListener implements ParseTreeListener {

	private List<FragmentationRule> rules = new ArrayList<FragmentationRule>();
	private Stack<FragmentationPlugin.Fragment> fragments = new Stack<FragmentationPlugin.Fragment>();
	
	public List<FragmentationPlugin.Fragment> getFragments() {
		return fragments;
	}
	
	public void addFragmentationRule (FragmentationRule rule) {
		rules.add(rule);
	}
	
	public void exitEveryRule (ParserRuleContext context) {
		
		for (FragmentationRule rule : rules) {
			
			if (rule.test(context)) {
				
				Fragment fragment = rule.create((ParserRuleContext)context);
				
				while(rule.hasParts() && !fragments.isEmpty()) {
					
					fragment.addPart(fragments.pop());
					
				}
				
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
