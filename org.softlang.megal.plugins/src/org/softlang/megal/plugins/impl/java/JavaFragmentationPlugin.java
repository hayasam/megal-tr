package org.softlang.megal.plugins.impl.java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.softlang.megal.mi2.api.Artifact;
import org.softlang.megal.plugins.api.FragmentationPlugin;
import org.softlang.megal.plugins.impl.java.antlr.JavaLexer;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser;
import org.softlang.megal.plugins.util.Fragments.Fragment;
import org.softlang.megal.plugins.util.antlr.ParseTreeFragmentationListener;
import org.softlang.megal.plugins.util.antlr.ParseTreeFragmentationRule;

public class JavaFragmentationPlugin extends FragmentationPlugin {
	
	final static private ParseTreeFragmentationRule ruleJavaInnerClass = new ParseTreeFragmentationRule(){

		@Override
		public boolean hasParts() {
			return true;
		}

		@Override
		public boolean test(ParserRuleContext context) {
			return context instanceof JavaParser.ClassDeclarationContext
					&& context.getParent() instanceof JavaParser.MemberDeclarationContext;
		}

		@Override
		public Fragment create(Artifact artifact, ParserRuleContext context) {
			return new JavaClassFragment(artifact, (JavaParser.ClassDeclarationContext)context);
		}
		
	};
	
	final static private ParseTreeFragmentationRule ruleJavaClass = new ParseTreeFragmentationRule(){

		@Override
		public boolean hasParts() {
			return true;
		}

		@Override
		public boolean test(ParserRuleContext context) {
			return context instanceof JavaParser.ClassDeclarationContext;
//					&& context.getParent() instanceof JavaParser.TypeDeclarationContext;
		}

		@Override
		public Fragment create(Artifact artifact, ParserRuleContext context) {
			
			return new JavaClassFragment(artifact, (JavaParser.ClassDeclarationContext)context);
			
		}
		
	};
	
	final static private ParseTreeFragmentationRule ruleJavaMethod = new ParseTreeFragmentationRule(){

		@Override
		public boolean test(ParserRuleContext context) {
			return context instanceof JavaParser.MethodDeclarationContext;
		}

		@Override
		public Fragment create(Artifact artifact, ParserRuleContext context) {
			return new JavaMethodFragment(artifact, (JavaParser.MethodDeclarationContext)context);
		}
		
	};
	
	final static private ParseTreeFragmentationRule ruleJavaField = new ParseTreeFragmentationRule(){

		@Override
		public boolean test(ParserRuleContext context) {
			return context instanceof JavaParser.VariableDeclaratorContext
					&& context.getParent().getParent() instanceof JavaParser.FieldDeclarationContext;
		}

		@Override
		public Fragment create(Artifact artifact, ParserRuleContext context) {
			return new JavaFieldFragment(artifact, (JavaParser.VariableDeclaratorContext)context);
		}
		
	};
	
	
	final static private Collection<ParseTreeFragmentationRule> rules = new ArrayList<ParseTreeFragmentationRule>();
	static {
		rules.add(ruleJavaClass);
		rules.add(ruleJavaMethod);
		rules.add(ruleJavaField);
	}
	
	
	@Override
	public List<Fragment> getFragments(Artifact artifact) {
		
		ParseTreeFragmentationListener listener = new ParseTreeFragmentationListener(artifact, rules);
		
		
		try {
			
			JavaParser parser = new JavaParser(new CommonTokenStream(new JavaLexer(new ANTLRInputStream(artifact.getChars().openStream()))));
			
			ParseTreeWalker walker = new ParseTreeWalker();
			
			walker.walk(listener, parser.compilationUnit());
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
		return listener.getFragments();
		
	}

}
