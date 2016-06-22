package org.softlang.megal.plugins.api.antlr;

import java.io.IOException;
import java.io.Reader;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.softlang.megal.mi2.api.Artifact;

import com.google.common.io.CharSource;

public abstract class ANTLRParserFactory<P extends Parser, L extends Lexer> {

	abstract public L getLexer (CharStream chars);
	abstract public P getParser (TokenStream tokens);
	abstract public ParseTree getParseTree (P parser);
	
	final public L getLexer (Reader reader) throws IOException {
		return getLexer(new ANTLRInputStream(reader));
	}
	
	final public L getLexer (CharSource chars) throws IOException {
		return getLexer(chars.openStream());
	}
	
	final public L getLexer (Artifact artifact) throws IOException {
		return getLexer(artifact.getChars());
	}
	
	final public P getParser (L lexer) {
		return getParser(new CommonTokenStream(lexer));
	}
	
	final public P getParser (Reader reader) throws IOException {
		return getParser(getLexer(reader));
	}
	
	final public P getParser (CharSource chars) throws IOException {
		return getParser(getLexer(chars));
	}
	
	final public P getParser (Artifact artifact) throws IOException {
		return getParser(getLexer(artifact));
	}
	
	final public ParseTree getParseTree (Reader reader) throws IOException {
		return getParseTree(getParser(reader));
	}
	
	final public ParseTree getParseTree (CharSource chars) throws IOException {
		return getParseTree(getParser(chars));
	}
	
	final public ParseTree getParseTree (Artifact artifact) throws IOException {
		return getParseTree(getParser(artifact));
	}
	
}
