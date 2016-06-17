package org.softlang.megal.plugins.impl.java;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.api.Artifact;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser.MethodDeclarationContext;
import org.softlang.megal.plugins.util.antlr.ParseTreeFragment;

public class JavaMethodFragment extends ParseTreeFragment<MethodDeclarationContext> {

	public JavaMethodFragment(Entity entity, Artifact artifact, MethodDeclarationContext context) {
		super(entity, artifact, context);
	}
	
	@Override
	public String getType() {
		return "JavaMethod";
	}
	
	@Override
	public String getName () {	
		return getContext().Identifier().getText();
	}
	
	
	

	

}