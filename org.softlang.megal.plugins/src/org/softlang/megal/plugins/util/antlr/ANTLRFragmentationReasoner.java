package org.softlang.megal.plugins.util.antlr;

import java.io.IOException;
import java.util.Collection;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.api.Artifact;
import org.softlang.megal.plugins.api.FragmentationPlugin;
import org.softlang.megal.plugins.util.Fragments.Fragment;

/**
 * Abstract base class for ANTLR base fragmentation reasoners
 * @author maxmeffert
 *
 */
public abstract class ANTLRFragmentationReasoner extends FragmentationPlugin {

	/**
	 * Gets the collection for fragmentation rules
	 * @return
	 */
	abstract public Collection<FragmentationListenerRule> getRules ();
	
	/**
	 * Gets the parse tree of a given input char stream
	 * @param input
	 * @return
	 */
	abstract public ParseTree getParseTree (CharStream input);
	
	/**
	 * Gets the fragments of a given entity and its associated artifact
	 */
	@Override
	public Collection<Fragment> getFragments(Entity entity, Artifact artifact) {
		
		// Create a new fragmentation listener
		FragmentationListener listener = new FragmentationListener(entity, artifact, getRules());
		
		// Create a new parse tree walker
		ParseTreeWalker walker = new ParseTreeWalker();
		
		try {
			
			// Create a new input stream from the artifact
			ANTLRInputStream input = new ANTLRInputStream(artifact.getChars().openStream());
			
			// Create a new from the input stream above
			ParseTree parseTree = getParseTree(input);

			// Walk the parse tree with the fragmentation listener to collect fragments
			walker.walk(listener, parseTree);
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
		// Return the collected fragments
		return listener.getFragments();
		
	}
	
}
