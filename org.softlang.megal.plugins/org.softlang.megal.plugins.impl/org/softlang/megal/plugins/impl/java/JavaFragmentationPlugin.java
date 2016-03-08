package org.softlang.megal.plugins.impl.java;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.Trees;
import org.softlang.megal.plugins.api.FragmentationPlugin;
import org.softlang.megal.plugins.impl.java.antlr.JavaLexer;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser;
import org.softlang.megal.plugins.util.Fragments;
import org.softlang.megal.plugins.util.fragmentation.Fragment;
import org.softlang.megal.plugins.util.fragmentation.FragmentationException;

public class JavaFragmentationPlugin extends FragmentationPlugin {
	
	
	private void fragments (ParseTree context, Fragment parent) {
		
		if (context instanceof JavaParser.ClassDeclarationContext) {
			
			Fragment javaClass = Fragments.newFragment();
			javaClass.setType("JavaClass");
			javaClass.setName(((JavaParser.ClassDeclarationContext) context).Identifier().getText());
			
			System.out.println(javaClass);
			
		}
		else if (context instanceof JavaParser.FieldDeclarationContext) {
			
			
			
			for (JavaParser.VariableDeclaratorContext field : ((JavaParser.FieldDeclarationContext)context).variableDeclarators().variableDeclarator()) {
			
				Fragment javaField = Fragments.newFragment();
				javaField.setType("JavaField");
				javaField.setName(field.getText());
			
				System.out.println(javaField);
				
			}
			
			
		}
		else if (context instanceof JavaParser.MethodDeclarationContext) {
			
			Fragment javaMethod = Fragments.newFragment();
			javaMethod.setType("JavaMethod");
			javaMethod.setName(((JavaParser.MethodDeclarationContext) context).Identifier().getText());
			
			System.out.println(javaMethod);
			
		}
		
		for (int i=0; i < context.getChildCount(); i++) {
			
			fragments(context.getChild(i), parent);
			
		}
		
	}
	
	@Override
	public List<Fragment> getFragments(Reader r) throws FragmentationException {
		
		try {
			
			JavaParser parser = new JavaParser(new CommonTokenStream(new JavaLexer(new ANTLRInputStream(r))));
			
			parser.removeErrorListeners();
			
			fragments(parser.compilationUnit(), null);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return Fragments.create();
		
	}

}
