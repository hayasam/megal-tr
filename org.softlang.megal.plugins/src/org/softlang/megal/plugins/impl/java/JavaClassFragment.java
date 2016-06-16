package org.softlang.megal.plugins.impl.java;

import org.softlang.megal.plugins.impl.java.antlr.JavaParser.ClassDeclarationContext;
import org.softlang.megal.plugins.util.antlr.Fragment;

public class JavaClassFragment extends Fragment<ClassDeclarationContext> {

	public JavaClassFragment(ClassDeclarationContext context) {
		super(context);
	}
	
	@Override
	public String getType() {
		return "JavaClass";
	}
	
	@Override
	public String getName () {	
		return getContext().Identifier().getText();
	}

	@Override
	public String getLink() {
		return "";
	}

}
