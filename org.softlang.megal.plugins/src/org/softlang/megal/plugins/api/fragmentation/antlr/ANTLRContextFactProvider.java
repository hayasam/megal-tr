package org.softlang.megal.plugins.api.fragmentation.antlr;

import org.antlr.v4.runtime.ParserRuleContext;
import org.softlang.megal.plugins.api.fragmentation.Fragments.FactProvider;

public abstract class ANTLRContextFactProvider<C extends ParserRuleContext> implements FactProvider {

	private C context;
	
	public ANTLRContextFactProvider (C context) {
		this.context = context;
	}
	
	final protected C getContext () {
		return context;
	}

	@Override
	public String getText() {
		return ANTLRUtils.originalText(context);
	}

}
