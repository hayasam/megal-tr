package org.softlang.megal.plugins.impl.java;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Stack;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.softlang.megal.plugins.api.FragmentationPlugin;
import org.softlang.megal.plugins.impl.java.antlr.JavaBaseListener;
import org.softlang.megal.plugins.impl.java.antlr.JavaLexer;
import org.softlang.megal.plugins.impl.java.antlr.JavaListener;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser.ClassDeclarationContext;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser.MethodDeclarationContext;
import org.softlang.megal.plugins.util.Fragments;
import org.softlang.megal.plugins.util.antlr.FragmentationListener;
import org.softlang.megal.plugins.util.antlr.FragmentationRule;
import org.softlang.megal.plugins.util.antlr.old.FragmentationException;

public class JavaFragmentationPlugin extends FragmentationPlugin {
	
	/*
	static private class JavaFragmentListener extends JavaBaseListener {
		
		private Stack<FragmentInterface> stack = new Stack<FragmentInterface>();
		
		public List<FragmentInterface> getFragments () {
			return stack;
		}
		
		private String className (JavaParser.ClassDeclarationContext context) {
			
			return context.Identifier().getText();
			
		}
		
		private String methodName (JavaParser.MethodDeclarationContext context) {
			
			return context.Identifier().getText();
			
		}
				
		public void exitClassDeclaration(JavaParser.ClassDeclarationContext context) {
			
			FragmentInterface f = new FragmentInterface();
			f.setType("JavaClass");
			f.setName(className(context));
			
			while (!stack.isEmpty())
				f.addChild(stack.pop());
			
			stack.push(f);
			
		}
		
		public void exitMethodDeclaration(JavaParser.MethodDeclarationContext context) {
			
			FragmentInterface f = new FragmentInterface();
			f.setType("JavaClass");
			f.setName(methodName(context));
			
			stack.push(f);
			
		}
		
	}
	*/
	
	static private FragmentationListener listener = new FragmentationListener();
	static {
		listener.addFragmentationRule(new FragmentationRule<JavaParser.ClassDeclarationContext>(){

			@Override
			public boolean hasParts() {
				return true;
			}

			@Override
			public boolean test(ParserRuleContext context) {
				return context instanceof JavaParser.ClassDeclarationContext;
			}

			@Override
			public org.softlang.megal.plugins.util.antlr.Fragment<ClassDeclarationContext> create(
					ClassDeclarationContext context) {
				return new JavaClassFragment(context);
			}
			
		});
		listener.addFragmentationRule(new FragmentationRule<JavaParser.MethodDeclarationContext>(){

			@Override
			public boolean hasParts() {
				return false;
			}

			@Override
			public boolean test(ParserRuleContext context) {
				return context instanceof JavaParser.MethodDeclarationContext;
			}

			@Override
			public org.softlang.megal.plugins.util.antlr.Fragment<MethodDeclarationContext> create(
					MethodDeclarationContext context) {
				return new JavaMethodFragment(context);
			}
			
		});
	}
	
	@Override
	public List<Fragment> getFragments(Reader r) throws FragmentationException {
		
		try {
			
			JavaParser parser = new JavaParser(new CommonTokenStream(new JavaLexer(new ANTLRInputStream(r))));
			
			parser.removeErrorListeners();
//			JavaFragmentListener l = new JavaFragmentListener();
			
			ParseTreeWalker walker = new ParseTreeWalker();
			walker.walk(listener, parser.compilationUnit());
			
			//System.out.println(l.getFragments());
			//Fragment f = parser.compilationUnit().accept(new JavaFragmentationVisitor());
			//Fragments.print(f);
			//System.out.println(Fragments.decendants(f));
			
//			for (Fragment f:listener.getFragments())
//				Fragments.print(f);
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
		return listener.getFragments();
		
	}

}
