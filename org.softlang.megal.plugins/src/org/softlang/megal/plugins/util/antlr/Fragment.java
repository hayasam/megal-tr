package org.softlang.megal.plugins.util.antlr;

import org.antlr.v4.runtime.ParserRuleContext;
import org.softlang.megal.plugins.api.FragmentationPlugin;

public abstract class Fragment<C extends ParserRuleContext> extends FragmentationPlugin.Fragment {
	
	private C context;
	
	public Fragment(C context) {
		this.context = context;
	}
	
	public C getContext () {
		return context;
	}
	
}