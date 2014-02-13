package org.xtext.mgpl.ui.contentassist.antlr.internal; 

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
import org.xtext.mgpl.services.MgplDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMgplDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'rectangle'", "'triangle'", "'circle'", "'space'", "'leftarrow'", "'rightarrow'", "'uparrow'", "'downarrow'", "'=='", "'<'", "'<='", "'+'", "'-'", "'*'", "'/'", "'!'", "'game'", "'('", "')'", "';'", "'int'", "'='", "'['", "']'", "'animation'", "'on'", "'{'", "'}'", "'for'", "'if'", "'else'", "','", "'||'", "'&&'", "'touches'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=6;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalMgplDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMgplDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMgplDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g"; }


     
     	private MgplDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MgplDSLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:61:1: ( ruleModel EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:76:1: ( rule__Model__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDeclaration"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:88:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:89:1: ( ruleDeclaration EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:90:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration121);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration128); 

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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:97:1: ruleDeclaration : ( ( rule__Declaration__Group__0 ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:101:2: ( ( ( rule__Declaration__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:102:1: ( ( rule__Declaration__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:102:1: ( ( rule__Declaration__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:103:1: ( rule__Declaration__Group__0 )
            {
             before(grammarAccess.getDeclarationAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:104:1: ( rule__Declaration__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:104:2: rule__Declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0_in_ruleDeclaration154);
            rule__Declaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleVarDecl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:116:1: entryRuleVarDecl : ruleVarDecl EOF ;
    public final void entryRuleVarDecl() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:117:1: ( ruleVarDecl EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:118:1: ruleVarDecl EOF
            {
             before(grammarAccess.getVarDeclRule()); 
            pushFollow(FOLLOW_ruleVarDecl_in_entryRuleVarDecl181);
            ruleVarDecl();

            state._fsp--;

             after(grammarAccess.getVarDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDecl188); 

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
    // $ANTLR end "entryRuleVarDecl"


    // $ANTLR start "ruleVarDecl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:125:1: ruleVarDecl : ( ( rule__VarDecl__Group__0 ) ) ;
    public final void ruleVarDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:129:2: ( ( ( rule__VarDecl__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:130:1: ( ( rule__VarDecl__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:130:1: ( ( rule__VarDecl__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:131:1: ( rule__VarDecl__Group__0 )
            {
             before(grammarAccess.getVarDeclAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:132:1: ( rule__VarDecl__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:132:2: rule__VarDecl__Group__0
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__0_in_ruleVarDecl214);
            rule__VarDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclAccess().getGroup()); 

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
    // $ANTLR end "ruleVarDecl"


    // $ANTLR start "entryRuleObjDecl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:144:1: entryRuleObjDecl : ruleObjDecl EOF ;
    public final void entryRuleObjDecl() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:145:1: ( ruleObjDecl EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:146:1: ruleObjDecl EOF
            {
             before(grammarAccess.getObjDeclRule()); 
            pushFollow(FOLLOW_ruleObjDecl_in_entryRuleObjDecl241);
            ruleObjDecl();

            state._fsp--;

             after(grammarAccess.getObjDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjDecl248); 

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
    // $ANTLR end "entryRuleObjDecl"


    // $ANTLR start "ruleObjDecl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:153:1: ruleObjDecl : ( ( rule__ObjDecl__Group__0 ) ) ;
    public final void ruleObjDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:157:2: ( ( ( rule__ObjDecl__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:158:1: ( ( rule__ObjDecl__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:158:1: ( ( rule__ObjDecl__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:159:1: ( rule__ObjDecl__Group__0 )
            {
             before(grammarAccess.getObjDeclAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:160:1: ( rule__ObjDecl__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:160:2: rule__ObjDecl__Group__0
            {
            pushFollow(FOLLOW_rule__ObjDecl__Group__0_in_ruleObjDecl274);
            rule__ObjDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjDeclAccess().getGroup()); 

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
    // $ANTLR end "ruleObjDecl"


    // $ANTLR start "entryRuleBlock"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:172:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:173:1: ( ruleBlock EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:174:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock301);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock308); 

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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:181:1: ruleBlock : ( ( rule__Block__Alternatives ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:185:2: ( ( ( rule__Block__Alternatives ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:186:1: ( ( rule__Block__Alternatives ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:186:1: ( ( rule__Block__Alternatives ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:187:1: ( rule__Block__Alternatives )
            {
             before(grammarAccess.getBlockAccess().getAlternatives()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:188:1: ( rule__Block__Alternatives )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:188:2: rule__Block__Alternatives
            {
            pushFollow(FOLLOW_rule__Block__Alternatives_in_ruleBlock334);
            rule__Block__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getAlternatives()); 

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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleAnimBlock"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:200:1: entryRuleAnimBlock : ruleAnimBlock EOF ;
    public final void entryRuleAnimBlock() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:201:1: ( ruleAnimBlock EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:202:1: ruleAnimBlock EOF
            {
             before(grammarAccess.getAnimBlockRule()); 
            pushFollow(FOLLOW_ruleAnimBlock_in_entryRuleAnimBlock361);
            ruleAnimBlock();

            state._fsp--;

             after(grammarAccess.getAnimBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnimBlock368); 

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
    // $ANTLR end "entryRuleAnimBlock"


    // $ANTLR start "ruleAnimBlock"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:209:1: ruleAnimBlock : ( ( rule__AnimBlock__Group__0 ) ) ;
    public final void ruleAnimBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:213:2: ( ( ( rule__AnimBlock__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:214:1: ( ( rule__AnimBlock__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:214:1: ( ( rule__AnimBlock__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:215:1: ( rule__AnimBlock__Group__0 )
            {
             before(grammarAccess.getAnimBlockAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:216:1: ( rule__AnimBlock__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:216:2: rule__AnimBlock__Group__0
            {
            pushFollow(FOLLOW_rule__AnimBlock__Group__0_in_ruleAnimBlock394);
            rule__AnimBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnimBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleAnimBlock"


    // $ANTLR start "entryRuleEventBlock"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:228:1: entryRuleEventBlock : ruleEventBlock EOF ;
    public final void entryRuleEventBlock() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:229:1: ( ruleEventBlock EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:230:1: ruleEventBlock EOF
            {
             before(grammarAccess.getEventBlockRule()); 
            pushFollow(FOLLOW_ruleEventBlock_in_entryRuleEventBlock421);
            ruleEventBlock();

            state._fsp--;

             after(grammarAccess.getEventBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventBlock428); 

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
    // $ANTLR end "entryRuleEventBlock"


    // $ANTLR start "ruleEventBlock"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:237:1: ruleEventBlock : ( ( rule__EventBlock__Group__0 ) ) ;
    public final void ruleEventBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:241:2: ( ( ( rule__EventBlock__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:242:1: ( ( rule__EventBlock__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:242:1: ( ( rule__EventBlock__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:243:1: ( rule__EventBlock__Group__0 )
            {
             before(grammarAccess.getEventBlockAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:244:1: ( rule__EventBlock__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:244:2: rule__EventBlock__Group__0
            {
            pushFollow(FOLLOW_rule__EventBlock__Group__0_in_ruleEventBlock454);
            rule__EventBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleEventBlock"


    // $ANTLR start "entryRuleObjType"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:256:1: entryRuleObjType : ruleObjType EOF ;
    public final void entryRuleObjType() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:257:1: ( ruleObjType EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:258:1: ruleObjType EOF
            {
             before(grammarAccess.getObjTypeRule()); 
            pushFollow(FOLLOW_ruleObjType_in_entryRuleObjType481);
            ruleObjType();

            state._fsp--;

             after(grammarAccess.getObjTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjType488); 

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
    // $ANTLR end "entryRuleObjType"


    // $ANTLR start "ruleObjType"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:265:1: ruleObjType : ( ( rule__ObjType__Alternatives ) ) ;
    public final void ruleObjType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:269:2: ( ( ( rule__ObjType__Alternatives ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:270:1: ( ( rule__ObjType__Alternatives ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:270:1: ( ( rule__ObjType__Alternatives ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:271:1: ( rule__ObjType__Alternatives )
            {
             before(grammarAccess.getObjTypeAccess().getAlternatives()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:272:1: ( rule__ObjType__Alternatives )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:272:2: rule__ObjType__Alternatives
            {
            pushFollow(FOLLOW_rule__ObjType__Alternatives_in_ruleObjType514);
            rule__ObjType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getObjTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleObjType"


    // $ANTLR start "entryRuleKeystroke"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:284:1: entryRuleKeystroke : ruleKeystroke EOF ;
    public final void entryRuleKeystroke() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:285:1: ( ruleKeystroke EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:286:1: ruleKeystroke EOF
            {
             before(grammarAccess.getKeystrokeRule()); 
            pushFollow(FOLLOW_ruleKeystroke_in_entryRuleKeystroke541);
            ruleKeystroke();

            state._fsp--;

             after(grammarAccess.getKeystrokeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeystroke548); 

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
    // $ANTLR end "entryRuleKeystroke"


    // $ANTLR start "ruleKeystroke"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:293:1: ruleKeystroke : ( ( rule__Keystroke__Alternatives ) ) ;
    public final void ruleKeystroke() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:297:2: ( ( ( rule__Keystroke__Alternatives ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:298:1: ( ( rule__Keystroke__Alternatives ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:298:1: ( ( rule__Keystroke__Alternatives ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:299:1: ( rule__Keystroke__Alternatives )
            {
             before(grammarAccess.getKeystrokeAccess().getAlternatives()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:300:1: ( rule__Keystroke__Alternatives )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:300:2: rule__Keystroke__Alternatives
            {
            pushFollow(FOLLOW_rule__Keystroke__Alternatives_in_ruleKeystroke574);
            rule__Keystroke__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getKeystrokeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleKeystroke"


    // $ANTLR start "entryRuleStatementBlock"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:312:1: entryRuleStatementBlock : ruleStatementBlock EOF ;
    public final void entryRuleStatementBlock() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:313:1: ( ruleStatementBlock EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:314:1: ruleStatementBlock EOF
            {
             before(grammarAccess.getStatementBlockRule()); 
            pushFollow(FOLLOW_ruleStatementBlock_in_entryRuleStatementBlock601);
            ruleStatementBlock();

            state._fsp--;

             after(grammarAccess.getStatementBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatementBlock608); 

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
    // $ANTLR end "entryRuleStatementBlock"


    // $ANTLR start "ruleStatementBlock"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:321:1: ruleStatementBlock : ( ( rule__StatementBlock__Group__0 ) ) ;
    public final void ruleStatementBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:325:2: ( ( ( rule__StatementBlock__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:326:1: ( ( rule__StatementBlock__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:326:1: ( ( rule__StatementBlock__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:327:1: ( rule__StatementBlock__Group__0 )
            {
             before(grammarAccess.getStatementBlockAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:328:1: ( rule__StatementBlock__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:328:2: rule__StatementBlock__Group__0
            {
            pushFollow(FOLLOW_rule__StatementBlock__Group__0_in_ruleStatementBlock634);
            rule__StatementBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatementBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleStatementBlock"


    // $ANTLR start "entryRuleStmt"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:340:1: entryRuleStmt : ruleStmt EOF ;
    public final void entryRuleStmt() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:341:1: ( ruleStmt EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:342:1: ruleStmt EOF
            {
             before(grammarAccess.getStmtRule()); 
            pushFollow(FOLLOW_ruleStmt_in_entryRuleStmt661);
            ruleStmt();

            state._fsp--;

             after(grammarAccess.getStmtRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStmt668); 

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
    // $ANTLR end "entryRuleStmt"


    // $ANTLR start "ruleStmt"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:349:1: ruleStmt : ( ( rule__Stmt__Alternatives ) ) ;
    public final void ruleStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:353:2: ( ( ( rule__Stmt__Alternatives ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:354:1: ( ( rule__Stmt__Alternatives ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:354:1: ( ( rule__Stmt__Alternatives ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:355:1: ( rule__Stmt__Alternatives )
            {
             before(grammarAccess.getStmtAccess().getAlternatives()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:356:1: ( rule__Stmt__Alternatives )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:356:2: rule__Stmt__Alternatives
            {
            pushFollow(FOLLOW_rule__Stmt__Alternatives_in_ruleStmt694);
            rule__Stmt__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStmtAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStmt"


    // $ANTLR start "entryRuleForStmt"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:368:1: entryRuleForStmt : ruleForStmt EOF ;
    public final void entryRuleForStmt() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:369:1: ( ruleForStmt EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:370:1: ruleForStmt EOF
            {
             before(grammarAccess.getForStmtRule()); 
            pushFollow(FOLLOW_ruleForStmt_in_entryRuleForStmt721);
            ruleForStmt();

            state._fsp--;

             after(grammarAccess.getForStmtRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForStmt728); 

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
    // $ANTLR end "entryRuleForStmt"


    // $ANTLR start "ruleForStmt"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:377:1: ruleForStmt : ( ( rule__ForStmt__Group__0 ) ) ;
    public final void ruleForStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:381:2: ( ( ( rule__ForStmt__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:382:1: ( ( rule__ForStmt__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:382:1: ( ( rule__ForStmt__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:383:1: ( rule__ForStmt__Group__0 )
            {
             before(grammarAccess.getForStmtAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:384:1: ( rule__ForStmt__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:384:2: rule__ForStmt__Group__0
            {
            pushFollow(FOLLOW_rule__ForStmt__Group__0_in_ruleForStmt754);
            rule__ForStmt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForStmtAccess().getGroup()); 

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
    // $ANTLR end "ruleForStmt"


    // $ANTLR start "entryRuleIfStmt"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:396:1: entryRuleIfStmt : ruleIfStmt EOF ;
    public final void entryRuleIfStmt() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:397:1: ( ruleIfStmt EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:398:1: ruleIfStmt EOF
            {
             before(grammarAccess.getIfStmtRule()); 
            pushFollow(FOLLOW_ruleIfStmt_in_entryRuleIfStmt781);
            ruleIfStmt();

            state._fsp--;

             after(grammarAccess.getIfStmtRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfStmt788); 

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
    // $ANTLR end "entryRuleIfStmt"


    // $ANTLR start "ruleIfStmt"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:405:1: ruleIfStmt : ( ( rule__IfStmt__Group__0 ) ) ;
    public final void ruleIfStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:409:2: ( ( ( rule__IfStmt__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:410:1: ( ( rule__IfStmt__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:410:1: ( ( rule__IfStmt__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:411:1: ( rule__IfStmt__Group__0 )
            {
             before(grammarAccess.getIfStmtAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:412:1: ( rule__IfStmt__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:412:2: rule__IfStmt__Group__0
            {
            pushFollow(FOLLOW_rule__IfStmt__Group__0_in_ruleIfStmt814);
            rule__IfStmt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfStmtAccess().getGroup()); 

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
    // $ANTLR end "ruleIfStmt"


    // $ANTLR start "entryRuleElseStmt"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:424:1: entryRuleElseStmt : ruleElseStmt EOF ;
    public final void entryRuleElseStmt() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:425:1: ( ruleElseStmt EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:426:1: ruleElseStmt EOF
            {
             before(grammarAccess.getElseStmtRule()); 
            pushFollow(FOLLOW_ruleElseStmt_in_entryRuleElseStmt841);
            ruleElseStmt();

            state._fsp--;

             after(grammarAccess.getElseStmtRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElseStmt848); 

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
    // $ANTLR end "entryRuleElseStmt"


    // $ANTLR start "ruleElseStmt"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:433:1: ruleElseStmt : ( ( rule__ElseStmt__Group__0 ) ) ;
    public final void ruleElseStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:437:2: ( ( ( rule__ElseStmt__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:438:1: ( ( rule__ElseStmt__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:438:1: ( ( rule__ElseStmt__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:439:1: ( rule__ElseStmt__Group__0 )
            {
             before(grammarAccess.getElseStmtAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:440:1: ( rule__ElseStmt__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:440:2: rule__ElseStmt__Group__0
            {
            pushFollow(FOLLOW_rule__ElseStmt__Group__0_in_ruleElseStmt874);
            rule__ElseStmt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElseStmtAccess().getGroup()); 

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
    // $ANTLR end "ruleElseStmt"


    // $ANTLR start "entryRuleAssStmt"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:452:1: entryRuleAssStmt : ruleAssStmt EOF ;
    public final void entryRuleAssStmt() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:453:1: ( ruleAssStmt EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:454:1: ruleAssStmt EOF
            {
             before(grammarAccess.getAssStmtRule()); 
            pushFollow(FOLLOW_ruleAssStmt_in_entryRuleAssStmt901);
            ruleAssStmt();

            state._fsp--;

             after(grammarAccess.getAssStmtRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssStmt908); 

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
    // $ANTLR end "entryRuleAssStmt"


    // $ANTLR start "ruleAssStmt"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:461:1: ruleAssStmt : ( ( rule__AssStmt__Group__0 ) ) ;
    public final void ruleAssStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:465:2: ( ( ( rule__AssStmt__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:466:1: ( ( rule__AssStmt__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:466:1: ( ( rule__AssStmt__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:467:1: ( rule__AssStmt__Group__0 )
            {
             before(grammarAccess.getAssStmtAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:468:1: ( rule__AssStmt__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:468:2: rule__AssStmt__Group__0
            {
            pushFollow(FOLLOW_rule__AssStmt__Group__0_in_ruleAssStmt934);
            rule__AssStmt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssStmtAccess().getGroup()); 

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
    // $ANTLR end "ruleAssStmt"


    // $ANTLR start "entryRuleAssStmt2"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:480:1: entryRuleAssStmt2 : ruleAssStmt2 EOF ;
    public final void entryRuleAssStmt2() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:481:1: ( ruleAssStmt2 EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:482:1: ruleAssStmt2 EOF
            {
             before(grammarAccess.getAssStmt2Rule()); 
            pushFollow(FOLLOW_ruleAssStmt2_in_entryRuleAssStmt2961);
            ruleAssStmt2();

            state._fsp--;

             after(grammarAccess.getAssStmt2Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssStmt2968); 

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
    // $ANTLR end "entryRuleAssStmt2"


    // $ANTLR start "ruleAssStmt2"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:489:1: ruleAssStmt2 : ( ( rule__AssStmt2__Group__0 ) ) ;
    public final void ruleAssStmt2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:493:2: ( ( ( rule__AssStmt2__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:494:1: ( ( rule__AssStmt2__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:494:1: ( ( rule__AssStmt2__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:495:1: ( rule__AssStmt2__Group__0 )
            {
             before(grammarAccess.getAssStmt2Access().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:496:1: ( rule__AssStmt2__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:496:2: rule__AssStmt2__Group__0
            {
            pushFollow(FOLLOW_rule__AssStmt2__Group__0_in_ruleAssStmt2994);
            rule__AssStmt2__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssStmt2Access().getGroup()); 

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
    // $ANTLR end "ruleAssStmt2"


    // $ANTLR start "entryRuleAttrList"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:508:1: entryRuleAttrList : ruleAttrList EOF ;
    public final void entryRuleAttrList() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:509:1: ( ruleAttrList EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:510:1: ruleAttrList EOF
            {
             before(grammarAccess.getAttrListRule()); 
            pushFollow(FOLLOW_ruleAttrList_in_entryRuleAttrList1021);
            ruleAttrList();

            state._fsp--;

             after(grammarAccess.getAttrListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrList1028); 

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
    // $ANTLR end "entryRuleAttrList"


    // $ANTLR start "ruleAttrList"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:517:1: ruleAttrList : ( ( rule__AttrList__Group__0 ) ) ;
    public final void ruleAttrList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:521:2: ( ( ( rule__AttrList__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:522:1: ( ( rule__AttrList__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:522:1: ( ( rule__AttrList__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:523:1: ( rule__AttrList__Group__0 )
            {
             before(grammarAccess.getAttrListAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:524:1: ( rule__AttrList__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:524:2: rule__AttrList__Group__0
            {
            pushFollow(FOLLOW_rule__AttrList__Group__0_in_ruleAttrList1054);
            rule__AttrList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttrListAccess().getGroup()); 

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
    // $ANTLR end "ruleAttrList"


    // $ANTLR start "entryRuleAttrAss"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:536:1: entryRuleAttrAss : ruleAttrAss EOF ;
    public final void entryRuleAttrAss() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:537:1: ( ruleAttrAss EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:538:1: ruleAttrAss EOF
            {
             before(grammarAccess.getAttrAssRule()); 
            pushFollow(FOLLOW_ruleAttrAss_in_entryRuleAttrAss1081);
            ruleAttrAss();

            state._fsp--;

             after(grammarAccess.getAttrAssRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrAss1088); 

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
    // $ANTLR end "entryRuleAttrAss"


    // $ANTLR start "ruleAttrAss"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:545:1: ruleAttrAss : ( ( rule__AttrAss__Group__0 ) ) ;
    public final void ruleAttrAss() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:549:2: ( ( ( rule__AttrAss__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:550:1: ( ( rule__AttrAss__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:550:1: ( ( rule__AttrAss__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:551:1: ( rule__AttrAss__Group__0 )
            {
             before(grammarAccess.getAttrAssAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:552:1: ( rule__AttrAss__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:552:2: rule__AttrAss__Group__0
            {
            pushFollow(FOLLOW_rule__AttrAss__Group__0_in_ruleAttrAss1114);
            rule__AttrAss__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttrAssAccess().getGroup()); 

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
    // $ANTLR end "ruleAttrAss"


    // $ANTLR start "entryRuleExpr"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:564:1: entryRuleExpr : ruleExpr EOF ;
    public final void entryRuleExpr() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:565:1: ( ruleExpr EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:566:1: ruleExpr EOF
            {
             before(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr1141);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr1148); 

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
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:573:1: ruleExpr : ( ( rule__Expr__Group__0 ) ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:577:2: ( ( ( rule__Expr__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:578:1: ( ( rule__Expr__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:578:1: ( ( rule__Expr__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:579:1: ( rule__Expr__Group__0 )
            {
             before(grammarAccess.getExprAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:580:1: ( rule__Expr__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:580:2: rule__Expr__Group__0
            {
            pushFollow(FOLLOW_rule__Expr__Group__0_in_ruleExpr1174);
            rule__Expr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExprAccess().getGroup()); 

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
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleConj"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:592:1: entryRuleConj : ruleConj EOF ;
    public final void entryRuleConj() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:593:1: ( ruleConj EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:594:1: ruleConj EOF
            {
             before(grammarAccess.getConjRule()); 
            pushFollow(FOLLOW_ruleConj_in_entryRuleConj1201);
            ruleConj();

            state._fsp--;

             after(grammarAccess.getConjRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConj1208); 

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
    // $ANTLR end "entryRuleConj"


    // $ANTLR start "ruleConj"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:601:1: ruleConj : ( ( rule__Conj__Group__0 ) ) ;
    public final void ruleConj() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:605:2: ( ( ( rule__Conj__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:606:1: ( ( rule__Conj__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:606:1: ( ( rule__Conj__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:607:1: ( rule__Conj__Group__0 )
            {
             before(grammarAccess.getConjAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:608:1: ( rule__Conj__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:608:2: rule__Conj__Group__0
            {
            pushFollow(FOLLOW_rule__Conj__Group__0_in_ruleConj1234);
            rule__Conj__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConjAccess().getGroup()); 

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
    // $ANTLR end "ruleConj"


    // $ANTLR start "entryRuleRelat"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:620:1: entryRuleRelat : ruleRelat EOF ;
    public final void entryRuleRelat() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:621:1: ( ruleRelat EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:622:1: ruleRelat EOF
            {
             before(grammarAccess.getRelatRule()); 
            pushFollow(FOLLOW_ruleRelat_in_entryRuleRelat1261);
            ruleRelat();

            state._fsp--;

             after(grammarAccess.getRelatRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelat1268); 

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
    // $ANTLR end "entryRuleRelat"


    // $ANTLR start "ruleRelat"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:629:1: ruleRelat : ( ( rule__Relat__Group__0 ) ) ;
    public final void ruleRelat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:633:2: ( ( ( rule__Relat__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:634:1: ( ( rule__Relat__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:634:1: ( ( rule__Relat__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:635:1: ( rule__Relat__Group__0 )
            {
             before(grammarAccess.getRelatAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:636:1: ( rule__Relat__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:636:2: rule__Relat__Group__0
            {
            pushFollow(FOLLOW_rule__Relat__Group__0_in_ruleRelat1294);
            rule__Relat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelatAccess().getGroup()); 

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
    // $ANTLR end "ruleRelat"


    // $ANTLR start "entryRuleAdd"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:648:1: entryRuleAdd : ruleAdd EOF ;
    public final void entryRuleAdd() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:649:1: ( ruleAdd EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:650:1: ruleAdd EOF
            {
             before(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_ruleAdd_in_entryRuleAdd1321);
            ruleAdd();

            state._fsp--;

             after(grammarAccess.getAddRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdd1328); 

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
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:657:1: ruleAdd : ( ( rule__Add__Group__0 ) ) ;
    public final void ruleAdd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:661:2: ( ( ( rule__Add__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:662:1: ( ( rule__Add__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:662:1: ( ( rule__Add__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:663:1: ( rule__Add__Group__0 )
            {
             before(grammarAccess.getAddAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:664:1: ( rule__Add__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:664:2: rule__Add__Group__0
            {
            pushFollow(FOLLOW_rule__Add__Group__0_in_ruleAdd1354);
            rule__Add__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getGroup()); 

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
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleMult"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:676:1: entryRuleMult : ruleMult EOF ;
    public final void entryRuleMult() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:677:1: ( ruleMult EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:678:1: ruleMult EOF
            {
             before(grammarAccess.getMultRule()); 
            pushFollow(FOLLOW_ruleMult_in_entryRuleMult1381);
            ruleMult();

            state._fsp--;

             after(grammarAccess.getMultRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMult1388); 

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
    // $ANTLR end "entryRuleMult"


    // $ANTLR start "ruleMult"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:685:1: ruleMult : ( ( rule__Mult__Group__0 ) ) ;
    public final void ruleMult() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:689:2: ( ( ( rule__Mult__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:690:1: ( ( rule__Mult__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:690:1: ( ( rule__Mult__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:691:1: ( rule__Mult__Group__0 )
            {
             before(grammarAccess.getMultAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:692:1: ( rule__Mult__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:692:2: rule__Mult__Group__0
            {
            pushFollow(FOLLOW_rule__Mult__Group__0_in_ruleMult1414);
            rule__Mult__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultAccess().getGroup()); 

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
    // $ANTLR end "ruleMult"


    // $ANTLR start "entryRuleUnary"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:704:1: entryRuleUnary : ruleUnary EOF ;
    public final void entryRuleUnary() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:705:1: ( ruleUnary EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:706:1: ruleUnary EOF
            {
             before(grammarAccess.getUnaryRule()); 
            pushFollow(FOLLOW_ruleUnary_in_entryRuleUnary1441);
            ruleUnary();

            state._fsp--;

             after(grammarAccess.getUnaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnary1448); 

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
    // $ANTLR end "entryRuleUnary"


    // $ANTLR start "ruleUnary"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:713:1: ruleUnary : ( ( rule__Unary__Group__0 ) ) ;
    public final void ruleUnary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:717:2: ( ( ( rule__Unary__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:718:1: ( ( rule__Unary__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:718:1: ( ( rule__Unary__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:719:1: ( rule__Unary__Group__0 )
            {
             before(grammarAccess.getUnaryAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:720:1: ( rule__Unary__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:720:2: rule__Unary__Group__0
            {
            pushFollow(FOLLOW_rule__Unary__Group__0_in_ruleUnary1474);
            rule__Unary__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnaryAccess().getGroup()); 

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
    // $ANTLR end "ruleUnary"


    // $ANTLR start "entryRuleAtom"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:732:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:733:1: ( ruleAtom EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:734:1: ruleAtom EOF
            {
             before(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_ruleAtom_in_entryRuleAtom1501);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getAtomRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtom1508); 

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
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:741:1: ruleAtom : ( ( rule__Atom__Alternatives ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:745:2: ( ( ( rule__Atom__Alternatives ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:746:1: ( ( rule__Atom__Alternatives ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:746:1: ( ( rule__Atom__Alternatives ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:747:1: ( rule__Atom__Alternatives )
            {
             before(grammarAccess.getAtomAccess().getAlternatives()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:748:1: ( rule__Atom__Alternatives )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:748:2: rule__Atom__Alternatives
            {
            pushFollow(FOLLOW_rule__Atom__Alternatives_in_ruleAtom1534);
            rule__Atom__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleVar"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:760:1: entryRuleVar : ruleVar EOF ;
    public final void entryRuleVar() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:761:1: ( ruleVar EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:762:1: ruleVar EOF
            {
             before(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_ruleVar_in_entryRuleVar1561);
            ruleVar();

            state._fsp--;

             after(grammarAccess.getVarRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar1568); 

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
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:769:1: ruleVar : ( ( rule__Var__Group__0 ) ) ;
    public final void ruleVar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:773:2: ( ( ( rule__Var__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:774:1: ( ( rule__Var__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:774:1: ( ( rule__Var__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:775:1: ( rule__Var__Group__0 )
            {
             before(grammarAccess.getVarAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:776:1: ( rule__Var__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:776:2: rule__Var__Group__0
            {
            pushFollow(FOLLOW_rule__Var__Group__0_in_ruleVar1594);
            rule__Var__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarAccess().getGroup()); 

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
    // $ANTLR end "ruleVar"


    // $ANTLR start "rule__Declaration__Alternatives_0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:788:1: rule__Declaration__Alternatives_0 : ( ( ( rule__Declaration__VariAssignment_0_0 ) ) | ( ( rule__Declaration__ObjAssignment_0_1 ) ) );
    public final void rule__Declaration__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:792:1: ( ( ( rule__Declaration__VariAssignment_0_0 ) ) | ( ( rule__Declaration__ObjAssignment_0_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==31) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=11 && LA1_0<=13)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:793:1: ( ( rule__Declaration__VariAssignment_0_0 ) )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:793:1: ( ( rule__Declaration__VariAssignment_0_0 ) )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:794:1: ( rule__Declaration__VariAssignment_0_0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getVariAssignment_0_0()); 
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:795:1: ( rule__Declaration__VariAssignment_0_0 )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:795:2: rule__Declaration__VariAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Declaration__VariAssignment_0_0_in_rule__Declaration__Alternatives_01630);
                    rule__Declaration__VariAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclarationAccess().getVariAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:799:6: ( ( rule__Declaration__ObjAssignment_0_1 ) )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:799:6: ( ( rule__Declaration__ObjAssignment_0_1 ) )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:800:1: ( rule__Declaration__ObjAssignment_0_1 )
                    {
                     before(grammarAccess.getDeclarationAccess().getObjAssignment_0_1()); 
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:801:1: ( rule__Declaration__ObjAssignment_0_1 )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:801:2: rule__Declaration__ObjAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__Declaration__ObjAssignment_0_1_in_rule__Declaration__Alternatives_01648);
                    rule__Declaration__ObjAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclarationAccess().getObjAssignment_0_1()); 

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
    // $ANTLR end "rule__Declaration__Alternatives_0"


    // $ANTLR start "rule__VarDecl__Alternatives_2"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:810:1: rule__VarDecl__Alternatives_2 : ( ( ( rule__VarDecl__Group_2_0__0 )? ) | ( ( rule__VarDecl__Group_2_1__0 ) ) );
    public final void rule__VarDecl__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:814:1: ( ( ( rule__VarDecl__Group_2_0__0 )? ) | ( ( rule__VarDecl__Group_2_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EOF||LA3_0==30||LA3_0==32) ) {
                alt3=1;
            }
            else if ( (LA3_0==33) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:815:1: ( ( rule__VarDecl__Group_2_0__0 )? )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:815:1: ( ( rule__VarDecl__Group_2_0__0 )? )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:816:1: ( rule__VarDecl__Group_2_0__0 )?
                    {
                     before(grammarAccess.getVarDeclAccess().getGroup_2_0()); 
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:817:1: ( rule__VarDecl__Group_2_0__0 )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==32) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:817:2: rule__VarDecl__Group_2_0__0
                            {
                            pushFollow(FOLLOW_rule__VarDecl__Group_2_0__0_in_rule__VarDecl__Alternatives_21681);
                            rule__VarDecl__Group_2_0__0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getVarDeclAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:821:6: ( ( rule__VarDecl__Group_2_1__0 ) )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:821:6: ( ( rule__VarDecl__Group_2_1__0 ) )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:822:1: ( rule__VarDecl__Group_2_1__0 )
                    {
                     before(grammarAccess.getVarDeclAccess().getGroup_2_1()); 
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:823:1: ( rule__VarDecl__Group_2_1__0 )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:823:2: rule__VarDecl__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__VarDecl__Group_2_1__0_in_rule__VarDecl__Alternatives_21700);
                    rule__VarDecl__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVarDeclAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__VarDecl__Alternatives_2"


    // $ANTLR start "rule__ObjDecl__Alternatives_2"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:832:1: rule__ObjDecl__Alternatives_2 : ( ( ( rule__ObjDecl__Group_2_0__0 ) ) | ( ( rule__ObjDecl__Group_2_1__0 ) ) );
    public final void rule__ObjDecl__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:836:1: ( ( ( rule__ObjDecl__Group_2_0__0 ) ) | ( ( rule__ObjDecl__Group_2_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==28) ) {
                alt4=1;
            }
            else if ( (LA4_0==33) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:837:1: ( ( rule__ObjDecl__Group_2_0__0 ) )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:837:1: ( ( rule__ObjDecl__Group_2_0__0 ) )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:838:1: ( rule__ObjDecl__Group_2_0__0 )
                    {
                     before(grammarAccess.getObjDeclAccess().getGroup_2_0()); 
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:839:1: ( rule__ObjDecl__Group_2_0__0 )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:839:2: rule__ObjDecl__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__ObjDecl__Group_2_0__0_in_rule__ObjDecl__Alternatives_21733);
                    rule__ObjDecl__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjDeclAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:843:6: ( ( rule__ObjDecl__Group_2_1__0 ) )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:843:6: ( ( rule__ObjDecl__Group_2_1__0 ) )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:844:1: ( rule__ObjDecl__Group_2_1__0 )
                    {
                     before(grammarAccess.getObjDeclAccess().getGroup_2_1()); 
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:845:1: ( rule__ObjDecl__Group_2_1__0 )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:845:2: rule__ObjDecl__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__ObjDecl__Group_2_1__0_in_rule__ObjDecl__Alternatives_21751);
                    rule__ObjDecl__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjDeclAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__ObjDecl__Alternatives_2"


    // $ANTLR start "rule__Block__Alternatives"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:854:1: rule__Block__Alternatives : ( ( ruleAnimBlock ) | ( ruleEventBlock ) );
    public final void rule__Block__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:858:1: ( ( ruleAnimBlock ) | ( ruleEventBlock ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==35) ) {
                alt5=1;
            }
            else if ( (LA5_0==36) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:859:1: ( ruleAnimBlock )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:859:1: ( ruleAnimBlock )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:860:1: ruleAnimBlock
                    {
                     before(grammarAccess.getBlockAccess().getAnimBlockParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAnimBlock_in_rule__Block__Alternatives1784);
                    ruleAnimBlock();

                    state._fsp--;

                     after(grammarAccess.getBlockAccess().getAnimBlockParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:865:6: ( ruleEventBlock )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:865:6: ( ruleEventBlock )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:866:1: ruleEventBlock
                    {
                     before(grammarAccess.getBlockAccess().getEventBlockParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEventBlock_in_rule__Block__Alternatives1801);
                    ruleEventBlock();

                    state._fsp--;

                     after(grammarAccess.getBlockAccess().getEventBlockParserRuleCall_1()); 

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
    // $ANTLR end "rule__Block__Alternatives"


    // $ANTLR start "rule__ObjType__Alternatives"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:876:1: rule__ObjType__Alternatives : ( ( 'rectangle' ) | ( 'triangle' ) | ( 'circle' ) );
    public final void rule__ObjType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:880:1: ( ( 'rectangle' ) | ( 'triangle' ) | ( 'circle' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:881:1: ( 'rectangle' )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:881:1: ( 'rectangle' )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:882:1: 'rectangle'
                    {
                     before(grammarAccess.getObjTypeAccess().getRectangleKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__ObjType__Alternatives1834); 
                     after(grammarAccess.getObjTypeAccess().getRectangleKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:889:6: ( 'triangle' )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:889:6: ( 'triangle' )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:890:1: 'triangle'
                    {
                     before(grammarAccess.getObjTypeAccess().getTriangleKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__ObjType__Alternatives1854); 
                     after(grammarAccess.getObjTypeAccess().getTriangleKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:897:6: ( 'circle' )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:897:6: ( 'circle' )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:898:1: 'circle'
                    {
                     before(grammarAccess.getObjTypeAccess().getCircleKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__ObjType__Alternatives1874); 
                     after(grammarAccess.getObjTypeAccess().getCircleKeyword_2()); 

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
    // $ANTLR end "rule__ObjType__Alternatives"


    // $ANTLR start "rule__Keystroke__Alternatives"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:910:1: rule__Keystroke__Alternatives : ( ( 'space' ) | ( 'leftarrow' ) | ( 'rightarrow' ) | ( 'uparrow' ) | ( 'downarrow' ) );
    public final void rule__Keystroke__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:914:1: ( ( 'space' ) | ( 'leftarrow' ) | ( 'rightarrow' ) | ( 'uparrow' ) | ( 'downarrow' ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt7=1;
                }
                break;
            case 15:
                {
                alt7=2;
                }
                break;
            case 16:
                {
                alt7=3;
                }
                break;
            case 17:
                {
                alt7=4;
                }
                break;
            case 18:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:915:1: ( 'space' )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:915:1: ( 'space' )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:916:1: 'space'
                    {
                     before(grammarAccess.getKeystrokeAccess().getSpaceKeyword_0()); 
                    match(input,14,FOLLOW_14_in_rule__Keystroke__Alternatives1909); 
                     after(grammarAccess.getKeystrokeAccess().getSpaceKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:923:6: ( 'leftarrow' )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:923:6: ( 'leftarrow' )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:924:1: 'leftarrow'
                    {
                     before(grammarAccess.getKeystrokeAccess().getLeftarrowKeyword_1()); 
                    match(input,15,FOLLOW_15_in_rule__Keystroke__Alternatives1929); 
                     after(grammarAccess.getKeystrokeAccess().getLeftarrowKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:931:6: ( 'rightarrow' )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:931:6: ( 'rightarrow' )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:932:1: 'rightarrow'
                    {
                     before(grammarAccess.getKeystrokeAccess().getRightarrowKeyword_2()); 
                    match(input,16,FOLLOW_16_in_rule__Keystroke__Alternatives1949); 
                     after(grammarAccess.getKeystrokeAccess().getRightarrowKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:939:6: ( 'uparrow' )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:939:6: ( 'uparrow' )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:940:1: 'uparrow'
                    {
                     before(grammarAccess.getKeystrokeAccess().getUparrowKeyword_3()); 
                    match(input,17,FOLLOW_17_in_rule__Keystroke__Alternatives1969); 
                     after(grammarAccess.getKeystrokeAccess().getUparrowKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:947:6: ( 'downarrow' )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:947:6: ( 'downarrow' )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:948:1: 'downarrow'
                    {
                     before(grammarAccess.getKeystrokeAccess().getDownarrowKeyword_4()); 
                    match(input,18,FOLLOW_18_in_rule__Keystroke__Alternatives1989); 
                     after(grammarAccess.getKeystrokeAccess().getDownarrowKeyword_4()); 

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
    // $ANTLR end "rule__Keystroke__Alternatives"


    // $ANTLR start "rule__Stmt__Alternatives"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:960:1: rule__Stmt__Alternatives : ( ( ruleIfStmt ) | ( ruleForStmt ) | ( ruleAssStmt ) );
    public final void rule__Stmt__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:964:1: ( ( ruleIfStmt ) | ( ruleForStmt ) | ( ruleAssStmt ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt8=1;
                }
                break;
            case 39:
                {
                alt8=2;
                }
                break;
            case RULE_ID:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:965:1: ( ruleIfStmt )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:965:1: ( ruleIfStmt )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:966:1: ruleIfStmt
                    {
                     before(grammarAccess.getStmtAccess().getIfStmtParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIfStmt_in_rule__Stmt__Alternatives2023);
                    ruleIfStmt();

                    state._fsp--;

                     after(grammarAccess.getStmtAccess().getIfStmtParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:971:6: ( ruleForStmt )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:971:6: ( ruleForStmt )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:972:1: ruleForStmt
                    {
                     before(grammarAccess.getStmtAccess().getForStmtParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleForStmt_in_rule__Stmt__Alternatives2040);
                    ruleForStmt();

                    state._fsp--;

                     after(grammarAccess.getStmtAccess().getForStmtParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:977:6: ( ruleAssStmt )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:977:6: ( ruleAssStmt )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:978:1: ruleAssStmt
                    {
                     before(grammarAccess.getStmtAccess().getAssStmtParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAssStmt_in_rule__Stmt__Alternatives2057);
                    ruleAssStmt();

                    state._fsp--;

                     after(grammarAccess.getStmtAccess().getAssStmtParserRuleCall_2()); 

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
    // $ANTLR end "rule__Stmt__Alternatives"


    // $ANTLR start "rule__Relat__Alternatives_1_0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:988:1: rule__Relat__Alternatives_1_0 : ( ( '==' ) | ( '<' ) | ( '<=' ) );
    public final void rule__Relat__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:992:1: ( ( '==' ) | ( '<' ) | ( '<=' ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt9=1;
                }
                break;
            case 20:
                {
                alt9=2;
                }
                break;
            case 21:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:993:1: ( '==' )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:993:1: ( '==' )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:994:1: '=='
                    {
                     before(grammarAccess.getRelatAccess().getEqualsSignEqualsSignKeyword_1_0_0()); 
                    match(input,19,FOLLOW_19_in_rule__Relat__Alternatives_1_02090); 
                     after(grammarAccess.getRelatAccess().getEqualsSignEqualsSignKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1001:6: ( '<' )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1001:6: ( '<' )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1002:1: '<'
                    {
                     before(grammarAccess.getRelatAccess().getLessThanSignKeyword_1_0_1()); 
                    match(input,20,FOLLOW_20_in_rule__Relat__Alternatives_1_02110); 
                     after(grammarAccess.getRelatAccess().getLessThanSignKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1009:6: ( '<=' )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1009:6: ( '<=' )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1010:1: '<='
                    {
                     before(grammarAccess.getRelatAccess().getLessThanSignEqualsSignKeyword_1_0_2()); 
                    match(input,21,FOLLOW_21_in_rule__Relat__Alternatives_1_02130); 
                     after(grammarAccess.getRelatAccess().getLessThanSignEqualsSignKeyword_1_0_2()); 

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
    // $ANTLR end "rule__Relat__Alternatives_1_0"


    // $ANTLR start "rule__Add__Alternatives_1_0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1022:1: rule__Add__Alternatives_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Add__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1026:1: ( ( '+' ) | ( '-' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            else if ( (LA10_0==23) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1027:1: ( '+' )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1027:1: ( '+' )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1028:1: '+'
                    {
                     before(grammarAccess.getAddAccess().getPlusSignKeyword_1_0_0()); 
                    match(input,22,FOLLOW_22_in_rule__Add__Alternatives_1_02165); 
                     after(grammarAccess.getAddAccess().getPlusSignKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1035:6: ( '-' )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1035:6: ( '-' )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1036:1: '-'
                    {
                     before(grammarAccess.getAddAccess().getHyphenMinusKeyword_1_0_1()); 
                    match(input,23,FOLLOW_23_in_rule__Add__Alternatives_1_02185); 
                     after(grammarAccess.getAddAccess().getHyphenMinusKeyword_1_0_1()); 

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
    // $ANTLR end "rule__Add__Alternatives_1_0"


    // $ANTLR start "rule__Mult__Alternatives_1_0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1048:1: rule__Mult__Alternatives_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Mult__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1052:1: ( ( '*' ) | ( '/' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            else if ( (LA11_0==25) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1053:1: ( '*' )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1053:1: ( '*' )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1054:1: '*'
                    {
                     before(grammarAccess.getMultAccess().getAsteriskKeyword_1_0_0()); 
                    match(input,24,FOLLOW_24_in_rule__Mult__Alternatives_1_02220); 
                     after(grammarAccess.getMultAccess().getAsteriskKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1061:6: ( '/' )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1061:6: ( '/' )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1062:1: '/'
                    {
                     before(grammarAccess.getMultAccess().getSolidusKeyword_1_0_1()); 
                    match(input,25,FOLLOW_25_in_rule__Mult__Alternatives_1_02240); 
                     after(grammarAccess.getMultAccess().getSolidusKeyword_1_0_1()); 

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
    // $ANTLR end "rule__Mult__Alternatives_1_0"


    // $ANTLR start "rule__Unary__Alternatives_0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1074:1: rule__Unary__Alternatives_0 : ( ( '!' ) | ( '-' ) );
    public final void rule__Unary__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1078:1: ( ( '!' ) | ( '-' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            else if ( (LA12_0==23) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1079:1: ( '!' )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1079:1: ( '!' )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1080:1: '!'
                    {
                     before(grammarAccess.getUnaryAccess().getExclamationMarkKeyword_0_0()); 
                    match(input,26,FOLLOW_26_in_rule__Unary__Alternatives_02275); 
                     after(grammarAccess.getUnaryAccess().getExclamationMarkKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1087:6: ( '-' )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1087:6: ( '-' )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1088:1: '-'
                    {
                     before(grammarAccess.getUnaryAccess().getHyphenMinusKeyword_0_1()); 
                    match(input,23,FOLLOW_23_in_rule__Unary__Alternatives_02295); 
                     after(grammarAccess.getUnaryAccess().getHyphenMinusKeyword_0_1()); 

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
    // $ANTLR end "rule__Unary__Alternatives_0"


    // $ANTLR start "rule__Atom__Alternatives"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1100:1: rule__Atom__Alternatives : ( ( ( rule__Atom__ValueAssignment_0 ) ) | ( ( rule__Atom__Group_1__0 ) ) | ( ( rule__Atom__Group_2__0 ) ) );
    public final void rule__Atom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1104:1: ( ( ( rule__Atom__ValueAssignment_0 ) ) | ( ( rule__Atom__Group_1__0 ) ) | ( ( rule__Atom__Group_2__0 ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt13=1;
                }
                break;
            case RULE_ID:
                {
                alt13=2;
                }
                break;
            case 28:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1105:1: ( ( rule__Atom__ValueAssignment_0 ) )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1105:1: ( ( rule__Atom__ValueAssignment_0 ) )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1106:1: ( rule__Atom__ValueAssignment_0 )
                    {
                     before(grammarAccess.getAtomAccess().getValueAssignment_0()); 
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1107:1: ( rule__Atom__ValueAssignment_0 )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1107:2: rule__Atom__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Atom__ValueAssignment_0_in_rule__Atom__Alternatives2329);
                    rule__Atom__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1111:6: ( ( rule__Atom__Group_1__0 ) )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1111:6: ( ( rule__Atom__Group_1__0 ) )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1112:1: ( rule__Atom__Group_1__0 )
                    {
                     before(grammarAccess.getAtomAccess().getGroup_1()); 
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1113:1: ( rule__Atom__Group_1__0 )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1113:2: rule__Atom__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Atom__Group_1__0_in_rule__Atom__Alternatives2347);
                    rule__Atom__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1117:6: ( ( rule__Atom__Group_2__0 ) )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1117:6: ( ( rule__Atom__Group_2__0 ) )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1118:1: ( rule__Atom__Group_2__0 )
                    {
                     before(grammarAccess.getAtomAccess().getGroup_2()); 
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1119:1: ( rule__Atom__Group_2__0 )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1119:2: rule__Atom__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Atom__Group_2__0_in_rule__Atom__Alternatives2365);
                    rule__Atom__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Atom__Alternatives"


    // $ANTLR start "rule__Var__Alternatives_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1128:1: rule__Var__Alternatives_1 : ( ( ( rule__Var__Group_1_0__0 ) ) | ( ( rule__Var__Group_1_1__0 ) ) );
    public final void rule__Var__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1132:1: ( ( ( rule__Var__Group_1_0__0 ) ) | ( ( rule__Var__Group_1_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            else if ( (LA14_0==46) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1133:1: ( ( rule__Var__Group_1_0__0 ) )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1133:1: ( ( rule__Var__Group_1_0__0 ) )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1134:1: ( rule__Var__Group_1_0__0 )
                    {
                     before(grammarAccess.getVarAccess().getGroup_1_0()); 
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1135:1: ( rule__Var__Group_1_0__0 )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1135:2: rule__Var__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Var__Group_1_0__0_in_rule__Var__Alternatives_12398);
                    rule__Var__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVarAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1139:6: ( ( rule__Var__Group_1_1__0 ) )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1139:6: ( ( rule__Var__Group_1_1__0 ) )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1140:1: ( rule__Var__Group_1_1__0 )
                    {
                     before(grammarAccess.getVarAccess().getGroup_1_1()); 
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1141:1: ( rule__Var__Group_1_1__0 )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1141:2: rule__Var__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Var__Group_1_1__0_in_rule__Var__Alternatives_12416);
                    rule__Var__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVarAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__Var__Alternatives_1"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1152:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1156:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1157:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02447);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02450);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1164:1: rule__Model__Group__0__Impl : ( 'game' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1168:1: ( ( 'game' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1169:1: ( 'game' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1169:1: ( 'game' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1170:1: 'game'
            {
             before(grammarAccess.getModelAccess().getGameKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Model__Group__0__Impl2478); 
             after(grammarAccess.getModelAccess().getGameKeyword_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1183:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1187:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1188:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12509);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12512);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1195:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1199:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1200:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1200:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1201:1: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1202:1: ( rule__Model__NameAssignment_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1202:2: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl2539);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1212:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1216:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1217:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22569);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22572);
            rule__Model__Group__3();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1224:1: rule__Model__Group__2__Impl : ( '(' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1228:1: ( ( '(' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1229:1: ( '(' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1229:1: ( '(' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1230:1: '('
            {
             before(grammarAccess.getModelAccess().getLeftParenthesisKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__Model__Group__2__Impl2600); 
             after(grammarAccess.getModelAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1243:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1247:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1248:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32631);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__32634);
            rule__Model__Group__4();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1255:1: rule__Model__Group__3__Impl : ( ( rule__Model__AttrAssignment_3 ) ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1259:1: ( ( ( rule__Model__AttrAssignment_3 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1260:1: ( ( rule__Model__AttrAssignment_3 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1260:1: ( ( rule__Model__AttrAssignment_3 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1261:1: ( rule__Model__AttrAssignment_3 )
            {
             before(grammarAccess.getModelAccess().getAttrAssignment_3()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1262:1: ( rule__Model__AttrAssignment_3 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1262:2: rule__Model__AttrAssignment_3
            {
            pushFollow(FOLLOW_rule__Model__AttrAssignment_3_in_rule__Model__Group__3__Impl2661);
            rule__Model__AttrAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAttrAssignment_3()); 

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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1272:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1276:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1277:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42691);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__5_in_rule__Model__Group__42694);
            rule__Model__Group__5();

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
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1284:1: rule__Model__Group__4__Impl : ( ')' ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1288:1: ( ( ')' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1289:1: ( ')' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1289:1: ( ')' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1290:1: ')'
            {
             before(grammarAccess.getModelAccess().getRightParenthesisKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__Model__Group__4__Impl2722); 
             after(grammarAccess.getModelAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1303:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1307:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1308:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__52753);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__6_in_rule__Model__Group__52756);
            rule__Model__Group__6();

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
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1315:1: rule__Model__Group__5__Impl : ( ( rule__Model__DeclAssignment_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1319:1: ( ( ( rule__Model__DeclAssignment_5 )* ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1320:1: ( ( rule__Model__DeclAssignment_5 )* )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1320:1: ( ( rule__Model__DeclAssignment_5 )* )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1321:1: ( rule__Model__DeclAssignment_5 )*
            {
             before(grammarAccess.getModelAccess().getDeclAssignment_5()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1322:1: ( rule__Model__DeclAssignment_5 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=11 && LA15_0<=13)||LA15_0==31) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1322:2: rule__Model__DeclAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Model__DeclAssignment_5_in_rule__Model__Group__5__Impl2783);
            	    rule__Model__DeclAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDeclAssignment_5()); 

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
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1332:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1336:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1337:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__62814);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__7_in_rule__Model__Group__62817);
            rule__Model__Group__7();

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
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1344:1: rule__Model__Group__6__Impl : ( ( rule__Model__StmtAssignment_6 ) ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1348:1: ( ( ( rule__Model__StmtAssignment_6 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1349:1: ( ( rule__Model__StmtAssignment_6 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1349:1: ( ( rule__Model__StmtAssignment_6 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1350:1: ( rule__Model__StmtAssignment_6 )
            {
             before(grammarAccess.getModelAccess().getStmtAssignment_6()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1351:1: ( rule__Model__StmtAssignment_6 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1351:2: rule__Model__StmtAssignment_6
            {
            pushFollow(FOLLOW_rule__Model__StmtAssignment_6_in_rule__Model__Group__6__Impl2844);
            rule__Model__StmtAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getStmtAssignment_6()); 

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
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Model__Group__7"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1361:1: rule__Model__Group__7 : rule__Model__Group__7__Impl ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1365:1: ( rule__Model__Group__7__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1366:2: rule__Model__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__72874);
            rule__Model__Group__7__Impl();

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
    // $ANTLR end "rule__Model__Group__7"


    // $ANTLR start "rule__Model__Group__7__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1372:1: rule__Model__Group__7__Impl : ( ( rule__Model__BlocksAssignment_7 )* ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1376:1: ( ( ( rule__Model__BlocksAssignment_7 )* ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1377:1: ( ( rule__Model__BlocksAssignment_7 )* )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1377:1: ( ( rule__Model__BlocksAssignment_7 )* )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1378:1: ( rule__Model__BlocksAssignment_7 )*
            {
             before(grammarAccess.getModelAccess().getBlocksAssignment_7()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1379:1: ( rule__Model__BlocksAssignment_7 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=35 && LA16_0<=36)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1379:2: rule__Model__BlocksAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Model__BlocksAssignment_7_in_rule__Model__Group__7__Impl2901);
            	    rule__Model__BlocksAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getBlocksAssignment_7()); 

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
    // $ANTLR end "rule__Model__Group__7__Impl"


    // $ANTLR start "rule__Declaration__Group__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1405:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1409:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1410:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__02948);
            rule__Declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__02951);
            rule__Declaration__Group__1();

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
    // $ANTLR end "rule__Declaration__Group__0"


    // $ANTLR start "rule__Declaration__Group__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1417:1: rule__Declaration__Group__0__Impl : ( ( rule__Declaration__Alternatives_0 ) ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1421:1: ( ( ( rule__Declaration__Alternatives_0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1422:1: ( ( rule__Declaration__Alternatives_0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1422:1: ( ( rule__Declaration__Alternatives_0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1423:1: ( rule__Declaration__Alternatives_0 )
            {
             before(grammarAccess.getDeclarationAccess().getAlternatives_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1424:1: ( rule__Declaration__Alternatives_0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1424:2: rule__Declaration__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Declaration__Alternatives_0_in_rule__Declaration__Group__0__Impl2978);
            rule__Declaration__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Declaration__Group__0__Impl"


    // $ANTLR start "rule__Declaration__Group__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1434:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1438:1: ( rule__Declaration__Group__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1439:2: rule__Declaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__13008);
            rule__Declaration__Group__1__Impl();

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
    // $ANTLR end "rule__Declaration__Group__1"


    // $ANTLR start "rule__Declaration__Group__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1445:1: rule__Declaration__Group__1__Impl : ( ';' ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1449:1: ( ( ';' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1450:1: ( ';' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1450:1: ( ';' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1451:1: ';'
            {
             before(grammarAccess.getDeclarationAccess().getSemicolonKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__Declaration__Group__1__Impl3036); 
             after(grammarAccess.getDeclarationAccess().getSemicolonKeyword_1()); 

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
    // $ANTLR end "rule__Declaration__Group__1__Impl"


    // $ANTLR start "rule__VarDecl__Group__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1468:1: rule__VarDecl__Group__0 : rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1 ;
    public final void rule__VarDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1472:1: ( rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1473:2: rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__0__Impl_in_rule__VarDecl__Group__03071);
            rule__VarDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__1_in_rule__VarDecl__Group__03074);
            rule__VarDecl__Group__1();

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
    // $ANTLR end "rule__VarDecl__Group__0"


    // $ANTLR start "rule__VarDecl__Group__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1480:1: rule__VarDecl__Group__0__Impl : ( 'int' ) ;
    public final void rule__VarDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1484:1: ( ( 'int' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1485:1: ( 'int' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1485:1: ( 'int' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1486:1: 'int'
            {
             before(grammarAccess.getVarDeclAccess().getIntKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__VarDecl__Group__0__Impl3102); 
             after(grammarAccess.getVarDeclAccess().getIntKeyword_0()); 

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
    // $ANTLR end "rule__VarDecl__Group__0__Impl"


    // $ANTLR start "rule__VarDecl__Group__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1499:1: rule__VarDecl__Group__1 : rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2 ;
    public final void rule__VarDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1503:1: ( rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1504:2: rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__1__Impl_in_rule__VarDecl__Group__13133);
            rule__VarDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__2_in_rule__VarDecl__Group__13136);
            rule__VarDecl__Group__2();

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
    // $ANTLR end "rule__VarDecl__Group__1"


    // $ANTLR start "rule__VarDecl__Group__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1511:1: rule__VarDecl__Group__1__Impl : ( ( rule__VarDecl__NameAssignment_1 ) ) ;
    public final void rule__VarDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1515:1: ( ( ( rule__VarDecl__NameAssignment_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1516:1: ( ( rule__VarDecl__NameAssignment_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1516:1: ( ( rule__VarDecl__NameAssignment_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1517:1: ( rule__VarDecl__NameAssignment_1 )
            {
             before(grammarAccess.getVarDeclAccess().getNameAssignment_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1518:1: ( rule__VarDecl__NameAssignment_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1518:2: rule__VarDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VarDecl__NameAssignment_1_in_rule__VarDecl__Group__1__Impl3163);
            rule__VarDecl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__VarDecl__Group__1__Impl"


    // $ANTLR start "rule__VarDecl__Group__2"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1528:1: rule__VarDecl__Group__2 : rule__VarDecl__Group__2__Impl ;
    public final void rule__VarDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1532:1: ( rule__VarDecl__Group__2__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1533:2: rule__VarDecl__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__2__Impl_in_rule__VarDecl__Group__23193);
            rule__VarDecl__Group__2__Impl();

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
    // $ANTLR end "rule__VarDecl__Group__2"


    // $ANTLR start "rule__VarDecl__Group__2__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1539:1: rule__VarDecl__Group__2__Impl : ( ( rule__VarDecl__Alternatives_2 ) ) ;
    public final void rule__VarDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1543:1: ( ( ( rule__VarDecl__Alternatives_2 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1544:1: ( ( rule__VarDecl__Alternatives_2 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1544:1: ( ( rule__VarDecl__Alternatives_2 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1545:1: ( rule__VarDecl__Alternatives_2 )
            {
             before(grammarAccess.getVarDeclAccess().getAlternatives_2()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1546:1: ( rule__VarDecl__Alternatives_2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1546:2: rule__VarDecl__Alternatives_2
            {
            pushFollow(FOLLOW_rule__VarDecl__Alternatives_2_in_rule__VarDecl__Group__2__Impl3220);
            rule__VarDecl__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__VarDecl__Group__2__Impl"


    // $ANTLR start "rule__VarDecl__Group_2_0__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1562:1: rule__VarDecl__Group_2_0__0 : rule__VarDecl__Group_2_0__0__Impl rule__VarDecl__Group_2_0__1 ;
    public final void rule__VarDecl__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1566:1: ( rule__VarDecl__Group_2_0__0__Impl rule__VarDecl__Group_2_0__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1567:2: rule__VarDecl__Group_2_0__0__Impl rule__VarDecl__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__VarDecl__Group_2_0__0__Impl_in_rule__VarDecl__Group_2_0__03256);
            rule__VarDecl__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group_2_0__1_in_rule__VarDecl__Group_2_0__03259);
            rule__VarDecl__Group_2_0__1();

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
    // $ANTLR end "rule__VarDecl__Group_2_0__0"


    // $ANTLR start "rule__VarDecl__Group_2_0__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1574:1: rule__VarDecl__Group_2_0__0__Impl : ( '=' ) ;
    public final void rule__VarDecl__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1578:1: ( ( '=' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1579:1: ( '=' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1579:1: ( '=' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1580:1: '='
            {
             before(grammarAccess.getVarDeclAccess().getEqualsSignKeyword_2_0_0()); 
            match(input,32,FOLLOW_32_in_rule__VarDecl__Group_2_0__0__Impl3287); 
             after(grammarAccess.getVarDeclAccess().getEqualsSignKeyword_2_0_0()); 

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
    // $ANTLR end "rule__VarDecl__Group_2_0__0__Impl"


    // $ANTLR start "rule__VarDecl__Group_2_0__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1593:1: rule__VarDecl__Group_2_0__1 : rule__VarDecl__Group_2_0__1__Impl ;
    public final void rule__VarDecl__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1597:1: ( rule__VarDecl__Group_2_0__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1598:2: rule__VarDecl__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__VarDecl__Group_2_0__1__Impl_in_rule__VarDecl__Group_2_0__13318);
            rule__VarDecl__Group_2_0__1__Impl();

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
    // $ANTLR end "rule__VarDecl__Group_2_0__1"


    // $ANTLR start "rule__VarDecl__Group_2_0__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1604:1: rule__VarDecl__Group_2_0__1__Impl : ( ( rule__VarDecl__ExprAssignment_2_0_1 ) ) ;
    public final void rule__VarDecl__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1608:1: ( ( ( rule__VarDecl__ExprAssignment_2_0_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1609:1: ( ( rule__VarDecl__ExprAssignment_2_0_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1609:1: ( ( rule__VarDecl__ExprAssignment_2_0_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1610:1: ( rule__VarDecl__ExprAssignment_2_0_1 )
            {
             before(grammarAccess.getVarDeclAccess().getExprAssignment_2_0_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1611:1: ( rule__VarDecl__ExprAssignment_2_0_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1611:2: rule__VarDecl__ExprAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__VarDecl__ExprAssignment_2_0_1_in_rule__VarDecl__Group_2_0__1__Impl3345);
            rule__VarDecl__ExprAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclAccess().getExprAssignment_2_0_1()); 

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
    // $ANTLR end "rule__VarDecl__Group_2_0__1__Impl"


    // $ANTLR start "rule__VarDecl__Group_2_1__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1625:1: rule__VarDecl__Group_2_1__0 : rule__VarDecl__Group_2_1__0__Impl rule__VarDecl__Group_2_1__1 ;
    public final void rule__VarDecl__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1629:1: ( rule__VarDecl__Group_2_1__0__Impl rule__VarDecl__Group_2_1__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1630:2: rule__VarDecl__Group_2_1__0__Impl rule__VarDecl__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__VarDecl__Group_2_1__0__Impl_in_rule__VarDecl__Group_2_1__03379);
            rule__VarDecl__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group_2_1__1_in_rule__VarDecl__Group_2_1__03382);
            rule__VarDecl__Group_2_1__1();

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
    // $ANTLR end "rule__VarDecl__Group_2_1__0"


    // $ANTLR start "rule__VarDecl__Group_2_1__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1637:1: rule__VarDecl__Group_2_1__0__Impl : ( '[' ) ;
    public final void rule__VarDecl__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1641:1: ( ( '[' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1642:1: ( '[' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1642:1: ( '[' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1643:1: '['
            {
             before(grammarAccess.getVarDeclAccess().getLeftSquareBracketKeyword_2_1_0()); 
            match(input,33,FOLLOW_33_in_rule__VarDecl__Group_2_1__0__Impl3410); 
             after(grammarAccess.getVarDeclAccess().getLeftSquareBracketKeyword_2_1_0()); 

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
    // $ANTLR end "rule__VarDecl__Group_2_1__0__Impl"


    // $ANTLR start "rule__VarDecl__Group_2_1__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1656:1: rule__VarDecl__Group_2_1__1 : rule__VarDecl__Group_2_1__1__Impl rule__VarDecl__Group_2_1__2 ;
    public final void rule__VarDecl__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1660:1: ( rule__VarDecl__Group_2_1__1__Impl rule__VarDecl__Group_2_1__2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1661:2: rule__VarDecl__Group_2_1__1__Impl rule__VarDecl__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__VarDecl__Group_2_1__1__Impl_in_rule__VarDecl__Group_2_1__13441);
            rule__VarDecl__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group_2_1__2_in_rule__VarDecl__Group_2_1__13444);
            rule__VarDecl__Group_2_1__2();

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
    // $ANTLR end "rule__VarDecl__Group_2_1__1"


    // $ANTLR start "rule__VarDecl__Group_2_1__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1668:1: rule__VarDecl__Group_2_1__1__Impl : ( ( rule__VarDecl__ValueAssignment_2_1_1 ) ) ;
    public final void rule__VarDecl__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1672:1: ( ( ( rule__VarDecl__ValueAssignment_2_1_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1673:1: ( ( rule__VarDecl__ValueAssignment_2_1_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1673:1: ( ( rule__VarDecl__ValueAssignment_2_1_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1674:1: ( rule__VarDecl__ValueAssignment_2_1_1 )
            {
             before(grammarAccess.getVarDeclAccess().getValueAssignment_2_1_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1675:1: ( rule__VarDecl__ValueAssignment_2_1_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1675:2: rule__VarDecl__ValueAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__VarDecl__ValueAssignment_2_1_1_in_rule__VarDecl__Group_2_1__1__Impl3471);
            rule__VarDecl__ValueAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclAccess().getValueAssignment_2_1_1()); 

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
    // $ANTLR end "rule__VarDecl__Group_2_1__1__Impl"


    // $ANTLR start "rule__VarDecl__Group_2_1__2"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1685:1: rule__VarDecl__Group_2_1__2 : rule__VarDecl__Group_2_1__2__Impl ;
    public final void rule__VarDecl__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1689:1: ( rule__VarDecl__Group_2_1__2__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1690:2: rule__VarDecl__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__VarDecl__Group_2_1__2__Impl_in_rule__VarDecl__Group_2_1__23501);
            rule__VarDecl__Group_2_1__2__Impl();

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
    // $ANTLR end "rule__VarDecl__Group_2_1__2"


    // $ANTLR start "rule__VarDecl__Group_2_1__2__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1696:1: rule__VarDecl__Group_2_1__2__Impl : ( ']' ) ;
    public final void rule__VarDecl__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1700:1: ( ( ']' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1701:1: ( ']' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1701:1: ( ']' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1702:1: ']'
            {
             before(grammarAccess.getVarDeclAccess().getRightSquareBracketKeyword_2_1_2()); 
            match(input,34,FOLLOW_34_in_rule__VarDecl__Group_2_1__2__Impl3529); 
             after(grammarAccess.getVarDeclAccess().getRightSquareBracketKeyword_2_1_2()); 

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
    // $ANTLR end "rule__VarDecl__Group_2_1__2__Impl"


    // $ANTLR start "rule__ObjDecl__Group__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1721:1: rule__ObjDecl__Group__0 : rule__ObjDecl__Group__0__Impl rule__ObjDecl__Group__1 ;
    public final void rule__ObjDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1725:1: ( rule__ObjDecl__Group__0__Impl rule__ObjDecl__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1726:2: rule__ObjDecl__Group__0__Impl rule__ObjDecl__Group__1
            {
            pushFollow(FOLLOW_rule__ObjDecl__Group__0__Impl_in_rule__ObjDecl__Group__03566);
            rule__ObjDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjDecl__Group__1_in_rule__ObjDecl__Group__03569);
            rule__ObjDecl__Group__1();

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
    // $ANTLR end "rule__ObjDecl__Group__0"


    // $ANTLR start "rule__ObjDecl__Group__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1733:1: rule__ObjDecl__Group__0__Impl : ( ( rule__ObjDecl__TypeAssignment_0 ) ) ;
    public final void rule__ObjDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1737:1: ( ( ( rule__ObjDecl__TypeAssignment_0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1738:1: ( ( rule__ObjDecl__TypeAssignment_0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1738:1: ( ( rule__ObjDecl__TypeAssignment_0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1739:1: ( rule__ObjDecl__TypeAssignment_0 )
            {
             before(grammarAccess.getObjDeclAccess().getTypeAssignment_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1740:1: ( rule__ObjDecl__TypeAssignment_0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1740:2: rule__ObjDecl__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__ObjDecl__TypeAssignment_0_in_rule__ObjDecl__Group__0__Impl3596);
            rule__ObjDecl__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getObjDeclAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__ObjDecl__Group__0__Impl"


    // $ANTLR start "rule__ObjDecl__Group__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1750:1: rule__ObjDecl__Group__1 : rule__ObjDecl__Group__1__Impl rule__ObjDecl__Group__2 ;
    public final void rule__ObjDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1754:1: ( rule__ObjDecl__Group__1__Impl rule__ObjDecl__Group__2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1755:2: rule__ObjDecl__Group__1__Impl rule__ObjDecl__Group__2
            {
            pushFollow(FOLLOW_rule__ObjDecl__Group__1__Impl_in_rule__ObjDecl__Group__13626);
            rule__ObjDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjDecl__Group__2_in_rule__ObjDecl__Group__13629);
            rule__ObjDecl__Group__2();

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
    // $ANTLR end "rule__ObjDecl__Group__1"


    // $ANTLR start "rule__ObjDecl__Group__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1762:1: rule__ObjDecl__Group__1__Impl : ( ( rule__ObjDecl__NameAssignment_1 ) ) ;
    public final void rule__ObjDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1766:1: ( ( ( rule__ObjDecl__NameAssignment_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1767:1: ( ( rule__ObjDecl__NameAssignment_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1767:1: ( ( rule__ObjDecl__NameAssignment_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1768:1: ( rule__ObjDecl__NameAssignment_1 )
            {
             before(grammarAccess.getObjDeclAccess().getNameAssignment_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1769:1: ( rule__ObjDecl__NameAssignment_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1769:2: rule__ObjDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ObjDecl__NameAssignment_1_in_rule__ObjDecl__Group__1__Impl3656);
            rule__ObjDecl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjDeclAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ObjDecl__Group__1__Impl"


    // $ANTLR start "rule__ObjDecl__Group__2"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1779:1: rule__ObjDecl__Group__2 : rule__ObjDecl__Group__2__Impl ;
    public final void rule__ObjDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1783:1: ( rule__ObjDecl__Group__2__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1784:2: rule__ObjDecl__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ObjDecl__Group__2__Impl_in_rule__ObjDecl__Group__23686);
            rule__ObjDecl__Group__2__Impl();

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
    // $ANTLR end "rule__ObjDecl__Group__2"


    // $ANTLR start "rule__ObjDecl__Group__2__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1790:1: rule__ObjDecl__Group__2__Impl : ( ( rule__ObjDecl__Alternatives_2 ) ) ;
    public final void rule__ObjDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1794:1: ( ( ( rule__ObjDecl__Alternatives_2 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1795:1: ( ( rule__ObjDecl__Alternatives_2 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1795:1: ( ( rule__ObjDecl__Alternatives_2 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1796:1: ( rule__ObjDecl__Alternatives_2 )
            {
             before(grammarAccess.getObjDeclAccess().getAlternatives_2()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1797:1: ( rule__ObjDecl__Alternatives_2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1797:2: rule__ObjDecl__Alternatives_2
            {
            pushFollow(FOLLOW_rule__ObjDecl__Alternatives_2_in_rule__ObjDecl__Group__2__Impl3713);
            rule__ObjDecl__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getObjDeclAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__ObjDecl__Group__2__Impl"


    // $ANTLR start "rule__ObjDecl__Group_2_0__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1813:1: rule__ObjDecl__Group_2_0__0 : rule__ObjDecl__Group_2_0__0__Impl rule__ObjDecl__Group_2_0__1 ;
    public final void rule__ObjDecl__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1817:1: ( rule__ObjDecl__Group_2_0__0__Impl rule__ObjDecl__Group_2_0__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1818:2: rule__ObjDecl__Group_2_0__0__Impl rule__ObjDecl__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__ObjDecl__Group_2_0__0__Impl_in_rule__ObjDecl__Group_2_0__03749);
            rule__ObjDecl__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjDecl__Group_2_0__1_in_rule__ObjDecl__Group_2_0__03752);
            rule__ObjDecl__Group_2_0__1();

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
    // $ANTLR end "rule__ObjDecl__Group_2_0__0"


    // $ANTLR start "rule__ObjDecl__Group_2_0__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1825:1: rule__ObjDecl__Group_2_0__0__Impl : ( '(' ) ;
    public final void rule__ObjDecl__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1829:1: ( ( '(' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1830:1: ( '(' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1830:1: ( '(' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1831:1: '('
            {
             before(grammarAccess.getObjDeclAccess().getLeftParenthesisKeyword_2_0_0()); 
            match(input,28,FOLLOW_28_in_rule__ObjDecl__Group_2_0__0__Impl3780); 
             after(grammarAccess.getObjDeclAccess().getLeftParenthesisKeyword_2_0_0()); 

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
    // $ANTLR end "rule__ObjDecl__Group_2_0__0__Impl"


    // $ANTLR start "rule__ObjDecl__Group_2_0__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1844:1: rule__ObjDecl__Group_2_0__1 : rule__ObjDecl__Group_2_0__1__Impl rule__ObjDecl__Group_2_0__2 ;
    public final void rule__ObjDecl__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1848:1: ( rule__ObjDecl__Group_2_0__1__Impl rule__ObjDecl__Group_2_0__2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1849:2: rule__ObjDecl__Group_2_0__1__Impl rule__ObjDecl__Group_2_0__2
            {
            pushFollow(FOLLOW_rule__ObjDecl__Group_2_0__1__Impl_in_rule__ObjDecl__Group_2_0__13811);
            rule__ObjDecl__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjDecl__Group_2_0__2_in_rule__ObjDecl__Group_2_0__13814);
            rule__ObjDecl__Group_2_0__2();

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
    // $ANTLR end "rule__ObjDecl__Group_2_0__1"


    // $ANTLR start "rule__ObjDecl__Group_2_0__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1856:1: rule__ObjDecl__Group_2_0__1__Impl : ( ( rule__ObjDecl__AttrAssignment_2_0_1 ) ) ;
    public final void rule__ObjDecl__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1860:1: ( ( ( rule__ObjDecl__AttrAssignment_2_0_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1861:1: ( ( rule__ObjDecl__AttrAssignment_2_0_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1861:1: ( ( rule__ObjDecl__AttrAssignment_2_0_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1862:1: ( rule__ObjDecl__AttrAssignment_2_0_1 )
            {
             before(grammarAccess.getObjDeclAccess().getAttrAssignment_2_0_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1863:1: ( rule__ObjDecl__AttrAssignment_2_0_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1863:2: rule__ObjDecl__AttrAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__ObjDecl__AttrAssignment_2_0_1_in_rule__ObjDecl__Group_2_0__1__Impl3841);
            rule__ObjDecl__AttrAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getObjDeclAccess().getAttrAssignment_2_0_1()); 

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
    // $ANTLR end "rule__ObjDecl__Group_2_0__1__Impl"


    // $ANTLR start "rule__ObjDecl__Group_2_0__2"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1873:1: rule__ObjDecl__Group_2_0__2 : rule__ObjDecl__Group_2_0__2__Impl ;
    public final void rule__ObjDecl__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1877:1: ( rule__ObjDecl__Group_2_0__2__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1878:2: rule__ObjDecl__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ObjDecl__Group_2_0__2__Impl_in_rule__ObjDecl__Group_2_0__23871);
            rule__ObjDecl__Group_2_0__2__Impl();

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
    // $ANTLR end "rule__ObjDecl__Group_2_0__2"


    // $ANTLR start "rule__ObjDecl__Group_2_0__2__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1884:1: rule__ObjDecl__Group_2_0__2__Impl : ( ')' ) ;
    public final void rule__ObjDecl__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1888:1: ( ( ')' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1889:1: ( ')' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1889:1: ( ')' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1890:1: ')'
            {
             before(grammarAccess.getObjDeclAccess().getRightParenthesisKeyword_2_0_2()); 
            match(input,29,FOLLOW_29_in_rule__ObjDecl__Group_2_0__2__Impl3899); 
             after(grammarAccess.getObjDeclAccess().getRightParenthesisKeyword_2_0_2()); 

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
    // $ANTLR end "rule__ObjDecl__Group_2_0__2__Impl"


    // $ANTLR start "rule__ObjDecl__Group_2_1__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1909:1: rule__ObjDecl__Group_2_1__0 : rule__ObjDecl__Group_2_1__0__Impl rule__ObjDecl__Group_2_1__1 ;
    public final void rule__ObjDecl__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1913:1: ( rule__ObjDecl__Group_2_1__0__Impl rule__ObjDecl__Group_2_1__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1914:2: rule__ObjDecl__Group_2_1__0__Impl rule__ObjDecl__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__ObjDecl__Group_2_1__0__Impl_in_rule__ObjDecl__Group_2_1__03936);
            rule__ObjDecl__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjDecl__Group_2_1__1_in_rule__ObjDecl__Group_2_1__03939);
            rule__ObjDecl__Group_2_1__1();

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
    // $ANTLR end "rule__ObjDecl__Group_2_1__0"


    // $ANTLR start "rule__ObjDecl__Group_2_1__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1921:1: rule__ObjDecl__Group_2_1__0__Impl : ( '[' ) ;
    public final void rule__ObjDecl__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1925:1: ( ( '[' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1926:1: ( '[' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1926:1: ( '[' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1927:1: '['
            {
             before(grammarAccess.getObjDeclAccess().getLeftSquareBracketKeyword_2_1_0()); 
            match(input,33,FOLLOW_33_in_rule__ObjDecl__Group_2_1__0__Impl3967); 
             after(grammarAccess.getObjDeclAccess().getLeftSquareBracketKeyword_2_1_0()); 

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
    // $ANTLR end "rule__ObjDecl__Group_2_1__0__Impl"


    // $ANTLR start "rule__ObjDecl__Group_2_1__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1940:1: rule__ObjDecl__Group_2_1__1 : rule__ObjDecl__Group_2_1__1__Impl rule__ObjDecl__Group_2_1__2 ;
    public final void rule__ObjDecl__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1944:1: ( rule__ObjDecl__Group_2_1__1__Impl rule__ObjDecl__Group_2_1__2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1945:2: rule__ObjDecl__Group_2_1__1__Impl rule__ObjDecl__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__ObjDecl__Group_2_1__1__Impl_in_rule__ObjDecl__Group_2_1__13998);
            rule__ObjDecl__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjDecl__Group_2_1__2_in_rule__ObjDecl__Group_2_1__14001);
            rule__ObjDecl__Group_2_1__2();

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
    // $ANTLR end "rule__ObjDecl__Group_2_1__1"


    // $ANTLR start "rule__ObjDecl__Group_2_1__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1952:1: rule__ObjDecl__Group_2_1__1__Impl : ( ( rule__ObjDecl__ValueAssignment_2_1_1 ) ) ;
    public final void rule__ObjDecl__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1956:1: ( ( ( rule__ObjDecl__ValueAssignment_2_1_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1957:1: ( ( rule__ObjDecl__ValueAssignment_2_1_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1957:1: ( ( rule__ObjDecl__ValueAssignment_2_1_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1958:1: ( rule__ObjDecl__ValueAssignment_2_1_1 )
            {
             before(grammarAccess.getObjDeclAccess().getValueAssignment_2_1_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1959:1: ( rule__ObjDecl__ValueAssignment_2_1_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1959:2: rule__ObjDecl__ValueAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__ObjDecl__ValueAssignment_2_1_1_in_rule__ObjDecl__Group_2_1__1__Impl4028);
            rule__ObjDecl__ValueAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getObjDeclAccess().getValueAssignment_2_1_1()); 

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
    // $ANTLR end "rule__ObjDecl__Group_2_1__1__Impl"


    // $ANTLR start "rule__ObjDecl__Group_2_1__2"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1969:1: rule__ObjDecl__Group_2_1__2 : rule__ObjDecl__Group_2_1__2__Impl ;
    public final void rule__ObjDecl__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1973:1: ( rule__ObjDecl__Group_2_1__2__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1974:2: rule__ObjDecl__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ObjDecl__Group_2_1__2__Impl_in_rule__ObjDecl__Group_2_1__24058);
            rule__ObjDecl__Group_2_1__2__Impl();

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
    // $ANTLR end "rule__ObjDecl__Group_2_1__2"


    // $ANTLR start "rule__ObjDecl__Group_2_1__2__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1980:1: rule__ObjDecl__Group_2_1__2__Impl : ( ']' ) ;
    public final void rule__ObjDecl__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1984:1: ( ( ']' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1985:1: ( ']' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1985:1: ( ']' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1986:1: ']'
            {
             before(grammarAccess.getObjDeclAccess().getRightSquareBracketKeyword_2_1_2()); 
            match(input,34,FOLLOW_34_in_rule__ObjDecl__Group_2_1__2__Impl4086); 
             after(grammarAccess.getObjDeclAccess().getRightSquareBracketKeyword_2_1_2()); 

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
    // $ANTLR end "rule__ObjDecl__Group_2_1__2__Impl"


    // $ANTLR start "rule__AnimBlock__Group__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2005:1: rule__AnimBlock__Group__0 : rule__AnimBlock__Group__0__Impl rule__AnimBlock__Group__1 ;
    public final void rule__AnimBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2009:1: ( rule__AnimBlock__Group__0__Impl rule__AnimBlock__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2010:2: rule__AnimBlock__Group__0__Impl rule__AnimBlock__Group__1
            {
            pushFollow(FOLLOW_rule__AnimBlock__Group__0__Impl_in_rule__AnimBlock__Group__04123);
            rule__AnimBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnimBlock__Group__1_in_rule__AnimBlock__Group__04126);
            rule__AnimBlock__Group__1();

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
    // $ANTLR end "rule__AnimBlock__Group__0"


    // $ANTLR start "rule__AnimBlock__Group__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2017:1: rule__AnimBlock__Group__0__Impl : ( 'animation' ) ;
    public final void rule__AnimBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2021:1: ( ( 'animation' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2022:1: ( 'animation' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2022:1: ( 'animation' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2023:1: 'animation'
            {
             before(grammarAccess.getAnimBlockAccess().getAnimationKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__AnimBlock__Group__0__Impl4154); 
             after(grammarAccess.getAnimBlockAccess().getAnimationKeyword_0()); 

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
    // $ANTLR end "rule__AnimBlock__Group__0__Impl"


    // $ANTLR start "rule__AnimBlock__Group__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2036:1: rule__AnimBlock__Group__1 : rule__AnimBlock__Group__1__Impl rule__AnimBlock__Group__2 ;
    public final void rule__AnimBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2040:1: ( rule__AnimBlock__Group__1__Impl rule__AnimBlock__Group__2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2041:2: rule__AnimBlock__Group__1__Impl rule__AnimBlock__Group__2
            {
            pushFollow(FOLLOW_rule__AnimBlock__Group__1__Impl_in_rule__AnimBlock__Group__14185);
            rule__AnimBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnimBlock__Group__2_in_rule__AnimBlock__Group__14188);
            rule__AnimBlock__Group__2();

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
    // $ANTLR end "rule__AnimBlock__Group__1"


    // $ANTLR start "rule__AnimBlock__Group__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2048:1: rule__AnimBlock__Group__1__Impl : ( ( rule__AnimBlock__NameAssignment_1 ) ) ;
    public final void rule__AnimBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2052:1: ( ( ( rule__AnimBlock__NameAssignment_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2053:1: ( ( rule__AnimBlock__NameAssignment_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2053:1: ( ( rule__AnimBlock__NameAssignment_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2054:1: ( rule__AnimBlock__NameAssignment_1 )
            {
             before(grammarAccess.getAnimBlockAccess().getNameAssignment_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2055:1: ( rule__AnimBlock__NameAssignment_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2055:2: rule__AnimBlock__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__AnimBlock__NameAssignment_1_in_rule__AnimBlock__Group__1__Impl4215);
            rule__AnimBlock__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnimBlockAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__AnimBlock__Group__1__Impl"


    // $ANTLR start "rule__AnimBlock__Group__2"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2065:1: rule__AnimBlock__Group__2 : rule__AnimBlock__Group__2__Impl rule__AnimBlock__Group__3 ;
    public final void rule__AnimBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2069:1: ( rule__AnimBlock__Group__2__Impl rule__AnimBlock__Group__3 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2070:2: rule__AnimBlock__Group__2__Impl rule__AnimBlock__Group__3
            {
            pushFollow(FOLLOW_rule__AnimBlock__Group__2__Impl_in_rule__AnimBlock__Group__24245);
            rule__AnimBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnimBlock__Group__3_in_rule__AnimBlock__Group__24248);
            rule__AnimBlock__Group__3();

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
    // $ANTLR end "rule__AnimBlock__Group__2"


    // $ANTLR start "rule__AnimBlock__Group__2__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2077:1: rule__AnimBlock__Group__2__Impl : ( '(' ) ;
    public final void rule__AnimBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2081:1: ( ( '(' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2082:1: ( '(' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2082:1: ( '(' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2083:1: '('
            {
             before(grammarAccess.getAnimBlockAccess().getLeftParenthesisKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__AnimBlock__Group__2__Impl4276); 
             after(grammarAccess.getAnimBlockAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__AnimBlock__Group__2__Impl"


    // $ANTLR start "rule__AnimBlock__Group__3"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2096:1: rule__AnimBlock__Group__3 : rule__AnimBlock__Group__3__Impl rule__AnimBlock__Group__4 ;
    public final void rule__AnimBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2100:1: ( rule__AnimBlock__Group__3__Impl rule__AnimBlock__Group__4 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2101:2: rule__AnimBlock__Group__3__Impl rule__AnimBlock__Group__4
            {
            pushFollow(FOLLOW_rule__AnimBlock__Group__3__Impl_in_rule__AnimBlock__Group__34307);
            rule__AnimBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnimBlock__Group__4_in_rule__AnimBlock__Group__34310);
            rule__AnimBlock__Group__4();

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
    // $ANTLR end "rule__AnimBlock__Group__3"


    // $ANTLR start "rule__AnimBlock__Group__3__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2108:1: rule__AnimBlock__Group__3__Impl : ( ( rule__AnimBlock__TypeAssignment_3 ) ) ;
    public final void rule__AnimBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2112:1: ( ( ( rule__AnimBlock__TypeAssignment_3 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2113:1: ( ( rule__AnimBlock__TypeAssignment_3 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2113:1: ( ( rule__AnimBlock__TypeAssignment_3 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2114:1: ( rule__AnimBlock__TypeAssignment_3 )
            {
             before(grammarAccess.getAnimBlockAccess().getTypeAssignment_3()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2115:1: ( rule__AnimBlock__TypeAssignment_3 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2115:2: rule__AnimBlock__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__AnimBlock__TypeAssignment_3_in_rule__AnimBlock__Group__3__Impl4337);
            rule__AnimBlock__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAnimBlockAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__AnimBlock__Group__3__Impl"


    // $ANTLR start "rule__AnimBlock__Group__4"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2125:1: rule__AnimBlock__Group__4 : rule__AnimBlock__Group__4__Impl rule__AnimBlock__Group__5 ;
    public final void rule__AnimBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2129:1: ( rule__AnimBlock__Group__4__Impl rule__AnimBlock__Group__5 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2130:2: rule__AnimBlock__Group__4__Impl rule__AnimBlock__Group__5
            {
            pushFollow(FOLLOW_rule__AnimBlock__Group__4__Impl_in_rule__AnimBlock__Group__44367);
            rule__AnimBlock__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnimBlock__Group__5_in_rule__AnimBlock__Group__44370);
            rule__AnimBlock__Group__5();

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
    // $ANTLR end "rule__AnimBlock__Group__4"


    // $ANTLR start "rule__AnimBlock__Group__4__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2137:1: rule__AnimBlock__Group__4__Impl : ( ( rule__AnimBlock__ObjNameAssignment_4 ) ) ;
    public final void rule__AnimBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2141:1: ( ( ( rule__AnimBlock__ObjNameAssignment_4 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2142:1: ( ( rule__AnimBlock__ObjNameAssignment_4 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2142:1: ( ( rule__AnimBlock__ObjNameAssignment_4 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2143:1: ( rule__AnimBlock__ObjNameAssignment_4 )
            {
             before(grammarAccess.getAnimBlockAccess().getObjNameAssignment_4()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2144:1: ( rule__AnimBlock__ObjNameAssignment_4 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2144:2: rule__AnimBlock__ObjNameAssignment_4
            {
            pushFollow(FOLLOW_rule__AnimBlock__ObjNameAssignment_4_in_rule__AnimBlock__Group__4__Impl4397);
            rule__AnimBlock__ObjNameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAnimBlockAccess().getObjNameAssignment_4()); 

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
    // $ANTLR end "rule__AnimBlock__Group__4__Impl"


    // $ANTLR start "rule__AnimBlock__Group__5"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2154:1: rule__AnimBlock__Group__5 : rule__AnimBlock__Group__5__Impl rule__AnimBlock__Group__6 ;
    public final void rule__AnimBlock__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2158:1: ( rule__AnimBlock__Group__5__Impl rule__AnimBlock__Group__6 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2159:2: rule__AnimBlock__Group__5__Impl rule__AnimBlock__Group__6
            {
            pushFollow(FOLLOW_rule__AnimBlock__Group__5__Impl_in_rule__AnimBlock__Group__54427);
            rule__AnimBlock__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnimBlock__Group__6_in_rule__AnimBlock__Group__54430);
            rule__AnimBlock__Group__6();

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
    // $ANTLR end "rule__AnimBlock__Group__5"


    // $ANTLR start "rule__AnimBlock__Group__5__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2166:1: rule__AnimBlock__Group__5__Impl : ( ')' ) ;
    public final void rule__AnimBlock__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2170:1: ( ( ')' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2171:1: ( ')' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2171:1: ( ')' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2172:1: ')'
            {
             before(grammarAccess.getAnimBlockAccess().getRightParenthesisKeyword_5()); 
            match(input,29,FOLLOW_29_in_rule__AnimBlock__Group__5__Impl4458); 
             after(grammarAccess.getAnimBlockAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__AnimBlock__Group__5__Impl"


    // $ANTLR start "rule__AnimBlock__Group__6"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2185:1: rule__AnimBlock__Group__6 : rule__AnimBlock__Group__6__Impl ;
    public final void rule__AnimBlock__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2189:1: ( rule__AnimBlock__Group__6__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2190:2: rule__AnimBlock__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__AnimBlock__Group__6__Impl_in_rule__AnimBlock__Group__64489);
            rule__AnimBlock__Group__6__Impl();

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
    // $ANTLR end "rule__AnimBlock__Group__6"


    // $ANTLR start "rule__AnimBlock__Group__6__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2196:1: rule__AnimBlock__Group__6__Impl : ( ( rule__AnimBlock__StmtAssignment_6 ) ) ;
    public final void rule__AnimBlock__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2200:1: ( ( ( rule__AnimBlock__StmtAssignment_6 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2201:1: ( ( rule__AnimBlock__StmtAssignment_6 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2201:1: ( ( rule__AnimBlock__StmtAssignment_6 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2202:1: ( rule__AnimBlock__StmtAssignment_6 )
            {
             before(grammarAccess.getAnimBlockAccess().getStmtAssignment_6()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2203:1: ( rule__AnimBlock__StmtAssignment_6 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2203:2: rule__AnimBlock__StmtAssignment_6
            {
            pushFollow(FOLLOW_rule__AnimBlock__StmtAssignment_6_in_rule__AnimBlock__Group__6__Impl4516);
            rule__AnimBlock__StmtAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAnimBlockAccess().getStmtAssignment_6()); 

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
    // $ANTLR end "rule__AnimBlock__Group__6__Impl"


    // $ANTLR start "rule__EventBlock__Group__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2227:1: rule__EventBlock__Group__0 : rule__EventBlock__Group__0__Impl rule__EventBlock__Group__1 ;
    public final void rule__EventBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2231:1: ( rule__EventBlock__Group__0__Impl rule__EventBlock__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2232:2: rule__EventBlock__Group__0__Impl rule__EventBlock__Group__1
            {
            pushFollow(FOLLOW_rule__EventBlock__Group__0__Impl_in_rule__EventBlock__Group__04560);
            rule__EventBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventBlock__Group__1_in_rule__EventBlock__Group__04563);
            rule__EventBlock__Group__1();

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
    // $ANTLR end "rule__EventBlock__Group__0"


    // $ANTLR start "rule__EventBlock__Group__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2239:1: rule__EventBlock__Group__0__Impl : ( 'on' ) ;
    public final void rule__EventBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2243:1: ( ( 'on' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2244:1: ( 'on' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2244:1: ( 'on' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2245:1: 'on'
            {
             before(grammarAccess.getEventBlockAccess().getOnKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__EventBlock__Group__0__Impl4591); 
             after(grammarAccess.getEventBlockAccess().getOnKeyword_0()); 

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
    // $ANTLR end "rule__EventBlock__Group__0__Impl"


    // $ANTLR start "rule__EventBlock__Group__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2258:1: rule__EventBlock__Group__1 : rule__EventBlock__Group__1__Impl rule__EventBlock__Group__2 ;
    public final void rule__EventBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2262:1: ( rule__EventBlock__Group__1__Impl rule__EventBlock__Group__2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2263:2: rule__EventBlock__Group__1__Impl rule__EventBlock__Group__2
            {
            pushFollow(FOLLOW_rule__EventBlock__Group__1__Impl_in_rule__EventBlock__Group__14622);
            rule__EventBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventBlock__Group__2_in_rule__EventBlock__Group__14625);
            rule__EventBlock__Group__2();

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
    // $ANTLR end "rule__EventBlock__Group__1"


    // $ANTLR start "rule__EventBlock__Group__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2270:1: rule__EventBlock__Group__1__Impl : ( ( rule__EventBlock__KeyAssignment_1 ) ) ;
    public final void rule__EventBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2274:1: ( ( ( rule__EventBlock__KeyAssignment_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2275:1: ( ( rule__EventBlock__KeyAssignment_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2275:1: ( ( rule__EventBlock__KeyAssignment_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2276:1: ( rule__EventBlock__KeyAssignment_1 )
            {
             before(grammarAccess.getEventBlockAccess().getKeyAssignment_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2277:1: ( rule__EventBlock__KeyAssignment_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2277:2: rule__EventBlock__KeyAssignment_1
            {
            pushFollow(FOLLOW_rule__EventBlock__KeyAssignment_1_in_rule__EventBlock__Group__1__Impl4652);
            rule__EventBlock__KeyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEventBlockAccess().getKeyAssignment_1()); 

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
    // $ANTLR end "rule__EventBlock__Group__1__Impl"


    // $ANTLR start "rule__EventBlock__Group__2"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2287:1: rule__EventBlock__Group__2 : rule__EventBlock__Group__2__Impl ;
    public final void rule__EventBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2291:1: ( rule__EventBlock__Group__2__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2292:2: rule__EventBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EventBlock__Group__2__Impl_in_rule__EventBlock__Group__24682);
            rule__EventBlock__Group__2__Impl();

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
    // $ANTLR end "rule__EventBlock__Group__2"


    // $ANTLR start "rule__EventBlock__Group__2__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2298:1: rule__EventBlock__Group__2__Impl : ( ( rule__EventBlock__StmtAssignment_2 ) ) ;
    public final void rule__EventBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2302:1: ( ( ( rule__EventBlock__StmtAssignment_2 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2303:1: ( ( rule__EventBlock__StmtAssignment_2 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2303:1: ( ( rule__EventBlock__StmtAssignment_2 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2304:1: ( rule__EventBlock__StmtAssignment_2 )
            {
             before(grammarAccess.getEventBlockAccess().getStmtAssignment_2()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2305:1: ( rule__EventBlock__StmtAssignment_2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2305:2: rule__EventBlock__StmtAssignment_2
            {
            pushFollow(FOLLOW_rule__EventBlock__StmtAssignment_2_in_rule__EventBlock__Group__2__Impl4709);
            rule__EventBlock__StmtAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEventBlockAccess().getStmtAssignment_2()); 

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
    // $ANTLR end "rule__EventBlock__Group__2__Impl"


    // $ANTLR start "rule__StatementBlock__Group__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2321:1: rule__StatementBlock__Group__0 : rule__StatementBlock__Group__0__Impl rule__StatementBlock__Group__1 ;
    public final void rule__StatementBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2325:1: ( rule__StatementBlock__Group__0__Impl rule__StatementBlock__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2326:2: rule__StatementBlock__Group__0__Impl rule__StatementBlock__Group__1
            {
            pushFollow(FOLLOW_rule__StatementBlock__Group__0__Impl_in_rule__StatementBlock__Group__04745);
            rule__StatementBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StatementBlock__Group__1_in_rule__StatementBlock__Group__04748);
            rule__StatementBlock__Group__1();

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
    // $ANTLR end "rule__StatementBlock__Group__0"


    // $ANTLR start "rule__StatementBlock__Group__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2333:1: rule__StatementBlock__Group__0__Impl : ( () ) ;
    public final void rule__StatementBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2337:1: ( ( () ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2338:1: ( () )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2338:1: ( () )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2339:1: ()
            {
             before(grammarAccess.getStatementBlockAccess().getStatementBlockAction_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2340:1: ()
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2342:1: 
            {
            }

             after(grammarAccess.getStatementBlockAccess().getStatementBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatementBlock__Group__0__Impl"


    // $ANTLR start "rule__StatementBlock__Group__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2352:1: rule__StatementBlock__Group__1 : rule__StatementBlock__Group__1__Impl ;
    public final void rule__StatementBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2356:1: ( rule__StatementBlock__Group__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2357:2: rule__StatementBlock__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StatementBlock__Group__1__Impl_in_rule__StatementBlock__Group__14806);
            rule__StatementBlock__Group__1__Impl();

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
    // $ANTLR end "rule__StatementBlock__Group__1"


    // $ANTLR start "rule__StatementBlock__Group__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2363:1: rule__StatementBlock__Group__1__Impl : ( ( rule__StatementBlock__Group_1__0 ) ) ;
    public final void rule__StatementBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2367:1: ( ( ( rule__StatementBlock__Group_1__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2368:1: ( ( rule__StatementBlock__Group_1__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2368:1: ( ( rule__StatementBlock__Group_1__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2369:1: ( rule__StatementBlock__Group_1__0 )
            {
             before(grammarAccess.getStatementBlockAccess().getGroup_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2370:1: ( rule__StatementBlock__Group_1__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2370:2: rule__StatementBlock__Group_1__0
            {
            pushFollow(FOLLOW_rule__StatementBlock__Group_1__0_in_rule__StatementBlock__Group__1__Impl4833);
            rule__StatementBlock__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getStatementBlockAccess().getGroup_1()); 

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
    // $ANTLR end "rule__StatementBlock__Group__1__Impl"


    // $ANTLR start "rule__StatementBlock__Group_1__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2384:1: rule__StatementBlock__Group_1__0 : rule__StatementBlock__Group_1__0__Impl rule__StatementBlock__Group_1__1 ;
    public final void rule__StatementBlock__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2388:1: ( rule__StatementBlock__Group_1__0__Impl rule__StatementBlock__Group_1__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2389:2: rule__StatementBlock__Group_1__0__Impl rule__StatementBlock__Group_1__1
            {
            pushFollow(FOLLOW_rule__StatementBlock__Group_1__0__Impl_in_rule__StatementBlock__Group_1__04867);
            rule__StatementBlock__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StatementBlock__Group_1__1_in_rule__StatementBlock__Group_1__04870);
            rule__StatementBlock__Group_1__1();

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
    // $ANTLR end "rule__StatementBlock__Group_1__0"


    // $ANTLR start "rule__StatementBlock__Group_1__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2396:1: rule__StatementBlock__Group_1__0__Impl : ( '{' ) ;
    public final void rule__StatementBlock__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2400:1: ( ( '{' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2401:1: ( '{' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2401:1: ( '{' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2402:1: '{'
            {
             before(grammarAccess.getStatementBlockAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,37,FOLLOW_37_in_rule__StatementBlock__Group_1__0__Impl4898); 
             after(grammarAccess.getStatementBlockAccess().getLeftCurlyBracketKeyword_1_0()); 

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
    // $ANTLR end "rule__StatementBlock__Group_1__0__Impl"


    // $ANTLR start "rule__StatementBlock__Group_1__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2415:1: rule__StatementBlock__Group_1__1 : rule__StatementBlock__Group_1__1__Impl rule__StatementBlock__Group_1__2 ;
    public final void rule__StatementBlock__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2419:1: ( rule__StatementBlock__Group_1__1__Impl rule__StatementBlock__Group_1__2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2420:2: rule__StatementBlock__Group_1__1__Impl rule__StatementBlock__Group_1__2
            {
            pushFollow(FOLLOW_rule__StatementBlock__Group_1__1__Impl_in_rule__StatementBlock__Group_1__14929);
            rule__StatementBlock__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StatementBlock__Group_1__2_in_rule__StatementBlock__Group_1__14932);
            rule__StatementBlock__Group_1__2();

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
    // $ANTLR end "rule__StatementBlock__Group_1__1"


    // $ANTLR start "rule__StatementBlock__Group_1__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2427:1: rule__StatementBlock__Group_1__1__Impl : ( ( rule__StatementBlock__StmtAssignment_1_1 )* ) ;
    public final void rule__StatementBlock__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2431:1: ( ( ( rule__StatementBlock__StmtAssignment_1_1 )* ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2432:1: ( ( rule__StatementBlock__StmtAssignment_1_1 )* )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2432:1: ( ( rule__StatementBlock__StmtAssignment_1_1 )* )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2433:1: ( rule__StatementBlock__StmtAssignment_1_1 )*
            {
             before(grammarAccess.getStatementBlockAccess().getStmtAssignment_1_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2434:1: ( rule__StatementBlock__StmtAssignment_1_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||(LA17_0>=39 && LA17_0<=40)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2434:2: rule__StatementBlock__StmtAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__StatementBlock__StmtAssignment_1_1_in_rule__StatementBlock__Group_1__1__Impl4959);
            	    rule__StatementBlock__StmtAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getStatementBlockAccess().getStmtAssignment_1_1()); 

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
    // $ANTLR end "rule__StatementBlock__Group_1__1__Impl"


    // $ANTLR start "rule__StatementBlock__Group_1__2"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2444:1: rule__StatementBlock__Group_1__2 : rule__StatementBlock__Group_1__2__Impl ;
    public final void rule__StatementBlock__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2448:1: ( rule__StatementBlock__Group_1__2__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2449:2: rule__StatementBlock__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__StatementBlock__Group_1__2__Impl_in_rule__StatementBlock__Group_1__24990);
            rule__StatementBlock__Group_1__2__Impl();

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
    // $ANTLR end "rule__StatementBlock__Group_1__2"


    // $ANTLR start "rule__StatementBlock__Group_1__2__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2455:1: rule__StatementBlock__Group_1__2__Impl : ( '}' ) ;
    public final void rule__StatementBlock__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2459:1: ( ( '}' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2460:1: ( '}' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2460:1: ( '}' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2461:1: '}'
            {
             before(grammarAccess.getStatementBlockAccess().getRightCurlyBracketKeyword_1_2()); 
            match(input,38,FOLLOW_38_in_rule__StatementBlock__Group_1__2__Impl5018); 
             after(grammarAccess.getStatementBlockAccess().getRightCurlyBracketKeyword_1_2()); 

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
    // $ANTLR end "rule__StatementBlock__Group_1__2__Impl"


    // $ANTLR start "rule__ForStmt__Group__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2480:1: rule__ForStmt__Group__0 : rule__ForStmt__Group__0__Impl rule__ForStmt__Group__1 ;
    public final void rule__ForStmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2484:1: ( rule__ForStmt__Group__0__Impl rule__ForStmt__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2485:2: rule__ForStmt__Group__0__Impl rule__ForStmt__Group__1
            {
            pushFollow(FOLLOW_rule__ForStmt__Group__0__Impl_in_rule__ForStmt__Group__05055);
            rule__ForStmt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForStmt__Group__1_in_rule__ForStmt__Group__05058);
            rule__ForStmt__Group__1();

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
    // $ANTLR end "rule__ForStmt__Group__0"


    // $ANTLR start "rule__ForStmt__Group__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2492:1: rule__ForStmt__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForStmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2496:1: ( ( 'for' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2497:1: ( 'for' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2497:1: ( 'for' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2498:1: 'for'
            {
             before(grammarAccess.getForStmtAccess().getForKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__ForStmt__Group__0__Impl5086); 
             after(grammarAccess.getForStmtAccess().getForKeyword_0()); 

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
    // $ANTLR end "rule__ForStmt__Group__0__Impl"


    // $ANTLR start "rule__ForStmt__Group__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2511:1: rule__ForStmt__Group__1 : rule__ForStmt__Group__1__Impl rule__ForStmt__Group__2 ;
    public final void rule__ForStmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2515:1: ( rule__ForStmt__Group__1__Impl rule__ForStmt__Group__2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2516:2: rule__ForStmt__Group__1__Impl rule__ForStmt__Group__2
            {
            pushFollow(FOLLOW_rule__ForStmt__Group__1__Impl_in_rule__ForStmt__Group__15117);
            rule__ForStmt__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForStmt__Group__2_in_rule__ForStmt__Group__15120);
            rule__ForStmt__Group__2();

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
    // $ANTLR end "rule__ForStmt__Group__1"


    // $ANTLR start "rule__ForStmt__Group__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2523:1: rule__ForStmt__Group__1__Impl : ( '(' ) ;
    public final void rule__ForStmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2527:1: ( ( '(' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2528:1: ( '(' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2528:1: ( '(' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2529:1: '('
            {
             before(grammarAccess.getForStmtAccess().getLeftParenthesisKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__ForStmt__Group__1__Impl5148); 
             after(grammarAccess.getForStmtAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__ForStmt__Group__1__Impl"


    // $ANTLR start "rule__ForStmt__Group__2"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2542:1: rule__ForStmt__Group__2 : rule__ForStmt__Group__2__Impl rule__ForStmt__Group__3 ;
    public final void rule__ForStmt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2546:1: ( rule__ForStmt__Group__2__Impl rule__ForStmt__Group__3 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2547:2: rule__ForStmt__Group__2__Impl rule__ForStmt__Group__3
            {
            pushFollow(FOLLOW_rule__ForStmt__Group__2__Impl_in_rule__ForStmt__Group__25179);
            rule__ForStmt__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForStmt__Group__3_in_rule__ForStmt__Group__25182);
            rule__ForStmt__Group__3();

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
    // $ANTLR end "rule__ForStmt__Group__2"


    // $ANTLR start "rule__ForStmt__Group__2__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2554:1: rule__ForStmt__Group__2__Impl : ( ( rule__ForStmt__Ass1Assignment_2 ) ) ;
    public final void rule__ForStmt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2558:1: ( ( ( rule__ForStmt__Ass1Assignment_2 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2559:1: ( ( rule__ForStmt__Ass1Assignment_2 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2559:1: ( ( rule__ForStmt__Ass1Assignment_2 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2560:1: ( rule__ForStmt__Ass1Assignment_2 )
            {
             before(grammarAccess.getForStmtAccess().getAss1Assignment_2()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2561:1: ( rule__ForStmt__Ass1Assignment_2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2561:2: rule__ForStmt__Ass1Assignment_2
            {
            pushFollow(FOLLOW_rule__ForStmt__Ass1Assignment_2_in_rule__ForStmt__Group__2__Impl5209);
            rule__ForStmt__Ass1Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getForStmtAccess().getAss1Assignment_2()); 

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
    // $ANTLR end "rule__ForStmt__Group__2__Impl"


    // $ANTLR start "rule__ForStmt__Group__3"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2571:1: rule__ForStmt__Group__3 : rule__ForStmt__Group__3__Impl rule__ForStmt__Group__4 ;
    public final void rule__ForStmt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2575:1: ( rule__ForStmt__Group__3__Impl rule__ForStmt__Group__4 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2576:2: rule__ForStmt__Group__3__Impl rule__ForStmt__Group__4
            {
            pushFollow(FOLLOW_rule__ForStmt__Group__3__Impl_in_rule__ForStmt__Group__35239);
            rule__ForStmt__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForStmt__Group__4_in_rule__ForStmt__Group__35242);
            rule__ForStmt__Group__4();

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
    // $ANTLR end "rule__ForStmt__Group__3"


    // $ANTLR start "rule__ForStmt__Group__3__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2583:1: rule__ForStmt__Group__3__Impl : ( ( rule__ForStmt__ExprAssignment_3 ) ) ;
    public final void rule__ForStmt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2587:1: ( ( ( rule__ForStmt__ExprAssignment_3 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2588:1: ( ( rule__ForStmt__ExprAssignment_3 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2588:1: ( ( rule__ForStmt__ExprAssignment_3 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2589:1: ( rule__ForStmt__ExprAssignment_3 )
            {
             before(grammarAccess.getForStmtAccess().getExprAssignment_3()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2590:1: ( rule__ForStmt__ExprAssignment_3 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2590:2: rule__ForStmt__ExprAssignment_3
            {
            pushFollow(FOLLOW_rule__ForStmt__ExprAssignment_3_in_rule__ForStmt__Group__3__Impl5269);
            rule__ForStmt__ExprAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getForStmtAccess().getExprAssignment_3()); 

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
    // $ANTLR end "rule__ForStmt__Group__3__Impl"


    // $ANTLR start "rule__ForStmt__Group__4"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2600:1: rule__ForStmt__Group__4 : rule__ForStmt__Group__4__Impl rule__ForStmt__Group__5 ;
    public final void rule__ForStmt__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2604:1: ( rule__ForStmt__Group__4__Impl rule__ForStmt__Group__5 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2605:2: rule__ForStmt__Group__4__Impl rule__ForStmt__Group__5
            {
            pushFollow(FOLLOW_rule__ForStmt__Group__4__Impl_in_rule__ForStmt__Group__45299);
            rule__ForStmt__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForStmt__Group__5_in_rule__ForStmt__Group__45302);
            rule__ForStmt__Group__5();

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
    // $ANTLR end "rule__ForStmt__Group__4"


    // $ANTLR start "rule__ForStmt__Group__4__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2612:1: rule__ForStmt__Group__4__Impl : ( ';' ) ;
    public final void rule__ForStmt__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2616:1: ( ( ';' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2617:1: ( ';' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2617:1: ( ';' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2618:1: ';'
            {
             before(grammarAccess.getForStmtAccess().getSemicolonKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__ForStmt__Group__4__Impl5330); 
             after(grammarAccess.getForStmtAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__ForStmt__Group__4__Impl"


    // $ANTLR start "rule__ForStmt__Group__5"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2631:1: rule__ForStmt__Group__5 : rule__ForStmt__Group__5__Impl rule__ForStmt__Group__6 ;
    public final void rule__ForStmt__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2635:1: ( rule__ForStmt__Group__5__Impl rule__ForStmt__Group__6 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2636:2: rule__ForStmt__Group__5__Impl rule__ForStmt__Group__6
            {
            pushFollow(FOLLOW_rule__ForStmt__Group__5__Impl_in_rule__ForStmt__Group__55361);
            rule__ForStmt__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForStmt__Group__6_in_rule__ForStmt__Group__55364);
            rule__ForStmt__Group__6();

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
    // $ANTLR end "rule__ForStmt__Group__5"


    // $ANTLR start "rule__ForStmt__Group__5__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2643:1: rule__ForStmt__Group__5__Impl : ( ( rule__ForStmt__Ass2Assignment_5 ) ) ;
    public final void rule__ForStmt__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2647:1: ( ( ( rule__ForStmt__Ass2Assignment_5 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2648:1: ( ( rule__ForStmt__Ass2Assignment_5 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2648:1: ( ( rule__ForStmt__Ass2Assignment_5 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2649:1: ( rule__ForStmt__Ass2Assignment_5 )
            {
             before(grammarAccess.getForStmtAccess().getAss2Assignment_5()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2650:1: ( rule__ForStmt__Ass2Assignment_5 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2650:2: rule__ForStmt__Ass2Assignment_5
            {
            pushFollow(FOLLOW_rule__ForStmt__Ass2Assignment_5_in_rule__ForStmt__Group__5__Impl5391);
            rule__ForStmt__Ass2Assignment_5();

            state._fsp--;


            }

             after(grammarAccess.getForStmtAccess().getAss2Assignment_5()); 

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
    // $ANTLR end "rule__ForStmt__Group__5__Impl"


    // $ANTLR start "rule__ForStmt__Group__6"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2660:1: rule__ForStmt__Group__6 : rule__ForStmt__Group__6__Impl rule__ForStmt__Group__7 ;
    public final void rule__ForStmt__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2664:1: ( rule__ForStmt__Group__6__Impl rule__ForStmt__Group__7 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2665:2: rule__ForStmt__Group__6__Impl rule__ForStmt__Group__7
            {
            pushFollow(FOLLOW_rule__ForStmt__Group__6__Impl_in_rule__ForStmt__Group__65421);
            rule__ForStmt__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForStmt__Group__7_in_rule__ForStmt__Group__65424);
            rule__ForStmt__Group__7();

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
    // $ANTLR end "rule__ForStmt__Group__6"


    // $ANTLR start "rule__ForStmt__Group__6__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2672:1: rule__ForStmt__Group__6__Impl : ( ')' ) ;
    public final void rule__ForStmt__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2676:1: ( ( ')' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2677:1: ( ')' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2677:1: ( ')' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2678:1: ')'
            {
             before(grammarAccess.getForStmtAccess().getRightParenthesisKeyword_6()); 
            match(input,29,FOLLOW_29_in_rule__ForStmt__Group__6__Impl5452); 
             after(grammarAccess.getForStmtAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__ForStmt__Group__6__Impl"


    // $ANTLR start "rule__ForStmt__Group__7"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2691:1: rule__ForStmt__Group__7 : rule__ForStmt__Group__7__Impl ;
    public final void rule__ForStmt__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2695:1: ( rule__ForStmt__Group__7__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2696:2: rule__ForStmt__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__ForStmt__Group__7__Impl_in_rule__ForStmt__Group__75483);
            rule__ForStmt__Group__7__Impl();

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
    // $ANTLR end "rule__ForStmt__Group__7"


    // $ANTLR start "rule__ForStmt__Group__7__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2702:1: rule__ForStmt__Group__7__Impl : ( ( rule__ForStmt__StmtAssignment_7 ) ) ;
    public final void rule__ForStmt__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2706:1: ( ( ( rule__ForStmt__StmtAssignment_7 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2707:1: ( ( rule__ForStmt__StmtAssignment_7 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2707:1: ( ( rule__ForStmt__StmtAssignment_7 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2708:1: ( rule__ForStmt__StmtAssignment_7 )
            {
             before(grammarAccess.getForStmtAccess().getStmtAssignment_7()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2709:1: ( rule__ForStmt__StmtAssignment_7 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2709:2: rule__ForStmt__StmtAssignment_7
            {
            pushFollow(FOLLOW_rule__ForStmt__StmtAssignment_7_in_rule__ForStmt__Group__7__Impl5510);
            rule__ForStmt__StmtAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getForStmtAccess().getStmtAssignment_7()); 

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
    // $ANTLR end "rule__ForStmt__Group__7__Impl"


    // $ANTLR start "rule__IfStmt__Group__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2735:1: rule__IfStmt__Group__0 : rule__IfStmt__Group__0__Impl rule__IfStmt__Group__1 ;
    public final void rule__IfStmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2739:1: ( rule__IfStmt__Group__0__Impl rule__IfStmt__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2740:2: rule__IfStmt__Group__0__Impl rule__IfStmt__Group__1
            {
            pushFollow(FOLLOW_rule__IfStmt__Group__0__Impl_in_rule__IfStmt__Group__05556);
            rule__IfStmt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStmt__Group__1_in_rule__IfStmt__Group__05559);
            rule__IfStmt__Group__1();

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
    // $ANTLR end "rule__IfStmt__Group__0"


    // $ANTLR start "rule__IfStmt__Group__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2747:1: rule__IfStmt__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfStmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2751:1: ( ( 'if' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2752:1: ( 'if' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2752:1: ( 'if' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2753:1: 'if'
            {
             before(grammarAccess.getIfStmtAccess().getIfKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__IfStmt__Group__0__Impl5587); 
             after(grammarAccess.getIfStmtAccess().getIfKeyword_0()); 

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
    // $ANTLR end "rule__IfStmt__Group__0__Impl"


    // $ANTLR start "rule__IfStmt__Group__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2766:1: rule__IfStmt__Group__1 : rule__IfStmt__Group__1__Impl rule__IfStmt__Group__2 ;
    public final void rule__IfStmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2770:1: ( rule__IfStmt__Group__1__Impl rule__IfStmt__Group__2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2771:2: rule__IfStmt__Group__1__Impl rule__IfStmt__Group__2
            {
            pushFollow(FOLLOW_rule__IfStmt__Group__1__Impl_in_rule__IfStmt__Group__15618);
            rule__IfStmt__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStmt__Group__2_in_rule__IfStmt__Group__15621);
            rule__IfStmt__Group__2();

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
    // $ANTLR end "rule__IfStmt__Group__1"


    // $ANTLR start "rule__IfStmt__Group__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2778:1: rule__IfStmt__Group__1__Impl : ( '(' ) ;
    public final void rule__IfStmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2782:1: ( ( '(' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2783:1: ( '(' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2783:1: ( '(' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2784:1: '('
            {
             before(grammarAccess.getIfStmtAccess().getLeftParenthesisKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__IfStmt__Group__1__Impl5649); 
             after(grammarAccess.getIfStmtAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__IfStmt__Group__1__Impl"


    // $ANTLR start "rule__IfStmt__Group__2"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2797:1: rule__IfStmt__Group__2 : rule__IfStmt__Group__2__Impl rule__IfStmt__Group__3 ;
    public final void rule__IfStmt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2801:1: ( rule__IfStmt__Group__2__Impl rule__IfStmt__Group__3 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2802:2: rule__IfStmt__Group__2__Impl rule__IfStmt__Group__3
            {
            pushFollow(FOLLOW_rule__IfStmt__Group__2__Impl_in_rule__IfStmt__Group__25680);
            rule__IfStmt__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStmt__Group__3_in_rule__IfStmt__Group__25683);
            rule__IfStmt__Group__3();

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
    // $ANTLR end "rule__IfStmt__Group__2"


    // $ANTLR start "rule__IfStmt__Group__2__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2809:1: rule__IfStmt__Group__2__Impl : ( ( rule__IfStmt__ExprAssignment_2 ) ) ;
    public final void rule__IfStmt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2813:1: ( ( ( rule__IfStmt__ExprAssignment_2 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2814:1: ( ( rule__IfStmt__ExprAssignment_2 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2814:1: ( ( rule__IfStmt__ExprAssignment_2 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2815:1: ( rule__IfStmt__ExprAssignment_2 )
            {
             before(grammarAccess.getIfStmtAccess().getExprAssignment_2()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2816:1: ( rule__IfStmt__ExprAssignment_2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2816:2: rule__IfStmt__ExprAssignment_2
            {
            pushFollow(FOLLOW_rule__IfStmt__ExprAssignment_2_in_rule__IfStmt__Group__2__Impl5710);
            rule__IfStmt__ExprAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIfStmtAccess().getExprAssignment_2()); 

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
    // $ANTLR end "rule__IfStmt__Group__2__Impl"


    // $ANTLR start "rule__IfStmt__Group__3"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2826:1: rule__IfStmt__Group__3 : rule__IfStmt__Group__3__Impl rule__IfStmt__Group__4 ;
    public final void rule__IfStmt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2830:1: ( rule__IfStmt__Group__3__Impl rule__IfStmt__Group__4 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2831:2: rule__IfStmt__Group__3__Impl rule__IfStmt__Group__4
            {
            pushFollow(FOLLOW_rule__IfStmt__Group__3__Impl_in_rule__IfStmt__Group__35740);
            rule__IfStmt__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStmt__Group__4_in_rule__IfStmt__Group__35743);
            rule__IfStmt__Group__4();

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
    // $ANTLR end "rule__IfStmt__Group__3"


    // $ANTLR start "rule__IfStmt__Group__3__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2838:1: rule__IfStmt__Group__3__Impl : ( ')' ) ;
    public final void rule__IfStmt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2842:1: ( ( ')' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2843:1: ( ')' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2843:1: ( ')' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2844:1: ')'
            {
             before(grammarAccess.getIfStmtAccess().getRightParenthesisKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__IfStmt__Group__3__Impl5771); 
             after(grammarAccess.getIfStmtAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__IfStmt__Group__3__Impl"


    // $ANTLR start "rule__IfStmt__Group__4"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2857:1: rule__IfStmt__Group__4 : rule__IfStmt__Group__4__Impl rule__IfStmt__Group__5 ;
    public final void rule__IfStmt__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2861:1: ( rule__IfStmt__Group__4__Impl rule__IfStmt__Group__5 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2862:2: rule__IfStmt__Group__4__Impl rule__IfStmt__Group__5
            {
            pushFollow(FOLLOW_rule__IfStmt__Group__4__Impl_in_rule__IfStmt__Group__45802);
            rule__IfStmt__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStmt__Group__5_in_rule__IfStmt__Group__45805);
            rule__IfStmt__Group__5();

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
    // $ANTLR end "rule__IfStmt__Group__4"


    // $ANTLR start "rule__IfStmt__Group__4__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2869:1: rule__IfStmt__Group__4__Impl : ( ( rule__IfStmt__StmtAssignment_4 ) ) ;
    public final void rule__IfStmt__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2873:1: ( ( ( rule__IfStmt__StmtAssignment_4 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2874:1: ( ( rule__IfStmt__StmtAssignment_4 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2874:1: ( ( rule__IfStmt__StmtAssignment_4 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2875:1: ( rule__IfStmt__StmtAssignment_4 )
            {
             before(grammarAccess.getIfStmtAccess().getStmtAssignment_4()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2876:1: ( rule__IfStmt__StmtAssignment_4 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2876:2: rule__IfStmt__StmtAssignment_4
            {
            pushFollow(FOLLOW_rule__IfStmt__StmtAssignment_4_in_rule__IfStmt__Group__4__Impl5832);
            rule__IfStmt__StmtAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIfStmtAccess().getStmtAssignment_4()); 

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
    // $ANTLR end "rule__IfStmt__Group__4__Impl"


    // $ANTLR start "rule__IfStmt__Group__5"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2886:1: rule__IfStmt__Group__5 : rule__IfStmt__Group__5__Impl ;
    public final void rule__IfStmt__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2890:1: ( rule__IfStmt__Group__5__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2891:2: rule__IfStmt__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__IfStmt__Group__5__Impl_in_rule__IfStmt__Group__55862);
            rule__IfStmt__Group__5__Impl();

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
    // $ANTLR end "rule__IfStmt__Group__5"


    // $ANTLR start "rule__IfStmt__Group__5__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2897:1: rule__IfStmt__Group__5__Impl : ( ( rule__IfStmt__ElseAssignment_5 )? ) ;
    public final void rule__IfStmt__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2901:1: ( ( ( rule__IfStmt__ElseAssignment_5 )? ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2902:1: ( ( rule__IfStmt__ElseAssignment_5 )? )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2902:1: ( ( rule__IfStmt__ElseAssignment_5 )? )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2903:1: ( rule__IfStmt__ElseAssignment_5 )?
            {
             before(grammarAccess.getIfStmtAccess().getElseAssignment_5()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2904:1: ( rule__IfStmt__ElseAssignment_5 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==41) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2904:2: rule__IfStmt__ElseAssignment_5
                    {
                    pushFollow(FOLLOW_rule__IfStmt__ElseAssignment_5_in_rule__IfStmt__Group__5__Impl5889);
                    rule__IfStmt__ElseAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIfStmtAccess().getElseAssignment_5()); 

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
    // $ANTLR end "rule__IfStmt__Group__5__Impl"


    // $ANTLR start "rule__ElseStmt__Group__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2926:1: rule__ElseStmt__Group__0 : rule__ElseStmt__Group__0__Impl rule__ElseStmt__Group__1 ;
    public final void rule__ElseStmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2930:1: ( rule__ElseStmt__Group__0__Impl rule__ElseStmt__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2931:2: rule__ElseStmt__Group__0__Impl rule__ElseStmt__Group__1
            {
            pushFollow(FOLLOW_rule__ElseStmt__Group__0__Impl_in_rule__ElseStmt__Group__05932);
            rule__ElseStmt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElseStmt__Group__1_in_rule__ElseStmt__Group__05935);
            rule__ElseStmt__Group__1();

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
    // $ANTLR end "rule__ElseStmt__Group__0"


    // $ANTLR start "rule__ElseStmt__Group__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2938:1: rule__ElseStmt__Group__0__Impl : ( 'else' ) ;
    public final void rule__ElseStmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2942:1: ( ( 'else' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2943:1: ( 'else' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2943:1: ( 'else' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2944:1: 'else'
            {
             before(grammarAccess.getElseStmtAccess().getElseKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__ElseStmt__Group__0__Impl5963); 
             after(grammarAccess.getElseStmtAccess().getElseKeyword_0()); 

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
    // $ANTLR end "rule__ElseStmt__Group__0__Impl"


    // $ANTLR start "rule__ElseStmt__Group__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2957:1: rule__ElseStmt__Group__1 : rule__ElseStmt__Group__1__Impl ;
    public final void rule__ElseStmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2961:1: ( rule__ElseStmt__Group__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2962:2: rule__ElseStmt__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ElseStmt__Group__1__Impl_in_rule__ElseStmt__Group__15994);
            rule__ElseStmt__Group__1__Impl();

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
    // $ANTLR end "rule__ElseStmt__Group__1"


    // $ANTLR start "rule__ElseStmt__Group__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2968:1: rule__ElseStmt__Group__1__Impl : ( ( rule__ElseStmt__StmtAssignment_1 ) ) ;
    public final void rule__ElseStmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2972:1: ( ( ( rule__ElseStmt__StmtAssignment_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2973:1: ( ( rule__ElseStmt__StmtAssignment_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2973:1: ( ( rule__ElseStmt__StmtAssignment_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2974:1: ( rule__ElseStmt__StmtAssignment_1 )
            {
             before(grammarAccess.getElseStmtAccess().getStmtAssignment_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2975:1: ( rule__ElseStmt__StmtAssignment_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2975:2: rule__ElseStmt__StmtAssignment_1
            {
            pushFollow(FOLLOW_rule__ElseStmt__StmtAssignment_1_in_rule__ElseStmt__Group__1__Impl6021);
            rule__ElseStmt__StmtAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getElseStmtAccess().getStmtAssignment_1()); 

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
    // $ANTLR end "rule__ElseStmt__Group__1__Impl"


    // $ANTLR start "rule__AssStmt__Group__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2989:1: rule__AssStmt__Group__0 : rule__AssStmt__Group__0__Impl rule__AssStmt__Group__1 ;
    public final void rule__AssStmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2993:1: ( rule__AssStmt__Group__0__Impl rule__AssStmt__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2994:2: rule__AssStmt__Group__0__Impl rule__AssStmt__Group__1
            {
            pushFollow(FOLLOW_rule__AssStmt__Group__0__Impl_in_rule__AssStmt__Group__06055);
            rule__AssStmt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssStmt__Group__1_in_rule__AssStmt__Group__06058);
            rule__AssStmt__Group__1();

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
    // $ANTLR end "rule__AssStmt__Group__0"


    // $ANTLR start "rule__AssStmt__Group__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3001:1: rule__AssStmt__Group__0__Impl : ( ( rule__AssStmt__VarAssignment_0 ) ) ;
    public final void rule__AssStmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3005:1: ( ( ( rule__AssStmt__VarAssignment_0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3006:1: ( ( rule__AssStmt__VarAssignment_0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3006:1: ( ( rule__AssStmt__VarAssignment_0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3007:1: ( rule__AssStmt__VarAssignment_0 )
            {
             before(grammarAccess.getAssStmtAccess().getVarAssignment_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3008:1: ( rule__AssStmt__VarAssignment_0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3008:2: rule__AssStmt__VarAssignment_0
            {
            pushFollow(FOLLOW_rule__AssStmt__VarAssignment_0_in_rule__AssStmt__Group__0__Impl6085);
            rule__AssStmt__VarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssStmtAccess().getVarAssignment_0()); 

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
    // $ANTLR end "rule__AssStmt__Group__0__Impl"


    // $ANTLR start "rule__AssStmt__Group__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3018:1: rule__AssStmt__Group__1 : rule__AssStmt__Group__1__Impl rule__AssStmt__Group__2 ;
    public final void rule__AssStmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3022:1: ( rule__AssStmt__Group__1__Impl rule__AssStmt__Group__2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3023:2: rule__AssStmt__Group__1__Impl rule__AssStmt__Group__2
            {
            pushFollow(FOLLOW_rule__AssStmt__Group__1__Impl_in_rule__AssStmt__Group__16115);
            rule__AssStmt__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssStmt__Group__2_in_rule__AssStmt__Group__16118);
            rule__AssStmt__Group__2();

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
    // $ANTLR end "rule__AssStmt__Group__1"


    // $ANTLR start "rule__AssStmt__Group__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3030:1: rule__AssStmt__Group__1__Impl : ( '=' ) ;
    public final void rule__AssStmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3034:1: ( ( '=' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3035:1: ( '=' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3035:1: ( '=' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3036:1: '='
            {
             before(grammarAccess.getAssStmtAccess().getEqualsSignKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__AssStmt__Group__1__Impl6146); 
             after(grammarAccess.getAssStmtAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__AssStmt__Group__1__Impl"


    // $ANTLR start "rule__AssStmt__Group__2"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3049:1: rule__AssStmt__Group__2 : rule__AssStmt__Group__2__Impl rule__AssStmt__Group__3 ;
    public final void rule__AssStmt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3053:1: ( rule__AssStmt__Group__2__Impl rule__AssStmt__Group__3 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3054:2: rule__AssStmt__Group__2__Impl rule__AssStmt__Group__3
            {
            pushFollow(FOLLOW_rule__AssStmt__Group__2__Impl_in_rule__AssStmt__Group__26177);
            rule__AssStmt__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssStmt__Group__3_in_rule__AssStmt__Group__26180);
            rule__AssStmt__Group__3();

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
    // $ANTLR end "rule__AssStmt__Group__2"


    // $ANTLR start "rule__AssStmt__Group__2__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3061:1: rule__AssStmt__Group__2__Impl : ( ( rule__AssStmt__ExprAssignment_2 ) ) ;
    public final void rule__AssStmt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3065:1: ( ( ( rule__AssStmt__ExprAssignment_2 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3066:1: ( ( rule__AssStmt__ExprAssignment_2 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3066:1: ( ( rule__AssStmt__ExprAssignment_2 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3067:1: ( rule__AssStmt__ExprAssignment_2 )
            {
             before(grammarAccess.getAssStmtAccess().getExprAssignment_2()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3068:1: ( rule__AssStmt__ExprAssignment_2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3068:2: rule__AssStmt__ExprAssignment_2
            {
            pushFollow(FOLLOW_rule__AssStmt__ExprAssignment_2_in_rule__AssStmt__Group__2__Impl6207);
            rule__AssStmt__ExprAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssStmtAccess().getExprAssignment_2()); 

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
    // $ANTLR end "rule__AssStmt__Group__2__Impl"


    // $ANTLR start "rule__AssStmt__Group__3"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3078:1: rule__AssStmt__Group__3 : rule__AssStmt__Group__3__Impl ;
    public final void rule__AssStmt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3082:1: ( rule__AssStmt__Group__3__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3083:2: rule__AssStmt__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__AssStmt__Group__3__Impl_in_rule__AssStmt__Group__36237);
            rule__AssStmt__Group__3__Impl();

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
    // $ANTLR end "rule__AssStmt__Group__3"


    // $ANTLR start "rule__AssStmt__Group__3__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3089:1: rule__AssStmt__Group__3__Impl : ( ';' ) ;
    public final void rule__AssStmt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3093:1: ( ( ';' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3094:1: ( ';' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3094:1: ( ';' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3095:1: ';'
            {
             before(grammarAccess.getAssStmtAccess().getSemicolonKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__AssStmt__Group__3__Impl6265); 
             after(grammarAccess.getAssStmtAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__AssStmt__Group__3__Impl"


    // $ANTLR start "rule__AssStmt2__Group__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3116:1: rule__AssStmt2__Group__0 : rule__AssStmt2__Group__0__Impl rule__AssStmt2__Group__1 ;
    public final void rule__AssStmt2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3120:1: ( rule__AssStmt2__Group__0__Impl rule__AssStmt2__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3121:2: rule__AssStmt2__Group__0__Impl rule__AssStmt2__Group__1
            {
            pushFollow(FOLLOW_rule__AssStmt2__Group__0__Impl_in_rule__AssStmt2__Group__06304);
            rule__AssStmt2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssStmt2__Group__1_in_rule__AssStmt2__Group__06307);
            rule__AssStmt2__Group__1();

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
    // $ANTLR end "rule__AssStmt2__Group__0"


    // $ANTLR start "rule__AssStmt2__Group__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3128:1: rule__AssStmt2__Group__0__Impl : ( ( rule__AssStmt2__VarAssignment_0 ) ) ;
    public final void rule__AssStmt2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3132:1: ( ( ( rule__AssStmt2__VarAssignment_0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3133:1: ( ( rule__AssStmt2__VarAssignment_0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3133:1: ( ( rule__AssStmt2__VarAssignment_0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3134:1: ( rule__AssStmt2__VarAssignment_0 )
            {
             before(grammarAccess.getAssStmt2Access().getVarAssignment_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3135:1: ( rule__AssStmt2__VarAssignment_0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3135:2: rule__AssStmt2__VarAssignment_0
            {
            pushFollow(FOLLOW_rule__AssStmt2__VarAssignment_0_in_rule__AssStmt2__Group__0__Impl6334);
            rule__AssStmt2__VarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssStmt2Access().getVarAssignment_0()); 

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
    // $ANTLR end "rule__AssStmt2__Group__0__Impl"


    // $ANTLR start "rule__AssStmt2__Group__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3145:1: rule__AssStmt2__Group__1 : rule__AssStmt2__Group__1__Impl rule__AssStmt2__Group__2 ;
    public final void rule__AssStmt2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3149:1: ( rule__AssStmt2__Group__1__Impl rule__AssStmt2__Group__2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3150:2: rule__AssStmt2__Group__1__Impl rule__AssStmt2__Group__2
            {
            pushFollow(FOLLOW_rule__AssStmt2__Group__1__Impl_in_rule__AssStmt2__Group__16364);
            rule__AssStmt2__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssStmt2__Group__2_in_rule__AssStmt2__Group__16367);
            rule__AssStmt2__Group__2();

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
    // $ANTLR end "rule__AssStmt2__Group__1"


    // $ANTLR start "rule__AssStmt2__Group__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3157:1: rule__AssStmt2__Group__1__Impl : ( '=' ) ;
    public final void rule__AssStmt2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3161:1: ( ( '=' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3162:1: ( '=' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3162:1: ( '=' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3163:1: '='
            {
             before(grammarAccess.getAssStmt2Access().getEqualsSignKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__AssStmt2__Group__1__Impl6395); 
             after(grammarAccess.getAssStmt2Access().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__AssStmt2__Group__1__Impl"


    // $ANTLR start "rule__AssStmt2__Group__2"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3176:1: rule__AssStmt2__Group__2 : rule__AssStmt2__Group__2__Impl ;
    public final void rule__AssStmt2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3180:1: ( rule__AssStmt2__Group__2__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3181:2: rule__AssStmt2__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AssStmt2__Group__2__Impl_in_rule__AssStmt2__Group__26426);
            rule__AssStmt2__Group__2__Impl();

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
    // $ANTLR end "rule__AssStmt2__Group__2"


    // $ANTLR start "rule__AssStmt2__Group__2__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3187:1: rule__AssStmt2__Group__2__Impl : ( ( rule__AssStmt2__ExprAssignment_2 ) ) ;
    public final void rule__AssStmt2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3191:1: ( ( ( rule__AssStmt2__ExprAssignment_2 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3192:1: ( ( rule__AssStmt2__ExprAssignment_2 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3192:1: ( ( rule__AssStmt2__ExprAssignment_2 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3193:1: ( rule__AssStmt2__ExprAssignment_2 )
            {
             before(grammarAccess.getAssStmt2Access().getExprAssignment_2()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3194:1: ( rule__AssStmt2__ExprAssignment_2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3194:2: rule__AssStmt2__ExprAssignment_2
            {
            pushFollow(FOLLOW_rule__AssStmt2__ExprAssignment_2_in_rule__AssStmt2__Group__2__Impl6453);
            rule__AssStmt2__ExprAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssStmt2Access().getExprAssignment_2()); 

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
    // $ANTLR end "rule__AssStmt2__Group__2__Impl"


    // $ANTLR start "rule__AttrList__Group__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3210:1: rule__AttrList__Group__0 : rule__AttrList__Group__0__Impl rule__AttrList__Group__1 ;
    public final void rule__AttrList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3214:1: ( rule__AttrList__Group__0__Impl rule__AttrList__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3215:2: rule__AttrList__Group__0__Impl rule__AttrList__Group__1
            {
            pushFollow(FOLLOW_rule__AttrList__Group__0__Impl_in_rule__AttrList__Group__06489);
            rule__AttrList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrList__Group__1_in_rule__AttrList__Group__06492);
            rule__AttrList__Group__1();

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
    // $ANTLR end "rule__AttrList__Group__0"


    // $ANTLR start "rule__AttrList__Group__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3222:1: rule__AttrList__Group__0__Impl : ( () ) ;
    public final void rule__AttrList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3226:1: ( ( () ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3227:1: ( () )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3227:1: ( () )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3228:1: ()
            {
             before(grammarAccess.getAttrListAccess().getAttrListAction_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3229:1: ()
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3231:1: 
            {
            }

             after(grammarAccess.getAttrListAccess().getAttrListAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttrList__Group__0__Impl"


    // $ANTLR start "rule__AttrList__Group__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3241:1: rule__AttrList__Group__1 : rule__AttrList__Group__1__Impl ;
    public final void rule__AttrList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3245:1: ( rule__AttrList__Group__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3246:2: rule__AttrList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AttrList__Group__1__Impl_in_rule__AttrList__Group__16550);
            rule__AttrList__Group__1__Impl();

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
    // $ANTLR end "rule__AttrList__Group__1"


    // $ANTLR start "rule__AttrList__Group__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3252:1: rule__AttrList__Group__1__Impl : ( ( rule__AttrList__Group_1__0 ) ) ;
    public final void rule__AttrList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3256:1: ( ( ( rule__AttrList__Group_1__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3257:1: ( ( rule__AttrList__Group_1__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3257:1: ( ( rule__AttrList__Group_1__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3258:1: ( rule__AttrList__Group_1__0 )
            {
             before(grammarAccess.getAttrListAccess().getGroup_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3259:1: ( rule__AttrList__Group_1__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3259:2: rule__AttrList__Group_1__0
            {
            pushFollow(FOLLOW_rule__AttrList__Group_1__0_in_rule__AttrList__Group__1__Impl6577);
            rule__AttrList__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getAttrListAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AttrList__Group__1__Impl"


    // $ANTLR start "rule__AttrList__Group_1__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3273:1: rule__AttrList__Group_1__0 : rule__AttrList__Group_1__0__Impl rule__AttrList__Group_1__1 ;
    public final void rule__AttrList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3277:1: ( rule__AttrList__Group_1__0__Impl rule__AttrList__Group_1__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3278:2: rule__AttrList__Group_1__0__Impl rule__AttrList__Group_1__1
            {
            pushFollow(FOLLOW_rule__AttrList__Group_1__0__Impl_in_rule__AttrList__Group_1__06611);
            rule__AttrList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrList__Group_1__1_in_rule__AttrList__Group_1__06614);
            rule__AttrList__Group_1__1();

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
    // $ANTLR end "rule__AttrList__Group_1__0"


    // $ANTLR start "rule__AttrList__Group_1__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3285:1: rule__AttrList__Group_1__0__Impl : ( ( rule__AttrList__AttrAssignment_1_0 )? ) ;
    public final void rule__AttrList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3289:1: ( ( ( rule__AttrList__AttrAssignment_1_0 )? ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3290:1: ( ( rule__AttrList__AttrAssignment_1_0 )? )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3290:1: ( ( rule__AttrList__AttrAssignment_1_0 )? )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3291:1: ( rule__AttrList__AttrAssignment_1_0 )?
            {
             before(grammarAccess.getAttrListAccess().getAttrAssignment_1_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3292:1: ( rule__AttrList__AttrAssignment_1_0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3292:2: rule__AttrList__AttrAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__AttrList__AttrAssignment_1_0_in_rule__AttrList__Group_1__0__Impl6641);
                    rule__AttrList__AttrAssignment_1_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttrListAccess().getAttrAssignment_1_0()); 

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
    // $ANTLR end "rule__AttrList__Group_1__0__Impl"


    // $ANTLR start "rule__AttrList__Group_1__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3302:1: rule__AttrList__Group_1__1 : rule__AttrList__Group_1__1__Impl ;
    public final void rule__AttrList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3306:1: ( rule__AttrList__Group_1__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3307:2: rule__AttrList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AttrList__Group_1__1__Impl_in_rule__AttrList__Group_1__16672);
            rule__AttrList__Group_1__1__Impl();

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
    // $ANTLR end "rule__AttrList__Group_1__1"


    // $ANTLR start "rule__AttrList__Group_1__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3313:1: rule__AttrList__Group_1__1__Impl : ( ( rule__AttrList__Group_1_1__0 )* ) ;
    public final void rule__AttrList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3317:1: ( ( ( rule__AttrList__Group_1_1__0 )* ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3318:1: ( ( rule__AttrList__Group_1_1__0 )* )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3318:1: ( ( rule__AttrList__Group_1_1__0 )* )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3319:1: ( rule__AttrList__Group_1_1__0 )*
            {
             before(grammarAccess.getAttrListAccess().getGroup_1_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3320:1: ( rule__AttrList__Group_1_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==42) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3320:2: rule__AttrList__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AttrList__Group_1_1__0_in_rule__AttrList__Group_1__1__Impl6699);
            	    rule__AttrList__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getAttrListAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__AttrList__Group_1__1__Impl"


    // $ANTLR start "rule__AttrList__Group_1_1__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3334:1: rule__AttrList__Group_1_1__0 : rule__AttrList__Group_1_1__0__Impl rule__AttrList__Group_1_1__1 ;
    public final void rule__AttrList__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3338:1: ( rule__AttrList__Group_1_1__0__Impl rule__AttrList__Group_1_1__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3339:2: rule__AttrList__Group_1_1__0__Impl rule__AttrList__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__AttrList__Group_1_1__0__Impl_in_rule__AttrList__Group_1_1__06734);
            rule__AttrList__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrList__Group_1_1__1_in_rule__AttrList__Group_1_1__06737);
            rule__AttrList__Group_1_1__1();

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
    // $ANTLR end "rule__AttrList__Group_1_1__0"


    // $ANTLR start "rule__AttrList__Group_1_1__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3346:1: rule__AttrList__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__AttrList__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3350:1: ( ( ',' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3351:1: ( ',' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3351:1: ( ',' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3352:1: ','
            {
             before(grammarAccess.getAttrListAccess().getCommaKeyword_1_1_0()); 
            match(input,42,FOLLOW_42_in_rule__AttrList__Group_1_1__0__Impl6765); 
             after(grammarAccess.getAttrListAccess().getCommaKeyword_1_1_0()); 

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
    // $ANTLR end "rule__AttrList__Group_1_1__0__Impl"


    // $ANTLR start "rule__AttrList__Group_1_1__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3365:1: rule__AttrList__Group_1_1__1 : rule__AttrList__Group_1_1__1__Impl ;
    public final void rule__AttrList__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3369:1: ( rule__AttrList__Group_1_1__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3370:2: rule__AttrList__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AttrList__Group_1_1__1__Impl_in_rule__AttrList__Group_1_1__16796);
            rule__AttrList__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__AttrList__Group_1_1__1"


    // $ANTLR start "rule__AttrList__Group_1_1__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3376:1: rule__AttrList__Group_1_1__1__Impl : ( ( rule__AttrList__AttrAssignment_1_1_1 ) ) ;
    public final void rule__AttrList__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3380:1: ( ( ( rule__AttrList__AttrAssignment_1_1_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3381:1: ( ( rule__AttrList__AttrAssignment_1_1_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3381:1: ( ( rule__AttrList__AttrAssignment_1_1_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3382:1: ( rule__AttrList__AttrAssignment_1_1_1 )
            {
             before(grammarAccess.getAttrListAccess().getAttrAssignment_1_1_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3383:1: ( rule__AttrList__AttrAssignment_1_1_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3383:2: rule__AttrList__AttrAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__AttrList__AttrAssignment_1_1_1_in_rule__AttrList__Group_1_1__1__Impl6823);
            rule__AttrList__AttrAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAttrListAccess().getAttrAssignment_1_1_1()); 

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
    // $ANTLR end "rule__AttrList__Group_1_1__1__Impl"


    // $ANTLR start "rule__AttrAss__Group__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3397:1: rule__AttrAss__Group__0 : rule__AttrAss__Group__0__Impl rule__AttrAss__Group__1 ;
    public final void rule__AttrAss__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3401:1: ( rule__AttrAss__Group__0__Impl rule__AttrAss__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3402:2: rule__AttrAss__Group__0__Impl rule__AttrAss__Group__1
            {
            pushFollow(FOLLOW_rule__AttrAss__Group__0__Impl_in_rule__AttrAss__Group__06857);
            rule__AttrAss__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrAss__Group__1_in_rule__AttrAss__Group__06860);
            rule__AttrAss__Group__1();

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
    // $ANTLR end "rule__AttrAss__Group__0"


    // $ANTLR start "rule__AttrAss__Group__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3409:1: rule__AttrAss__Group__0__Impl : ( ( rule__AttrAss__NameAssignment_0 ) ) ;
    public final void rule__AttrAss__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3413:1: ( ( ( rule__AttrAss__NameAssignment_0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3414:1: ( ( rule__AttrAss__NameAssignment_0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3414:1: ( ( rule__AttrAss__NameAssignment_0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3415:1: ( rule__AttrAss__NameAssignment_0 )
            {
             before(grammarAccess.getAttrAssAccess().getNameAssignment_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3416:1: ( rule__AttrAss__NameAssignment_0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3416:2: rule__AttrAss__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__AttrAss__NameAssignment_0_in_rule__AttrAss__Group__0__Impl6887);
            rule__AttrAss__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttrAssAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__AttrAss__Group__0__Impl"


    // $ANTLR start "rule__AttrAss__Group__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3426:1: rule__AttrAss__Group__1 : rule__AttrAss__Group__1__Impl rule__AttrAss__Group__2 ;
    public final void rule__AttrAss__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3430:1: ( rule__AttrAss__Group__1__Impl rule__AttrAss__Group__2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3431:2: rule__AttrAss__Group__1__Impl rule__AttrAss__Group__2
            {
            pushFollow(FOLLOW_rule__AttrAss__Group__1__Impl_in_rule__AttrAss__Group__16917);
            rule__AttrAss__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrAss__Group__2_in_rule__AttrAss__Group__16920);
            rule__AttrAss__Group__2();

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
    // $ANTLR end "rule__AttrAss__Group__1"


    // $ANTLR start "rule__AttrAss__Group__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3438:1: rule__AttrAss__Group__1__Impl : ( '=' ) ;
    public final void rule__AttrAss__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3442:1: ( ( '=' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3443:1: ( '=' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3443:1: ( '=' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3444:1: '='
            {
             before(grammarAccess.getAttrAssAccess().getEqualsSignKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__AttrAss__Group__1__Impl6948); 
             after(grammarAccess.getAttrAssAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__AttrAss__Group__1__Impl"


    // $ANTLR start "rule__AttrAss__Group__2"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3457:1: rule__AttrAss__Group__2 : rule__AttrAss__Group__2__Impl ;
    public final void rule__AttrAss__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3461:1: ( rule__AttrAss__Group__2__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3462:2: rule__AttrAss__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AttrAss__Group__2__Impl_in_rule__AttrAss__Group__26979);
            rule__AttrAss__Group__2__Impl();

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
    // $ANTLR end "rule__AttrAss__Group__2"


    // $ANTLR start "rule__AttrAss__Group__2__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3468:1: rule__AttrAss__Group__2__Impl : ( ( rule__AttrAss__ExprAssignment_2 ) ) ;
    public final void rule__AttrAss__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3472:1: ( ( ( rule__AttrAss__ExprAssignment_2 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3473:1: ( ( rule__AttrAss__ExprAssignment_2 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3473:1: ( ( rule__AttrAss__ExprAssignment_2 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3474:1: ( rule__AttrAss__ExprAssignment_2 )
            {
             before(grammarAccess.getAttrAssAccess().getExprAssignment_2()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3475:1: ( rule__AttrAss__ExprAssignment_2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3475:2: rule__AttrAss__ExprAssignment_2
            {
            pushFollow(FOLLOW_rule__AttrAss__ExprAssignment_2_in_rule__AttrAss__Group__2__Impl7006);
            rule__AttrAss__ExprAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttrAssAccess().getExprAssignment_2()); 

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
    // $ANTLR end "rule__AttrAss__Group__2__Impl"


    // $ANTLR start "rule__Expr__Group__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3491:1: rule__Expr__Group__0 : rule__Expr__Group__0__Impl rule__Expr__Group__1 ;
    public final void rule__Expr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3495:1: ( rule__Expr__Group__0__Impl rule__Expr__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3496:2: rule__Expr__Group__0__Impl rule__Expr__Group__1
            {
            pushFollow(FOLLOW_rule__Expr__Group__0__Impl_in_rule__Expr__Group__07042);
            rule__Expr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expr__Group__1_in_rule__Expr__Group__07045);
            rule__Expr__Group__1();

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
    // $ANTLR end "rule__Expr__Group__0"


    // $ANTLR start "rule__Expr__Group__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3503:1: rule__Expr__Group__0__Impl : ( ( rule__Expr__ConjAssignment_0 ) ) ;
    public final void rule__Expr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3507:1: ( ( ( rule__Expr__ConjAssignment_0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3508:1: ( ( rule__Expr__ConjAssignment_0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3508:1: ( ( rule__Expr__ConjAssignment_0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3509:1: ( rule__Expr__ConjAssignment_0 )
            {
             before(grammarAccess.getExprAccess().getConjAssignment_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3510:1: ( rule__Expr__ConjAssignment_0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3510:2: rule__Expr__ConjAssignment_0
            {
            pushFollow(FOLLOW_rule__Expr__ConjAssignment_0_in_rule__Expr__Group__0__Impl7072);
            rule__Expr__ConjAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExprAccess().getConjAssignment_0()); 

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
    // $ANTLR end "rule__Expr__Group__0__Impl"


    // $ANTLR start "rule__Expr__Group__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3520:1: rule__Expr__Group__1 : rule__Expr__Group__1__Impl ;
    public final void rule__Expr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3524:1: ( rule__Expr__Group__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3525:2: rule__Expr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expr__Group__1__Impl_in_rule__Expr__Group__17102);
            rule__Expr__Group__1__Impl();

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
    // $ANTLR end "rule__Expr__Group__1"


    // $ANTLR start "rule__Expr__Group__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3531:1: rule__Expr__Group__1__Impl : ( ( rule__Expr__Group_1__0 )* ) ;
    public final void rule__Expr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3535:1: ( ( ( rule__Expr__Group_1__0 )* ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3536:1: ( ( rule__Expr__Group_1__0 )* )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3536:1: ( ( rule__Expr__Group_1__0 )* )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3537:1: ( rule__Expr__Group_1__0 )*
            {
             before(grammarAccess.getExprAccess().getGroup_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3538:1: ( rule__Expr__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==43) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3538:2: rule__Expr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Expr__Group_1__0_in_rule__Expr__Group__1__Impl7129);
            	    rule__Expr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getExprAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Expr__Group__1__Impl"


    // $ANTLR start "rule__Expr__Group_1__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3552:1: rule__Expr__Group_1__0 : rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1 ;
    public final void rule__Expr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3556:1: ( rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3557:2: rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expr__Group_1__0__Impl_in_rule__Expr__Group_1__07164);
            rule__Expr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Expr__Group_1__1_in_rule__Expr__Group_1__07167);
            rule__Expr__Group_1__1();

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
    // $ANTLR end "rule__Expr__Group_1__0"


    // $ANTLR start "rule__Expr__Group_1__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3564:1: rule__Expr__Group_1__0__Impl : ( '||' ) ;
    public final void rule__Expr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3568:1: ( ( '||' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3569:1: ( '||' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3569:1: ( '||' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3570:1: '||'
            {
             before(grammarAccess.getExprAccess().getVerticalLineVerticalLineKeyword_1_0()); 
            match(input,43,FOLLOW_43_in_rule__Expr__Group_1__0__Impl7195); 
             after(grammarAccess.getExprAccess().getVerticalLineVerticalLineKeyword_1_0()); 

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
    // $ANTLR end "rule__Expr__Group_1__0__Impl"


    // $ANTLR start "rule__Expr__Group_1__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3583:1: rule__Expr__Group_1__1 : rule__Expr__Group_1__1__Impl ;
    public final void rule__Expr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3587:1: ( rule__Expr__Group_1__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3588:2: rule__Expr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Expr__Group_1__1__Impl_in_rule__Expr__Group_1__17226);
            rule__Expr__Group_1__1__Impl();

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
    // $ANTLR end "rule__Expr__Group_1__1"


    // $ANTLR start "rule__Expr__Group_1__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3594:1: rule__Expr__Group_1__1__Impl : ( ( rule__Expr__ConjAssignment_1_1 ) ) ;
    public final void rule__Expr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3598:1: ( ( ( rule__Expr__ConjAssignment_1_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3599:1: ( ( rule__Expr__ConjAssignment_1_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3599:1: ( ( rule__Expr__ConjAssignment_1_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3600:1: ( rule__Expr__ConjAssignment_1_1 )
            {
             before(grammarAccess.getExprAccess().getConjAssignment_1_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3601:1: ( rule__Expr__ConjAssignment_1_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3601:2: rule__Expr__ConjAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expr__ConjAssignment_1_1_in_rule__Expr__Group_1__1__Impl7253);
            rule__Expr__ConjAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExprAccess().getConjAssignment_1_1()); 

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
    // $ANTLR end "rule__Expr__Group_1__1__Impl"


    // $ANTLR start "rule__Conj__Group__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3615:1: rule__Conj__Group__0 : rule__Conj__Group__0__Impl rule__Conj__Group__1 ;
    public final void rule__Conj__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3619:1: ( rule__Conj__Group__0__Impl rule__Conj__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3620:2: rule__Conj__Group__0__Impl rule__Conj__Group__1
            {
            pushFollow(FOLLOW_rule__Conj__Group__0__Impl_in_rule__Conj__Group__07287);
            rule__Conj__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conj__Group__1_in_rule__Conj__Group__07290);
            rule__Conj__Group__1();

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
    // $ANTLR end "rule__Conj__Group__0"


    // $ANTLR start "rule__Conj__Group__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3627:1: rule__Conj__Group__0__Impl : ( ( rule__Conj__RelatAssignment_0 ) ) ;
    public final void rule__Conj__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3631:1: ( ( ( rule__Conj__RelatAssignment_0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3632:1: ( ( rule__Conj__RelatAssignment_0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3632:1: ( ( rule__Conj__RelatAssignment_0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3633:1: ( rule__Conj__RelatAssignment_0 )
            {
             before(grammarAccess.getConjAccess().getRelatAssignment_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3634:1: ( rule__Conj__RelatAssignment_0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3634:2: rule__Conj__RelatAssignment_0
            {
            pushFollow(FOLLOW_rule__Conj__RelatAssignment_0_in_rule__Conj__Group__0__Impl7317);
            rule__Conj__RelatAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConjAccess().getRelatAssignment_0()); 

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
    // $ANTLR end "rule__Conj__Group__0__Impl"


    // $ANTLR start "rule__Conj__Group__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3644:1: rule__Conj__Group__1 : rule__Conj__Group__1__Impl ;
    public final void rule__Conj__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3648:1: ( rule__Conj__Group__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3649:2: rule__Conj__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Conj__Group__1__Impl_in_rule__Conj__Group__17347);
            rule__Conj__Group__1__Impl();

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
    // $ANTLR end "rule__Conj__Group__1"


    // $ANTLR start "rule__Conj__Group__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3655:1: rule__Conj__Group__1__Impl : ( ( rule__Conj__Group_1__0 )* ) ;
    public final void rule__Conj__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3659:1: ( ( ( rule__Conj__Group_1__0 )* ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3660:1: ( ( rule__Conj__Group_1__0 )* )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3660:1: ( ( rule__Conj__Group_1__0 )* )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3661:1: ( rule__Conj__Group_1__0 )*
            {
             before(grammarAccess.getConjAccess().getGroup_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3662:1: ( rule__Conj__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==44) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3662:2: rule__Conj__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Conj__Group_1__0_in_rule__Conj__Group__1__Impl7374);
            	    rule__Conj__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getConjAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Conj__Group__1__Impl"


    // $ANTLR start "rule__Conj__Group_1__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3676:1: rule__Conj__Group_1__0 : rule__Conj__Group_1__0__Impl rule__Conj__Group_1__1 ;
    public final void rule__Conj__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3680:1: ( rule__Conj__Group_1__0__Impl rule__Conj__Group_1__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3681:2: rule__Conj__Group_1__0__Impl rule__Conj__Group_1__1
            {
            pushFollow(FOLLOW_rule__Conj__Group_1__0__Impl_in_rule__Conj__Group_1__07409);
            rule__Conj__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conj__Group_1__1_in_rule__Conj__Group_1__07412);
            rule__Conj__Group_1__1();

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
    // $ANTLR end "rule__Conj__Group_1__0"


    // $ANTLR start "rule__Conj__Group_1__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3688:1: rule__Conj__Group_1__0__Impl : ( '&&' ) ;
    public final void rule__Conj__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3692:1: ( ( '&&' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3693:1: ( '&&' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3693:1: ( '&&' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3694:1: '&&'
            {
             before(grammarAccess.getConjAccess().getAmpersandAmpersandKeyword_1_0()); 
            match(input,44,FOLLOW_44_in_rule__Conj__Group_1__0__Impl7440); 
             after(grammarAccess.getConjAccess().getAmpersandAmpersandKeyword_1_0()); 

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
    // $ANTLR end "rule__Conj__Group_1__0__Impl"


    // $ANTLR start "rule__Conj__Group_1__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3707:1: rule__Conj__Group_1__1 : rule__Conj__Group_1__1__Impl ;
    public final void rule__Conj__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3711:1: ( rule__Conj__Group_1__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3712:2: rule__Conj__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Conj__Group_1__1__Impl_in_rule__Conj__Group_1__17471);
            rule__Conj__Group_1__1__Impl();

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
    // $ANTLR end "rule__Conj__Group_1__1"


    // $ANTLR start "rule__Conj__Group_1__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3718:1: rule__Conj__Group_1__1__Impl : ( ( rule__Conj__RelatAssignment_1_1 ) ) ;
    public final void rule__Conj__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3722:1: ( ( ( rule__Conj__RelatAssignment_1_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3723:1: ( ( rule__Conj__RelatAssignment_1_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3723:1: ( ( rule__Conj__RelatAssignment_1_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3724:1: ( rule__Conj__RelatAssignment_1_1 )
            {
             before(grammarAccess.getConjAccess().getRelatAssignment_1_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3725:1: ( rule__Conj__RelatAssignment_1_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3725:2: rule__Conj__RelatAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Conj__RelatAssignment_1_1_in_rule__Conj__Group_1__1__Impl7498);
            rule__Conj__RelatAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConjAccess().getRelatAssignment_1_1()); 

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
    // $ANTLR end "rule__Conj__Group_1__1__Impl"


    // $ANTLR start "rule__Relat__Group__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3739:1: rule__Relat__Group__0 : rule__Relat__Group__0__Impl rule__Relat__Group__1 ;
    public final void rule__Relat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3743:1: ( rule__Relat__Group__0__Impl rule__Relat__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3744:2: rule__Relat__Group__0__Impl rule__Relat__Group__1
            {
            pushFollow(FOLLOW_rule__Relat__Group__0__Impl_in_rule__Relat__Group__07532);
            rule__Relat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relat__Group__1_in_rule__Relat__Group__07535);
            rule__Relat__Group__1();

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
    // $ANTLR end "rule__Relat__Group__0"


    // $ANTLR start "rule__Relat__Group__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3751:1: rule__Relat__Group__0__Impl : ( ( rule__Relat__AddAssignment_0 ) ) ;
    public final void rule__Relat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3755:1: ( ( ( rule__Relat__AddAssignment_0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3756:1: ( ( rule__Relat__AddAssignment_0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3756:1: ( ( rule__Relat__AddAssignment_0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3757:1: ( rule__Relat__AddAssignment_0 )
            {
             before(grammarAccess.getRelatAccess().getAddAssignment_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3758:1: ( rule__Relat__AddAssignment_0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3758:2: rule__Relat__AddAssignment_0
            {
            pushFollow(FOLLOW_rule__Relat__AddAssignment_0_in_rule__Relat__Group__0__Impl7562);
            rule__Relat__AddAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRelatAccess().getAddAssignment_0()); 

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
    // $ANTLR end "rule__Relat__Group__0__Impl"


    // $ANTLR start "rule__Relat__Group__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3768:1: rule__Relat__Group__1 : rule__Relat__Group__1__Impl ;
    public final void rule__Relat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3772:1: ( rule__Relat__Group__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3773:2: rule__Relat__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Relat__Group__1__Impl_in_rule__Relat__Group__17592);
            rule__Relat__Group__1__Impl();

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
    // $ANTLR end "rule__Relat__Group__1"


    // $ANTLR start "rule__Relat__Group__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3779:1: rule__Relat__Group__1__Impl : ( ( rule__Relat__Group_1__0 )* ) ;
    public final void rule__Relat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3783:1: ( ( ( rule__Relat__Group_1__0 )* ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3784:1: ( ( rule__Relat__Group_1__0 )* )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3784:1: ( ( rule__Relat__Group_1__0 )* )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3785:1: ( rule__Relat__Group_1__0 )*
            {
             before(grammarAccess.getRelatAccess().getGroup_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3786:1: ( rule__Relat__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=19 && LA23_0<=21)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3786:2: rule__Relat__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Relat__Group_1__0_in_rule__Relat__Group__1__Impl7619);
            	    rule__Relat__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getRelatAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Relat__Group__1__Impl"


    // $ANTLR start "rule__Relat__Group_1__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3800:1: rule__Relat__Group_1__0 : rule__Relat__Group_1__0__Impl rule__Relat__Group_1__1 ;
    public final void rule__Relat__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3804:1: ( rule__Relat__Group_1__0__Impl rule__Relat__Group_1__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3805:2: rule__Relat__Group_1__0__Impl rule__Relat__Group_1__1
            {
            pushFollow(FOLLOW_rule__Relat__Group_1__0__Impl_in_rule__Relat__Group_1__07654);
            rule__Relat__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relat__Group_1__1_in_rule__Relat__Group_1__07657);
            rule__Relat__Group_1__1();

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
    // $ANTLR end "rule__Relat__Group_1__0"


    // $ANTLR start "rule__Relat__Group_1__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3812:1: rule__Relat__Group_1__0__Impl : ( ( rule__Relat__Alternatives_1_0 ) ) ;
    public final void rule__Relat__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3816:1: ( ( ( rule__Relat__Alternatives_1_0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3817:1: ( ( rule__Relat__Alternatives_1_0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3817:1: ( ( rule__Relat__Alternatives_1_0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3818:1: ( rule__Relat__Alternatives_1_0 )
            {
             before(grammarAccess.getRelatAccess().getAlternatives_1_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3819:1: ( rule__Relat__Alternatives_1_0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3819:2: rule__Relat__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Relat__Alternatives_1_0_in_rule__Relat__Group_1__0__Impl7684);
            rule__Relat__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getRelatAccess().getAlternatives_1_0()); 

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
    // $ANTLR end "rule__Relat__Group_1__0__Impl"


    // $ANTLR start "rule__Relat__Group_1__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3829:1: rule__Relat__Group_1__1 : rule__Relat__Group_1__1__Impl ;
    public final void rule__Relat__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3833:1: ( rule__Relat__Group_1__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3834:2: rule__Relat__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Relat__Group_1__1__Impl_in_rule__Relat__Group_1__17714);
            rule__Relat__Group_1__1__Impl();

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
    // $ANTLR end "rule__Relat__Group_1__1"


    // $ANTLR start "rule__Relat__Group_1__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3840:1: rule__Relat__Group_1__1__Impl : ( ( rule__Relat__AddAssignment_1_1 ) ) ;
    public final void rule__Relat__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3844:1: ( ( ( rule__Relat__AddAssignment_1_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3845:1: ( ( rule__Relat__AddAssignment_1_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3845:1: ( ( rule__Relat__AddAssignment_1_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3846:1: ( rule__Relat__AddAssignment_1_1 )
            {
             before(grammarAccess.getRelatAccess().getAddAssignment_1_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3847:1: ( rule__Relat__AddAssignment_1_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3847:2: rule__Relat__AddAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Relat__AddAssignment_1_1_in_rule__Relat__Group_1__1__Impl7741);
            rule__Relat__AddAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRelatAccess().getAddAssignment_1_1()); 

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
    // $ANTLR end "rule__Relat__Group_1__1__Impl"


    // $ANTLR start "rule__Add__Group__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3861:1: rule__Add__Group__0 : rule__Add__Group__0__Impl rule__Add__Group__1 ;
    public final void rule__Add__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3865:1: ( rule__Add__Group__0__Impl rule__Add__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3866:2: rule__Add__Group__0__Impl rule__Add__Group__1
            {
            pushFollow(FOLLOW_rule__Add__Group__0__Impl_in_rule__Add__Group__07775);
            rule__Add__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Add__Group__1_in_rule__Add__Group__07778);
            rule__Add__Group__1();

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
    // $ANTLR end "rule__Add__Group__0"


    // $ANTLR start "rule__Add__Group__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3873:1: rule__Add__Group__0__Impl : ( ( rule__Add__MultAssignment_0 ) ) ;
    public final void rule__Add__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3877:1: ( ( ( rule__Add__MultAssignment_0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3878:1: ( ( rule__Add__MultAssignment_0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3878:1: ( ( rule__Add__MultAssignment_0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3879:1: ( rule__Add__MultAssignment_0 )
            {
             before(grammarAccess.getAddAccess().getMultAssignment_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3880:1: ( rule__Add__MultAssignment_0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3880:2: rule__Add__MultAssignment_0
            {
            pushFollow(FOLLOW_rule__Add__MultAssignment_0_in_rule__Add__Group__0__Impl7805);
            rule__Add__MultAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getMultAssignment_0()); 

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
    // $ANTLR end "rule__Add__Group__0__Impl"


    // $ANTLR start "rule__Add__Group__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3890:1: rule__Add__Group__1 : rule__Add__Group__1__Impl ;
    public final void rule__Add__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3894:1: ( rule__Add__Group__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3895:2: rule__Add__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Add__Group__1__Impl_in_rule__Add__Group__17835);
            rule__Add__Group__1__Impl();

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
    // $ANTLR end "rule__Add__Group__1"


    // $ANTLR start "rule__Add__Group__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3901:1: rule__Add__Group__1__Impl : ( ( rule__Add__Group_1__0 )* ) ;
    public final void rule__Add__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3905:1: ( ( ( rule__Add__Group_1__0 )* ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3906:1: ( ( rule__Add__Group_1__0 )* )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3906:1: ( ( rule__Add__Group_1__0 )* )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3907:1: ( rule__Add__Group_1__0 )*
            {
             before(grammarAccess.getAddAccess().getGroup_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3908:1: ( rule__Add__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=22 && LA24_0<=23)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3908:2: rule__Add__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Add__Group_1__0_in_rule__Add__Group__1__Impl7862);
            	    rule__Add__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getAddAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Add__Group__1__Impl"


    // $ANTLR start "rule__Add__Group_1__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3922:1: rule__Add__Group_1__0 : rule__Add__Group_1__0__Impl rule__Add__Group_1__1 ;
    public final void rule__Add__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3926:1: ( rule__Add__Group_1__0__Impl rule__Add__Group_1__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3927:2: rule__Add__Group_1__0__Impl rule__Add__Group_1__1
            {
            pushFollow(FOLLOW_rule__Add__Group_1__0__Impl_in_rule__Add__Group_1__07897);
            rule__Add__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Add__Group_1__1_in_rule__Add__Group_1__07900);
            rule__Add__Group_1__1();

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
    // $ANTLR end "rule__Add__Group_1__0"


    // $ANTLR start "rule__Add__Group_1__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3934:1: rule__Add__Group_1__0__Impl : ( ( rule__Add__Alternatives_1_0 ) ) ;
    public final void rule__Add__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3938:1: ( ( ( rule__Add__Alternatives_1_0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3939:1: ( ( rule__Add__Alternatives_1_0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3939:1: ( ( rule__Add__Alternatives_1_0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3940:1: ( rule__Add__Alternatives_1_0 )
            {
             before(grammarAccess.getAddAccess().getAlternatives_1_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3941:1: ( rule__Add__Alternatives_1_0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3941:2: rule__Add__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Add__Alternatives_1_0_in_rule__Add__Group_1__0__Impl7927);
            rule__Add__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getAlternatives_1_0()); 

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
    // $ANTLR end "rule__Add__Group_1__0__Impl"


    // $ANTLR start "rule__Add__Group_1__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3951:1: rule__Add__Group_1__1 : rule__Add__Group_1__1__Impl ;
    public final void rule__Add__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3955:1: ( rule__Add__Group_1__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3956:2: rule__Add__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Add__Group_1__1__Impl_in_rule__Add__Group_1__17957);
            rule__Add__Group_1__1__Impl();

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
    // $ANTLR end "rule__Add__Group_1__1"


    // $ANTLR start "rule__Add__Group_1__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3962:1: rule__Add__Group_1__1__Impl : ( ( rule__Add__MultAssignment_1_1 ) ) ;
    public final void rule__Add__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3966:1: ( ( ( rule__Add__MultAssignment_1_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3967:1: ( ( rule__Add__MultAssignment_1_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3967:1: ( ( rule__Add__MultAssignment_1_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3968:1: ( rule__Add__MultAssignment_1_1 )
            {
             before(grammarAccess.getAddAccess().getMultAssignment_1_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3969:1: ( rule__Add__MultAssignment_1_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3969:2: rule__Add__MultAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Add__MultAssignment_1_1_in_rule__Add__Group_1__1__Impl7984);
            rule__Add__MultAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAddAccess().getMultAssignment_1_1()); 

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
    // $ANTLR end "rule__Add__Group_1__1__Impl"


    // $ANTLR start "rule__Mult__Group__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3983:1: rule__Mult__Group__0 : rule__Mult__Group__0__Impl rule__Mult__Group__1 ;
    public final void rule__Mult__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3987:1: ( rule__Mult__Group__0__Impl rule__Mult__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3988:2: rule__Mult__Group__0__Impl rule__Mult__Group__1
            {
            pushFollow(FOLLOW_rule__Mult__Group__0__Impl_in_rule__Mult__Group__08018);
            rule__Mult__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mult__Group__1_in_rule__Mult__Group__08021);
            rule__Mult__Group__1();

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
    // $ANTLR end "rule__Mult__Group__0"


    // $ANTLR start "rule__Mult__Group__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3995:1: rule__Mult__Group__0__Impl : ( ( rule__Mult__UnaryAssignment_0 ) ) ;
    public final void rule__Mult__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3999:1: ( ( ( rule__Mult__UnaryAssignment_0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4000:1: ( ( rule__Mult__UnaryAssignment_0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4000:1: ( ( rule__Mult__UnaryAssignment_0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4001:1: ( rule__Mult__UnaryAssignment_0 )
            {
             before(grammarAccess.getMultAccess().getUnaryAssignment_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4002:1: ( rule__Mult__UnaryAssignment_0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4002:2: rule__Mult__UnaryAssignment_0
            {
            pushFollow(FOLLOW_rule__Mult__UnaryAssignment_0_in_rule__Mult__Group__0__Impl8048);
            rule__Mult__UnaryAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMultAccess().getUnaryAssignment_0()); 

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
    // $ANTLR end "rule__Mult__Group__0__Impl"


    // $ANTLR start "rule__Mult__Group__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4012:1: rule__Mult__Group__1 : rule__Mult__Group__1__Impl ;
    public final void rule__Mult__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4016:1: ( rule__Mult__Group__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4017:2: rule__Mult__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Mult__Group__1__Impl_in_rule__Mult__Group__18078);
            rule__Mult__Group__1__Impl();

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
    // $ANTLR end "rule__Mult__Group__1"


    // $ANTLR start "rule__Mult__Group__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4023:1: rule__Mult__Group__1__Impl : ( ( rule__Mult__Group_1__0 )* ) ;
    public final void rule__Mult__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4027:1: ( ( ( rule__Mult__Group_1__0 )* ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4028:1: ( ( rule__Mult__Group_1__0 )* )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4028:1: ( ( rule__Mult__Group_1__0 )* )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4029:1: ( rule__Mult__Group_1__0 )*
            {
             before(grammarAccess.getMultAccess().getGroup_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4030:1: ( rule__Mult__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=24 && LA25_0<=25)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4030:2: rule__Mult__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Mult__Group_1__0_in_rule__Mult__Group__1__Impl8105);
            	    rule__Mult__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getMultAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Mult__Group__1__Impl"


    // $ANTLR start "rule__Mult__Group_1__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4044:1: rule__Mult__Group_1__0 : rule__Mult__Group_1__0__Impl rule__Mult__Group_1__1 ;
    public final void rule__Mult__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4048:1: ( rule__Mult__Group_1__0__Impl rule__Mult__Group_1__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4049:2: rule__Mult__Group_1__0__Impl rule__Mult__Group_1__1
            {
            pushFollow(FOLLOW_rule__Mult__Group_1__0__Impl_in_rule__Mult__Group_1__08140);
            rule__Mult__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mult__Group_1__1_in_rule__Mult__Group_1__08143);
            rule__Mult__Group_1__1();

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
    // $ANTLR end "rule__Mult__Group_1__0"


    // $ANTLR start "rule__Mult__Group_1__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4056:1: rule__Mult__Group_1__0__Impl : ( ( rule__Mult__Alternatives_1_0 ) ) ;
    public final void rule__Mult__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4060:1: ( ( ( rule__Mult__Alternatives_1_0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4061:1: ( ( rule__Mult__Alternatives_1_0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4061:1: ( ( rule__Mult__Alternatives_1_0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4062:1: ( rule__Mult__Alternatives_1_0 )
            {
             before(grammarAccess.getMultAccess().getAlternatives_1_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4063:1: ( rule__Mult__Alternatives_1_0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4063:2: rule__Mult__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Mult__Alternatives_1_0_in_rule__Mult__Group_1__0__Impl8170);
            rule__Mult__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultAccess().getAlternatives_1_0()); 

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
    // $ANTLR end "rule__Mult__Group_1__0__Impl"


    // $ANTLR start "rule__Mult__Group_1__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4073:1: rule__Mult__Group_1__1 : rule__Mult__Group_1__1__Impl ;
    public final void rule__Mult__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4077:1: ( rule__Mult__Group_1__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4078:2: rule__Mult__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Mult__Group_1__1__Impl_in_rule__Mult__Group_1__18200);
            rule__Mult__Group_1__1__Impl();

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
    // $ANTLR end "rule__Mult__Group_1__1"


    // $ANTLR start "rule__Mult__Group_1__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4084:1: rule__Mult__Group_1__1__Impl : ( ( rule__Mult__UnaryAssignment_1_1 ) ) ;
    public final void rule__Mult__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4088:1: ( ( ( rule__Mult__UnaryAssignment_1_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4089:1: ( ( rule__Mult__UnaryAssignment_1_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4089:1: ( ( rule__Mult__UnaryAssignment_1_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4090:1: ( rule__Mult__UnaryAssignment_1_1 )
            {
             before(grammarAccess.getMultAccess().getUnaryAssignment_1_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4091:1: ( rule__Mult__UnaryAssignment_1_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4091:2: rule__Mult__UnaryAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Mult__UnaryAssignment_1_1_in_rule__Mult__Group_1__1__Impl8227);
            rule__Mult__UnaryAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultAccess().getUnaryAssignment_1_1()); 

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
    // $ANTLR end "rule__Mult__Group_1__1__Impl"


    // $ANTLR start "rule__Unary__Group__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4105:1: rule__Unary__Group__0 : rule__Unary__Group__0__Impl rule__Unary__Group__1 ;
    public final void rule__Unary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4109:1: ( rule__Unary__Group__0__Impl rule__Unary__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4110:2: rule__Unary__Group__0__Impl rule__Unary__Group__1
            {
            pushFollow(FOLLOW_rule__Unary__Group__0__Impl_in_rule__Unary__Group__08261);
            rule__Unary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Unary__Group__1_in_rule__Unary__Group__08264);
            rule__Unary__Group__1();

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
    // $ANTLR end "rule__Unary__Group__0"


    // $ANTLR start "rule__Unary__Group__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4117:1: rule__Unary__Group__0__Impl : ( ( rule__Unary__Alternatives_0 )* ) ;
    public final void rule__Unary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4121:1: ( ( ( rule__Unary__Alternatives_0 )* ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4122:1: ( ( rule__Unary__Alternatives_0 )* )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4122:1: ( ( rule__Unary__Alternatives_0 )* )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4123:1: ( rule__Unary__Alternatives_0 )*
            {
             before(grammarAccess.getUnaryAccess().getAlternatives_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4124:1: ( rule__Unary__Alternatives_0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==23||LA26_0==26) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4124:2: rule__Unary__Alternatives_0
            	    {
            	    pushFollow(FOLLOW_rule__Unary__Alternatives_0_in_rule__Unary__Group__0__Impl8291);
            	    rule__Unary__Alternatives_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getUnaryAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Unary__Group__0__Impl"


    // $ANTLR start "rule__Unary__Group__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4134:1: rule__Unary__Group__1 : rule__Unary__Group__1__Impl ;
    public final void rule__Unary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4138:1: ( rule__Unary__Group__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4139:2: rule__Unary__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Unary__Group__1__Impl_in_rule__Unary__Group__18322);
            rule__Unary__Group__1__Impl();

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
    // $ANTLR end "rule__Unary__Group__1"


    // $ANTLR start "rule__Unary__Group__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4145:1: rule__Unary__Group__1__Impl : ( ( rule__Unary__AtomAssignment_1 ) ) ;
    public final void rule__Unary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4149:1: ( ( ( rule__Unary__AtomAssignment_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4150:1: ( ( rule__Unary__AtomAssignment_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4150:1: ( ( rule__Unary__AtomAssignment_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4151:1: ( rule__Unary__AtomAssignment_1 )
            {
             before(grammarAccess.getUnaryAccess().getAtomAssignment_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4152:1: ( rule__Unary__AtomAssignment_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4152:2: rule__Unary__AtomAssignment_1
            {
            pushFollow(FOLLOW_rule__Unary__AtomAssignment_1_in_rule__Unary__Group__1__Impl8349);
            rule__Unary__AtomAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnaryAccess().getAtomAssignment_1()); 

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
    // $ANTLR end "rule__Unary__Group__1__Impl"


    // $ANTLR start "rule__Atom__Group_1__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4166:1: rule__Atom__Group_1__0 : rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1 ;
    public final void rule__Atom__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4170:1: ( rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4171:2: rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1
            {
            pushFollow(FOLLOW_rule__Atom__Group_1__0__Impl_in_rule__Atom__Group_1__08383);
            rule__Atom__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atom__Group_1__1_in_rule__Atom__Group_1__08386);
            rule__Atom__Group_1__1();

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
    // $ANTLR end "rule__Atom__Group_1__0"


    // $ANTLR start "rule__Atom__Group_1__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4178:1: rule__Atom__Group_1__0__Impl : ( ( rule__Atom__Var1Assignment_1_0 ) ) ;
    public final void rule__Atom__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4182:1: ( ( ( rule__Atom__Var1Assignment_1_0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4183:1: ( ( rule__Atom__Var1Assignment_1_0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4183:1: ( ( rule__Atom__Var1Assignment_1_0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4184:1: ( rule__Atom__Var1Assignment_1_0 )
            {
             before(grammarAccess.getAtomAccess().getVar1Assignment_1_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4185:1: ( rule__Atom__Var1Assignment_1_0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4185:2: rule__Atom__Var1Assignment_1_0
            {
            pushFollow(FOLLOW_rule__Atom__Var1Assignment_1_0_in_rule__Atom__Group_1__0__Impl8413);
            rule__Atom__Var1Assignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getVar1Assignment_1_0()); 

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
    // $ANTLR end "rule__Atom__Group_1__0__Impl"


    // $ANTLR start "rule__Atom__Group_1__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4195:1: rule__Atom__Group_1__1 : rule__Atom__Group_1__1__Impl ;
    public final void rule__Atom__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4199:1: ( rule__Atom__Group_1__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4200:2: rule__Atom__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Atom__Group_1__1__Impl_in_rule__Atom__Group_1__18443);
            rule__Atom__Group_1__1__Impl();

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
    // $ANTLR end "rule__Atom__Group_1__1"


    // $ANTLR start "rule__Atom__Group_1__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4206:1: rule__Atom__Group_1__1__Impl : ( ( rule__Atom__Group_1_1__0 )? ) ;
    public final void rule__Atom__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4210:1: ( ( ( rule__Atom__Group_1_1__0 )? ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4211:1: ( ( rule__Atom__Group_1_1__0 )? )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4211:1: ( ( rule__Atom__Group_1_1__0 )? )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4212:1: ( rule__Atom__Group_1_1__0 )?
            {
             before(grammarAccess.getAtomAccess().getGroup_1_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4213:1: ( rule__Atom__Group_1_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==45) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4213:2: rule__Atom__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Atom__Group_1_1__0_in_rule__Atom__Group_1__1__Impl8470);
                    rule__Atom__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtomAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__Atom__Group_1__1__Impl"


    // $ANTLR start "rule__Atom__Group_1_1__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4227:1: rule__Atom__Group_1_1__0 : rule__Atom__Group_1_1__0__Impl rule__Atom__Group_1_1__1 ;
    public final void rule__Atom__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4231:1: ( rule__Atom__Group_1_1__0__Impl rule__Atom__Group_1_1__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4232:2: rule__Atom__Group_1_1__0__Impl rule__Atom__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Atom__Group_1_1__0__Impl_in_rule__Atom__Group_1_1__08505);
            rule__Atom__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atom__Group_1_1__1_in_rule__Atom__Group_1_1__08508);
            rule__Atom__Group_1_1__1();

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
    // $ANTLR end "rule__Atom__Group_1_1__0"


    // $ANTLR start "rule__Atom__Group_1_1__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4239:1: rule__Atom__Group_1_1__0__Impl : ( 'touches' ) ;
    public final void rule__Atom__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4243:1: ( ( 'touches' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4244:1: ( 'touches' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4244:1: ( 'touches' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4245:1: 'touches'
            {
             before(grammarAccess.getAtomAccess().getTouchesKeyword_1_1_0()); 
            match(input,45,FOLLOW_45_in_rule__Atom__Group_1_1__0__Impl8536); 
             after(grammarAccess.getAtomAccess().getTouchesKeyword_1_1_0()); 

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
    // $ANTLR end "rule__Atom__Group_1_1__0__Impl"


    // $ANTLR start "rule__Atom__Group_1_1__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4258:1: rule__Atom__Group_1_1__1 : rule__Atom__Group_1_1__1__Impl ;
    public final void rule__Atom__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4262:1: ( rule__Atom__Group_1_1__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4263:2: rule__Atom__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Atom__Group_1_1__1__Impl_in_rule__Atom__Group_1_1__18567);
            rule__Atom__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__Atom__Group_1_1__1"


    // $ANTLR start "rule__Atom__Group_1_1__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4269:1: rule__Atom__Group_1_1__1__Impl : ( ( rule__Atom__Var2Assignment_1_1_1 ) ) ;
    public final void rule__Atom__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4273:1: ( ( ( rule__Atom__Var2Assignment_1_1_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4274:1: ( ( rule__Atom__Var2Assignment_1_1_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4274:1: ( ( rule__Atom__Var2Assignment_1_1_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4275:1: ( rule__Atom__Var2Assignment_1_1_1 )
            {
             before(grammarAccess.getAtomAccess().getVar2Assignment_1_1_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4276:1: ( rule__Atom__Var2Assignment_1_1_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4276:2: rule__Atom__Var2Assignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Atom__Var2Assignment_1_1_1_in_rule__Atom__Group_1_1__1__Impl8594);
            rule__Atom__Var2Assignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getVar2Assignment_1_1_1()); 

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
    // $ANTLR end "rule__Atom__Group_1_1__1__Impl"


    // $ANTLR start "rule__Atom__Group_2__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4290:1: rule__Atom__Group_2__0 : rule__Atom__Group_2__0__Impl rule__Atom__Group_2__1 ;
    public final void rule__Atom__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4294:1: ( rule__Atom__Group_2__0__Impl rule__Atom__Group_2__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4295:2: rule__Atom__Group_2__0__Impl rule__Atom__Group_2__1
            {
            pushFollow(FOLLOW_rule__Atom__Group_2__0__Impl_in_rule__Atom__Group_2__08628);
            rule__Atom__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atom__Group_2__1_in_rule__Atom__Group_2__08631);
            rule__Atom__Group_2__1();

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
    // $ANTLR end "rule__Atom__Group_2__0"


    // $ANTLR start "rule__Atom__Group_2__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4302:1: rule__Atom__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Atom__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4306:1: ( ( '(' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4307:1: ( '(' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4307:1: ( '(' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4308:1: '('
            {
             before(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,28,FOLLOW_28_in_rule__Atom__Group_2__0__Impl8659); 
             after(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__Atom__Group_2__0__Impl"


    // $ANTLR start "rule__Atom__Group_2__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4321:1: rule__Atom__Group_2__1 : rule__Atom__Group_2__1__Impl rule__Atom__Group_2__2 ;
    public final void rule__Atom__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4325:1: ( rule__Atom__Group_2__1__Impl rule__Atom__Group_2__2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4326:2: rule__Atom__Group_2__1__Impl rule__Atom__Group_2__2
            {
            pushFollow(FOLLOW_rule__Atom__Group_2__1__Impl_in_rule__Atom__Group_2__18690);
            rule__Atom__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atom__Group_2__2_in_rule__Atom__Group_2__18693);
            rule__Atom__Group_2__2();

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
    // $ANTLR end "rule__Atom__Group_2__1"


    // $ANTLR start "rule__Atom__Group_2__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4333:1: rule__Atom__Group_2__1__Impl : ( ( rule__Atom__ExprAssignment_2_1 ) ) ;
    public final void rule__Atom__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4337:1: ( ( ( rule__Atom__ExprAssignment_2_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4338:1: ( ( rule__Atom__ExprAssignment_2_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4338:1: ( ( rule__Atom__ExprAssignment_2_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4339:1: ( rule__Atom__ExprAssignment_2_1 )
            {
             before(grammarAccess.getAtomAccess().getExprAssignment_2_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4340:1: ( rule__Atom__ExprAssignment_2_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4340:2: rule__Atom__ExprAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Atom__ExprAssignment_2_1_in_rule__Atom__Group_2__1__Impl8720);
            rule__Atom__ExprAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getExprAssignment_2_1()); 

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
    // $ANTLR end "rule__Atom__Group_2__1__Impl"


    // $ANTLR start "rule__Atom__Group_2__2"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4350:1: rule__Atom__Group_2__2 : rule__Atom__Group_2__2__Impl ;
    public final void rule__Atom__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4354:1: ( rule__Atom__Group_2__2__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4355:2: rule__Atom__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Atom__Group_2__2__Impl_in_rule__Atom__Group_2__28750);
            rule__Atom__Group_2__2__Impl();

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
    // $ANTLR end "rule__Atom__Group_2__2"


    // $ANTLR start "rule__Atom__Group_2__2__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4361:1: rule__Atom__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Atom__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4365:1: ( ( ')' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4366:1: ( ')' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4366:1: ( ')' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4367:1: ')'
            {
             before(grammarAccess.getAtomAccess().getRightParenthesisKeyword_2_2()); 
            match(input,29,FOLLOW_29_in_rule__Atom__Group_2__2__Impl8778); 
             after(grammarAccess.getAtomAccess().getRightParenthesisKeyword_2_2()); 

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
    // $ANTLR end "rule__Atom__Group_2__2__Impl"


    // $ANTLR start "rule__Var__Group__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4386:1: rule__Var__Group__0 : rule__Var__Group__0__Impl rule__Var__Group__1 ;
    public final void rule__Var__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4390:1: ( rule__Var__Group__0__Impl rule__Var__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4391:2: rule__Var__Group__0__Impl rule__Var__Group__1
            {
            pushFollow(FOLLOW_rule__Var__Group__0__Impl_in_rule__Var__Group__08815);
            rule__Var__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Var__Group__1_in_rule__Var__Group__08818);
            rule__Var__Group__1();

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
    // $ANTLR end "rule__Var__Group__0"


    // $ANTLR start "rule__Var__Group__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4398:1: rule__Var__Group__0__Impl : ( ( rule__Var__NameAssignment_0 ) ) ;
    public final void rule__Var__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4402:1: ( ( ( rule__Var__NameAssignment_0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4403:1: ( ( rule__Var__NameAssignment_0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4403:1: ( ( rule__Var__NameAssignment_0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4404:1: ( rule__Var__NameAssignment_0 )
            {
             before(grammarAccess.getVarAccess().getNameAssignment_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4405:1: ( rule__Var__NameAssignment_0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4405:2: rule__Var__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Var__NameAssignment_0_in_rule__Var__Group__0__Impl8845);
            rule__Var__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVarAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Var__Group__0__Impl"


    // $ANTLR start "rule__Var__Group__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4415:1: rule__Var__Group__1 : rule__Var__Group__1__Impl ;
    public final void rule__Var__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4419:1: ( rule__Var__Group__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4420:2: rule__Var__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Var__Group__1__Impl_in_rule__Var__Group__18875);
            rule__Var__Group__1__Impl();

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
    // $ANTLR end "rule__Var__Group__1"


    // $ANTLR start "rule__Var__Group__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4426:1: rule__Var__Group__1__Impl : ( ( rule__Var__Alternatives_1 )? ) ;
    public final void rule__Var__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4430:1: ( ( ( rule__Var__Alternatives_1 )? ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4431:1: ( ( rule__Var__Alternatives_1 )? )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4431:1: ( ( rule__Var__Alternatives_1 )? )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4432:1: ( rule__Var__Alternatives_1 )?
            {
             before(grammarAccess.getVarAccess().getAlternatives_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4433:1: ( rule__Var__Alternatives_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==33||LA28_0==46) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4433:2: rule__Var__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__Var__Alternatives_1_in_rule__Var__Group__1__Impl8902);
                    rule__Var__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVarAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Var__Group__1__Impl"


    // $ANTLR start "rule__Var__Group_1_0__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4447:1: rule__Var__Group_1_0__0 : rule__Var__Group_1_0__0__Impl rule__Var__Group_1_0__1 ;
    public final void rule__Var__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4451:1: ( rule__Var__Group_1_0__0__Impl rule__Var__Group_1_0__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4452:2: rule__Var__Group_1_0__0__Impl rule__Var__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Var__Group_1_0__0__Impl_in_rule__Var__Group_1_0__08937);
            rule__Var__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Var__Group_1_0__1_in_rule__Var__Group_1_0__08940);
            rule__Var__Group_1_0__1();

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
    // $ANTLR end "rule__Var__Group_1_0__0"


    // $ANTLR start "rule__Var__Group_1_0__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4459:1: rule__Var__Group_1_0__0__Impl : ( '[' ) ;
    public final void rule__Var__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4463:1: ( ( '[' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4464:1: ( '[' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4464:1: ( '[' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4465:1: '['
            {
             before(grammarAccess.getVarAccess().getLeftSquareBracketKeyword_1_0_0()); 
            match(input,33,FOLLOW_33_in_rule__Var__Group_1_0__0__Impl8968); 
             after(grammarAccess.getVarAccess().getLeftSquareBracketKeyword_1_0_0()); 

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
    // $ANTLR end "rule__Var__Group_1_0__0__Impl"


    // $ANTLR start "rule__Var__Group_1_0__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4478:1: rule__Var__Group_1_0__1 : rule__Var__Group_1_0__1__Impl rule__Var__Group_1_0__2 ;
    public final void rule__Var__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4482:1: ( rule__Var__Group_1_0__1__Impl rule__Var__Group_1_0__2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4483:2: rule__Var__Group_1_0__1__Impl rule__Var__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__Var__Group_1_0__1__Impl_in_rule__Var__Group_1_0__18999);
            rule__Var__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Var__Group_1_0__2_in_rule__Var__Group_1_0__19002);
            rule__Var__Group_1_0__2();

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
    // $ANTLR end "rule__Var__Group_1_0__1"


    // $ANTLR start "rule__Var__Group_1_0__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4490:1: rule__Var__Group_1_0__1__Impl : ( ( rule__Var__ExprAssignment_1_0_1 ) ) ;
    public final void rule__Var__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4494:1: ( ( ( rule__Var__ExprAssignment_1_0_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4495:1: ( ( rule__Var__ExprAssignment_1_0_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4495:1: ( ( rule__Var__ExprAssignment_1_0_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4496:1: ( rule__Var__ExprAssignment_1_0_1 )
            {
             before(grammarAccess.getVarAccess().getExprAssignment_1_0_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4497:1: ( rule__Var__ExprAssignment_1_0_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4497:2: rule__Var__ExprAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Var__ExprAssignment_1_0_1_in_rule__Var__Group_1_0__1__Impl9029);
            rule__Var__ExprAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getVarAccess().getExprAssignment_1_0_1()); 

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
    // $ANTLR end "rule__Var__Group_1_0__1__Impl"


    // $ANTLR start "rule__Var__Group_1_0__2"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4507:1: rule__Var__Group_1_0__2 : rule__Var__Group_1_0__2__Impl rule__Var__Group_1_0__3 ;
    public final void rule__Var__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4511:1: ( rule__Var__Group_1_0__2__Impl rule__Var__Group_1_0__3 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4512:2: rule__Var__Group_1_0__2__Impl rule__Var__Group_1_0__3
            {
            pushFollow(FOLLOW_rule__Var__Group_1_0__2__Impl_in_rule__Var__Group_1_0__29059);
            rule__Var__Group_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Var__Group_1_0__3_in_rule__Var__Group_1_0__29062);
            rule__Var__Group_1_0__3();

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
    // $ANTLR end "rule__Var__Group_1_0__2"


    // $ANTLR start "rule__Var__Group_1_0__2__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4519:1: rule__Var__Group_1_0__2__Impl : ( ']' ) ;
    public final void rule__Var__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4523:1: ( ( ']' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4524:1: ( ']' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4524:1: ( ']' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4525:1: ']'
            {
             before(grammarAccess.getVarAccess().getRightSquareBracketKeyword_1_0_2()); 
            match(input,34,FOLLOW_34_in_rule__Var__Group_1_0__2__Impl9090); 
             after(grammarAccess.getVarAccess().getRightSquareBracketKeyword_1_0_2()); 

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
    // $ANTLR end "rule__Var__Group_1_0__2__Impl"


    // $ANTLR start "rule__Var__Group_1_0__3"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4538:1: rule__Var__Group_1_0__3 : rule__Var__Group_1_0__3__Impl ;
    public final void rule__Var__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4542:1: ( rule__Var__Group_1_0__3__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4543:2: rule__Var__Group_1_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Var__Group_1_0__3__Impl_in_rule__Var__Group_1_0__39121);
            rule__Var__Group_1_0__3__Impl();

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
    // $ANTLR end "rule__Var__Group_1_0__3"


    // $ANTLR start "rule__Var__Group_1_0__3__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4549:1: rule__Var__Group_1_0__3__Impl : ( ( rule__Var__Group_1_0_3__0 )? ) ;
    public final void rule__Var__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4553:1: ( ( ( rule__Var__Group_1_0_3__0 )? ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4554:1: ( ( rule__Var__Group_1_0_3__0 )? )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4554:1: ( ( rule__Var__Group_1_0_3__0 )? )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4555:1: ( rule__Var__Group_1_0_3__0 )?
            {
             before(grammarAccess.getVarAccess().getGroup_1_0_3()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4556:1: ( rule__Var__Group_1_0_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==46) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4556:2: rule__Var__Group_1_0_3__0
                    {
                    pushFollow(FOLLOW_rule__Var__Group_1_0_3__0_in_rule__Var__Group_1_0__3__Impl9148);
                    rule__Var__Group_1_0_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVarAccess().getGroup_1_0_3()); 

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
    // $ANTLR end "rule__Var__Group_1_0__3__Impl"


    // $ANTLR start "rule__Var__Group_1_0_3__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4574:1: rule__Var__Group_1_0_3__0 : rule__Var__Group_1_0_3__0__Impl rule__Var__Group_1_0_3__1 ;
    public final void rule__Var__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4578:1: ( rule__Var__Group_1_0_3__0__Impl rule__Var__Group_1_0_3__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4579:2: rule__Var__Group_1_0_3__0__Impl rule__Var__Group_1_0_3__1
            {
            pushFollow(FOLLOW_rule__Var__Group_1_0_3__0__Impl_in_rule__Var__Group_1_0_3__09187);
            rule__Var__Group_1_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Var__Group_1_0_3__1_in_rule__Var__Group_1_0_3__09190);
            rule__Var__Group_1_0_3__1();

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
    // $ANTLR end "rule__Var__Group_1_0_3__0"


    // $ANTLR start "rule__Var__Group_1_0_3__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4586:1: rule__Var__Group_1_0_3__0__Impl : ( '.' ) ;
    public final void rule__Var__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4590:1: ( ( '.' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4591:1: ( '.' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4591:1: ( '.' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4592:1: '.'
            {
             before(grammarAccess.getVarAccess().getFullStopKeyword_1_0_3_0()); 
            match(input,46,FOLLOW_46_in_rule__Var__Group_1_0_3__0__Impl9218); 
             after(grammarAccess.getVarAccess().getFullStopKeyword_1_0_3_0()); 

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
    // $ANTLR end "rule__Var__Group_1_0_3__0__Impl"


    // $ANTLR start "rule__Var__Group_1_0_3__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4605:1: rule__Var__Group_1_0_3__1 : rule__Var__Group_1_0_3__1__Impl ;
    public final void rule__Var__Group_1_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4609:1: ( rule__Var__Group_1_0_3__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4610:2: rule__Var__Group_1_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Var__Group_1_0_3__1__Impl_in_rule__Var__Group_1_0_3__19249);
            rule__Var__Group_1_0_3__1__Impl();

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
    // $ANTLR end "rule__Var__Group_1_0_3__1"


    // $ANTLR start "rule__Var__Group_1_0_3__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4616:1: rule__Var__Group_1_0_3__1__Impl : ( ( rule__Var__SubnameAssignment_1_0_3_1 ) ) ;
    public final void rule__Var__Group_1_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4620:1: ( ( ( rule__Var__SubnameAssignment_1_0_3_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4621:1: ( ( rule__Var__SubnameAssignment_1_0_3_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4621:1: ( ( rule__Var__SubnameAssignment_1_0_3_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4622:1: ( rule__Var__SubnameAssignment_1_0_3_1 )
            {
             before(grammarAccess.getVarAccess().getSubnameAssignment_1_0_3_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4623:1: ( rule__Var__SubnameAssignment_1_0_3_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4623:2: rule__Var__SubnameAssignment_1_0_3_1
            {
            pushFollow(FOLLOW_rule__Var__SubnameAssignment_1_0_3_1_in_rule__Var__Group_1_0_3__1__Impl9276);
            rule__Var__SubnameAssignment_1_0_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVarAccess().getSubnameAssignment_1_0_3_1()); 

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
    // $ANTLR end "rule__Var__Group_1_0_3__1__Impl"


    // $ANTLR start "rule__Var__Group_1_1__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4637:1: rule__Var__Group_1_1__0 : rule__Var__Group_1_1__0__Impl rule__Var__Group_1_1__1 ;
    public final void rule__Var__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4641:1: ( rule__Var__Group_1_1__0__Impl rule__Var__Group_1_1__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4642:2: rule__Var__Group_1_1__0__Impl rule__Var__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Var__Group_1_1__0__Impl_in_rule__Var__Group_1_1__09310);
            rule__Var__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Var__Group_1_1__1_in_rule__Var__Group_1_1__09313);
            rule__Var__Group_1_1__1();

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
    // $ANTLR end "rule__Var__Group_1_1__0"


    // $ANTLR start "rule__Var__Group_1_1__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4649:1: rule__Var__Group_1_1__0__Impl : ( '.' ) ;
    public final void rule__Var__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4653:1: ( ( '.' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4654:1: ( '.' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4654:1: ( '.' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4655:1: '.'
            {
             before(grammarAccess.getVarAccess().getFullStopKeyword_1_1_0()); 
            match(input,46,FOLLOW_46_in_rule__Var__Group_1_1__0__Impl9341); 
             after(grammarAccess.getVarAccess().getFullStopKeyword_1_1_0()); 

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
    // $ANTLR end "rule__Var__Group_1_1__0__Impl"


    // $ANTLR start "rule__Var__Group_1_1__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4668:1: rule__Var__Group_1_1__1 : rule__Var__Group_1_1__1__Impl ;
    public final void rule__Var__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4672:1: ( rule__Var__Group_1_1__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4673:2: rule__Var__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Var__Group_1_1__1__Impl_in_rule__Var__Group_1_1__19372);
            rule__Var__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__Var__Group_1_1__1"


    // $ANTLR start "rule__Var__Group_1_1__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4679:1: rule__Var__Group_1_1__1__Impl : ( ( rule__Var__SubnameAssignment_1_1_1 ) ) ;
    public final void rule__Var__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4683:1: ( ( ( rule__Var__SubnameAssignment_1_1_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4684:1: ( ( rule__Var__SubnameAssignment_1_1_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4684:1: ( ( rule__Var__SubnameAssignment_1_1_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4685:1: ( rule__Var__SubnameAssignment_1_1_1 )
            {
             before(grammarAccess.getVarAccess().getSubnameAssignment_1_1_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4686:1: ( rule__Var__SubnameAssignment_1_1_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4686:2: rule__Var__SubnameAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Var__SubnameAssignment_1_1_1_in_rule__Var__Group_1_1__1__Impl9399);
            rule__Var__SubnameAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVarAccess().getSubnameAssignment_1_1_1()); 

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
    // $ANTLR end "rule__Var__Group_1_1__1__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4701:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4705:1: ( ( RULE_ID ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4706:1: ( RULE_ID )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4706:1: ( RULE_ID )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4707:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__NameAssignment_19438); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__AttrAssignment_3"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4716:1: rule__Model__AttrAssignment_3 : ( ruleAttrList ) ;
    public final void rule__Model__AttrAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4720:1: ( ( ruleAttrList ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4721:1: ( ruleAttrList )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4721:1: ( ruleAttrList )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4722:1: ruleAttrList
            {
             before(grammarAccess.getModelAccess().getAttrAttrListParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAttrList_in_rule__Model__AttrAssignment_39469);
            ruleAttrList();

            state._fsp--;

             after(grammarAccess.getModelAccess().getAttrAttrListParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Model__AttrAssignment_3"


    // $ANTLR start "rule__Model__DeclAssignment_5"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4731:1: rule__Model__DeclAssignment_5 : ( ruleDeclaration ) ;
    public final void rule__Model__DeclAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4735:1: ( ( ruleDeclaration ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4736:1: ( ruleDeclaration )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4736:1: ( ruleDeclaration )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4737:1: ruleDeclaration
            {
             before(grammarAccess.getModelAccess().getDeclDeclarationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleDeclaration_in_rule__Model__DeclAssignment_59500);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDeclDeclarationParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Model__DeclAssignment_5"


    // $ANTLR start "rule__Model__StmtAssignment_6"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4746:1: rule__Model__StmtAssignment_6 : ( ruleStatementBlock ) ;
    public final void rule__Model__StmtAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4750:1: ( ( ruleStatementBlock ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4751:1: ( ruleStatementBlock )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4751:1: ( ruleStatementBlock )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4752:1: ruleStatementBlock
            {
             before(grammarAccess.getModelAccess().getStmtStatementBlockParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleStatementBlock_in_rule__Model__StmtAssignment_69531);
            ruleStatementBlock();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStmtStatementBlockParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Model__StmtAssignment_6"


    // $ANTLR start "rule__Model__BlocksAssignment_7"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4761:1: rule__Model__BlocksAssignment_7 : ( ruleBlock ) ;
    public final void rule__Model__BlocksAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4765:1: ( ( ruleBlock ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4766:1: ( ruleBlock )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4766:1: ( ruleBlock )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4767:1: ruleBlock
            {
             before(grammarAccess.getModelAccess().getBlocksBlockParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleBlock_in_rule__Model__BlocksAssignment_79562);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getModelAccess().getBlocksBlockParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Model__BlocksAssignment_7"


    // $ANTLR start "rule__Declaration__VariAssignment_0_0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4776:1: rule__Declaration__VariAssignment_0_0 : ( ruleVarDecl ) ;
    public final void rule__Declaration__VariAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4780:1: ( ( ruleVarDecl ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4781:1: ( ruleVarDecl )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4781:1: ( ruleVarDecl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4782:1: ruleVarDecl
            {
             before(grammarAccess.getDeclarationAccess().getVariVarDeclParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleVarDecl_in_rule__Declaration__VariAssignment_0_09593);
            ruleVarDecl();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getVariVarDeclParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Declaration__VariAssignment_0_0"


    // $ANTLR start "rule__Declaration__ObjAssignment_0_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4791:1: rule__Declaration__ObjAssignment_0_1 : ( ruleObjDecl ) ;
    public final void rule__Declaration__ObjAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4795:1: ( ( ruleObjDecl ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4796:1: ( ruleObjDecl )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4796:1: ( ruleObjDecl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4797:1: ruleObjDecl
            {
             before(grammarAccess.getDeclarationAccess().getObjObjDeclParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleObjDecl_in_rule__Declaration__ObjAssignment_0_19624);
            ruleObjDecl();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getObjObjDeclParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Declaration__ObjAssignment_0_1"


    // $ANTLR start "rule__VarDecl__NameAssignment_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4806:1: rule__VarDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VarDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4810:1: ( ( RULE_ID ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4811:1: ( RULE_ID )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4811:1: ( RULE_ID )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4812:1: RULE_ID
            {
             before(grammarAccess.getVarDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarDecl__NameAssignment_19655); 
             after(grammarAccess.getVarDeclAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__VarDecl__NameAssignment_1"


    // $ANTLR start "rule__VarDecl__ExprAssignment_2_0_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4821:1: rule__VarDecl__ExprAssignment_2_0_1 : ( ruleExpr ) ;
    public final void rule__VarDecl__ExprAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4825:1: ( ( ruleExpr ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4826:1: ( ruleExpr )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4826:1: ( ruleExpr )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4827:1: ruleExpr
            {
             before(grammarAccess.getVarDeclAccess().getExprExprParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__VarDecl__ExprAssignment_2_0_19686);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getVarDeclAccess().getExprExprParserRuleCall_2_0_1_0()); 

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
    // $ANTLR end "rule__VarDecl__ExprAssignment_2_0_1"


    // $ANTLR start "rule__VarDecl__ValueAssignment_2_1_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4836:1: rule__VarDecl__ValueAssignment_2_1_1 : ( RULE_INT ) ;
    public final void rule__VarDecl__ValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4840:1: ( ( RULE_INT ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4841:1: ( RULE_INT )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4841:1: ( RULE_INT )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4842:1: RULE_INT
            {
             before(grammarAccess.getVarDeclAccess().getValueINTTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__VarDecl__ValueAssignment_2_1_19717); 
             after(grammarAccess.getVarDeclAccess().getValueINTTerminalRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__VarDecl__ValueAssignment_2_1_1"


    // $ANTLR start "rule__ObjDecl__TypeAssignment_0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4851:1: rule__ObjDecl__TypeAssignment_0 : ( ruleObjType ) ;
    public final void rule__ObjDecl__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4855:1: ( ( ruleObjType ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4856:1: ( ruleObjType )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4856:1: ( ruleObjType )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4857:1: ruleObjType
            {
             before(grammarAccess.getObjDeclAccess().getTypeObjTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleObjType_in_rule__ObjDecl__TypeAssignment_09748);
            ruleObjType();

            state._fsp--;

             after(grammarAccess.getObjDeclAccess().getTypeObjTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ObjDecl__TypeAssignment_0"


    // $ANTLR start "rule__ObjDecl__NameAssignment_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4866:1: rule__ObjDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ObjDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4870:1: ( ( RULE_ID ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4871:1: ( RULE_ID )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4871:1: ( RULE_ID )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4872:1: RULE_ID
            {
             before(grammarAccess.getObjDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjDecl__NameAssignment_19779); 
             after(grammarAccess.getObjDeclAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ObjDecl__NameAssignment_1"


    // $ANTLR start "rule__ObjDecl__AttrAssignment_2_0_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4881:1: rule__ObjDecl__AttrAssignment_2_0_1 : ( ruleAttrList ) ;
    public final void rule__ObjDecl__AttrAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4885:1: ( ( ruleAttrList ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4886:1: ( ruleAttrList )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4886:1: ( ruleAttrList )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4887:1: ruleAttrList
            {
             before(grammarAccess.getObjDeclAccess().getAttrAttrListParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_ruleAttrList_in_rule__ObjDecl__AttrAssignment_2_0_19810);
            ruleAttrList();

            state._fsp--;

             after(grammarAccess.getObjDeclAccess().getAttrAttrListParserRuleCall_2_0_1_0()); 

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
    // $ANTLR end "rule__ObjDecl__AttrAssignment_2_0_1"


    // $ANTLR start "rule__ObjDecl__ValueAssignment_2_1_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4896:1: rule__ObjDecl__ValueAssignment_2_1_1 : ( RULE_INT ) ;
    public final void rule__ObjDecl__ValueAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4900:1: ( ( RULE_INT ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4901:1: ( RULE_INT )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4901:1: ( RULE_INT )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4902:1: RULE_INT
            {
             before(grammarAccess.getObjDeclAccess().getValueINTTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ObjDecl__ValueAssignment_2_1_19841); 
             after(grammarAccess.getObjDeclAccess().getValueINTTerminalRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__ObjDecl__ValueAssignment_2_1_1"


    // $ANTLR start "rule__AnimBlock__NameAssignment_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4911:1: rule__AnimBlock__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AnimBlock__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4915:1: ( ( RULE_ID ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4916:1: ( RULE_ID )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4916:1: ( RULE_ID )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4917:1: RULE_ID
            {
             before(grammarAccess.getAnimBlockAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AnimBlock__NameAssignment_19872); 
             after(grammarAccess.getAnimBlockAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__AnimBlock__NameAssignment_1"


    // $ANTLR start "rule__AnimBlock__TypeAssignment_3"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4926:1: rule__AnimBlock__TypeAssignment_3 : ( ruleObjType ) ;
    public final void rule__AnimBlock__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4930:1: ( ( ruleObjType ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4931:1: ( ruleObjType )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4931:1: ( ruleObjType )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4932:1: ruleObjType
            {
             before(grammarAccess.getAnimBlockAccess().getTypeObjTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleObjType_in_rule__AnimBlock__TypeAssignment_39903);
            ruleObjType();

            state._fsp--;

             after(grammarAccess.getAnimBlockAccess().getTypeObjTypeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__AnimBlock__TypeAssignment_3"


    // $ANTLR start "rule__AnimBlock__ObjNameAssignment_4"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4941:1: rule__AnimBlock__ObjNameAssignment_4 : ( RULE_ID ) ;
    public final void rule__AnimBlock__ObjNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4945:1: ( ( RULE_ID ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4946:1: ( RULE_ID )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4946:1: ( RULE_ID )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4947:1: RULE_ID
            {
             before(grammarAccess.getAnimBlockAccess().getObjNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AnimBlock__ObjNameAssignment_49934); 
             after(grammarAccess.getAnimBlockAccess().getObjNameIDTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__AnimBlock__ObjNameAssignment_4"


    // $ANTLR start "rule__AnimBlock__StmtAssignment_6"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4956:1: rule__AnimBlock__StmtAssignment_6 : ( ruleStatementBlock ) ;
    public final void rule__AnimBlock__StmtAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4960:1: ( ( ruleStatementBlock ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4961:1: ( ruleStatementBlock )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4961:1: ( ruleStatementBlock )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4962:1: ruleStatementBlock
            {
             before(grammarAccess.getAnimBlockAccess().getStmtStatementBlockParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleStatementBlock_in_rule__AnimBlock__StmtAssignment_69965);
            ruleStatementBlock();

            state._fsp--;

             after(grammarAccess.getAnimBlockAccess().getStmtStatementBlockParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__AnimBlock__StmtAssignment_6"


    // $ANTLR start "rule__EventBlock__KeyAssignment_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4971:1: rule__EventBlock__KeyAssignment_1 : ( ruleKeystroke ) ;
    public final void rule__EventBlock__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4975:1: ( ( ruleKeystroke ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4976:1: ( ruleKeystroke )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4976:1: ( ruleKeystroke )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4977:1: ruleKeystroke
            {
             before(grammarAccess.getEventBlockAccess().getKeyKeystrokeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleKeystroke_in_rule__EventBlock__KeyAssignment_19996);
            ruleKeystroke();

            state._fsp--;

             after(grammarAccess.getEventBlockAccess().getKeyKeystrokeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__EventBlock__KeyAssignment_1"


    // $ANTLR start "rule__EventBlock__StmtAssignment_2"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4986:1: rule__EventBlock__StmtAssignment_2 : ( ruleStatementBlock ) ;
    public final void rule__EventBlock__StmtAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4990:1: ( ( ruleStatementBlock ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4991:1: ( ruleStatementBlock )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4991:1: ( ruleStatementBlock )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4992:1: ruleStatementBlock
            {
             before(grammarAccess.getEventBlockAccess().getStmtStatementBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStatementBlock_in_rule__EventBlock__StmtAssignment_210027);
            ruleStatementBlock();

            state._fsp--;

             after(grammarAccess.getEventBlockAccess().getStmtStatementBlockParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__EventBlock__StmtAssignment_2"


    // $ANTLR start "rule__StatementBlock__StmtAssignment_1_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5001:1: rule__StatementBlock__StmtAssignment_1_1 : ( ruleStmt ) ;
    public final void rule__StatementBlock__StmtAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5005:1: ( ( ruleStmt ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5006:1: ( ruleStmt )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5006:1: ( ruleStmt )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5007:1: ruleStmt
            {
             before(grammarAccess.getStatementBlockAccess().getStmtStmtParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleStmt_in_rule__StatementBlock__StmtAssignment_1_110058);
            ruleStmt();

            state._fsp--;

             after(grammarAccess.getStatementBlockAccess().getStmtStmtParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__StatementBlock__StmtAssignment_1_1"


    // $ANTLR start "rule__ForStmt__Ass1Assignment_2"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5016:1: rule__ForStmt__Ass1Assignment_2 : ( ruleAssStmt ) ;
    public final void rule__ForStmt__Ass1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5020:1: ( ( ruleAssStmt ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5021:1: ( ruleAssStmt )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5021:1: ( ruleAssStmt )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5022:1: ruleAssStmt
            {
             before(grammarAccess.getForStmtAccess().getAss1AssStmtParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAssStmt_in_rule__ForStmt__Ass1Assignment_210089);
            ruleAssStmt();

            state._fsp--;

             after(grammarAccess.getForStmtAccess().getAss1AssStmtParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ForStmt__Ass1Assignment_2"


    // $ANTLR start "rule__ForStmt__ExprAssignment_3"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5031:1: rule__ForStmt__ExprAssignment_3 : ( ruleExpr ) ;
    public final void rule__ForStmt__ExprAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5035:1: ( ( ruleExpr ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5036:1: ( ruleExpr )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5036:1: ( ruleExpr )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5037:1: ruleExpr
            {
             before(grammarAccess.getForStmtAccess().getExprExprParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__ForStmt__ExprAssignment_310120);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getForStmtAccess().getExprExprParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__ForStmt__ExprAssignment_3"


    // $ANTLR start "rule__ForStmt__Ass2Assignment_5"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5046:1: rule__ForStmt__Ass2Assignment_5 : ( ruleAssStmt2 ) ;
    public final void rule__ForStmt__Ass2Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5050:1: ( ( ruleAssStmt2 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5051:1: ( ruleAssStmt2 )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5051:1: ( ruleAssStmt2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5052:1: ruleAssStmt2
            {
             before(grammarAccess.getForStmtAccess().getAss2AssStmt2ParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAssStmt2_in_rule__ForStmt__Ass2Assignment_510151);
            ruleAssStmt2();

            state._fsp--;

             after(grammarAccess.getForStmtAccess().getAss2AssStmt2ParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ForStmt__Ass2Assignment_5"


    // $ANTLR start "rule__ForStmt__StmtAssignment_7"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5061:1: rule__ForStmt__StmtAssignment_7 : ( ruleStatementBlock ) ;
    public final void rule__ForStmt__StmtAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5065:1: ( ( ruleStatementBlock ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5066:1: ( ruleStatementBlock )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5066:1: ( ruleStatementBlock )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5067:1: ruleStatementBlock
            {
             before(grammarAccess.getForStmtAccess().getStmtStatementBlockParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleStatementBlock_in_rule__ForStmt__StmtAssignment_710182);
            ruleStatementBlock();

            state._fsp--;

             after(grammarAccess.getForStmtAccess().getStmtStatementBlockParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__ForStmt__StmtAssignment_7"


    // $ANTLR start "rule__IfStmt__ExprAssignment_2"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5076:1: rule__IfStmt__ExprAssignment_2 : ( ruleExpr ) ;
    public final void rule__IfStmt__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5080:1: ( ( ruleExpr ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5081:1: ( ruleExpr )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5081:1: ( ruleExpr )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5082:1: ruleExpr
            {
             before(grammarAccess.getIfStmtAccess().getExprExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__IfStmt__ExprAssignment_210213);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getIfStmtAccess().getExprExprParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__IfStmt__ExprAssignment_2"


    // $ANTLR start "rule__IfStmt__StmtAssignment_4"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5091:1: rule__IfStmt__StmtAssignment_4 : ( ruleStatementBlock ) ;
    public final void rule__IfStmt__StmtAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5095:1: ( ( ruleStatementBlock ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5096:1: ( ruleStatementBlock )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5096:1: ( ruleStatementBlock )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5097:1: ruleStatementBlock
            {
             before(grammarAccess.getIfStmtAccess().getStmtStatementBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleStatementBlock_in_rule__IfStmt__StmtAssignment_410244);
            ruleStatementBlock();

            state._fsp--;

             after(grammarAccess.getIfStmtAccess().getStmtStatementBlockParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__IfStmt__StmtAssignment_4"


    // $ANTLR start "rule__IfStmt__ElseAssignment_5"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5106:1: rule__IfStmt__ElseAssignment_5 : ( ruleElseStmt ) ;
    public final void rule__IfStmt__ElseAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5110:1: ( ( ruleElseStmt ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5111:1: ( ruleElseStmt )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5111:1: ( ruleElseStmt )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5112:1: ruleElseStmt
            {
             before(grammarAccess.getIfStmtAccess().getElseElseStmtParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleElseStmt_in_rule__IfStmt__ElseAssignment_510275);
            ruleElseStmt();

            state._fsp--;

             after(grammarAccess.getIfStmtAccess().getElseElseStmtParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__IfStmt__ElseAssignment_5"


    // $ANTLR start "rule__ElseStmt__StmtAssignment_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5121:1: rule__ElseStmt__StmtAssignment_1 : ( ruleStatementBlock ) ;
    public final void rule__ElseStmt__StmtAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5125:1: ( ( ruleStatementBlock ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5126:1: ( ruleStatementBlock )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5126:1: ( ruleStatementBlock )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5127:1: ruleStatementBlock
            {
             before(grammarAccess.getElseStmtAccess().getStmtStatementBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleStatementBlock_in_rule__ElseStmt__StmtAssignment_110306);
            ruleStatementBlock();

            state._fsp--;

             after(grammarAccess.getElseStmtAccess().getStmtStatementBlockParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ElseStmt__StmtAssignment_1"


    // $ANTLR start "rule__AssStmt__VarAssignment_0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5136:1: rule__AssStmt__VarAssignment_0 : ( ruleVar ) ;
    public final void rule__AssStmt__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5140:1: ( ( ruleVar ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5141:1: ( ruleVar )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5141:1: ( ruleVar )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5142:1: ruleVar
            {
             before(grammarAccess.getAssStmtAccess().getVarVarParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVar_in_rule__AssStmt__VarAssignment_010337);
            ruleVar();

            state._fsp--;

             after(grammarAccess.getAssStmtAccess().getVarVarParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__AssStmt__VarAssignment_0"


    // $ANTLR start "rule__AssStmt__ExprAssignment_2"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5151:1: rule__AssStmt__ExprAssignment_2 : ( ruleExpr ) ;
    public final void rule__AssStmt__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5155:1: ( ( ruleExpr ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5156:1: ( ruleExpr )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5156:1: ( ruleExpr )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5157:1: ruleExpr
            {
             before(grammarAccess.getAssStmtAccess().getExprExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__AssStmt__ExprAssignment_210368);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getAssStmtAccess().getExprExprParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AssStmt__ExprAssignment_2"


    // $ANTLR start "rule__AssStmt2__VarAssignment_0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5166:1: rule__AssStmt2__VarAssignment_0 : ( ruleVar ) ;
    public final void rule__AssStmt2__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5170:1: ( ( ruleVar ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5171:1: ( ruleVar )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5171:1: ( ruleVar )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5172:1: ruleVar
            {
             before(grammarAccess.getAssStmt2Access().getVarVarParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVar_in_rule__AssStmt2__VarAssignment_010399);
            ruleVar();

            state._fsp--;

             after(grammarAccess.getAssStmt2Access().getVarVarParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__AssStmt2__VarAssignment_0"


    // $ANTLR start "rule__AssStmt2__ExprAssignment_2"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5181:1: rule__AssStmt2__ExprAssignment_2 : ( ruleExpr ) ;
    public final void rule__AssStmt2__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5185:1: ( ( ruleExpr ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5186:1: ( ruleExpr )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5186:1: ( ruleExpr )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5187:1: ruleExpr
            {
             before(grammarAccess.getAssStmt2Access().getExprExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__AssStmt2__ExprAssignment_210430);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getAssStmt2Access().getExprExprParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AssStmt2__ExprAssignment_2"


    // $ANTLR start "rule__AttrList__AttrAssignment_1_0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5196:1: rule__AttrList__AttrAssignment_1_0 : ( ruleAttrAss ) ;
    public final void rule__AttrList__AttrAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5200:1: ( ( ruleAttrAss ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5201:1: ( ruleAttrAss )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5201:1: ( ruleAttrAss )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5202:1: ruleAttrAss
            {
             before(grammarAccess.getAttrListAccess().getAttrAttrAssParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleAttrAss_in_rule__AttrList__AttrAssignment_1_010461);
            ruleAttrAss();

            state._fsp--;

             after(grammarAccess.getAttrListAccess().getAttrAttrAssParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__AttrList__AttrAssignment_1_0"


    // $ANTLR start "rule__AttrList__AttrAssignment_1_1_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5211:1: rule__AttrList__AttrAssignment_1_1_1 : ( ruleAttrAss ) ;
    public final void rule__AttrList__AttrAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5215:1: ( ( ruleAttrAss ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5216:1: ( ruleAttrAss )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5216:1: ( ruleAttrAss )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5217:1: ruleAttrAss
            {
             before(grammarAccess.getAttrListAccess().getAttrAttrAssParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleAttrAss_in_rule__AttrList__AttrAssignment_1_1_110492);
            ruleAttrAss();

            state._fsp--;

             after(grammarAccess.getAttrListAccess().getAttrAttrAssParserRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__AttrList__AttrAssignment_1_1_1"


    // $ANTLR start "rule__AttrAss__NameAssignment_0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5226:1: rule__AttrAss__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__AttrAss__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5230:1: ( ( RULE_ID ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5231:1: ( RULE_ID )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5231:1: ( RULE_ID )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5232:1: RULE_ID
            {
             before(grammarAccess.getAttrAssAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AttrAss__NameAssignment_010523); 
             after(grammarAccess.getAttrAssAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__AttrAss__NameAssignment_0"


    // $ANTLR start "rule__AttrAss__ExprAssignment_2"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5241:1: rule__AttrAss__ExprAssignment_2 : ( ruleExpr ) ;
    public final void rule__AttrAss__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5245:1: ( ( ruleExpr ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5246:1: ( ruleExpr )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5246:1: ( ruleExpr )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5247:1: ruleExpr
            {
             before(grammarAccess.getAttrAssAccess().getExprExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__AttrAss__ExprAssignment_210554);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getAttrAssAccess().getExprExprParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__AttrAss__ExprAssignment_2"


    // $ANTLR start "rule__Expr__ConjAssignment_0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5256:1: rule__Expr__ConjAssignment_0 : ( ruleConj ) ;
    public final void rule__Expr__ConjAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5260:1: ( ( ruleConj ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5261:1: ( ruleConj )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5261:1: ( ruleConj )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5262:1: ruleConj
            {
             before(grammarAccess.getExprAccess().getConjConjParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleConj_in_rule__Expr__ConjAssignment_010585);
            ruleConj();

            state._fsp--;

             after(grammarAccess.getExprAccess().getConjConjParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Expr__ConjAssignment_0"


    // $ANTLR start "rule__Expr__ConjAssignment_1_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5271:1: rule__Expr__ConjAssignment_1_1 : ( ruleConj ) ;
    public final void rule__Expr__ConjAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5275:1: ( ( ruleConj ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5276:1: ( ruleConj )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5276:1: ( ruleConj )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5277:1: ruleConj
            {
             before(grammarAccess.getExprAccess().getConjConjParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleConj_in_rule__Expr__ConjAssignment_1_110616);
            ruleConj();

            state._fsp--;

             after(grammarAccess.getExprAccess().getConjConjParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Expr__ConjAssignment_1_1"


    // $ANTLR start "rule__Conj__RelatAssignment_0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5286:1: rule__Conj__RelatAssignment_0 : ( ruleRelat ) ;
    public final void rule__Conj__RelatAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5290:1: ( ( ruleRelat ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5291:1: ( ruleRelat )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5291:1: ( ruleRelat )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5292:1: ruleRelat
            {
             before(grammarAccess.getConjAccess().getRelatRelatParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleRelat_in_rule__Conj__RelatAssignment_010647);
            ruleRelat();

            state._fsp--;

             after(grammarAccess.getConjAccess().getRelatRelatParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Conj__RelatAssignment_0"


    // $ANTLR start "rule__Conj__RelatAssignment_1_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5301:1: rule__Conj__RelatAssignment_1_1 : ( ruleRelat ) ;
    public final void rule__Conj__RelatAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5305:1: ( ( ruleRelat ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5306:1: ( ruleRelat )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5306:1: ( ruleRelat )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5307:1: ruleRelat
            {
             before(grammarAccess.getConjAccess().getRelatRelatParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleRelat_in_rule__Conj__RelatAssignment_1_110678);
            ruleRelat();

            state._fsp--;

             after(grammarAccess.getConjAccess().getRelatRelatParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Conj__RelatAssignment_1_1"


    // $ANTLR start "rule__Relat__AddAssignment_0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5316:1: rule__Relat__AddAssignment_0 : ( ruleAdd ) ;
    public final void rule__Relat__AddAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5320:1: ( ( ruleAdd ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5321:1: ( ruleAdd )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5321:1: ( ruleAdd )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5322:1: ruleAdd
            {
             before(grammarAccess.getRelatAccess().getAddAddParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAdd_in_rule__Relat__AddAssignment_010709);
            ruleAdd();

            state._fsp--;

             after(grammarAccess.getRelatAccess().getAddAddParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Relat__AddAssignment_0"


    // $ANTLR start "rule__Relat__AddAssignment_1_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5331:1: rule__Relat__AddAssignment_1_1 : ( ruleAdd ) ;
    public final void rule__Relat__AddAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5335:1: ( ( ruleAdd ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5336:1: ( ruleAdd )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5336:1: ( ruleAdd )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5337:1: ruleAdd
            {
             before(grammarAccess.getRelatAccess().getAddAddParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAdd_in_rule__Relat__AddAssignment_1_110740);
            ruleAdd();

            state._fsp--;

             after(grammarAccess.getRelatAccess().getAddAddParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Relat__AddAssignment_1_1"


    // $ANTLR start "rule__Add__MultAssignment_0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5346:1: rule__Add__MultAssignment_0 : ( ruleMult ) ;
    public final void rule__Add__MultAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5350:1: ( ( ruleMult ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5351:1: ( ruleMult )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5351:1: ( ruleMult )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5352:1: ruleMult
            {
             before(grammarAccess.getAddAccess().getMultMultParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMult_in_rule__Add__MultAssignment_010771);
            ruleMult();

            state._fsp--;

             after(grammarAccess.getAddAccess().getMultMultParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Add__MultAssignment_0"


    // $ANTLR start "rule__Add__MultAssignment_1_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5361:1: rule__Add__MultAssignment_1_1 : ( ruleMult ) ;
    public final void rule__Add__MultAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5365:1: ( ( ruleMult ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5366:1: ( ruleMult )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5366:1: ( ruleMult )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5367:1: ruleMult
            {
             before(grammarAccess.getAddAccess().getMultMultParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMult_in_rule__Add__MultAssignment_1_110802);
            ruleMult();

            state._fsp--;

             after(grammarAccess.getAddAccess().getMultMultParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Add__MultAssignment_1_1"


    // $ANTLR start "rule__Mult__UnaryAssignment_0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5376:1: rule__Mult__UnaryAssignment_0 : ( ruleUnary ) ;
    public final void rule__Mult__UnaryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5380:1: ( ( ruleUnary ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5381:1: ( ruleUnary )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5381:1: ( ruleUnary )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5382:1: ruleUnary
            {
             before(grammarAccess.getMultAccess().getUnaryUnaryParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleUnary_in_rule__Mult__UnaryAssignment_010833);
            ruleUnary();

            state._fsp--;

             after(grammarAccess.getMultAccess().getUnaryUnaryParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Mult__UnaryAssignment_0"


    // $ANTLR start "rule__Mult__UnaryAssignment_1_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5391:1: rule__Mult__UnaryAssignment_1_1 : ( ruleUnary ) ;
    public final void rule__Mult__UnaryAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5395:1: ( ( ruleUnary ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5396:1: ( ruleUnary )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5396:1: ( ruleUnary )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5397:1: ruleUnary
            {
             before(grammarAccess.getMultAccess().getUnaryUnaryParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleUnary_in_rule__Mult__UnaryAssignment_1_110864);
            ruleUnary();

            state._fsp--;

             after(grammarAccess.getMultAccess().getUnaryUnaryParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Mult__UnaryAssignment_1_1"


    // $ANTLR start "rule__Unary__AtomAssignment_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5406:1: rule__Unary__AtomAssignment_1 : ( ruleAtom ) ;
    public final void rule__Unary__AtomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5410:1: ( ( ruleAtom ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5411:1: ( ruleAtom )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5411:1: ( ruleAtom )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5412:1: ruleAtom
            {
             before(grammarAccess.getUnaryAccess().getAtomAtomParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAtom_in_rule__Unary__AtomAssignment_110895);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getUnaryAccess().getAtomAtomParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Unary__AtomAssignment_1"


    // $ANTLR start "rule__Atom__ValueAssignment_0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5421:1: rule__Atom__ValueAssignment_0 : ( RULE_INT ) ;
    public final void rule__Atom__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5425:1: ( ( RULE_INT ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5426:1: ( RULE_INT )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5426:1: ( RULE_INT )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5427:1: RULE_INT
            {
             before(grammarAccess.getAtomAccess().getValueINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Atom__ValueAssignment_010926); 
             after(grammarAccess.getAtomAccess().getValueINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Atom__ValueAssignment_0"


    // $ANTLR start "rule__Atom__Var1Assignment_1_0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5436:1: rule__Atom__Var1Assignment_1_0 : ( ruleVar ) ;
    public final void rule__Atom__Var1Assignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5440:1: ( ( ruleVar ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5441:1: ( ruleVar )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5441:1: ( ruleVar )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5442:1: ruleVar
            {
             before(grammarAccess.getAtomAccess().getVar1VarParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleVar_in_rule__Atom__Var1Assignment_1_010957);
            ruleVar();

            state._fsp--;

             after(grammarAccess.getAtomAccess().getVar1VarParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Atom__Var1Assignment_1_0"


    // $ANTLR start "rule__Atom__Var2Assignment_1_1_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5451:1: rule__Atom__Var2Assignment_1_1_1 : ( ruleVar ) ;
    public final void rule__Atom__Var2Assignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5455:1: ( ( ruleVar ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5456:1: ( ruleVar )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5456:1: ( ruleVar )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5457:1: ruleVar
            {
             before(grammarAccess.getAtomAccess().getVar2VarParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleVar_in_rule__Atom__Var2Assignment_1_1_110988);
            ruleVar();

            state._fsp--;

             after(grammarAccess.getAtomAccess().getVar2VarParserRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__Atom__Var2Assignment_1_1_1"


    // $ANTLR start "rule__Atom__ExprAssignment_2_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5466:1: rule__Atom__ExprAssignment_2_1 : ( ruleExpr ) ;
    public final void rule__Atom__ExprAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5470:1: ( ( ruleExpr ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5471:1: ( ruleExpr )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5471:1: ( ruleExpr )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5472:1: ruleExpr
            {
             before(grammarAccess.getAtomAccess().getExprExprParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Atom__ExprAssignment_2_111019);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getAtomAccess().getExprExprParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Atom__ExprAssignment_2_1"


    // $ANTLR start "rule__Var__NameAssignment_0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5481:1: rule__Var__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Var__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5485:1: ( ( RULE_ID ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5486:1: ( RULE_ID )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5486:1: ( RULE_ID )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5487:1: RULE_ID
            {
             before(grammarAccess.getVarAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Var__NameAssignment_011050); 
             after(grammarAccess.getVarAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Var__NameAssignment_0"


    // $ANTLR start "rule__Var__ExprAssignment_1_0_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5496:1: rule__Var__ExprAssignment_1_0_1 : ( ruleExpr ) ;
    public final void rule__Var__ExprAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5500:1: ( ( ruleExpr ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5501:1: ( ruleExpr )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5501:1: ( ruleExpr )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5502:1: ruleExpr
            {
             before(grammarAccess.getVarAccess().getExprExprParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Var__ExprAssignment_1_0_111081);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getVarAccess().getExprExprParserRuleCall_1_0_1_0()); 

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
    // $ANTLR end "rule__Var__ExprAssignment_1_0_1"


    // $ANTLR start "rule__Var__SubnameAssignment_1_0_3_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5511:1: rule__Var__SubnameAssignment_1_0_3_1 : ( RULE_ID ) ;
    public final void rule__Var__SubnameAssignment_1_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5515:1: ( ( RULE_ID ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5516:1: ( RULE_ID )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5516:1: ( RULE_ID )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5517:1: RULE_ID
            {
             before(grammarAccess.getVarAccess().getSubnameIDTerminalRuleCall_1_0_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Var__SubnameAssignment_1_0_3_111112); 
             after(grammarAccess.getVarAccess().getSubnameIDTerminalRuleCall_1_0_3_1_0()); 

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
    // $ANTLR end "rule__Var__SubnameAssignment_1_0_3_1"


    // $ANTLR start "rule__Var__SubnameAssignment_1_1_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5526:1: rule__Var__SubnameAssignment_1_1_1 : ( RULE_ID ) ;
    public final void rule__Var__SubnameAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5530:1: ( ( RULE_ID ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5531:1: ( RULE_ID )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5531:1: ( RULE_ID )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5532:1: RULE_ID
            {
             before(grammarAccess.getVarAccess().getSubnameIDTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Var__SubnameAssignment_1_1_111143); 
             after(grammarAccess.getVarAccess().getSubnameIDTerminalRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__Var__SubnameAssignment_1_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0_in_ruleDeclaration154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_entryRuleVarDecl181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDecl188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__0_in_ruleVarDecl214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjDecl_in_entryRuleObjDecl241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjDecl248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group__0_in_ruleObjDecl274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Alternatives_in_ruleBlock334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnimBlock_in_entryRuleAnimBlock361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnimBlock368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnimBlock__Group__0_in_ruleAnimBlock394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventBlock_in_entryRuleEventBlock421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventBlock428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventBlock__Group__0_in_ruleEventBlock454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjType_in_entryRuleObjType481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjType488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjType__Alternatives_in_ruleObjType514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeystroke_in_entryRuleKeystroke541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeystroke548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Keystroke__Alternatives_in_ruleKeystroke574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_entryRuleStatementBlock601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatementBlock608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group__0_in_ruleStatementBlock634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStmt_in_entryRuleStmt661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStmt668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stmt__Alternatives_in_ruleStmt694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForStmt_in_entryRuleForStmt721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForStmt728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForStmt__Group__0_in_ruleForStmt754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStmt_in_entryRuleIfStmt781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfStmt788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStmt__Group__0_in_ruleIfStmt814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElseStmt_in_entryRuleElseStmt841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElseStmt848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElseStmt__Group__0_in_ruleElseStmt874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssStmt_in_entryRuleAssStmt901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssStmt908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssStmt__Group__0_in_ruleAssStmt934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssStmt2_in_entryRuleAssStmt2961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssStmt2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssStmt2__Group__0_in_ruleAssStmt2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrList_in_entryRuleAttrList1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrList1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrList__Group__0_in_ruleAttrList1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrAss_in_entryRuleAttrAss1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrAss1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrAss__Group__0_in_ruleAttrAss1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group__0_in_ruleExpr1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConj_in_entryRuleConj1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConj1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conj__Group__0_in_ruleConj1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelat_in_entryRuleRelat1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelat1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relat__Group__0_in_ruleRelat1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdd_in_entryRuleAdd1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdd1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Add__Group__0_in_ruleAdd1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMult_in_entryRuleMult1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMult1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mult__Group__0_in_ruleMult1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnary_in_entryRuleUnary1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnary1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__Group__0_in_ruleUnary1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtom1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Alternatives_in_ruleAtom1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_entryRuleVar1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group__0_in_ruleVar1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__VariAssignment_0_0_in_rule__Declaration__Alternatives_01630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__ObjAssignment_0_1_in_rule__Declaration__Alternatives_01648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_2_0__0_in_rule__VarDecl__Alternatives_21681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_2_1__0_in_rule__VarDecl__Alternatives_21700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group_2_0__0_in_rule__ObjDecl__Alternatives_21733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group_2_1__0_in_rule__ObjDecl__Alternatives_21751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnimBlock_in_rule__Block__Alternatives1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventBlock_in_rule__Block__Alternatives1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ObjType__Alternatives1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ObjType__Alternatives1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ObjType__Alternatives1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Keystroke__Alternatives1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Keystroke__Alternatives1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Keystroke__Alternatives1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Keystroke__Alternatives1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Keystroke__Alternatives1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStmt_in_rule__Stmt__Alternatives2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForStmt_in_rule__Stmt__Alternatives2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssStmt_in_rule__Stmt__Alternatives2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Relat__Alternatives_1_02090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Relat__Alternatives_1_02110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Relat__Alternatives_1_02130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Add__Alternatives_1_02165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Add__Alternatives_1_02185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Mult__Alternatives_1_02220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Mult__Alternatives_1_02240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Unary__Alternatives_02275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Unary__Alternatives_02295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__ValueAssignment_0_in_rule__Atom__Alternatives2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__0_in_rule__Atom__Alternatives2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_2__0_in_rule__Atom__Alternatives2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group_1_0__0_in_rule__Var__Alternatives_12398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group_1_1__0_in_rule__Var__Alternatives_12416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02447 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Model__Group__0__Impl2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12509 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22569 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Model__Group__2__Impl2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32631 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__32634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__AttrAssignment_3_in_rule__Model__Group__3__Impl2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__42691 = new BitSet(new long[]{0x0000002080003800L});
    public static final BitSet FOLLOW_rule__Model__Group__5_in_rule__Model__Group__42694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Model__Group__4__Impl2722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__5__Impl_in_rule__Model__Group__52753 = new BitSet(new long[]{0x0000002080003800L});
    public static final BitSet FOLLOW_rule__Model__Group__6_in_rule__Model__Group__52756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DeclAssignment_5_in_rule__Model__Group__5__Impl2783 = new BitSet(new long[]{0x0000000080003802L});
    public static final BitSet FOLLOW_rule__Model__Group__6__Impl_in_rule__Model__Group__62814 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_rule__Model__Group__7_in_rule__Model__Group__62817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__StmtAssignment_6_in_rule__Model__Group__6__Impl2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__7__Impl_in_rule__Model__Group__72874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__BlocksAssignment_7_in_rule__Model__Group__7__Impl2901 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__02948 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__02951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Alternatives_0_in_rule__Declaration__Group__0__Impl2978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__13008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Declaration__Group__1__Impl3036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__0__Impl_in_rule__VarDecl__Group__03071 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__1_in_rule__VarDecl__Group__03074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__VarDecl__Group__0__Impl3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__1__Impl_in_rule__VarDecl__Group__13133 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__2_in_rule__VarDecl__Group__13136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__NameAssignment_1_in_rule__VarDecl__Group__1__Impl3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__2__Impl_in_rule__VarDecl__Group__23193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Alternatives_2_in_rule__VarDecl__Group__2__Impl3220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_2_0__0__Impl_in_rule__VarDecl__Group_2_0__03256 = new BitSet(new long[]{0x0000000014800030L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_2_0__1_in_rule__VarDecl__Group_2_0__03259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__VarDecl__Group_2_0__0__Impl3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_2_0__1__Impl_in_rule__VarDecl__Group_2_0__13318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__ExprAssignment_2_0_1_in_rule__VarDecl__Group_2_0__1__Impl3345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_2_1__0__Impl_in_rule__VarDecl__Group_2_1__03379 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_2_1__1_in_rule__VarDecl__Group_2_1__03382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__VarDecl__Group_2_1__0__Impl3410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_2_1__1__Impl_in_rule__VarDecl__Group_2_1__13441 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_2_1__2_in_rule__VarDecl__Group_2_1__13444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__ValueAssignment_2_1_1_in_rule__VarDecl__Group_2_1__1__Impl3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_2_1__2__Impl_in_rule__VarDecl__Group_2_1__23501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__VarDecl__Group_2_1__2__Impl3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group__0__Impl_in_rule__ObjDecl__Group__03566 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group__1_in_rule__ObjDecl__Group__03569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjDecl__TypeAssignment_0_in_rule__ObjDecl__Group__0__Impl3596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group__1__Impl_in_rule__ObjDecl__Group__13626 = new BitSet(new long[]{0x0000000210000000L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group__2_in_rule__ObjDecl__Group__13629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjDecl__NameAssignment_1_in_rule__ObjDecl__Group__1__Impl3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group__2__Impl_in_rule__ObjDecl__Group__23686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjDecl__Alternatives_2_in_rule__ObjDecl__Group__2__Impl3713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group_2_0__0__Impl_in_rule__ObjDecl__Group_2_0__03749 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group_2_0__1_in_rule__ObjDecl__Group_2_0__03752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ObjDecl__Group_2_0__0__Impl3780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group_2_0__1__Impl_in_rule__ObjDecl__Group_2_0__13811 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group_2_0__2_in_rule__ObjDecl__Group_2_0__13814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjDecl__AttrAssignment_2_0_1_in_rule__ObjDecl__Group_2_0__1__Impl3841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group_2_0__2__Impl_in_rule__ObjDecl__Group_2_0__23871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ObjDecl__Group_2_0__2__Impl3899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group_2_1__0__Impl_in_rule__ObjDecl__Group_2_1__03936 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group_2_1__1_in_rule__ObjDecl__Group_2_1__03939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ObjDecl__Group_2_1__0__Impl3967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group_2_1__1__Impl_in_rule__ObjDecl__Group_2_1__13998 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group_2_1__2_in_rule__ObjDecl__Group_2_1__14001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjDecl__ValueAssignment_2_1_1_in_rule__ObjDecl__Group_2_1__1__Impl4028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group_2_1__2__Impl_in_rule__ObjDecl__Group_2_1__24058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ObjDecl__Group_2_1__2__Impl4086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnimBlock__Group__0__Impl_in_rule__AnimBlock__Group__04123 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AnimBlock__Group__1_in_rule__AnimBlock__Group__04126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__AnimBlock__Group__0__Impl4154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnimBlock__Group__1__Impl_in_rule__AnimBlock__Group__14185 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__AnimBlock__Group__2_in_rule__AnimBlock__Group__14188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnimBlock__NameAssignment_1_in_rule__AnimBlock__Group__1__Impl4215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnimBlock__Group__2__Impl_in_rule__AnimBlock__Group__24245 = new BitSet(new long[]{0x0000000080003800L});
    public static final BitSet FOLLOW_rule__AnimBlock__Group__3_in_rule__AnimBlock__Group__24248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__AnimBlock__Group__2__Impl4276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnimBlock__Group__3__Impl_in_rule__AnimBlock__Group__34307 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AnimBlock__Group__4_in_rule__AnimBlock__Group__34310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnimBlock__TypeAssignment_3_in_rule__AnimBlock__Group__3__Impl4337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnimBlock__Group__4__Impl_in_rule__AnimBlock__Group__44367 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__AnimBlock__Group__5_in_rule__AnimBlock__Group__44370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnimBlock__ObjNameAssignment_4_in_rule__AnimBlock__Group__4__Impl4397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnimBlock__Group__5__Impl_in_rule__AnimBlock__Group__54427 = new BitSet(new long[]{0x0000002080003800L});
    public static final BitSet FOLLOW_rule__AnimBlock__Group__6_in_rule__AnimBlock__Group__54430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__AnimBlock__Group__5__Impl4458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnimBlock__Group__6__Impl_in_rule__AnimBlock__Group__64489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnimBlock__StmtAssignment_6_in_rule__AnimBlock__Group__6__Impl4516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventBlock__Group__0__Impl_in_rule__EventBlock__Group__04560 = new BitSet(new long[]{0x000000000007C000L});
    public static final BitSet FOLLOW_rule__EventBlock__Group__1_in_rule__EventBlock__Group__04563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__EventBlock__Group__0__Impl4591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventBlock__Group__1__Impl_in_rule__EventBlock__Group__14622 = new BitSet(new long[]{0x0000002080003800L});
    public static final BitSet FOLLOW_rule__EventBlock__Group__2_in_rule__EventBlock__Group__14625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventBlock__KeyAssignment_1_in_rule__EventBlock__Group__1__Impl4652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventBlock__Group__2__Impl_in_rule__EventBlock__Group__24682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventBlock__StmtAssignment_2_in_rule__EventBlock__Group__2__Impl4709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group__0__Impl_in_rule__StatementBlock__Group__04745 = new BitSet(new long[]{0x0000002080003800L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group__1_in_rule__StatementBlock__Group__04748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group__1__Impl_in_rule__StatementBlock__Group__14806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group_1__0_in_rule__StatementBlock__Group__1__Impl4833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group_1__0__Impl_in_rule__StatementBlock__Group_1__04867 = new BitSet(new long[]{0x000001C000000010L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group_1__1_in_rule__StatementBlock__Group_1__04870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__StatementBlock__Group_1__0__Impl4898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group_1__1__Impl_in_rule__StatementBlock__Group_1__14929 = new BitSet(new long[]{0x000001C000000010L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group_1__2_in_rule__StatementBlock__Group_1__14932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementBlock__StmtAssignment_1_1_in_rule__StatementBlock__Group_1__1__Impl4959 = new BitSet(new long[]{0x0000018000000012L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group_1__2__Impl_in_rule__StatementBlock__Group_1__24990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__StatementBlock__Group_1__2__Impl5018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForStmt__Group__0__Impl_in_rule__ForStmt__Group__05055 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ForStmt__Group__1_in_rule__ForStmt__Group__05058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ForStmt__Group__0__Impl5086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForStmt__Group__1__Impl_in_rule__ForStmt__Group__15117 = new BitSet(new long[]{0x0000018000000010L});
    public static final BitSet FOLLOW_rule__ForStmt__Group__2_in_rule__ForStmt__Group__15120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ForStmt__Group__1__Impl5148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForStmt__Group__2__Impl_in_rule__ForStmt__Group__25179 = new BitSet(new long[]{0x0000000014800030L});
    public static final BitSet FOLLOW_rule__ForStmt__Group__3_in_rule__ForStmt__Group__25182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForStmt__Ass1Assignment_2_in_rule__ForStmt__Group__2__Impl5209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForStmt__Group__3__Impl_in_rule__ForStmt__Group__35239 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ForStmt__Group__4_in_rule__ForStmt__Group__35242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForStmt__ExprAssignment_3_in_rule__ForStmt__Group__3__Impl5269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForStmt__Group__4__Impl_in_rule__ForStmt__Group__45299 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ForStmt__Group__5_in_rule__ForStmt__Group__45302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ForStmt__Group__4__Impl5330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForStmt__Group__5__Impl_in_rule__ForStmt__Group__55361 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ForStmt__Group__6_in_rule__ForStmt__Group__55364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForStmt__Ass2Assignment_5_in_rule__ForStmt__Group__5__Impl5391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForStmt__Group__6__Impl_in_rule__ForStmt__Group__65421 = new BitSet(new long[]{0x0000002080003800L});
    public static final BitSet FOLLOW_rule__ForStmt__Group__7_in_rule__ForStmt__Group__65424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ForStmt__Group__6__Impl5452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForStmt__Group__7__Impl_in_rule__ForStmt__Group__75483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForStmt__StmtAssignment_7_in_rule__ForStmt__Group__7__Impl5510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStmt__Group__0__Impl_in_rule__IfStmt__Group__05556 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__IfStmt__Group__1_in_rule__IfStmt__Group__05559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__IfStmt__Group__0__Impl5587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStmt__Group__1__Impl_in_rule__IfStmt__Group__15618 = new BitSet(new long[]{0x0000000014800030L});
    public static final BitSet FOLLOW_rule__IfStmt__Group__2_in_rule__IfStmt__Group__15621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__IfStmt__Group__1__Impl5649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStmt__Group__2__Impl_in_rule__IfStmt__Group__25680 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__IfStmt__Group__3_in_rule__IfStmt__Group__25683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStmt__ExprAssignment_2_in_rule__IfStmt__Group__2__Impl5710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStmt__Group__3__Impl_in_rule__IfStmt__Group__35740 = new BitSet(new long[]{0x0000002080003800L});
    public static final BitSet FOLLOW_rule__IfStmt__Group__4_in_rule__IfStmt__Group__35743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__IfStmt__Group__3__Impl5771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStmt__Group__4__Impl_in_rule__IfStmt__Group__45802 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__IfStmt__Group__5_in_rule__IfStmt__Group__45805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStmt__StmtAssignment_4_in_rule__IfStmt__Group__4__Impl5832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStmt__Group__5__Impl_in_rule__IfStmt__Group__55862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStmt__ElseAssignment_5_in_rule__IfStmt__Group__5__Impl5889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElseStmt__Group__0__Impl_in_rule__ElseStmt__Group__05932 = new BitSet(new long[]{0x0000002080003800L});
    public static final BitSet FOLLOW_rule__ElseStmt__Group__1_in_rule__ElseStmt__Group__05935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ElseStmt__Group__0__Impl5963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElseStmt__Group__1__Impl_in_rule__ElseStmt__Group__15994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElseStmt__StmtAssignment_1_in_rule__ElseStmt__Group__1__Impl6021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssStmt__Group__0__Impl_in_rule__AssStmt__Group__06055 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__AssStmt__Group__1_in_rule__AssStmt__Group__06058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssStmt__VarAssignment_0_in_rule__AssStmt__Group__0__Impl6085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssStmt__Group__1__Impl_in_rule__AssStmt__Group__16115 = new BitSet(new long[]{0x0000000014800030L});
    public static final BitSet FOLLOW_rule__AssStmt__Group__2_in_rule__AssStmt__Group__16118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__AssStmt__Group__1__Impl6146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssStmt__Group__2__Impl_in_rule__AssStmt__Group__26177 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__AssStmt__Group__3_in_rule__AssStmt__Group__26180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssStmt__ExprAssignment_2_in_rule__AssStmt__Group__2__Impl6207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssStmt__Group__3__Impl_in_rule__AssStmt__Group__36237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__AssStmt__Group__3__Impl6265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssStmt2__Group__0__Impl_in_rule__AssStmt2__Group__06304 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__AssStmt2__Group__1_in_rule__AssStmt2__Group__06307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssStmt2__VarAssignment_0_in_rule__AssStmt2__Group__0__Impl6334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssStmt2__Group__1__Impl_in_rule__AssStmt2__Group__16364 = new BitSet(new long[]{0x0000000014800030L});
    public static final BitSet FOLLOW_rule__AssStmt2__Group__2_in_rule__AssStmt2__Group__16367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__AssStmt2__Group__1__Impl6395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssStmt2__Group__2__Impl_in_rule__AssStmt2__Group__26426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssStmt2__ExprAssignment_2_in_rule__AssStmt2__Group__2__Impl6453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrList__Group__0__Impl_in_rule__AttrList__Group__06489 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_rule__AttrList__Group__1_in_rule__AttrList__Group__06492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrList__Group__1__Impl_in_rule__AttrList__Group__16550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrList__Group_1__0_in_rule__AttrList__Group__1__Impl6577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrList__Group_1__0__Impl_in_rule__AttrList__Group_1__06611 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_rule__AttrList__Group_1__1_in_rule__AttrList__Group_1__06614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrList__AttrAssignment_1_0_in_rule__AttrList__Group_1__0__Impl6641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrList__Group_1__1__Impl_in_rule__AttrList__Group_1__16672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrList__Group_1_1__0_in_rule__AttrList__Group_1__1__Impl6699 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__AttrList__Group_1_1__0__Impl_in_rule__AttrList__Group_1_1__06734 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrList__Group_1_1__1_in_rule__AttrList__Group_1_1__06737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__AttrList__Group_1_1__0__Impl6765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrList__Group_1_1__1__Impl_in_rule__AttrList__Group_1_1__16796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrList__AttrAssignment_1_1_1_in_rule__AttrList__Group_1_1__1__Impl6823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrAss__Group__0__Impl_in_rule__AttrAss__Group__06857 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__AttrAss__Group__1_in_rule__AttrAss__Group__06860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrAss__NameAssignment_0_in_rule__AttrAss__Group__0__Impl6887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrAss__Group__1__Impl_in_rule__AttrAss__Group__16917 = new BitSet(new long[]{0x0000000014800030L});
    public static final BitSet FOLLOW_rule__AttrAss__Group__2_in_rule__AttrAss__Group__16920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__AttrAss__Group__1__Impl6948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrAss__Group__2__Impl_in_rule__AttrAss__Group__26979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrAss__ExprAssignment_2_in_rule__AttrAss__Group__2__Impl7006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group__0__Impl_in_rule__Expr__Group__07042 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Expr__Group__1_in_rule__Expr__Group__07045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ConjAssignment_0_in_rule__Expr__Group__0__Impl7072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group__1__Impl_in_rule__Expr__Group__17102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__0_in_rule__Expr__Group__1__Impl7129 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__0__Impl_in_rule__Expr__Group_1__07164 = new BitSet(new long[]{0x0000000014800030L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__1_in_rule__Expr__Group_1__07167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Expr__Group_1__0__Impl7195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__1__Impl_in_rule__Expr__Group_1__17226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ConjAssignment_1_1_in_rule__Expr__Group_1__1__Impl7253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conj__Group__0__Impl_in_rule__Conj__Group__07287 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Conj__Group__1_in_rule__Conj__Group__07290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conj__RelatAssignment_0_in_rule__Conj__Group__0__Impl7317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conj__Group__1__Impl_in_rule__Conj__Group__17347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conj__Group_1__0_in_rule__Conj__Group__1__Impl7374 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__Conj__Group_1__0__Impl_in_rule__Conj__Group_1__07409 = new BitSet(new long[]{0x0000000014800030L});
    public static final BitSet FOLLOW_rule__Conj__Group_1__1_in_rule__Conj__Group_1__07412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Conj__Group_1__0__Impl7440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conj__Group_1__1__Impl_in_rule__Conj__Group_1__17471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conj__RelatAssignment_1_1_in_rule__Conj__Group_1__1__Impl7498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relat__Group__0__Impl_in_rule__Relat__Group__07532 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_rule__Relat__Group__1_in_rule__Relat__Group__07535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relat__AddAssignment_0_in_rule__Relat__Group__0__Impl7562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relat__Group__1__Impl_in_rule__Relat__Group__17592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relat__Group_1__0_in_rule__Relat__Group__1__Impl7619 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_rule__Relat__Group_1__0__Impl_in_rule__Relat__Group_1__07654 = new BitSet(new long[]{0x0000000014800030L});
    public static final BitSet FOLLOW_rule__Relat__Group_1__1_in_rule__Relat__Group_1__07657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relat__Alternatives_1_0_in_rule__Relat__Group_1__0__Impl7684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relat__Group_1__1__Impl_in_rule__Relat__Group_1__17714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relat__AddAssignment_1_1_in_rule__Relat__Group_1__1__Impl7741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Add__Group__0__Impl_in_rule__Add__Group__07775 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__Add__Group__1_in_rule__Add__Group__07778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Add__MultAssignment_0_in_rule__Add__Group__0__Impl7805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Add__Group__1__Impl_in_rule__Add__Group__17835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Add__Group_1__0_in_rule__Add__Group__1__Impl7862 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_rule__Add__Group_1__0__Impl_in_rule__Add__Group_1__07897 = new BitSet(new long[]{0x0000000014800030L});
    public static final BitSet FOLLOW_rule__Add__Group_1__1_in_rule__Add__Group_1__07900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Add__Alternatives_1_0_in_rule__Add__Group_1__0__Impl7927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Add__Group_1__1__Impl_in_rule__Add__Group_1__17957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Add__MultAssignment_1_1_in_rule__Add__Group_1__1__Impl7984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mult__Group__0__Impl_in_rule__Mult__Group__08018 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__Mult__Group__1_in_rule__Mult__Group__08021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mult__UnaryAssignment_0_in_rule__Mult__Group__0__Impl8048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mult__Group__1__Impl_in_rule__Mult__Group__18078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mult__Group_1__0_in_rule__Mult__Group__1__Impl8105 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_rule__Mult__Group_1__0__Impl_in_rule__Mult__Group_1__08140 = new BitSet(new long[]{0x0000000014800030L});
    public static final BitSet FOLLOW_rule__Mult__Group_1__1_in_rule__Mult__Group_1__08143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mult__Alternatives_1_0_in_rule__Mult__Group_1__0__Impl8170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mult__Group_1__1__Impl_in_rule__Mult__Group_1__18200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mult__UnaryAssignment_1_1_in_rule__Mult__Group_1__1__Impl8227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__Group__0__Impl_in_rule__Unary__Group__08261 = new BitSet(new long[]{0x0000000014800030L});
    public static final BitSet FOLLOW_rule__Unary__Group__1_in_rule__Unary__Group__08264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__Alternatives_0_in_rule__Unary__Group__0__Impl8291 = new BitSet(new long[]{0x0000000004800002L});
    public static final BitSet FOLLOW_rule__Unary__Group__1__Impl_in_rule__Unary__Group__18322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__AtomAssignment_1_in_rule__Unary__Group__1__Impl8349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__0__Impl_in_rule__Atom__Group_1__08383 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__1_in_rule__Atom__Group_1__08386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Var1Assignment_1_0_in_rule__Atom__Group_1__0__Impl8413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__1__Impl_in_rule__Atom__Group_1__18443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1_1__0_in_rule__Atom__Group_1__1__Impl8470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1_1__0__Impl_in_rule__Atom__Group_1_1__08505 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Atom__Group_1_1__1_in_rule__Atom__Group_1_1__08508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Atom__Group_1_1__0__Impl8536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1_1__1__Impl_in_rule__Atom__Group_1_1__18567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Var2Assignment_1_1_1_in_rule__Atom__Group_1_1__1__Impl8594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_2__0__Impl_in_rule__Atom__Group_2__08628 = new BitSet(new long[]{0x0000000014800030L});
    public static final BitSet FOLLOW_rule__Atom__Group_2__1_in_rule__Atom__Group_2__08631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Atom__Group_2__0__Impl8659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_2__1__Impl_in_rule__Atom__Group_2__18690 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Atom__Group_2__2_in_rule__Atom__Group_2__18693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__ExprAssignment_2_1_in_rule__Atom__Group_2__1__Impl8720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_2__2__Impl_in_rule__Atom__Group_2__28750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Atom__Group_2__2__Impl8778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group__0__Impl_in_rule__Var__Group__08815 = new BitSet(new long[]{0x0000400200000000L});
    public static final BitSet FOLLOW_rule__Var__Group__1_in_rule__Var__Group__08818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__NameAssignment_0_in_rule__Var__Group__0__Impl8845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group__1__Impl_in_rule__Var__Group__18875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Alternatives_1_in_rule__Var__Group__1__Impl8902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group_1_0__0__Impl_in_rule__Var__Group_1_0__08937 = new BitSet(new long[]{0x0000000014800030L});
    public static final BitSet FOLLOW_rule__Var__Group_1_0__1_in_rule__Var__Group_1_0__08940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Var__Group_1_0__0__Impl8968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group_1_0__1__Impl_in_rule__Var__Group_1_0__18999 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Var__Group_1_0__2_in_rule__Var__Group_1_0__19002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__ExprAssignment_1_0_1_in_rule__Var__Group_1_0__1__Impl9029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group_1_0__2__Impl_in_rule__Var__Group_1_0__29059 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Var__Group_1_0__3_in_rule__Var__Group_1_0__29062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Var__Group_1_0__2__Impl9090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group_1_0__3__Impl_in_rule__Var__Group_1_0__39121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group_1_0_3__0_in_rule__Var__Group_1_0__3__Impl9148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group_1_0_3__0__Impl_in_rule__Var__Group_1_0_3__09187 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Var__Group_1_0_3__1_in_rule__Var__Group_1_0_3__09190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Var__Group_1_0_3__0__Impl9218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group_1_0_3__1__Impl_in_rule__Var__Group_1_0_3__19249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__SubnameAssignment_1_0_3_1_in_rule__Var__Group_1_0_3__1__Impl9276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group_1_1__0__Impl_in_rule__Var__Group_1_1__09310 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Var__Group_1_1__1_in_rule__Var__Group_1_1__09313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Var__Group_1_1__0__Impl9341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group_1_1__1__Impl_in_rule__Var__Group_1_1__19372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__SubnameAssignment_1_1_1_in_rule__Var__Group_1_1__1__Impl9399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__NameAssignment_19438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrList_in_rule__Model__AttrAssignment_39469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Model__DeclAssignment_59500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_rule__Model__StmtAssignment_69531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__Model__BlocksAssignment_79562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_rule__Declaration__VariAssignment_0_09593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjDecl_in_rule__Declaration__ObjAssignment_0_19624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarDecl__NameAssignment_19655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__VarDecl__ExprAssignment_2_0_19686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__VarDecl__ValueAssignment_2_1_19717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjType_in_rule__ObjDecl__TypeAssignment_09748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjDecl__NameAssignment_19779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrList_in_rule__ObjDecl__AttrAssignment_2_0_19810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ObjDecl__ValueAssignment_2_1_19841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AnimBlock__NameAssignment_19872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjType_in_rule__AnimBlock__TypeAssignment_39903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AnimBlock__ObjNameAssignment_49934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_rule__AnimBlock__StmtAssignment_69965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeystroke_in_rule__EventBlock__KeyAssignment_19996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_rule__EventBlock__StmtAssignment_210027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStmt_in_rule__StatementBlock__StmtAssignment_1_110058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssStmt_in_rule__ForStmt__Ass1Assignment_210089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ForStmt__ExprAssignment_310120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssStmt2_in_rule__ForStmt__Ass2Assignment_510151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_rule__ForStmt__StmtAssignment_710182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__IfStmt__ExprAssignment_210213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_rule__IfStmt__StmtAssignment_410244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElseStmt_in_rule__IfStmt__ElseAssignment_510275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_rule__ElseStmt__StmtAssignment_110306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_rule__AssStmt__VarAssignment_010337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__AssStmt__ExprAssignment_210368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_rule__AssStmt2__VarAssignment_010399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__AssStmt2__ExprAssignment_210430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrAss_in_rule__AttrList__AttrAssignment_1_010461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrAss_in_rule__AttrList__AttrAssignment_1_1_110492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AttrAss__NameAssignment_010523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__AttrAss__ExprAssignment_210554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConj_in_rule__Expr__ConjAssignment_010585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConj_in_rule__Expr__ConjAssignment_1_110616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelat_in_rule__Conj__RelatAssignment_010647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelat_in_rule__Conj__RelatAssignment_1_110678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdd_in_rule__Relat__AddAssignment_010709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdd_in_rule__Relat__AddAssignment_1_110740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMult_in_rule__Add__MultAssignment_010771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMult_in_rule__Add__MultAssignment_1_110802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnary_in_rule__Mult__UnaryAssignment_010833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnary_in_rule__Mult__UnaryAssignment_1_110864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_rule__Unary__AtomAssignment_110895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Atom__ValueAssignment_010926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_rule__Atom__Var1Assignment_1_010957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_rule__Atom__Var2Assignment_1_1_110988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Atom__ExprAssignment_2_111019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Var__NameAssignment_011050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Var__ExprAssignment_1_0_111081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Var__SubnameAssignment_1_0_3_111112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Var__SubnameAssignment_1_1_111143 = new BitSet(new long[]{0x0000000000000002L});

}