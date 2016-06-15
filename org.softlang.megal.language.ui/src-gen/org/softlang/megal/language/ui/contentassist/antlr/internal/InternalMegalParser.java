package org.softlang.megal.language.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.softlang.megal.language.services.MegalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMegalParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_COMMENT", "RULE_WS", "'model'", "'import'", "'@'", "'='", "'('", "')'", "'|->'", "'<'", "'as'", "'entity'", "'*'", "'['", "']'", "'->'", "':'", "'(+)'", "'+'"
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
    public String getGrammarFileName() { return "../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g"; }


     
     	private MegalGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MegalGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleMegalFile"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:60:1: entryRuleMegalFile : ruleMegalFile EOF ;
    public final void entryRuleMegalFile() throws RecognitionException {
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:61:1: ( ruleMegalFile EOF )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:62:1: ruleMegalFile EOF
            {
             before(grammarAccess.getMegalFileRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMegalFile_in_entryRuleMegalFile61);
            ruleMegalFile();

            state._fsp--;

             after(grammarAccess.getMegalFileRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMegalFile68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMegalFile"


    // $ANTLR start "ruleMegalFile"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:69:1: ruleMegalFile : ( ( rule__MegalFile__Group__0 ) ) ;
    public final void ruleMegalFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:73:2: ( ( ( rule__MegalFile__Group__0 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:74:1: ( ( rule__MegalFile__Group__0 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:74:1: ( ( rule__MegalFile__Group__0 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:75:1: ( rule__MegalFile__Group__0 )
            {
             before(grammarAccess.getMegalFileAccess().getGroup()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:76:1: ( rule__MegalFile__Group__0 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:76:2: rule__MegalFile__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalFile__Group__0_in_ruleMegalFile94);
            rule__MegalFile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMegalFileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMegalFile"


    // $ANTLR start "entryRuleMegalAnnotation"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:88:1: entryRuleMegalAnnotation : ruleMegalAnnotation EOF ;
    public final void entryRuleMegalAnnotation() throws RecognitionException {
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:89:1: ( ruleMegalAnnotation EOF )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:90:1: ruleMegalAnnotation EOF
            {
             before(grammarAccess.getMegalAnnotationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMegalAnnotation_in_entryRuleMegalAnnotation121);
            ruleMegalAnnotation();

            state._fsp--;

             after(grammarAccess.getMegalAnnotationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMegalAnnotation128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMegalAnnotation"


    // $ANTLR start "ruleMegalAnnotation"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:97:1: ruleMegalAnnotation : ( ( rule__MegalAnnotation__Group__0 ) ) ;
    public final void ruleMegalAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:101:2: ( ( ( rule__MegalAnnotation__Group__0 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:102:1: ( ( rule__MegalAnnotation__Group__0 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:102:1: ( ( rule__MegalAnnotation__Group__0 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:103:1: ( rule__MegalAnnotation__Group__0 )
            {
             before(grammarAccess.getMegalAnnotationAccess().getGroup()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:104:1: ( rule__MegalAnnotation__Group__0 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:104:2: rule__MegalAnnotation__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalAnnotation__Group__0_in_ruleMegalAnnotation154);
            rule__MegalAnnotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMegalAnnotationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMegalAnnotation"


    // $ANTLR start "entryRuleMegalLink"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:116:1: entryRuleMegalLink : ruleMegalLink EOF ;
    public final void entryRuleMegalLink() throws RecognitionException {
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:117:1: ( ruleMegalLink EOF )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:118:1: ruleMegalLink EOF
            {
             before(grammarAccess.getMegalLinkRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMegalLink_in_entryRuleMegalLink181);
            ruleMegalLink();

            state._fsp--;

             after(grammarAccess.getMegalLinkRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMegalLink188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMegalLink"


    // $ANTLR start "ruleMegalLink"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:125:1: ruleMegalLink : ( ( rule__MegalLink__Group__0 ) ) ;
    public final void ruleMegalLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:129:2: ( ( ( rule__MegalLink__Group__0 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:130:1: ( ( rule__MegalLink__Group__0 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:130:1: ( ( rule__MegalLink__Group__0 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:131:1: ( rule__MegalLink__Group__0 )
            {
             before(grammarAccess.getMegalLinkAccess().getGroup()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:132:1: ( rule__MegalLink__Group__0 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:132:2: rule__MegalLink__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalLink__Group__0_in_ruleMegalLink214);
            rule__MegalLink__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMegalLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMegalLink"


    // $ANTLR start "entryRuleMegalEntityType"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:144:1: entryRuleMegalEntityType : ruleMegalEntityType EOF ;
    public final void entryRuleMegalEntityType() throws RecognitionException {
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:145:1: ( ruleMegalEntityType EOF )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:146:1: ruleMegalEntityType EOF
            {
             before(grammarAccess.getMegalEntityTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMegalEntityType_in_entryRuleMegalEntityType241);
            ruleMegalEntityType();

            state._fsp--;

             after(grammarAccess.getMegalEntityTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMegalEntityType248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMegalEntityType"


    // $ANTLR start "ruleMegalEntityType"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:153:1: ruleMegalEntityType : ( ( rule__MegalEntityType__Group__0 ) ) ;
    public final void ruleMegalEntityType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:157:2: ( ( ( rule__MegalEntityType__Group__0 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:158:1: ( ( rule__MegalEntityType__Group__0 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:158:1: ( ( rule__MegalEntityType__Group__0 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:159:1: ( rule__MegalEntityType__Group__0 )
            {
             before(grammarAccess.getMegalEntityTypeAccess().getGroup()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:160:1: ( rule__MegalEntityType__Group__0 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:160:2: rule__MegalEntityType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalEntityType__Group__0_in_ruleMegalEntityType274);
            rule__MegalEntityType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMegalEntityTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMegalEntityType"


    // $ANTLR start "entryRuleMegalRelationshipType"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:172:1: entryRuleMegalRelationshipType : ruleMegalRelationshipType EOF ;
    public final void entryRuleMegalRelationshipType() throws RecognitionException {
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:173:1: ( ruleMegalRelationshipType EOF )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:174:1: ruleMegalRelationshipType EOF
            {
             before(grammarAccess.getMegalRelationshipTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMegalRelationshipType_in_entryRuleMegalRelationshipType301);
            ruleMegalRelationshipType();

            state._fsp--;

             after(grammarAccess.getMegalRelationshipTypeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMegalRelationshipType308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMegalRelationshipType"


    // $ANTLR start "ruleMegalRelationshipType"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:181:1: ruleMegalRelationshipType : ( ( rule__MegalRelationshipType__Group__0 ) ) ;
    public final void ruleMegalRelationshipType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:185:2: ( ( ( rule__MegalRelationshipType__Group__0 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:186:1: ( ( rule__MegalRelationshipType__Group__0 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:186:1: ( ( rule__MegalRelationshipType__Group__0 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:187:1: ( rule__MegalRelationshipType__Group__0 )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getGroup()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:188:1: ( rule__MegalRelationshipType__Group__0 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:188:2: rule__MegalRelationshipType__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group__0_in_ruleMegalRelationshipType334);
            rule__MegalRelationshipType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMegalRelationshipType"


    // $ANTLR start "entryRuleMegalEntity"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:200:1: entryRuleMegalEntity : ruleMegalEntity EOF ;
    public final void entryRuleMegalEntity() throws RecognitionException {
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:201:1: ( ruleMegalEntity EOF )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:202:1: ruleMegalEntity EOF
            {
             before(grammarAccess.getMegalEntityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMegalEntity_in_entryRuleMegalEntity361);
            ruleMegalEntity();

            state._fsp--;

             after(grammarAccess.getMegalEntityRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMegalEntity368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMegalEntity"


    // $ANTLR start "ruleMegalEntity"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:209:1: ruleMegalEntity : ( ( rule__MegalEntity__Group__0 ) ) ;
    public final void ruleMegalEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:213:2: ( ( ( rule__MegalEntity__Group__0 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:214:1: ( ( rule__MegalEntity__Group__0 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:214:1: ( ( rule__MegalEntity__Group__0 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:215:1: ( rule__MegalEntity__Group__0 )
            {
             before(grammarAccess.getMegalEntityAccess().getGroup()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:216:1: ( rule__MegalEntity__Group__0 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:216:2: rule__MegalEntity__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalEntity__Group__0_in_ruleMegalEntity394);
            rule__MegalEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMegalEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMegalEntity"


    // $ANTLR start "entryRuleMegalRelationship"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:228:1: entryRuleMegalRelationship : ruleMegalRelationship EOF ;
    public final void entryRuleMegalRelationship() throws RecognitionException {
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:229:1: ( ruleMegalRelationship EOF )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:230:1: ruleMegalRelationship EOF
            {
             before(grammarAccess.getMegalRelationshipRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMegalRelationship_in_entryRuleMegalRelationship421);
            ruleMegalRelationship();

            state._fsp--;

             after(grammarAccess.getMegalRelationshipRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMegalRelationship428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMegalRelationship"


    // $ANTLR start "ruleMegalRelationship"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:237:1: ruleMegalRelationship : ( ( rule__MegalRelationship__Group__0 ) ) ;
    public final void ruleMegalRelationship() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:241:2: ( ( ( rule__MegalRelationship__Group__0 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:242:1: ( ( rule__MegalRelationship__Group__0 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:242:1: ( ( rule__MegalRelationship__Group__0 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:243:1: ( rule__MegalRelationship__Group__0 )
            {
             before(grammarAccess.getMegalRelationshipAccess().getGroup()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:244:1: ( rule__MegalRelationship__Group__0 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:244:2: rule__MegalRelationship__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationship__Group__0_in_ruleMegalRelationship454);
            rule__MegalRelationship__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMegalRelationshipAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMegalRelationship"


    // $ANTLR start "entryRuleMegalPair"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:256:1: entryRuleMegalPair : ruleMegalPair EOF ;
    public final void entryRuleMegalPair() throws RecognitionException {
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:257:1: ( ruleMegalPair EOF )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:258:1: ruleMegalPair EOF
            {
             before(grammarAccess.getMegalPairRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMegalPair_in_entryRuleMegalPair481);
            ruleMegalPair();

            state._fsp--;

             after(grammarAccess.getMegalPairRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMegalPair488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMegalPair"


    // $ANTLR start "ruleMegalPair"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:265:1: ruleMegalPair : ( ( rule__MegalPair__Group__0 ) ) ;
    public final void ruleMegalPair() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:269:2: ( ( ( rule__MegalPair__Group__0 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:270:1: ( ( rule__MegalPair__Group__0 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:270:1: ( ( rule__MegalPair__Group__0 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:271:1: ( rule__MegalPair__Group__0 )
            {
             before(grammarAccess.getMegalPairAccess().getGroup()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:272:1: ( rule__MegalPair__Group__0 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:272:2: rule__MegalPair__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalPair__Group__0_in_ruleMegalPair514);
            rule__MegalPair__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMegalPairAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMegalPair"


    // $ANTLR start "rule__MegalFile__Alternatives_3"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:284:1: rule__MegalFile__Alternatives_3 : ( ( ( rule__MegalFile__Group_3_0__0 ) ) | ( ( rule__MegalFile__DeclarationsAssignment_3_1 ) ) | ( ( rule__MegalFile__DeclarationsAssignment_3_2 ) ) | ( ( rule__MegalFile__DeclarationsAssignment_3_3 ) ) | ( ( rule__MegalFile__DeclarationsAssignment_3_4 ) ) | ( ( rule__MegalFile__DeclarationsAssignment_3_5 ) ) | ( ( rule__MegalFile__BindingsAssignment_3_6 ) ) );
    public final void rule__MegalFile__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:288:1: ( ( ( rule__MegalFile__Group_3_0__0 ) ) | ( ( rule__MegalFile__DeclarationsAssignment_3_1 ) ) | ( ( rule__MegalFile__DeclarationsAssignment_3_2 ) ) | ( ( rule__MegalFile__DeclarationsAssignment_3_3 ) ) | ( ( rule__MegalFile__DeclarationsAssignment_3_4 ) ) | ( ( rule__MegalFile__DeclarationsAssignment_3_5 ) ) | ( ( rule__MegalFile__BindingsAssignment_3_6 ) ) )
            int alt1=7;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:289:1: ( ( rule__MegalFile__Group_3_0__0 ) )
                    {
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:289:1: ( ( rule__MegalFile__Group_3_0__0 ) )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:290:1: ( rule__MegalFile__Group_3_0__0 )
                    {
                     before(grammarAccess.getMegalFileAccess().getGroup_3_0()); 
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:291:1: ( rule__MegalFile__Group_3_0__0 )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:291:2: rule__MegalFile__Group_3_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MegalFile__Group_3_0__0_in_rule__MegalFile__Alternatives_3550);
                    rule__MegalFile__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegalFileAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:295:6: ( ( rule__MegalFile__DeclarationsAssignment_3_1 ) )
                    {
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:295:6: ( ( rule__MegalFile__DeclarationsAssignment_3_1 ) )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:296:1: ( rule__MegalFile__DeclarationsAssignment_3_1 )
                    {
                     before(grammarAccess.getMegalFileAccess().getDeclarationsAssignment_3_1()); 
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:297:1: ( rule__MegalFile__DeclarationsAssignment_3_1 )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:297:2: rule__MegalFile__DeclarationsAssignment_3_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MegalFile__DeclarationsAssignment_3_1_in_rule__MegalFile__Alternatives_3568);
                    rule__MegalFile__DeclarationsAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegalFileAccess().getDeclarationsAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:301:6: ( ( rule__MegalFile__DeclarationsAssignment_3_2 ) )
                    {
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:301:6: ( ( rule__MegalFile__DeclarationsAssignment_3_2 ) )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:302:1: ( rule__MegalFile__DeclarationsAssignment_3_2 )
                    {
                     before(grammarAccess.getMegalFileAccess().getDeclarationsAssignment_3_2()); 
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:303:1: ( rule__MegalFile__DeclarationsAssignment_3_2 )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:303:2: rule__MegalFile__DeclarationsAssignment_3_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MegalFile__DeclarationsAssignment_3_2_in_rule__MegalFile__Alternatives_3586);
                    rule__MegalFile__DeclarationsAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegalFileAccess().getDeclarationsAssignment_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:307:6: ( ( rule__MegalFile__DeclarationsAssignment_3_3 ) )
                    {
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:307:6: ( ( rule__MegalFile__DeclarationsAssignment_3_3 ) )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:308:1: ( rule__MegalFile__DeclarationsAssignment_3_3 )
                    {
                     before(grammarAccess.getMegalFileAccess().getDeclarationsAssignment_3_3()); 
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:309:1: ( rule__MegalFile__DeclarationsAssignment_3_3 )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:309:2: rule__MegalFile__DeclarationsAssignment_3_3
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MegalFile__DeclarationsAssignment_3_3_in_rule__MegalFile__Alternatives_3604);
                    rule__MegalFile__DeclarationsAssignment_3_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegalFileAccess().getDeclarationsAssignment_3_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:313:6: ( ( rule__MegalFile__DeclarationsAssignment_3_4 ) )
                    {
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:313:6: ( ( rule__MegalFile__DeclarationsAssignment_3_4 ) )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:314:1: ( rule__MegalFile__DeclarationsAssignment_3_4 )
                    {
                     before(grammarAccess.getMegalFileAccess().getDeclarationsAssignment_3_4()); 
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:315:1: ( rule__MegalFile__DeclarationsAssignment_3_4 )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:315:2: rule__MegalFile__DeclarationsAssignment_3_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MegalFile__DeclarationsAssignment_3_4_in_rule__MegalFile__Alternatives_3622);
                    rule__MegalFile__DeclarationsAssignment_3_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegalFileAccess().getDeclarationsAssignment_3_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:319:6: ( ( rule__MegalFile__DeclarationsAssignment_3_5 ) )
                    {
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:319:6: ( ( rule__MegalFile__DeclarationsAssignment_3_5 ) )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:320:1: ( rule__MegalFile__DeclarationsAssignment_3_5 )
                    {
                     before(grammarAccess.getMegalFileAccess().getDeclarationsAssignment_3_5()); 
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:321:1: ( rule__MegalFile__DeclarationsAssignment_3_5 )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:321:2: rule__MegalFile__DeclarationsAssignment_3_5
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MegalFile__DeclarationsAssignment_3_5_in_rule__MegalFile__Alternatives_3640);
                    rule__MegalFile__DeclarationsAssignment_3_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegalFileAccess().getDeclarationsAssignment_3_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:325:6: ( ( rule__MegalFile__BindingsAssignment_3_6 ) )
                    {
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:325:6: ( ( rule__MegalFile__BindingsAssignment_3_6 ) )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:326:1: ( rule__MegalFile__BindingsAssignment_3_6 )
                    {
                     before(grammarAccess.getMegalFileAccess().getBindingsAssignment_3_6()); 
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:327:1: ( rule__MegalFile__BindingsAssignment_3_6 )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:327:2: rule__MegalFile__BindingsAssignment_3_6
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MegalFile__BindingsAssignment_3_6_in_rule__MegalFile__Alternatives_3658);
                    rule__MegalFile__BindingsAssignment_3_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegalFileAccess().getBindingsAssignment_3_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__Alternatives_3"


    // $ANTLR start "rule__MegalEntityType__Alternatives_2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:336:1: rule__MegalEntityType__Alternatives_2 : ( ( ( rule__MegalEntityType__Group_2_0__0 ) ) | ( ( rule__MegalEntityType__Group_2_1__0 ) ) );
    public final void rule__MegalEntityType__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:340:1: ( ( ( rule__MegalEntityType__Group_2_0__0 ) ) | ( ( rule__MegalEntityType__Group_2_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:341:1: ( ( rule__MegalEntityType__Group_2_0__0 ) )
                    {
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:341:1: ( ( rule__MegalEntityType__Group_2_0__0 ) )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:342:1: ( rule__MegalEntityType__Group_2_0__0 )
                    {
                     before(grammarAccess.getMegalEntityTypeAccess().getGroup_2_0()); 
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:343:1: ( rule__MegalEntityType__Group_2_0__0 )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:343:2: rule__MegalEntityType__Group_2_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MegalEntityType__Group_2_0__0_in_rule__MegalEntityType__Alternatives_2691);
                    rule__MegalEntityType__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegalEntityTypeAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:347:6: ( ( rule__MegalEntityType__Group_2_1__0 ) )
                    {
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:347:6: ( ( rule__MegalEntityType__Group_2_1__0 ) )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:348:1: ( rule__MegalEntityType__Group_2_1__0 )
                    {
                     before(grammarAccess.getMegalEntityTypeAccess().getGroup_2_1()); 
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:349:1: ( rule__MegalEntityType__Group_2_1__0 )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:349:2: rule__MegalEntityType__Group_2_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MegalEntityType__Group_2_1__0_in_rule__MegalEntityType__Alternatives_2709);
                    rule__MegalEntityType__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegalEntityTypeAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntityType__Alternatives_2"


    // $ANTLR start "rule__MegalRelationshipType__Alternatives_5"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:358:1: rule__MegalRelationshipType__Alternatives_5 : ( ( ( rule__MegalRelationshipType__LeftBothAssignment_5_0 ) ) | ( ( rule__MegalRelationshipType__LeftManyAssignment_5_1 ) ) );
    public final void rule__MegalRelationshipType__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:362:1: ( ( ( rule__MegalRelationshipType__LeftBothAssignment_5_0 ) ) | ( ( rule__MegalRelationshipType__LeftManyAssignment_5_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            else if ( (LA3_0==24) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:363:1: ( ( rule__MegalRelationshipType__LeftBothAssignment_5_0 ) )
                    {
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:363:1: ( ( rule__MegalRelationshipType__LeftBothAssignment_5_0 ) )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:364:1: ( rule__MegalRelationshipType__LeftBothAssignment_5_0 )
                    {
                     before(grammarAccess.getMegalRelationshipTypeAccess().getLeftBothAssignment_5_0()); 
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:365:1: ( rule__MegalRelationshipType__LeftBothAssignment_5_0 )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:365:2: rule__MegalRelationshipType__LeftBothAssignment_5_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__LeftBothAssignment_5_0_in_rule__MegalRelationshipType__Alternatives_5742);
                    rule__MegalRelationshipType__LeftBothAssignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegalRelationshipTypeAccess().getLeftBothAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:369:6: ( ( rule__MegalRelationshipType__LeftManyAssignment_5_1 ) )
                    {
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:369:6: ( ( rule__MegalRelationshipType__LeftManyAssignment_5_1 ) )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:370:1: ( rule__MegalRelationshipType__LeftManyAssignment_5_1 )
                    {
                     before(grammarAccess.getMegalRelationshipTypeAccess().getLeftManyAssignment_5_1()); 
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:371:1: ( rule__MegalRelationshipType__LeftManyAssignment_5_1 )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:371:2: rule__MegalRelationshipType__LeftManyAssignment_5_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__LeftManyAssignment_5_1_in_rule__MegalRelationshipType__Alternatives_5760);
                    rule__MegalRelationshipType__LeftManyAssignment_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegalRelationshipTypeAccess().getLeftManyAssignment_5_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Alternatives_5"


    // $ANTLR start "rule__MegalRelationshipType__Alternatives_9"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:380:1: rule__MegalRelationshipType__Alternatives_9 : ( ( ( rule__MegalRelationshipType__RightBothAssignment_9_0 ) ) | ( ( rule__MegalRelationshipType__RightManyAssignment_9_1 ) ) );
    public final void rule__MegalRelationshipType__Alternatives_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:384:1: ( ( ( rule__MegalRelationshipType__RightBothAssignment_9_0 ) ) | ( ( rule__MegalRelationshipType__RightManyAssignment_9_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            else if ( (LA4_0==24) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:385:1: ( ( rule__MegalRelationshipType__RightBothAssignment_9_0 ) )
                    {
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:385:1: ( ( rule__MegalRelationshipType__RightBothAssignment_9_0 ) )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:386:1: ( rule__MegalRelationshipType__RightBothAssignment_9_0 )
                    {
                     before(grammarAccess.getMegalRelationshipTypeAccess().getRightBothAssignment_9_0()); 
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:387:1: ( rule__MegalRelationshipType__RightBothAssignment_9_0 )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:387:2: rule__MegalRelationshipType__RightBothAssignment_9_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__RightBothAssignment_9_0_in_rule__MegalRelationshipType__Alternatives_9793);
                    rule__MegalRelationshipType__RightBothAssignment_9_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegalRelationshipTypeAccess().getRightBothAssignment_9_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:391:6: ( ( rule__MegalRelationshipType__RightManyAssignment_9_1 ) )
                    {
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:391:6: ( ( rule__MegalRelationshipType__RightManyAssignment_9_1 ) )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:392:1: ( rule__MegalRelationshipType__RightManyAssignment_9_1 )
                    {
                     before(grammarAccess.getMegalRelationshipTypeAccess().getRightManyAssignment_9_1()); 
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:393:1: ( rule__MegalRelationshipType__RightManyAssignment_9_1 )
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:393:2: rule__MegalRelationshipType__RightManyAssignment_9_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__RightManyAssignment_9_1_in_rule__MegalRelationshipType__Alternatives_9811);
                    rule__MegalRelationshipType__RightManyAssignment_9_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMegalRelationshipTypeAccess().getRightManyAssignment_9_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Alternatives_9"


    // $ANTLR start "rule__MegalFile__Group__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:404:1: rule__MegalFile__Group__0 : rule__MegalFile__Group__0__Impl rule__MegalFile__Group__1 ;
    public final void rule__MegalFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:408:1: ( rule__MegalFile__Group__0__Impl rule__MegalFile__Group__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:409:2: rule__MegalFile__Group__0__Impl rule__MegalFile__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalFile__Group__0__Impl_in_rule__MegalFile__Group__0842);
            rule__MegalFile__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalFile__Group__1_in_rule__MegalFile__Group__0845);
            rule__MegalFile__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__Group__0"


    // $ANTLR start "rule__MegalFile__Group__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:416:1: rule__MegalFile__Group__0__Impl : ( ( rule__MegalFile__AnnotationsAssignment_0 )* ) ;
    public final void rule__MegalFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:420:1: ( ( ( rule__MegalFile__AnnotationsAssignment_0 )* ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:421:1: ( ( rule__MegalFile__AnnotationsAssignment_0 )* )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:421:1: ( ( rule__MegalFile__AnnotationsAssignment_0 )* )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:422:1: ( rule__MegalFile__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getMegalFileAccess().getAnnotationsAssignment_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:423:1: ( rule__MegalFile__AnnotationsAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==10) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:423:2: rule__MegalFile__AnnotationsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MegalFile__AnnotationsAssignment_0_in_rule__MegalFile__Group__0__Impl872);
            	    rule__MegalFile__AnnotationsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getMegalFileAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__Group__0__Impl"


    // $ANTLR start "rule__MegalFile__Group__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:433:1: rule__MegalFile__Group__1 : rule__MegalFile__Group__1__Impl rule__MegalFile__Group__2 ;
    public final void rule__MegalFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:437:1: ( rule__MegalFile__Group__1__Impl rule__MegalFile__Group__2 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:438:2: rule__MegalFile__Group__1__Impl rule__MegalFile__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalFile__Group__1__Impl_in_rule__MegalFile__Group__1903);
            rule__MegalFile__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalFile__Group__2_in_rule__MegalFile__Group__1906);
            rule__MegalFile__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__Group__1"


    // $ANTLR start "rule__MegalFile__Group__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:445:1: rule__MegalFile__Group__1__Impl : ( 'model' ) ;
    public final void rule__MegalFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:449:1: ( ( 'model' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:450:1: ( 'model' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:450:1: ( 'model' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:451:1: 'model'
            {
             before(grammarAccess.getMegalFileAccess().getModelKeyword_1()); 
            match(input,8,FollowSets000.FOLLOW_8_in_rule__MegalFile__Group__1__Impl934); 
             after(grammarAccess.getMegalFileAccess().getModelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__Group__1__Impl"


    // $ANTLR start "rule__MegalFile__Group__2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:464:1: rule__MegalFile__Group__2 : rule__MegalFile__Group__2__Impl rule__MegalFile__Group__3 ;
    public final void rule__MegalFile__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:468:1: ( rule__MegalFile__Group__2__Impl rule__MegalFile__Group__3 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:469:2: rule__MegalFile__Group__2__Impl rule__MegalFile__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalFile__Group__2__Impl_in_rule__MegalFile__Group__2965);
            rule__MegalFile__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalFile__Group__3_in_rule__MegalFile__Group__2968);
            rule__MegalFile__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__Group__2"


    // $ANTLR start "rule__MegalFile__Group__2__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:476:1: rule__MegalFile__Group__2__Impl : ( ( rule__MegalFile__NameAssignment_2 ) ) ;
    public final void rule__MegalFile__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:480:1: ( ( ( rule__MegalFile__NameAssignment_2 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:481:1: ( ( rule__MegalFile__NameAssignment_2 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:481:1: ( ( rule__MegalFile__NameAssignment_2 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:482:1: ( rule__MegalFile__NameAssignment_2 )
            {
             before(grammarAccess.getMegalFileAccess().getNameAssignment_2()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:483:1: ( rule__MegalFile__NameAssignment_2 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:483:2: rule__MegalFile__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalFile__NameAssignment_2_in_rule__MegalFile__Group__2__Impl995);
            rule__MegalFile__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMegalFileAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__Group__2__Impl"


    // $ANTLR start "rule__MegalFile__Group__3"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:493:1: rule__MegalFile__Group__3 : rule__MegalFile__Group__3__Impl ;
    public final void rule__MegalFile__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:497:1: ( rule__MegalFile__Group__3__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:498:2: rule__MegalFile__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalFile__Group__3__Impl_in_rule__MegalFile__Group__31025);
            rule__MegalFile__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__Group__3"


    // $ANTLR start "rule__MegalFile__Group__3__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:504:1: rule__MegalFile__Group__3__Impl : ( ( rule__MegalFile__Alternatives_3 )* ) ;
    public final void rule__MegalFile__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:508:1: ( ( ( rule__MegalFile__Alternatives_3 )* ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:509:1: ( ( rule__MegalFile__Alternatives_3 )* )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:509:1: ( ( rule__MegalFile__Alternatives_3 )* )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:510:1: ( rule__MegalFile__Alternatives_3 )*
            {
             before(grammarAccess.getMegalFileAccess().getAlternatives_3()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:511:1: ( rule__MegalFile__Alternatives_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=9 && LA6_0<=10)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:511:2: rule__MegalFile__Alternatives_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MegalFile__Alternatives_3_in_rule__MegalFile__Group__3__Impl1052);
            	    rule__MegalFile__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getMegalFileAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__Group__3__Impl"


    // $ANTLR start "rule__MegalFile__Group_3_0__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:529:1: rule__MegalFile__Group_3_0__0 : rule__MegalFile__Group_3_0__0__Impl rule__MegalFile__Group_3_0__1 ;
    public final void rule__MegalFile__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:533:1: ( rule__MegalFile__Group_3_0__0__Impl rule__MegalFile__Group_3_0__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:534:2: rule__MegalFile__Group_3_0__0__Impl rule__MegalFile__Group_3_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalFile__Group_3_0__0__Impl_in_rule__MegalFile__Group_3_0__01091);
            rule__MegalFile__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalFile__Group_3_0__1_in_rule__MegalFile__Group_3_0__01094);
            rule__MegalFile__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__Group_3_0__0"


    // $ANTLR start "rule__MegalFile__Group_3_0__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:541:1: rule__MegalFile__Group_3_0__0__Impl : ( 'import' ) ;
    public final void rule__MegalFile__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:545:1: ( ( 'import' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:546:1: ( 'import' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:546:1: ( 'import' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:547:1: 'import'
            {
             before(grammarAccess.getMegalFileAccess().getImportKeyword_3_0_0()); 
            match(input,9,FollowSets000.FOLLOW_9_in_rule__MegalFile__Group_3_0__0__Impl1122); 
             after(grammarAccess.getMegalFileAccess().getImportKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__Group_3_0__0__Impl"


    // $ANTLR start "rule__MegalFile__Group_3_0__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:560:1: rule__MegalFile__Group_3_0__1 : rule__MegalFile__Group_3_0__1__Impl ;
    public final void rule__MegalFile__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:564:1: ( rule__MegalFile__Group_3_0__1__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:565:2: rule__MegalFile__Group_3_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalFile__Group_3_0__1__Impl_in_rule__MegalFile__Group_3_0__11153);
            rule__MegalFile__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__Group_3_0__1"


    // $ANTLR start "rule__MegalFile__Group_3_0__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:571:1: rule__MegalFile__Group_3_0__1__Impl : ( ( rule__MegalFile__ImportsAssignment_3_0_1 ) ) ;
    public final void rule__MegalFile__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:575:1: ( ( ( rule__MegalFile__ImportsAssignment_3_0_1 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:576:1: ( ( rule__MegalFile__ImportsAssignment_3_0_1 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:576:1: ( ( rule__MegalFile__ImportsAssignment_3_0_1 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:577:1: ( rule__MegalFile__ImportsAssignment_3_0_1 )
            {
             before(grammarAccess.getMegalFileAccess().getImportsAssignment_3_0_1()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:578:1: ( rule__MegalFile__ImportsAssignment_3_0_1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:578:2: rule__MegalFile__ImportsAssignment_3_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalFile__ImportsAssignment_3_0_1_in_rule__MegalFile__Group_3_0__1__Impl1180);
            rule__MegalFile__ImportsAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMegalFileAccess().getImportsAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__Group_3_0__1__Impl"


    // $ANTLR start "rule__MegalAnnotation__Group__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:592:1: rule__MegalAnnotation__Group__0 : rule__MegalAnnotation__Group__0__Impl rule__MegalAnnotation__Group__1 ;
    public final void rule__MegalAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:596:1: ( rule__MegalAnnotation__Group__0__Impl rule__MegalAnnotation__Group__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:597:2: rule__MegalAnnotation__Group__0__Impl rule__MegalAnnotation__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalAnnotation__Group__0__Impl_in_rule__MegalAnnotation__Group__01214);
            rule__MegalAnnotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalAnnotation__Group__1_in_rule__MegalAnnotation__Group__01217);
            rule__MegalAnnotation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalAnnotation__Group__0"


    // $ANTLR start "rule__MegalAnnotation__Group__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:604:1: rule__MegalAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__MegalAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:608:1: ( ( '@' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:609:1: ( '@' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:609:1: ( '@' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:610:1: '@'
            {
             before(grammarAccess.getMegalAnnotationAccess().getCommercialAtKeyword_0()); 
            match(input,10,FollowSets000.FOLLOW_10_in_rule__MegalAnnotation__Group__0__Impl1245); 
             after(grammarAccess.getMegalAnnotationAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalAnnotation__Group__0__Impl"


    // $ANTLR start "rule__MegalAnnotation__Group__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:623:1: rule__MegalAnnotation__Group__1 : rule__MegalAnnotation__Group__1__Impl rule__MegalAnnotation__Group__2 ;
    public final void rule__MegalAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:627:1: ( rule__MegalAnnotation__Group__1__Impl rule__MegalAnnotation__Group__2 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:628:2: rule__MegalAnnotation__Group__1__Impl rule__MegalAnnotation__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalAnnotation__Group__1__Impl_in_rule__MegalAnnotation__Group__11276);
            rule__MegalAnnotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalAnnotation__Group__2_in_rule__MegalAnnotation__Group__11279);
            rule__MegalAnnotation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalAnnotation__Group__1"


    // $ANTLR start "rule__MegalAnnotation__Group__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:635:1: rule__MegalAnnotation__Group__1__Impl : ( ( rule__MegalAnnotation__KeyAssignment_1 ) ) ;
    public final void rule__MegalAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:639:1: ( ( ( rule__MegalAnnotation__KeyAssignment_1 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:640:1: ( ( rule__MegalAnnotation__KeyAssignment_1 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:640:1: ( ( rule__MegalAnnotation__KeyAssignment_1 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:641:1: ( rule__MegalAnnotation__KeyAssignment_1 )
            {
             before(grammarAccess.getMegalAnnotationAccess().getKeyAssignment_1()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:642:1: ( rule__MegalAnnotation__KeyAssignment_1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:642:2: rule__MegalAnnotation__KeyAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalAnnotation__KeyAssignment_1_in_rule__MegalAnnotation__Group__1__Impl1306);
            rule__MegalAnnotation__KeyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMegalAnnotationAccess().getKeyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalAnnotation__Group__1__Impl"


    // $ANTLR start "rule__MegalAnnotation__Group__2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:652:1: rule__MegalAnnotation__Group__2 : rule__MegalAnnotation__Group__2__Impl ;
    public final void rule__MegalAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:656:1: ( rule__MegalAnnotation__Group__2__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:657:2: rule__MegalAnnotation__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalAnnotation__Group__2__Impl_in_rule__MegalAnnotation__Group__21336);
            rule__MegalAnnotation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalAnnotation__Group__2"


    // $ANTLR start "rule__MegalAnnotation__Group__2__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:663:1: rule__MegalAnnotation__Group__2__Impl : ( ( rule__MegalAnnotation__ValueAssignment_2 )? ) ;
    public final void rule__MegalAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:667:1: ( ( ( rule__MegalAnnotation__ValueAssignment_2 )? ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:668:1: ( ( rule__MegalAnnotation__ValueAssignment_2 )? )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:668:1: ( ( rule__MegalAnnotation__ValueAssignment_2 )? )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:669:1: ( rule__MegalAnnotation__ValueAssignment_2 )?
            {
             before(grammarAccess.getMegalAnnotationAccess().getValueAssignment_2()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:670:1: ( rule__MegalAnnotation__ValueAssignment_2 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:670:2: rule__MegalAnnotation__ValueAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MegalAnnotation__ValueAssignment_2_in_rule__MegalAnnotation__Group__2__Impl1363);
                    rule__MegalAnnotation__ValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMegalAnnotationAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalAnnotation__Group__2__Impl"


    // $ANTLR start "rule__MegalLink__Group__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:686:1: rule__MegalLink__Group__0 : rule__MegalLink__Group__0__Impl rule__MegalLink__Group__1 ;
    public final void rule__MegalLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:690:1: ( rule__MegalLink__Group__0__Impl rule__MegalLink__Group__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:691:2: rule__MegalLink__Group__0__Impl rule__MegalLink__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalLink__Group__0__Impl_in_rule__MegalLink__Group__01400);
            rule__MegalLink__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalLink__Group__1_in_rule__MegalLink__Group__01403);
            rule__MegalLink__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__Group__0"


    // $ANTLR start "rule__MegalLink__Group__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:698:1: rule__MegalLink__Group__0__Impl : ( ( rule__MegalLink__AnnotationsAssignment_0 )* ) ;
    public final void rule__MegalLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:702:1: ( ( ( rule__MegalLink__AnnotationsAssignment_0 )* ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:703:1: ( ( rule__MegalLink__AnnotationsAssignment_0 )* )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:703:1: ( ( rule__MegalLink__AnnotationsAssignment_0 )* )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:704:1: ( rule__MegalLink__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getMegalLinkAccess().getAnnotationsAssignment_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:705:1: ( rule__MegalLink__AnnotationsAssignment_0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==10) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:705:2: rule__MegalLink__AnnotationsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MegalLink__AnnotationsAssignment_0_in_rule__MegalLink__Group__0__Impl1430);
            	    rule__MegalLink__AnnotationsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getMegalLinkAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__Group__0__Impl"


    // $ANTLR start "rule__MegalLink__Group__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:715:1: rule__MegalLink__Group__1 : rule__MegalLink__Group__1__Impl rule__MegalLink__Group__2 ;
    public final void rule__MegalLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:719:1: ( rule__MegalLink__Group__1__Impl rule__MegalLink__Group__2 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:720:2: rule__MegalLink__Group__1__Impl rule__MegalLink__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalLink__Group__1__Impl_in_rule__MegalLink__Group__11461);
            rule__MegalLink__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalLink__Group__2_in_rule__MegalLink__Group__11464);
            rule__MegalLink__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__Group__1"


    // $ANTLR start "rule__MegalLink__Group__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:727:1: rule__MegalLink__Group__1__Impl : ( ( rule__MegalLink__LinkAssignment_1 ) ) ;
    public final void rule__MegalLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:731:1: ( ( ( rule__MegalLink__LinkAssignment_1 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:732:1: ( ( rule__MegalLink__LinkAssignment_1 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:732:1: ( ( rule__MegalLink__LinkAssignment_1 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:733:1: ( rule__MegalLink__LinkAssignment_1 )
            {
             before(grammarAccess.getMegalLinkAccess().getLinkAssignment_1()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:734:1: ( rule__MegalLink__LinkAssignment_1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:734:2: rule__MegalLink__LinkAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalLink__LinkAssignment_1_in_rule__MegalLink__Group__1__Impl1491);
            rule__MegalLink__LinkAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMegalLinkAccess().getLinkAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__Group__1__Impl"


    // $ANTLR start "rule__MegalLink__Group__2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:744:1: rule__MegalLink__Group__2 : rule__MegalLink__Group__2__Impl rule__MegalLink__Group__3 ;
    public final void rule__MegalLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:748:1: ( rule__MegalLink__Group__2__Impl rule__MegalLink__Group__3 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:749:2: rule__MegalLink__Group__2__Impl rule__MegalLink__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalLink__Group__2__Impl_in_rule__MegalLink__Group__21521);
            rule__MegalLink__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalLink__Group__3_in_rule__MegalLink__Group__21524);
            rule__MegalLink__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__Group__2"


    // $ANTLR start "rule__MegalLink__Group__2__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:756:1: rule__MegalLink__Group__2__Impl : ( ( rule__MegalLink__Group_2__0 )? ) ;
    public final void rule__MegalLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:760:1: ( ( ( rule__MegalLink__Group_2__0 )? ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:761:1: ( ( rule__MegalLink__Group_2__0 )? )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:761:1: ( ( rule__MegalLink__Group_2__0 )? )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:762:1: ( rule__MegalLink__Group_2__0 )?
            {
             before(grammarAccess.getMegalLinkAccess().getGroup_2()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:763:1: ( rule__MegalLink__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==12) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:763:2: rule__MegalLink__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MegalLink__Group_2__0_in_rule__MegalLink__Group__2__Impl1551);
                    rule__MegalLink__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMegalLinkAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__Group__2__Impl"


    // $ANTLR start "rule__MegalLink__Group__3"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:773:1: rule__MegalLink__Group__3 : rule__MegalLink__Group__3__Impl rule__MegalLink__Group__4 ;
    public final void rule__MegalLink__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:777:1: ( rule__MegalLink__Group__3__Impl rule__MegalLink__Group__4 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:778:2: rule__MegalLink__Group__3__Impl rule__MegalLink__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalLink__Group__3__Impl_in_rule__MegalLink__Group__31582);
            rule__MegalLink__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalLink__Group__4_in_rule__MegalLink__Group__31585);
            rule__MegalLink__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__Group__3"


    // $ANTLR start "rule__MegalLink__Group__3__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:785:1: rule__MegalLink__Group__3__Impl : ( '=' ) ;
    public final void rule__MegalLink__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:789:1: ( ( '=' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:790:1: ( '=' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:790:1: ( '=' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:791:1: '='
            {
             before(grammarAccess.getMegalLinkAccess().getEqualsSignKeyword_3()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__MegalLink__Group__3__Impl1613); 
             after(grammarAccess.getMegalLinkAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__Group__3__Impl"


    // $ANTLR start "rule__MegalLink__Group__4"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:804:1: rule__MegalLink__Group__4 : rule__MegalLink__Group__4__Impl ;
    public final void rule__MegalLink__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:808:1: ( rule__MegalLink__Group__4__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:809:2: rule__MegalLink__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalLink__Group__4__Impl_in_rule__MegalLink__Group__41644);
            rule__MegalLink__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__Group__4"


    // $ANTLR start "rule__MegalLink__Group__4__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:815:1: rule__MegalLink__Group__4__Impl : ( ( rule__MegalLink__ToAssignment_4 ) ) ;
    public final void rule__MegalLink__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:819:1: ( ( ( rule__MegalLink__ToAssignment_4 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:820:1: ( ( rule__MegalLink__ToAssignment_4 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:820:1: ( ( rule__MegalLink__ToAssignment_4 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:821:1: ( rule__MegalLink__ToAssignment_4 )
            {
             before(grammarAccess.getMegalLinkAccess().getToAssignment_4()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:822:1: ( rule__MegalLink__ToAssignment_4 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:822:2: rule__MegalLink__ToAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalLink__ToAssignment_4_in_rule__MegalLink__Group__4__Impl1671);
            rule__MegalLink__ToAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMegalLinkAccess().getToAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__Group__4__Impl"


    // $ANTLR start "rule__MegalLink__Group_2__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:842:1: rule__MegalLink__Group_2__0 : rule__MegalLink__Group_2__0__Impl rule__MegalLink__Group_2__1 ;
    public final void rule__MegalLink__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:846:1: ( rule__MegalLink__Group_2__0__Impl rule__MegalLink__Group_2__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:847:2: rule__MegalLink__Group_2__0__Impl rule__MegalLink__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalLink__Group_2__0__Impl_in_rule__MegalLink__Group_2__01711);
            rule__MegalLink__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalLink__Group_2__1_in_rule__MegalLink__Group_2__01714);
            rule__MegalLink__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__Group_2__0"


    // $ANTLR start "rule__MegalLink__Group_2__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:854:1: rule__MegalLink__Group_2__0__Impl : ( '(' ) ;
    public final void rule__MegalLink__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:858:1: ( ( '(' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:859:1: ( '(' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:859:1: ( '(' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:860:1: '('
            {
             before(grammarAccess.getMegalLinkAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MegalLink__Group_2__0__Impl1742); 
             after(grammarAccess.getMegalLinkAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__Group_2__0__Impl"


    // $ANTLR start "rule__MegalLink__Group_2__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:873:1: rule__MegalLink__Group_2__1 : rule__MegalLink__Group_2__1__Impl rule__MegalLink__Group_2__2 ;
    public final void rule__MegalLink__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:877:1: ( rule__MegalLink__Group_2__1__Impl rule__MegalLink__Group_2__2 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:878:2: rule__MegalLink__Group_2__1__Impl rule__MegalLink__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalLink__Group_2__1__Impl_in_rule__MegalLink__Group_2__11773);
            rule__MegalLink__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalLink__Group_2__2_in_rule__MegalLink__Group_2__11776);
            rule__MegalLink__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__Group_2__1"


    // $ANTLR start "rule__MegalLink__Group_2__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:885:1: rule__MegalLink__Group_2__1__Impl : ( ( rule__MegalLink__FirstAssignment_2_1 ) ) ;
    public final void rule__MegalLink__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:889:1: ( ( ( rule__MegalLink__FirstAssignment_2_1 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:890:1: ( ( rule__MegalLink__FirstAssignment_2_1 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:890:1: ( ( rule__MegalLink__FirstAssignment_2_1 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:891:1: ( rule__MegalLink__FirstAssignment_2_1 )
            {
             before(grammarAccess.getMegalLinkAccess().getFirstAssignment_2_1()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:892:1: ( rule__MegalLink__FirstAssignment_2_1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:892:2: rule__MegalLink__FirstAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalLink__FirstAssignment_2_1_in_rule__MegalLink__Group_2__1__Impl1803);
            rule__MegalLink__FirstAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMegalLinkAccess().getFirstAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__Group_2__1__Impl"


    // $ANTLR start "rule__MegalLink__Group_2__2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:902:1: rule__MegalLink__Group_2__2 : rule__MegalLink__Group_2__2__Impl rule__MegalLink__Group_2__3 ;
    public final void rule__MegalLink__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:906:1: ( rule__MegalLink__Group_2__2__Impl rule__MegalLink__Group_2__3 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:907:2: rule__MegalLink__Group_2__2__Impl rule__MegalLink__Group_2__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalLink__Group_2__2__Impl_in_rule__MegalLink__Group_2__21833);
            rule__MegalLink__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalLink__Group_2__3_in_rule__MegalLink__Group_2__21836);
            rule__MegalLink__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__Group_2__2"


    // $ANTLR start "rule__MegalLink__Group_2__2__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:914:1: rule__MegalLink__Group_2__2__Impl : ( ')' ) ;
    public final void rule__MegalLink__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:918:1: ( ( ')' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:919:1: ( ')' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:919:1: ( ')' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:920:1: ')'
            {
             before(grammarAccess.getMegalLinkAccess().getRightParenthesisKeyword_2_2()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__MegalLink__Group_2__2__Impl1864); 
             after(grammarAccess.getMegalLinkAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__Group_2__2__Impl"


    // $ANTLR start "rule__MegalLink__Group_2__3"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:933:1: rule__MegalLink__Group_2__3 : rule__MegalLink__Group_2__3__Impl rule__MegalLink__Group_2__4 ;
    public final void rule__MegalLink__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:937:1: ( rule__MegalLink__Group_2__3__Impl rule__MegalLink__Group_2__4 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:938:2: rule__MegalLink__Group_2__3__Impl rule__MegalLink__Group_2__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalLink__Group_2__3__Impl_in_rule__MegalLink__Group_2__31895);
            rule__MegalLink__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalLink__Group_2__4_in_rule__MegalLink__Group_2__31898);
            rule__MegalLink__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__Group_2__3"


    // $ANTLR start "rule__MegalLink__Group_2__3__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:945:1: rule__MegalLink__Group_2__3__Impl : ( '|->' ) ;
    public final void rule__MegalLink__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:949:1: ( ( '|->' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:950:1: ( '|->' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:950:1: ( '|->' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:951:1: '|->'
            {
             before(grammarAccess.getMegalLinkAccess().getVerticalLineHyphenMinusGreaterThanSignKeyword_2_3()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__MegalLink__Group_2__3__Impl1926); 
             after(grammarAccess.getMegalLinkAccess().getVerticalLineHyphenMinusGreaterThanSignKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__Group_2__3__Impl"


    // $ANTLR start "rule__MegalLink__Group_2__4"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:964:1: rule__MegalLink__Group_2__4 : rule__MegalLink__Group_2__4__Impl ;
    public final void rule__MegalLink__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:968:1: ( rule__MegalLink__Group_2__4__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:969:2: rule__MegalLink__Group_2__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalLink__Group_2__4__Impl_in_rule__MegalLink__Group_2__41957);
            rule__MegalLink__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__Group_2__4"


    // $ANTLR start "rule__MegalLink__Group_2__4__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:975:1: rule__MegalLink__Group_2__4__Impl : ( ( rule__MegalLink__SecondAssignment_2_4 ) ) ;
    public final void rule__MegalLink__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:979:1: ( ( ( rule__MegalLink__SecondAssignment_2_4 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:980:1: ( ( rule__MegalLink__SecondAssignment_2_4 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:980:1: ( ( rule__MegalLink__SecondAssignment_2_4 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:981:1: ( rule__MegalLink__SecondAssignment_2_4 )
            {
             before(grammarAccess.getMegalLinkAccess().getSecondAssignment_2_4()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:982:1: ( rule__MegalLink__SecondAssignment_2_4 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:982:2: rule__MegalLink__SecondAssignment_2_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalLink__SecondAssignment_2_4_in_rule__MegalLink__Group_2__4__Impl1984);
            rule__MegalLink__SecondAssignment_2_4();

            state._fsp--;


            }

             after(grammarAccess.getMegalLinkAccess().getSecondAssignment_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__Group_2__4__Impl"


    // $ANTLR start "rule__MegalEntityType__Group__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1002:1: rule__MegalEntityType__Group__0 : rule__MegalEntityType__Group__0__Impl rule__MegalEntityType__Group__1 ;
    public final void rule__MegalEntityType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1006:1: ( rule__MegalEntityType__Group__0__Impl rule__MegalEntityType__Group__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1007:2: rule__MegalEntityType__Group__0__Impl rule__MegalEntityType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalEntityType__Group__0__Impl_in_rule__MegalEntityType__Group__02024);
            rule__MegalEntityType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalEntityType__Group__1_in_rule__MegalEntityType__Group__02027);
            rule__MegalEntityType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntityType__Group__0"


    // $ANTLR start "rule__MegalEntityType__Group__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1014:1: rule__MegalEntityType__Group__0__Impl : ( ( rule__MegalEntityType__AnnotationsAssignment_0 )* ) ;
    public final void rule__MegalEntityType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1018:1: ( ( ( rule__MegalEntityType__AnnotationsAssignment_0 )* ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1019:1: ( ( rule__MegalEntityType__AnnotationsAssignment_0 )* )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1019:1: ( ( rule__MegalEntityType__AnnotationsAssignment_0 )* )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1020:1: ( rule__MegalEntityType__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getMegalEntityTypeAccess().getAnnotationsAssignment_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1021:1: ( rule__MegalEntityType__AnnotationsAssignment_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==10) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1021:2: rule__MegalEntityType__AnnotationsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MegalEntityType__AnnotationsAssignment_0_in_rule__MegalEntityType__Group__0__Impl2054);
            	    rule__MegalEntityType__AnnotationsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMegalEntityTypeAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntityType__Group__0__Impl"


    // $ANTLR start "rule__MegalEntityType__Group__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1031:1: rule__MegalEntityType__Group__1 : rule__MegalEntityType__Group__1__Impl rule__MegalEntityType__Group__2 ;
    public final void rule__MegalEntityType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1035:1: ( rule__MegalEntityType__Group__1__Impl rule__MegalEntityType__Group__2 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1036:2: rule__MegalEntityType__Group__1__Impl rule__MegalEntityType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalEntityType__Group__1__Impl_in_rule__MegalEntityType__Group__12085);
            rule__MegalEntityType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalEntityType__Group__2_in_rule__MegalEntityType__Group__12088);
            rule__MegalEntityType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntityType__Group__1"


    // $ANTLR start "rule__MegalEntityType__Group__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1043:1: rule__MegalEntityType__Group__1__Impl : ( ( rule__MegalEntityType__NameAssignment_1 ) ) ;
    public final void rule__MegalEntityType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1047:1: ( ( ( rule__MegalEntityType__NameAssignment_1 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1048:1: ( ( rule__MegalEntityType__NameAssignment_1 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1048:1: ( ( rule__MegalEntityType__NameAssignment_1 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1049:1: ( rule__MegalEntityType__NameAssignment_1 )
            {
             before(grammarAccess.getMegalEntityTypeAccess().getNameAssignment_1()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1050:1: ( rule__MegalEntityType__NameAssignment_1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1050:2: rule__MegalEntityType__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalEntityType__NameAssignment_1_in_rule__MegalEntityType__Group__1__Impl2115);
            rule__MegalEntityType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMegalEntityTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntityType__Group__1__Impl"


    // $ANTLR start "rule__MegalEntityType__Group__2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1060:1: rule__MegalEntityType__Group__2 : rule__MegalEntityType__Group__2__Impl ;
    public final void rule__MegalEntityType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1064:1: ( rule__MegalEntityType__Group__2__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1065:2: rule__MegalEntityType__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalEntityType__Group__2__Impl_in_rule__MegalEntityType__Group__22145);
            rule__MegalEntityType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntityType__Group__2"


    // $ANTLR start "rule__MegalEntityType__Group__2__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1071:1: rule__MegalEntityType__Group__2__Impl : ( ( rule__MegalEntityType__Alternatives_2 ) ) ;
    public final void rule__MegalEntityType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1075:1: ( ( ( rule__MegalEntityType__Alternatives_2 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1076:1: ( ( rule__MegalEntityType__Alternatives_2 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1076:1: ( ( rule__MegalEntityType__Alternatives_2 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1077:1: ( rule__MegalEntityType__Alternatives_2 )
            {
             before(grammarAccess.getMegalEntityTypeAccess().getAlternatives_2()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1078:1: ( rule__MegalEntityType__Alternatives_2 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1078:2: rule__MegalEntityType__Alternatives_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalEntityType__Alternatives_2_in_rule__MegalEntityType__Group__2__Impl2172);
            rule__MegalEntityType__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getMegalEntityTypeAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntityType__Group__2__Impl"


    // $ANTLR start "rule__MegalEntityType__Group_2_0__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1094:1: rule__MegalEntityType__Group_2_0__0 : rule__MegalEntityType__Group_2_0__0__Impl rule__MegalEntityType__Group_2_0__1 ;
    public final void rule__MegalEntityType__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1098:1: ( rule__MegalEntityType__Group_2_0__0__Impl rule__MegalEntityType__Group_2_0__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1099:2: rule__MegalEntityType__Group_2_0__0__Impl rule__MegalEntityType__Group_2_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalEntityType__Group_2_0__0__Impl_in_rule__MegalEntityType__Group_2_0__02208);
            rule__MegalEntityType__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalEntityType__Group_2_0__1_in_rule__MegalEntityType__Group_2_0__02211);
            rule__MegalEntityType__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntityType__Group_2_0__0"


    // $ANTLR start "rule__MegalEntityType__Group_2_0__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1106:1: rule__MegalEntityType__Group_2_0__0__Impl : ( '<' ) ;
    public final void rule__MegalEntityType__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1110:1: ( ( '<' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1111:1: ( '<' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1111:1: ( '<' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1112:1: '<'
            {
             before(grammarAccess.getMegalEntityTypeAccess().getLessThanSignKeyword_2_0_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__MegalEntityType__Group_2_0__0__Impl2239); 
             after(grammarAccess.getMegalEntityTypeAccess().getLessThanSignKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntityType__Group_2_0__0__Impl"


    // $ANTLR start "rule__MegalEntityType__Group_2_0__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1125:1: rule__MegalEntityType__Group_2_0__1 : rule__MegalEntityType__Group_2_0__1__Impl ;
    public final void rule__MegalEntityType__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1129:1: ( rule__MegalEntityType__Group_2_0__1__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1130:2: rule__MegalEntityType__Group_2_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalEntityType__Group_2_0__1__Impl_in_rule__MegalEntityType__Group_2_0__12270);
            rule__MegalEntityType__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntityType__Group_2_0__1"


    // $ANTLR start "rule__MegalEntityType__Group_2_0__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1136:1: rule__MegalEntityType__Group_2_0__1__Impl : ( ( rule__MegalEntityType__SupertypeAssignment_2_0_1 ) ) ;
    public final void rule__MegalEntityType__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1140:1: ( ( ( rule__MegalEntityType__SupertypeAssignment_2_0_1 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1141:1: ( ( rule__MegalEntityType__SupertypeAssignment_2_0_1 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1141:1: ( ( rule__MegalEntityType__SupertypeAssignment_2_0_1 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1142:1: ( rule__MegalEntityType__SupertypeAssignment_2_0_1 )
            {
             before(grammarAccess.getMegalEntityTypeAccess().getSupertypeAssignment_2_0_1()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1143:1: ( rule__MegalEntityType__SupertypeAssignment_2_0_1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1143:2: rule__MegalEntityType__SupertypeAssignment_2_0_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalEntityType__SupertypeAssignment_2_0_1_in_rule__MegalEntityType__Group_2_0__1__Impl2297);
            rule__MegalEntityType__SupertypeAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMegalEntityTypeAccess().getSupertypeAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntityType__Group_2_0__1__Impl"


    // $ANTLR start "rule__MegalEntityType__Group_2_1__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1157:1: rule__MegalEntityType__Group_2_1__0 : rule__MegalEntityType__Group_2_1__0__Impl rule__MegalEntityType__Group_2_1__1 ;
    public final void rule__MegalEntityType__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1161:1: ( rule__MegalEntityType__Group_2_1__0__Impl rule__MegalEntityType__Group_2_1__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1162:2: rule__MegalEntityType__Group_2_1__0__Impl rule__MegalEntityType__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalEntityType__Group_2_1__0__Impl_in_rule__MegalEntityType__Group_2_1__02331);
            rule__MegalEntityType__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalEntityType__Group_2_1__1_in_rule__MegalEntityType__Group_2_1__02334);
            rule__MegalEntityType__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntityType__Group_2_1__0"


    // $ANTLR start "rule__MegalEntityType__Group_2_1__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1169:1: rule__MegalEntityType__Group_2_1__0__Impl : ( 'as' ) ;
    public final void rule__MegalEntityType__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1173:1: ( ( 'as' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1174:1: ( 'as' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1174:1: ( 'as' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1175:1: 'as'
            {
             before(grammarAccess.getMegalEntityTypeAccess().getAsKeyword_2_1_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__MegalEntityType__Group_2_1__0__Impl2362); 
             after(grammarAccess.getMegalEntityTypeAccess().getAsKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntityType__Group_2_1__0__Impl"


    // $ANTLR start "rule__MegalEntityType__Group_2_1__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1188:1: rule__MegalEntityType__Group_2_1__1 : rule__MegalEntityType__Group_2_1__1__Impl ;
    public final void rule__MegalEntityType__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1192:1: ( rule__MegalEntityType__Group_2_1__1__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1193:2: rule__MegalEntityType__Group_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalEntityType__Group_2_1__1__Impl_in_rule__MegalEntityType__Group_2_1__12393);
            rule__MegalEntityType__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntityType__Group_2_1__1"


    // $ANTLR start "rule__MegalEntityType__Group_2_1__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1199:1: rule__MegalEntityType__Group_2_1__1__Impl : ( 'entity' ) ;
    public final void rule__MegalEntityType__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1203:1: ( ( 'entity' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1204:1: ( 'entity' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1204:1: ( 'entity' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1205:1: 'entity'
            {
             before(grammarAccess.getMegalEntityTypeAccess().getEntityKeyword_2_1_1()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__MegalEntityType__Group_2_1__1__Impl2421); 
             after(grammarAccess.getMegalEntityTypeAccess().getEntityKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntityType__Group_2_1__1__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1222:1: rule__MegalRelationshipType__Group__0 : rule__MegalRelationshipType__Group__0__Impl rule__MegalRelationshipType__Group__1 ;
    public final void rule__MegalRelationshipType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1226:1: ( rule__MegalRelationshipType__Group__0__Impl rule__MegalRelationshipType__Group__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1227:2: rule__MegalRelationshipType__Group__0__Impl rule__MegalRelationshipType__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group__0__Impl_in_rule__MegalRelationshipType__Group__02456);
            rule__MegalRelationshipType__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group__1_in_rule__MegalRelationshipType__Group__02459);
            rule__MegalRelationshipType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group__0"


    // $ANTLR start "rule__MegalRelationshipType__Group__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1234:1: rule__MegalRelationshipType__Group__0__Impl : ( ( rule__MegalRelationshipType__AnnotationsAssignment_0 )* ) ;
    public final void rule__MegalRelationshipType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1238:1: ( ( ( rule__MegalRelationshipType__AnnotationsAssignment_0 )* ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1239:1: ( ( rule__MegalRelationshipType__AnnotationsAssignment_0 )* )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1239:1: ( ( rule__MegalRelationshipType__AnnotationsAssignment_0 )* )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1240:1: ( rule__MegalRelationshipType__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getAnnotationsAssignment_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1241:1: ( rule__MegalRelationshipType__AnnotationsAssignment_0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==10) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1241:2: rule__MegalRelationshipType__AnnotationsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__AnnotationsAssignment_0_in_rule__MegalRelationshipType__Group__0__Impl2486);
            	    rule__MegalRelationshipType__AnnotationsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getMegalRelationshipTypeAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group__0__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1251:1: rule__MegalRelationshipType__Group__1 : rule__MegalRelationshipType__Group__1__Impl rule__MegalRelationshipType__Group__2 ;
    public final void rule__MegalRelationshipType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1255:1: ( rule__MegalRelationshipType__Group__1__Impl rule__MegalRelationshipType__Group__2 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1256:2: rule__MegalRelationshipType__Group__1__Impl rule__MegalRelationshipType__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group__1__Impl_in_rule__MegalRelationshipType__Group__12517);
            rule__MegalRelationshipType__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group__2_in_rule__MegalRelationshipType__Group__12520);
            rule__MegalRelationshipType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group__1"


    // $ANTLR start "rule__MegalRelationshipType__Group__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1263:1: rule__MegalRelationshipType__Group__1__Impl : ( ( rule__MegalRelationshipType__NameAssignment_1 ) ) ;
    public final void rule__MegalRelationshipType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1267:1: ( ( ( rule__MegalRelationshipType__NameAssignment_1 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1268:1: ( ( rule__MegalRelationshipType__NameAssignment_1 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1268:1: ( ( rule__MegalRelationshipType__NameAssignment_1 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1269:1: ( rule__MegalRelationshipType__NameAssignment_1 )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getNameAssignment_1()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1270:1: ( rule__MegalRelationshipType__NameAssignment_1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1270:2: rule__MegalRelationshipType__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__NameAssignment_1_in_rule__MegalRelationshipType__Group__1__Impl2547);
            rule__MegalRelationshipType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group__1__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group__2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1280:1: rule__MegalRelationshipType__Group__2 : rule__MegalRelationshipType__Group__2__Impl rule__MegalRelationshipType__Group__3 ;
    public final void rule__MegalRelationshipType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1284:1: ( rule__MegalRelationshipType__Group__2__Impl rule__MegalRelationshipType__Group__3 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1285:2: rule__MegalRelationshipType__Group__2__Impl rule__MegalRelationshipType__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group__2__Impl_in_rule__MegalRelationshipType__Group__22577);
            rule__MegalRelationshipType__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group__3_in_rule__MegalRelationshipType__Group__22580);
            rule__MegalRelationshipType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group__2"


    // $ANTLR start "rule__MegalRelationshipType__Group__2__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1292:1: rule__MegalRelationshipType__Group__2__Impl : ( '<' ) ;
    public final void rule__MegalRelationshipType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1296:1: ( ( '<' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1297:1: ( '<' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1297:1: ( '<' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1298:1: '<'
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getLessThanSignKeyword_2()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__MegalRelationshipType__Group__2__Impl2608); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getLessThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group__2__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group__3"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1311:1: rule__MegalRelationshipType__Group__3 : rule__MegalRelationshipType__Group__3__Impl rule__MegalRelationshipType__Group__4 ;
    public final void rule__MegalRelationshipType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1315:1: ( rule__MegalRelationshipType__Group__3__Impl rule__MegalRelationshipType__Group__4 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1316:2: rule__MegalRelationshipType__Group__3__Impl rule__MegalRelationshipType__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group__3__Impl_in_rule__MegalRelationshipType__Group__32639);
            rule__MegalRelationshipType__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group__4_in_rule__MegalRelationshipType__Group__32642);
            rule__MegalRelationshipType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group__3"


    // $ANTLR start "rule__MegalRelationshipType__Group__3__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1323:1: rule__MegalRelationshipType__Group__3__Impl : ( ( rule__MegalRelationshipType__LeftAssignment_3 ) ) ;
    public final void rule__MegalRelationshipType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1327:1: ( ( ( rule__MegalRelationshipType__LeftAssignment_3 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1328:1: ( ( rule__MegalRelationshipType__LeftAssignment_3 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1328:1: ( ( rule__MegalRelationshipType__LeftAssignment_3 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1329:1: ( rule__MegalRelationshipType__LeftAssignment_3 )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getLeftAssignment_3()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1330:1: ( rule__MegalRelationshipType__LeftAssignment_3 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1330:2: rule__MegalRelationshipType__LeftAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__LeftAssignment_3_in_rule__MegalRelationshipType__Group__3__Impl2669);
            rule__MegalRelationshipType__LeftAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getLeftAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group__3__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group__4"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1340:1: rule__MegalRelationshipType__Group__4 : rule__MegalRelationshipType__Group__4__Impl rule__MegalRelationshipType__Group__5 ;
    public final void rule__MegalRelationshipType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1344:1: ( rule__MegalRelationshipType__Group__4__Impl rule__MegalRelationshipType__Group__5 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1345:2: rule__MegalRelationshipType__Group__4__Impl rule__MegalRelationshipType__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group__4__Impl_in_rule__MegalRelationshipType__Group__42699);
            rule__MegalRelationshipType__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group__5_in_rule__MegalRelationshipType__Group__42702);
            rule__MegalRelationshipType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group__4"


    // $ANTLR start "rule__MegalRelationshipType__Group__4__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1352:1: rule__MegalRelationshipType__Group__4__Impl : ( ( rule__MegalRelationshipType__Group_4__0 )? ) ;
    public final void rule__MegalRelationshipType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1356:1: ( ( ( rule__MegalRelationshipType__Group_4__0 )? ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1357:1: ( ( rule__MegalRelationshipType__Group_4__0 )? )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1357:1: ( ( rule__MegalRelationshipType__Group_4__0 )? )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1358:1: ( rule__MegalRelationshipType__Group_4__0 )?
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getGroup_4()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1359:1: ( rule__MegalRelationshipType__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1359:2: rule__MegalRelationshipType__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group_4__0_in_rule__MegalRelationshipType__Group__4__Impl2729);
                    rule__MegalRelationshipType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group__4__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group__5"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1369:1: rule__MegalRelationshipType__Group__5 : rule__MegalRelationshipType__Group__5__Impl rule__MegalRelationshipType__Group__6 ;
    public final void rule__MegalRelationshipType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1373:1: ( rule__MegalRelationshipType__Group__5__Impl rule__MegalRelationshipType__Group__6 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1374:2: rule__MegalRelationshipType__Group__5__Impl rule__MegalRelationshipType__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group__5__Impl_in_rule__MegalRelationshipType__Group__52760);
            rule__MegalRelationshipType__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group__6_in_rule__MegalRelationshipType__Group__52763);
            rule__MegalRelationshipType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group__5"


    // $ANTLR start "rule__MegalRelationshipType__Group__5__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1381:1: rule__MegalRelationshipType__Group__5__Impl : ( ( rule__MegalRelationshipType__Alternatives_5 )? ) ;
    public final void rule__MegalRelationshipType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1385:1: ( ( ( rule__MegalRelationshipType__Alternatives_5 )? ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1386:1: ( ( rule__MegalRelationshipType__Alternatives_5 )? )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1386:1: ( ( rule__MegalRelationshipType__Alternatives_5 )? )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1387:1: ( rule__MegalRelationshipType__Alternatives_5 )?
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getAlternatives_5()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1388:1: ( rule__MegalRelationshipType__Alternatives_5 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=23 && LA13_0<=24)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1388:2: rule__MegalRelationshipType__Alternatives_5
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Alternatives_5_in_rule__MegalRelationshipType__Group__5__Impl2790);
                    rule__MegalRelationshipType__Alternatives_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group__5__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group__6"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1398:1: rule__MegalRelationshipType__Group__6 : rule__MegalRelationshipType__Group__6__Impl rule__MegalRelationshipType__Group__7 ;
    public final void rule__MegalRelationshipType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1402:1: ( rule__MegalRelationshipType__Group__6__Impl rule__MegalRelationshipType__Group__7 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1403:2: rule__MegalRelationshipType__Group__6__Impl rule__MegalRelationshipType__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group__6__Impl_in_rule__MegalRelationshipType__Group__62821);
            rule__MegalRelationshipType__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group__7_in_rule__MegalRelationshipType__Group__62824);
            rule__MegalRelationshipType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group__6"


    // $ANTLR start "rule__MegalRelationshipType__Group__6__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1410:1: rule__MegalRelationshipType__Group__6__Impl : ( '*' ) ;
    public final void rule__MegalRelationshipType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1414:1: ( ( '*' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1415:1: ( '*' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1415:1: ( '*' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1416:1: '*'
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getAsteriskKeyword_6()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__MegalRelationshipType__Group__6__Impl2852); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getAsteriskKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group__6__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group__7"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1429:1: rule__MegalRelationshipType__Group__7 : rule__MegalRelationshipType__Group__7__Impl rule__MegalRelationshipType__Group__8 ;
    public final void rule__MegalRelationshipType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1433:1: ( rule__MegalRelationshipType__Group__7__Impl rule__MegalRelationshipType__Group__8 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1434:2: rule__MegalRelationshipType__Group__7__Impl rule__MegalRelationshipType__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group__7__Impl_in_rule__MegalRelationshipType__Group__72883);
            rule__MegalRelationshipType__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group__8_in_rule__MegalRelationshipType__Group__72886);
            rule__MegalRelationshipType__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group__7"


    // $ANTLR start "rule__MegalRelationshipType__Group__7__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1441:1: rule__MegalRelationshipType__Group__7__Impl : ( ( rule__MegalRelationshipType__RightAssignment_7 ) ) ;
    public final void rule__MegalRelationshipType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1445:1: ( ( ( rule__MegalRelationshipType__RightAssignment_7 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1446:1: ( ( rule__MegalRelationshipType__RightAssignment_7 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1446:1: ( ( rule__MegalRelationshipType__RightAssignment_7 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1447:1: ( rule__MegalRelationshipType__RightAssignment_7 )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getRightAssignment_7()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1448:1: ( rule__MegalRelationshipType__RightAssignment_7 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1448:2: rule__MegalRelationshipType__RightAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__RightAssignment_7_in_rule__MegalRelationshipType__Group__7__Impl2913);
            rule__MegalRelationshipType__RightAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getRightAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group__7__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group__8"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1458:1: rule__MegalRelationshipType__Group__8 : rule__MegalRelationshipType__Group__8__Impl rule__MegalRelationshipType__Group__9 ;
    public final void rule__MegalRelationshipType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1462:1: ( rule__MegalRelationshipType__Group__8__Impl rule__MegalRelationshipType__Group__9 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1463:2: rule__MegalRelationshipType__Group__8__Impl rule__MegalRelationshipType__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group__8__Impl_in_rule__MegalRelationshipType__Group__82943);
            rule__MegalRelationshipType__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group__9_in_rule__MegalRelationshipType__Group__82946);
            rule__MegalRelationshipType__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group__8"


    // $ANTLR start "rule__MegalRelationshipType__Group__8__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1470:1: rule__MegalRelationshipType__Group__8__Impl : ( ( rule__MegalRelationshipType__Group_8__0 )? ) ;
    public final void rule__MegalRelationshipType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1474:1: ( ( ( rule__MegalRelationshipType__Group_8__0 )? ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1475:1: ( ( rule__MegalRelationshipType__Group_8__0 )? )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1475:1: ( ( rule__MegalRelationshipType__Group_8__0 )? )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1476:1: ( rule__MegalRelationshipType__Group_8__0 )?
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getGroup_8()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1477:1: ( rule__MegalRelationshipType__Group_8__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1477:2: rule__MegalRelationshipType__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group_8__0_in_rule__MegalRelationshipType__Group__8__Impl2973);
                    rule__MegalRelationshipType__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group__8__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group__9"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1487:1: rule__MegalRelationshipType__Group__9 : rule__MegalRelationshipType__Group__9__Impl ;
    public final void rule__MegalRelationshipType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1491:1: ( rule__MegalRelationshipType__Group__9__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1492:2: rule__MegalRelationshipType__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group__9__Impl_in_rule__MegalRelationshipType__Group__93004);
            rule__MegalRelationshipType__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group__9"


    // $ANTLR start "rule__MegalRelationshipType__Group__9__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1498:1: rule__MegalRelationshipType__Group__9__Impl : ( ( rule__MegalRelationshipType__Alternatives_9 )? ) ;
    public final void rule__MegalRelationshipType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1502:1: ( ( ( rule__MegalRelationshipType__Alternatives_9 )? ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1503:1: ( ( rule__MegalRelationshipType__Alternatives_9 )? )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1503:1: ( ( rule__MegalRelationshipType__Alternatives_9 )? )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1504:1: ( rule__MegalRelationshipType__Alternatives_9 )?
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getAlternatives_9()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1505:1: ( rule__MegalRelationshipType__Alternatives_9 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=23 && LA15_0<=24)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1505:2: rule__MegalRelationshipType__Alternatives_9
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Alternatives_9_in_rule__MegalRelationshipType__Group__9__Impl3031);
                    rule__MegalRelationshipType__Alternatives_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getAlternatives_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group__9__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group_4__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1535:1: rule__MegalRelationshipType__Group_4__0 : rule__MegalRelationshipType__Group_4__0__Impl rule__MegalRelationshipType__Group_4__1 ;
    public final void rule__MegalRelationshipType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1539:1: ( rule__MegalRelationshipType__Group_4__0__Impl rule__MegalRelationshipType__Group_4__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1540:2: rule__MegalRelationshipType__Group_4__0__Impl rule__MegalRelationshipType__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group_4__0__Impl_in_rule__MegalRelationshipType__Group_4__03082);
            rule__MegalRelationshipType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group_4__1_in_rule__MegalRelationshipType__Group_4__03085);
            rule__MegalRelationshipType__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_4__0"


    // $ANTLR start "rule__MegalRelationshipType__Group_4__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1547:1: rule__MegalRelationshipType__Group_4__0__Impl : ( '[' ) ;
    public final void rule__MegalRelationshipType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1551:1: ( ( '[' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1552:1: ( '[' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1552:1: ( '[' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1553:1: '['
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getLeftSquareBracketKeyword_4_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__MegalRelationshipType__Group_4__0__Impl3113); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getLeftSquareBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_4__0__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group_4__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1566:1: rule__MegalRelationshipType__Group_4__1 : rule__MegalRelationshipType__Group_4__1__Impl rule__MegalRelationshipType__Group_4__2 ;
    public final void rule__MegalRelationshipType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1570:1: ( rule__MegalRelationshipType__Group_4__1__Impl rule__MegalRelationshipType__Group_4__2 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1571:2: rule__MegalRelationshipType__Group_4__1__Impl rule__MegalRelationshipType__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group_4__1__Impl_in_rule__MegalRelationshipType__Group_4__13144);
            rule__MegalRelationshipType__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group_4__2_in_rule__MegalRelationshipType__Group_4__13147);
            rule__MegalRelationshipType__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_4__1"


    // $ANTLR start "rule__MegalRelationshipType__Group_4__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1578:1: rule__MegalRelationshipType__Group_4__1__Impl : ( ( rule__MegalRelationshipType__LeftParamsAssignment_4_1 ) ) ;
    public final void rule__MegalRelationshipType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1582:1: ( ( ( rule__MegalRelationshipType__LeftParamsAssignment_4_1 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1583:1: ( ( rule__MegalRelationshipType__LeftParamsAssignment_4_1 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1583:1: ( ( rule__MegalRelationshipType__LeftParamsAssignment_4_1 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1584:1: ( rule__MegalRelationshipType__LeftParamsAssignment_4_1 )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getLeftParamsAssignment_4_1()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1585:1: ( rule__MegalRelationshipType__LeftParamsAssignment_4_1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1585:2: rule__MegalRelationshipType__LeftParamsAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__LeftParamsAssignment_4_1_in_rule__MegalRelationshipType__Group_4__1__Impl3174);
            rule__MegalRelationshipType__LeftParamsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getLeftParamsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_4__1__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group_4__2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1595:1: rule__MegalRelationshipType__Group_4__2 : rule__MegalRelationshipType__Group_4__2__Impl rule__MegalRelationshipType__Group_4__3 ;
    public final void rule__MegalRelationshipType__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1599:1: ( rule__MegalRelationshipType__Group_4__2__Impl rule__MegalRelationshipType__Group_4__3 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1600:2: rule__MegalRelationshipType__Group_4__2__Impl rule__MegalRelationshipType__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group_4__2__Impl_in_rule__MegalRelationshipType__Group_4__23204);
            rule__MegalRelationshipType__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group_4__3_in_rule__MegalRelationshipType__Group_4__23207);
            rule__MegalRelationshipType__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_4__2"


    // $ANTLR start "rule__MegalRelationshipType__Group_4__2__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1607:1: rule__MegalRelationshipType__Group_4__2__Impl : ( ( rule__MegalRelationshipType__Group_4_2__0 )* ) ;
    public final void rule__MegalRelationshipType__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1611:1: ( ( ( rule__MegalRelationshipType__Group_4_2__0 )* ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1612:1: ( ( rule__MegalRelationshipType__Group_4_2__0 )* )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1612:1: ( ( rule__MegalRelationshipType__Group_4_2__0 )* )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1613:1: ( rule__MegalRelationshipType__Group_4_2__0 )*
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getGroup_4_2()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1614:1: ( rule__MegalRelationshipType__Group_4_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==21) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1614:2: rule__MegalRelationshipType__Group_4_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group_4_2__0_in_rule__MegalRelationshipType__Group_4__2__Impl3234);
            	    rule__MegalRelationshipType__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getMegalRelationshipTypeAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_4__2__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group_4__3"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1624:1: rule__MegalRelationshipType__Group_4__3 : rule__MegalRelationshipType__Group_4__3__Impl ;
    public final void rule__MegalRelationshipType__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1628:1: ( rule__MegalRelationshipType__Group_4__3__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1629:2: rule__MegalRelationshipType__Group_4__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group_4__3__Impl_in_rule__MegalRelationshipType__Group_4__33265);
            rule__MegalRelationshipType__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_4__3"


    // $ANTLR start "rule__MegalRelationshipType__Group_4__3__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1635:1: rule__MegalRelationshipType__Group_4__3__Impl : ( ']' ) ;
    public final void rule__MegalRelationshipType__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1639:1: ( ( ']' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1640:1: ( ']' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1640:1: ( ']' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1641:1: ']'
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getRightSquareBracketKeyword_4_3()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__MegalRelationshipType__Group_4__3__Impl3293); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getRightSquareBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_4__3__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group_4_2__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1662:1: rule__MegalRelationshipType__Group_4_2__0 : rule__MegalRelationshipType__Group_4_2__0__Impl rule__MegalRelationshipType__Group_4_2__1 ;
    public final void rule__MegalRelationshipType__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1666:1: ( rule__MegalRelationshipType__Group_4_2__0__Impl rule__MegalRelationshipType__Group_4_2__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1667:2: rule__MegalRelationshipType__Group_4_2__0__Impl rule__MegalRelationshipType__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group_4_2__0__Impl_in_rule__MegalRelationshipType__Group_4_2__03332);
            rule__MegalRelationshipType__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group_4_2__1_in_rule__MegalRelationshipType__Group_4_2__03335);
            rule__MegalRelationshipType__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_4_2__0"


    // $ANTLR start "rule__MegalRelationshipType__Group_4_2__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1674:1: rule__MegalRelationshipType__Group_4_2__0__Impl : ( '->' ) ;
    public final void rule__MegalRelationshipType__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1678:1: ( ( '->' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1679:1: ( '->' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1679:1: ( '->' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1680:1: '->'
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getHyphenMinusGreaterThanSignKeyword_4_2_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__MegalRelationshipType__Group_4_2__0__Impl3363); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getHyphenMinusGreaterThanSignKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_4_2__0__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group_4_2__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1693:1: rule__MegalRelationshipType__Group_4_2__1 : rule__MegalRelationshipType__Group_4_2__1__Impl ;
    public final void rule__MegalRelationshipType__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1697:1: ( rule__MegalRelationshipType__Group_4_2__1__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1698:2: rule__MegalRelationshipType__Group_4_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group_4_2__1__Impl_in_rule__MegalRelationshipType__Group_4_2__13394);
            rule__MegalRelationshipType__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_4_2__1"


    // $ANTLR start "rule__MegalRelationshipType__Group_4_2__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1704:1: rule__MegalRelationshipType__Group_4_2__1__Impl : ( ( rule__MegalRelationshipType__LeftParamsAssignment_4_2_1 ) ) ;
    public final void rule__MegalRelationshipType__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1708:1: ( ( ( rule__MegalRelationshipType__LeftParamsAssignment_4_2_1 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1709:1: ( ( rule__MegalRelationshipType__LeftParamsAssignment_4_2_1 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1709:1: ( ( rule__MegalRelationshipType__LeftParamsAssignment_4_2_1 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1710:1: ( rule__MegalRelationshipType__LeftParamsAssignment_4_2_1 )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getLeftParamsAssignment_4_2_1()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1711:1: ( rule__MegalRelationshipType__LeftParamsAssignment_4_2_1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1711:2: rule__MegalRelationshipType__LeftParamsAssignment_4_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__LeftParamsAssignment_4_2_1_in_rule__MegalRelationshipType__Group_4_2__1__Impl3421);
            rule__MegalRelationshipType__LeftParamsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getLeftParamsAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_4_2__1__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group_8__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1725:1: rule__MegalRelationshipType__Group_8__0 : rule__MegalRelationshipType__Group_8__0__Impl rule__MegalRelationshipType__Group_8__1 ;
    public final void rule__MegalRelationshipType__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1729:1: ( rule__MegalRelationshipType__Group_8__0__Impl rule__MegalRelationshipType__Group_8__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1730:2: rule__MegalRelationshipType__Group_8__0__Impl rule__MegalRelationshipType__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group_8__0__Impl_in_rule__MegalRelationshipType__Group_8__03455);
            rule__MegalRelationshipType__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group_8__1_in_rule__MegalRelationshipType__Group_8__03458);
            rule__MegalRelationshipType__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_8__0"


    // $ANTLR start "rule__MegalRelationshipType__Group_8__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1737:1: rule__MegalRelationshipType__Group_8__0__Impl : ( '[' ) ;
    public final void rule__MegalRelationshipType__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1741:1: ( ( '[' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1742:1: ( '[' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1742:1: ( '[' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1743:1: '['
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getLeftSquareBracketKeyword_8_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__MegalRelationshipType__Group_8__0__Impl3486); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getLeftSquareBracketKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_8__0__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group_8__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1756:1: rule__MegalRelationshipType__Group_8__1 : rule__MegalRelationshipType__Group_8__1__Impl rule__MegalRelationshipType__Group_8__2 ;
    public final void rule__MegalRelationshipType__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1760:1: ( rule__MegalRelationshipType__Group_8__1__Impl rule__MegalRelationshipType__Group_8__2 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1761:2: rule__MegalRelationshipType__Group_8__1__Impl rule__MegalRelationshipType__Group_8__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group_8__1__Impl_in_rule__MegalRelationshipType__Group_8__13517);
            rule__MegalRelationshipType__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group_8__2_in_rule__MegalRelationshipType__Group_8__13520);
            rule__MegalRelationshipType__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_8__1"


    // $ANTLR start "rule__MegalRelationshipType__Group_8__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1768:1: rule__MegalRelationshipType__Group_8__1__Impl : ( ( rule__MegalRelationshipType__RightParamsAssignment_8_1 ) ) ;
    public final void rule__MegalRelationshipType__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1772:1: ( ( ( rule__MegalRelationshipType__RightParamsAssignment_8_1 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1773:1: ( ( rule__MegalRelationshipType__RightParamsAssignment_8_1 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1773:1: ( ( rule__MegalRelationshipType__RightParamsAssignment_8_1 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1774:1: ( rule__MegalRelationshipType__RightParamsAssignment_8_1 )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getRightParamsAssignment_8_1()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1775:1: ( rule__MegalRelationshipType__RightParamsAssignment_8_1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1775:2: rule__MegalRelationshipType__RightParamsAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__RightParamsAssignment_8_1_in_rule__MegalRelationshipType__Group_8__1__Impl3547);
            rule__MegalRelationshipType__RightParamsAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getRightParamsAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_8__1__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group_8__2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1785:1: rule__MegalRelationshipType__Group_8__2 : rule__MegalRelationshipType__Group_8__2__Impl rule__MegalRelationshipType__Group_8__3 ;
    public final void rule__MegalRelationshipType__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1789:1: ( rule__MegalRelationshipType__Group_8__2__Impl rule__MegalRelationshipType__Group_8__3 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1790:2: rule__MegalRelationshipType__Group_8__2__Impl rule__MegalRelationshipType__Group_8__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group_8__2__Impl_in_rule__MegalRelationshipType__Group_8__23577);
            rule__MegalRelationshipType__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group_8__3_in_rule__MegalRelationshipType__Group_8__23580);
            rule__MegalRelationshipType__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_8__2"


    // $ANTLR start "rule__MegalRelationshipType__Group_8__2__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1797:1: rule__MegalRelationshipType__Group_8__2__Impl : ( ( rule__MegalRelationshipType__Group_8_2__0 )* ) ;
    public final void rule__MegalRelationshipType__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1801:1: ( ( ( rule__MegalRelationshipType__Group_8_2__0 )* ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1802:1: ( ( rule__MegalRelationshipType__Group_8_2__0 )* )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1802:1: ( ( rule__MegalRelationshipType__Group_8_2__0 )* )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1803:1: ( rule__MegalRelationshipType__Group_8_2__0 )*
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getGroup_8_2()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1804:1: ( rule__MegalRelationshipType__Group_8_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==21) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1804:2: rule__MegalRelationshipType__Group_8_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group_8_2__0_in_rule__MegalRelationshipType__Group_8__2__Impl3607);
            	    rule__MegalRelationshipType__Group_8_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getMegalRelationshipTypeAccess().getGroup_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_8__2__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group_8__3"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1814:1: rule__MegalRelationshipType__Group_8__3 : rule__MegalRelationshipType__Group_8__3__Impl ;
    public final void rule__MegalRelationshipType__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1818:1: ( rule__MegalRelationshipType__Group_8__3__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1819:2: rule__MegalRelationshipType__Group_8__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group_8__3__Impl_in_rule__MegalRelationshipType__Group_8__33638);
            rule__MegalRelationshipType__Group_8__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_8__3"


    // $ANTLR start "rule__MegalRelationshipType__Group_8__3__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1825:1: rule__MegalRelationshipType__Group_8__3__Impl : ( ']' ) ;
    public final void rule__MegalRelationshipType__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1829:1: ( ( ']' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1830:1: ( ']' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1830:1: ( ']' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1831:1: ']'
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getRightSquareBracketKeyword_8_3()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__MegalRelationshipType__Group_8__3__Impl3666); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getRightSquareBracketKeyword_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_8__3__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group_8_2__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1852:1: rule__MegalRelationshipType__Group_8_2__0 : rule__MegalRelationshipType__Group_8_2__0__Impl rule__MegalRelationshipType__Group_8_2__1 ;
    public final void rule__MegalRelationshipType__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1856:1: ( rule__MegalRelationshipType__Group_8_2__0__Impl rule__MegalRelationshipType__Group_8_2__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1857:2: rule__MegalRelationshipType__Group_8_2__0__Impl rule__MegalRelationshipType__Group_8_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group_8_2__0__Impl_in_rule__MegalRelationshipType__Group_8_2__03705);
            rule__MegalRelationshipType__Group_8_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group_8_2__1_in_rule__MegalRelationshipType__Group_8_2__03708);
            rule__MegalRelationshipType__Group_8_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_8_2__0"


    // $ANTLR start "rule__MegalRelationshipType__Group_8_2__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1864:1: rule__MegalRelationshipType__Group_8_2__0__Impl : ( '->' ) ;
    public final void rule__MegalRelationshipType__Group_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1868:1: ( ( '->' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1869:1: ( '->' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1869:1: ( '->' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1870:1: '->'
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getHyphenMinusGreaterThanSignKeyword_8_2_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__MegalRelationshipType__Group_8_2__0__Impl3736); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getHyphenMinusGreaterThanSignKeyword_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_8_2__0__Impl"


    // $ANTLR start "rule__MegalRelationshipType__Group_8_2__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1883:1: rule__MegalRelationshipType__Group_8_2__1 : rule__MegalRelationshipType__Group_8_2__1__Impl ;
    public final void rule__MegalRelationshipType__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1887:1: ( rule__MegalRelationshipType__Group_8_2__1__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1888:2: rule__MegalRelationshipType__Group_8_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__Group_8_2__1__Impl_in_rule__MegalRelationshipType__Group_8_2__13767);
            rule__MegalRelationshipType__Group_8_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_8_2__1"


    // $ANTLR start "rule__MegalRelationshipType__Group_8_2__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1894:1: rule__MegalRelationshipType__Group_8_2__1__Impl : ( ( rule__MegalRelationshipType__RightParamsAssignment_8_2_1 ) ) ;
    public final void rule__MegalRelationshipType__Group_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1898:1: ( ( ( rule__MegalRelationshipType__RightParamsAssignment_8_2_1 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1899:1: ( ( rule__MegalRelationshipType__RightParamsAssignment_8_2_1 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1899:1: ( ( rule__MegalRelationshipType__RightParamsAssignment_8_2_1 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1900:1: ( rule__MegalRelationshipType__RightParamsAssignment_8_2_1 )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getRightParamsAssignment_8_2_1()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1901:1: ( rule__MegalRelationshipType__RightParamsAssignment_8_2_1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1901:2: rule__MegalRelationshipType__RightParamsAssignment_8_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationshipType__RightParamsAssignment_8_2_1_in_rule__MegalRelationshipType__Group_8_2__1__Impl3794);
            rule__MegalRelationshipType__RightParamsAssignment_8_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getRightParamsAssignment_8_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__Group_8_2__1__Impl"


    // $ANTLR start "rule__MegalEntity__Group__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1915:1: rule__MegalEntity__Group__0 : rule__MegalEntity__Group__0__Impl rule__MegalEntity__Group__1 ;
    public final void rule__MegalEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1919:1: ( rule__MegalEntity__Group__0__Impl rule__MegalEntity__Group__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1920:2: rule__MegalEntity__Group__0__Impl rule__MegalEntity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalEntity__Group__0__Impl_in_rule__MegalEntity__Group__03828);
            rule__MegalEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalEntity__Group__1_in_rule__MegalEntity__Group__03831);
            rule__MegalEntity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group__0"


    // $ANTLR start "rule__MegalEntity__Group__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1927:1: rule__MegalEntity__Group__0__Impl : ( ( rule__MegalEntity__AnnotationsAssignment_0 )* ) ;
    public final void rule__MegalEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1931:1: ( ( ( rule__MegalEntity__AnnotationsAssignment_0 )* ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1932:1: ( ( rule__MegalEntity__AnnotationsAssignment_0 )* )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1932:1: ( ( rule__MegalEntity__AnnotationsAssignment_0 )* )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1933:1: ( rule__MegalEntity__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getMegalEntityAccess().getAnnotationsAssignment_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1934:1: ( rule__MegalEntity__AnnotationsAssignment_0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==10) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1934:2: rule__MegalEntity__AnnotationsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MegalEntity__AnnotationsAssignment_0_in_rule__MegalEntity__Group__0__Impl3858);
            	    rule__MegalEntity__AnnotationsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getMegalEntityAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group__0__Impl"


    // $ANTLR start "rule__MegalEntity__Group__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1944:1: rule__MegalEntity__Group__1 : rule__MegalEntity__Group__1__Impl rule__MegalEntity__Group__2 ;
    public final void rule__MegalEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1948:1: ( rule__MegalEntity__Group__1__Impl rule__MegalEntity__Group__2 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1949:2: rule__MegalEntity__Group__1__Impl rule__MegalEntity__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalEntity__Group__1__Impl_in_rule__MegalEntity__Group__13889);
            rule__MegalEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalEntity__Group__2_in_rule__MegalEntity__Group__13892);
            rule__MegalEntity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group__1"


    // $ANTLR start "rule__MegalEntity__Group__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1956:1: rule__MegalEntity__Group__1__Impl : ( ( rule__MegalEntity__NameAssignment_1 ) ) ;
    public final void rule__MegalEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1960:1: ( ( ( rule__MegalEntity__NameAssignment_1 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1961:1: ( ( rule__MegalEntity__NameAssignment_1 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1961:1: ( ( rule__MegalEntity__NameAssignment_1 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1962:1: ( rule__MegalEntity__NameAssignment_1 )
            {
             before(grammarAccess.getMegalEntityAccess().getNameAssignment_1()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1963:1: ( rule__MegalEntity__NameAssignment_1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1963:2: rule__MegalEntity__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalEntity__NameAssignment_1_in_rule__MegalEntity__Group__1__Impl3919);
            rule__MegalEntity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMegalEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group__1__Impl"


    // $ANTLR start "rule__MegalEntity__Group__2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1973:1: rule__MegalEntity__Group__2 : rule__MegalEntity__Group__2__Impl rule__MegalEntity__Group__3 ;
    public final void rule__MegalEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1977:1: ( rule__MegalEntity__Group__2__Impl rule__MegalEntity__Group__3 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1978:2: rule__MegalEntity__Group__2__Impl rule__MegalEntity__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalEntity__Group__2__Impl_in_rule__MegalEntity__Group__23949);
            rule__MegalEntity__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalEntity__Group__3_in_rule__MegalEntity__Group__23952);
            rule__MegalEntity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group__2"


    // $ANTLR start "rule__MegalEntity__Group__2__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1985:1: rule__MegalEntity__Group__2__Impl : ( ':' ) ;
    public final void rule__MegalEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1989:1: ( ( ':' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1990:1: ( ':' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1990:1: ( ':' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:1991:1: ':'
            {
             before(grammarAccess.getMegalEntityAccess().getColonKeyword_2()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__MegalEntity__Group__2__Impl3980); 
             after(grammarAccess.getMegalEntityAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group__2__Impl"


    // $ANTLR start "rule__MegalEntity__Group__3"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2004:1: rule__MegalEntity__Group__3 : rule__MegalEntity__Group__3__Impl rule__MegalEntity__Group__4 ;
    public final void rule__MegalEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2008:1: ( rule__MegalEntity__Group__3__Impl rule__MegalEntity__Group__4 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2009:2: rule__MegalEntity__Group__3__Impl rule__MegalEntity__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalEntity__Group__3__Impl_in_rule__MegalEntity__Group__34011);
            rule__MegalEntity__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalEntity__Group__4_in_rule__MegalEntity__Group__34014);
            rule__MegalEntity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group__3"


    // $ANTLR start "rule__MegalEntity__Group__3__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2016:1: rule__MegalEntity__Group__3__Impl : ( ( rule__MegalEntity__TypeAssignment_3 ) ) ;
    public final void rule__MegalEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2020:1: ( ( ( rule__MegalEntity__TypeAssignment_3 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2021:1: ( ( rule__MegalEntity__TypeAssignment_3 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2021:1: ( ( rule__MegalEntity__TypeAssignment_3 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2022:1: ( rule__MegalEntity__TypeAssignment_3 )
            {
             before(grammarAccess.getMegalEntityAccess().getTypeAssignment_3()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2023:1: ( rule__MegalEntity__TypeAssignment_3 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2023:2: rule__MegalEntity__TypeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalEntity__TypeAssignment_3_in_rule__MegalEntity__Group__3__Impl4041);
            rule__MegalEntity__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMegalEntityAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group__3__Impl"


    // $ANTLR start "rule__MegalEntity__Group__4"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2033:1: rule__MegalEntity__Group__4 : rule__MegalEntity__Group__4__Impl rule__MegalEntity__Group__5 ;
    public final void rule__MegalEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2037:1: ( rule__MegalEntity__Group__4__Impl rule__MegalEntity__Group__5 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2038:2: rule__MegalEntity__Group__4__Impl rule__MegalEntity__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalEntity__Group__4__Impl_in_rule__MegalEntity__Group__44071);
            rule__MegalEntity__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalEntity__Group__5_in_rule__MegalEntity__Group__44074);
            rule__MegalEntity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group__4"


    // $ANTLR start "rule__MegalEntity__Group__4__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2045:1: rule__MegalEntity__Group__4__Impl : ( ( rule__MegalEntity__Group_4__0 )? ) ;
    public final void rule__MegalEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2049:1: ( ( ( rule__MegalEntity__Group_4__0 )? ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2050:1: ( ( rule__MegalEntity__Group_4__0 )? )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2050:1: ( ( rule__MegalEntity__Group_4__0 )? )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2051:1: ( rule__MegalEntity__Group_4__0 )?
            {
             before(grammarAccess.getMegalEntityAccess().getGroup_4()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2052:1: ( rule__MegalEntity__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==19) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2052:2: rule__MegalEntity__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MegalEntity__Group_4__0_in_rule__MegalEntity__Group__4__Impl4101);
                    rule__MegalEntity__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMegalEntityAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group__4__Impl"


    // $ANTLR start "rule__MegalEntity__Group__5"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2062:1: rule__MegalEntity__Group__5 : rule__MegalEntity__Group__5__Impl ;
    public final void rule__MegalEntity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2066:1: ( rule__MegalEntity__Group__5__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2067:2: rule__MegalEntity__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalEntity__Group__5__Impl_in_rule__MegalEntity__Group__54132);
            rule__MegalEntity__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group__5"


    // $ANTLR start "rule__MegalEntity__Group__5__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2073:1: rule__MegalEntity__Group__5__Impl : ( ( rule__MegalEntity__ManyAssignment_5 )? ) ;
    public final void rule__MegalEntity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2077:1: ( ( ( rule__MegalEntity__ManyAssignment_5 )? ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2078:1: ( ( rule__MegalEntity__ManyAssignment_5 )? )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2078:1: ( ( rule__MegalEntity__ManyAssignment_5 )? )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2079:1: ( rule__MegalEntity__ManyAssignment_5 )?
            {
             before(grammarAccess.getMegalEntityAccess().getManyAssignment_5()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2080:1: ( rule__MegalEntity__ManyAssignment_5 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2080:2: rule__MegalEntity__ManyAssignment_5
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MegalEntity__ManyAssignment_5_in_rule__MegalEntity__Group__5__Impl4159);
                    rule__MegalEntity__ManyAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMegalEntityAccess().getManyAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group__5__Impl"


    // $ANTLR start "rule__MegalEntity__Group_4__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2102:1: rule__MegalEntity__Group_4__0 : rule__MegalEntity__Group_4__0__Impl rule__MegalEntity__Group_4__1 ;
    public final void rule__MegalEntity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2106:1: ( rule__MegalEntity__Group_4__0__Impl rule__MegalEntity__Group_4__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2107:2: rule__MegalEntity__Group_4__0__Impl rule__MegalEntity__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalEntity__Group_4__0__Impl_in_rule__MegalEntity__Group_4__04202);
            rule__MegalEntity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalEntity__Group_4__1_in_rule__MegalEntity__Group_4__04205);
            rule__MegalEntity__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group_4__0"


    // $ANTLR start "rule__MegalEntity__Group_4__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2114:1: rule__MegalEntity__Group_4__0__Impl : ( '[' ) ;
    public final void rule__MegalEntity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2118:1: ( ( '[' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2119:1: ( '[' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2119:1: ( '[' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2120:1: '['
            {
             before(grammarAccess.getMegalEntityAccess().getLeftSquareBracketKeyword_4_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__MegalEntity__Group_4__0__Impl4233); 
             after(grammarAccess.getMegalEntityAccess().getLeftSquareBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group_4__0__Impl"


    // $ANTLR start "rule__MegalEntity__Group_4__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2133:1: rule__MegalEntity__Group_4__1 : rule__MegalEntity__Group_4__1__Impl rule__MegalEntity__Group_4__2 ;
    public final void rule__MegalEntity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2137:1: ( rule__MegalEntity__Group_4__1__Impl rule__MegalEntity__Group_4__2 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2138:2: rule__MegalEntity__Group_4__1__Impl rule__MegalEntity__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalEntity__Group_4__1__Impl_in_rule__MegalEntity__Group_4__14264);
            rule__MegalEntity__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalEntity__Group_4__2_in_rule__MegalEntity__Group_4__14267);
            rule__MegalEntity__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group_4__1"


    // $ANTLR start "rule__MegalEntity__Group_4__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2145:1: rule__MegalEntity__Group_4__1__Impl : ( ( rule__MegalEntity__ParamsAssignment_4_1 ) ) ;
    public final void rule__MegalEntity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2149:1: ( ( ( rule__MegalEntity__ParamsAssignment_4_1 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2150:1: ( ( rule__MegalEntity__ParamsAssignment_4_1 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2150:1: ( ( rule__MegalEntity__ParamsAssignment_4_1 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2151:1: ( rule__MegalEntity__ParamsAssignment_4_1 )
            {
             before(grammarAccess.getMegalEntityAccess().getParamsAssignment_4_1()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2152:1: ( rule__MegalEntity__ParamsAssignment_4_1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2152:2: rule__MegalEntity__ParamsAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalEntity__ParamsAssignment_4_1_in_rule__MegalEntity__Group_4__1__Impl4294);
            rule__MegalEntity__ParamsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMegalEntityAccess().getParamsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group_4__1__Impl"


    // $ANTLR start "rule__MegalEntity__Group_4__2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2162:1: rule__MegalEntity__Group_4__2 : rule__MegalEntity__Group_4__2__Impl rule__MegalEntity__Group_4__3 ;
    public final void rule__MegalEntity__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2166:1: ( rule__MegalEntity__Group_4__2__Impl rule__MegalEntity__Group_4__3 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2167:2: rule__MegalEntity__Group_4__2__Impl rule__MegalEntity__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalEntity__Group_4__2__Impl_in_rule__MegalEntity__Group_4__24324);
            rule__MegalEntity__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalEntity__Group_4__3_in_rule__MegalEntity__Group_4__24327);
            rule__MegalEntity__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group_4__2"


    // $ANTLR start "rule__MegalEntity__Group_4__2__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2174:1: rule__MegalEntity__Group_4__2__Impl : ( ( rule__MegalEntity__Group_4_2__0 )* ) ;
    public final void rule__MegalEntity__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2178:1: ( ( ( rule__MegalEntity__Group_4_2__0 )* ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2179:1: ( ( rule__MegalEntity__Group_4_2__0 )* )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2179:1: ( ( rule__MegalEntity__Group_4_2__0 )* )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2180:1: ( rule__MegalEntity__Group_4_2__0 )*
            {
             before(grammarAccess.getMegalEntityAccess().getGroup_4_2()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2181:1: ( rule__MegalEntity__Group_4_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==21) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2181:2: rule__MegalEntity__Group_4_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MegalEntity__Group_4_2__0_in_rule__MegalEntity__Group_4__2__Impl4354);
            	    rule__MegalEntity__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getMegalEntityAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group_4__2__Impl"


    // $ANTLR start "rule__MegalEntity__Group_4__3"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2191:1: rule__MegalEntity__Group_4__3 : rule__MegalEntity__Group_4__3__Impl ;
    public final void rule__MegalEntity__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2195:1: ( rule__MegalEntity__Group_4__3__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2196:2: rule__MegalEntity__Group_4__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalEntity__Group_4__3__Impl_in_rule__MegalEntity__Group_4__34385);
            rule__MegalEntity__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group_4__3"


    // $ANTLR start "rule__MegalEntity__Group_4__3__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2202:1: rule__MegalEntity__Group_4__3__Impl : ( ']' ) ;
    public final void rule__MegalEntity__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2206:1: ( ( ']' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2207:1: ( ']' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2207:1: ( ']' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2208:1: ']'
            {
             before(grammarAccess.getMegalEntityAccess().getRightSquareBracketKeyword_4_3()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__MegalEntity__Group_4__3__Impl4413); 
             after(grammarAccess.getMegalEntityAccess().getRightSquareBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group_4__3__Impl"


    // $ANTLR start "rule__MegalEntity__Group_4_2__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2229:1: rule__MegalEntity__Group_4_2__0 : rule__MegalEntity__Group_4_2__0__Impl rule__MegalEntity__Group_4_2__1 ;
    public final void rule__MegalEntity__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2233:1: ( rule__MegalEntity__Group_4_2__0__Impl rule__MegalEntity__Group_4_2__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2234:2: rule__MegalEntity__Group_4_2__0__Impl rule__MegalEntity__Group_4_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalEntity__Group_4_2__0__Impl_in_rule__MegalEntity__Group_4_2__04452);
            rule__MegalEntity__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalEntity__Group_4_2__1_in_rule__MegalEntity__Group_4_2__04455);
            rule__MegalEntity__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group_4_2__0"


    // $ANTLR start "rule__MegalEntity__Group_4_2__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2241:1: rule__MegalEntity__Group_4_2__0__Impl : ( '->' ) ;
    public final void rule__MegalEntity__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2245:1: ( ( '->' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2246:1: ( '->' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2246:1: ( '->' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2247:1: '->'
            {
             before(grammarAccess.getMegalEntityAccess().getHyphenMinusGreaterThanSignKeyword_4_2_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__MegalEntity__Group_4_2__0__Impl4483); 
             after(grammarAccess.getMegalEntityAccess().getHyphenMinusGreaterThanSignKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group_4_2__0__Impl"


    // $ANTLR start "rule__MegalEntity__Group_4_2__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2260:1: rule__MegalEntity__Group_4_2__1 : rule__MegalEntity__Group_4_2__1__Impl ;
    public final void rule__MegalEntity__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2264:1: ( rule__MegalEntity__Group_4_2__1__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2265:2: rule__MegalEntity__Group_4_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalEntity__Group_4_2__1__Impl_in_rule__MegalEntity__Group_4_2__14514);
            rule__MegalEntity__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group_4_2__1"


    // $ANTLR start "rule__MegalEntity__Group_4_2__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2271:1: rule__MegalEntity__Group_4_2__1__Impl : ( ( rule__MegalEntity__ParamsAssignment_4_2_1 ) ) ;
    public final void rule__MegalEntity__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2275:1: ( ( ( rule__MegalEntity__ParamsAssignment_4_2_1 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2276:1: ( ( rule__MegalEntity__ParamsAssignment_4_2_1 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2276:1: ( ( rule__MegalEntity__ParamsAssignment_4_2_1 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2277:1: ( rule__MegalEntity__ParamsAssignment_4_2_1 )
            {
             before(grammarAccess.getMegalEntityAccess().getParamsAssignment_4_2_1()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2278:1: ( rule__MegalEntity__ParamsAssignment_4_2_1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2278:2: rule__MegalEntity__ParamsAssignment_4_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalEntity__ParamsAssignment_4_2_1_in_rule__MegalEntity__Group_4_2__1__Impl4541);
            rule__MegalEntity__ParamsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMegalEntityAccess().getParamsAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__Group_4_2__1__Impl"


    // $ANTLR start "rule__MegalRelationship__Group__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2292:1: rule__MegalRelationship__Group__0 : rule__MegalRelationship__Group__0__Impl rule__MegalRelationship__Group__1 ;
    public final void rule__MegalRelationship__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2296:1: ( rule__MegalRelationship__Group__0__Impl rule__MegalRelationship__Group__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2297:2: rule__MegalRelationship__Group__0__Impl rule__MegalRelationship__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationship__Group__0__Impl_in_rule__MegalRelationship__Group__04575);
            rule__MegalRelationship__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationship__Group__1_in_rule__MegalRelationship__Group__04578);
            rule__MegalRelationship__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationship__Group__0"


    // $ANTLR start "rule__MegalRelationship__Group__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2304:1: rule__MegalRelationship__Group__0__Impl : ( ( rule__MegalRelationship__AnnotationsAssignment_0 )* ) ;
    public final void rule__MegalRelationship__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2308:1: ( ( ( rule__MegalRelationship__AnnotationsAssignment_0 )* ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2309:1: ( ( rule__MegalRelationship__AnnotationsAssignment_0 )* )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2309:1: ( ( rule__MegalRelationship__AnnotationsAssignment_0 )* )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2310:1: ( rule__MegalRelationship__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getMegalRelationshipAccess().getAnnotationsAssignment_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2311:1: ( rule__MegalRelationship__AnnotationsAssignment_0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==10) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2311:2: rule__MegalRelationship__AnnotationsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MegalRelationship__AnnotationsAssignment_0_in_rule__MegalRelationship__Group__0__Impl4605);
            	    rule__MegalRelationship__AnnotationsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getMegalRelationshipAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationship__Group__0__Impl"


    // $ANTLR start "rule__MegalRelationship__Group__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2321:1: rule__MegalRelationship__Group__1 : rule__MegalRelationship__Group__1__Impl rule__MegalRelationship__Group__2 ;
    public final void rule__MegalRelationship__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2325:1: ( rule__MegalRelationship__Group__1__Impl rule__MegalRelationship__Group__2 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2326:2: rule__MegalRelationship__Group__1__Impl rule__MegalRelationship__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationship__Group__1__Impl_in_rule__MegalRelationship__Group__14636);
            rule__MegalRelationship__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationship__Group__2_in_rule__MegalRelationship__Group__14639);
            rule__MegalRelationship__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationship__Group__1"


    // $ANTLR start "rule__MegalRelationship__Group__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2333:1: rule__MegalRelationship__Group__1__Impl : ( ( rule__MegalRelationship__LeftAssignment_1 ) ) ;
    public final void rule__MegalRelationship__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2337:1: ( ( ( rule__MegalRelationship__LeftAssignment_1 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2338:1: ( ( rule__MegalRelationship__LeftAssignment_1 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2338:1: ( ( rule__MegalRelationship__LeftAssignment_1 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2339:1: ( rule__MegalRelationship__LeftAssignment_1 )
            {
             before(grammarAccess.getMegalRelationshipAccess().getLeftAssignment_1()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2340:1: ( rule__MegalRelationship__LeftAssignment_1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2340:2: rule__MegalRelationship__LeftAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationship__LeftAssignment_1_in_rule__MegalRelationship__Group__1__Impl4666);
            rule__MegalRelationship__LeftAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMegalRelationshipAccess().getLeftAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationship__Group__1__Impl"


    // $ANTLR start "rule__MegalRelationship__Group__2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2350:1: rule__MegalRelationship__Group__2 : rule__MegalRelationship__Group__2__Impl rule__MegalRelationship__Group__3 ;
    public final void rule__MegalRelationship__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2354:1: ( rule__MegalRelationship__Group__2__Impl rule__MegalRelationship__Group__3 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2355:2: rule__MegalRelationship__Group__2__Impl rule__MegalRelationship__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationship__Group__2__Impl_in_rule__MegalRelationship__Group__24696);
            rule__MegalRelationship__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationship__Group__3_in_rule__MegalRelationship__Group__24699);
            rule__MegalRelationship__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationship__Group__2"


    // $ANTLR start "rule__MegalRelationship__Group__2__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2362:1: rule__MegalRelationship__Group__2__Impl : ( ( rule__MegalRelationship__TypeAssignment_2 ) ) ;
    public final void rule__MegalRelationship__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2366:1: ( ( ( rule__MegalRelationship__TypeAssignment_2 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2367:1: ( ( rule__MegalRelationship__TypeAssignment_2 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2367:1: ( ( rule__MegalRelationship__TypeAssignment_2 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2368:1: ( rule__MegalRelationship__TypeAssignment_2 )
            {
             before(grammarAccess.getMegalRelationshipAccess().getTypeAssignment_2()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2369:1: ( rule__MegalRelationship__TypeAssignment_2 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2369:2: rule__MegalRelationship__TypeAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationship__TypeAssignment_2_in_rule__MegalRelationship__Group__2__Impl4726);
            rule__MegalRelationship__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMegalRelationshipAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationship__Group__2__Impl"


    // $ANTLR start "rule__MegalRelationship__Group__3"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2379:1: rule__MegalRelationship__Group__3 : rule__MegalRelationship__Group__3__Impl ;
    public final void rule__MegalRelationship__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2383:1: ( rule__MegalRelationship__Group__3__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2384:2: rule__MegalRelationship__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationship__Group__3__Impl_in_rule__MegalRelationship__Group__34756);
            rule__MegalRelationship__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationship__Group__3"


    // $ANTLR start "rule__MegalRelationship__Group__3__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2390:1: rule__MegalRelationship__Group__3__Impl : ( ( rule__MegalRelationship__RightAssignment_3 ) ) ;
    public final void rule__MegalRelationship__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2394:1: ( ( ( rule__MegalRelationship__RightAssignment_3 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2395:1: ( ( rule__MegalRelationship__RightAssignment_3 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2395:1: ( ( rule__MegalRelationship__RightAssignment_3 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2396:1: ( rule__MegalRelationship__RightAssignment_3 )
            {
             before(grammarAccess.getMegalRelationshipAccess().getRightAssignment_3()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2397:1: ( rule__MegalRelationship__RightAssignment_3 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2397:2: rule__MegalRelationship__RightAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalRelationship__RightAssignment_3_in_rule__MegalRelationship__Group__3__Impl4783);
            rule__MegalRelationship__RightAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMegalRelationshipAccess().getRightAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationship__Group__3__Impl"


    // $ANTLR start "rule__MegalPair__Group__0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2415:1: rule__MegalPair__Group__0 : rule__MegalPair__Group__0__Impl rule__MegalPair__Group__1 ;
    public final void rule__MegalPair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2419:1: ( rule__MegalPair__Group__0__Impl rule__MegalPair__Group__1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2420:2: rule__MegalPair__Group__0__Impl rule__MegalPair__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalPair__Group__0__Impl_in_rule__MegalPair__Group__04821);
            rule__MegalPair__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalPair__Group__1_in_rule__MegalPair__Group__04824);
            rule__MegalPair__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalPair__Group__0"


    // $ANTLR start "rule__MegalPair__Group__0__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2427:1: rule__MegalPair__Group__0__Impl : ( ( rule__MegalPair__AnnotationsAssignment_0 )* ) ;
    public final void rule__MegalPair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2431:1: ( ( ( rule__MegalPair__AnnotationsAssignment_0 )* ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2432:1: ( ( rule__MegalPair__AnnotationsAssignment_0 )* )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2432:1: ( ( rule__MegalPair__AnnotationsAssignment_0 )* )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2433:1: ( rule__MegalPair__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getMegalPairAccess().getAnnotationsAssignment_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2434:1: ( rule__MegalPair__AnnotationsAssignment_0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==10) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2434:2: rule__MegalPair__AnnotationsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MegalPair__AnnotationsAssignment_0_in_rule__MegalPair__Group__0__Impl4851);
            	    rule__MegalPair__AnnotationsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getMegalPairAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalPair__Group__0__Impl"


    // $ANTLR start "rule__MegalPair__Group__1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2444:1: rule__MegalPair__Group__1 : rule__MegalPair__Group__1__Impl rule__MegalPair__Group__2 ;
    public final void rule__MegalPair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2448:1: ( rule__MegalPair__Group__1__Impl rule__MegalPair__Group__2 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2449:2: rule__MegalPair__Group__1__Impl rule__MegalPair__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalPair__Group__1__Impl_in_rule__MegalPair__Group__14882);
            rule__MegalPair__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalPair__Group__2_in_rule__MegalPair__Group__14885);
            rule__MegalPair__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalPair__Group__1"


    // $ANTLR start "rule__MegalPair__Group__1__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2456:1: rule__MegalPair__Group__1__Impl : ( ( rule__MegalPair__SetAssignment_1 ) ) ;
    public final void rule__MegalPair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2460:1: ( ( ( rule__MegalPair__SetAssignment_1 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2461:1: ( ( rule__MegalPair__SetAssignment_1 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2461:1: ( ( rule__MegalPair__SetAssignment_1 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2462:1: ( rule__MegalPair__SetAssignment_1 )
            {
             before(grammarAccess.getMegalPairAccess().getSetAssignment_1()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2463:1: ( rule__MegalPair__SetAssignment_1 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2463:2: rule__MegalPair__SetAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalPair__SetAssignment_1_in_rule__MegalPair__Group__1__Impl4912);
            rule__MegalPair__SetAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMegalPairAccess().getSetAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalPair__Group__1__Impl"


    // $ANTLR start "rule__MegalPair__Group__2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2473:1: rule__MegalPair__Group__2 : rule__MegalPair__Group__2__Impl rule__MegalPair__Group__3 ;
    public final void rule__MegalPair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2477:1: ( rule__MegalPair__Group__2__Impl rule__MegalPair__Group__3 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2478:2: rule__MegalPair__Group__2__Impl rule__MegalPair__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalPair__Group__2__Impl_in_rule__MegalPair__Group__24942);
            rule__MegalPair__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalPair__Group__3_in_rule__MegalPair__Group__24945);
            rule__MegalPair__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalPair__Group__2"


    // $ANTLR start "rule__MegalPair__Group__2__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2485:1: rule__MegalPair__Group__2__Impl : ( '(' ) ;
    public final void rule__MegalPair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2489:1: ( ( '(' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2490:1: ( '(' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2490:1: ( '(' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2491:1: '('
            {
             before(grammarAccess.getMegalPairAccess().getLeftParenthesisKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__MegalPair__Group__2__Impl4973); 
             after(grammarAccess.getMegalPairAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalPair__Group__2__Impl"


    // $ANTLR start "rule__MegalPair__Group__3"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2504:1: rule__MegalPair__Group__3 : rule__MegalPair__Group__3__Impl rule__MegalPair__Group__4 ;
    public final void rule__MegalPair__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2508:1: ( rule__MegalPair__Group__3__Impl rule__MegalPair__Group__4 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2509:2: rule__MegalPair__Group__3__Impl rule__MegalPair__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalPair__Group__3__Impl_in_rule__MegalPair__Group__35004);
            rule__MegalPair__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalPair__Group__4_in_rule__MegalPair__Group__35007);
            rule__MegalPair__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalPair__Group__3"


    // $ANTLR start "rule__MegalPair__Group__3__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2516:1: rule__MegalPair__Group__3__Impl : ( ( rule__MegalPair__FirstAssignment_3 ) ) ;
    public final void rule__MegalPair__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2520:1: ( ( ( rule__MegalPair__FirstAssignment_3 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2521:1: ( ( rule__MegalPair__FirstAssignment_3 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2521:1: ( ( rule__MegalPair__FirstAssignment_3 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2522:1: ( rule__MegalPair__FirstAssignment_3 )
            {
             before(grammarAccess.getMegalPairAccess().getFirstAssignment_3()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2523:1: ( rule__MegalPair__FirstAssignment_3 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2523:2: rule__MegalPair__FirstAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalPair__FirstAssignment_3_in_rule__MegalPair__Group__3__Impl5034);
            rule__MegalPair__FirstAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMegalPairAccess().getFirstAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalPair__Group__3__Impl"


    // $ANTLR start "rule__MegalPair__Group__4"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2533:1: rule__MegalPair__Group__4 : rule__MegalPair__Group__4__Impl rule__MegalPair__Group__5 ;
    public final void rule__MegalPair__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2537:1: ( rule__MegalPair__Group__4__Impl rule__MegalPair__Group__5 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2538:2: rule__MegalPair__Group__4__Impl rule__MegalPair__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalPair__Group__4__Impl_in_rule__MegalPair__Group__45064);
            rule__MegalPair__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalPair__Group__5_in_rule__MegalPair__Group__45067);
            rule__MegalPair__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalPair__Group__4"


    // $ANTLR start "rule__MegalPair__Group__4__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2545:1: rule__MegalPair__Group__4__Impl : ( ')' ) ;
    public final void rule__MegalPair__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2549:1: ( ( ')' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2550:1: ( ')' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2550:1: ( ')' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2551:1: ')'
            {
             before(grammarAccess.getMegalPairAccess().getRightParenthesisKeyword_4()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__MegalPair__Group__4__Impl5095); 
             after(grammarAccess.getMegalPairAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalPair__Group__4__Impl"


    // $ANTLR start "rule__MegalPair__Group__5"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2564:1: rule__MegalPair__Group__5 : rule__MegalPair__Group__5__Impl rule__MegalPair__Group__6 ;
    public final void rule__MegalPair__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2568:1: ( rule__MegalPair__Group__5__Impl rule__MegalPair__Group__6 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2569:2: rule__MegalPair__Group__5__Impl rule__MegalPair__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalPair__Group__5__Impl_in_rule__MegalPair__Group__55126);
            rule__MegalPair__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MegalPair__Group__6_in_rule__MegalPair__Group__55129);
            rule__MegalPair__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalPair__Group__5"


    // $ANTLR start "rule__MegalPair__Group__5__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2576:1: rule__MegalPair__Group__5__Impl : ( '|->' ) ;
    public final void rule__MegalPair__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2580:1: ( ( '|->' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2581:1: ( '|->' )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2581:1: ( '|->' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2582:1: '|->'
            {
             before(grammarAccess.getMegalPairAccess().getVerticalLineHyphenMinusGreaterThanSignKeyword_5()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__MegalPair__Group__5__Impl5157); 
             after(grammarAccess.getMegalPairAccess().getVerticalLineHyphenMinusGreaterThanSignKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalPair__Group__5__Impl"


    // $ANTLR start "rule__MegalPair__Group__6"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2595:1: rule__MegalPair__Group__6 : rule__MegalPair__Group__6__Impl ;
    public final void rule__MegalPair__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2599:1: ( rule__MegalPair__Group__6__Impl )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2600:2: rule__MegalPair__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalPair__Group__6__Impl_in_rule__MegalPair__Group__65188);
            rule__MegalPair__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalPair__Group__6"


    // $ANTLR start "rule__MegalPair__Group__6__Impl"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2606:1: rule__MegalPair__Group__6__Impl : ( ( rule__MegalPair__SecondAssignment_6 ) ) ;
    public final void rule__MegalPair__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2610:1: ( ( ( rule__MegalPair__SecondAssignment_6 ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2611:1: ( ( rule__MegalPair__SecondAssignment_6 ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2611:1: ( ( rule__MegalPair__SecondAssignment_6 ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2612:1: ( rule__MegalPair__SecondAssignment_6 )
            {
             before(grammarAccess.getMegalPairAccess().getSecondAssignment_6()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2613:1: ( rule__MegalPair__SecondAssignment_6 )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2613:2: rule__MegalPair__SecondAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MegalPair__SecondAssignment_6_in_rule__MegalPair__Group__6__Impl5215);
            rule__MegalPair__SecondAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMegalPairAccess().getSecondAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalPair__Group__6__Impl"


    // $ANTLR start "rule__MegalFile__AnnotationsAssignment_0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2638:1: rule__MegalFile__AnnotationsAssignment_0 : ( ruleMegalAnnotation ) ;
    public final void rule__MegalFile__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2642:1: ( ( ruleMegalAnnotation ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2643:1: ( ruleMegalAnnotation )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2643:1: ( ruleMegalAnnotation )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2644:1: ruleMegalAnnotation
            {
             before(grammarAccess.getMegalFileAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMegalAnnotation_in_rule__MegalFile__AnnotationsAssignment_05264);
            ruleMegalAnnotation();

            state._fsp--;

             after(grammarAccess.getMegalFileAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__AnnotationsAssignment_0"


    // $ANTLR start "rule__MegalFile__NameAssignment_2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2653:1: rule__MegalFile__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MegalFile__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2657:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2658:1: ( RULE_ID )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2658:1: ( RULE_ID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2659:1: RULE_ID
            {
             before(grammarAccess.getMegalFileAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MegalFile__NameAssignment_25295); 
             after(grammarAccess.getMegalFileAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__NameAssignment_2"


    // $ANTLR start "rule__MegalFile__ImportsAssignment_3_0_1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2668:1: rule__MegalFile__ImportsAssignment_3_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__MegalFile__ImportsAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2672:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2673:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2673:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2674:1: ( RULE_ID )
            {
             before(grammarAccess.getMegalFileAccess().getImportsMegalFileCrossReference_3_0_1_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2675:1: ( RULE_ID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2676:1: RULE_ID
            {
             before(grammarAccess.getMegalFileAccess().getImportsMegalFileIDTerminalRuleCall_3_0_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MegalFile__ImportsAssignment_3_0_15330); 
             after(grammarAccess.getMegalFileAccess().getImportsMegalFileIDTerminalRuleCall_3_0_1_0_1()); 

            }

             after(grammarAccess.getMegalFileAccess().getImportsMegalFileCrossReference_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__ImportsAssignment_3_0_1"


    // $ANTLR start "rule__MegalFile__DeclarationsAssignment_3_1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2687:1: rule__MegalFile__DeclarationsAssignment_3_1 : ( ruleMegalEntityType ) ;
    public final void rule__MegalFile__DeclarationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2691:1: ( ( ruleMegalEntityType ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2692:1: ( ruleMegalEntityType )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2692:1: ( ruleMegalEntityType )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2693:1: ruleMegalEntityType
            {
             before(grammarAccess.getMegalFileAccess().getDeclarationsMegalEntityTypeParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMegalEntityType_in_rule__MegalFile__DeclarationsAssignment_3_15365);
            ruleMegalEntityType();

            state._fsp--;

             after(grammarAccess.getMegalFileAccess().getDeclarationsMegalEntityTypeParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__DeclarationsAssignment_3_1"


    // $ANTLR start "rule__MegalFile__DeclarationsAssignment_3_2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2702:1: rule__MegalFile__DeclarationsAssignment_3_2 : ( ruleMegalRelationshipType ) ;
    public final void rule__MegalFile__DeclarationsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2706:1: ( ( ruleMegalRelationshipType ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2707:1: ( ruleMegalRelationshipType )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2707:1: ( ruleMegalRelationshipType )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2708:1: ruleMegalRelationshipType
            {
             before(grammarAccess.getMegalFileAccess().getDeclarationsMegalRelationshipTypeParserRuleCall_3_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMegalRelationshipType_in_rule__MegalFile__DeclarationsAssignment_3_25396);
            ruleMegalRelationshipType();

            state._fsp--;

             after(grammarAccess.getMegalFileAccess().getDeclarationsMegalRelationshipTypeParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__DeclarationsAssignment_3_2"


    // $ANTLR start "rule__MegalFile__DeclarationsAssignment_3_3"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2717:1: rule__MegalFile__DeclarationsAssignment_3_3 : ( ruleMegalEntity ) ;
    public final void rule__MegalFile__DeclarationsAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2721:1: ( ( ruleMegalEntity ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2722:1: ( ruleMegalEntity )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2722:1: ( ruleMegalEntity )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2723:1: ruleMegalEntity
            {
             before(grammarAccess.getMegalFileAccess().getDeclarationsMegalEntityParserRuleCall_3_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMegalEntity_in_rule__MegalFile__DeclarationsAssignment_3_35427);
            ruleMegalEntity();

            state._fsp--;

             after(grammarAccess.getMegalFileAccess().getDeclarationsMegalEntityParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__DeclarationsAssignment_3_3"


    // $ANTLR start "rule__MegalFile__DeclarationsAssignment_3_4"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2732:1: rule__MegalFile__DeclarationsAssignment_3_4 : ( ruleMegalRelationship ) ;
    public final void rule__MegalFile__DeclarationsAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2736:1: ( ( ruleMegalRelationship ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2737:1: ( ruleMegalRelationship )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2737:1: ( ruleMegalRelationship )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2738:1: ruleMegalRelationship
            {
             before(grammarAccess.getMegalFileAccess().getDeclarationsMegalRelationshipParserRuleCall_3_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMegalRelationship_in_rule__MegalFile__DeclarationsAssignment_3_45458);
            ruleMegalRelationship();

            state._fsp--;

             after(grammarAccess.getMegalFileAccess().getDeclarationsMegalRelationshipParserRuleCall_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__DeclarationsAssignment_3_4"


    // $ANTLR start "rule__MegalFile__DeclarationsAssignment_3_5"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2747:1: rule__MegalFile__DeclarationsAssignment_3_5 : ( ruleMegalPair ) ;
    public final void rule__MegalFile__DeclarationsAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2751:1: ( ( ruleMegalPair ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2752:1: ( ruleMegalPair )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2752:1: ( ruleMegalPair )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2753:1: ruleMegalPair
            {
             before(grammarAccess.getMegalFileAccess().getDeclarationsMegalPairParserRuleCall_3_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMegalPair_in_rule__MegalFile__DeclarationsAssignment_3_55489);
            ruleMegalPair();

            state._fsp--;

             after(grammarAccess.getMegalFileAccess().getDeclarationsMegalPairParserRuleCall_3_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__DeclarationsAssignment_3_5"


    // $ANTLR start "rule__MegalFile__BindingsAssignment_3_6"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2762:1: rule__MegalFile__BindingsAssignment_3_6 : ( ruleMegalLink ) ;
    public final void rule__MegalFile__BindingsAssignment_3_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2766:1: ( ( ruleMegalLink ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2767:1: ( ruleMegalLink )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2767:1: ( ruleMegalLink )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2768:1: ruleMegalLink
            {
             before(grammarAccess.getMegalFileAccess().getBindingsMegalLinkParserRuleCall_3_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMegalLink_in_rule__MegalFile__BindingsAssignment_3_65520);
            ruleMegalLink();

            state._fsp--;

             after(grammarAccess.getMegalFileAccess().getBindingsMegalLinkParserRuleCall_3_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalFile__BindingsAssignment_3_6"


    // $ANTLR start "rule__MegalAnnotation__KeyAssignment_1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2777:1: rule__MegalAnnotation__KeyAssignment_1 : ( RULE_ID ) ;
    public final void rule__MegalAnnotation__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2781:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2782:1: ( RULE_ID )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2782:1: ( RULE_ID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2783:1: RULE_ID
            {
             before(grammarAccess.getMegalAnnotationAccess().getKeyIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MegalAnnotation__KeyAssignment_15551); 
             after(grammarAccess.getMegalAnnotationAccess().getKeyIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalAnnotation__KeyAssignment_1"


    // $ANTLR start "rule__MegalAnnotation__ValueAssignment_2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2792:1: rule__MegalAnnotation__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MegalAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2796:1: ( ( RULE_STRING ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2797:1: ( RULE_STRING )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2797:1: ( RULE_STRING )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2798:1: RULE_STRING
            {
             before(grammarAccess.getMegalAnnotationAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__MegalAnnotation__ValueAssignment_25582); 
             after(grammarAccess.getMegalAnnotationAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalAnnotation__ValueAssignment_2"


    // $ANTLR start "rule__MegalLink__AnnotationsAssignment_0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2807:1: rule__MegalLink__AnnotationsAssignment_0 : ( ruleMegalAnnotation ) ;
    public final void rule__MegalLink__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2811:1: ( ( ruleMegalAnnotation ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2812:1: ( ruleMegalAnnotation )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2812:1: ( ruleMegalAnnotation )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2813:1: ruleMegalAnnotation
            {
             before(grammarAccess.getMegalLinkAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMegalAnnotation_in_rule__MegalLink__AnnotationsAssignment_05613);
            ruleMegalAnnotation();

            state._fsp--;

             after(grammarAccess.getMegalLinkAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__AnnotationsAssignment_0"


    // $ANTLR start "rule__MegalLink__LinkAssignment_1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2822:1: rule__MegalLink__LinkAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MegalLink__LinkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2826:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2827:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2827:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2828:1: ( RULE_ID )
            {
             before(grammarAccess.getMegalLinkAccess().getLinkMegalEntityCrossReference_1_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2829:1: ( RULE_ID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2830:1: RULE_ID
            {
             before(grammarAccess.getMegalLinkAccess().getLinkMegalEntityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MegalLink__LinkAssignment_15648); 
             after(grammarAccess.getMegalLinkAccess().getLinkMegalEntityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMegalLinkAccess().getLinkMegalEntityCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__LinkAssignment_1"


    // $ANTLR start "rule__MegalLink__FirstAssignment_2_1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2841:1: rule__MegalLink__FirstAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MegalLink__FirstAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2845:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2846:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2846:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2847:1: ( RULE_ID )
            {
             before(grammarAccess.getMegalLinkAccess().getFirstMegalEntityCrossReference_2_1_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2848:1: ( RULE_ID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2849:1: RULE_ID
            {
             before(grammarAccess.getMegalLinkAccess().getFirstMegalEntityIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MegalLink__FirstAssignment_2_15687); 
             after(grammarAccess.getMegalLinkAccess().getFirstMegalEntityIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getMegalLinkAccess().getFirstMegalEntityCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__FirstAssignment_2_1"


    // $ANTLR start "rule__MegalLink__SecondAssignment_2_4"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2860:1: rule__MegalLink__SecondAssignment_2_4 : ( ( RULE_ID ) ) ;
    public final void rule__MegalLink__SecondAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2864:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2865:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2865:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2866:1: ( RULE_ID )
            {
             before(grammarAccess.getMegalLinkAccess().getSecondMegalEntityCrossReference_2_4_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2867:1: ( RULE_ID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2868:1: RULE_ID
            {
             before(grammarAccess.getMegalLinkAccess().getSecondMegalEntityIDTerminalRuleCall_2_4_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MegalLink__SecondAssignment_2_45726); 
             after(grammarAccess.getMegalLinkAccess().getSecondMegalEntityIDTerminalRuleCall_2_4_0_1()); 

            }

             after(grammarAccess.getMegalLinkAccess().getSecondMegalEntityCrossReference_2_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__SecondAssignment_2_4"


    // $ANTLR start "rule__MegalLink__ToAssignment_4"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2879:1: rule__MegalLink__ToAssignment_4 : ( RULE_STRING ) ;
    public final void rule__MegalLink__ToAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2883:1: ( ( RULE_STRING ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2884:1: ( RULE_STRING )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2884:1: ( RULE_STRING )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2885:1: RULE_STRING
            {
             before(grammarAccess.getMegalLinkAccess().getToSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__MegalLink__ToAssignment_45761); 
             after(grammarAccess.getMegalLinkAccess().getToSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalLink__ToAssignment_4"


    // $ANTLR start "rule__MegalEntityType__AnnotationsAssignment_0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2894:1: rule__MegalEntityType__AnnotationsAssignment_0 : ( ruleMegalAnnotation ) ;
    public final void rule__MegalEntityType__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2898:1: ( ( ruleMegalAnnotation ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2899:1: ( ruleMegalAnnotation )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2899:1: ( ruleMegalAnnotation )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2900:1: ruleMegalAnnotation
            {
             before(grammarAccess.getMegalEntityTypeAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMegalAnnotation_in_rule__MegalEntityType__AnnotationsAssignment_05792);
            ruleMegalAnnotation();

            state._fsp--;

             after(grammarAccess.getMegalEntityTypeAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntityType__AnnotationsAssignment_0"


    // $ANTLR start "rule__MegalEntityType__NameAssignment_1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2909:1: rule__MegalEntityType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MegalEntityType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2913:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2914:1: ( RULE_ID )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2914:1: ( RULE_ID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2915:1: RULE_ID
            {
             before(grammarAccess.getMegalEntityTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MegalEntityType__NameAssignment_15823); 
             after(grammarAccess.getMegalEntityTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntityType__NameAssignment_1"


    // $ANTLR start "rule__MegalEntityType__SupertypeAssignment_2_0_1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2924:1: rule__MegalEntityType__SupertypeAssignment_2_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__MegalEntityType__SupertypeAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2928:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2929:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2929:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2930:1: ( RULE_ID )
            {
             before(grammarAccess.getMegalEntityTypeAccess().getSupertypeMegalEntityTypeCrossReference_2_0_1_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2931:1: ( RULE_ID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2932:1: RULE_ID
            {
             before(grammarAccess.getMegalEntityTypeAccess().getSupertypeMegalEntityTypeIDTerminalRuleCall_2_0_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MegalEntityType__SupertypeAssignment_2_0_15858); 
             after(grammarAccess.getMegalEntityTypeAccess().getSupertypeMegalEntityTypeIDTerminalRuleCall_2_0_1_0_1()); 

            }

             after(grammarAccess.getMegalEntityTypeAccess().getSupertypeMegalEntityTypeCrossReference_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntityType__SupertypeAssignment_2_0_1"


    // $ANTLR start "rule__MegalRelationshipType__AnnotationsAssignment_0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2943:1: rule__MegalRelationshipType__AnnotationsAssignment_0 : ( ruleMegalAnnotation ) ;
    public final void rule__MegalRelationshipType__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2947:1: ( ( ruleMegalAnnotation ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2948:1: ( ruleMegalAnnotation )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2948:1: ( ruleMegalAnnotation )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2949:1: ruleMegalAnnotation
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMegalAnnotation_in_rule__MegalRelationshipType__AnnotationsAssignment_05893);
            ruleMegalAnnotation();

            state._fsp--;

             after(grammarAccess.getMegalRelationshipTypeAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__AnnotationsAssignment_0"


    // $ANTLR start "rule__MegalRelationshipType__NameAssignment_1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2958:1: rule__MegalRelationshipType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MegalRelationshipType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2962:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2963:1: ( RULE_ID )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2963:1: ( RULE_ID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2964:1: RULE_ID
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MegalRelationshipType__NameAssignment_15924); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__NameAssignment_1"


    // $ANTLR start "rule__MegalRelationshipType__LeftAssignment_3"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2973:1: rule__MegalRelationshipType__LeftAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__MegalRelationshipType__LeftAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2977:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2978:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2978:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2979:1: ( RULE_ID )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getLeftMegalEntityTypeCrossReference_3_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2980:1: ( RULE_ID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2981:1: RULE_ID
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getLeftMegalEntityTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MegalRelationshipType__LeftAssignment_35959); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getLeftMegalEntityTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getLeftMegalEntityTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__LeftAssignment_3"


    // $ANTLR start "rule__MegalRelationshipType__LeftParamsAssignment_4_1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2992:1: rule__MegalRelationshipType__LeftParamsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__MegalRelationshipType__LeftParamsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2996:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2997:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2997:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2998:1: ( RULE_ID )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getLeftParamsMegalEntityCrossReference_4_1_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:2999:1: ( RULE_ID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3000:1: RULE_ID
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getLeftParamsMegalEntityIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MegalRelationshipType__LeftParamsAssignment_4_15998); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getLeftParamsMegalEntityIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getLeftParamsMegalEntityCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__LeftParamsAssignment_4_1"


    // $ANTLR start "rule__MegalRelationshipType__LeftParamsAssignment_4_2_1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3011:1: rule__MegalRelationshipType__LeftParamsAssignment_4_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MegalRelationshipType__LeftParamsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3015:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3016:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3016:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3017:1: ( RULE_ID )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getLeftParamsMegalEntityCrossReference_4_2_1_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3018:1: ( RULE_ID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3019:1: RULE_ID
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getLeftParamsMegalEntityIDTerminalRuleCall_4_2_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MegalRelationshipType__LeftParamsAssignment_4_2_16037); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getLeftParamsMegalEntityIDTerminalRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getLeftParamsMegalEntityCrossReference_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__LeftParamsAssignment_4_2_1"


    // $ANTLR start "rule__MegalRelationshipType__LeftBothAssignment_5_0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3030:1: rule__MegalRelationshipType__LeftBothAssignment_5_0 : ( ( '(+)' ) ) ;
    public final void rule__MegalRelationshipType__LeftBothAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3034:1: ( ( ( '(+)' ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3035:1: ( ( '(+)' ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3035:1: ( ( '(+)' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3036:1: ( '(+)' )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getLeftBothLeftParenthesisPlusSignRightParenthesisKeyword_5_0_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3037:1: ( '(+)' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3038:1: '(+)'
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getLeftBothLeftParenthesisPlusSignRightParenthesisKeyword_5_0_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__MegalRelationshipType__LeftBothAssignment_5_06077); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getLeftBothLeftParenthesisPlusSignRightParenthesisKeyword_5_0_0()); 

            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getLeftBothLeftParenthesisPlusSignRightParenthesisKeyword_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__LeftBothAssignment_5_0"


    // $ANTLR start "rule__MegalRelationshipType__LeftManyAssignment_5_1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3053:1: rule__MegalRelationshipType__LeftManyAssignment_5_1 : ( ( '+' ) ) ;
    public final void rule__MegalRelationshipType__LeftManyAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3057:1: ( ( ( '+' ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3058:1: ( ( '+' ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3058:1: ( ( '+' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3059:1: ( '+' )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getLeftManyPlusSignKeyword_5_1_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3060:1: ( '+' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3061:1: '+'
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getLeftManyPlusSignKeyword_5_1_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MegalRelationshipType__LeftManyAssignment_5_16121); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getLeftManyPlusSignKeyword_5_1_0()); 

            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getLeftManyPlusSignKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__LeftManyAssignment_5_1"


    // $ANTLR start "rule__MegalRelationshipType__RightAssignment_7"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3076:1: rule__MegalRelationshipType__RightAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__MegalRelationshipType__RightAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3080:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3081:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3081:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3082:1: ( RULE_ID )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getRightMegalEntityTypeCrossReference_7_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3083:1: ( RULE_ID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3084:1: RULE_ID
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getRightMegalEntityTypeIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MegalRelationshipType__RightAssignment_76164); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getRightMegalEntityTypeIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getRightMegalEntityTypeCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__RightAssignment_7"


    // $ANTLR start "rule__MegalRelationshipType__RightParamsAssignment_8_1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3095:1: rule__MegalRelationshipType__RightParamsAssignment_8_1 : ( ( RULE_ID ) ) ;
    public final void rule__MegalRelationshipType__RightParamsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3099:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3100:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3100:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3101:1: ( RULE_ID )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getRightParamsMegalEntityCrossReference_8_1_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3102:1: ( RULE_ID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3103:1: RULE_ID
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getRightParamsMegalEntityIDTerminalRuleCall_8_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MegalRelationshipType__RightParamsAssignment_8_16203); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getRightParamsMegalEntityIDTerminalRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getRightParamsMegalEntityCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__RightParamsAssignment_8_1"


    // $ANTLR start "rule__MegalRelationshipType__RightParamsAssignment_8_2_1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3114:1: rule__MegalRelationshipType__RightParamsAssignment_8_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MegalRelationshipType__RightParamsAssignment_8_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3118:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3119:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3119:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3120:1: ( RULE_ID )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getRightParamsMegalEntityCrossReference_8_2_1_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3121:1: ( RULE_ID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3122:1: RULE_ID
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getRightParamsMegalEntityIDTerminalRuleCall_8_2_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MegalRelationshipType__RightParamsAssignment_8_2_16242); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getRightParamsMegalEntityIDTerminalRuleCall_8_2_1_0_1()); 

            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getRightParamsMegalEntityCrossReference_8_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__RightParamsAssignment_8_2_1"


    // $ANTLR start "rule__MegalRelationshipType__RightBothAssignment_9_0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3133:1: rule__MegalRelationshipType__RightBothAssignment_9_0 : ( ( '(+)' ) ) ;
    public final void rule__MegalRelationshipType__RightBothAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3137:1: ( ( ( '(+)' ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3138:1: ( ( '(+)' ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3138:1: ( ( '(+)' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3139:1: ( '(+)' )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getRightBothLeftParenthesisPlusSignRightParenthesisKeyword_9_0_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3140:1: ( '(+)' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3141:1: '(+)'
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getRightBothLeftParenthesisPlusSignRightParenthesisKeyword_9_0_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__MegalRelationshipType__RightBothAssignment_9_06282); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getRightBothLeftParenthesisPlusSignRightParenthesisKeyword_9_0_0()); 

            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getRightBothLeftParenthesisPlusSignRightParenthesisKeyword_9_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__RightBothAssignment_9_0"


    // $ANTLR start "rule__MegalRelationshipType__RightManyAssignment_9_1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3156:1: rule__MegalRelationshipType__RightManyAssignment_9_1 : ( ( '+' ) ) ;
    public final void rule__MegalRelationshipType__RightManyAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3160:1: ( ( ( '+' ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3161:1: ( ( '+' ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3161:1: ( ( '+' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3162:1: ( '+' )
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getRightManyPlusSignKeyword_9_1_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3163:1: ( '+' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3164:1: '+'
            {
             before(grammarAccess.getMegalRelationshipTypeAccess().getRightManyPlusSignKeyword_9_1_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MegalRelationshipType__RightManyAssignment_9_16326); 
             after(grammarAccess.getMegalRelationshipTypeAccess().getRightManyPlusSignKeyword_9_1_0()); 

            }

             after(grammarAccess.getMegalRelationshipTypeAccess().getRightManyPlusSignKeyword_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationshipType__RightManyAssignment_9_1"


    // $ANTLR start "rule__MegalEntity__AnnotationsAssignment_0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3179:1: rule__MegalEntity__AnnotationsAssignment_0 : ( ruleMegalAnnotation ) ;
    public final void rule__MegalEntity__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3183:1: ( ( ruleMegalAnnotation ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3184:1: ( ruleMegalAnnotation )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3184:1: ( ruleMegalAnnotation )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3185:1: ruleMegalAnnotation
            {
             before(grammarAccess.getMegalEntityAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMegalAnnotation_in_rule__MegalEntity__AnnotationsAssignment_06365);
            ruleMegalAnnotation();

            state._fsp--;

             after(grammarAccess.getMegalEntityAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__AnnotationsAssignment_0"


    // $ANTLR start "rule__MegalEntity__NameAssignment_1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3194:1: rule__MegalEntity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MegalEntity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3198:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3199:1: ( RULE_ID )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3199:1: ( RULE_ID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3200:1: RULE_ID
            {
             before(grammarAccess.getMegalEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MegalEntity__NameAssignment_16396); 
             after(grammarAccess.getMegalEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__NameAssignment_1"


    // $ANTLR start "rule__MegalEntity__TypeAssignment_3"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3209:1: rule__MegalEntity__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__MegalEntity__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3213:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3214:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3214:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3215:1: ( RULE_ID )
            {
             before(grammarAccess.getMegalEntityAccess().getTypeMegalEntityTypeCrossReference_3_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3216:1: ( RULE_ID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3217:1: RULE_ID
            {
             before(grammarAccess.getMegalEntityAccess().getTypeMegalEntityTypeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MegalEntity__TypeAssignment_36431); 
             after(grammarAccess.getMegalEntityAccess().getTypeMegalEntityTypeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMegalEntityAccess().getTypeMegalEntityTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__TypeAssignment_3"


    // $ANTLR start "rule__MegalEntity__ParamsAssignment_4_1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3228:1: rule__MegalEntity__ParamsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__MegalEntity__ParamsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3232:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3233:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3233:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3234:1: ( RULE_ID )
            {
             before(grammarAccess.getMegalEntityAccess().getParamsMegalEntityCrossReference_4_1_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3235:1: ( RULE_ID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3236:1: RULE_ID
            {
             before(grammarAccess.getMegalEntityAccess().getParamsMegalEntityIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MegalEntity__ParamsAssignment_4_16470); 
             after(grammarAccess.getMegalEntityAccess().getParamsMegalEntityIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getMegalEntityAccess().getParamsMegalEntityCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__ParamsAssignment_4_1"


    // $ANTLR start "rule__MegalEntity__ParamsAssignment_4_2_1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3247:1: rule__MegalEntity__ParamsAssignment_4_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MegalEntity__ParamsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3251:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3252:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3252:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3253:1: ( RULE_ID )
            {
             before(grammarAccess.getMegalEntityAccess().getParamsMegalEntityCrossReference_4_2_1_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3254:1: ( RULE_ID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3255:1: RULE_ID
            {
             before(grammarAccess.getMegalEntityAccess().getParamsMegalEntityIDTerminalRuleCall_4_2_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MegalEntity__ParamsAssignment_4_2_16509); 
             after(grammarAccess.getMegalEntityAccess().getParamsMegalEntityIDTerminalRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getMegalEntityAccess().getParamsMegalEntityCrossReference_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__ParamsAssignment_4_2_1"


    // $ANTLR start "rule__MegalEntity__ManyAssignment_5"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3266:1: rule__MegalEntity__ManyAssignment_5 : ( ( '+' ) ) ;
    public final void rule__MegalEntity__ManyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3270:1: ( ( ( '+' ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3271:1: ( ( '+' ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3271:1: ( ( '+' ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3272:1: ( '+' )
            {
             before(grammarAccess.getMegalEntityAccess().getManyPlusSignKeyword_5_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3273:1: ( '+' )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3274:1: '+'
            {
             before(grammarAccess.getMegalEntityAccess().getManyPlusSignKeyword_5_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MegalEntity__ManyAssignment_56549); 
             after(grammarAccess.getMegalEntityAccess().getManyPlusSignKeyword_5_0()); 

            }

             after(grammarAccess.getMegalEntityAccess().getManyPlusSignKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalEntity__ManyAssignment_5"


    // $ANTLR start "rule__MegalRelationship__AnnotationsAssignment_0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3289:1: rule__MegalRelationship__AnnotationsAssignment_0 : ( ruleMegalAnnotation ) ;
    public final void rule__MegalRelationship__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3293:1: ( ( ruleMegalAnnotation ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3294:1: ( ruleMegalAnnotation )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3294:1: ( ruleMegalAnnotation )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3295:1: ruleMegalAnnotation
            {
             before(grammarAccess.getMegalRelationshipAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMegalAnnotation_in_rule__MegalRelationship__AnnotationsAssignment_06588);
            ruleMegalAnnotation();

            state._fsp--;

             after(grammarAccess.getMegalRelationshipAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationship__AnnotationsAssignment_0"


    // $ANTLR start "rule__MegalRelationship__LeftAssignment_1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3304:1: rule__MegalRelationship__LeftAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MegalRelationship__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3308:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3309:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3309:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3310:1: ( RULE_ID )
            {
             before(grammarAccess.getMegalRelationshipAccess().getLeftMegalEntityCrossReference_1_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3311:1: ( RULE_ID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3312:1: RULE_ID
            {
             before(grammarAccess.getMegalRelationshipAccess().getLeftMegalEntityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MegalRelationship__LeftAssignment_16623); 
             after(grammarAccess.getMegalRelationshipAccess().getLeftMegalEntityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMegalRelationshipAccess().getLeftMegalEntityCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationship__LeftAssignment_1"


    // $ANTLR start "rule__MegalRelationship__TypeAssignment_2"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3323:1: rule__MegalRelationship__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__MegalRelationship__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3327:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3328:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3328:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3329:1: ( RULE_ID )
            {
             before(grammarAccess.getMegalRelationshipAccess().getTypeMegalRelationshipTypeCrossReference_2_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3330:1: ( RULE_ID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3331:1: RULE_ID
            {
             before(grammarAccess.getMegalRelationshipAccess().getTypeMegalRelationshipTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MegalRelationship__TypeAssignment_26662); 
             after(grammarAccess.getMegalRelationshipAccess().getTypeMegalRelationshipTypeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMegalRelationshipAccess().getTypeMegalRelationshipTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationship__TypeAssignment_2"


    // $ANTLR start "rule__MegalRelationship__RightAssignment_3"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3342:1: rule__MegalRelationship__RightAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__MegalRelationship__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3346:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3347:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3347:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3348:1: ( RULE_ID )
            {
             before(grammarAccess.getMegalRelationshipAccess().getRightMegalEntityCrossReference_3_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3349:1: ( RULE_ID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3350:1: RULE_ID
            {
             before(grammarAccess.getMegalRelationshipAccess().getRightMegalEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MegalRelationship__RightAssignment_36701); 
             after(grammarAccess.getMegalRelationshipAccess().getRightMegalEntityIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMegalRelationshipAccess().getRightMegalEntityCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalRelationship__RightAssignment_3"


    // $ANTLR start "rule__MegalPair__AnnotationsAssignment_0"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3361:1: rule__MegalPair__AnnotationsAssignment_0 : ( ruleMegalAnnotation ) ;
    public final void rule__MegalPair__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3365:1: ( ( ruleMegalAnnotation ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3366:1: ( ruleMegalAnnotation )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3366:1: ( ruleMegalAnnotation )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3367:1: ruleMegalAnnotation
            {
             before(grammarAccess.getMegalPairAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleMegalAnnotation_in_rule__MegalPair__AnnotationsAssignment_06736);
            ruleMegalAnnotation();

            state._fsp--;

             after(grammarAccess.getMegalPairAccess().getAnnotationsMegalAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalPair__AnnotationsAssignment_0"


    // $ANTLR start "rule__MegalPair__SetAssignment_1"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3376:1: rule__MegalPair__SetAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MegalPair__SetAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3380:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3381:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3381:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3382:1: ( RULE_ID )
            {
             before(grammarAccess.getMegalPairAccess().getSetMegalEntityCrossReference_1_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3383:1: ( RULE_ID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3384:1: RULE_ID
            {
             before(grammarAccess.getMegalPairAccess().getSetMegalEntityIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MegalPair__SetAssignment_16771); 
             after(grammarAccess.getMegalPairAccess().getSetMegalEntityIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMegalPairAccess().getSetMegalEntityCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalPair__SetAssignment_1"


    // $ANTLR start "rule__MegalPair__FirstAssignment_3"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3395:1: rule__MegalPair__FirstAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__MegalPair__FirstAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3399:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3400:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3400:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3401:1: ( RULE_ID )
            {
             before(grammarAccess.getMegalPairAccess().getFirstMegalEntityCrossReference_3_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3402:1: ( RULE_ID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3403:1: RULE_ID
            {
             before(grammarAccess.getMegalPairAccess().getFirstMegalEntityIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MegalPair__FirstAssignment_36810); 
             after(grammarAccess.getMegalPairAccess().getFirstMegalEntityIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMegalPairAccess().getFirstMegalEntityCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalPair__FirstAssignment_3"


    // $ANTLR start "rule__MegalPair__SecondAssignment_6"
    // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3414:1: rule__MegalPair__SecondAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__MegalPair__SecondAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3418:1: ( ( ( RULE_ID ) ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3419:1: ( ( RULE_ID ) )
            {
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3419:1: ( ( RULE_ID ) )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3420:1: ( RULE_ID )
            {
             before(grammarAccess.getMegalPairAccess().getSecondMegalEntityCrossReference_6_0()); 
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3421:1: ( RULE_ID )
            // ../org.softlang.megal.language.ui/src-gen/org/softlang/megal/language/ui/contentassist/antlr/internal/InternalMegal.g:3422:1: RULE_ID
            {
             before(grammarAccess.getMegalPairAccess().getSecondMegalEntityIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__MegalPair__SecondAssignment_66849); 
             after(grammarAccess.getMegalPairAccess().getSecondMegalEntityIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getMegalPairAccess().getSecondMegalEntityCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MegalPair__SecondAssignment_6"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\23\uffff";
    static final String DFA1_eofS =
        "\15\uffff\1\10\3\uffff\1\22\1\uffff";
    static final String DFA1_minS =
        "\1\4\1\uffff\4\4\1\uffff\1\4\3\uffff\1\4\1\15\1\4\1\16\1\uffff\2\4\1\uffff";
    static final String DFA1_maxS =
        "\1\12\1\uffff\1\4\1\26\1\12\1\4\1\uffff\1\4\3\uffff\1\12\1\15\1\30\1\16\1\uffff\1\4\1\13\1\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\4\uffff\1\5\1\uffff\1\2\1\4\1\7\4\uffff\1\3\2\uffff\1\6";
    static final String DFA1_specialS =
        "\23\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\3\4\uffff\1\1\1\2",
            "",
            "\1\4",
            "\1\6\6\uffff\1\12\1\5\2\uffff\1\7\1\10\5\uffff\1\11",
            "\1\3\1\13\4\uffff\1\2",
            "\1\14",
            "",
            "\1\15",
            "",
            "",
            "",
            "\1\3\5\uffff\1\2",
            "\1\16",
            "\1\10\4\uffff\2\10\7\uffff\2\17\3\uffff\2\17",
            "\1\20",
            "",
            "\1\21",
            "\1\22\4\uffff\2\22\1\12",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "284:1: rule__MegalFile__Alternatives_3 : ( ( ( rule__MegalFile__Group_3_0__0 ) ) | ( ( rule__MegalFile__DeclarationsAssignment_3_1 ) ) | ( ( rule__MegalFile__DeclarationsAssignment_3_2 ) ) | ( ( rule__MegalFile__DeclarationsAssignment_3_3 ) ) | ( ( rule__MegalFile__DeclarationsAssignment_3_4 ) ) | ( ( rule__MegalFile__DeclarationsAssignment_3_5 ) ) | ( ( rule__MegalFile__BindingsAssignment_3_6 ) ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleMegalFile_in_entryRuleMegalFile61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMegalFile68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalFile__Group__0_in_ruleMegalFile94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMegalAnnotation_in_entryRuleMegalAnnotation121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMegalAnnotation128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalAnnotation__Group__0_in_ruleMegalAnnotation154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMegalLink_in_entryRuleMegalLink181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMegalLink188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalLink__Group__0_in_ruleMegalLink214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMegalEntityType_in_entryRuleMegalEntityType241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMegalEntityType248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalEntityType__Group__0_in_ruleMegalEntityType274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMegalRelationshipType_in_entryRuleMegalRelationshipType301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMegalRelationshipType308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group__0_in_ruleMegalRelationshipType334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMegalEntity_in_entryRuleMegalEntity361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMegalEntity368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalEntity__Group__0_in_ruleMegalEntity394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMegalRelationship_in_entryRuleMegalRelationship421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMegalRelationship428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationship__Group__0_in_ruleMegalRelationship454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMegalPair_in_entryRuleMegalPair481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMegalPair488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalPair__Group__0_in_ruleMegalPair514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalFile__Group_3_0__0_in_rule__MegalFile__Alternatives_3550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalFile__DeclarationsAssignment_3_1_in_rule__MegalFile__Alternatives_3568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalFile__DeclarationsAssignment_3_2_in_rule__MegalFile__Alternatives_3586 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalFile__DeclarationsAssignment_3_3_in_rule__MegalFile__Alternatives_3604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalFile__DeclarationsAssignment_3_4_in_rule__MegalFile__Alternatives_3622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalFile__DeclarationsAssignment_3_5_in_rule__MegalFile__Alternatives_3640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalFile__BindingsAssignment_3_6_in_rule__MegalFile__Alternatives_3658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalEntityType__Group_2_0__0_in_rule__MegalEntityType__Alternatives_2691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalEntityType__Group_2_1__0_in_rule__MegalEntityType__Alternatives_2709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__LeftBothAssignment_5_0_in_rule__MegalRelationshipType__Alternatives_5742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__LeftManyAssignment_5_1_in_rule__MegalRelationshipType__Alternatives_5760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__RightBothAssignment_9_0_in_rule__MegalRelationshipType__Alternatives_9793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__RightManyAssignment_9_1_in_rule__MegalRelationshipType__Alternatives_9811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalFile__Group__0__Impl_in_rule__MegalFile__Group__0842 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_rule__MegalFile__Group__1_in_rule__MegalFile__Group__0845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalFile__AnnotationsAssignment_0_in_rule__MegalFile__Group__0__Impl872 = new BitSet(new long[]{0x0000000000000402L});
        public static final BitSet FOLLOW_rule__MegalFile__Group__1__Impl_in_rule__MegalFile__Group__1903 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MegalFile__Group__2_in_rule__MegalFile__Group__1906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_8_in_rule__MegalFile__Group__1__Impl934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalFile__Group__2__Impl_in_rule__MegalFile__Group__2965 = new BitSet(new long[]{0x0000000000000610L});
        public static final BitSet FOLLOW_rule__MegalFile__Group__3_in_rule__MegalFile__Group__2968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalFile__NameAssignment_2_in_rule__MegalFile__Group__2__Impl995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalFile__Group__3__Impl_in_rule__MegalFile__Group__31025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalFile__Alternatives_3_in_rule__MegalFile__Group__3__Impl1052 = new BitSet(new long[]{0x0000000000000612L});
        public static final BitSet FOLLOW_rule__MegalFile__Group_3_0__0__Impl_in_rule__MegalFile__Group_3_0__01091 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MegalFile__Group_3_0__1_in_rule__MegalFile__Group_3_0__01094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_9_in_rule__MegalFile__Group_3_0__0__Impl1122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalFile__Group_3_0__1__Impl_in_rule__MegalFile__Group_3_0__11153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalFile__ImportsAssignment_3_0_1_in_rule__MegalFile__Group_3_0__1__Impl1180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalAnnotation__Group__0__Impl_in_rule__MegalAnnotation__Group__01214 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MegalAnnotation__Group__1_in_rule__MegalAnnotation__Group__01217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_10_in_rule__MegalAnnotation__Group__0__Impl1245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalAnnotation__Group__1__Impl_in_rule__MegalAnnotation__Group__11276 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MegalAnnotation__Group__2_in_rule__MegalAnnotation__Group__11279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalAnnotation__KeyAssignment_1_in_rule__MegalAnnotation__Group__1__Impl1306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalAnnotation__Group__2__Impl_in_rule__MegalAnnotation__Group__21336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalAnnotation__ValueAssignment_2_in_rule__MegalAnnotation__Group__2__Impl1363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalLink__Group__0__Impl_in_rule__MegalLink__Group__01400 = new BitSet(new long[]{0x0000000000000610L});
        public static final BitSet FOLLOW_rule__MegalLink__Group__1_in_rule__MegalLink__Group__01403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalLink__AnnotationsAssignment_0_in_rule__MegalLink__Group__0__Impl1430 = new BitSet(new long[]{0x0000000000000402L});
        public static final BitSet FOLLOW_rule__MegalLink__Group__1__Impl_in_rule__MegalLink__Group__11461 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__MegalLink__Group__2_in_rule__MegalLink__Group__11464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalLink__LinkAssignment_1_in_rule__MegalLink__Group__1__Impl1491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalLink__Group__2__Impl_in_rule__MegalLink__Group__21521 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__MegalLink__Group__3_in_rule__MegalLink__Group__21524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalLink__Group_2__0_in_rule__MegalLink__Group__2__Impl1551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalLink__Group__3__Impl_in_rule__MegalLink__Group__31582 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__MegalLink__Group__4_in_rule__MegalLink__Group__31585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__MegalLink__Group__3__Impl1613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalLink__Group__4__Impl_in_rule__MegalLink__Group__41644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalLink__ToAssignment_4_in_rule__MegalLink__Group__4__Impl1671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalLink__Group_2__0__Impl_in_rule__MegalLink__Group_2__01711 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MegalLink__Group_2__1_in_rule__MegalLink__Group_2__01714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MegalLink__Group_2__0__Impl1742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalLink__Group_2__1__Impl_in_rule__MegalLink__Group_2__11773 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__MegalLink__Group_2__2_in_rule__MegalLink__Group_2__11776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalLink__FirstAssignment_2_1_in_rule__MegalLink__Group_2__1__Impl1803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalLink__Group_2__2__Impl_in_rule__MegalLink__Group_2__21833 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__MegalLink__Group_2__3_in_rule__MegalLink__Group_2__21836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__MegalLink__Group_2__2__Impl1864 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalLink__Group_2__3__Impl_in_rule__MegalLink__Group_2__31895 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MegalLink__Group_2__4_in_rule__MegalLink__Group_2__31898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__MegalLink__Group_2__3__Impl1926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalLink__Group_2__4__Impl_in_rule__MegalLink__Group_2__41957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalLink__SecondAssignment_2_4_in_rule__MegalLink__Group_2__4__Impl1984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalEntityType__Group__0__Impl_in_rule__MegalEntityType__Group__02024 = new BitSet(new long[]{0x0000000000000410L});
        public static final BitSet FOLLOW_rule__MegalEntityType__Group__1_in_rule__MegalEntityType__Group__02027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalEntityType__AnnotationsAssignment_0_in_rule__MegalEntityType__Group__0__Impl2054 = new BitSet(new long[]{0x0000000000000402L});
        public static final BitSet FOLLOW_rule__MegalEntityType__Group__1__Impl_in_rule__MegalEntityType__Group__12085 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_rule__MegalEntityType__Group__2_in_rule__MegalEntityType__Group__12088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalEntityType__NameAssignment_1_in_rule__MegalEntityType__Group__1__Impl2115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalEntityType__Group__2__Impl_in_rule__MegalEntityType__Group__22145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalEntityType__Alternatives_2_in_rule__MegalEntityType__Group__2__Impl2172 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalEntityType__Group_2_0__0__Impl_in_rule__MegalEntityType__Group_2_0__02208 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MegalEntityType__Group_2_0__1_in_rule__MegalEntityType__Group_2_0__02211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__MegalEntityType__Group_2_0__0__Impl2239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalEntityType__Group_2_0__1__Impl_in_rule__MegalEntityType__Group_2_0__12270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalEntityType__SupertypeAssignment_2_0_1_in_rule__MegalEntityType__Group_2_0__1__Impl2297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalEntityType__Group_2_1__0__Impl_in_rule__MegalEntityType__Group_2_1__02331 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__MegalEntityType__Group_2_1__1_in_rule__MegalEntityType__Group_2_1__02334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__MegalEntityType__Group_2_1__0__Impl2362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalEntityType__Group_2_1__1__Impl_in_rule__MegalEntityType__Group_2_1__12393 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__MegalEntityType__Group_2_1__1__Impl2421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group__0__Impl_in_rule__MegalRelationshipType__Group__02456 = new BitSet(new long[]{0x0000000000000410L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group__1_in_rule__MegalRelationshipType__Group__02459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__AnnotationsAssignment_0_in_rule__MegalRelationshipType__Group__0__Impl2486 = new BitSet(new long[]{0x0000000000000402L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group__1__Impl_in_rule__MegalRelationshipType__Group__12517 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group__2_in_rule__MegalRelationshipType__Group__12520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__NameAssignment_1_in_rule__MegalRelationshipType__Group__1__Impl2547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group__2__Impl_in_rule__MegalRelationshipType__Group__22577 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group__3_in_rule__MegalRelationshipType__Group__22580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__MegalRelationshipType__Group__2__Impl2608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group__3__Impl_in_rule__MegalRelationshipType__Group__32639 = new BitSet(new long[]{0x00000000018C0000L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group__4_in_rule__MegalRelationshipType__Group__32642 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__LeftAssignment_3_in_rule__MegalRelationshipType__Group__3__Impl2669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group__4__Impl_in_rule__MegalRelationshipType__Group__42699 = new BitSet(new long[]{0x00000000018C0000L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group__5_in_rule__MegalRelationshipType__Group__42702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group_4__0_in_rule__MegalRelationshipType__Group__4__Impl2729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group__5__Impl_in_rule__MegalRelationshipType__Group__52760 = new BitSet(new long[]{0x00000000018C0000L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group__6_in_rule__MegalRelationshipType__Group__52763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Alternatives_5_in_rule__MegalRelationshipType__Group__5__Impl2790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group__6__Impl_in_rule__MegalRelationshipType__Group__62821 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group__7_in_rule__MegalRelationshipType__Group__62824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__MegalRelationshipType__Group__6__Impl2852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group__7__Impl_in_rule__MegalRelationshipType__Group__72883 = new BitSet(new long[]{0x0000000001880000L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group__8_in_rule__MegalRelationshipType__Group__72886 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__RightAssignment_7_in_rule__MegalRelationshipType__Group__7__Impl2913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group__8__Impl_in_rule__MegalRelationshipType__Group__82943 = new BitSet(new long[]{0x0000000001880000L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group__9_in_rule__MegalRelationshipType__Group__82946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group_8__0_in_rule__MegalRelationshipType__Group__8__Impl2973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group__9__Impl_in_rule__MegalRelationshipType__Group__93004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Alternatives_9_in_rule__MegalRelationshipType__Group__9__Impl3031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group_4__0__Impl_in_rule__MegalRelationshipType__Group_4__03082 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group_4__1_in_rule__MegalRelationshipType__Group_4__03085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__MegalRelationshipType__Group_4__0__Impl3113 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group_4__1__Impl_in_rule__MegalRelationshipType__Group_4__13144 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group_4__2_in_rule__MegalRelationshipType__Group_4__13147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__LeftParamsAssignment_4_1_in_rule__MegalRelationshipType__Group_4__1__Impl3174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group_4__2__Impl_in_rule__MegalRelationshipType__Group_4__23204 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group_4__3_in_rule__MegalRelationshipType__Group_4__23207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group_4_2__0_in_rule__MegalRelationshipType__Group_4__2__Impl3234 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group_4__3__Impl_in_rule__MegalRelationshipType__Group_4__33265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__MegalRelationshipType__Group_4__3__Impl3293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group_4_2__0__Impl_in_rule__MegalRelationshipType__Group_4_2__03332 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group_4_2__1_in_rule__MegalRelationshipType__Group_4_2__03335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__MegalRelationshipType__Group_4_2__0__Impl3363 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group_4_2__1__Impl_in_rule__MegalRelationshipType__Group_4_2__13394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__LeftParamsAssignment_4_2_1_in_rule__MegalRelationshipType__Group_4_2__1__Impl3421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group_8__0__Impl_in_rule__MegalRelationshipType__Group_8__03455 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group_8__1_in_rule__MegalRelationshipType__Group_8__03458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__MegalRelationshipType__Group_8__0__Impl3486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group_8__1__Impl_in_rule__MegalRelationshipType__Group_8__13517 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group_8__2_in_rule__MegalRelationshipType__Group_8__13520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__RightParamsAssignment_8_1_in_rule__MegalRelationshipType__Group_8__1__Impl3547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group_8__2__Impl_in_rule__MegalRelationshipType__Group_8__23577 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group_8__3_in_rule__MegalRelationshipType__Group_8__23580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group_8_2__0_in_rule__MegalRelationshipType__Group_8__2__Impl3607 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group_8__3__Impl_in_rule__MegalRelationshipType__Group_8__33638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__MegalRelationshipType__Group_8__3__Impl3666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group_8_2__0__Impl_in_rule__MegalRelationshipType__Group_8_2__03705 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group_8_2__1_in_rule__MegalRelationshipType__Group_8_2__03708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__MegalRelationshipType__Group_8_2__0__Impl3736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__Group_8_2__1__Impl_in_rule__MegalRelationshipType__Group_8_2__13767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationshipType__RightParamsAssignment_8_2_1_in_rule__MegalRelationshipType__Group_8_2__1__Impl3794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalEntity__Group__0__Impl_in_rule__MegalEntity__Group__03828 = new BitSet(new long[]{0x0000000000000410L});
        public static final BitSet FOLLOW_rule__MegalEntity__Group__1_in_rule__MegalEntity__Group__03831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalEntity__AnnotationsAssignment_0_in_rule__MegalEntity__Group__0__Impl3858 = new BitSet(new long[]{0x0000000000000402L});
        public static final BitSet FOLLOW_rule__MegalEntity__Group__1__Impl_in_rule__MegalEntity__Group__13889 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__MegalEntity__Group__2_in_rule__MegalEntity__Group__13892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalEntity__NameAssignment_1_in_rule__MegalEntity__Group__1__Impl3919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalEntity__Group__2__Impl_in_rule__MegalEntity__Group__23949 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MegalEntity__Group__3_in_rule__MegalEntity__Group__23952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__MegalEntity__Group__2__Impl3980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalEntity__Group__3__Impl_in_rule__MegalEntity__Group__34011 = new BitSet(new long[]{0x0000000001080000L});
        public static final BitSet FOLLOW_rule__MegalEntity__Group__4_in_rule__MegalEntity__Group__34014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalEntity__TypeAssignment_3_in_rule__MegalEntity__Group__3__Impl4041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalEntity__Group__4__Impl_in_rule__MegalEntity__Group__44071 = new BitSet(new long[]{0x0000000001080000L});
        public static final BitSet FOLLOW_rule__MegalEntity__Group__5_in_rule__MegalEntity__Group__44074 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalEntity__Group_4__0_in_rule__MegalEntity__Group__4__Impl4101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalEntity__Group__5__Impl_in_rule__MegalEntity__Group__54132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalEntity__ManyAssignment_5_in_rule__MegalEntity__Group__5__Impl4159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalEntity__Group_4__0__Impl_in_rule__MegalEntity__Group_4__04202 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MegalEntity__Group_4__1_in_rule__MegalEntity__Group_4__04205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__MegalEntity__Group_4__0__Impl4233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalEntity__Group_4__1__Impl_in_rule__MegalEntity__Group_4__14264 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_rule__MegalEntity__Group_4__2_in_rule__MegalEntity__Group_4__14267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalEntity__ParamsAssignment_4_1_in_rule__MegalEntity__Group_4__1__Impl4294 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalEntity__Group_4__2__Impl_in_rule__MegalEntity__Group_4__24324 = new BitSet(new long[]{0x0000000000300000L});
        public static final BitSet FOLLOW_rule__MegalEntity__Group_4__3_in_rule__MegalEntity__Group_4__24327 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalEntity__Group_4_2__0_in_rule__MegalEntity__Group_4__2__Impl4354 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_rule__MegalEntity__Group_4__3__Impl_in_rule__MegalEntity__Group_4__34385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__MegalEntity__Group_4__3__Impl4413 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalEntity__Group_4_2__0__Impl_in_rule__MegalEntity__Group_4_2__04452 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MegalEntity__Group_4_2__1_in_rule__MegalEntity__Group_4_2__04455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__MegalEntity__Group_4_2__0__Impl4483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalEntity__Group_4_2__1__Impl_in_rule__MegalEntity__Group_4_2__14514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalEntity__ParamsAssignment_4_2_1_in_rule__MegalEntity__Group_4_2__1__Impl4541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationship__Group__0__Impl_in_rule__MegalRelationship__Group__04575 = new BitSet(new long[]{0x0000000000000410L});
        public static final BitSet FOLLOW_rule__MegalRelationship__Group__1_in_rule__MegalRelationship__Group__04578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationship__AnnotationsAssignment_0_in_rule__MegalRelationship__Group__0__Impl4605 = new BitSet(new long[]{0x0000000000000402L});
        public static final BitSet FOLLOW_rule__MegalRelationship__Group__1__Impl_in_rule__MegalRelationship__Group__14636 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MegalRelationship__Group__2_in_rule__MegalRelationship__Group__14639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationship__LeftAssignment_1_in_rule__MegalRelationship__Group__1__Impl4666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationship__Group__2__Impl_in_rule__MegalRelationship__Group__24696 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MegalRelationship__Group__3_in_rule__MegalRelationship__Group__24699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationship__TypeAssignment_2_in_rule__MegalRelationship__Group__2__Impl4726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationship__Group__3__Impl_in_rule__MegalRelationship__Group__34756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalRelationship__RightAssignment_3_in_rule__MegalRelationship__Group__3__Impl4783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalPair__Group__0__Impl_in_rule__MegalPair__Group__04821 = new BitSet(new long[]{0x0000000000000410L});
        public static final BitSet FOLLOW_rule__MegalPair__Group__1_in_rule__MegalPair__Group__04824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalPair__AnnotationsAssignment_0_in_rule__MegalPair__Group__0__Impl4851 = new BitSet(new long[]{0x0000000000000402L});
        public static final BitSet FOLLOW_rule__MegalPair__Group__1__Impl_in_rule__MegalPair__Group__14882 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__MegalPair__Group__2_in_rule__MegalPair__Group__14885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalPair__SetAssignment_1_in_rule__MegalPair__Group__1__Impl4912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalPair__Group__2__Impl_in_rule__MegalPair__Group__24942 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MegalPair__Group__3_in_rule__MegalPair__Group__24945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__MegalPair__Group__2__Impl4973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalPair__Group__3__Impl_in_rule__MegalPair__Group__35004 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__MegalPair__Group__4_in_rule__MegalPair__Group__35007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalPair__FirstAssignment_3_in_rule__MegalPair__Group__3__Impl5034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalPair__Group__4__Impl_in_rule__MegalPair__Group__45064 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_rule__MegalPair__Group__5_in_rule__MegalPair__Group__45067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__MegalPair__Group__4__Impl5095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalPair__Group__5__Impl_in_rule__MegalPair__Group__55126 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__MegalPair__Group__6_in_rule__MegalPair__Group__55129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__MegalPair__Group__5__Impl5157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalPair__Group__6__Impl_in_rule__MegalPair__Group__65188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MegalPair__SecondAssignment_6_in_rule__MegalPair__Group__6__Impl5215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMegalAnnotation_in_rule__MegalFile__AnnotationsAssignment_05264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MegalFile__NameAssignment_25295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MegalFile__ImportsAssignment_3_0_15330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMegalEntityType_in_rule__MegalFile__DeclarationsAssignment_3_15365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMegalRelationshipType_in_rule__MegalFile__DeclarationsAssignment_3_25396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMegalEntity_in_rule__MegalFile__DeclarationsAssignment_3_35427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMegalRelationship_in_rule__MegalFile__DeclarationsAssignment_3_45458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMegalPair_in_rule__MegalFile__DeclarationsAssignment_3_55489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMegalLink_in_rule__MegalFile__BindingsAssignment_3_65520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MegalAnnotation__KeyAssignment_15551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__MegalAnnotation__ValueAssignment_25582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMegalAnnotation_in_rule__MegalLink__AnnotationsAssignment_05613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MegalLink__LinkAssignment_15648 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MegalLink__FirstAssignment_2_15687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MegalLink__SecondAssignment_2_45726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__MegalLink__ToAssignment_45761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMegalAnnotation_in_rule__MegalEntityType__AnnotationsAssignment_05792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MegalEntityType__NameAssignment_15823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MegalEntityType__SupertypeAssignment_2_0_15858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMegalAnnotation_in_rule__MegalRelationshipType__AnnotationsAssignment_05893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MegalRelationshipType__NameAssignment_15924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MegalRelationshipType__LeftAssignment_35959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MegalRelationshipType__LeftParamsAssignment_4_15998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MegalRelationshipType__LeftParamsAssignment_4_2_16037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__MegalRelationshipType__LeftBothAssignment_5_06077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MegalRelationshipType__LeftManyAssignment_5_16121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MegalRelationshipType__RightAssignment_76164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MegalRelationshipType__RightParamsAssignment_8_16203 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MegalRelationshipType__RightParamsAssignment_8_2_16242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__MegalRelationshipType__RightBothAssignment_9_06282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MegalRelationshipType__RightManyAssignment_9_16326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMegalAnnotation_in_rule__MegalEntity__AnnotationsAssignment_06365 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MegalEntity__NameAssignment_16396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MegalEntity__TypeAssignment_36431 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MegalEntity__ParamsAssignment_4_16470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MegalEntity__ParamsAssignment_4_2_16509 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MegalEntity__ManyAssignment_56549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMegalAnnotation_in_rule__MegalRelationship__AnnotationsAssignment_06588 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MegalRelationship__LeftAssignment_16623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MegalRelationship__TypeAssignment_26662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MegalRelationship__RightAssignment_36701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMegalAnnotation_in_rule__MegalPair__AnnotationsAssignment_06736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MegalPair__SetAssignment_16771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MegalPair__FirstAssignment_36810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__MegalPair__SecondAssignment_66849 = new BitSet(new long[]{0x0000000000000002L});
    }


}