package org.softlang.megal.plugins.util.antlr;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.api.Artifact;
import org.softlang.megal.plugins.api.FragmentationPlugin;
import org.softlang.megal.plugins.util.Fragments.Fragment;

public abstract class ANTLRFragmentationReasoner extends FragmentationPlugin {

	abstract public Collection<FragmentationListenerRule> getRules ();
	abstract public ParseTree getParseTree (CharStream input);
	
	@Override
	public List<Fragment> getFragments(Entity entity, Artifact artifact) {
		
		FragmentationListener listener = new FragmentationListener(entity, artifact, getRules());
		
		ParseTreeWalker walker = new ParseTreeWalker();
		
		try {
			
			walker.walk(listener, getParseTree(new ANTLRInputStream(artifact.getChars().openStream())));
			
		} catch (IOException e) {

			e.printStackTrace();
			
		}
		
		return listener.getFragments();
		
	}
	
}
