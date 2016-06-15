package org.softlang.megal.plugins.prelude;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.api.Artifact;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Iterables.any;
import static org.softlang.megal.plugins.util.Prelude.isElementOfLanguage;

import java.net.URI;

import org.softlang.megal.plugins.api.FragmentationPlugin;
import org.softlang.megal.plugins.api.GuidedReasonerPlugin;
import org.softlang.megal.plugins.util.fragmentation.Fragment;
import org.softlang.megal.plugins.util.fragmentation.FragmentVisitor;

public class FileFragmentationReasoner extends GuidedReasonerPlugin implements FragmentVisitor {
	
	@Override
	protected void guidedDerive(Entity entity) throws Throwable {
		System.out.println("asdf");
		for (FragmentationPlugin plugin : filter(getParts(), FragmentationPlugin.class)) {
			
			if (!any(plugin.getRealization(), lang -> isElementOfLanguage(entity, lang))) {
			
				continue;
			
			}
			
			try {
				
				Artifact artifact = artifactOf(entity);
				URI location = artifact.getLocation();
				
				plugin
					.getFragments(artifact.getChars().openStream())
					.forEach(f -> f.accept(this));
				
			} 
			catch(Exception e) {
				
				e.printStackTrace();
				
			}
			
		}
		
	}

	@Override
	public void visit(Fragment fragment) {
		
		entity(fragment.getName(), fragment.getType());
		
	}
	
}
