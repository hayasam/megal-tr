package org.softlang.megal.plugins.util.antlr.old;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

@Deprecated
public abstract class ANTLRFragmentationVisitor implements ParseTreeVisitor<Fragment> {

	abstract public Fragment createFragment (RuleContext context);
	
	@Override
	public Fragment visit(ParseTree tree) {
		
		return tree.accept(this);
		
	}

	@Override
	public Fragment visitChildren(RuleNode node) {
		
		Fragment fragment = createFragment(node.getRuleContext());
		
		for (int i=0; i < node.getChildCount(); i++) {
			
			ParseTree child = node.getChild(i);
			fragment.addChild(child.accept(this));
			
		}
		
		return fragment;
		
	}

	@Override
	public Fragment visitErrorNode(ErrorNode arg0) {
		
		return new Fragment();
		
	}

	@Override
	public Fragment visitTerminal(TerminalNode arg0) {
		
		return new Fragment();
		
	}

}
