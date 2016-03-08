package org.softlang.megal.plugins.prelude;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.api.AbstractPlugin;
import org.softlang.megal.mi2.api.Artifact;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Iterables.any;
import static org.softlang.megal.plugins.util.Prelude.isElementOfLanguage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.softlang.megal.plugins.GuidedReasonerPlugin;

public class FileFragmentReasoner extends GuidedReasonerPlugin {
	
	static public class FragmentizationException extends Exception {
		
	}
	
	static public class Fragment {
		
		static final public Fragment EMPTY = new Fragment();
		
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
		
		public String toString () {
			
			return "Fragment("+name+","+type+")";
			
		}
		
	}
	
	static public abstract class Fragmentizer extends AbstractPlugin {
		
		public abstract List<Fragment> getFragments (Artifact artifact) throws IOException;
		
	}
	
	private void visitFragments (List<Fragment> fragments) {
		
		for (Fragment fragment : fragments) {
			
			visitFragment(fragment);
			
		}
		
	}
	
	private void visitFragment (Fragment fragment) {
		
		entity(fragment.getName(), fragment.getType());
		
	}
	
	@Override
	protected void guidedDerive(Entity entity) throws Throwable {
		
		for (Fragmentizer fragmentizer : filter(getParts(), Fragmentizer.class)) {
			
			if (!any(fragmentizer.getRealization(), lang -> isElementOfLanguage(entity, lang))) {
			
				continue;
			
			}
			
			try {
			
				List<Fragment> fragments = fragmentizer.getFragments(artifactOf(entity));
				visitFragments(fragments);
				
			} 
			catch(Exception e) {
				
				e.printStackTrace();
				
			}
			
		}
		
	}
	
}
