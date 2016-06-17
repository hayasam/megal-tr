package org.softlang.megal.plugins;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.softlang.megal.language.*;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.EntityType;
import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.MegamodelKB;
import org.softlang.megal.mi2.Relationship;
import org.softlang.megal.mi2.RelationshipType;
import org.softlang.megal.mi2.api.ModelExecutor;
import org.softlang.megal.mi2.api.resolution.LocalResolution;
import org.softlang.megal.plugins.util.Fragments;

@SuppressWarnings("unused")
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
	
	private static void printTypes (KB kb, PrintStream out) {
		
		out.println();
		
		for (EntityType et :kb.getEntityTypes()) {
			
			out.println(et);
			
		}
		
		out.println();
		
		for (RelationshipType rt : kb.getRelationshipTypes()) {
			
			out.println(rt);	
			
		}
		
	}
	
	private static void printInstances (KB kb, PrintStream out) {
		
		out.println();
		
		List<Entity> es = kb.getEntities().stream()
//				.filter( e -> !e.getType().getName().equals("Plugin")  )
//				.sorted( (a,b) -> a.getName().compareToIgnoreCase(b.getName()) )
				.collect(Collectors.toList());
		
		for (Entity e : es) {
			
			out.println(e);
			
			for (Relationship rel : kb.getRelationships().stream().filter( r -> r.getLeft().equals(e)).collect(Collectors.toList())) {
				
				out.println(rel);
				
			}
			
			if (e.getBinding() != null) {
				out.println(e.getName() + " = " + e.getBinding());
			}
			
			
//			if (Fragments.fragmentOf(e).isPresent()) {
//				out.println(e);
//				out.println(Fragments.fragmentOf(e).get().getText());
//			}
			
			out.println();
			
		}
		
//		List<Relationship> rels = kb.getRelationships().stream()
//				.filter( r -> !r.getLeft().getType().getName().equals("Plugin")  )
//				.sorted( (a,b) -> a.getLeft().getName().compareToIgnoreCase(b.getLeft().getName()) )
//				.collect(Collectors.toList());
//		
//		for (Relationship rel : rels) {
//			
//			out.println(rel);
//			
//		}
		
	}
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Start.");
		
		KB kb = MegamodelKB.loadAll(Megals.load(new File("megal/test.megal"), new File("megal/Prelude.megal")));
		
		System.out.println("KB loaded.");
		
		ModelExecutor ex = new ModelExecutor();
		kb = ex.evaluate(getResolution(), kb).getOutput();
		
		printInstances(kb, System.out);
		
		PrintStream output = new PrintStream(new FileOutputStream("output/out.megal"));
		printTypes(kb,output);
		printInstances(kb,output);
		output.close();
		
		
	}

}
