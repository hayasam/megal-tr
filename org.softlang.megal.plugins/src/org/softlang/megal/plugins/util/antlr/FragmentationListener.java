package org.softlang.megal.plugins.util.antlr;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.softlang.megal.plugins.api.FragmentationPlugin;
import org.softlang.megal.plugins.util.antlr.Fragment;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;

public class FragmentationListener implements ParseTreeListener {

	private List<FragmentationRule<ParserRuleContext>> rules = new ArrayList<FragmentationRule<ParserRuleContext>>();
	private Stack<FragmentationPlugin.Fragment> fragments = new Stack<FragmentationPlugin.Fragment>();
	
	public List<FragmentationPlugin.Fragment> getFragments() {
		return fragments;
	}
	
	@SuppressWarnings("unchecked")
	public <C extends ParserRuleContext> void addFragmentationRule (FragmentationRule<C> rule) {
		rules.add( (FragmentationRule<ParserRuleContext>) rule);
	}
	
	public void exitEveryRule (ParserRuleContext context) {
		
		for (FragmentationRule<ParserRuleContext> rule : rules) {
			
			if (rule.test(context)) {
				
				Fragment<ParserRuleContext> fragment = rule.create(context);
				
				while(rule.hasParts() && !fragments.isEmpty()) {
					
					fragment.addPart(fragments.pop());
					
				}
				
				fragments.push(fragment);
				
			}
			
		}
		
	}

	@Override
	public void enterEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
