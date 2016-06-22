package org.softlang.megal.plugins.impl.sqlite;

import java.util.ArrayList;
import java.util.Collection;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.softlang.megal.plugins.api.antlr.ANTLRFragmentizer;
import org.softlang.megal.plugins.api.antlr.ANTLRFragmentationListener.FragmentationRule;
import org.softlang.megal.plugins.impl.sqlite.antlr.SQLiteLexer;
import org.softlang.megal.plugins.impl.sqlite.antlr.SQLiteParser;

public class SQLiteDDLFragmentitzer extends ANTLRFragmentizer {

	@Override
	public Collection<FragmentationRule> getRules() {
		
		Collection<FragmentationRule> rules = new ArrayList<FragmentationRule>();
		
		return rules;
		
	}

	@Override
	public ParseTree getParseTree(CharStream input) {
		
		SQLiteParser parser = new SQLiteParser(new CommonTokenStream(new SQLiteLexer(input)));
		
		return parser.sql_stmt_list();
	}

}
