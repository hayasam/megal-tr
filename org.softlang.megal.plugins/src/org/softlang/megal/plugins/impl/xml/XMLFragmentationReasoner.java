package org.softlang.megal.plugins.impl.xml;

import java.util.ArrayList;
import java.util.Collection;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.api.Artifact;
import org.softlang.megal.plugins.impl.xml.antlr.XMLLexer;
import org.softlang.megal.plugins.impl.xml.antlr.XMLParser;
import org.softlang.megal.plugins.util.Fragments;
import org.softlang.megal.plugins.util.Fragments.Fragment;
import org.softlang.megal.plugins.util.antlr.ANTLRFragmentationReasoner;
import org.softlang.megal.plugins.util.antlr.ANTLRUtils;
import org.softlang.megal.plugins.util.antlr.FragmentationListenerRule;

public class XMLFragmentationReasoner extends ANTLRFragmentationReasoner {

	static private class ElementRule extends FragmentationListenerRule {

		@Override
		public boolean test(ParserRuleContext context) {
			return context instanceof XMLParser.ElementContext;
		}

		@Override
		public Fragment create(Entity entity, Artifact artifact, ParserRuleContext context) {
			
			XMLParser.ElementContext elementContext = (XMLParser.ElementContext)context;
			
			return Fragments.create("XMLElement", entity, artifact, new Fragments.FactProvider() {
				
				@Override
				public String getText() {
					return ANTLRUtils.originalText(elementContext);
				}
				
				@Override
				public String getName() {
					
					String name = elementContext.Name(0).toString();
					
					return name + elementContext.getParent().children.indexOf(elementContext);
					
				}
				
			});
			
		}
		
	}
	
	@Override
	public Collection<FragmentationListenerRule> getRules() {
		
		Collection<FragmentationListenerRule> rules = new ArrayList<FragmentationListenerRule>();
		rules.add(new ElementRule());
		
		return rules;
		
	}

	@Override
	public ParseTree getParseTree(CharStream input) {

		XMLParser parser = new XMLParser(new CommonTokenStream(new XMLLexer(input)));
		
		return parser.document();

	}

}
