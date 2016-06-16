package org.softlang.megal.plugins.util.antlr;

import org.antlr.v4.runtime.ParserRuleContext;
import org.softlang.megal.plugins.util.antlr.Fragment;

public interface FragmentationRule<C extends ParserRuleContext> {

	public boolean hasParts ();
	
	public boolean test (ParserRuleContext context);
	
	public Fragment<C> create (C context);
	
}
