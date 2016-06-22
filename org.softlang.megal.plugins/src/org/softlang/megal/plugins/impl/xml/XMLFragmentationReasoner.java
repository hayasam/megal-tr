package org.softlang.megal.plugins.impl.xml;

import java.util.ArrayList;
import java.util.Collection;
import org.antlr.v4.runtime.ParserRuleContext;
import org.softlang.megal.mi2.Entity;
import org.softlang.megal.mi2.api.Artifact;
import org.softlang.megal.plugins.api.antlr.ANTLRFragmentizerPlugin;
import org.softlang.megal.plugins.api.antlr.ANTLRParserFactory;
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
public class XMLFragmentationReasoner extends ANTLRFragmentizerPlugin<XMLParser, XMLLexer> {

	static private class ElementContextFactProvider extends ParserContextFactProvider<XMLParser.ElementContext> {

		public ElementContextFactProvider(ElementContext context) {
			super(context);
		}

		@Override
		public String getName() {
			if (getContext().Name().isEmpty()) {
				throw new IllegalStateException("ElementContext does not provide a name!");
			}
			return getContext().Name(0).toString();
		}
		
	}
	
	static private class AttributeContextFactProvider extends ParserContextFactProvider<XMLParser.AttributeContext> {

		public AttributeContextFactProvider(AttributeContext context) {
			super(context);
		}

		@Override
		public String getName() {
			return getContext().Name().toString();
		}
		
	}
	
	/**
	 * Fragmentation rule for XMLElements and XMLAttributes
	 * @author maxmeffert
	 *
	 */
	static private class ElementRule implements FragmentationRule {
		
		/**
		 * Tests whether the current context is an ElementContext
		 */
		@Override
		public boolean test(ParserRuleContext context) {
			
			return context instanceof XMLParser.ElementContext
					&& ((XMLParser.ElementContext)context).Name().size() > 0;
		}
		
		/**
		 * Checks whether the ElementContext is a leaf, that is if it has no contents.
		 */
		@Override
		public boolean isLeaf(ParserRuleContext context) {
			
			XMLParser.ElementContext elementContext = (XMLParser.ElementContext)context;
						
			return elementContext.content() == null || elementContext.content().element().isEmpty();
			
		}

		/**
		 * Creates a new XMLElement fragment with its subsequent XMLAttribute fragments.
		 */
		@Override
		public Fragment create(Entity entity, Artifact artifact, ParserRuleContext context) {
			
			XMLParser.ElementContext elementContext = (XMLParser.ElementContext)context;
			
			// Create a new XMLElement fragment
			Fragment f = Fragments.create("XMLElement", entity, artifact, new ElementContextFactProvider(elementContext));
			
			// For all attribute context objects
			for (XMLParser.AttributeContext attributeContext : elementContext.attribute()) {
				
				// Create a new fact provider for the attribute context object
				Fragments.FactProvider facts = new AttributeContextFactProvider(attributeContext);
				
				// If the attribute is a XML namespace attribute
				if (attributeContext.Name().toString().toLowerCase().startsWith("xmlns:")) {
					
					// Create a new XMLNSAttribute fragment
					f.addPart(Fragments.create("XMLNSAttribute", entity, artifact, facts));
					
				}
				else {
					
					// Create a new XMLAttribute fragment
					f.addPart(Fragments.create("XMLAttribute", entity, artifact, facts));
					
				}
				
			}
			
			return f;
			
		}
		
	}
	
	/**
	 * Gets the collection of XML fragmentation rules
	 */
	@Override
	public Collection<FragmentationRule> getRules() {
		
		Collection<FragmentationRule> rules = new ArrayList<FragmentationRule>();
		rules.add(new ElementRule());
		
		return rules;
		
	}
	

	@Override
	public ANTLRParserFactory<XMLParser, XMLLexer> getParserFactory() {
		return new XMLParserFactory();
	}

}
