package org.softlang.megal.plugins.impl.java;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.softlang.megal.plugins.api.FragmentationPlugin;
import org.softlang.megal.plugins.impl.java.antlr.JavaLexer;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser;
import org.softlang.megal.plugins.util.antlr.FragmentationListener;
import org.softlang.megal.plugins.util.antlr.FragmentationRule;
import org.softlang.megal.plugins.util.antlr.old.FragmentationException;

public class JavaFragmentationPlugin extends FragmentationPlugin {
		
	static private FragmentationListener listener = new FragmentationListener();
	static {
		listener.addFragmentationRule(new FragmentationRule(){

			@Override
			public boolean hasParts() {
				return true;
			}

			@Override
			public boolean test(ParserRuleContext context) {
				return context instanceof JavaParser.ClassDeclarationContext;
			}

			@Override
			public Fragment create(ParserRuleContext context) {
				return new JavaClassFragment((JavaParser.ClassDeclarationContext)context);
			}
			
		});
		listener.addFragmentationRule(new FragmentationRule(){

			@Override
			public boolean test(ParserRuleContext context) {
				return context instanceof JavaParser.MethodDeclarationContext;
			}

			@Override
			public Fragment create(ParserRuleContext context) {
				return new JavaMethodFragment((JavaParser.MethodDeclarationContext)context);
			}
			
		});
		listener.addFragmentationRule(new FragmentationRule(){

			@Override
			public boolean test(ParserRuleContext context) {
				return context instanceof JavaParser.VariableDeclaratorContext
						&& context.getParent().getParent() instanceof JavaParser.FieldDeclarationContext;
			}

			@Override
			public Fragment create(ParserRuleContext context) {
				return new JavaFieldFragment((JavaParser.VariableDeclaratorContext)context);
			}
			
		});
	}
	
	@Override
	public List<Fragment> getFragments(Reader r) throws FragmentationException {
		
		try {
			
			JavaParser parser = new JavaParser(new CommonTokenStream(new JavaLexer(new ANTLRInputStream(r))));
			
			parser.removeErrorListeners();
			
			ParseTreeWalker walker = new ParseTreeWalker();
			walker.walk(listener, parser.compilationUnit());
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
		return listener.getFragments();
		
	}

}
