package org.softlang.megal.plugins.api;

import java.util.List;

import org.softlang.megal.mi2.api.AbstractPlugin;
import org.softlang.megal.mi2.api.Artifact;
import org.softlang.megal.plugins.util.Fragments.Fragment;

public abstract class FragmentationPlugin extends AbstractPlugin {
	
	abstract public List<Fragment> getFragments (Artifact artifact);
	
}
