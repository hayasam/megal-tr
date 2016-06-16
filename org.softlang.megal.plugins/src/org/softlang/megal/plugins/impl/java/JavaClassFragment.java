package org.softlang.megal.plugins.impl.java;

import org.softlang.megal.mi2.api.Artifact;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser.ClassDeclarationContext;
import org.softlang.megal.plugins.util.antlr.ParseTreeFragment;

public class JavaClassFragment extends ParseTreeFragment<ClassDeclarationContext> {

	public JavaClassFragment(Artifact artifact, ClassDeclarationContext context) {
		super(artifact, context);
	}
	
	@Override
	public String getType() {
		return "JavaClass";
	}
	
	@Override
	public String getName () {	
		return getContext().Identifier().getText();
	}

	

}
