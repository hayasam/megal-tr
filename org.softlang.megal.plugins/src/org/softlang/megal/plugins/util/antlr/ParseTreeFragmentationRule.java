package org.softlang.megal.plugins.util.antlr;

import org.antlr.v4.runtime.ParserRuleContext;
import org.softlang.megal.mi2.api.Artifact;
import org.softlang.megal.plugins.util.Fragments.Fragment;

/**
 * Abstract class for ANTLR parse tree fragmentation rules
 * 
 * @author maxmeffert
 *
 */
public abstract class ParseTreeFragmentationRule {

	/**
	 * Tests whether the rule is applicable to the current parser rule context
	 * 
	 * @param context The parser rule context to test 
	 * @return Whether the rule is applicable to the current parser rule context
	 */
	abstract public boolean test (ParserRuleContext context);
	
	/**
	 * Creates a new fragment from a parser rule context
	 * 
	 * @param context The parser rule context from which the fragment is created
	 * @return A new fragment
	 */
	abstract public Fragment create (Artifact artifact, ParserRuleContext context);
	
	/**
	 * Whether the rule is for 'compound' fragments which contains further fragment parts.
	 * Defaults to false.
	 * 
	 * @return Whether the rule is for 'compound' fragments
	 */
	public boolean hasParts () {
		return false;
	}
	
	
}
