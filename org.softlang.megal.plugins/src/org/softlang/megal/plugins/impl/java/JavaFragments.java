package org.softlang.megal.plugins.impl.java;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.RuleContext;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser;
import org.softlang.megal.plugins.impl.java.antlr.JavaParser.ClassDeclarationContext;

public class JavaFragments {

	static abstract class Fragment {
		
		abstract String getType();
		abstract String getName();
		
		private List<Fragment> parts = new ArrayList<Fragment>();
		
		public List<Fragment> getParts () {
			return parts;
		}
		
		public void addPart (Fragment part) {
			parts.add(part);
		}
		
		public boolean equals (Object o) {
			
			if (o instanceof Fragment 
					&& o.getClass().equals(this.getClass())) {
				
				Fragment f = (Fragment) o;
				
				return f.getName().equals(this.getName()) 
						&& f.getType().equals(this.getType());
				
			}
			
			return false;
			
		}
		
		public String toString () {
			
			return getType() + "(" + getName() + ")";
			
		}
		
	}
	
	static abstract class ANTLRFragment<Context extends RuleContext> extends Fragment {
		
		private Context context;
		
		public ANTLRFragment(Context context) {
			this.context = context;
		}
		
		public Context getContext () {
			return context;
		}
		
	}
	
	static class JavaClassFragment extends ANTLRFragment<JavaParser.ClassDeclarationContext> {

		public JavaClassFragment(ClassDeclarationContext context) {
			super(context);
		}
		
		@Override
		public String getType() {
			return "JavaClass";
		}
		
		public String getName () {
			
			return getContext().Identifier().getText();
			
		}
		
	}
	
}
