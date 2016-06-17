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

public class JavaFragmentationReasoner extends ANTLRFragmentationReasoner {
	
	static private class InnerClassRule extends FragmentationListenerRule {

		@Override
		public boolean isLeaf(ParserRuleContext context) {
			return false;
		}

		@Override
		public boolean test(ParserRuleContext context) {
			return context instanceof JavaParser.ClassDeclarationContext
					&& context.getParent() instanceof JavaParser.MemberDeclarationContext;
		}

		@Override
		public Fragment create(Entity entity, Artifact artifact, ParserRuleContext context) {
			
			JavaParser.ClassDeclarationContext classContext = (JavaParser.ClassDeclarationContext)context;
			
			return Fragments.create("JavaInnerClass", entity, artifact, new Fragments.FactProvider() {
				
				@Override
				public String getText() {
					return ANTLRUtils.originalText(classContext);
				}
				
				@Override
				public String getName() {
					return classContext.Identifier().getText();
				}
				
			});
			
		}
		
	};
	
	static private class ClassRule extends FragmentationListenerRule {

		@Override
		public boolean isLeaf(ParserRuleContext context) {
			return false;
		}

		@Override
		public boolean test(ParserRuleContext context) {
			return context instanceof JavaParser.ClassDeclarationContext
					&& context.getParent() instanceof JavaParser.TypeDeclarationContext;
		}

		@Override
		public Fragment create(Entity entity, Artifact artifact, ParserRuleContext context) {
			
			JavaParser.ClassDeclarationContext classContext = (JavaParser.ClassDeclarationContext)context;
			
			return Fragments.create("JavaClass", entity, artifact, new Fragments.FactProvider() {
				
				@Override
				public String getText() {
					return ANTLRUtils.originalText(classContext);
				}
				
				@Override
				public String getName() {
					return classContext.Identifier().getText();
				}
				
			});
			
		}

		
		
	};
	
	
	static private class MethodRule extends FragmentationListenerRule {

		@Override
		public boolean isLeaf(ParserRuleContext context) {
			return true;
		}
		
		@Override
		public boolean test(ParserRuleContext context) {
			return context instanceof JavaParser.MethodDeclarationContext;
		}

		@Override
		public Fragment create(Entity entity, Artifact artifact, ParserRuleContext context) {
			
			JavaParser.MethodDeclarationContext methodContext = (JavaParser.MethodDeclarationContext)context;
			
			return Fragments.create("JavaMethod", entity, artifact, new Fragments.FactProvider() {
				
				@Override
				public String getText() {
					return ANTLRUtils.originalText(methodContext);
				}
				
				@Override
				public String getName() {
					return methodContext.Identifier().getText();
				}
				
			});
			
		}
		
	};
	
	static private class FieldRule extends FragmentationListenerRule {

		@Override
		public boolean isLeaf(ParserRuleContext context) {
			return true;
		}
		
		@Override
		public boolean test(ParserRuleContext context) {
			return context instanceof JavaParser.VariableDeclaratorContext
					&& context.getParent().getParent() instanceof JavaParser.FieldDeclarationContext;
		}

		@Override
		public Fragment create(Entity entity, Artifact artifact, ParserRuleContext context) {
			
			JavaParser.VariableDeclaratorContext fieldContext = (JavaParser.VariableDeclaratorContext)context;
			
			return Fragments.create("JavaField", entity, artifact, new Fragments.FactProvider() {
				
				@Override
				public String getText() {
					return ANTLRUtils.originalText(fieldContext);
				}
				
				@Override
				public String getName() {
					return fieldContext.getText();
				}
				
			});
		}
		
	};
	
	/**
	 * 
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
	 * 
	 */
	@Override
	public ParseTree getParseTree(CharStream input) {
		
		JavaParser parser = new JavaParser(new CommonTokenStream(new JavaLexer(input)));
		
		return parser.compilationUnit();
		
	}

}
