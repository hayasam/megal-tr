package org.softlang.megal.plugins.prelude;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.api.Artifact;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Iterables.any;
import static org.softlang.megal.plugins.util.Prelude.isElementOfLanguage;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;

import org.softlang.megal.plugins.api.FragmentationPlugin;
import org.softlang.megal.plugins.api.FragmentationPlugin.Fragment;
import org.softlang.megal.plugins.api.GuidedReasonerPlugin;

public class FileFragmentationReasoner extends GuidedReasonerPlugin {
	
	@Override
	protected void guidedDerive(Entity entity) throws Throwable {
		
		for (FragmentationPlugin plugin : filter(getParts(), FragmentationPlugin.class)) {
			
			if (!any(plugin.getRealization(), lang -> isElementOfLanguage(entity, lang))) {
			
				continue;
			
			}
			
			try {
				
				for(Artifact artifact:artifactsOf(entity)) {
					
					URI location = artifact.getLocation();
					
					for(Fragment f : plugin.getFragments(artifact)) {
						
						derive(f);
						
					}
						
					
				}
				
			} 
			catch(Exception e) {
				
				e.printStackTrace();
				
			}
			
		}
		
	}
	
	private void derive (Fragment f) {
		
		entity(f.getFullName(), f.getType());
		binding(f.getFullName(), f.getPath());
		
		for (Fragment part : f.getParts()) {
			
			derive(part);
			
		}
		
	}
	
	
	
}
