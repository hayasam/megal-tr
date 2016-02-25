package org.softlang.megal.language.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.softlang.megal.language.services.MegalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMegalParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_COMMENT", "RULE_WS", "'model'", "'import'", "'@'", "'('", "')'", "'|->'", "'='", "'<'", "'as'", "'entity'", "'['", "'->'", "']'", "'(+)'", "'+'", "'*'", "':'"
    };
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


        public InternalMegalParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMegalParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMegalParser.tokenNames; }
    public String getGrammarFileName() { return "../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g"; }



     	private MegalGrammarAccess grammarAccess;
     	
        public InternalMegalParser(TokenStream input, MegalGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "MegalFile";	
       	}
       	
       	@Override
       	protected MegalGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMegalFile"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:67:1: entryRuleMegalFile returns [EObject current=null] : iv_ruleMegalFile= ruleMegalFile EOF ;
    public final EObject entryRuleMegalFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMegalFile = null;


        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:68:2: (iv_ruleMegalFile= ruleMegalFile EOF )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:69:2: iv_ruleMegalFile= ruleMegalFile EOF
            {
             newCompositeNode(grammarAccess.getMegalFileRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMegalFile_in_entryRuleMegalFile75);
            iv_ruleMegalFile=ruleMegalFile();

            state._fsp--;

             current =iv_ruleMegalFile; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMegalFile85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMegalFile"


    // $ANTLR start "ruleMegalFile"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:76:1: ruleMegalFile returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleMegalAnnotation ) )* otherlv_1= 'model' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'import' ( (otherlv_4= RULE_ID ) ) ) | ( (lv_declarations_5_0= ruleMegalEntityType ) ) | ( (lv_declarations_6_0= ruleMegalRelationshipType ) ) | ( (lv_declarations_7_0= ruleMegalEntity ) ) | ( (lv_declarations_8_0= ruleMegalRelationship ) ) | ( (lv_declarations_9_0= ruleMegalPair ) ) | ( (lv_bindings_10_0= ruleMegalLink ) ) )* ) ;
    public final EObject ruleMegalFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_annotations_0_0 = null;

        EObject lv_declarations_5_0 = null;

        EObject lv_declarations_6_0 = null;

        EObject lv_declarations_7_0 = null;

        EObject lv_declarations_8_0 = null;

        EObject lv_declarations_9_0 = null;

        EObject lv_bindings_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:79:28: ( ( ( (lv_annotations_0_0= ruleMegalAnnotation ) )* otherlv_1= 'model' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'import' ( (otherlv_4= RULE_ID ) ) ) | ( (lv_declarations_5_0= ruleMegalEntityType ) ) | ( (lv_declarations_6_0= ruleMegalRelationshipType ) ) | ( (lv_declarations_7_0= ruleMegalEntity ) ) | ( (lv_declarations_8_0= ruleMegalRelationship ) ) | ( (lv_declarations_9_0= ruleMegalPair ) ) | ( (lv_bindings_10_0= ruleMegalLink ) ) )* ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:80:1: ( ( (lv_annotations_0_0= ruleMegalAnnotation ) )* otherlv_1= 'model' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'import' ( (otherlv_4= RULE_ID ) ) ) | ( (lv_declarations_5_0= ruleMegalEntityType ) ) | ( (lv_declarations_6_0= ruleMegalRelationshipType ) ) | ( (lv_declarations_7_0= ruleMegalEntity ) ) | ( (lv_declarations_8_0= ruleMegalRelationship ) ) | ( (lv_declarations_9_0= ruleMegalPair ) ) | ( (lv_bindings_10_0= ruleMegalLink ) ) )* )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:80:1: ( ( (lv_annotations_0_0= ruleMegalAnnotation ) )* otherlv_1= 'model' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'import' ( (otherlv_4= RULE_ID ) ) ) | ( (lv_declarations_5_0= ruleMegalEntityType ) ) | ( (lv_declarations_6_0= ruleMegalRelationshipType ) ) | ( (lv_declarations_7_0= ruleMegalEntity ) ) | ( (lv_declarations_8_0= ruleMegalRelationship ) ) | ( (lv_declarations_9_0= ruleMegalPair ) ) | ( (lv_bindings_10_0= ruleMegalLink ) ) )* )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:80:2: ( (lv_annotations_0_0= ruleMegalAnnotation ) )* otherlv_1= 'model' ( (lv_name_2_0= RULE_ID ) ) ( (otherlv_3= 'import' ( (otherlv_4= RULE_ID ) ) ) | ( (lv_declarations_5_0= ruleMegalEntityType ) ) | ( (lv_declarations_6_0= ruleMegalRelationshipType ) ) | ( (lv_declarations_7_0= ruleMegalEntity ) ) | ( (lv_declarations_8_0= ruleMegalRelationship ) ) | ( (lv_declarations_9_0= ruleMegalPair ) ) | ( (lv_bindings_10_0= ruleMegalLink ) ) )*
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:80:2: ( (lv_annotations_0_0= ruleMegalAnnotation ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==10) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:81:1: (lv_annotations_0_0= ruleMegalAnnotation )
            	    {
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:81:1: (lv_annotations_0_0= ruleMegalAnnotation )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:82:3: lv_annotations_0_0= ruleMegalAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegalFileAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMegalAnnotation_in_ruleMegalFile131);
            	    lv_annotations_0_0=ruleMegalAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegalFileRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotations",
            	            		lv_annotations_0_0, 
            	            		"MegalAnnotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_1=(Token)match(input,8,FollowSets000.FOLLOW_8_in_ruleMegalFile144); 

                	newLeafNode(otherlv_1, grammarAccess.getMegalFileAccess().getModelKeyword_1());
                
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:102:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:103:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:103:1: (lv_name_2_0= RULE_ID )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:104:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMegalFile161); 

            			newLeafNode(lv_name_2_0, grammarAccess.getMegalFileAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMegalFileRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:120:2: ( (otherlv_3= 'import' ( (otherlv_4= RULE_ID ) ) ) | ( (lv_declarations_5_0= ruleMegalEntityType ) ) | ( (lv_declarations_6_0= ruleMegalRelationshipType ) ) | ( (lv_declarations_7_0= ruleMegalEntity ) ) | ( (lv_declarations_8_0= ruleMegalRelationship ) ) | ( (lv_declarations_9_0= ruleMegalPair ) ) | ( (lv_bindings_10_0= ruleMegalLink ) ) )*
            loop2:
            do {
                int alt2=8;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:120:3: (otherlv_3= 'import' ( (otherlv_4= RULE_ID ) ) )
            	    {
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:120:3: (otherlv_3= 'import' ( (otherlv_4= RULE_ID ) ) )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:120:5: otherlv_3= 'import' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,9,FollowSets000.FOLLOW_9_in_ruleMegalFile180); 

            	        	newLeafNode(otherlv_3, grammarAccess.getMegalFileAccess().getImportKeyword_3_0_0());
            	        
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:124:1: ( (otherlv_4= RULE_ID ) )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:125:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:125:1: (otherlv_4= RULE_ID )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:126:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMegalFileRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMegalFile200); 

            	    		newLeafNode(otherlv_4, grammarAccess.getMegalFileAccess().getImportsMegalFileCrossReference_3_0_1_0()); 
            	    	

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:138:6: ( (lv_declarations_5_0= ruleMegalEntityType ) )
            	    {
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:138:6: ( (lv_declarations_5_0= ruleMegalEntityType ) )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:139:1: (lv_declarations_5_0= ruleMegalEntityType )
            	    {
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:139:1: (lv_declarations_5_0= ruleMegalEntityType )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:140:3: lv_declarations_5_0= ruleMegalEntityType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegalFileAccess().getDeclarationsMegalEntityTypeParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMegalEntityType_in_ruleMegalFile228);
            	    lv_declarations_5_0=ruleMegalEntityType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegalFileRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declarations",
            	            		lv_declarations_5_0, 
            	            		"MegalEntityType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:157:6: ( (lv_declarations_6_0= ruleMegalRelationshipType ) )
            	    {
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:157:6: ( (lv_declarations_6_0= ruleMegalRelationshipType ) )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:158:1: (lv_declarations_6_0= ruleMegalRelationshipType )
            	    {
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:158:1: (lv_declarations_6_0= ruleMegalRelationshipType )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:159:3: lv_declarations_6_0= ruleMegalRelationshipType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegalFileAccess().getDeclarationsMegalRelationshipTypeParserRuleCall_3_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMegalRelationshipType_in_ruleMegalFile255);
            	    lv_declarations_6_0=ruleMegalRelationshipType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegalFileRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declarations",
            	            		lv_declarations_6_0, 
            	            		"MegalRelationshipType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:176:6: ( (lv_declarations_7_0= ruleMegalEntity ) )
            	    {
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:176:6: ( (lv_declarations_7_0= ruleMegalEntity ) )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:177:1: (lv_declarations_7_0= ruleMegalEntity )
            	    {
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:177:1: (lv_declarations_7_0= ruleMegalEntity )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:178:3: lv_declarations_7_0= ruleMegalEntity
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegalFileAccess().getDeclarationsMegalEntityParserRuleCall_3_3_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMegalEntity_in_ruleMegalFile282);
            	    lv_declarations_7_0=ruleMegalEntity();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegalFileRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declarations",
            	            		lv_declarations_7_0, 
            	            		"MegalEntity");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:195:6: ( (lv_declarations_8_0= ruleMegalRelationship ) )
            	    {
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:195:6: ( (lv_declarations_8_0= ruleMegalRelationship ) )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:196:1: (lv_declarations_8_0= ruleMegalRelationship )
            	    {
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:196:1: (lv_declarations_8_0= ruleMegalRelationship )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:197:3: lv_declarations_8_0= ruleMegalRelationship
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegalFileAccess().getDeclarationsMegalRelationshipParserRuleCall_3_4_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMegalRelationship_in_ruleMegalFile309);
            	    lv_declarations_8_0=ruleMegalRelationship();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegalFileRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declarations",
            	            		lv_declarations_8_0, 
            	            		"MegalRelationship");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:214:6: ( (lv_declarations_9_0= ruleMegalPair ) )
            	    {
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:214:6: ( (lv_declarations_9_0= ruleMegalPair ) )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:215:1: (lv_declarations_9_0= ruleMegalPair )
            	    {
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:215:1: (lv_declarations_9_0= ruleMegalPair )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:216:3: lv_declarations_9_0= ruleMegalPair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegalFileAccess().getDeclarationsMegalPairParserRuleCall_3_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMegalPair_in_ruleMegalFile336);
            	    lv_declarations_9_0=ruleMegalPair();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegalFileRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"declarations",
            	            		lv_declarations_9_0, 
            	            		"MegalPair");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:233:6: ( (lv_bindings_10_0= ruleMegalLink ) )
            	    {
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:233:6: ( (lv_bindings_10_0= ruleMegalLink ) )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:234:1: (lv_bindings_10_0= ruleMegalLink )
            	    {
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:234:1: (lv_bindings_10_0= ruleMegalLink )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:235:3: lv_bindings_10_0= ruleMegalLink
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegalFileAccess().getBindingsMegalLinkParserRuleCall_3_6_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMegalLink_in_ruleMegalFile363);
            	    lv_bindings_10_0=ruleMegalLink();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegalFileRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"bindings",
            	            		lv_bindings_10_0, 
            	            		"MegalLink");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMegalFile"


    // $ANTLR start "entryRuleMegalAnnotation"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:259:1: entryRuleMegalAnnotation returns [EObject current=null] : iv_ruleMegalAnnotation= ruleMegalAnnotation EOF ;
    public final EObject entryRuleMegalAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMegalAnnotation = null;


        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:260:2: (iv_ruleMegalAnnotation= ruleMegalAnnotation EOF )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:261:2: iv_ruleMegalAnnotation= ruleMegalAnnotation EOF
            {
             newCompositeNode(grammarAccess.getMegalAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMegalAnnotation_in_entryRuleMegalAnnotation401);
            iv_ruleMegalAnnotation=ruleMegalAnnotation();

            state._fsp--;

             current =iv_ruleMegalAnnotation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMegalAnnotation411); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMegalAnnotation"


    // $ANTLR start "ruleMegalAnnotation"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:268:1: ruleMegalAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_key_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleMegalAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_key_1_0=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:271:28: ( (otherlv_0= '@' ( (lv_key_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) )? ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:272:1: (otherlv_0= '@' ( (lv_key_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) )? )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:272:1: (otherlv_0= '@' ( (lv_key_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) )? )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:272:3: otherlv_0= '@' ( (lv_key_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) )?
            {
            otherlv_0=(Token)match(input,10,FollowSets000.FOLLOW_10_in_ruleMegalAnnotation448); 

                	newLeafNode(otherlv_0, grammarAccess.getMegalAnnotationAccess().getCommercialAtKeyword_0());
                
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:276:1: ( (lv_key_1_0= RULE_ID ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:277:1: (lv_key_1_0= RULE_ID )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:277:1: (lv_key_1_0= RULE_ID )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:278:3: lv_key_1_0= RULE_ID
            {
            lv_key_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMegalAnnotation465); 

            			newLeafNode(lv_key_1_0, grammarAccess.getMegalAnnotationAccess().getKeyIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMegalAnnotationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"key",
                    		lv_key_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:294:2: ( (lv_value_2_0= RULE_STRING ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:295:1: (lv_value_2_0= RULE_STRING )
                    {
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:295:1: (lv_value_2_0= RULE_STRING )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:296:3: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleMegalAnnotation487); 

                    			newLeafNode(lv_value_2_0, grammarAccess.getMegalAnnotationAccess().getValueSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMegalAnnotationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"STRING");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMegalAnnotation"


    // $ANTLR start "entryRuleMegalLink"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:320:1: entryRuleMegalLink returns [EObject current=null] : iv_ruleMegalLink= ruleMegalLink EOF ;
    public final EObject entryRuleMegalLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMegalLink = null;


        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:321:2: (iv_ruleMegalLink= ruleMegalLink EOF )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:322:2: iv_ruleMegalLink= ruleMegalLink EOF
            {
             newCompositeNode(grammarAccess.getMegalLinkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMegalLink_in_entryRuleMegalLink529);
            iv_ruleMegalLink=ruleMegalLink();

            state._fsp--;

             current =iv_ruleMegalLink; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMegalLink539); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMegalLink"


    // $ANTLR start "ruleMegalLink"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:329:1: ruleMegalLink returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleMegalAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' otherlv_5= '|->' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '=' ( (lv_to_8_0= RULE_STRING ) ) ) ;
    public final EObject ruleMegalLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_to_8_0=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:332:28: ( ( ( (lv_annotations_0_0= ruleMegalAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' otherlv_5= '|->' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '=' ( (lv_to_8_0= RULE_STRING ) ) ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:333:1: ( ( (lv_annotations_0_0= ruleMegalAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' otherlv_5= '|->' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '=' ( (lv_to_8_0= RULE_STRING ) ) )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:333:1: ( ( (lv_annotations_0_0= ruleMegalAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' otherlv_5= '|->' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '=' ( (lv_to_8_0= RULE_STRING ) ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:333:2: ( (lv_annotations_0_0= ruleMegalAnnotation ) )* ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' otherlv_5= '|->' ( (otherlv_6= RULE_ID ) ) )? otherlv_7= '=' ( (lv_to_8_0= RULE_STRING ) )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:333:2: ( (lv_annotations_0_0= ruleMegalAnnotation ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==10) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:334:1: (lv_annotations_0_0= ruleMegalAnnotation )
            	    {
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:334:1: (lv_annotations_0_0= ruleMegalAnnotation )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:335:3: lv_annotations_0_0= ruleMegalAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegalLinkAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMegalAnnotation_in_ruleMegalLink585);
            	    lv_annotations_0_0=ruleMegalAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegalLinkRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotations",
            	            		lv_annotations_0_0, 
            	            		"MegalAnnotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:351:3: ( (otherlv_1= RULE_ID ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:352:1: (otherlv_1= RULE_ID )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:352:1: (otherlv_1= RULE_ID )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:353:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMegalLinkRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMegalLink606); 

            		newLeafNode(otherlv_1, grammarAccess.getMegalLinkAccess().getLinkMegalEntityCrossReference_1_0()); 
            	

            }


            }

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:364:2: (otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' otherlv_5= '|->' ( (otherlv_6= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:364:4: otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' otherlv_5= '|->' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleMegalLink619); 

                        	newLeafNode(otherlv_2, grammarAccess.getMegalLinkAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:368:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:369:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:369:1: (otherlv_3= RULE_ID )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:370:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMegalLinkRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMegalLink639); 

                    		newLeafNode(otherlv_3, grammarAccess.getMegalLinkAccess().getFirstMegalEntityCrossReference_2_1_0()); 
                    	

                    }


                    }

                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMegalLink651); 

                        	newLeafNode(otherlv_4, grammarAccess.getMegalLinkAccess().getRightParenthesisKeyword_2_2());
                        
                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMegalLink663); 

                        	newLeafNode(otherlv_5, grammarAccess.getMegalLinkAccess().getVerticalLineHyphenMinusGreaterThanSignKeyword_2_3());
                        
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:389:1: ( (otherlv_6= RULE_ID ) )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:390:1: (otherlv_6= RULE_ID )
                    {
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:390:1: (otherlv_6= RULE_ID )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:391:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMegalLinkRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMegalLink683); 

                    		newLeafNode(otherlv_6, grammarAccess.getMegalLinkAccess().getSecondMegalEntityCrossReference_2_4_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMegalLink697); 

                	newLeafNode(otherlv_7, grammarAccess.getMegalLinkAccess().getEqualsSignKeyword_3());
                
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:406:1: ( (lv_to_8_0= RULE_STRING ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:407:1: (lv_to_8_0= RULE_STRING )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:407:1: (lv_to_8_0= RULE_STRING )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:408:3: lv_to_8_0= RULE_STRING
            {
            lv_to_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleMegalLink714); 

            			newLeafNode(lv_to_8_0, grammarAccess.getMegalLinkAccess().getToSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMegalLinkRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"to",
                    		lv_to_8_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMegalLink"


    // $ANTLR start "entryRuleMegalEntityType"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:432:1: entryRuleMegalEntityType returns [EObject current=null] : iv_ruleMegalEntityType= ruleMegalEntityType EOF ;
    public final EObject entryRuleMegalEntityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMegalEntityType = null;


        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:433:2: (iv_ruleMegalEntityType= ruleMegalEntityType EOF )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:434:2: iv_ruleMegalEntityType= ruleMegalEntityType EOF
            {
             newCompositeNode(grammarAccess.getMegalEntityTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMegalEntityType_in_entryRuleMegalEntityType755);
            iv_ruleMegalEntityType=ruleMegalEntityType();

            state._fsp--;

             current =iv_ruleMegalEntityType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMegalEntityType765); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMegalEntityType"


    // $ANTLR start "ruleMegalEntityType"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:441:1: ruleMegalEntityType returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleMegalAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '<' ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= 'as' otherlv_5= 'entity' ) ) ) ;
    public final EObject ruleMegalEntityType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:444:28: ( ( ( (lv_annotations_0_0= ruleMegalAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '<' ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= 'as' otherlv_5= 'entity' ) ) ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:445:1: ( ( (lv_annotations_0_0= ruleMegalAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '<' ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= 'as' otherlv_5= 'entity' ) ) )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:445:1: ( ( (lv_annotations_0_0= ruleMegalAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '<' ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= 'as' otherlv_5= 'entity' ) ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:445:2: ( (lv_annotations_0_0= ruleMegalAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '<' ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= 'as' otherlv_5= 'entity' ) )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:445:2: ( (lv_annotations_0_0= ruleMegalAnnotation ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==10) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:446:1: (lv_annotations_0_0= ruleMegalAnnotation )
            	    {
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:446:1: (lv_annotations_0_0= ruleMegalAnnotation )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:447:3: lv_annotations_0_0= ruleMegalAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegalEntityTypeAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMegalAnnotation_in_ruleMegalEntityType811);
            	    lv_annotations_0_0=ruleMegalAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegalEntityTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotations",
            	            		lv_annotations_0_0, 
            	            		"MegalAnnotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:463:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:464:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:464:1: (lv_name_1_0= RULE_ID )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:465:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMegalEntityType829); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMegalEntityTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMegalEntityTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:481:2: ( (otherlv_2= '<' ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= 'as' otherlv_5= 'entity' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:481:3: (otherlv_2= '<' ( (otherlv_3= RULE_ID ) ) )
                    {
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:481:3: (otherlv_2= '<' ( (otherlv_3= RULE_ID ) ) )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:481:5: otherlv_2= '<' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMegalEntityType848); 

                        	newLeafNode(otherlv_2, grammarAccess.getMegalEntityTypeAccess().getLessThanSignKeyword_2_0_0());
                        
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:485:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:486:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:486:1: (otherlv_3= RULE_ID )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:487:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMegalEntityTypeRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMegalEntityType868); 

                    		newLeafNode(otherlv_3, grammarAccess.getMegalEntityTypeAccess().getSupertypeMegalEntityTypeCrossReference_2_0_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:499:6: (otherlv_4= 'as' otherlv_5= 'entity' )
                    {
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:499:6: (otherlv_4= 'as' otherlv_5= 'entity' )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:499:8: otherlv_4= 'as' otherlv_5= 'entity'
                    {
                    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMegalEntityType888); 

                        	newLeafNode(otherlv_4, grammarAccess.getMegalEntityTypeAccess().getAsKeyword_2_1_0());
                        
                    otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMegalEntityType900); 

                        	newLeafNode(otherlv_5, grammarAccess.getMegalEntityTypeAccess().getEntityKeyword_2_1_1());
                        

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMegalEntityType"


    // $ANTLR start "entryRuleMegalRelationshipType"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:515:1: entryRuleMegalRelationshipType returns [EObject current=null] : iv_ruleMegalRelationshipType= ruleMegalRelationshipType EOF ;
    public final EObject entryRuleMegalRelationshipType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMegalRelationshipType = null;


        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:516:2: (iv_ruleMegalRelationshipType= ruleMegalRelationshipType EOF )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:517:2: iv_ruleMegalRelationshipType= ruleMegalRelationshipType EOF
            {
             newCompositeNode(grammarAccess.getMegalRelationshipTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMegalRelationshipType_in_entryRuleMegalRelationshipType938);
            iv_ruleMegalRelationshipType=ruleMegalRelationshipType();

            state._fsp--;

             current =iv_ruleMegalRelationshipType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMegalRelationshipType948); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMegalRelationshipType"


    // $ANTLR start "ruleMegalRelationshipType"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:524:1: ruleMegalRelationshipType returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleMegalAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )? ( ( (lv_leftBoth_9_0= '(+)' ) ) | ( (lv_leftMany_10_0= '+' ) ) )? otherlv_11= '*' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (otherlv_14= RULE_ID ) ) (otherlv_15= '->' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ']' )? ( ( (lv_rightBoth_18_0= '(+)' ) ) | ( (lv_rightMany_19_0= '+' ) ) )? ) ;
    public final EObject ruleMegalRelationshipType() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_leftBoth_9_0=null;
        Token lv_leftMany_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_rightBoth_18_0=null;
        Token lv_rightMany_19_0=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:527:28: ( ( ( (lv_annotations_0_0= ruleMegalAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )? ( ( (lv_leftBoth_9_0= '(+)' ) ) | ( (lv_leftMany_10_0= '+' ) ) )? otherlv_11= '*' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (otherlv_14= RULE_ID ) ) (otherlv_15= '->' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ']' )? ( ( (lv_rightBoth_18_0= '(+)' ) ) | ( (lv_rightMany_19_0= '+' ) ) )? ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:528:1: ( ( (lv_annotations_0_0= ruleMegalAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )? ( ( (lv_leftBoth_9_0= '(+)' ) ) | ( (lv_leftMany_10_0= '+' ) ) )? otherlv_11= '*' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (otherlv_14= RULE_ID ) ) (otherlv_15= '->' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ']' )? ( ( (lv_rightBoth_18_0= '(+)' ) ) | ( (lv_rightMany_19_0= '+' ) ) )? )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:528:1: ( ( (lv_annotations_0_0= ruleMegalAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )? ( ( (lv_leftBoth_9_0= '(+)' ) ) | ( (lv_leftMany_10_0= '+' ) ) )? otherlv_11= '*' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (otherlv_14= RULE_ID ) ) (otherlv_15= '->' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ']' )? ( ( (lv_rightBoth_18_0= '(+)' ) ) | ( (lv_rightMany_19_0= '+' ) ) )? )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:528:2: ( (lv_annotations_0_0= ruleMegalAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '<' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )? ( ( (lv_leftBoth_9_0= '(+)' ) ) | ( (lv_leftMany_10_0= '+' ) ) )? otherlv_11= '*' ( (otherlv_12= RULE_ID ) ) (otherlv_13= '[' ( (otherlv_14= RULE_ID ) ) (otherlv_15= '->' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ']' )? ( ( (lv_rightBoth_18_0= '(+)' ) ) | ( (lv_rightMany_19_0= '+' ) ) )?
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:528:2: ( (lv_annotations_0_0= ruleMegalAnnotation ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==10) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:529:1: (lv_annotations_0_0= ruleMegalAnnotation )
            	    {
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:529:1: (lv_annotations_0_0= ruleMegalAnnotation )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:530:3: lv_annotations_0_0= ruleMegalAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegalRelationshipTypeAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMegalAnnotation_in_ruleMegalRelationshipType994);
            	    lv_annotations_0_0=ruleMegalAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegalRelationshipTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotations",
            	            		lv_annotations_0_0, 
            	            		"MegalAnnotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:546:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:547:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:547:1: (lv_name_1_0= RULE_ID )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:548:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMegalRelationshipType1012); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMegalRelationshipTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMegalRelationshipTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMegalRelationshipType1029); 

                	newLeafNode(otherlv_2, grammarAccess.getMegalRelationshipTypeAccess().getLessThanSignKeyword_2());
                
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:568:1: ( (otherlv_3= RULE_ID ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:569:1: (otherlv_3= RULE_ID )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:569:1: (otherlv_3= RULE_ID )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:570:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMegalRelationshipTypeRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMegalRelationshipType1049); 

            		newLeafNode(otherlv_3, grammarAccess.getMegalRelationshipTypeAccess().getLeftMegalEntityTypeCrossReference_3_0()); 
            	

            }


            }

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:581:2: (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:581:4: otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMegalRelationshipType1062); 

                        	newLeafNode(otherlv_4, grammarAccess.getMegalRelationshipTypeAccess().getLeftSquareBracketKeyword_4_0());
                        
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:585:1: ( (otherlv_5= RULE_ID ) )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:586:1: (otherlv_5= RULE_ID )
                    {
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:586:1: (otherlv_5= RULE_ID )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:587:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMegalRelationshipTypeRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMegalRelationshipType1082); 

                    		newLeafNode(otherlv_5, grammarAccess.getMegalRelationshipTypeAccess().getLeftParamsMegalEntityCrossReference_4_1_0()); 
                    	

                    }


                    }

                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:598:2: (otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==19) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:598:4: otherlv_6= '->' ( (otherlv_7= RULE_ID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMegalRelationshipType1095); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getMegalRelationshipTypeAccess().getHyphenMinusGreaterThanSignKeyword_4_2_0());
                    	        
                    	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:602:1: ( (otherlv_7= RULE_ID ) )
                    	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:603:1: (otherlv_7= RULE_ID )
                    	    {
                    	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:603:1: (otherlv_7= RULE_ID )
                    	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:604:3: otherlv_7= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getMegalRelationshipTypeRule());
                    	    	        }
                    	            
                    	    otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMegalRelationshipType1115); 

                    	    		newLeafNode(otherlv_7, grammarAccess.getMegalRelationshipTypeAccess().getLeftParamsMegalEntityCrossReference_4_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMegalRelationshipType1129); 

                        	newLeafNode(otherlv_8, grammarAccess.getMegalRelationshipTypeAccess().getRightSquareBracketKeyword_4_3());
                        

                    }
                    break;

            }

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:619:3: ( ( (lv_leftBoth_9_0= '(+)' ) ) | ( (lv_leftMany_10_0= '+' ) ) )?
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            else if ( (LA11_0==22) ) {
                alt11=2;
            }
            switch (alt11) {
                case 1 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:619:4: ( (lv_leftBoth_9_0= '(+)' ) )
                    {
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:619:4: ( (lv_leftBoth_9_0= '(+)' ) )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:620:1: (lv_leftBoth_9_0= '(+)' )
                    {
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:620:1: (lv_leftBoth_9_0= '(+)' )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:621:3: lv_leftBoth_9_0= '(+)'
                    {
                    lv_leftBoth_9_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMegalRelationshipType1150); 

                            newLeafNode(lv_leftBoth_9_0, grammarAccess.getMegalRelationshipTypeAccess().getLeftBothLeftParenthesisPlusSignRightParenthesisKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMegalRelationshipTypeRule());
                    	        }
                           		setWithLastConsumed(current, "leftBoth", true, "(+)");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:635:6: ( (lv_leftMany_10_0= '+' ) )
                    {
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:635:6: ( (lv_leftMany_10_0= '+' ) )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:636:1: (lv_leftMany_10_0= '+' )
                    {
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:636:1: (lv_leftMany_10_0= '+' )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:637:3: lv_leftMany_10_0= '+'
                    {
                    lv_leftMany_10_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMegalRelationshipType1187); 

                            newLeafNode(lv_leftMany_10_0, grammarAccess.getMegalRelationshipTypeAccess().getLeftManyPlusSignKeyword_5_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMegalRelationshipTypeRule());
                    	        }
                           		setWithLastConsumed(current, "leftMany", true, "+");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleMegalRelationshipType1214); 

                	newLeafNode(otherlv_11, grammarAccess.getMegalRelationshipTypeAccess().getAsteriskKeyword_6());
                
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:654:1: ( (otherlv_12= RULE_ID ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:655:1: (otherlv_12= RULE_ID )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:655:1: (otherlv_12= RULE_ID )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:656:3: otherlv_12= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMegalRelationshipTypeRule());
            	        }
                    
            otherlv_12=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMegalRelationshipType1234); 

            		newLeafNode(otherlv_12, grammarAccess.getMegalRelationshipTypeAccess().getRightMegalEntityTypeCrossReference_7_0()); 
            	

            }


            }

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:667:2: (otherlv_13= '[' ( (otherlv_14= RULE_ID ) ) (otherlv_15= '->' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ']' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:667:4: otherlv_13= '[' ( (otherlv_14= RULE_ID ) ) (otherlv_15= '->' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ']'
                    {
                    otherlv_13=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMegalRelationshipType1247); 

                        	newLeafNode(otherlv_13, grammarAccess.getMegalRelationshipTypeAccess().getLeftSquareBracketKeyword_8_0());
                        
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:671:1: ( (otherlv_14= RULE_ID ) )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:672:1: (otherlv_14= RULE_ID )
                    {
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:672:1: (otherlv_14= RULE_ID )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:673:3: otherlv_14= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMegalRelationshipTypeRule());
                    	        }
                            
                    otherlv_14=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMegalRelationshipType1267); 

                    		newLeafNode(otherlv_14, grammarAccess.getMegalRelationshipTypeAccess().getRightParamsMegalEntityCrossReference_8_1_0()); 
                    	

                    }


                    }

                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:684:2: (otherlv_15= '->' ( (otherlv_16= RULE_ID ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==19) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:684:4: otherlv_15= '->' ( (otherlv_16= RULE_ID ) )
                    	    {
                    	    otherlv_15=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMegalRelationshipType1280); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getMegalRelationshipTypeAccess().getHyphenMinusGreaterThanSignKeyword_8_2_0());
                    	        
                    	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:688:1: ( (otherlv_16= RULE_ID ) )
                    	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:689:1: (otherlv_16= RULE_ID )
                    	    {
                    	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:689:1: (otherlv_16= RULE_ID )
                    	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:690:3: otherlv_16= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getMegalRelationshipTypeRule());
                    	    	        }
                    	            
                    	    otherlv_16=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMegalRelationshipType1300); 

                    	    		newLeafNode(otherlv_16, grammarAccess.getMegalRelationshipTypeAccess().getRightParamsMegalEntityCrossReference_8_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMegalRelationshipType1314); 

                        	newLeafNode(otherlv_17, grammarAccess.getMegalRelationshipTypeAccess().getRightSquareBracketKeyword_8_3());
                        

                    }
                    break;

            }

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:705:3: ( ( (lv_rightBoth_18_0= '(+)' ) ) | ( (lv_rightMany_19_0= '+' ) ) )?
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            else if ( (LA14_0==22) ) {
                alt14=2;
            }
            switch (alt14) {
                case 1 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:705:4: ( (lv_rightBoth_18_0= '(+)' ) )
                    {
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:705:4: ( (lv_rightBoth_18_0= '(+)' ) )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:706:1: (lv_rightBoth_18_0= '(+)' )
                    {
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:706:1: (lv_rightBoth_18_0= '(+)' )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:707:3: lv_rightBoth_18_0= '(+)'
                    {
                    lv_rightBoth_18_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleMegalRelationshipType1335); 

                            newLeafNode(lv_rightBoth_18_0, grammarAccess.getMegalRelationshipTypeAccess().getRightBothLeftParenthesisPlusSignRightParenthesisKeyword_9_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMegalRelationshipTypeRule());
                    	        }
                           		setWithLastConsumed(current, "rightBoth", true, "(+)");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:721:6: ( (lv_rightMany_19_0= '+' ) )
                    {
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:721:6: ( (lv_rightMany_19_0= '+' ) )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:722:1: (lv_rightMany_19_0= '+' )
                    {
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:722:1: (lv_rightMany_19_0= '+' )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:723:3: lv_rightMany_19_0= '+'
                    {
                    lv_rightMany_19_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMegalRelationshipType1372); 

                            newLeafNode(lv_rightMany_19_0, grammarAccess.getMegalRelationshipTypeAccess().getRightManyPlusSignKeyword_9_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMegalRelationshipTypeRule());
                    	        }
                           		setWithLastConsumed(current, "rightMany", true, "+");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMegalRelationshipType"


    // $ANTLR start "entryRuleMegalEntity"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:744:1: entryRuleMegalEntity returns [EObject current=null] : iv_ruleMegalEntity= ruleMegalEntity EOF ;
    public final EObject entryRuleMegalEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMegalEntity = null;


        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:745:2: (iv_ruleMegalEntity= ruleMegalEntity EOF )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:746:2: iv_ruleMegalEntity= ruleMegalEntity EOF
            {
             newCompositeNode(grammarAccess.getMegalEntityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMegalEntity_in_entryRuleMegalEntity1423);
            iv_ruleMegalEntity=ruleMegalEntity();

            state._fsp--;

             current =iv_ruleMegalEntity; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMegalEntity1433); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMegalEntity"


    // $ANTLR start "ruleMegalEntity"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:753:1: ruleMegalEntity returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleMegalAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )? ( (lv_many_9_0= '+' ) )? ) ;
    public final EObject ruleMegalEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_many_9_0=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:756:28: ( ( ( (lv_annotations_0_0= ruleMegalAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )? ( (lv_many_9_0= '+' ) )? ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:757:1: ( ( (lv_annotations_0_0= ruleMegalAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )? ( (lv_many_9_0= '+' ) )? )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:757:1: ( ( (lv_annotations_0_0= ruleMegalAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )? ( (lv_many_9_0= '+' ) )? )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:757:2: ( (lv_annotations_0_0= ruleMegalAnnotation ) )* ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )? ( (lv_many_9_0= '+' ) )?
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:757:2: ( (lv_annotations_0_0= ruleMegalAnnotation ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==10) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:758:1: (lv_annotations_0_0= ruleMegalAnnotation )
            	    {
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:758:1: (lv_annotations_0_0= ruleMegalAnnotation )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:759:3: lv_annotations_0_0= ruleMegalAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegalEntityAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMegalAnnotation_in_ruleMegalEntity1479);
            	    lv_annotations_0_0=ruleMegalAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegalEntityRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotations",
            	            		lv_annotations_0_0, 
            	            		"MegalAnnotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:775:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:776:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:776:1: (lv_name_1_0= RULE_ID )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:777:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMegalEntity1497); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMegalEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMegalEntityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleMegalEntity1514); 

                	newLeafNode(otherlv_2, grammarAccess.getMegalEntityAccess().getColonKeyword_2());
                
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:797:1: ( (otherlv_3= RULE_ID ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:798:1: (otherlv_3= RULE_ID )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:798:1: (otherlv_3= RULE_ID )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:799:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMegalEntityRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMegalEntity1534); 

            		newLeafNode(otherlv_3, grammarAccess.getMegalEntityAccess().getTypeMegalEntityTypeCrossReference_3_0()); 
            	

            }


            }

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:810:2: (otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==18) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:810:4: otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMegalEntity1547); 

                        	newLeafNode(otherlv_4, grammarAccess.getMegalEntityAccess().getLeftSquareBracketKeyword_4_0());
                        
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:814:1: ( (otherlv_5= RULE_ID ) )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:815:1: (otherlv_5= RULE_ID )
                    {
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:815:1: (otherlv_5= RULE_ID )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:816:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMegalEntityRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMegalEntity1567); 

                    		newLeafNode(otherlv_5, grammarAccess.getMegalEntityAccess().getParamsMegalEntityCrossReference_4_1_0()); 
                    	

                    }


                    }

                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:827:2: (otherlv_6= '->' ( (otherlv_7= RULE_ID ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==19) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:827:4: otherlv_6= '->' ( (otherlv_7= RULE_ID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleMegalEntity1580); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getMegalEntityAccess().getHyphenMinusGreaterThanSignKeyword_4_2_0());
                    	        
                    	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:831:1: ( (otherlv_7= RULE_ID ) )
                    	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:832:1: (otherlv_7= RULE_ID )
                    	    {
                    	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:832:1: (otherlv_7= RULE_ID )
                    	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:833:3: otherlv_7= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getMegalEntityRule());
                    	    	        }
                    	            
                    	    otherlv_7=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMegalEntity1600); 

                    	    		newLeafNode(otherlv_7, grammarAccess.getMegalEntityAccess().getParamsMegalEntityCrossReference_4_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMegalEntity1614); 

                        	newLeafNode(otherlv_8, grammarAccess.getMegalEntityAccess().getRightSquareBracketKeyword_4_3());
                        

                    }
                    break;

            }

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:848:3: ( (lv_many_9_0= '+' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:849:1: (lv_many_9_0= '+' )
                    {
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:849:1: (lv_many_9_0= '+' )
                    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:850:3: lv_many_9_0= '+'
                    {
                    lv_many_9_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleMegalEntity1634); 

                            newLeafNode(lv_many_9_0, grammarAccess.getMegalEntityAccess().getManyPlusSignKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMegalEntityRule());
                    	        }
                           		setWithLastConsumed(current, "many", true, "+");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMegalEntity"


    // $ANTLR start "entryRuleMegalRelationship"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:871:1: entryRuleMegalRelationship returns [EObject current=null] : iv_ruleMegalRelationship= ruleMegalRelationship EOF ;
    public final EObject entryRuleMegalRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMegalRelationship = null;


        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:872:2: (iv_ruleMegalRelationship= ruleMegalRelationship EOF )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:873:2: iv_ruleMegalRelationship= ruleMegalRelationship EOF
            {
             newCompositeNode(grammarAccess.getMegalRelationshipRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMegalRelationship_in_entryRuleMegalRelationship1684);
            iv_ruleMegalRelationship=ruleMegalRelationship();

            state._fsp--;

             current =iv_ruleMegalRelationship; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMegalRelationship1694); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMegalRelationship"


    // $ANTLR start "ruleMegalRelationship"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:880:1: ruleMegalRelationship returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleMegalAnnotation ) )* ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleMegalRelationship() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:883:28: ( ( ( (lv_annotations_0_0= ruleMegalAnnotation ) )* ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:884:1: ( ( (lv_annotations_0_0= ruleMegalAnnotation ) )* ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:884:1: ( ( (lv_annotations_0_0= ruleMegalAnnotation ) )* ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:884:2: ( (lv_annotations_0_0= ruleMegalAnnotation ) )* ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ( (otherlv_3= RULE_ID ) )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:884:2: ( (lv_annotations_0_0= ruleMegalAnnotation ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==10) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:885:1: (lv_annotations_0_0= ruleMegalAnnotation )
            	    {
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:885:1: (lv_annotations_0_0= ruleMegalAnnotation )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:886:3: lv_annotations_0_0= ruleMegalAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegalRelationshipAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMegalAnnotation_in_ruleMegalRelationship1740);
            	    lv_annotations_0_0=ruleMegalAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegalRelationshipRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotations",
            	            		lv_annotations_0_0, 
            	            		"MegalAnnotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:902:3: ( (otherlv_1= RULE_ID ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:903:1: (otherlv_1= RULE_ID )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:903:1: (otherlv_1= RULE_ID )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:904:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMegalRelationshipRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMegalRelationship1761); 

            		newLeafNode(otherlv_1, grammarAccess.getMegalRelationshipAccess().getLeftMegalEntityCrossReference_1_0()); 
            	

            }


            }

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:915:2: ( (otherlv_2= RULE_ID ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:916:1: (otherlv_2= RULE_ID )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:916:1: (otherlv_2= RULE_ID )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:917:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMegalRelationshipRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMegalRelationship1781); 

            		newLeafNode(otherlv_2, grammarAccess.getMegalRelationshipAccess().getTypeMegalRelationshipTypeCrossReference_2_0()); 
            	

            }


            }

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:928:2: ( (otherlv_3= RULE_ID ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:929:1: (otherlv_3= RULE_ID )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:929:1: (otherlv_3= RULE_ID )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:930:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMegalRelationshipRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMegalRelationship1801); 

            		newLeafNode(otherlv_3, grammarAccess.getMegalRelationshipAccess().getRightMegalEntityCrossReference_3_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMegalRelationship"


    // $ANTLR start "entryRuleMegalPair"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:949:1: entryRuleMegalPair returns [EObject current=null] : iv_ruleMegalPair= ruleMegalPair EOF ;
    public final EObject entryRuleMegalPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMegalPair = null;


        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:950:2: (iv_ruleMegalPair= ruleMegalPair EOF )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:951:2: iv_ruleMegalPair= ruleMegalPair EOF
            {
             newCompositeNode(grammarAccess.getMegalPairRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMegalPair_in_entryRuleMegalPair1837);
            iv_ruleMegalPair=ruleMegalPair();

            state._fsp--;

             current =iv_ruleMegalPair; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMegalPair1847); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMegalPair"


    // $ANTLR start "ruleMegalPair"
    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:958:1: ruleMegalPair returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleMegalAnnotation ) )* ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' otherlv_5= '|->' ( (otherlv_6= RULE_ID ) ) ) ;
    public final EObject ruleMegalPair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_annotations_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:961:28: ( ( ( (lv_annotations_0_0= ruleMegalAnnotation ) )* ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' otherlv_5= '|->' ( (otherlv_6= RULE_ID ) ) ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:962:1: ( ( (lv_annotations_0_0= ruleMegalAnnotation ) )* ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' otherlv_5= '|->' ( (otherlv_6= RULE_ID ) ) )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:962:1: ( ( (lv_annotations_0_0= ruleMegalAnnotation ) )* ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' otherlv_5= '|->' ( (otherlv_6= RULE_ID ) ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:962:2: ( (lv_annotations_0_0= ruleMegalAnnotation ) )* ( (otherlv_1= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' otherlv_5= '|->' ( (otherlv_6= RULE_ID ) )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:962:2: ( (lv_annotations_0_0= ruleMegalAnnotation ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==10) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:963:1: (lv_annotations_0_0= ruleMegalAnnotation )
            	    {
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:963:1: (lv_annotations_0_0= ruleMegalAnnotation )
            	    // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:964:3: lv_annotations_0_0= ruleMegalAnnotation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMegalPairAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMegalAnnotation_in_ruleMegalPair1893);
            	    lv_annotations_0_0=ruleMegalAnnotation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMegalPairRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"annotations",
            	            		lv_annotations_0_0, 
            	            		"MegalAnnotation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:980:3: ( (otherlv_1= RULE_ID ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:981:1: (otherlv_1= RULE_ID )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:981:1: (otherlv_1= RULE_ID )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:982:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMegalPairRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMegalPair1914); 

            		newLeafNode(otherlv_1, grammarAccess.getMegalPairAccess().getSetMegalEntityCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleMegalPair1926); 

                	newLeafNode(otherlv_2, grammarAccess.getMegalPairAccess().getLeftParenthesisKeyword_2());
                
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:997:1: ( (otherlv_3= RULE_ID ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:998:1: (otherlv_3= RULE_ID )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:998:1: (otherlv_3= RULE_ID )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:999:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMegalPairRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMegalPair1946); 

            		newLeafNode(otherlv_3, grammarAccess.getMegalPairAccess().getFirstMegalEntityCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMegalPair1958); 

                	newLeafNode(otherlv_4, grammarAccess.getMegalPairAccess().getRightParenthesisKeyword_4());
                
            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMegalPair1970); 

                	newLeafNode(otherlv_5, grammarAccess.getMegalPairAccess().getVerticalLineHyphenMinusGreaterThanSignKeyword_5());
                
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1018:1: ( (otherlv_6= RULE_ID ) )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1019:1: (otherlv_6= RULE_ID )
            {
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1019:1: (otherlv_6= RULE_ID )
            // ../org.softlang.megal.language/src-gen/org/softlang/megal/language/parser/antlr/internal/InternalMegal.g:1020:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMegalPairRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMegalPair1990); 

            		newLeafNode(otherlv_6, grammarAccess.getMegalPairAccess().getSecondMegalEntityCrossReference_6_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMegalPair"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String DFA2_eotS =
        "\24\uffff";
    static final String DFA2_eofS =
        "\1\1\14\uffff\1\12\4\uffff\1\23\1\uffff";
    static final String DFA2_minS =
        "\1\4\2\uffff\5\4\4\uffff\2\4\1\14\1\uffff\1\15\2\4\1\uffff";
    static final String DFA2_maxS =
        "\1\12\2\uffff\1\4\1\30\1\12\2\4\4\uffff\1\12\1\27\1\14\1\uffff\1\15\1\4\1\16\1\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\10\1\1\5\uffff\1\7\1\5\1\2\1\4\3\uffff\1\3\3\uffff\1\6";
    static final String DFA2_specialS =
        "\24\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\4\4\uffff\1\2\1\3",
            "",
            "",
            "\1\5",
            "\1\11\6\uffff\1\7\2\uffff\1\10\1\6\1\12\7\uffff\1\13",
            "\1\4\1\14\4\uffff\1\3",
            "\1\15",
            "\1\16",
            "",
            "",
            "",
            "",
            "\1\4\5\uffff\1\3",
            "\1\12\4\uffff\2\12\7\uffff\1\17\2\uffff\3\17",
            "\1\20",
            "",
            "\1\21",
            "\1\22",
            "\1\23\4\uffff\2\23\3\uffff\1\10",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "()* loopback of 120:2: ( (otherlv_3= 'import' ( (otherlv_4= RULE_ID ) ) ) | ( (lv_declarations_5_0= ruleMegalEntityType ) ) | ( (lv_declarations_6_0= ruleMegalRelationshipType ) ) | ( (lv_declarations_7_0= ruleMegalEntity ) ) | ( (lv_declarations_8_0= ruleMegalRelationship ) ) | ( (lv_declarations_9_0= ruleMegalPair ) ) | ( (lv_bindings_10_0= ruleMegalLink ) ) )*";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleMegalFile_in_entryRuleMegalFile75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMegalFile85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMegalAnnotation_in_ruleMegalFile131 = new BitSet(new long[]{0x0000000000000500L});
        public static final BitSet FOLLOW_8_in_ruleMegalFile144 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMegalFile161 = new BitSet(new long[]{0x0000000000000712L});
        public static final BitSet FOLLOW_9_in_ruleMegalFile180 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMegalFile200 = new BitSet(new long[]{0x0000000000000712L});
        public static final BitSet FOLLOW_ruleMegalEntityType_in_ruleMegalFile228 = new BitSet(new long[]{0x0000000000000712L});
        public static final BitSet FOLLOW_ruleMegalRelationshipType_in_ruleMegalFile255 = new BitSet(new long[]{0x0000000000000712L});
        public static final BitSet FOLLOW_ruleMegalEntity_in_ruleMegalFile282 = new BitSet(new long[]{0x0000000000000712L});
        public static final BitSet FOLLOW_ruleMegalRelationship_in_ruleMegalFile309 = new BitSet(new long[]{0x0000000000000712L});
        public static final BitSet FOLLOW_ruleMegalPair_in_ruleMegalFile336 = new BitSet(new long[]{0x0000000000000712L});
        public static final BitSet FOLLOW_ruleMegalLink_in_ruleMegalFile363 = new BitSet(new long[]{0x0000000000000712L});
        public static final BitSet FOLLOW_ruleMegalAnnotation_in_entryRuleMegalAnnotation401 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMegalAnnotation411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_10_in_ruleMegalAnnotation448 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMegalAnnotation465 = new BitSet(new long[]{0x0000000000000022L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleMegalAnnotation487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMegalLink_in_entryRuleMegalLink529 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMegalLink539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMegalAnnotation_in_ruleMegalLink585 = new BitSet(new long[]{0x0000000000000510L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMegalLink606 = new BitSet(new long[]{0x0000000000004800L});
        public static final BitSet FOLLOW_11_in_ruleMegalLink619 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMegalLink639 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMegalLink651 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMegalLink663 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMegalLink683 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleMegalLink697 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleMegalLink714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMegalEntityType_in_entryRuleMegalEntityType755 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMegalEntityType765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMegalAnnotation_in_ruleMegalEntityType811 = new BitSet(new long[]{0x0000000000000510L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMegalEntityType829 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleMegalEntityType848 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMegalEntityType868 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleMegalEntityType888 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMegalEntityType900 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMegalRelationshipType_in_entryRuleMegalRelationshipType938 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMegalRelationshipType948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMegalAnnotation_in_ruleMegalRelationshipType994 = new BitSet(new long[]{0x0000000000000510L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMegalRelationshipType1012 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleMegalRelationshipType1029 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMegalRelationshipType1049 = new BitSet(new long[]{0x0000000000E40000L});
        public static final BitSet FOLLOW_18_in_ruleMegalRelationshipType1062 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMegalRelationshipType1082 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleMegalRelationshipType1095 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMegalRelationshipType1115 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleMegalRelationshipType1129 = new BitSet(new long[]{0x0000000000E00000L});
        public static final BitSet FOLLOW_21_in_ruleMegalRelationshipType1150 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_22_in_ruleMegalRelationshipType1187 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleMegalRelationshipType1214 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMegalRelationshipType1234 = new BitSet(new long[]{0x0000000000640002L});
        public static final BitSet FOLLOW_18_in_ruleMegalRelationshipType1247 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMegalRelationshipType1267 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleMegalRelationshipType1280 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMegalRelationshipType1300 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleMegalRelationshipType1314 = new BitSet(new long[]{0x0000000000600002L});
        public static final BitSet FOLLOW_21_in_ruleMegalRelationshipType1335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleMegalRelationshipType1372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMegalEntity_in_entryRuleMegalEntity1423 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMegalEntity1433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMegalAnnotation_in_ruleMegalEntity1479 = new BitSet(new long[]{0x0000000000000510L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMegalEntity1497 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleMegalEntity1514 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMegalEntity1534 = new BitSet(new long[]{0x0000000000440002L});
        public static final BitSet FOLLOW_18_in_ruleMegalEntity1547 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMegalEntity1567 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_19_in_ruleMegalEntity1580 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMegalEntity1600 = new BitSet(new long[]{0x0000000000180000L});
        public static final BitSet FOLLOW_20_in_ruleMegalEntity1614 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_22_in_ruleMegalEntity1634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMegalRelationship_in_entryRuleMegalRelationship1684 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMegalRelationship1694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMegalAnnotation_in_ruleMegalRelationship1740 = new BitSet(new long[]{0x0000000000000510L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMegalRelationship1761 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMegalRelationship1781 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMegalRelationship1801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMegalPair_in_entryRuleMegalPair1837 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMegalPair1847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMegalAnnotation_in_ruleMegalPair1893 = new BitSet(new long[]{0x0000000000000510L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMegalPair1914 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleMegalPair1926 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMegalPair1946 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMegalPair1958 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMegalPair1970 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMegalPair1990 = new BitSet(new long[]{0x0000000000000002L});
    }


}