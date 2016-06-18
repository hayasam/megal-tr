package org.softlang.megal.plugins.util.antlr;

import org.antlr.v4.runtime.ParserRuleContext;
import org.softlang.megal.plugins.util.Fragments.FactProvider;

public abstract class ANTLRParserRuleContextFactProvider<C extends ParserRuleContext> implements FactProvider {

	private C context;
	
	public ANTLRParserRuleContextFactProvider (C context) {
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
