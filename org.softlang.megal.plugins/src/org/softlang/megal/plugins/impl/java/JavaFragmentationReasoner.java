package org.softlang.megal.plugins.impl.java;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTree;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.api.Artifact;
import org.softlang.megal.plugins.api.antlr.ANTLRContextFactProvider;
import org.softlang.megal.plugins.api.antlr.ANTLRErrorCollectorListener;
import org.softlang.megal.plugins.api.antlr.ANTLRFragmentizer;
import org.softlang.megal.plugins.api.antlr.ANTLRFragmentationListener.FragmentationRule;
import org.softlang.megal.plugins.api.fragmentation.Fragments;
import org.softlang.megal.plugins.api.fragmentation.Fragments.Fragment;
import org.softlang.megal.plugins.impl.java.antlr.JavaLexer;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser.ClassDeclarationContext;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser.MethodDeclarationContext;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser.TypeDeclarationContext;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser.VariableDeclaratorContext;

/**
 * Disassembles a Java artifact into its fragments.
 * 
 * @author maxmeffert
 *
 */
public class JavaFragmentationReasoner extends ANTLRFragmentizer {
	
	/*
	 * TODO
	 * 
	 * Adapt rules and fact providers for a better reflection of the Java grammar
	 * 
	 */
	
	static private class ClassDeclarationContextFactProvider extends ANTLRContextFactProvider<JavaParser.ClassDeclarationContext> {

		public ClassDeclarationContextFactProvider(ClassDeclarationContext context) {
			super(context);
		}

		@Override
		public String getName() {
			return getContext().Identifier().getText();
		}
		
	}
	
	static private class MethodDeclarationContextFactProvider extends ANTLRContextFactProvider<JavaParser.MethodDeclarationContext> {

		public MethodDeclarationContextFactProvider(MethodDeclarationContext context) {
			super(context);
		}

		@Override
		public String getName() {
			return getContext().Identifier().getText();
		}
		
	}
	
	static private class FieldDeclarationContextFactProvider extends ANTLRContextFactProvider<JavaParser.VariableDeclaratorContext> {

		public FieldDeclarationContextFactProvider(VariableDeclaratorContext context) {
			super(context);
		}

		@Override
		public String getName() {
			return getContext().getText();
		}
		
	}
	
	static private class TypeDeclarationContextFactProvider extends ANTLRContextFactProvider<JavaParser.TypeDeclarationContext> {

		public TypeDeclarationContextFactProvider(TypeDeclarationContext context) {
			super(context);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String getName() {
			if (getContext().classDeclaration() == null) {
				throw new IllegalStateException("Type declaration does not provide a class declaration!");
			}
			return getContext().classDeclaration().Identifier().getText();
 		}
		
	}
	
	/**
	 * Fragmentation rule for inner classes
	 * 
	 * @author maxmeffert
	 *
	 */
	static private class InnerClassRule implements FragmentationRule {

		/**
		 * Tests whether the current context is a ClassDeclarationContext and its parent is a MemberDeclarationContext
		 */
		@Override
		public boolean test(ParserRuleContext context) {
			return context instanceof JavaParser.ClassDeclarationContext
					&& context.getParent() instanceof JavaParser.MemberDeclarationContext;
		}

		/**
		 * Checks whether the context is a leaf, classes are never leafs.
		 */
		@Override
		public boolean isLeaf(ParserRuleContext context) {
			return false;
		}

		/**
		 * Creates a new JavaInnerClass fragment
		 */
		@Override
		public Fragment create(Entity entity, Artifact artifact, ParserRuleContext context) {
			
			JavaParser.ClassDeclarationContext classContext = (JavaParser.ClassDeclarationContext)context;
			
			// Create a new JavaInnerClass fragment
			return Fragments.create("JavaInnerClass", entity, artifact, new ClassDeclarationContextFactProvider(classContext));
			
		}
		
	};
	
	/**
	 * Fragmentation rule for classes
	 * 
	 * @author maxmeffert
	 *
	 */
	static private class ClassRule implements FragmentationRule {

		/**
		 * Tests whether the current context is a ClassDeclarationContext and its parent is a TypeDeclarationContext
		 */
		@Override
		public boolean test(ParserRuleContext context) {
			return context instanceof JavaParser.TypeDeclarationContext
					&& ((JavaParser.TypeDeclarationContext)context).classDeclaration() != null;
		}

		/**
		 * Checks whether the context is a leaf, classes are never leafs.
		 */
		@Override
		public boolean isLeaf(ParserRuleContext context) {
			return false;
		}

		/**
		 * Creates a new JavaClass fragment
		 */
		@Override
		public Fragment create(Entity entity, Artifact artifact, ParserRuleContext context) {
			
			JavaParser.ClassDeclarationContext classContext = ((JavaParser.TypeDeclarationContext)context).classDeclaration();
			
			// Create a new JavaClass fragment
			return Fragments.create("JavaClass", entity, artifact, new TypeDeclarationContextFactProvider((TypeDeclarationContext) context));
			
		}
		
	};
	
	/**
	 * Fragmentation rule for methods
	 * 
	 * @author maxmeffert
	 *
	 */
	static private class MethodRule implements FragmentationRule {
		
		/**
		 * Tests whether the current context is a MethodDeclarationContext
		 */
		@Override
		public boolean test(ParserRuleContext context) {
			return context instanceof JavaParser.MethodDeclarationContext;
		}

		/**
		 * Checks whether the context is a leaf, methods are always leafs.
		 */
		@Override
		public boolean isLeaf(ParserRuleContext context) {
			return true;
		}

		/**
		 * Creates a new JavaMethod fragment
		 */
		@Override
		public Fragment create(Entity entity, Artifact artifact, ParserRuleContext context) {
			
			JavaParser.MethodDeclarationContext methodContext = (JavaParser.MethodDeclarationContext)context;
			
			// Create a new JavaMethod fragment
			return Fragments.create("JavaMethod", entity, artifact, new MethodDeclarationContextFactProvider(methodContext));
			
		}
		
	};
	
	/**
	 * Fragmentation rule for fields
	 * 
	 * @author maxmeffert
	 *
	 */
	static private class FieldRule implements FragmentationRule {
		
		/**
		 * Tests whether the current context is a VariableDeclaratorContext and its grandparent is a FieldDeclarationContext
		 */
		@Override
		public boolean test(ParserRuleContext context) {
			return context instanceof JavaParser.VariableDeclaratorContext
					&& context.getParent().getParent() instanceof JavaParser.FieldDeclarationContext;
		}

		/**
		 * Checks whether the context is a leaf, fields are always leafs.
		 */
		@Override
		public boolean isLeaf(ParserRuleContext context) {
			return true;
		}

		/**
		 * Creates a new JavaField fragment
		 */
		@Override
		public Fragment create(Entity entity, Artifact artifact, ParserRuleContext context) {
			
			JavaParser.VariableDeclaratorContext fieldContext = (JavaParser.VariableDeclaratorContext)context;
			
			// Create a new JavaField fragment
			return Fragments.create("JavaField", entity, artifact, new FieldDeclarationContextFactProvider(fieldContext));
		}
		
	};
	
	/**
	 * Gets the collection of Java fragmentation rules
	 */
	@Override
	public Collection<FragmentationRule> getRules() {
		
		Collection<FragmentationRule> rules = new ArrayList<FragmentationRule>();
		rules.add(new InnerClassRule());
		rules.add(new ClassRule());
		rules.add(new MethodRule());
		rules.add(new FieldRule());
		
		return rules;
		
	}
	
	/**
	 * Gets the parse tree for Java input char stream.
	 */
	@Override
	public ParseTree getParseTree(CharStream input) {
		
		JavaParser parser = new JavaParser(new CommonTokenStream(new JavaLexer(input)));
		parser.removeErrorListeners();
		
		return parser.compilationUnit();
		
	}

}
