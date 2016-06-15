package org.softlang.megal.plugins;

import java.io.File;
import java.io.IOException;

import org.softlang.megal.language.*;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.KB;
import org.softlang.megal.mi2.MegamodelKB;
import org.softlang.megal.mi2.Relationship;
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
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Start.");
		
		KB kb = MegamodelKB.loadAll(Megals.load(new File("megal/test.megal"), new File("megal/Prelude.megal")));
		ModelExecutor ex = new ModelExecutor();
		
		System.out.println("KB loaded.");
		
		kb = ex.evaluate(getResolution(), kb).getOutput();
		
		for (Entity e : kb.getEntities()) {
			
			System.out.println(e);
			
		}
		
		for (Relationship rel : kb.getRelationships()) {
			
			System.out.println(rel);
			
		}
		
		
	}

}
