package org.softlang.megal.plugins.impl.java;

import org.softlang.megal.plugins.impl.java.antlr.JavaParser.VariableDeclaratorContext;
import org.softlang.megal.plugins.util.antlr.Fragment;

public class JavaFieldFragment extends Fragment<VariableDeclaratorContext> {

	public JavaFieldFragment(VariableDeclaratorContext context) {
		super(context);
	}
	
	@Override
	public String getType() {
		return "JavaField";
	}
	
	@Override
	public String getName () {	
		return getContext().getText();
	}

	@Override
	public String getLink() {
		return "";
	}

}
