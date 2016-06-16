package org.softlang.megal.plugins.api;

import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.softlang.megal.mi2.api.AbstractPlugin;
import org.softlang.megal.mi2.api.Artifact;
import org.softlang.megal.plugins.util.antlr.old.FragmentationException;

public abstract class FragmentationPlugin extends AbstractPlugin {

	static public abstract class Fragment {
		
		abstract public String getType();
		abstract public String getName();
		
		private Artifact artifact;
		private Fragment parent;
		private List<Fragment> parts = new ArrayList<Fragment>();
		
		public Fragment (Artifact artifact) {
			this.artifact = artifact;
		}
		
		final public Artifact getArtifact() {
			return artifact;
		}
		
		final public void setArtifact(Artifact artifact) {
			this.artifact = artifact;
		}
		
		final public boolean hasParent () {
			return parent != null;
		}
		
		final public Fragment getParent() {
			return parent;
		}
		
		final public void setParent(Fragment parent) {
			this.parent = parent;
		}
		
		final public String getFullName () {
			
			if (hasParent())
				return getParent().getFullName() + "." + getName();
 			
			return getName();
		}
		
		final public List<Fragment> getParts() {
			return parts;
		}
		
		final public void addPart(Fragment part) {
			part.setParent(this);
			parts.add(part);
		}
		
		final public String getPath () {
			
			String path = "/" + getType() + "/" + getName();
			
			if (hasParent())
				return getParent().getPath() + path;
			
			return getArtifact().getLocation() + "#" + path;
			
		}
		
		final public String toString () {
			return getPath();
		}
		
	}
	
	abstract public List<Fragment> getFragments (Artifact artifact) throws FragmentationException;
	
}
