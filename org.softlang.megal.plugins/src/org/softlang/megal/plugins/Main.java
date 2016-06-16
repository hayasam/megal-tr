package org.softlang.megal.plugins;

import java.io.File;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.softlang.megal.language.*;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.EntityType;
import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.KBs;
import org.softlang.megal.mi2.MegamodelKB;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.RelationshipType;
import org.softlang.megal.mi2.api.ModelExecutor;
import org.softlang.megal.mi2.api.Result;
import org.softlang.megal.mi2.api.resolution.LocalResolution;

public class Main {
	
	private static LocalResolution getResolution () throws IOException  {
		
		File root = (new File("..")).getCanonicalFile();
		
		return new LocalResolution() {
			
			@Override
			protected File getRoot() {
				return root;
			}
			
		};
		
	}
	
	private static void printTypes (KB kb) {
		
		System.out.println();
		
		for (EntityType et :kb.getEntityTypes().stream().sorted( (a,b) -> a.getName().compareToIgnoreCase(b.getName()) ).collect(Collectors.toList())) {
			
			System.out.println(et);
			
		}
		
		System.out.println();
		
		for (RelationshipType rt : kb.getRelationshipTypes().stream().sorted( (a,b) -> a.getName().compareToIgnoreCase(b.getName()) ).collect(Collectors.toList())) {
			
			System.out.println(rt);	
			
		}
		
	}
	
	private static void printInstances (KB kb) {
		
		System.out.println();
		
		List<Entity> es = kb.getEntities().stream()
				.filter( e -> !e.getType().getName().equals("Plugin")  )
				//.sorted( (a,b) -> a.getName().compareToIgnoreCase(b.getName()) )
				.collect(Collectors.toList());
		
		for (Entity e : es) {
			
			System.out.println(e);
			
			for (Relationship rel : kb.getRelationships().stream().filter( r -> r.getLeft().equals(e)).collect(Collectors.toList())) {
				
				System.out.println(rel);
				
			}
			
			if (e.getBinding() != null) {
				System.out.println(e.getName() + " = " + e.getBinding());
			}
			
			System.out.println();
			
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Start.");
		
		KB kb = MegamodelKB.loadAll(Megals.load(new File("megal/test.megal"), new File("megal/Prelude.megal")));
		ModelExecutor ex = new ModelExecutor();
		
		System.out.println("KB loaded.");
		
		kb = ex.evaluate(getResolution(), kb).getOutput();
		
		printInstances(kb);
			
		
	}

}
