package org.softlang.megal.plugins.util;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.api.Artifact;

import java.util.Optional;
import java.util.Set;

/**
 * 
 * Utility class for fragments.
 * This class also acts as a fragment KB.
 * 
 * @author maxmeffert
 *
 */
public abstract class Fragments {
	
	static public interface FactProvider {
		
		String getName();
		String getText();
		
	}
	
	static final public class Fragment {
		
		private String type;
		private Entity entity;
		private Artifact artifact;
		private FactProvider facts;
		private Fragment parent;
		private List<Fragment> parts = new ArrayList<Fragment>();
		
		private Fragment (String type, Entity entity, Artifact artifact, FactProvider facts) {
			this.type = type;
			this.entity = entity;
			this.artifact = artifact;
			this.facts = facts;
		}
		
		public String getType () {
			return type;
		}
		
		public Entity getEntity () {
			return entity;
		}
		
		public Artifact getArtifact() {
			return artifact;
		}
		
		public String getName () {
			return facts.getName();
		}
		
		public String getText () {
			return facts.getText();
		}
		
		public boolean hasParent () {
			return parent != null;
		}
		
		public Fragment getParent() {
			return parent;
		}
		
		public int getIndex () {
			if (hasParent()) {
				return getParent().parts.indexOf(this);
			}
			return 0;
		}
				
		public String getFullName () {
			
			String name = getName() + "$" + getIndex();
			
			if (hasParent())
				return getParent().getFullName() + "." + name;
 			
			return getEntity().getName() + "." + name;
		}
		
		public Collection<Fragment> getParts() {
			return parts;
		}
		
		public void addPart (Fragment part) {
			part.parent = this;
			parts.add(part);
		}
		
		public URI getURI () {
			
			try {
			
				String path = "/" + getType() + "/" + getName() + "/" + getIndex();
				
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
	
	static private Set<Fragment> fb = new HashSet<Fragment>();
	
	static public Fragment create (String type, Entity entity, Artifact artifact, FactProvider facts) {
		
		Fragment f = new Fragment(type, entity, artifact, facts);
		
		fb.add(f);
		
		return f;
		
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
