package org.softlang.megal.plugins.impl.sqlite;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.softlang.megal.mi2.api.Artifact;
import org.softlang.megal.plugins.api.Acceptor;
import org.softlang.megal.plugins.impl.sqlite.antlr.SQLiteLexer;
import org.softlang.megal.plugins.impl.sqlite.antlr.SQLiteParser;

import com.google.common.base.Optional;

public class AcceptSQLite extends Acceptor {

	@Override
	public Optional<String> accept(Artifact artifact) {
		
		try {
			
			CharStream input = new ANTLRInputStream(artifact.getChars().openStream());

			SQLiteParser parser = new SQLiteParser(new CommonTokenStream(new SQLiteLexer(input)));
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return Optional.absent();
		
	}

}
