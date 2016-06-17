package org.softlang.megal.plugins.impl.java;

import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.api.Artifact;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser.VariableDeclaratorContext;
import org.softlang.megal.plugins.util.antlr.ParseTreeFragment;

public class JavaFieldFragment extends ParseTreeFragment<VariableDeclaratorContext> {

	public JavaFieldFragment(Entity entity, Artifact artifact, VariableDeclaratorContext context) {
		super(entity, artifact, context);
	}
	
	@Override
	public String getType() {
		return "JavaField";
	}
	
	@Override
	public String getName () {	
		return getContext().getText();
	}
	
	

}
