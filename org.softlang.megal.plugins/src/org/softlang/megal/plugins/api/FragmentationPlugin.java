package org.softlang.megal.plugins.api;

import java.io.Reader;
import java.util.List;

import org.softlang.megal.mi2.api.AbstractPlugin;
import org.softlang.megal.plugins.util.fragmentation.Fragment;
import org.softlang.megal.plugins.util.fragmentation.FragmentationException;

public abstract class FragmentationPlugin extends AbstractPlugin {

	abstract public List<Fragment> getFragments (Reader r) throws FragmentationException;
	
}
