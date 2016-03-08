package org.softlang.megal.plugins.util;

import java.util.ArrayList;
import java.util.List;

import org.softlang.megal.plugins.util.fragmentation.Fragment;

public abstract class Fragments {
	
	static public List<Fragment> create () {
		
		return new ArrayList<Fragment>();
		
	}
	
	static public Fragment newFragment () {
		
		return new Fragment();
		
	}
	
}
