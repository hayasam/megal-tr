package org.softlang.megal.plugins.impl.java;

import java.util.ArrayList;
import java.util.Collection;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.api.Artifact;
import org.softlang.megal.plugins.impl.java.antlr.JavaLexer;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser;
import org.softlang.megal.plugins.util.Fragments;
import org.softlang.megal.plugins.util.Fragments.Fragment;
import org.softlang.megal.plugins.util.antlr.FragmentationListenerRule;
import org.softlang.megal.plugins.util.antlr.ANTLRFragmentationReasoner;
import org.softlang.megal.plugins.util.antlr.ANTLRUtils;

/**
 * Disassembles a Java artifact into its fragments.
 * 
 * @author maxmeffert
 *
 */
public class JavaFragmentationReasoner extends ANTLRFragmentationReasoner {
	
	/**
	 * Fragmentation rule for inner classes
	 * 
	 * @author maxmeffert
	 *
	 */
	static private class InnerClassRule extends FragmentationListenerRule {

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
			return Fragments.create("JavaInnerClass", entity, artifact, new Fragments.FactProvider() {
				
				// Get the original text from the parser context object
				@Override
				public String getText() {
					return ANTLRUtils.originalText(classContext);
				}
				
				// Get the name of the class declaration
				@Override
				public String getName() {
					return classContext.Identifier().getText();
				}
				
			});
			
		}
		
	};
	
	/**
	 * Fragmentation rule for classes
	 * 
	 * @author maxmeffert
	 *
	 */
	static private class ClassRule extends FragmentationListenerRule {

		/**
		 * Tests whether the current context is a ClassDeclarationContext and its parent is a TypeDeclarationContext
		 */
		@Override
		public boolean test(ParserRuleContext context) {
			return context instanceof JavaParser.ClassDeclarationContext
					&& context.getParent() instanceof JavaParser.TypeDeclarationContext;
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
			
			JavaParser.ClassDeclarationContext classContext = (JavaParser.ClassDeclarationContext)context;
			
			// Create a new JavaClass fragment
			return Fragments.create("JavaClass", entity, artifact, new Fragments.FactProvider() {
				
				// Get the original text from the parser context object
				@Override
				public String getText() {
					return ANTLRUtils.originalText(classContext);
				}
				
				// Get the name of the class declaration
				@Override
				public String getName() {
					return classContext.Identifier().getText();
				}
				
			});
			
		}
		
	};
	
	
	
	/**
	 * Fragmentation rule for methods
	 * 
	 * @author maxmeffert
	 *
	 */
	static private class MethodRule extends FragmentationListenerRule {
		
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
			return Fragments.create("JavaMethod", entity, artifact, new Fragments.FactProvider() {
				
				// Get the original text from the parser context object
				@Override
				public String getText() {
					return ANTLRUtils.originalText(methodContext);
				}
				
				// Get the name of the class declaration
				@Override
				public String getName() {
					return methodContext.Identifier().getText();
				}
				
			});
			
		}
		
	};
	
	/**
	 * Fragmentation rule for fields
	 * 
	 * @author maxmeffert
	 *
	 */
	static private class FieldRule extends FragmentationListenerRule {
		
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
			return Fragments.create("JavaField", entity, artifact, new Fragments.FactProvider() {
				
				// Get the original text from the parser context object
				@Override
				public String getText() {
					return ANTLRUtils.originalText(fieldContext);
				}
				
				// Get the name of the class declaration
				@Override
				public String getName() {
					return fieldContext.getText();
				}
				
			});
		}
		
	};
	
	/**
	 * Gets the collection of Java fragmentation rules
	 */
	@Override
	public Collection<FragmentationListenerRule> getRules() {
		
		Collection<FragmentationListenerRule> rules = new ArrayList<FragmentationListenerRule>();
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
		
		return parser.compilationUnit();
		
	}

}
