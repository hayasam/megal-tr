package org.softlang.megal.plugins.impl.java;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.softlang.megal.plugins.api.FragmentationPlugin;
import org.softlang.megal.plugins.impl.java.JavaFragments.JavaClassFragment;
import org.softlang.megal.plugins.impl.java.antlr.JavaBaseListener;
import org.softlang.megal.plugins.impl.java.antlr.JavaLexer;
import org.softlang.megal.plugins.impl.java.antlr.JavaListener;
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
			JavaBaseListener l = new JavaBaseListener(){
				
				private Stack<JavaFragments.Fragment> stack = new Stack<JavaFragments.Fragment>();
				
				private String className (JavaParser.ClassDeclarationContext context) {
					
					return context.Identifier().getText();
					
				}
				
				private String methodName (JavaParser.MethodDeclarationContext context) {
					
					return context.Identifier().getText();
					
				}
				
				public void enterClassDeclaration(JavaParser.ClassDeclarationContext context) {
					
					JavaFragments.Fragment javaClass = new JavaFragments.JavaClassFragment(context);
					//javaClass.setType("JavaClass");
					//javaClass.setName(className(context));
					
					stack.push(javaClass);
					
					
				}
				
				public void exitClassDeclaration(JavaParser.ClassDeclarationContext context) {
					
					JavaFragments.Fragment javaClass = new JavaFragments.JavaClassFragment(context);
					
					
					
//					System.out.println("exit: " + ((JavaParser.ClassDeclarationContext) context).Identifier().getText() );
					
				}
				
				public void enterMethodDeclaration(JavaParser.MethodDeclarationContext context) {
					
//					Fragment javaMethod = Fragments.newFragment();
//					javaMethod.setType("JavaMethod");
//					javaMethod.setName(((JavaParser.MethodDeclarationContext) context).Identifier().getText());
//					
//					System.out.println(javaMethod);
					
				}
				
			};
			
			ParseTreeWalker walker = new ParseTreeWalker();
			walker.walk(l, parser.compilationUnit());
			
			//Fragment f = parser.compilationUnit().accept(new JavaFragmentationVisitor());
			
			
			
			//Fragments.print(f);
			//System.out.println(Fragments.decendants(f));
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Fragments.create();
		
	}

}
