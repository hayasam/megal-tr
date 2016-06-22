package org.softlang.megal.plugins.api.antlr;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class ANTLRErrorCollectorListener extends BaseErrorListener {

	static public class SyntaxError {
		
		private Recognizer<?, ?> recognizer;
		private Object offendingSymbol; 
		private int line;
		private int charPositionInLine;
		private String msg;
		private RecognitionException e;
		
		public Recognizer<?, ?> getRecognizer() {
			return recognizer;
		}
		public void setRecognizer(Recognizer<?, ?> recognizer) {
			this.recognizer = recognizer;
		}
		public Object getOffendingSymbol() {
			return offendingSymbol;
		}
		public void setOffendingSymbol(Object offendingSymbol) {
			this.offendingSymbol = offendingSymbol;
		}
		public int getLine() {
			return line;
		}
		public void setLine(int line) {
			this.line = line;
		}
		public int getCharPositionInLine() {
			return charPositionInLine;
		}
		public void setCharPositionInLine(int charPositionInLine) {
			this.charPositionInLine = charPositionInLine;
		}
		public String getMsg() {
			return msg;
		}
		public void setMsg(String msg) {
			this.msg = msg;
		}
		public RecognitionException getE() {
			return e;
		}
		public void setE(RecognitionException e) {
			this.e = e;
		}
		
		public String toString () {
		
			return "line " + line + ":" + charPositionInLine + " " + msg;
			
		}
		
	}
	
	private List<SyntaxError> errors = new ArrayList<SyntaxError>();
	
	public List<SyntaxError> getErrors () {
		return errors;
	}
	
	@Override
	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
	{
		SyntaxError error = new SyntaxError();
		error.setRecognizer(recognizer);
		error.setOffendingSymbol(offendingSymbol);
		error.setLine(line);
		error.setCharPositionInLine(charPositionInLine);
		error.setMsg(msg);
		error.setE(e);
		
		System.out.println(error);
		
		errors.add(error);
		
	}
	
}
