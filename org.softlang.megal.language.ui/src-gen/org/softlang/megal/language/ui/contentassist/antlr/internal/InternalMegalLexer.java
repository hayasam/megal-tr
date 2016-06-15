package org.softlang.megal.language.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMegalLexer extends Lexer {
    public static final int RULE_STRING=5;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int RULE_ID=4;
    public static final int RULE_WS=7;
    public static final int RULE_COMMENT=6;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalMegalLexer() {;} 
    public InternalMegalLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMegalLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:11:6: ( 'model' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:11:8: 'model'
            {
            match("model"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:12:6: ( 'import' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:12:8: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:13:7: ( '@' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:13:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:14:7: ( '=' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:14:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:15:7: ( '(' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:15:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:16:7: ( ')' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:16:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:17:7: ( '|->' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:17:9: '|->'
            {
            match("|->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:18:7: ( '<' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:18:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:19:7: ( 'as' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:19:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:20:7: ( 'entity' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:20:9: 'entity'
            {
            match("entity"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:21:7: ( '*' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:21:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:22:7: ( '[' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:22:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:23:7: ( ']' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:23:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:24:7: ( '->' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:24:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:25:7: ( ':' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:25:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:26:7: ( '(+)' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:26:9: '(+)'
            {
            match("(+)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:27:7: ( '+' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:27:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3434:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+ ( '.' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+ )* )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3434:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+ ( '.' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+ )*
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3434:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3434:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3434:16: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3434:50: ( '.' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+ )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='.') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3434:51: '.' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+
            	    {
            	    match('.'); 
            	    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3434:55: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:
            	    	    {
            	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt3 >= 1 ) break loop3;
            	                EarlyExitException eee =
            	                    new EarlyExitException(3, input);
            	                throw eee;
            	        }
            	        cnt3++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3436:13: ( '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3436:15: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3436:20: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\\') ) {
                    alt5=1;
                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3436:21: '\\\\' .
            	    {
            	    match('\\'); 
            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3436:28: ~ ( ( '\\\\' | '\\'' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_COMMENT"
    public final void mRULE_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3438:14: ( ( '/*' ( options {greedy=false; } : . )* '*/' | '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3438:16: ( '/*' ( options {greedy=false; } : . )* '*/' | '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3438:16: ( '/*' ( options {greedy=false; } : . )* '*/' | '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='/') ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1=='*') ) {
                    alt10=1;
                }
                else if ( (LA10_1=='/') ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3438:17: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3438:22: ( options {greedy=false; } : . )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='*') ) {
                            int LA6_1 = input.LA(2);

                            if ( (LA6_1=='/') ) {
                                alt6=2;
                            }
                            else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) ) {
                                alt6=1;
                            }


                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3438:50: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match("*/"); 


                    }
                    break;
                case 2 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3438:59: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
                    {
                    match("//"); 

                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3438:64: (~ ( ( '\\n' | '\\r' ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='\uFFFF')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3438:64: ~ ( ( '\\n' | '\\r' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3438:80: ( ( '\\r' )? '\\n' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\n'||LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3438:81: ( '\\r' )? '\\n'
                            {
                            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3438:81: ( '\\r' )?
                            int alt8=2;
                            int LA8_0 = input.LA(1);

                            if ( (LA8_0=='\r') ) {
                                alt8=1;
                            }
                            switch (alt8) {
                                case 1 :
                                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3438:81: '\\r'
                                    {
                                    match('\r'); 

                                    }
                                    break;

                            }

                            match('\n'); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3440:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3440:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3440:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | RULE_ID | RULE_STRING | RULE_COMMENT | RULE_WS )
        int alt12=21;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1:10: T__8
                {
                mT__8(); 

                }
                break;
            case 2 :
                // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1:15: T__9
                {
                mT__9(); 

                }
                break;
            case 3 :
                // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1:20: T__10
                {
                mT__10(); 

                }
                break;
            case 4 :
                // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1:26: T__11
                {
                mT__11(); 

                }
                break;
            case 5 :
                // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1:32: T__12
                {
                mT__12(); 

                }
                break;
            case 6 :
                // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1:38: T__13
                {
                mT__13(); 

                }
                break;
            case 7 :
                // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1:44: T__14
                {
                mT__14(); 

                }
                break;
            case 8 :
                // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1:50: T__15
                {
                mT__15(); 

                }
                break;
            case 9 :
                // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1:56: T__16
                {
                mT__16(); 

                }
                break;
            case 10 :
                // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1:62: T__17
                {
                mT__17(); 

                }
                break;
            case 11 :
                // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1:68: T__18
                {
                mT__18(); 

                }
                break;
            case 12 :
                // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1:74: T__19
                {
                mT__19(); 

                }
                break;
            case 13 :
                // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1:80: T__20
                {
                mT__20(); 

                }
                break;
            case 14 :
                // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1:86: T__21
                {
                mT__21(); 

                }
                break;
            case 15 :
                // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1:92: T__22
                {
                mT__22(); 

                }
                break;
            case 16 :
                // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1:98: T__23
                {
                mT__23(); 

                }
                break;
            case 17 :
                // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1:104: T__24
                {
                mT__24(); 

                }
                break;
            case 18 :
                // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1:110: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 19 :
                // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1:118: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 20 :
                // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1:130: RULE_COMMENT
                {
                mRULE_COMMENT(); 

                }
                break;
            case 21 :
                // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1:143: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\2\21\2\uffff\1\30\3\uffff\2\21\12\uffff\2\21\2\uffff\1\35\3\21\1\uffff\4\21\1\45\2\21\1\uffff\1\50\1\51\2\uffff";
    static final String DFA12_eofS =
        "\52\uffff";
    static final String DFA12_minS =
        "\1\11\1\157\1\155\2\uffff\1\53\3\uffff\1\163\1\156\12\uffff\1\144\1\160\2\uffff\1\56\1\164\1\145\1\157\1\uffff\1\151\1\154\1\162\1\164\1\56\1\164\1\171\1\uffff\2\56\2\uffff";
    static final String DFA12_maxS =
        "\1\174\1\157\1\155\2\uffff\1\53\3\uffff\1\163\1\156\12\uffff\1\144\1\160\2\uffff\1\172\1\164\1\145\1\157\1\uffff\1\151\1\154\1\162\1\164\1\172\1\164\1\171\1\uffff\2\172\2\uffff";
    static final String DFA12_acceptS =
        "\3\uffff\1\3\1\4\1\uffff\1\6\1\7\1\10\2\uffff\1\13\1\14\1\15\1\16\1\17\1\21\1\22\1\23\1\24\1\25\2\uffff\1\20\1\5\4\uffff\1\11\7\uffff\1\1\2\uffff\1\2\1\12";
    static final String DFA12_specialS =
        "\52\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\24\2\uffff\1\24\22\uffff\1\24\6\uffff\1\22\1\5\1\6\1\13\1\20\1\uffff\1\16\1\uffff\1\23\12\21\1\17\1\uffff\1\10\1\4\2\uffff\1\3\32\21\1\14\1\uffff\1\15\2\21\1\uffff\1\11\3\21\1\12\3\21\1\2\3\21\1\1\15\21\1\uffff\1\7",
            "\1\25",
            "\1\26",
            "",
            "",
            "\1\27",
            "",
            "",
            "",
            "\1\31",
            "\1\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\33",
            "\1\34",
            "",
            "",
            "\1\21\1\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\36",
            "\1\37",
            "\1\40",
            "",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\21\1\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\46",
            "\1\47",
            "",
            "\1\21\1\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\21\1\uffff\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | RULE_ID | RULE_STRING | RULE_COMMENT | RULE_WS );";
        }
    }
 

}