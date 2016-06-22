package org.softlang.megal.plugins.api.antlr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;

/**
 * Utility class for ANTLR stuff.
 * @author maxmeffert
 *
 */
public abstract class ANTLRUtils {

	/**
	 * Gets the original source text for a given ParserRuleContext
	 * @param context
	 * @return
	 */
	static public String originalText (ParserRuleContext context) {
		
		int a = context.getStart().getStartIndex();
		int b = context.getStop().getStopIndex();
		Interval interval = new Interval(a,b);
		CharStream stream = context.getStart().getInputStream();
		
		return stream.getText(interval);
		
	}
	
	
}
