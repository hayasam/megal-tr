package org.softlang.megal.plugins.prelude;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.api.Artifact;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Iterables.any;
import static org.softlang.megal.plugins.util.Prelude.isElementOfLanguage;

import org.softlang.megal.plugins.api.FragmentationPlugin;
import org.softlang.megal.plugins.api.GuidedReasonerPlugin;
import org.softlang.megal.plugins.util.Fragments.Fragment;

public class FileFragmentationReasoner extends GuidedReasonerPlugin {
	
	private void deriveFragments (Iterable<Fragment> fs) {
		
		for (Fragment f : fs) {
			
			deriveFragments(f);
			
		}
		
	}
	
	private void deriveFragments (Fragment f) {
		
		entity(f.getFullName(), f.getType());
		binding(f.getFullName(), f.getURI());
		deriveFragments(f.getParts());
		
	}
	
	
	
	@Override
	protected void guidedDerive(Entity entity) throws Throwable {
		
		for (FragmentationPlugin plugin : filter(getParts(), FragmentationPlugin.class)) {
			
			if (!any(plugin.getRealization(), lang -> isElementOfLanguage(entity, lang))) {
			
				continue;
			
			}
			
			try {
				
				for(Artifact artifact : artifactsOf(entity)) {
					
					deriveFragments(plugin.getFragments(entity, artifact));
					
				}
				
			} 
			catch(Exception e) {
				
				error("Fragmentation of '" + entity + "' failed!");
				e.printStackTrace();
				
			}
			
		}
		
	}
	
	
	
	
	
}
