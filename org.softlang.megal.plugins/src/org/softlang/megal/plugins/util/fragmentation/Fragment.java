package org.softlang.megal.plugins.util.fragmentation;

import java.util.ArrayList;
import java.util.List;

public class Fragment {
	
	private String name;
	private String type;
	private String link;
	private List<Fragment> children;
	
	public Fragment () {
		
		children = new ArrayList<Fragment>();
		
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
			
	public void addChild (Fragment child) {
		
		children.add(child);
		
	}
	
	public void removeChild (Fragment child) {
		
		children.remove(child);
		
	}
	
	public List<Fragment> getChildren() {
		
		return children;
	}

	public boolean hasChildren () {
		
		return children.size() > 0;
		
	}
	
	public boolean isBlank () {
		
		return name == null || name.length() == 0;
	}

	public void accept (FragmentVisitor v) {
		
		v.visit(this);
		
	}
	
	public String toString () {
		
		return "Fragment("+name+","+type+")";
		
	}
	
}
