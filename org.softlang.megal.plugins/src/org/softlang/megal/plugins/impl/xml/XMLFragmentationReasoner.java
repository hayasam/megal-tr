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
import org.softlang.megal.plugins.impl.xml.antlr.XMLParser.AttributeContext;
import org.softlang.megal.plugins.impl.xml.antlr.XMLParser.ElementContext;
import org.softlang.megal.plugins.util.Fragments;
import org.softlang.megal.plugins.util.Fragments.Fragment;
import org.softlang.megal.plugins.util.antlr.ANTLRFragmentationReasoner;
import org.softlang.megal.plugins.util.antlr.ANTLRParserRuleContextFactProvider;
import org.softlang.megal.plugins.util.antlr.ANTLRFragmentationListener.FragmentationRule;
import org.softlang.megal.plugins.util.antlr.ANTLRUtils;

/**
 * Disassembles every XML artifact into XML fragments, that is XMLElement and XMLAttribute.
 * Also disassembles XSD artifacts and other subsets of XML.
 * 
 * @author maxmeffert
 *
 */
public class XMLFragmentationReasoner extends ANTLRFragmentationReasoner {

	static private class ElementContextFactProvider extends ANTLRParserRuleContextFactProvider<XMLParser.ElementContext> {

		public ElementContextFactProvider(ElementContext context) {
			super(context);
		}

		@Override
		public String getName() {
			return getContext().Name(0).toString();
		}
		
	}
	
	static private class AttributeContextFactProvider extends ANTLRParserRuleContextFactProvider<XMLParser.AttributeContext> {

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
						
			return elementContext.content() == null;
			
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

	/**
	 * Gets the parse tree for XML input char stream.
	 */
	@Override
	public ParseTree getParseTree(CharStream input) {

		XMLParser parser = new XMLParser(new CommonTokenStream(new XMLLexer(input)));
		
		return parser.document();

	}

}
