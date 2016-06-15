package org.softlang.megal.plugins.util.fragmentation;

import org.antlr.v4.runtime.RuleContext;

public interface ANTLRFragmentationRule<C extends RuleContext> {

	C getRuleCotnext();
	Fragment createFragment(C context);
	
}
