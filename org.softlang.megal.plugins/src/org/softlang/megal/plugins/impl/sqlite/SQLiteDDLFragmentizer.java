package org.softlang.megal.plugins.impl.sqlite;

import java.util.ArrayList;
import java.util.Collection;

import org.softlang.megal.plugins.api.antlr.ANTLRFragmentizerPlugin;
import org.softlang.megal.plugins.api.antlr.ANTLRParserFactory;
import org.softlang.megal.plugins.impl.sqlite.antlr.SQLiteLexer;
import org.softlang.megal.plugins.impl.sqlite.antlr.SQLiteParser;
import org.softlang.megal.plugins.impl.sqlite.antlr.SQLiteParserFactory;

public class SQLiteDDLFragmentizer extends ANTLRFragmentizerPlugin<SQLiteParser, SQLiteLexer> {

	@Override
	public Collection<FragmentationRule> getRules() {
		
		Collection<FragmentationRule> rules = new ArrayList<FragmentationRule>();
		
		return rules;
		
	}
	

	@Override
	public ANTLRParserFactory<SQLiteParser, SQLiteLexer> getParserFactory() {
		return new SQLiteParserFactory();
	}

}
