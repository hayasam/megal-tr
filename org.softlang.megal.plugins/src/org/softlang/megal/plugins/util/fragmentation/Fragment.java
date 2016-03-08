package org.softlang.megal.plugins.util.fragmentation;

import java.util.ArrayList;
import java.util.List;

public class Fragment {
	
	private String name;
	private String type;
	private String link;
	private List<Fragment> fragments;
	
	public Fragment () {
		
		fragments = new ArrayList<Fragment>();
		
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public List<Fragment> getFragments() {
		return fragments;
	}
	
	public void addFragments (List<Fragment> fragments) {
		
		this.fragments.addAll(fragments);
		
	}
	
	public void accept (FragmentVisitor v) {
		
		v.visit(this);
		
	}
	
	public String toString () {
		
		return "Fragment("+name+","+type+")";
		
	}
	
}
