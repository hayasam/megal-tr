package org.softlang.megal.plugins.util;

import java.util.ArrayList;
import java.util.List;

import org.softlang.megal.plugins.api.FragmentationPlugin.Fragment;


public abstract class Fragments {
	
		
		
	static public List<Fragment> decendants (Fragment fragment) {
		
		List<Fragment> result = new ArrayList<Fragment>();
		
		for (Fragment child : fragment.getParts()) {
			
			result.add(child);
			result.addAll(decendants(child));
			
		}
		
		return result;
		
	}
	
	static private String indent (int size) {
		
		String str = "-";
		
		for (int i=0; i < size; i++) {
			
			str += "-";
			
		}
		
		return str;
		
	}
	
	
	
	static public void print (Fragment fragment) {
		
		print(fragment,0);
		
	}
	
	static private void print (Fragment fragment, int indent) {
		
		System.out.println(indent(indent) + fragment);
		
		for (Fragment f : fragment.getParts()) {
			
			print(f, indent+1);
			
		}
		
	}
	
	
	
}
