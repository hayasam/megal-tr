package plugins;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.ArrayList;

import org.softlang.megal.mi2.api.Artifact;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ParseException;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.body.*;

public class JavaFragmentizer extends Fragmentizer {

	@Override
	public List<Fragment> getFragments (Artifact artifact) throws IOException {
		
		List<Fragment> result = new ArrayList<Fragment>();
		
		Reader s = artifact.getChars().openStream();
		
		CompilationUnit cunit;
		
		try {
		
			cunit = JavaParser.parse(s, false);
			
			for (Node node : cunit.getChildrenNodes()) {
				
				if (node instanceof ClassOrInterfaceDeclaration) {
					
					ClassOrInterfaceDeclaration c = (ClassOrInterfaceDeclaration) node;
					
					if (!c.isInterface()) {
						
						Fragment f = new Fragment();
						f.setName(c.getName());
						f.setType("JavaClass");
						result.add(f);
						
					}
					
					for (Node child : node.getChildrenNodes()) {
						
						if (child instanceof FieldDeclaration) {
							
							FieldDeclaration m = (FieldDeclaration) child;
							
							for (VariableDeclarator v : m.getVariables()) {
								
								Fragment f = new Fragment();
								f.setName(v.toString());
								f.setType("JavaAttribute");
								f.setPartOf(c.getName());
								result.add(f);
								
							}
							
							
							
						}
						
						if (child instanceof MethodDeclaration) {
							
							MethodDeclaration m = (MethodDeclaration) child;
							
							Fragment f = new Fragment();
							f.setName(m.getName());
							f.setType("JavaMethod");
							f.setPartOf(c.getName());
							result.add(f);
							
						}
						
					}
					
				}
				
				
				
			}
				
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		

	}

}
