package org.softlang.megal.plugins.prelude;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.Ref;
import org.softlang.megal.mi2.api.Artifact;


import static com.google.common.collect.Maps.immutableEntry;
import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Iterables.any;
import static org.softlang.megal.plugins.util.Prelude.isElementOfLanguage;

import org.softlang.megal.plugins.api.FragmentizerPlugin;
import org.softlang.megal.plugins.api.GuidedReasonerPlugin;
import org.softlang.megal.plugins.api.fragmentation.Fragments.Fragment;

/**
 * 
 * Reasoner plugin for file fragmentation
 * 
 * @author maxmeffert
 *
 */
public class FileFragmentationReasoner extends GuidedReasonerPlugin {
	
	private void entityAnnotation(Entity e, String name, String value) {
		
		KB kb = e.getKB();
		Ref ref = kb.getRawEntities().get(e.getName());
		
		kb.getRawEntityAnnotations().put(immutableEntry(e.getName(), ref), immutableEntry(name, value));
		
	}
	
	/**
	 * Inserts a bag of fragments into the KB
	 * @param fs
	 */
	private void deriveFragments (Iterable<Fragment> fs) {
		
		for (Fragment f : fs) {
			
			deriveFragments(f);
			
		}
		
	}
	
	/**
	 * Inserts a fragment into the KB
	 * @param f
	 */
	private void deriveFragments (Fragment f) {
		
		// Create an entity for the fragment with its qualified name
		Entity e = entity(f.getQualifiedName(), f.getType());
		entityAnnotation(e, "content", f.getText());
		
		// Bind the fragment entity to the fragment's URI
		binding(f.getQualifiedName(), f.getURI());
		
		// Insert the parts of the fragments into the KB
		deriveFragments(f.getParts());
		
	}
	
	/**
	 * Derives fragments of an entity
	 */
	@Override
	protected void guidedDerive(Entity entity) throws Throwable {
		
		// For all partial fragmentation plugins
		for (FragmentizerPlugin plugin : filter(getParts(), FragmentizerPlugin.class)) {
			
			// If the partial fragmentation plugin does NOT realize the language of the entity
			if (!any(plugin.getRealization(), lang -> isElementOfLanguage(entity, lang))) {
			
				// Skip the plugin
				continue;
			
			}
			
			try {
				
				if (entity.hasBinding()) {
					
					// For all artifacts bound to the entity
					for(Artifact artifact : artifactsOf(entity)) {
						
						// Derive the fragments of the entity
						deriveFragments(plugin.getFragments(entity, artifact));
						
					}
					
				}
				
			} 
			catch(Exception e) {
				
				error("Fragmentation of '" + entity + "' failed!");
				e.printStackTrace();
				
			}
			
		}
		
	}
	
	
	
	
	
}
