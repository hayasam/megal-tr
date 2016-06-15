package org.softlang.megal.plugins.util.fragmentation;

import java.util.ArrayList;
import java.util.List;

@Deprecated
public class FragmentGraph {

	static private class Edge {
		
		private Fragment parent;
		private Fragment child;
		
		public Edge (Fragment parent, Fragment child) {
			this.parent = parent;
			this.child = child;
		}

		public Fragment getParent() {
			return parent;
		}

		public void setParent(Fragment parent) {
			this.parent = parent;
		}

		public Fragment getChild() {
			return child;
		}

		public void setChild(Fragment child) {
			this.child = child;
		}
		
		
		
	}
	
	private List<Edge> edges = new ArrayList<Edge>();
	
	public FragmentGraph (Fragment root) {
		
		init(root);
		
	}
	
	private void init (Fragment parent) {
		
		for (Fragment child : parent.getChildren()) {
			
			edges.add(new Edge(parent, child));
			init(child);
			
		}
		
	}
	
	
	
}
