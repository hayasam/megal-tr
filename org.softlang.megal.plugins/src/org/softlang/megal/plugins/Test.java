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

public class Test {

	public static void main(String[] args) throws IOException {
		System.out.println("start");
		
		
		//MegalReasoning.prepareLocalResult(Megals.load(new File("megal/test.megal"), new File("megal/Prelude.megal")));
		
		File root = (new File("..")).getCanonicalFile();
		
		ModelExecutor ex = new ModelExecutor();
		Result r = ex.evaluate(new LocalResolution() {
			@Override
			protected File getRoot() {
				return root;
			}
		}, MegamodelKB.loadAll(Megals.load(new File("megal/test.megal"), new File("megal/Prelude.megal"))));
		

		KB kb = r.getOutput();
		
		for (Entity e : kb.getEntities()) {
			
			System.out.println(e);
			
		}
		
		for (Relationship rel : kb.getRelationships()) {
			
			System.out.println(rel);
			
		}
		
		
	}

}
