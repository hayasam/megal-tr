package org.softlang.megal.plugins.impl.xml;

import java.util.ArrayList;
import java.util.Collection;
import org.antlr.v4.runtime.ParserRuleContext;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.api.Artifact;
import org.softlang.megal.plugins.api.antlr.ANTLRFragmentizerPlugin;
import org.softlang.megal.plugins.api.antlr.ANTLRParserFactory;
import org.softlang.megal.plugins.api.antlr.ANTLRUtils;
import org.softlang.megal.plugins.api.fragmentation.Fragments;
import org.softlang.megal.plugins.api.fragmentation.Fragments.Fragment;
import org.softlang.megal.plugins.impl.xml.antlr.XMLLexer;
import org.softlang.megal.plugins.impl.xml.antlr.XMLParser;
import org.softlang.megal.plugins.impl.xml.antlr.XMLParser.AttributeContext;
import org.softlang.megal.plugins.impl.xml.antlr.XMLParser.ElementContext;
import org.softlang.megal.plugins.impl.xml.antlr.XMLParserFactory;

/**
 * Disassembles every XML artifact into XML fragments, that is XMLElement and XMLAttribute.
 * Also disassembles XSD artifacts and other subsets of XML.
 * 
 * @author maxmeffert
 *
 */
public class XMLFragmentizer extends ANTLRFragmentizerPlugin<XMLParser, XMLLexer> {
	
	/**
	 * Fragmentation rule for XMLElements and XMLAttributes
	 * @author maxmeffert
	 *
	 */
	static private class ElementRule extends FragmentationRule<ElementContext> {
		

		
		@Override
		protected Class<ElementContext> contextType() {
			return ElementContext.class;
		}

		@Override
		protected boolean isLeaf(ElementContext context) {
			return context.content() == null || context.content().element().isEmpty();
		}

		@Override
		protected boolean test(ElementContext context) {
			return !context.Name().isEmpty();
		}

		@Override
		protected Fragment createFragment(Entity entity, Artifact artifact, ElementContext context) {
			
			// Create a new XMLElement fragment
			Fragment f = Fragments.create(
					context.Name(0).toString(),
					"XMLElement",
					ANTLRUtils.originalText(context),
					entity, 
					artifact);
			
			// For all attribute context objects
			for (AttributeContext attributeContext : context.attribute()) {
				
				// Create a new fact provider for the attribute context object
				String name = attributeContext.Name().toString();
				String text = ANTLRUtils.originalText(attributeContext);
				
				// If the attribute is a XML namespace attribute
				if (attributeContext.Name().toString().toLowerCase().startsWith("xmlns:")) {
					
					// Create a new XMLNSAttribute fragment
					f.addPart(Fragments.create(
							name,
							"XMLNSAttribute",
							text,
							entity, 
							artifact));
					
				}
				else {
					
					// Create a new XMLAttribute fragment
					f.addPart(Fragments.create(
							name,
							"XMLAttribute",
							text,
							entity, 
							artifact));
					
				}
				
			}
			
			return f;
			
		}
		
	}
	
	/**
	 * Gets the collection of XML fragmentation rules
	 */
	@Override
	public Collection<FragmentationRule<? extends ParserRuleContext>> getRules() {
		
		Collection<FragmentationRule<? extends ParserRuleContext>> rules = new ArrayList<FragmentationRule<? extends ParserRuleContext>>();
		rules.add(new ElementRule());
		
		return rules;
		
	}
	

	@Override
	public ANTLRParserFactory<XMLParser, XMLLexer> getParserFactory() {
		return new XMLParserFactory();
	}

}
