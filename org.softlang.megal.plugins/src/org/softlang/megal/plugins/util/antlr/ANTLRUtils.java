package org.softlang.megal.plugins.util.antlr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;

public abstract class ANTLRUtils {

	static public String originalText (ParserRuleContext context) {
		
		int a = context.getStart().getStartIndex();
	    int b = context.getStop().getStopIndex();
	    Interval interval = new Interval(a,b);
		CharStream stream = context.getStart().getInputStream();
		
		return stream.getText(interval);
		
	}
	
	
}
