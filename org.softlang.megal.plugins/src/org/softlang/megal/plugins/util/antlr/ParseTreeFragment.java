package org.softlang.megal.plugins.util.antlr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;
import org.softlang.megal.mi2.api.Artifact;
import org.softlang.megal.plugins.util.Fragments.Fragment;

/**
 * Abstract class for fragments wrapped around an ANTLR parser rule context.
 * @author maxmeffert
 *
 * @param <C> The wrapped parser rule context class
 */
public abstract class ParseTreeFragment<C extends ParserRuleContext> extends Fragment {
	
	/**
	 * The wrapped parser rule context
	 */
	private C context;
	
	/**
	 * Constructs a new parser tree fragment
	 * @param context The wrapped parser rule context
	 */
	public ParseTreeFragment(Artifact artifact, C context) {
		super(artifact);
		this.context = context;
	}
	
	/**
	 * Gets the wrapped parser rule context
	 * @return The wrapped parser rule context
	 */
	final public C getContext () {
		return context;
	}
	
	@Override
	final public String getText() {
		
		int a = getContext().start.getStartIndex();
	    int b = getContext().stop.getStopIndex();
	    Interval interval = new Interval(a,b);
		CharStream stream = getContext().start.getInputStream();
		
		return stream.getText(interval);
		
	}
	
}