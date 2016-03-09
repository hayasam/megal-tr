package org.softlang.megal.plugins.impl.java;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.softlang.megal.plugins.api.FragmentationPlugin;
import org.softlang.megal.plugins.impl.java.antlr.JavaLexer;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser;
import org.softlang.megal.plugins.util.Fragments;
import org.softlang.megal.plugins.util.fragmentation.ANTLRFragmentationVisitor;
import org.softlang.megal.plugins.util.fragmentation.Fragment;
import org.softlang.megal.plugins.util.fragmentation.FragmentationException;

public class JavaFragmentationPlugin extends FragmentationPlugin {
	
	static private class JavaFragmentationVisitor extends ANTLRFragmentationVisitor {

		@Override
		public Fragment createFragment(RuleContext context) {
			
			if (context instanceof JavaParser.ClassDeclarationContext) {
				
				Fragment javaClass = Fragments.newFragment();
				javaClass.setType("JavaClass");
				javaClass.setName(((JavaParser.ClassDeclarationContext) context).Identifier().getText());
				
				return javaClass;
				
			}
			else if (context instanceof JavaParser.MethodDeclarationContext) {
				
				Fragment javaMethod = Fragments.newFragment();
				javaMethod.setType("JavaMethod");
				javaMethod.setName(((JavaParser.MethodDeclarationContext) context).Identifier().getText());
				
				return javaMethod;
				
			}
			else if (context instanceof JavaParser.VariableDeclaratorContext
					&& context.getParent().getParent() instanceof JavaParser.FieldDeclarationContext) {
			
				Fragment javaField = Fragments.newFragment();
				javaField.setType("JavaField");
				javaField.setName(context.getText());
				
				return javaField;
				
			}
			
			return new Fragment();
			
		}
		
	}
	
	@Override
	public List<Fragment> getFragments(Reader r) throws FragmentationException {
		
		try {
			
			JavaParser parser = new JavaParser(new CommonTokenStream(new JavaLexer(new ANTLRInputStream(r))));
			
			parser.removeErrorListeners();
			
			Fragment f = parser.compilationUnit().accept(new JavaFragmentationVisitor());
			
			Fragments.print(f);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Fragments.create();
		
	}

}
