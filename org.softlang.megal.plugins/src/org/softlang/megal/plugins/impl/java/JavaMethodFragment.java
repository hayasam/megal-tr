package org.softlang.megal.plugins.impl.java;

import org.softlang.megal.plugins.impl.java.antlr.JavaParser.MethodDeclarationContext;
import org.softlang.megal.plugins.util.antlr.Fragment;

public class JavaMethodFragment extends Fragment<MethodDeclarationContext> {

	public JavaMethodFragment(MethodDeclarationContext context) {
		super(context);
	}
	
	@Override
	public String getType() {
		return "JavaMethod";
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