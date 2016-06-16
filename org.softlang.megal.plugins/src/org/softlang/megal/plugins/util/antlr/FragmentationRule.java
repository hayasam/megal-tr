package org.softlang.megal.plugins.util.antlr;

import org.antlr.v4.runtime.ParserRuleContext;
import org.softlang.megal.plugins.api.FragmentationPlugin.Fragment;

public abstract class FragmentationRule {

	abstract public boolean test (ParserRuleContext context);
	abstract public Fragment create (ParserRuleContext context);
	
	public boolean hasParts () {
		return false;
	}
	
	
}
