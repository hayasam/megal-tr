package org.softlang.megal.plugins.api;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.softlang.megal.mi2.api.AbstractPlugin;
import org.softlang.megal.plugins.util.antlr.old.FragmentationException;

public abstract class FragmentationPlugin extends AbstractPlugin {

	static public abstract class Fragment {
		
		abstract public String getType();
		abstract public String getName();
		abstract public String getLink();
		
		private List<Fragment> parts = new ArrayList<Fragment>();
		
		final public List<Fragment> getParts() {
			return parts;
		}
		
		final public void addPart(Fragment part) {
			parts.add(part);
		}
		
		final public String toString () {
			return getType() + "(" + getName() + ")";
		}
		
	}
	
	abstract public List<Fragment> getFragments (Reader r) throws FragmentationException;
	
}
