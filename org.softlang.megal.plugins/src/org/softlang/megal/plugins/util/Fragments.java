package org.softlang.megal.plugins.util;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.api.Artifact;

import java.util.Optional;

/**
 * 
 * Utility class for fragments.
 * This class also acts as a fragment KB.
 * 
 * @author maxmeffert
 *
 */
public abstract class Fragments {
	
	static private List<Fragment> fb = new ArrayList<Fragment>();
	
	static public abstract class Fragment {
		
		abstract public String getType();
		abstract public String getName();
		abstract public String getText();
		
		private Entity entity;
		private Artifact artifact;
		private Fragment parent;
		private List<Fragment> parts = new ArrayList<Fragment>();
		
		public Fragment (Entity entity, Artifact artifact) {
			this.entity = entity;
			this.artifact = artifact;
			fb.add(this);
		}
		
		final public Entity getEntity () {
			return entity;
		}
		
		final public Artifact getArtifact() {
			return artifact;
		}
		
		final public boolean hasParent () {
			return parent != null;
		}
		
		final public Fragment getParent() {
			return parent;
		}
				
		final public String getFullName () {
			
			if (hasParent())
				return getParent().getFullName() + "." + getName();
 			
			return getEntity().getName() + "." + getName();
		}
		
		final public List<Fragment> getParts() {
			return parts;
		}
		
		final public void addPart(Fragment part) {
			part.parent = this;
			parts.add(part);
		}
		
		final public URI getURI () {
			
			try {
			
				String path = "/" + getType() + "/" + getName();
				
				if (hasParent()) {
				
					return new URI(getParent().getURI() + path);
					
				}
			
				return new URI(getArtifact().getLocation() + "#" + path);
			
			} catch (URISyntaxException e) {
			
				throw new IllegalStateException();
				
			}
			
		}
		
		final public String toString () {
			return getURI().toString();
		}
		
	}
	
	static public boolean exists (URI uri) {
		return fb.stream()
				.anyMatch( f -> f.getURI().equals(uri) );
	}
	
	static public boolean hasFragment (Artifact artifact) {
		return fb.stream()
				.anyMatch( f -> f.getArtifact().equals(artifact) );
	}
	
	static public boolean hasFragment (Entity entity) {
		return entity.hasBinding() 
				&& exists((URI)entity.getBinding());
	}
	
	static public Optional<Fragment> fragmentOf (URI uri) {
		return fb.stream()
				.filter( f -> f.getURI().equals(uri) )
				.findFirst();
	}
	
	static public Optional<Fragment> fragmentOf (Artifact artifact) {
		return fb.stream()
				.filter( f -> f.getArtifact().equals(artifact) )
				.findFirst();
	}
	
	static public Optional<Fragment> fragmentOf (Entity entity) {
		
		if (entity.getBinding() instanceof URI)
			return fragmentOf((URI)entity.getBinding());
		
		return fb.stream()
				.filter( f -> f.getURI().toString().equals(entity.getBinding()))
				.findFirst();
		
	}
	
	static public List<Fragment> fragmentsOf (Artifact artifact) {
		return fb.stream()
				.filter( f -> f.getArtifact().equals(artifact) )
				.collect(Collectors.toList());
	}
	
	
	
}
