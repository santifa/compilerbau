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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'rectangle'", "'triangle'", "'circle'", "'space'", "'leftarrow'", "'rightarrow'", "'uparrow'", "'downarrow'", "'=='", "'<'", "'<='", "'+'", "'-'", "'*'", "'/'", "'!'", "'game'", "'('", "')'", "';'", "'int'", "'['", "']'", "'='", "'animation'", "'on'", "'{'", "'}'", "'for'", "'if'", "'else'", "','", "'||'", "'&&'", "'touches'", "'.'"
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


    // $ANTLR start "entryRuleGame"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:88:1: entryRuleGame : ruleGame EOF ;
    public final void entryRuleGame() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:89:1: ( ruleGame EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:90:1: ruleGame EOF
            {
             before(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_ruleGame_in_entryRuleGame121);
            ruleGame();

            state._fsp--;

             after(grammarAccess.getGameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGame128); 

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
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:97:1: ruleGame : ( ( rule__Game__Group__0 ) ) ;
    public final void ruleGame() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:101:2: ( ( ( rule__Game__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:102:1: ( ( rule__Game__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:102:1: ( ( rule__Game__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:103:1: ( rule__Game__Group__0 )
            {
             before(grammarAccess.getGameAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:104:1: ( rule__Game__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:104:2: rule__Game__Group__0
            {
            pushFollow(FOLLOW_rule__Game__Group__0_in_ruleGame154);
            rule__Game__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRuleDeclaration"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:116:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:117:1: ( ruleDeclaration EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:118:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration181);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration188); 

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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:125:1: ruleDeclaration : ( ( rule__Declaration__Group__0 ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:129:2: ( ( ( rule__Declaration__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:130:1: ( ( rule__Declaration__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:130:1: ( ( rule__Declaration__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:131:1: ( rule__Declaration__Group__0 )
            {
             before(grammarAccess.getDeclarationAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:132:1: ( rule__Declaration__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:132:2: rule__Declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0_in_ruleDeclaration214);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:144:1: entryRuleVarDecl : ruleVarDecl EOF ;
    public final void entryRuleVarDecl() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:145:1: ( ruleVarDecl EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:146:1: ruleVarDecl EOF
            {
             before(grammarAccess.getVarDeclRule()); 
            pushFollow(FOLLOW_ruleVarDecl_in_entryRuleVarDecl241);
            ruleVarDecl();

            state._fsp--;

             after(grammarAccess.getVarDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDecl248); 

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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:153:1: ruleVarDecl : ( ( rule__VarDecl__Group__0 ) ) ;
    public final void ruleVarDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:157:2: ( ( ( rule__VarDecl__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:158:1: ( ( rule__VarDecl__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:158:1: ( ( rule__VarDecl__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:159:1: ( rule__VarDecl__Group__0 )
            {
             before(grammarAccess.getVarDeclAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:160:1: ( rule__VarDecl__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:160:2: rule__VarDecl__Group__0
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__0_in_ruleVarDecl274);
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


    // $ANTLR start "entryRuleInit"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:172:1: entryRuleInit : ruleInit EOF ;
    public final void entryRuleInit() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:173:1: ( ruleInit EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:174:1: ruleInit EOF
            {
             before(grammarAccess.getInitRule()); 
            pushFollow(FOLLOW_ruleInit_in_entryRuleInit301);
            ruleInit();

            state._fsp--;

             after(grammarAccess.getInitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInit308); 

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
    // $ANTLR end "entryRuleInit"


    // $ANTLR start "ruleInit"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:181:1: ruleInit : ( ( rule__Init__Group__0 ) ) ;
    public final void ruleInit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:185:2: ( ( ( rule__Init__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:186:1: ( ( rule__Init__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:186:1: ( ( rule__Init__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:187:1: ( rule__Init__Group__0 )
            {
             before(grammarAccess.getInitAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:188:1: ( rule__Init__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:188:2: rule__Init__Group__0
            {
            pushFollow(FOLLOW_rule__Init__Group__0_in_ruleInit334);
            rule__Init__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInit"


    // $ANTLR start "entryRuleObjDecl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:200:1: entryRuleObjDecl : ruleObjDecl EOF ;
    public final void entryRuleObjDecl() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:201:1: ( ruleObjDecl EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:202:1: ruleObjDecl EOF
            {
             before(grammarAccess.getObjDeclRule()); 
            pushFollow(FOLLOW_ruleObjDecl_in_entryRuleObjDecl361);
            ruleObjDecl();

            state._fsp--;

             after(grammarAccess.getObjDeclRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjDecl368); 

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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:209:1: ruleObjDecl : ( ( rule__ObjDecl__Group__0 ) ) ;
    public final void ruleObjDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:213:2: ( ( ( rule__ObjDecl__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:214:1: ( ( rule__ObjDecl__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:214:1: ( ( rule__ObjDecl__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:215:1: ( rule__ObjDecl__Group__0 )
            {
             before(grammarAccess.getObjDeclAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:216:1: ( rule__ObjDecl__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:216:2: rule__ObjDecl__Group__0
            {
            pushFollow(FOLLOW_rule__ObjDecl__Group__0_in_ruleObjDecl394);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:228:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:229:1: ( ruleBlock EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:230:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock421);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock428); 

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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:237:1: ruleBlock : ( ( rule__Block__Alternatives ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:241:2: ( ( ( rule__Block__Alternatives ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:242:1: ( ( rule__Block__Alternatives ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:242:1: ( ( rule__Block__Alternatives ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:243:1: ( rule__Block__Alternatives )
            {
             before(grammarAccess.getBlockAccess().getAlternatives()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:244:1: ( rule__Block__Alternatives )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:244:2: rule__Block__Alternatives
            {
            pushFollow(FOLLOW_rule__Block__Alternatives_in_ruleBlock454);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:256:1: entryRuleAnimBlock : ruleAnimBlock EOF ;
    public final void entryRuleAnimBlock() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:257:1: ( ruleAnimBlock EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:258:1: ruleAnimBlock EOF
            {
             before(grammarAccess.getAnimBlockRule()); 
            pushFollow(FOLLOW_ruleAnimBlock_in_entryRuleAnimBlock481);
            ruleAnimBlock();

            state._fsp--;

             after(grammarAccess.getAnimBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnimBlock488); 

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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:265:1: ruleAnimBlock : ( ( rule__AnimBlock__Group__0 ) ) ;
    public final void ruleAnimBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:269:2: ( ( ( rule__AnimBlock__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:270:1: ( ( rule__AnimBlock__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:270:1: ( ( rule__AnimBlock__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:271:1: ( rule__AnimBlock__Group__0 )
            {
             before(grammarAccess.getAnimBlockAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:272:1: ( rule__AnimBlock__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:272:2: rule__AnimBlock__Group__0
            {
            pushFollow(FOLLOW_rule__AnimBlock__Group__0_in_ruleAnimBlock514);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:284:1: entryRuleEventBlock : ruleEventBlock EOF ;
    public final void entryRuleEventBlock() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:285:1: ( ruleEventBlock EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:286:1: ruleEventBlock EOF
            {
             before(grammarAccess.getEventBlockRule()); 
            pushFollow(FOLLOW_ruleEventBlock_in_entryRuleEventBlock541);
            ruleEventBlock();

            state._fsp--;

             after(grammarAccess.getEventBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventBlock548); 

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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:293:1: ruleEventBlock : ( ( rule__EventBlock__Group__0 ) ) ;
    public final void ruleEventBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:297:2: ( ( ( rule__EventBlock__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:298:1: ( ( rule__EventBlock__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:298:1: ( ( rule__EventBlock__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:299:1: ( rule__EventBlock__Group__0 )
            {
             before(grammarAccess.getEventBlockAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:300:1: ( rule__EventBlock__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:300:2: rule__EventBlock__Group__0
            {
            pushFollow(FOLLOW_rule__EventBlock__Group__0_in_ruleEventBlock574);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:312:1: entryRuleObjType : ruleObjType EOF ;
    public final void entryRuleObjType() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:313:1: ( ruleObjType EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:314:1: ruleObjType EOF
            {
             before(grammarAccess.getObjTypeRule()); 
            pushFollow(FOLLOW_ruleObjType_in_entryRuleObjType601);
            ruleObjType();

            state._fsp--;

             after(grammarAccess.getObjTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjType608); 

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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:321:1: ruleObjType : ( ( rule__ObjType__Alternatives ) ) ;
    public final void ruleObjType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:325:2: ( ( ( rule__ObjType__Alternatives ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:326:1: ( ( rule__ObjType__Alternatives ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:326:1: ( ( rule__ObjType__Alternatives ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:327:1: ( rule__ObjType__Alternatives )
            {
             before(grammarAccess.getObjTypeAccess().getAlternatives()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:328:1: ( rule__ObjType__Alternatives )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:328:2: rule__ObjType__Alternatives
            {
            pushFollow(FOLLOW_rule__ObjType__Alternatives_in_ruleObjType634);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:340:1: entryRuleKeystroke : ruleKeystroke EOF ;
    public final void entryRuleKeystroke() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:341:1: ( ruleKeystroke EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:342:1: ruleKeystroke EOF
            {
             before(grammarAccess.getKeystrokeRule()); 
            pushFollow(FOLLOW_ruleKeystroke_in_entryRuleKeystroke661);
            ruleKeystroke();

            state._fsp--;

             after(grammarAccess.getKeystrokeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeystroke668); 

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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:349:1: ruleKeystroke : ( ( rule__Keystroke__Alternatives ) ) ;
    public final void ruleKeystroke() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:353:2: ( ( ( rule__Keystroke__Alternatives ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:354:1: ( ( rule__Keystroke__Alternatives ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:354:1: ( ( rule__Keystroke__Alternatives ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:355:1: ( rule__Keystroke__Alternatives )
            {
             before(grammarAccess.getKeystrokeAccess().getAlternatives()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:356:1: ( rule__Keystroke__Alternatives )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:356:2: rule__Keystroke__Alternatives
            {
            pushFollow(FOLLOW_rule__Keystroke__Alternatives_in_ruleKeystroke694);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:368:1: entryRuleStatementBlock : ruleStatementBlock EOF ;
    public final void entryRuleStatementBlock() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:369:1: ( ruleStatementBlock EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:370:1: ruleStatementBlock EOF
            {
             before(grammarAccess.getStatementBlockRule()); 
            pushFollow(FOLLOW_ruleStatementBlock_in_entryRuleStatementBlock721);
            ruleStatementBlock();

            state._fsp--;

             after(grammarAccess.getStatementBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatementBlock728); 

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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:377:1: ruleStatementBlock : ( ( rule__StatementBlock__Group__0 ) ) ;
    public final void ruleStatementBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:381:2: ( ( ( rule__StatementBlock__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:382:1: ( ( rule__StatementBlock__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:382:1: ( ( rule__StatementBlock__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:383:1: ( rule__StatementBlock__Group__0 )
            {
             before(grammarAccess.getStatementBlockAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:384:1: ( rule__StatementBlock__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:384:2: rule__StatementBlock__Group__0
            {
            pushFollow(FOLLOW_rule__StatementBlock__Group__0_in_ruleStatementBlock754);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:396:1: entryRuleStmt : ruleStmt EOF ;
    public final void entryRuleStmt() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:397:1: ( ruleStmt EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:398:1: ruleStmt EOF
            {
             before(grammarAccess.getStmtRule()); 
            pushFollow(FOLLOW_ruleStmt_in_entryRuleStmt781);
            ruleStmt();

            state._fsp--;

             after(grammarAccess.getStmtRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStmt788); 

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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:405:1: ruleStmt : ( ( rule__Stmt__Alternatives ) ) ;
    public final void ruleStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:409:2: ( ( ( rule__Stmt__Alternatives ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:410:1: ( ( rule__Stmt__Alternatives ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:410:1: ( ( rule__Stmt__Alternatives ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:411:1: ( rule__Stmt__Alternatives )
            {
             before(grammarAccess.getStmtAccess().getAlternatives()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:412:1: ( rule__Stmt__Alternatives )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:412:2: rule__Stmt__Alternatives
            {
            pushFollow(FOLLOW_rule__Stmt__Alternatives_in_ruleStmt814);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:424:1: entryRuleForStmt : ruleForStmt EOF ;
    public final void entryRuleForStmt() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:425:1: ( ruleForStmt EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:426:1: ruleForStmt EOF
            {
             before(grammarAccess.getForStmtRule()); 
            pushFollow(FOLLOW_ruleForStmt_in_entryRuleForStmt841);
            ruleForStmt();

            state._fsp--;

             after(grammarAccess.getForStmtRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForStmt848); 

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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:433:1: ruleForStmt : ( ( rule__ForStmt__Group__0 ) ) ;
    public final void ruleForStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:437:2: ( ( ( rule__ForStmt__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:438:1: ( ( rule__ForStmt__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:438:1: ( ( rule__ForStmt__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:439:1: ( rule__ForStmt__Group__0 )
            {
             before(grammarAccess.getForStmtAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:440:1: ( rule__ForStmt__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:440:2: rule__ForStmt__Group__0
            {
            pushFollow(FOLLOW_rule__ForStmt__Group__0_in_ruleForStmt874);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:452:1: entryRuleIfStmt : ruleIfStmt EOF ;
    public final void entryRuleIfStmt() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:453:1: ( ruleIfStmt EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:454:1: ruleIfStmt EOF
            {
             before(grammarAccess.getIfStmtRule()); 
            pushFollow(FOLLOW_ruleIfStmt_in_entryRuleIfStmt901);
            ruleIfStmt();

            state._fsp--;

             after(grammarAccess.getIfStmtRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfStmt908); 

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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:461:1: ruleIfStmt : ( ( rule__IfStmt__Group__0 ) ) ;
    public final void ruleIfStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:465:2: ( ( ( rule__IfStmt__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:466:1: ( ( rule__IfStmt__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:466:1: ( ( rule__IfStmt__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:467:1: ( rule__IfStmt__Group__0 )
            {
             before(grammarAccess.getIfStmtAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:468:1: ( rule__IfStmt__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:468:2: rule__IfStmt__Group__0
            {
            pushFollow(FOLLOW_rule__IfStmt__Group__0_in_ruleIfStmt934);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:480:1: entryRuleElseStmt : ruleElseStmt EOF ;
    public final void entryRuleElseStmt() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:481:1: ( ruleElseStmt EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:482:1: ruleElseStmt EOF
            {
             before(grammarAccess.getElseStmtRule()); 
            pushFollow(FOLLOW_ruleElseStmt_in_entryRuleElseStmt961);
            ruleElseStmt();

            state._fsp--;

             after(grammarAccess.getElseStmtRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElseStmt968); 

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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:489:1: ruleElseStmt : ( ( rule__ElseStmt__Group__0 ) ) ;
    public final void ruleElseStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:493:2: ( ( ( rule__ElseStmt__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:494:1: ( ( rule__ElseStmt__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:494:1: ( ( rule__ElseStmt__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:495:1: ( rule__ElseStmt__Group__0 )
            {
             before(grammarAccess.getElseStmtAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:496:1: ( rule__ElseStmt__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:496:2: rule__ElseStmt__Group__0
            {
            pushFollow(FOLLOW_rule__ElseStmt__Group__0_in_ruleElseStmt994);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:508:1: entryRuleAssStmt : ruleAssStmt EOF ;
    public final void entryRuleAssStmt() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:509:1: ( ruleAssStmt EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:510:1: ruleAssStmt EOF
            {
             before(grammarAccess.getAssStmtRule()); 
            pushFollow(FOLLOW_ruleAssStmt_in_entryRuleAssStmt1021);
            ruleAssStmt();

            state._fsp--;

             after(grammarAccess.getAssStmtRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssStmt1028); 

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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:517:1: ruleAssStmt : ( ( rule__AssStmt__Group__0 ) ) ;
    public final void ruleAssStmt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:521:2: ( ( ( rule__AssStmt__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:522:1: ( ( rule__AssStmt__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:522:1: ( ( rule__AssStmt__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:523:1: ( rule__AssStmt__Group__0 )
            {
             before(grammarAccess.getAssStmtAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:524:1: ( rule__AssStmt__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:524:2: rule__AssStmt__Group__0
            {
            pushFollow(FOLLOW_rule__AssStmt__Group__0_in_ruleAssStmt1054);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:536:1: entryRuleAssStmt2 : ruleAssStmt2 EOF ;
    public final void entryRuleAssStmt2() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:537:1: ( ruleAssStmt2 EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:538:1: ruleAssStmt2 EOF
            {
             before(grammarAccess.getAssStmt2Rule()); 
            pushFollow(FOLLOW_ruleAssStmt2_in_entryRuleAssStmt21081);
            ruleAssStmt2();

            state._fsp--;

             after(grammarAccess.getAssStmt2Rule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssStmt21088); 

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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:545:1: ruleAssStmt2 : ( ( rule__AssStmt2__Group__0 ) ) ;
    public final void ruleAssStmt2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:549:2: ( ( ( rule__AssStmt2__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:550:1: ( ( rule__AssStmt2__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:550:1: ( ( rule__AssStmt2__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:551:1: ( rule__AssStmt2__Group__0 )
            {
             before(grammarAccess.getAssStmt2Access().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:552:1: ( rule__AssStmt2__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:552:2: rule__AssStmt2__Group__0
            {
            pushFollow(FOLLOW_rule__AssStmt2__Group__0_in_ruleAssStmt21114);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:564:1: entryRuleAttrList : ruleAttrList EOF ;
    public final void entryRuleAttrList() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:565:1: ( ruleAttrList EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:566:1: ruleAttrList EOF
            {
             before(grammarAccess.getAttrListRule()); 
            pushFollow(FOLLOW_ruleAttrList_in_entryRuleAttrList1141);
            ruleAttrList();

            state._fsp--;

             after(grammarAccess.getAttrListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrList1148); 

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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:573:1: ruleAttrList : ( ( rule__AttrList__Group__0 ) ) ;
    public final void ruleAttrList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:577:2: ( ( ( rule__AttrList__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:578:1: ( ( rule__AttrList__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:578:1: ( ( rule__AttrList__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:579:1: ( rule__AttrList__Group__0 )
            {
             before(grammarAccess.getAttrListAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:580:1: ( rule__AttrList__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:580:2: rule__AttrList__Group__0
            {
            pushFollow(FOLLOW_rule__AttrList__Group__0_in_ruleAttrList1174);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:592:1: entryRuleAttrAss : ruleAttrAss EOF ;
    public final void entryRuleAttrAss() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:593:1: ( ruleAttrAss EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:594:1: ruleAttrAss EOF
            {
             before(grammarAccess.getAttrAssRule()); 
            pushFollow(FOLLOW_ruleAttrAss_in_entryRuleAttrAss1201);
            ruleAttrAss();

            state._fsp--;

             after(grammarAccess.getAttrAssRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrAss1208); 

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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:601:1: ruleAttrAss : ( ( rule__AttrAss__Group__0 ) ) ;
    public final void ruleAttrAss() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:605:2: ( ( ( rule__AttrAss__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:606:1: ( ( rule__AttrAss__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:606:1: ( ( rule__AttrAss__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:607:1: ( rule__AttrAss__Group__0 )
            {
             before(grammarAccess.getAttrAssAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:608:1: ( rule__AttrAss__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:608:2: rule__AttrAss__Group__0
            {
            pushFollow(FOLLOW_rule__AttrAss__Group__0_in_ruleAttrAss1234);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:620:1: entryRuleExpr : ruleExpr EOF ;
    public final void entryRuleExpr() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:621:1: ( ruleExpr EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:622:1: ruleExpr EOF
            {
             before(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr1261);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr1268); 

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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:629:1: ruleExpr : ( ruleDisj ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:633:2: ( ( ruleDisj ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:634:1: ( ruleDisj )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:634:1: ( ruleDisj )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:635:1: ruleDisj
            {
             before(grammarAccess.getExprAccess().getDisjParserRuleCall()); 
            pushFollow(FOLLOW_ruleDisj_in_ruleExpr1294);
            ruleDisj();

            state._fsp--;

             after(grammarAccess.getExprAccess().getDisjParserRuleCall()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleDisj"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:648:1: entryRuleDisj : ruleDisj EOF ;
    public final void entryRuleDisj() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:649:1: ( ruleDisj EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:650:1: ruleDisj EOF
            {
             before(grammarAccess.getDisjRule()); 
            pushFollow(FOLLOW_ruleDisj_in_entryRuleDisj1320);
            ruleDisj();

            state._fsp--;

             after(grammarAccess.getDisjRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisj1327); 

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
    // $ANTLR end "entryRuleDisj"


    // $ANTLR start "ruleDisj"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:657:1: ruleDisj : ( ( rule__Disj__Group__0 ) ) ;
    public final void ruleDisj() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:661:2: ( ( ( rule__Disj__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:662:1: ( ( rule__Disj__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:662:1: ( ( rule__Disj__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:663:1: ( rule__Disj__Group__0 )
            {
             before(grammarAccess.getDisjAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:664:1: ( rule__Disj__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:664:2: rule__Disj__Group__0
            {
            pushFollow(FOLLOW_rule__Disj__Group__0_in_ruleDisj1353);
            rule__Disj__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDisjAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDisj"


    // $ANTLR start "entryRuleConj"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:676:1: entryRuleConj : ruleConj EOF ;
    public final void entryRuleConj() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:677:1: ( ruleConj EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:678:1: ruleConj EOF
            {
             before(grammarAccess.getConjRule()); 
            pushFollow(FOLLOW_ruleConj_in_entryRuleConj1380);
            ruleConj();

            state._fsp--;

             after(grammarAccess.getConjRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConj1387); 

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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:685:1: ruleConj : ( ( rule__Conj__Group__0 ) ) ;
    public final void ruleConj() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:689:2: ( ( ( rule__Conj__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:690:1: ( ( rule__Conj__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:690:1: ( ( rule__Conj__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:691:1: ( rule__Conj__Group__0 )
            {
             before(grammarAccess.getConjAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:692:1: ( rule__Conj__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:692:2: rule__Conj__Group__0
            {
            pushFollow(FOLLOW_rule__Conj__Group__0_in_ruleConj1413);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:704:1: entryRuleRelat : ruleRelat EOF ;
    public final void entryRuleRelat() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:705:1: ( ruleRelat EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:706:1: ruleRelat EOF
            {
             before(grammarAccess.getRelatRule()); 
            pushFollow(FOLLOW_ruleRelat_in_entryRuleRelat1440);
            ruleRelat();

            state._fsp--;

             after(grammarAccess.getRelatRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelat1447); 

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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:713:1: ruleRelat : ( ( rule__Relat__Group__0 ) ) ;
    public final void ruleRelat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:717:2: ( ( ( rule__Relat__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:718:1: ( ( rule__Relat__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:718:1: ( ( rule__Relat__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:719:1: ( rule__Relat__Group__0 )
            {
             before(grammarAccess.getRelatAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:720:1: ( rule__Relat__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:720:2: rule__Relat__Group__0
            {
            pushFollow(FOLLOW_rule__Relat__Group__0_in_ruleRelat1473);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:732:1: entryRuleAdd : ruleAdd EOF ;
    public final void entryRuleAdd() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:733:1: ( ruleAdd EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:734:1: ruleAdd EOF
            {
             before(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_ruleAdd_in_entryRuleAdd1500);
            ruleAdd();

            state._fsp--;

             after(grammarAccess.getAddRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdd1507); 

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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:741:1: ruleAdd : ( ( rule__Add__Group__0 ) ) ;
    public final void ruleAdd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:745:2: ( ( ( rule__Add__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:746:1: ( ( rule__Add__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:746:1: ( ( rule__Add__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:747:1: ( rule__Add__Group__0 )
            {
             before(grammarAccess.getAddAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:748:1: ( rule__Add__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:748:2: rule__Add__Group__0
            {
            pushFollow(FOLLOW_rule__Add__Group__0_in_ruleAdd1533);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:760:1: entryRuleMult : ruleMult EOF ;
    public final void entryRuleMult() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:761:1: ( ruleMult EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:762:1: ruleMult EOF
            {
             before(grammarAccess.getMultRule()); 
            pushFollow(FOLLOW_ruleMult_in_entryRuleMult1560);
            ruleMult();

            state._fsp--;

             after(grammarAccess.getMultRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMult1567); 

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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:769:1: ruleMult : ( ( rule__Mult__Group__0 ) ) ;
    public final void ruleMult() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:773:2: ( ( ( rule__Mult__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:774:1: ( ( rule__Mult__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:774:1: ( ( rule__Mult__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:775:1: ( rule__Mult__Group__0 )
            {
             before(grammarAccess.getMultAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:776:1: ( rule__Mult__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:776:2: rule__Mult__Group__0
            {
            pushFollow(FOLLOW_rule__Mult__Group__0_in_ruleMult1593);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:788:1: entryRuleUnary : ruleUnary EOF ;
    public final void entryRuleUnary() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:789:1: ( ruleUnary EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:790:1: ruleUnary EOF
            {
             before(grammarAccess.getUnaryRule()); 
            pushFollow(FOLLOW_ruleUnary_in_entryRuleUnary1620);
            ruleUnary();

            state._fsp--;

             after(grammarAccess.getUnaryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnary1627); 

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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:797:1: ruleUnary : ( ( rule__Unary__Group__0 ) ) ;
    public final void ruleUnary() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:801:2: ( ( ( rule__Unary__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:802:1: ( ( rule__Unary__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:802:1: ( ( rule__Unary__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:803:1: ( rule__Unary__Group__0 )
            {
             before(grammarAccess.getUnaryAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:804:1: ( rule__Unary__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:804:2: rule__Unary__Group__0
            {
            pushFollow(FOLLOW_rule__Unary__Group__0_in_ruleUnary1653);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:816:1: entryRuleAtom : ruleAtom EOF ;
    public final void entryRuleAtom() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:817:1: ( ruleAtom EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:818:1: ruleAtom EOF
            {
             before(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_ruleAtom_in_entryRuleAtom1680);
            ruleAtom();

            state._fsp--;

             after(grammarAccess.getAtomRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtom1687); 

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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:825:1: ruleAtom : ( ( rule__Atom__Group__0 ) ) ;
    public final void ruleAtom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:829:2: ( ( ( rule__Atom__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:830:1: ( ( rule__Atom__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:830:1: ( ( rule__Atom__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:831:1: ( rule__Atom__Group__0 )
            {
             before(grammarAccess.getAtomAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:832:1: ( rule__Atom__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:832:2: rule__Atom__Group__0
            {
            pushFollow(FOLLOW_rule__Atom__Group__0_in_ruleAtom1713);
            rule__Atom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getGroup()); 

            }


            }

        }
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:844:1: entryRuleVar : ruleVar EOF ;
    public final void entryRuleVar() throws RecognitionException {
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:845:1: ( ruleVar EOF )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:846:1: ruleVar EOF
            {
             before(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_ruleVar_in_entryRuleVar1740);
            ruleVar();

            state._fsp--;

             after(grammarAccess.getVarRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar1747); 

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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:853:1: ruleVar : ( ( rule__Var__Group__0 ) ) ;
    public final void ruleVar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:857:2: ( ( ( rule__Var__Group__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:858:1: ( ( rule__Var__Group__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:858:1: ( ( rule__Var__Group__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:859:1: ( rule__Var__Group__0 )
            {
             before(grammarAccess.getVarAccess().getGroup()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:860:1: ( rule__Var__Group__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:860:2: rule__Var__Group__0
            {
            pushFollow(FOLLOW_rule__Var__Group__0_in_ruleVar1773);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:872:1: rule__Declaration__Alternatives_0 : ( ( ( rule__Declaration__VarAssignment_0_0 ) ) | ( ( rule__Declaration__ObjAssignment_0_1 ) ) );
    public final void rule__Declaration__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:876:1: ( ( ( rule__Declaration__VarAssignment_0_0 ) ) | ( ( rule__Declaration__ObjAssignment_0_1 ) ) )
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
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:877:1: ( ( rule__Declaration__VarAssignment_0_0 ) )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:877:1: ( ( rule__Declaration__VarAssignment_0_0 ) )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:878:1: ( rule__Declaration__VarAssignment_0_0 )
                    {
                     before(grammarAccess.getDeclarationAccess().getVarAssignment_0_0()); 
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:879:1: ( rule__Declaration__VarAssignment_0_0 )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:879:2: rule__Declaration__VarAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__Declaration__VarAssignment_0_0_in_rule__Declaration__Alternatives_01809);
                    rule__Declaration__VarAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclarationAccess().getVarAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:883:6: ( ( rule__Declaration__ObjAssignment_0_1 ) )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:883:6: ( ( rule__Declaration__ObjAssignment_0_1 ) )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:884:1: ( rule__Declaration__ObjAssignment_0_1 )
                    {
                     before(grammarAccess.getDeclarationAccess().getObjAssignment_0_1()); 
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:885:1: ( rule__Declaration__ObjAssignment_0_1 )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:885:2: rule__Declaration__ObjAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__Declaration__ObjAssignment_0_1_in_rule__Declaration__Alternatives_01827);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:894:1: rule__VarDecl__Alternatives_2 : ( ( ( rule__VarDecl__ExprAssignment_2_0 )? ) | ( ( rule__VarDecl__Group_2_1__0 ) ) );
    public final void rule__VarDecl__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:898:1: ( ( ( rule__VarDecl__ExprAssignment_2_0 )? ) | ( ( rule__VarDecl__Group_2_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EOF||LA3_0==30||LA3_0==34) ) {
                alt3=1;
            }
            else if ( (LA3_0==32) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:899:1: ( ( rule__VarDecl__ExprAssignment_2_0 )? )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:899:1: ( ( rule__VarDecl__ExprAssignment_2_0 )? )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:900:1: ( rule__VarDecl__ExprAssignment_2_0 )?
                    {
                     before(grammarAccess.getVarDeclAccess().getExprAssignment_2_0()); 
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:901:1: ( rule__VarDecl__ExprAssignment_2_0 )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==34) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:901:2: rule__VarDecl__ExprAssignment_2_0
                            {
                            pushFollow(FOLLOW_rule__VarDecl__ExprAssignment_2_0_in_rule__VarDecl__Alternatives_21860);
                            rule__VarDecl__ExprAssignment_2_0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getVarDeclAccess().getExprAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:905:6: ( ( rule__VarDecl__Group_2_1__0 ) )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:905:6: ( ( rule__VarDecl__Group_2_1__0 ) )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:906:1: ( rule__VarDecl__Group_2_1__0 )
                    {
                     before(grammarAccess.getVarDeclAccess().getGroup_2_1()); 
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:907:1: ( rule__VarDecl__Group_2_1__0 )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:907:2: rule__VarDecl__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__VarDecl__Group_2_1__0_in_rule__VarDecl__Alternatives_21879);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:916:1: rule__ObjDecl__Alternatives_2 : ( ( ( rule__ObjDecl__Group_2_0__0 ) ) | ( ( rule__ObjDecl__Group_2_1__0 ) ) );
    public final void rule__ObjDecl__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:920:1: ( ( ( rule__ObjDecl__Group_2_0__0 ) ) | ( ( rule__ObjDecl__Group_2_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==28) ) {
                alt4=1;
            }
            else if ( (LA4_0==32) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:921:1: ( ( rule__ObjDecl__Group_2_0__0 ) )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:921:1: ( ( rule__ObjDecl__Group_2_0__0 ) )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:922:1: ( rule__ObjDecl__Group_2_0__0 )
                    {
                     before(grammarAccess.getObjDeclAccess().getGroup_2_0()); 
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:923:1: ( rule__ObjDecl__Group_2_0__0 )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:923:2: rule__ObjDecl__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__ObjDecl__Group_2_0__0_in_rule__ObjDecl__Alternatives_21912);
                    rule__ObjDecl__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjDeclAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:927:6: ( ( rule__ObjDecl__Group_2_1__0 ) )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:927:6: ( ( rule__ObjDecl__Group_2_1__0 ) )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:928:1: ( rule__ObjDecl__Group_2_1__0 )
                    {
                     before(grammarAccess.getObjDeclAccess().getGroup_2_1()); 
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:929:1: ( rule__ObjDecl__Group_2_1__0 )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:929:2: rule__ObjDecl__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__ObjDecl__Group_2_1__0_in_rule__ObjDecl__Alternatives_21930);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:938:1: rule__Block__Alternatives : ( ( ruleAnimBlock ) | ( ruleEventBlock ) );
    public final void rule__Block__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:942:1: ( ( ruleAnimBlock ) | ( ruleEventBlock ) )
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
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:943:1: ( ruleAnimBlock )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:943:1: ( ruleAnimBlock )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:944:1: ruleAnimBlock
                    {
                     before(grammarAccess.getBlockAccess().getAnimBlockParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAnimBlock_in_rule__Block__Alternatives1963);
                    ruleAnimBlock();

                    state._fsp--;

                     after(grammarAccess.getBlockAccess().getAnimBlockParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:949:6: ( ruleEventBlock )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:949:6: ( ruleEventBlock )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:950:1: ruleEventBlock
                    {
                     before(grammarAccess.getBlockAccess().getEventBlockParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEventBlock_in_rule__Block__Alternatives1980);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:960:1: rule__ObjType__Alternatives : ( ( 'rectangle' ) | ( 'triangle' ) | ( 'circle' ) );
    public final void rule__ObjType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:964:1: ( ( 'rectangle' ) | ( 'triangle' ) | ( 'circle' ) )
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
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:965:1: ( 'rectangle' )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:965:1: ( 'rectangle' )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:966:1: 'rectangle'
                    {
                     before(grammarAccess.getObjTypeAccess().getRectangleKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__ObjType__Alternatives2013); 
                     after(grammarAccess.getObjTypeAccess().getRectangleKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:973:6: ( 'triangle' )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:973:6: ( 'triangle' )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:974:1: 'triangle'
                    {
                     before(grammarAccess.getObjTypeAccess().getTriangleKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__ObjType__Alternatives2033); 
                     after(grammarAccess.getObjTypeAccess().getTriangleKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:981:6: ( 'circle' )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:981:6: ( 'circle' )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:982:1: 'circle'
                    {
                     before(grammarAccess.getObjTypeAccess().getCircleKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__ObjType__Alternatives2053); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:994:1: rule__Keystroke__Alternatives : ( ( 'space' ) | ( 'leftarrow' ) | ( 'rightarrow' ) | ( 'uparrow' ) | ( 'downarrow' ) );
    public final void rule__Keystroke__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:998:1: ( ( 'space' ) | ( 'leftarrow' ) | ( 'rightarrow' ) | ( 'uparrow' ) | ( 'downarrow' ) )
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
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:999:1: ( 'space' )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:999:1: ( 'space' )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1000:1: 'space'
                    {
                     before(grammarAccess.getKeystrokeAccess().getSpaceKeyword_0()); 
                    match(input,14,FOLLOW_14_in_rule__Keystroke__Alternatives2088); 
                     after(grammarAccess.getKeystrokeAccess().getSpaceKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1007:6: ( 'leftarrow' )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1007:6: ( 'leftarrow' )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1008:1: 'leftarrow'
                    {
                     before(grammarAccess.getKeystrokeAccess().getLeftarrowKeyword_1()); 
                    match(input,15,FOLLOW_15_in_rule__Keystroke__Alternatives2108); 
                     after(grammarAccess.getKeystrokeAccess().getLeftarrowKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1015:6: ( 'rightarrow' )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1015:6: ( 'rightarrow' )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1016:1: 'rightarrow'
                    {
                     before(grammarAccess.getKeystrokeAccess().getRightarrowKeyword_2()); 
                    match(input,16,FOLLOW_16_in_rule__Keystroke__Alternatives2128); 
                     after(grammarAccess.getKeystrokeAccess().getRightarrowKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1023:6: ( 'uparrow' )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1023:6: ( 'uparrow' )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1024:1: 'uparrow'
                    {
                     before(grammarAccess.getKeystrokeAccess().getUparrowKeyword_3()); 
                    match(input,17,FOLLOW_17_in_rule__Keystroke__Alternatives2148); 
                     after(grammarAccess.getKeystrokeAccess().getUparrowKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1031:6: ( 'downarrow' )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1031:6: ( 'downarrow' )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1032:1: 'downarrow'
                    {
                     before(grammarAccess.getKeystrokeAccess().getDownarrowKeyword_4()); 
                    match(input,18,FOLLOW_18_in_rule__Keystroke__Alternatives2168); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1044:1: rule__Stmt__Alternatives : ( ( ruleIfStmt ) | ( ruleForStmt ) | ( ruleAssStmt ) );
    public final void rule__Stmt__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1048:1: ( ( ruleIfStmt ) | ( ruleForStmt ) | ( ruleAssStmt ) )
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
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1049:1: ( ruleIfStmt )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1049:1: ( ruleIfStmt )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1050:1: ruleIfStmt
                    {
                     before(grammarAccess.getStmtAccess().getIfStmtParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIfStmt_in_rule__Stmt__Alternatives2202);
                    ruleIfStmt();

                    state._fsp--;

                     after(grammarAccess.getStmtAccess().getIfStmtParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1055:6: ( ruleForStmt )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1055:6: ( ruleForStmt )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1056:1: ruleForStmt
                    {
                     before(grammarAccess.getStmtAccess().getForStmtParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleForStmt_in_rule__Stmt__Alternatives2219);
                    ruleForStmt();

                    state._fsp--;

                     after(grammarAccess.getStmtAccess().getForStmtParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1061:6: ( ruleAssStmt )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1061:6: ( ruleAssStmt )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1062:1: ruleAssStmt
                    {
                     before(grammarAccess.getStmtAccess().getAssStmtParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAssStmt_in_rule__Stmt__Alternatives2236);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1072:1: rule__Relat__Alternatives_1_0 : ( ( '==' ) | ( '<' ) | ( '<=' ) );
    public final void rule__Relat__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1076:1: ( ( '==' ) | ( '<' ) | ( '<=' ) )
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
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1077:1: ( '==' )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1077:1: ( '==' )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1078:1: '=='
                    {
                     before(grammarAccess.getRelatAccess().getEqualsSignEqualsSignKeyword_1_0_0()); 
                    match(input,19,FOLLOW_19_in_rule__Relat__Alternatives_1_02269); 
                     after(grammarAccess.getRelatAccess().getEqualsSignEqualsSignKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1085:6: ( '<' )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1085:6: ( '<' )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1086:1: '<'
                    {
                     before(grammarAccess.getRelatAccess().getLessThanSignKeyword_1_0_1()); 
                    match(input,20,FOLLOW_20_in_rule__Relat__Alternatives_1_02289); 
                     after(grammarAccess.getRelatAccess().getLessThanSignKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1093:6: ( '<=' )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1093:6: ( '<=' )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1094:1: '<='
                    {
                     before(grammarAccess.getRelatAccess().getLessThanSignEqualsSignKeyword_1_0_2()); 
                    match(input,21,FOLLOW_21_in_rule__Relat__Alternatives_1_02309); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1106:1: rule__Add__Alternatives_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__Add__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1110:1: ( ( '+' ) | ( '-' ) )
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
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1111:1: ( '+' )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1111:1: ( '+' )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1112:1: '+'
                    {
                     before(grammarAccess.getAddAccess().getPlusSignKeyword_1_0_0()); 
                    match(input,22,FOLLOW_22_in_rule__Add__Alternatives_1_02344); 
                     after(grammarAccess.getAddAccess().getPlusSignKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1119:6: ( '-' )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1119:6: ( '-' )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1120:1: '-'
                    {
                     before(grammarAccess.getAddAccess().getHyphenMinusKeyword_1_0_1()); 
                    match(input,23,FOLLOW_23_in_rule__Add__Alternatives_1_02364); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1132:1: rule__Mult__Alternatives_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__Mult__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1136:1: ( ( '*' ) | ( '/' ) )
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
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1137:1: ( '*' )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1137:1: ( '*' )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1138:1: '*'
                    {
                     before(grammarAccess.getMultAccess().getAsteriskKeyword_1_0_0()); 
                    match(input,24,FOLLOW_24_in_rule__Mult__Alternatives_1_02399); 
                     after(grammarAccess.getMultAccess().getAsteriskKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1145:6: ( '/' )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1145:6: ( '/' )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1146:1: '/'
                    {
                     before(grammarAccess.getMultAccess().getSolidusKeyword_1_0_1()); 
                    match(input,25,FOLLOW_25_in_rule__Mult__Alternatives_1_02419); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1158:1: rule__Unary__Alternatives_0 : ( ( '!' ) | ( '-' ) );
    public final void rule__Unary__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1162:1: ( ( '!' ) | ( '-' ) )
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
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1163:1: ( '!' )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1163:1: ( '!' )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1164:1: '!'
                    {
                     before(grammarAccess.getUnaryAccess().getExclamationMarkKeyword_0_0()); 
                    match(input,26,FOLLOW_26_in_rule__Unary__Alternatives_02454); 
                     after(grammarAccess.getUnaryAccess().getExclamationMarkKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1171:6: ( '-' )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1171:6: ( '-' )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1172:1: '-'
                    {
                     before(grammarAccess.getUnaryAccess().getHyphenMinusKeyword_0_1()); 
                    match(input,23,FOLLOW_23_in_rule__Unary__Alternatives_02474); 
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


    // $ANTLR start "rule__Atom__Alternatives_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1184:1: rule__Atom__Alternatives_1 : ( ( ( rule__Atom__IntAssignment_1_0 ) ) | ( ( rule__Atom__Group_1_1__0 ) ) | ( ( rule__Atom__Group_1_2__0 ) ) );
    public final void rule__Atom__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1188:1: ( ( ( rule__Atom__IntAssignment_1_0 ) ) | ( ( rule__Atom__Group_1_1__0 ) ) | ( ( rule__Atom__Group_1_2__0 ) ) )
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
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1189:1: ( ( rule__Atom__IntAssignment_1_0 ) )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1189:1: ( ( rule__Atom__IntAssignment_1_0 ) )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1190:1: ( rule__Atom__IntAssignment_1_0 )
                    {
                     before(grammarAccess.getAtomAccess().getIntAssignment_1_0()); 
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1191:1: ( rule__Atom__IntAssignment_1_0 )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1191:2: rule__Atom__IntAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Atom__IntAssignment_1_0_in_rule__Atom__Alternatives_12508);
                    rule__Atom__IntAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomAccess().getIntAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1195:6: ( ( rule__Atom__Group_1_1__0 ) )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1195:6: ( ( rule__Atom__Group_1_1__0 ) )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1196:1: ( rule__Atom__Group_1_1__0 )
                    {
                     before(grammarAccess.getAtomAccess().getGroup_1_1()); 
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1197:1: ( rule__Atom__Group_1_1__0 )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1197:2: rule__Atom__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Atom__Group_1_1__0_in_rule__Atom__Alternatives_12526);
                    rule__Atom__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1201:6: ( ( rule__Atom__Group_1_2__0 ) )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1201:6: ( ( rule__Atom__Group_1_2__0 ) )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1202:1: ( rule__Atom__Group_1_2__0 )
                    {
                     before(grammarAccess.getAtomAccess().getGroup_1_2()); 
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1203:1: ( rule__Atom__Group_1_2__0 )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1203:2: rule__Atom__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__Atom__Group_1_2__0_in_rule__Atom__Alternatives_12544);
                    rule__Atom__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomAccess().getGroup_1_2()); 

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
    // $ANTLR end "rule__Atom__Alternatives_1"


    // $ANTLR start "rule__Var__Alternatives_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1212:1: rule__Var__Alternatives_1 : ( ( ( rule__Var__Group_1_0__0 ) ) | ( ( rule__Var__Group_1_1__0 ) ) );
    public final void rule__Var__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1216:1: ( ( ( rule__Var__Group_1_0__0 ) ) | ( ( rule__Var__Group_1_1__0 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
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
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1217:1: ( ( rule__Var__Group_1_0__0 ) )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1217:1: ( ( rule__Var__Group_1_0__0 ) )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1218:1: ( rule__Var__Group_1_0__0 )
                    {
                     before(grammarAccess.getVarAccess().getGroup_1_0()); 
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1219:1: ( rule__Var__Group_1_0__0 )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1219:2: rule__Var__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Var__Group_1_0__0_in_rule__Var__Alternatives_12577);
                    rule__Var__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVarAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1223:6: ( ( rule__Var__Group_1_1__0 ) )
                    {
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1223:6: ( ( rule__Var__Group_1_1__0 ) )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1224:1: ( rule__Var__Group_1_1__0 )
                    {
                     before(grammarAccess.getVarAccess().getGroup_1_1()); 
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1225:1: ( rule__Var__Group_1_1__0 )
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1225:2: rule__Var__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Var__Group_1_1__0_in_rule__Var__Alternatives_12595);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1236:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1240:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1241:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02626);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02629);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1248:1: rule__Model__Group__0__Impl : ( ( rule__Model__GameAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1252:1: ( ( ( rule__Model__GameAssignment_0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1253:1: ( ( rule__Model__GameAssignment_0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1253:1: ( ( rule__Model__GameAssignment_0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1254:1: ( rule__Model__GameAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getGameAssignment_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1255:1: ( rule__Model__GameAssignment_0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1255:2: rule__Model__GameAssignment_0
            {
            pushFollow(FOLLOW_rule__Model__GameAssignment_0_in_rule__Model__Group__0__Impl2656);
            rule__Model__GameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGameAssignment_0()); 

            }


            }

        }
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1265:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1269:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1270:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12686);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12689);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1277:1: rule__Model__Group__1__Impl : ( ( rule__Model__DeclAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1281:1: ( ( ( rule__Model__DeclAssignment_1 )* ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1282:1: ( ( rule__Model__DeclAssignment_1 )* )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1282:1: ( ( rule__Model__DeclAssignment_1 )* )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1283:1: ( rule__Model__DeclAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getDeclAssignment_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1284:1: ( rule__Model__DeclAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=11 && LA15_0<=13)||LA15_0==31) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1284:2: rule__Model__DeclAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__DeclAssignment_1_in_rule__Model__Group__1__Impl2716);
            	    rule__Model__DeclAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDeclAssignment_1()); 

            }


            }

        }
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1294:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1298:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1299:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22747);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22750);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1306:1: rule__Model__Group__2__Impl : ( ( rule__Model__StmtAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1310:1: ( ( ( rule__Model__StmtAssignment_2 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1311:1: ( ( rule__Model__StmtAssignment_2 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1311:1: ( ( rule__Model__StmtAssignment_2 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1312:1: ( rule__Model__StmtAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getStmtAssignment_2()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1313:1: ( rule__Model__StmtAssignment_2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1313:2: rule__Model__StmtAssignment_2
            {
            pushFollow(FOLLOW_rule__Model__StmtAssignment_2_in_rule__Model__Group__2__Impl2777);
            rule__Model__StmtAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getStmtAssignment_2()); 

            }


            }

        }
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1323:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1327:1: ( rule__Model__Group__3__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1328:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32807);
            rule__Model__Group__3__Impl();

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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1334:1: rule__Model__Group__3__Impl : ( ( rule__Model__BlocksAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1338:1: ( ( ( rule__Model__BlocksAssignment_3 )* ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1339:1: ( ( rule__Model__BlocksAssignment_3 )* )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1339:1: ( ( rule__Model__BlocksAssignment_3 )* )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1340:1: ( rule__Model__BlocksAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getBlocksAssignment_3()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1341:1: ( rule__Model__BlocksAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=35 && LA16_0<=36)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1341:2: rule__Model__BlocksAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__BlocksAssignment_3_in_rule__Model__Group__3__Impl2834);
            	    rule__Model__BlocksAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getBlocksAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Game__Group__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1359:1: rule__Game__Group__0 : rule__Game__Group__0__Impl rule__Game__Group__1 ;
    public final void rule__Game__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1363:1: ( rule__Game__Group__0__Impl rule__Game__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1364:2: rule__Game__Group__0__Impl rule__Game__Group__1
            {
            pushFollow(FOLLOW_rule__Game__Group__0__Impl_in_rule__Game__Group__02873);
            rule__Game__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Game__Group__1_in_rule__Game__Group__02876);
            rule__Game__Group__1();

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
    // $ANTLR end "rule__Game__Group__0"


    // $ANTLR start "rule__Game__Group__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1371:1: rule__Game__Group__0__Impl : ( 'game' ) ;
    public final void rule__Game__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1375:1: ( ( 'game' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1376:1: ( 'game' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1376:1: ( 'game' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1377:1: 'game'
            {
             before(grammarAccess.getGameAccess().getGameKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Game__Group__0__Impl2904); 
             after(grammarAccess.getGameAccess().getGameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__0__Impl"


    // $ANTLR start "rule__Game__Group__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1390:1: rule__Game__Group__1 : rule__Game__Group__1__Impl rule__Game__Group__2 ;
    public final void rule__Game__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1394:1: ( rule__Game__Group__1__Impl rule__Game__Group__2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1395:2: rule__Game__Group__1__Impl rule__Game__Group__2
            {
            pushFollow(FOLLOW_rule__Game__Group__1__Impl_in_rule__Game__Group__12935);
            rule__Game__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Game__Group__2_in_rule__Game__Group__12938);
            rule__Game__Group__2();

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
    // $ANTLR end "rule__Game__Group__1"


    // $ANTLR start "rule__Game__Group__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1402:1: rule__Game__Group__1__Impl : ( ( rule__Game__NameAssignment_1 ) ) ;
    public final void rule__Game__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1406:1: ( ( ( rule__Game__NameAssignment_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1407:1: ( ( rule__Game__NameAssignment_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1407:1: ( ( rule__Game__NameAssignment_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1408:1: ( rule__Game__NameAssignment_1 )
            {
             before(grammarAccess.getGameAccess().getNameAssignment_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1409:1: ( rule__Game__NameAssignment_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1409:2: rule__Game__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Game__NameAssignment_1_in_rule__Game__Group__1__Impl2965);
            rule__Game__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__1__Impl"


    // $ANTLR start "rule__Game__Group__2"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1419:1: rule__Game__Group__2 : rule__Game__Group__2__Impl rule__Game__Group__3 ;
    public final void rule__Game__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1423:1: ( rule__Game__Group__2__Impl rule__Game__Group__3 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1424:2: rule__Game__Group__2__Impl rule__Game__Group__3
            {
            pushFollow(FOLLOW_rule__Game__Group__2__Impl_in_rule__Game__Group__22995);
            rule__Game__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Game__Group__3_in_rule__Game__Group__22998);
            rule__Game__Group__3();

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
    // $ANTLR end "rule__Game__Group__2"


    // $ANTLR start "rule__Game__Group__2__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1431:1: rule__Game__Group__2__Impl : ( '(' ) ;
    public final void rule__Game__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1435:1: ( ( '(' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1436:1: ( '(' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1436:1: ( '(' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1437:1: '('
            {
             before(grammarAccess.getGameAccess().getLeftParenthesisKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__Game__Group__2__Impl3026); 
             after(grammarAccess.getGameAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__2__Impl"


    // $ANTLR start "rule__Game__Group__3"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1450:1: rule__Game__Group__3 : rule__Game__Group__3__Impl rule__Game__Group__4 ;
    public final void rule__Game__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1454:1: ( rule__Game__Group__3__Impl rule__Game__Group__4 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1455:2: rule__Game__Group__3__Impl rule__Game__Group__4
            {
            pushFollow(FOLLOW_rule__Game__Group__3__Impl_in_rule__Game__Group__33057);
            rule__Game__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Game__Group__4_in_rule__Game__Group__33060);
            rule__Game__Group__4();

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
    // $ANTLR end "rule__Game__Group__3"


    // $ANTLR start "rule__Game__Group__3__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1462:1: rule__Game__Group__3__Impl : ( ( rule__Game__AttrAssignment_3 ) ) ;
    public final void rule__Game__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1466:1: ( ( ( rule__Game__AttrAssignment_3 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1467:1: ( ( rule__Game__AttrAssignment_3 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1467:1: ( ( rule__Game__AttrAssignment_3 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1468:1: ( rule__Game__AttrAssignment_3 )
            {
             before(grammarAccess.getGameAccess().getAttrAssignment_3()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1469:1: ( rule__Game__AttrAssignment_3 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1469:2: rule__Game__AttrAssignment_3
            {
            pushFollow(FOLLOW_rule__Game__AttrAssignment_3_in_rule__Game__Group__3__Impl3087);
            rule__Game__AttrAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGameAccess().getAttrAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__3__Impl"


    // $ANTLR start "rule__Game__Group__4"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1479:1: rule__Game__Group__4 : rule__Game__Group__4__Impl ;
    public final void rule__Game__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1483:1: ( rule__Game__Group__4__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1484:2: rule__Game__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Game__Group__4__Impl_in_rule__Game__Group__43117);
            rule__Game__Group__4__Impl();

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
    // $ANTLR end "rule__Game__Group__4"


    // $ANTLR start "rule__Game__Group__4__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1490:1: rule__Game__Group__4__Impl : ( ')' ) ;
    public final void rule__Game__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1494:1: ( ( ')' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1495:1: ( ')' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1495:1: ( ')' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1496:1: ')'
            {
             before(grammarAccess.getGameAccess().getRightParenthesisKeyword_4()); 
            match(input,29,FOLLOW_29_in_rule__Game__Group__4__Impl3145); 
             after(grammarAccess.getGameAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__Group__4__Impl"


    // $ANTLR start "rule__Declaration__Group__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1519:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1523:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1524:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__03186);
            rule__Declaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__03189);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1531:1: rule__Declaration__Group__0__Impl : ( ( rule__Declaration__Alternatives_0 ) ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1535:1: ( ( ( rule__Declaration__Alternatives_0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1536:1: ( ( rule__Declaration__Alternatives_0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1536:1: ( ( rule__Declaration__Alternatives_0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1537:1: ( rule__Declaration__Alternatives_0 )
            {
             before(grammarAccess.getDeclarationAccess().getAlternatives_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1538:1: ( rule__Declaration__Alternatives_0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1538:2: rule__Declaration__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Declaration__Alternatives_0_in_rule__Declaration__Group__0__Impl3216);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1548:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1552:1: ( rule__Declaration__Group__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1553:2: rule__Declaration__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__13246);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1559:1: rule__Declaration__Group__1__Impl : ( ';' ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1563:1: ( ( ';' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1564:1: ( ';' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1564:1: ( ';' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1565:1: ';'
            {
             before(grammarAccess.getDeclarationAccess().getSemicolonKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__Declaration__Group__1__Impl3274); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1582:1: rule__VarDecl__Group__0 : rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1 ;
    public final void rule__VarDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1586:1: ( rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1587:2: rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__0__Impl_in_rule__VarDecl__Group__03309);
            rule__VarDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__1_in_rule__VarDecl__Group__03312);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1594:1: rule__VarDecl__Group__0__Impl : ( 'int' ) ;
    public final void rule__VarDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1598:1: ( ( 'int' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1599:1: ( 'int' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1599:1: ( 'int' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1600:1: 'int'
            {
             before(grammarAccess.getVarDeclAccess().getIntKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__VarDecl__Group__0__Impl3340); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1613:1: rule__VarDecl__Group__1 : rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2 ;
    public final void rule__VarDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1617:1: ( rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1618:2: rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__1__Impl_in_rule__VarDecl__Group__13371);
            rule__VarDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__2_in_rule__VarDecl__Group__13374);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1625:1: rule__VarDecl__Group__1__Impl : ( ( rule__VarDecl__NameAssignment_1 ) ) ;
    public final void rule__VarDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1629:1: ( ( ( rule__VarDecl__NameAssignment_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1630:1: ( ( rule__VarDecl__NameAssignment_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1630:1: ( ( rule__VarDecl__NameAssignment_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1631:1: ( rule__VarDecl__NameAssignment_1 )
            {
             before(grammarAccess.getVarDeclAccess().getNameAssignment_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1632:1: ( rule__VarDecl__NameAssignment_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1632:2: rule__VarDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VarDecl__NameAssignment_1_in_rule__VarDecl__Group__1__Impl3401);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1642:1: rule__VarDecl__Group__2 : rule__VarDecl__Group__2__Impl ;
    public final void rule__VarDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1646:1: ( rule__VarDecl__Group__2__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1647:2: rule__VarDecl__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__2__Impl_in_rule__VarDecl__Group__23431);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1653:1: rule__VarDecl__Group__2__Impl : ( ( rule__VarDecl__Alternatives_2 ) ) ;
    public final void rule__VarDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1657:1: ( ( ( rule__VarDecl__Alternatives_2 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1658:1: ( ( rule__VarDecl__Alternatives_2 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1658:1: ( ( rule__VarDecl__Alternatives_2 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1659:1: ( rule__VarDecl__Alternatives_2 )
            {
             before(grammarAccess.getVarDeclAccess().getAlternatives_2()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1660:1: ( rule__VarDecl__Alternatives_2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1660:2: rule__VarDecl__Alternatives_2
            {
            pushFollow(FOLLOW_rule__VarDecl__Alternatives_2_in_rule__VarDecl__Group__2__Impl3458);
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


    // $ANTLR start "rule__VarDecl__Group_2_1__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1676:1: rule__VarDecl__Group_2_1__0 : rule__VarDecl__Group_2_1__0__Impl rule__VarDecl__Group_2_1__1 ;
    public final void rule__VarDecl__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1680:1: ( rule__VarDecl__Group_2_1__0__Impl rule__VarDecl__Group_2_1__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1681:2: rule__VarDecl__Group_2_1__0__Impl rule__VarDecl__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__VarDecl__Group_2_1__0__Impl_in_rule__VarDecl__Group_2_1__03494);
            rule__VarDecl__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group_2_1__1_in_rule__VarDecl__Group_2_1__03497);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1688:1: rule__VarDecl__Group_2_1__0__Impl : ( '[' ) ;
    public final void rule__VarDecl__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1692:1: ( ( '[' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1693:1: ( '[' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1693:1: ( '[' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1694:1: '['
            {
             before(grammarAccess.getVarDeclAccess().getLeftSquareBracketKeyword_2_1_0()); 
            match(input,32,FOLLOW_32_in_rule__VarDecl__Group_2_1__0__Impl3525); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1707:1: rule__VarDecl__Group_2_1__1 : rule__VarDecl__Group_2_1__1__Impl rule__VarDecl__Group_2_1__2 ;
    public final void rule__VarDecl__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1711:1: ( rule__VarDecl__Group_2_1__1__Impl rule__VarDecl__Group_2_1__2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1712:2: rule__VarDecl__Group_2_1__1__Impl rule__VarDecl__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__VarDecl__Group_2_1__1__Impl_in_rule__VarDecl__Group_2_1__13556);
            rule__VarDecl__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group_2_1__2_in_rule__VarDecl__Group_2_1__13559);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1719:1: rule__VarDecl__Group_2_1__1__Impl : ( ( rule__VarDecl__IntAssignment_2_1_1 ) ) ;
    public final void rule__VarDecl__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1723:1: ( ( ( rule__VarDecl__IntAssignment_2_1_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1724:1: ( ( rule__VarDecl__IntAssignment_2_1_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1724:1: ( ( rule__VarDecl__IntAssignment_2_1_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1725:1: ( rule__VarDecl__IntAssignment_2_1_1 )
            {
             before(grammarAccess.getVarDeclAccess().getIntAssignment_2_1_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1726:1: ( rule__VarDecl__IntAssignment_2_1_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1726:2: rule__VarDecl__IntAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__VarDecl__IntAssignment_2_1_1_in_rule__VarDecl__Group_2_1__1__Impl3586);
            rule__VarDecl__IntAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVarDeclAccess().getIntAssignment_2_1_1()); 

            }


            }

        }
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1736:1: rule__VarDecl__Group_2_1__2 : rule__VarDecl__Group_2_1__2__Impl ;
    public final void rule__VarDecl__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1740:1: ( rule__VarDecl__Group_2_1__2__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1741:2: rule__VarDecl__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__VarDecl__Group_2_1__2__Impl_in_rule__VarDecl__Group_2_1__23616);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1747:1: rule__VarDecl__Group_2_1__2__Impl : ( ']' ) ;
    public final void rule__VarDecl__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1751:1: ( ( ']' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1752:1: ( ']' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1752:1: ( ']' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1753:1: ']'
            {
             before(grammarAccess.getVarDeclAccess().getRightSquareBracketKeyword_2_1_2()); 
            match(input,33,FOLLOW_33_in_rule__VarDecl__Group_2_1__2__Impl3644); 
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


    // $ANTLR start "rule__Init__Group__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1772:1: rule__Init__Group__0 : rule__Init__Group__0__Impl rule__Init__Group__1 ;
    public final void rule__Init__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1776:1: ( rule__Init__Group__0__Impl rule__Init__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1777:2: rule__Init__Group__0__Impl rule__Init__Group__1
            {
            pushFollow(FOLLOW_rule__Init__Group__0__Impl_in_rule__Init__Group__03681);
            rule__Init__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Init__Group__1_in_rule__Init__Group__03684);
            rule__Init__Group__1();

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
    // $ANTLR end "rule__Init__Group__0"


    // $ANTLR start "rule__Init__Group__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1784:1: rule__Init__Group__0__Impl : ( '=' ) ;
    public final void rule__Init__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1788:1: ( ( '=' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1789:1: ( '=' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1789:1: ( '=' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1790:1: '='
            {
             before(grammarAccess.getInitAccess().getEqualsSignKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Init__Group__0__Impl3712); 
             after(grammarAccess.getInitAccess().getEqualsSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Init__Group__0__Impl"


    // $ANTLR start "rule__Init__Group__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1803:1: rule__Init__Group__1 : rule__Init__Group__1__Impl ;
    public final void rule__Init__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1807:1: ( rule__Init__Group__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1808:2: rule__Init__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Init__Group__1__Impl_in_rule__Init__Group__13743);
            rule__Init__Group__1__Impl();

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
    // $ANTLR end "rule__Init__Group__1"


    // $ANTLR start "rule__Init__Group__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1814:1: rule__Init__Group__1__Impl : ( ( rule__Init__ExprAssignment_1 ) ) ;
    public final void rule__Init__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1818:1: ( ( ( rule__Init__ExprAssignment_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1819:1: ( ( rule__Init__ExprAssignment_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1819:1: ( ( rule__Init__ExprAssignment_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1820:1: ( rule__Init__ExprAssignment_1 )
            {
             before(grammarAccess.getInitAccess().getExprAssignment_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1821:1: ( rule__Init__ExprAssignment_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1821:2: rule__Init__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__Init__ExprAssignment_1_in_rule__Init__Group__1__Impl3770);
            rule__Init__ExprAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInitAccess().getExprAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Init__Group__1__Impl"


    // $ANTLR start "rule__ObjDecl__Group__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1835:1: rule__ObjDecl__Group__0 : rule__ObjDecl__Group__0__Impl rule__ObjDecl__Group__1 ;
    public final void rule__ObjDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1839:1: ( rule__ObjDecl__Group__0__Impl rule__ObjDecl__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1840:2: rule__ObjDecl__Group__0__Impl rule__ObjDecl__Group__1
            {
            pushFollow(FOLLOW_rule__ObjDecl__Group__0__Impl_in_rule__ObjDecl__Group__03804);
            rule__ObjDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjDecl__Group__1_in_rule__ObjDecl__Group__03807);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1847:1: rule__ObjDecl__Group__0__Impl : ( ( rule__ObjDecl__TypeAssignment_0 ) ) ;
    public final void rule__ObjDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1851:1: ( ( ( rule__ObjDecl__TypeAssignment_0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1852:1: ( ( rule__ObjDecl__TypeAssignment_0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1852:1: ( ( rule__ObjDecl__TypeAssignment_0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1853:1: ( rule__ObjDecl__TypeAssignment_0 )
            {
             before(grammarAccess.getObjDeclAccess().getTypeAssignment_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1854:1: ( rule__ObjDecl__TypeAssignment_0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1854:2: rule__ObjDecl__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__ObjDecl__TypeAssignment_0_in_rule__ObjDecl__Group__0__Impl3834);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1864:1: rule__ObjDecl__Group__1 : rule__ObjDecl__Group__1__Impl rule__ObjDecl__Group__2 ;
    public final void rule__ObjDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1868:1: ( rule__ObjDecl__Group__1__Impl rule__ObjDecl__Group__2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1869:2: rule__ObjDecl__Group__1__Impl rule__ObjDecl__Group__2
            {
            pushFollow(FOLLOW_rule__ObjDecl__Group__1__Impl_in_rule__ObjDecl__Group__13864);
            rule__ObjDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjDecl__Group__2_in_rule__ObjDecl__Group__13867);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1876:1: rule__ObjDecl__Group__1__Impl : ( ( rule__ObjDecl__NameAssignment_1 ) ) ;
    public final void rule__ObjDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1880:1: ( ( ( rule__ObjDecl__NameAssignment_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1881:1: ( ( rule__ObjDecl__NameAssignment_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1881:1: ( ( rule__ObjDecl__NameAssignment_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1882:1: ( rule__ObjDecl__NameAssignment_1 )
            {
             before(grammarAccess.getObjDeclAccess().getNameAssignment_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1883:1: ( rule__ObjDecl__NameAssignment_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1883:2: rule__ObjDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ObjDecl__NameAssignment_1_in_rule__ObjDecl__Group__1__Impl3894);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1893:1: rule__ObjDecl__Group__2 : rule__ObjDecl__Group__2__Impl ;
    public final void rule__ObjDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1897:1: ( rule__ObjDecl__Group__2__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1898:2: rule__ObjDecl__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ObjDecl__Group__2__Impl_in_rule__ObjDecl__Group__23924);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1904:1: rule__ObjDecl__Group__2__Impl : ( ( rule__ObjDecl__Alternatives_2 ) ) ;
    public final void rule__ObjDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1908:1: ( ( ( rule__ObjDecl__Alternatives_2 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1909:1: ( ( rule__ObjDecl__Alternatives_2 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1909:1: ( ( rule__ObjDecl__Alternatives_2 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1910:1: ( rule__ObjDecl__Alternatives_2 )
            {
             before(grammarAccess.getObjDeclAccess().getAlternatives_2()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1911:1: ( rule__ObjDecl__Alternatives_2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1911:2: rule__ObjDecl__Alternatives_2
            {
            pushFollow(FOLLOW_rule__ObjDecl__Alternatives_2_in_rule__ObjDecl__Group__2__Impl3951);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1927:1: rule__ObjDecl__Group_2_0__0 : rule__ObjDecl__Group_2_0__0__Impl rule__ObjDecl__Group_2_0__1 ;
    public final void rule__ObjDecl__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1931:1: ( rule__ObjDecl__Group_2_0__0__Impl rule__ObjDecl__Group_2_0__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1932:2: rule__ObjDecl__Group_2_0__0__Impl rule__ObjDecl__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__ObjDecl__Group_2_0__0__Impl_in_rule__ObjDecl__Group_2_0__03987);
            rule__ObjDecl__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjDecl__Group_2_0__1_in_rule__ObjDecl__Group_2_0__03990);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1939:1: rule__ObjDecl__Group_2_0__0__Impl : ( '(' ) ;
    public final void rule__ObjDecl__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1943:1: ( ( '(' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1944:1: ( '(' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1944:1: ( '(' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1945:1: '('
            {
             before(grammarAccess.getObjDeclAccess().getLeftParenthesisKeyword_2_0_0()); 
            match(input,28,FOLLOW_28_in_rule__ObjDecl__Group_2_0__0__Impl4018); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1958:1: rule__ObjDecl__Group_2_0__1 : rule__ObjDecl__Group_2_0__1__Impl rule__ObjDecl__Group_2_0__2 ;
    public final void rule__ObjDecl__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1962:1: ( rule__ObjDecl__Group_2_0__1__Impl rule__ObjDecl__Group_2_0__2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1963:2: rule__ObjDecl__Group_2_0__1__Impl rule__ObjDecl__Group_2_0__2
            {
            pushFollow(FOLLOW_rule__ObjDecl__Group_2_0__1__Impl_in_rule__ObjDecl__Group_2_0__14049);
            rule__ObjDecl__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjDecl__Group_2_0__2_in_rule__ObjDecl__Group_2_0__14052);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1970:1: rule__ObjDecl__Group_2_0__1__Impl : ( ( rule__ObjDecl__AttrAssignment_2_0_1 ) ) ;
    public final void rule__ObjDecl__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1974:1: ( ( ( rule__ObjDecl__AttrAssignment_2_0_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1975:1: ( ( rule__ObjDecl__AttrAssignment_2_0_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1975:1: ( ( rule__ObjDecl__AttrAssignment_2_0_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1976:1: ( rule__ObjDecl__AttrAssignment_2_0_1 )
            {
             before(grammarAccess.getObjDeclAccess().getAttrAssignment_2_0_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1977:1: ( rule__ObjDecl__AttrAssignment_2_0_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1977:2: rule__ObjDecl__AttrAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__ObjDecl__AttrAssignment_2_0_1_in_rule__ObjDecl__Group_2_0__1__Impl4079);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1987:1: rule__ObjDecl__Group_2_0__2 : rule__ObjDecl__Group_2_0__2__Impl ;
    public final void rule__ObjDecl__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1991:1: ( rule__ObjDecl__Group_2_0__2__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1992:2: rule__ObjDecl__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ObjDecl__Group_2_0__2__Impl_in_rule__ObjDecl__Group_2_0__24109);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:1998:1: rule__ObjDecl__Group_2_0__2__Impl : ( ')' ) ;
    public final void rule__ObjDecl__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2002:1: ( ( ')' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2003:1: ( ')' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2003:1: ( ')' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2004:1: ')'
            {
             before(grammarAccess.getObjDeclAccess().getRightParenthesisKeyword_2_0_2()); 
            match(input,29,FOLLOW_29_in_rule__ObjDecl__Group_2_0__2__Impl4137); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2023:1: rule__ObjDecl__Group_2_1__0 : rule__ObjDecl__Group_2_1__0__Impl rule__ObjDecl__Group_2_1__1 ;
    public final void rule__ObjDecl__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2027:1: ( rule__ObjDecl__Group_2_1__0__Impl rule__ObjDecl__Group_2_1__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2028:2: rule__ObjDecl__Group_2_1__0__Impl rule__ObjDecl__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__ObjDecl__Group_2_1__0__Impl_in_rule__ObjDecl__Group_2_1__04174);
            rule__ObjDecl__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjDecl__Group_2_1__1_in_rule__ObjDecl__Group_2_1__04177);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2035:1: rule__ObjDecl__Group_2_1__0__Impl : ( '[' ) ;
    public final void rule__ObjDecl__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2039:1: ( ( '[' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2040:1: ( '[' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2040:1: ( '[' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2041:1: '['
            {
             before(grammarAccess.getObjDeclAccess().getLeftSquareBracketKeyword_2_1_0()); 
            match(input,32,FOLLOW_32_in_rule__ObjDecl__Group_2_1__0__Impl4205); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2054:1: rule__ObjDecl__Group_2_1__1 : rule__ObjDecl__Group_2_1__1__Impl rule__ObjDecl__Group_2_1__2 ;
    public final void rule__ObjDecl__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2058:1: ( rule__ObjDecl__Group_2_1__1__Impl rule__ObjDecl__Group_2_1__2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2059:2: rule__ObjDecl__Group_2_1__1__Impl rule__ObjDecl__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__ObjDecl__Group_2_1__1__Impl_in_rule__ObjDecl__Group_2_1__14236);
            rule__ObjDecl__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ObjDecl__Group_2_1__2_in_rule__ObjDecl__Group_2_1__14239);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2066:1: rule__ObjDecl__Group_2_1__1__Impl : ( ( rule__ObjDecl__IntAssignment_2_1_1 ) ) ;
    public final void rule__ObjDecl__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2070:1: ( ( ( rule__ObjDecl__IntAssignment_2_1_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2071:1: ( ( rule__ObjDecl__IntAssignment_2_1_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2071:1: ( ( rule__ObjDecl__IntAssignment_2_1_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2072:1: ( rule__ObjDecl__IntAssignment_2_1_1 )
            {
             before(grammarAccess.getObjDeclAccess().getIntAssignment_2_1_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2073:1: ( rule__ObjDecl__IntAssignment_2_1_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2073:2: rule__ObjDecl__IntAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__ObjDecl__IntAssignment_2_1_1_in_rule__ObjDecl__Group_2_1__1__Impl4266);
            rule__ObjDecl__IntAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getObjDeclAccess().getIntAssignment_2_1_1()); 

            }


            }

        }
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2083:1: rule__ObjDecl__Group_2_1__2 : rule__ObjDecl__Group_2_1__2__Impl ;
    public final void rule__ObjDecl__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2087:1: ( rule__ObjDecl__Group_2_1__2__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2088:2: rule__ObjDecl__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ObjDecl__Group_2_1__2__Impl_in_rule__ObjDecl__Group_2_1__24296);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2094:1: rule__ObjDecl__Group_2_1__2__Impl : ( ']' ) ;
    public final void rule__ObjDecl__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2098:1: ( ( ']' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2099:1: ( ']' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2099:1: ( ']' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2100:1: ']'
            {
             before(grammarAccess.getObjDeclAccess().getRightSquareBracketKeyword_2_1_2()); 
            match(input,33,FOLLOW_33_in_rule__ObjDecl__Group_2_1__2__Impl4324); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2119:1: rule__AnimBlock__Group__0 : rule__AnimBlock__Group__0__Impl rule__AnimBlock__Group__1 ;
    public final void rule__AnimBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2123:1: ( rule__AnimBlock__Group__0__Impl rule__AnimBlock__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2124:2: rule__AnimBlock__Group__0__Impl rule__AnimBlock__Group__1
            {
            pushFollow(FOLLOW_rule__AnimBlock__Group__0__Impl_in_rule__AnimBlock__Group__04361);
            rule__AnimBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnimBlock__Group__1_in_rule__AnimBlock__Group__04364);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2131:1: rule__AnimBlock__Group__0__Impl : ( 'animation' ) ;
    public final void rule__AnimBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2135:1: ( ( 'animation' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2136:1: ( 'animation' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2136:1: ( 'animation' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2137:1: 'animation'
            {
             before(grammarAccess.getAnimBlockAccess().getAnimationKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__AnimBlock__Group__0__Impl4392); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2150:1: rule__AnimBlock__Group__1 : rule__AnimBlock__Group__1__Impl rule__AnimBlock__Group__2 ;
    public final void rule__AnimBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2154:1: ( rule__AnimBlock__Group__1__Impl rule__AnimBlock__Group__2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2155:2: rule__AnimBlock__Group__1__Impl rule__AnimBlock__Group__2
            {
            pushFollow(FOLLOW_rule__AnimBlock__Group__1__Impl_in_rule__AnimBlock__Group__14423);
            rule__AnimBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnimBlock__Group__2_in_rule__AnimBlock__Group__14426);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2162:1: rule__AnimBlock__Group__1__Impl : ( ( rule__AnimBlock__NameAssignment_1 ) ) ;
    public final void rule__AnimBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2166:1: ( ( ( rule__AnimBlock__NameAssignment_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2167:1: ( ( rule__AnimBlock__NameAssignment_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2167:1: ( ( rule__AnimBlock__NameAssignment_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2168:1: ( rule__AnimBlock__NameAssignment_1 )
            {
             before(grammarAccess.getAnimBlockAccess().getNameAssignment_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2169:1: ( rule__AnimBlock__NameAssignment_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2169:2: rule__AnimBlock__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__AnimBlock__NameAssignment_1_in_rule__AnimBlock__Group__1__Impl4453);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2179:1: rule__AnimBlock__Group__2 : rule__AnimBlock__Group__2__Impl rule__AnimBlock__Group__3 ;
    public final void rule__AnimBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2183:1: ( rule__AnimBlock__Group__2__Impl rule__AnimBlock__Group__3 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2184:2: rule__AnimBlock__Group__2__Impl rule__AnimBlock__Group__3
            {
            pushFollow(FOLLOW_rule__AnimBlock__Group__2__Impl_in_rule__AnimBlock__Group__24483);
            rule__AnimBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnimBlock__Group__3_in_rule__AnimBlock__Group__24486);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2191:1: rule__AnimBlock__Group__2__Impl : ( '(' ) ;
    public final void rule__AnimBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2195:1: ( ( '(' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2196:1: ( '(' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2196:1: ( '(' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2197:1: '('
            {
             before(grammarAccess.getAnimBlockAccess().getLeftParenthesisKeyword_2()); 
            match(input,28,FOLLOW_28_in_rule__AnimBlock__Group__2__Impl4514); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2210:1: rule__AnimBlock__Group__3 : rule__AnimBlock__Group__3__Impl rule__AnimBlock__Group__4 ;
    public final void rule__AnimBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2214:1: ( rule__AnimBlock__Group__3__Impl rule__AnimBlock__Group__4 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2215:2: rule__AnimBlock__Group__3__Impl rule__AnimBlock__Group__4
            {
            pushFollow(FOLLOW_rule__AnimBlock__Group__3__Impl_in_rule__AnimBlock__Group__34545);
            rule__AnimBlock__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnimBlock__Group__4_in_rule__AnimBlock__Group__34548);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2222:1: rule__AnimBlock__Group__3__Impl : ( ( rule__AnimBlock__TypeAssignment_3 ) ) ;
    public final void rule__AnimBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2226:1: ( ( ( rule__AnimBlock__TypeAssignment_3 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2227:1: ( ( rule__AnimBlock__TypeAssignment_3 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2227:1: ( ( rule__AnimBlock__TypeAssignment_3 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2228:1: ( rule__AnimBlock__TypeAssignment_3 )
            {
             before(grammarAccess.getAnimBlockAccess().getTypeAssignment_3()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2229:1: ( rule__AnimBlock__TypeAssignment_3 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2229:2: rule__AnimBlock__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__AnimBlock__TypeAssignment_3_in_rule__AnimBlock__Group__3__Impl4575);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2239:1: rule__AnimBlock__Group__4 : rule__AnimBlock__Group__4__Impl rule__AnimBlock__Group__5 ;
    public final void rule__AnimBlock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2243:1: ( rule__AnimBlock__Group__4__Impl rule__AnimBlock__Group__5 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2244:2: rule__AnimBlock__Group__4__Impl rule__AnimBlock__Group__5
            {
            pushFollow(FOLLOW_rule__AnimBlock__Group__4__Impl_in_rule__AnimBlock__Group__44605);
            rule__AnimBlock__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnimBlock__Group__5_in_rule__AnimBlock__Group__44608);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2251:1: rule__AnimBlock__Group__4__Impl : ( ( rule__AnimBlock__ObjNameAssignment_4 ) ) ;
    public final void rule__AnimBlock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2255:1: ( ( ( rule__AnimBlock__ObjNameAssignment_4 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2256:1: ( ( rule__AnimBlock__ObjNameAssignment_4 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2256:1: ( ( rule__AnimBlock__ObjNameAssignment_4 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2257:1: ( rule__AnimBlock__ObjNameAssignment_4 )
            {
             before(grammarAccess.getAnimBlockAccess().getObjNameAssignment_4()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2258:1: ( rule__AnimBlock__ObjNameAssignment_4 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2258:2: rule__AnimBlock__ObjNameAssignment_4
            {
            pushFollow(FOLLOW_rule__AnimBlock__ObjNameAssignment_4_in_rule__AnimBlock__Group__4__Impl4635);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2268:1: rule__AnimBlock__Group__5 : rule__AnimBlock__Group__5__Impl rule__AnimBlock__Group__6 ;
    public final void rule__AnimBlock__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2272:1: ( rule__AnimBlock__Group__5__Impl rule__AnimBlock__Group__6 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2273:2: rule__AnimBlock__Group__5__Impl rule__AnimBlock__Group__6
            {
            pushFollow(FOLLOW_rule__AnimBlock__Group__5__Impl_in_rule__AnimBlock__Group__54665);
            rule__AnimBlock__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnimBlock__Group__6_in_rule__AnimBlock__Group__54668);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2280:1: rule__AnimBlock__Group__5__Impl : ( ')' ) ;
    public final void rule__AnimBlock__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2284:1: ( ( ')' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2285:1: ( ')' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2285:1: ( ')' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2286:1: ')'
            {
             before(grammarAccess.getAnimBlockAccess().getRightParenthesisKeyword_5()); 
            match(input,29,FOLLOW_29_in_rule__AnimBlock__Group__5__Impl4696); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2299:1: rule__AnimBlock__Group__6 : rule__AnimBlock__Group__6__Impl ;
    public final void rule__AnimBlock__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2303:1: ( rule__AnimBlock__Group__6__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2304:2: rule__AnimBlock__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__AnimBlock__Group__6__Impl_in_rule__AnimBlock__Group__64727);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2310:1: rule__AnimBlock__Group__6__Impl : ( ( rule__AnimBlock__StmtAssignment_6 ) ) ;
    public final void rule__AnimBlock__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2314:1: ( ( ( rule__AnimBlock__StmtAssignment_6 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2315:1: ( ( rule__AnimBlock__StmtAssignment_6 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2315:1: ( ( rule__AnimBlock__StmtAssignment_6 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2316:1: ( rule__AnimBlock__StmtAssignment_6 )
            {
             before(grammarAccess.getAnimBlockAccess().getStmtAssignment_6()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2317:1: ( rule__AnimBlock__StmtAssignment_6 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2317:2: rule__AnimBlock__StmtAssignment_6
            {
            pushFollow(FOLLOW_rule__AnimBlock__StmtAssignment_6_in_rule__AnimBlock__Group__6__Impl4754);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2341:1: rule__EventBlock__Group__0 : rule__EventBlock__Group__0__Impl rule__EventBlock__Group__1 ;
    public final void rule__EventBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2345:1: ( rule__EventBlock__Group__0__Impl rule__EventBlock__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2346:2: rule__EventBlock__Group__0__Impl rule__EventBlock__Group__1
            {
            pushFollow(FOLLOW_rule__EventBlock__Group__0__Impl_in_rule__EventBlock__Group__04798);
            rule__EventBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventBlock__Group__1_in_rule__EventBlock__Group__04801);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2353:1: rule__EventBlock__Group__0__Impl : ( 'on' ) ;
    public final void rule__EventBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2357:1: ( ( 'on' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2358:1: ( 'on' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2358:1: ( 'on' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2359:1: 'on'
            {
             before(grammarAccess.getEventBlockAccess().getOnKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__EventBlock__Group__0__Impl4829); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2372:1: rule__EventBlock__Group__1 : rule__EventBlock__Group__1__Impl rule__EventBlock__Group__2 ;
    public final void rule__EventBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2376:1: ( rule__EventBlock__Group__1__Impl rule__EventBlock__Group__2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2377:2: rule__EventBlock__Group__1__Impl rule__EventBlock__Group__2
            {
            pushFollow(FOLLOW_rule__EventBlock__Group__1__Impl_in_rule__EventBlock__Group__14860);
            rule__EventBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EventBlock__Group__2_in_rule__EventBlock__Group__14863);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2384:1: rule__EventBlock__Group__1__Impl : ( ( rule__EventBlock__KeyAssignment_1 ) ) ;
    public final void rule__EventBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2388:1: ( ( ( rule__EventBlock__KeyAssignment_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2389:1: ( ( rule__EventBlock__KeyAssignment_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2389:1: ( ( rule__EventBlock__KeyAssignment_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2390:1: ( rule__EventBlock__KeyAssignment_1 )
            {
             before(grammarAccess.getEventBlockAccess().getKeyAssignment_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2391:1: ( rule__EventBlock__KeyAssignment_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2391:2: rule__EventBlock__KeyAssignment_1
            {
            pushFollow(FOLLOW_rule__EventBlock__KeyAssignment_1_in_rule__EventBlock__Group__1__Impl4890);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2401:1: rule__EventBlock__Group__2 : rule__EventBlock__Group__2__Impl ;
    public final void rule__EventBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2405:1: ( rule__EventBlock__Group__2__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2406:2: rule__EventBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__EventBlock__Group__2__Impl_in_rule__EventBlock__Group__24920);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2412:1: rule__EventBlock__Group__2__Impl : ( ( rule__EventBlock__StmtAssignment_2 ) ) ;
    public final void rule__EventBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2416:1: ( ( ( rule__EventBlock__StmtAssignment_2 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2417:1: ( ( rule__EventBlock__StmtAssignment_2 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2417:1: ( ( rule__EventBlock__StmtAssignment_2 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2418:1: ( rule__EventBlock__StmtAssignment_2 )
            {
             before(grammarAccess.getEventBlockAccess().getStmtAssignment_2()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2419:1: ( rule__EventBlock__StmtAssignment_2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2419:2: rule__EventBlock__StmtAssignment_2
            {
            pushFollow(FOLLOW_rule__EventBlock__StmtAssignment_2_in_rule__EventBlock__Group__2__Impl4947);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2435:1: rule__StatementBlock__Group__0 : rule__StatementBlock__Group__0__Impl rule__StatementBlock__Group__1 ;
    public final void rule__StatementBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2439:1: ( rule__StatementBlock__Group__0__Impl rule__StatementBlock__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2440:2: rule__StatementBlock__Group__0__Impl rule__StatementBlock__Group__1
            {
            pushFollow(FOLLOW_rule__StatementBlock__Group__0__Impl_in_rule__StatementBlock__Group__04983);
            rule__StatementBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StatementBlock__Group__1_in_rule__StatementBlock__Group__04986);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2447:1: rule__StatementBlock__Group__0__Impl : ( () ) ;
    public final void rule__StatementBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2451:1: ( ( () ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2452:1: ( () )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2452:1: ( () )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2453:1: ()
            {
             before(grammarAccess.getStatementBlockAccess().getStatementBlockAction_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2454:1: ()
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2456:1: 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2466:1: rule__StatementBlock__Group__1 : rule__StatementBlock__Group__1__Impl ;
    public final void rule__StatementBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2470:1: ( rule__StatementBlock__Group__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2471:2: rule__StatementBlock__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StatementBlock__Group__1__Impl_in_rule__StatementBlock__Group__15044);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2477:1: rule__StatementBlock__Group__1__Impl : ( ( rule__StatementBlock__Group_1__0 ) ) ;
    public final void rule__StatementBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2481:1: ( ( ( rule__StatementBlock__Group_1__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2482:1: ( ( rule__StatementBlock__Group_1__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2482:1: ( ( rule__StatementBlock__Group_1__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2483:1: ( rule__StatementBlock__Group_1__0 )
            {
             before(grammarAccess.getStatementBlockAccess().getGroup_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2484:1: ( rule__StatementBlock__Group_1__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2484:2: rule__StatementBlock__Group_1__0
            {
            pushFollow(FOLLOW_rule__StatementBlock__Group_1__0_in_rule__StatementBlock__Group__1__Impl5071);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2498:1: rule__StatementBlock__Group_1__0 : rule__StatementBlock__Group_1__0__Impl rule__StatementBlock__Group_1__1 ;
    public final void rule__StatementBlock__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2502:1: ( rule__StatementBlock__Group_1__0__Impl rule__StatementBlock__Group_1__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2503:2: rule__StatementBlock__Group_1__0__Impl rule__StatementBlock__Group_1__1
            {
            pushFollow(FOLLOW_rule__StatementBlock__Group_1__0__Impl_in_rule__StatementBlock__Group_1__05105);
            rule__StatementBlock__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StatementBlock__Group_1__1_in_rule__StatementBlock__Group_1__05108);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2510:1: rule__StatementBlock__Group_1__0__Impl : ( '{' ) ;
    public final void rule__StatementBlock__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2514:1: ( ( '{' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2515:1: ( '{' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2515:1: ( '{' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2516:1: '{'
            {
             before(grammarAccess.getStatementBlockAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,37,FOLLOW_37_in_rule__StatementBlock__Group_1__0__Impl5136); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2529:1: rule__StatementBlock__Group_1__1 : rule__StatementBlock__Group_1__1__Impl rule__StatementBlock__Group_1__2 ;
    public final void rule__StatementBlock__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2533:1: ( rule__StatementBlock__Group_1__1__Impl rule__StatementBlock__Group_1__2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2534:2: rule__StatementBlock__Group_1__1__Impl rule__StatementBlock__Group_1__2
            {
            pushFollow(FOLLOW_rule__StatementBlock__Group_1__1__Impl_in_rule__StatementBlock__Group_1__15167);
            rule__StatementBlock__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StatementBlock__Group_1__2_in_rule__StatementBlock__Group_1__15170);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2541:1: rule__StatementBlock__Group_1__1__Impl : ( ( rule__StatementBlock__StmtAssignment_1_1 )* ) ;
    public final void rule__StatementBlock__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2545:1: ( ( ( rule__StatementBlock__StmtAssignment_1_1 )* ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2546:1: ( ( rule__StatementBlock__StmtAssignment_1_1 )* )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2546:1: ( ( rule__StatementBlock__StmtAssignment_1_1 )* )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2547:1: ( rule__StatementBlock__StmtAssignment_1_1 )*
            {
             before(grammarAccess.getStatementBlockAccess().getStmtAssignment_1_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2548:1: ( rule__StatementBlock__StmtAssignment_1_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||(LA17_0>=39 && LA17_0<=40)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2548:2: rule__StatementBlock__StmtAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__StatementBlock__StmtAssignment_1_1_in_rule__StatementBlock__Group_1__1__Impl5197);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2558:1: rule__StatementBlock__Group_1__2 : rule__StatementBlock__Group_1__2__Impl ;
    public final void rule__StatementBlock__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2562:1: ( rule__StatementBlock__Group_1__2__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2563:2: rule__StatementBlock__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__StatementBlock__Group_1__2__Impl_in_rule__StatementBlock__Group_1__25228);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2569:1: rule__StatementBlock__Group_1__2__Impl : ( '}' ) ;
    public final void rule__StatementBlock__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2573:1: ( ( '}' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2574:1: ( '}' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2574:1: ( '}' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2575:1: '}'
            {
             before(grammarAccess.getStatementBlockAccess().getRightCurlyBracketKeyword_1_2()); 
            match(input,38,FOLLOW_38_in_rule__StatementBlock__Group_1__2__Impl5256); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2594:1: rule__ForStmt__Group__0 : rule__ForStmt__Group__0__Impl rule__ForStmt__Group__1 ;
    public final void rule__ForStmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2598:1: ( rule__ForStmt__Group__0__Impl rule__ForStmt__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2599:2: rule__ForStmt__Group__0__Impl rule__ForStmt__Group__1
            {
            pushFollow(FOLLOW_rule__ForStmt__Group__0__Impl_in_rule__ForStmt__Group__05293);
            rule__ForStmt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForStmt__Group__1_in_rule__ForStmt__Group__05296);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2606:1: rule__ForStmt__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForStmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2610:1: ( ( 'for' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2611:1: ( 'for' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2611:1: ( 'for' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2612:1: 'for'
            {
             before(grammarAccess.getForStmtAccess().getForKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__ForStmt__Group__0__Impl5324); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2625:1: rule__ForStmt__Group__1 : rule__ForStmt__Group__1__Impl rule__ForStmt__Group__2 ;
    public final void rule__ForStmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2629:1: ( rule__ForStmt__Group__1__Impl rule__ForStmt__Group__2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2630:2: rule__ForStmt__Group__1__Impl rule__ForStmt__Group__2
            {
            pushFollow(FOLLOW_rule__ForStmt__Group__1__Impl_in_rule__ForStmt__Group__15355);
            rule__ForStmt__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForStmt__Group__2_in_rule__ForStmt__Group__15358);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2637:1: rule__ForStmt__Group__1__Impl : ( '(' ) ;
    public final void rule__ForStmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2641:1: ( ( '(' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2642:1: ( '(' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2642:1: ( '(' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2643:1: '('
            {
             before(grammarAccess.getForStmtAccess().getLeftParenthesisKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__ForStmt__Group__1__Impl5386); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2656:1: rule__ForStmt__Group__2 : rule__ForStmt__Group__2__Impl rule__ForStmt__Group__3 ;
    public final void rule__ForStmt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2660:1: ( rule__ForStmt__Group__2__Impl rule__ForStmt__Group__3 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2661:2: rule__ForStmt__Group__2__Impl rule__ForStmt__Group__3
            {
            pushFollow(FOLLOW_rule__ForStmt__Group__2__Impl_in_rule__ForStmt__Group__25417);
            rule__ForStmt__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForStmt__Group__3_in_rule__ForStmt__Group__25420);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2668:1: rule__ForStmt__Group__2__Impl : ( ( rule__ForStmt__Ass1Assignment_2 ) ) ;
    public final void rule__ForStmt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2672:1: ( ( ( rule__ForStmt__Ass1Assignment_2 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2673:1: ( ( rule__ForStmt__Ass1Assignment_2 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2673:1: ( ( rule__ForStmt__Ass1Assignment_2 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2674:1: ( rule__ForStmt__Ass1Assignment_2 )
            {
             before(grammarAccess.getForStmtAccess().getAss1Assignment_2()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2675:1: ( rule__ForStmt__Ass1Assignment_2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2675:2: rule__ForStmt__Ass1Assignment_2
            {
            pushFollow(FOLLOW_rule__ForStmt__Ass1Assignment_2_in_rule__ForStmt__Group__2__Impl5447);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2685:1: rule__ForStmt__Group__3 : rule__ForStmt__Group__3__Impl rule__ForStmt__Group__4 ;
    public final void rule__ForStmt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2689:1: ( rule__ForStmt__Group__3__Impl rule__ForStmt__Group__4 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2690:2: rule__ForStmt__Group__3__Impl rule__ForStmt__Group__4
            {
            pushFollow(FOLLOW_rule__ForStmt__Group__3__Impl_in_rule__ForStmt__Group__35477);
            rule__ForStmt__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForStmt__Group__4_in_rule__ForStmt__Group__35480);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2697:1: rule__ForStmt__Group__3__Impl : ( ( rule__ForStmt__ExprAssignment_3 ) ) ;
    public final void rule__ForStmt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2701:1: ( ( ( rule__ForStmt__ExprAssignment_3 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2702:1: ( ( rule__ForStmt__ExprAssignment_3 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2702:1: ( ( rule__ForStmt__ExprAssignment_3 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2703:1: ( rule__ForStmt__ExprAssignment_3 )
            {
             before(grammarAccess.getForStmtAccess().getExprAssignment_3()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2704:1: ( rule__ForStmt__ExprAssignment_3 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2704:2: rule__ForStmt__ExprAssignment_3
            {
            pushFollow(FOLLOW_rule__ForStmt__ExprAssignment_3_in_rule__ForStmt__Group__3__Impl5507);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2714:1: rule__ForStmt__Group__4 : rule__ForStmt__Group__4__Impl rule__ForStmt__Group__5 ;
    public final void rule__ForStmt__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2718:1: ( rule__ForStmt__Group__4__Impl rule__ForStmt__Group__5 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2719:2: rule__ForStmt__Group__4__Impl rule__ForStmt__Group__5
            {
            pushFollow(FOLLOW_rule__ForStmt__Group__4__Impl_in_rule__ForStmt__Group__45537);
            rule__ForStmt__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForStmt__Group__5_in_rule__ForStmt__Group__45540);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2726:1: rule__ForStmt__Group__4__Impl : ( ';' ) ;
    public final void rule__ForStmt__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2730:1: ( ( ';' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2731:1: ( ';' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2731:1: ( ';' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2732:1: ';'
            {
             before(grammarAccess.getForStmtAccess().getSemicolonKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__ForStmt__Group__4__Impl5568); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2745:1: rule__ForStmt__Group__5 : rule__ForStmt__Group__5__Impl rule__ForStmt__Group__6 ;
    public final void rule__ForStmt__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2749:1: ( rule__ForStmt__Group__5__Impl rule__ForStmt__Group__6 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2750:2: rule__ForStmt__Group__5__Impl rule__ForStmt__Group__6
            {
            pushFollow(FOLLOW_rule__ForStmt__Group__5__Impl_in_rule__ForStmt__Group__55599);
            rule__ForStmt__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForStmt__Group__6_in_rule__ForStmt__Group__55602);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2757:1: rule__ForStmt__Group__5__Impl : ( ( rule__ForStmt__Ass2Assignment_5 ) ) ;
    public final void rule__ForStmt__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2761:1: ( ( ( rule__ForStmt__Ass2Assignment_5 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2762:1: ( ( rule__ForStmt__Ass2Assignment_5 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2762:1: ( ( rule__ForStmt__Ass2Assignment_5 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2763:1: ( rule__ForStmt__Ass2Assignment_5 )
            {
             before(grammarAccess.getForStmtAccess().getAss2Assignment_5()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2764:1: ( rule__ForStmt__Ass2Assignment_5 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2764:2: rule__ForStmt__Ass2Assignment_5
            {
            pushFollow(FOLLOW_rule__ForStmt__Ass2Assignment_5_in_rule__ForStmt__Group__5__Impl5629);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2774:1: rule__ForStmt__Group__6 : rule__ForStmt__Group__6__Impl rule__ForStmt__Group__7 ;
    public final void rule__ForStmt__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2778:1: ( rule__ForStmt__Group__6__Impl rule__ForStmt__Group__7 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2779:2: rule__ForStmt__Group__6__Impl rule__ForStmt__Group__7
            {
            pushFollow(FOLLOW_rule__ForStmt__Group__6__Impl_in_rule__ForStmt__Group__65659);
            rule__ForStmt__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ForStmt__Group__7_in_rule__ForStmt__Group__65662);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2786:1: rule__ForStmt__Group__6__Impl : ( ')' ) ;
    public final void rule__ForStmt__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2790:1: ( ( ')' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2791:1: ( ')' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2791:1: ( ')' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2792:1: ')'
            {
             before(grammarAccess.getForStmtAccess().getRightParenthesisKeyword_6()); 
            match(input,29,FOLLOW_29_in_rule__ForStmt__Group__6__Impl5690); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2805:1: rule__ForStmt__Group__7 : rule__ForStmt__Group__7__Impl ;
    public final void rule__ForStmt__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2809:1: ( rule__ForStmt__Group__7__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2810:2: rule__ForStmt__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__ForStmt__Group__7__Impl_in_rule__ForStmt__Group__75721);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2816:1: rule__ForStmt__Group__7__Impl : ( ( rule__ForStmt__StmtAssignment_7 ) ) ;
    public final void rule__ForStmt__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2820:1: ( ( ( rule__ForStmt__StmtAssignment_7 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2821:1: ( ( rule__ForStmt__StmtAssignment_7 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2821:1: ( ( rule__ForStmt__StmtAssignment_7 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2822:1: ( rule__ForStmt__StmtAssignment_7 )
            {
             before(grammarAccess.getForStmtAccess().getStmtAssignment_7()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2823:1: ( rule__ForStmt__StmtAssignment_7 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2823:2: rule__ForStmt__StmtAssignment_7
            {
            pushFollow(FOLLOW_rule__ForStmt__StmtAssignment_7_in_rule__ForStmt__Group__7__Impl5748);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2849:1: rule__IfStmt__Group__0 : rule__IfStmt__Group__0__Impl rule__IfStmt__Group__1 ;
    public final void rule__IfStmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2853:1: ( rule__IfStmt__Group__0__Impl rule__IfStmt__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2854:2: rule__IfStmt__Group__0__Impl rule__IfStmt__Group__1
            {
            pushFollow(FOLLOW_rule__IfStmt__Group__0__Impl_in_rule__IfStmt__Group__05794);
            rule__IfStmt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStmt__Group__1_in_rule__IfStmt__Group__05797);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2861:1: rule__IfStmt__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfStmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2865:1: ( ( 'if' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2866:1: ( 'if' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2866:1: ( 'if' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2867:1: 'if'
            {
             before(grammarAccess.getIfStmtAccess().getIfKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__IfStmt__Group__0__Impl5825); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2880:1: rule__IfStmt__Group__1 : rule__IfStmt__Group__1__Impl rule__IfStmt__Group__2 ;
    public final void rule__IfStmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2884:1: ( rule__IfStmt__Group__1__Impl rule__IfStmt__Group__2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2885:2: rule__IfStmt__Group__1__Impl rule__IfStmt__Group__2
            {
            pushFollow(FOLLOW_rule__IfStmt__Group__1__Impl_in_rule__IfStmt__Group__15856);
            rule__IfStmt__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStmt__Group__2_in_rule__IfStmt__Group__15859);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2892:1: rule__IfStmt__Group__1__Impl : ( '(' ) ;
    public final void rule__IfStmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2896:1: ( ( '(' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2897:1: ( '(' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2897:1: ( '(' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2898:1: '('
            {
             before(grammarAccess.getIfStmtAccess().getLeftParenthesisKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__IfStmt__Group__1__Impl5887); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2911:1: rule__IfStmt__Group__2 : rule__IfStmt__Group__2__Impl rule__IfStmt__Group__3 ;
    public final void rule__IfStmt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2915:1: ( rule__IfStmt__Group__2__Impl rule__IfStmt__Group__3 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2916:2: rule__IfStmt__Group__2__Impl rule__IfStmt__Group__3
            {
            pushFollow(FOLLOW_rule__IfStmt__Group__2__Impl_in_rule__IfStmt__Group__25918);
            rule__IfStmt__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStmt__Group__3_in_rule__IfStmt__Group__25921);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2923:1: rule__IfStmt__Group__2__Impl : ( ( rule__IfStmt__ExprAssignment_2 ) ) ;
    public final void rule__IfStmt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2927:1: ( ( ( rule__IfStmt__ExprAssignment_2 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2928:1: ( ( rule__IfStmt__ExprAssignment_2 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2928:1: ( ( rule__IfStmt__ExprAssignment_2 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2929:1: ( rule__IfStmt__ExprAssignment_2 )
            {
             before(grammarAccess.getIfStmtAccess().getExprAssignment_2()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2930:1: ( rule__IfStmt__ExprAssignment_2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2930:2: rule__IfStmt__ExprAssignment_2
            {
            pushFollow(FOLLOW_rule__IfStmt__ExprAssignment_2_in_rule__IfStmt__Group__2__Impl5948);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2940:1: rule__IfStmt__Group__3 : rule__IfStmt__Group__3__Impl rule__IfStmt__Group__4 ;
    public final void rule__IfStmt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2944:1: ( rule__IfStmt__Group__3__Impl rule__IfStmt__Group__4 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2945:2: rule__IfStmt__Group__3__Impl rule__IfStmt__Group__4
            {
            pushFollow(FOLLOW_rule__IfStmt__Group__3__Impl_in_rule__IfStmt__Group__35978);
            rule__IfStmt__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStmt__Group__4_in_rule__IfStmt__Group__35981);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2952:1: rule__IfStmt__Group__3__Impl : ( ')' ) ;
    public final void rule__IfStmt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2956:1: ( ( ')' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2957:1: ( ')' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2957:1: ( ')' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2958:1: ')'
            {
             before(grammarAccess.getIfStmtAccess().getRightParenthesisKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__IfStmt__Group__3__Impl6009); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2971:1: rule__IfStmt__Group__4 : rule__IfStmt__Group__4__Impl rule__IfStmt__Group__5 ;
    public final void rule__IfStmt__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2975:1: ( rule__IfStmt__Group__4__Impl rule__IfStmt__Group__5 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2976:2: rule__IfStmt__Group__4__Impl rule__IfStmt__Group__5
            {
            pushFollow(FOLLOW_rule__IfStmt__Group__4__Impl_in_rule__IfStmt__Group__46040);
            rule__IfStmt__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__IfStmt__Group__5_in_rule__IfStmt__Group__46043);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2983:1: rule__IfStmt__Group__4__Impl : ( ( rule__IfStmt__StmtAssignment_4 ) ) ;
    public final void rule__IfStmt__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2987:1: ( ( ( rule__IfStmt__StmtAssignment_4 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2988:1: ( ( rule__IfStmt__StmtAssignment_4 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2988:1: ( ( rule__IfStmt__StmtAssignment_4 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2989:1: ( rule__IfStmt__StmtAssignment_4 )
            {
             before(grammarAccess.getIfStmtAccess().getStmtAssignment_4()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2990:1: ( rule__IfStmt__StmtAssignment_4 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:2990:2: rule__IfStmt__StmtAssignment_4
            {
            pushFollow(FOLLOW_rule__IfStmt__StmtAssignment_4_in_rule__IfStmt__Group__4__Impl6070);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3000:1: rule__IfStmt__Group__5 : rule__IfStmt__Group__5__Impl ;
    public final void rule__IfStmt__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3004:1: ( rule__IfStmt__Group__5__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3005:2: rule__IfStmt__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__IfStmt__Group__5__Impl_in_rule__IfStmt__Group__56100);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3011:1: rule__IfStmt__Group__5__Impl : ( ( rule__IfStmt__ElseAssignment_5 )? ) ;
    public final void rule__IfStmt__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3015:1: ( ( ( rule__IfStmt__ElseAssignment_5 )? ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3016:1: ( ( rule__IfStmt__ElseAssignment_5 )? )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3016:1: ( ( rule__IfStmt__ElseAssignment_5 )? )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3017:1: ( rule__IfStmt__ElseAssignment_5 )?
            {
             before(grammarAccess.getIfStmtAccess().getElseAssignment_5()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3018:1: ( rule__IfStmt__ElseAssignment_5 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==41) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3018:2: rule__IfStmt__ElseAssignment_5
                    {
                    pushFollow(FOLLOW_rule__IfStmt__ElseAssignment_5_in_rule__IfStmt__Group__5__Impl6127);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3040:1: rule__ElseStmt__Group__0 : rule__ElseStmt__Group__0__Impl rule__ElseStmt__Group__1 ;
    public final void rule__ElseStmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3044:1: ( rule__ElseStmt__Group__0__Impl rule__ElseStmt__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3045:2: rule__ElseStmt__Group__0__Impl rule__ElseStmt__Group__1
            {
            pushFollow(FOLLOW_rule__ElseStmt__Group__0__Impl_in_rule__ElseStmt__Group__06170);
            rule__ElseStmt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ElseStmt__Group__1_in_rule__ElseStmt__Group__06173);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3052:1: rule__ElseStmt__Group__0__Impl : ( 'else' ) ;
    public final void rule__ElseStmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3056:1: ( ( 'else' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3057:1: ( 'else' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3057:1: ( 'else' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3058:1: 'else'
            {
             before(grammarAccess.getElseStmtAccess().getElseKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__ElseStmt__Group__0__Impl6201); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3071:1: rule__ElseStmt__Group__1 : rule__ElseStmt__Group__1__Impl ;
    public final void rule__ElseStmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3075:1: ( rule__ElseStmt__Group__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3076:2: rule__ElseStmt__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ElseStmt__Group__1__Impl_in_rule__ElseStmt__Group__16232);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3082:1: rule__ElseStmt__Group__1__Impl : ( ( rule__ElseStmt__StmtAssignment_1 ) ) ;
    public final void rule__ElseStmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3086:1: ( ( ( rule__ElseStmt__StmtAssignment_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3087:1: ( ( rule__ElseStmt__StmtAssignment_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3087:1: ( ( rule__ElseStmt__StmtAssignment_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3088:1: ( rule__ElseStmt__StmtAssignment_1 )
            {
             before(grammarAccess.getElseStmtAccess().getStmtAssignment_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3089:1: ( rule__ElseStmt__StmtAssignment_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3089:2: rule__ElseStmt__StmtAssignment_1
            {
            pushFollow(FOLLOW_rule__ElseStmt__StmtAssignment_1_in_rule__ElseStmt__Group__1__Impl6259);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3103:1: rule__AssStmt__Group__0 : rule__AssStmt__Group__0__Impl rule__AssStmt__Group__1 ;
    public final void rule__AssStmt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3107:1: ( rule__AssStmt__Group__0__Impl rule__AssStmt__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3108:2: rule__AssStmt__Group__0__Impl rule__AssStmt__Group__1
            {
            pushFollow(FOLLOW_rule__AssStmt__Group__0__Impl_in_rule__AssStmt__Group__06293);
            rule__AssStmt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssStmt__Group__1_in_rule__AssStmt__Group__06296);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3115:1: rule__AssStmt__Group__0__Impl : ( ( rule__AssStmt__VarAssignment_0 ) ) ;
    public final void rule__AssStmt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3119:1: ( ( ( rule__AssStmt__VarAssignment_0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3120:1: ( ( rule__AssStmt__VarAssignment_0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3120:1: ( ( rule__AssStmt__VarAssignment_0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3121:1: ( rule__AssStmt__VarAssignment_0 )
            {
             before(grammarAccess.getAssStmtAccess().getVarAssignment_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3122:1: ( rule__AssStmt__VarAssignment_0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3122:2: rule__AssStmt__VarAssignment_0
            {
            pushFollow(FOLLOW_rule__AssStmt__VarAssignment_0_in_rule__AssStmt__Group__0__Impl6323);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3132:1: rule__AssStmt__Group__1 : rule__AssStmt__Group__1__Impl rule__AssStmt__Group__2 ;
    public final void rule__AssStmt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3136:1: ( rule__AssStmt__Group__1__Impl rule__AssStmt__Group__2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3137:2: rule__AssStmt__Group__1__Impl rule__AssStmt__Group__2
            {
            pushFollow(FOLLOW_rule__AssStmt__Group__1__Impl_in_rule__AssStmt__Group__16353);
            rule__AssStmt__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssStmt__Group__2_in_rule__AssStmt__Group__16356);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3144:1: rule__AssStmt__Group__1__Impl : ( '=' ) ;
    public final void rule__AssStmt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3148:1: ( ( '=' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3149:1: ( '=' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3149:1: ( '=' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3150:1: '='
            {
             before(grammarAccess.getAssStmtAccess().getEqualsSignKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__AssStmt__Group__1__Impl6384); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3163:1: rule__AssStmt__Group__2 : rule__AssStmt__Group__2__Impl rule__AssStmt__Group__3 ;
    public final void rule__AssStmt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3167:1: ( rule__AssStmt__Group__2__Impl rule__AssStmt__Group__3 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3168:2: rule__AssStmt__Group__2__Impl rule__AssStmt__Group__3
            {
            pushFollow(FOLLOW_rule__AssStmt__Group__2__Impl_in_rule__AssStmt__Group__26415);
            rule__AssStmt__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssStmt__Group__3_in_rule__AssStmt__Group__26418);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3175:1: rule__AssStmt__Group__2__Impl : ( ( rule__AssStmt__ExprAssignment_2 ) ) ;
    public final void rule__AssStmt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3179:1: ( ( ( rule__AssStmt__ExprAssignment_2 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3180:1: ( ( rule__AssStmt__ExprAssignment_2 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3180:1: ( ( rule__AssStmt__ExprAssignment_2 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3181:1: ( rule__AssStmt__ExprAssignment_2 )
            {
             before(grammarAccess.getAssStmtAccess().getExprAssignment_2()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3182:1: ( rule__AssStmt__ExprAssignment_2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3182:2: rule__AssStmt__ExprAssignment_2
            {
            pushFollow(FOLLOW_rule__AssStmt__ExprAssignment_2_in_rule__AssStmt__Group__2__Impl6445);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3192:1: rule__AssStmt__Group__3 : rule__AssStmt__Group__3__Impl ;
    public final void rule__AssStmt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3196:1: ( rule__AssStmt__Group__3__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3197:2: rule__AssStmt__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__AssStmt__Group__3__Impl_in_rule__AssStmt__Group__36475);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3203:1: rule__AssStmt__Group__3__Impl : ( ';' ) ;
    public final void rule__AssStmt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3207:1: ( ( ';' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3208:1: ( ';' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3208:1: ( ';' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3209:1: ';'
            {
             before(grammarAccess.getAssStmtAccess().getSemicolonKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__AssStmt__Group__3__Impl6503); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3230:1: rule__AssStmt2__Group__0 : rule__AssStmt2__Group__0__Impl rule__AssStmt2__Group__1 ;
    public final void rule__AssStmt2__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3234:1: ( rule__AssStmt2__Group__0__Impl rule__AssStmt2__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3235:2: rule__AssStmt2__Group__0__Impl rule__AssStmt2__Group__1
            {
            pushFollow(FOLLOW_rule__AssStmt2__Group__0__Impl_in_rule__AssStmt2__Group__06542);
            rule__AssStmt2__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssStmt2__Group__1_in_rule__AssStmt2__Group__06545);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3242:1: rule__AssStmt2__Group__0__Impl : ( ( rule__AssStmt2__VarAssignment_0 ) ) ;
    public final void rule__AssStmt2__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3246:1: ( ( ( rule__AssStmt2__VarAssignment_0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3247:1: ( ( rule__AssStmt2__VarAssignment_0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3247:1: ( ( rule__AssStmt2__VarAssignment_0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3248:1: ( rule__AssStmt2__VarAssignment_0 )
            {
             before(grammarAccess.getAssStmt2Access().getVarAssignment_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3249:1: ( rule__AssStmt2__VarAssignment_0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3249:2: rule__AssStmt2__VarAssignment_0
            {
            pushFollow(FOLLOW_rule__AssStmt2__VarAssignment_0_in_rule__AssStmt2__Group__0__Impl6572);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3259:1: rule__AssStmt2__Group__1 : rule__AssStmt2__Group__1__Impl rule__AssStmt2__Group__2 ;
    public final void rule__AssStmt2__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3263:1: ( rule__AssStmt2__Group__1__Impl rule__AssStmt2__Group__2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3264:2: rule__AssStmt2__Group__1__Impl rule__AssStmt2__Group__2
            {
            pushFollow(FOLLOW_rule__AssStmt2__Group__1__Impl_in_rule__AssStmt2__Group__16602);
            rule__AssStmt2__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AssStmt2__Group__2_in_rule__AssStmt2__Group__16605);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3271:1: rule__AssStmt2__Group__1__Impl : ( '=' ) ;
    public final void rule__AssStmt2__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3275:1: ( ( '=' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3276:1: ( '=' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3276:1: ( '=' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3277:1: '='
            {
             before(grammarAccess.getAssStmt2Access().getEqualsSignKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__AssStmt2__Group__1__Impl6633); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3290:1: rule__AssStmt2__Group__2 : rule__AssStmt2__Group__2__Impl ;
    public final void rule__AssStmt2__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3294:1: ( rule__AssStmt2__Group__2__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3295:2: rule__AssStmt2__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AssStmt2__Group__2__Impl_in_rule__AssStmt2__Group__26664);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3301:1: rule__AssStmt2__Group__2__Impl : ( ( rule__AssStmt2__ExprAssignment_2 ) ) ;
    public final void rule__AssStmt2__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3305:1: ( ( ( rule__AssStmt2__ExprAssignment_2 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3306:1: ( ( rule__AssStmt2__ExprAssignment_2 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3306:1: ( ( rule__AssStmt2__ExprAssignment_2 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3307:1: ( rule__AssStmt2__ExprAssignment_2 )
            {
             before(grammarAccess.getAssStmt2Access().getExprAssignment_2()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3308:1: ( rule__AssStmt2__ExprAssignment_2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3308:2: rule__AssStmt2__ExprAssignment_2
            {
            pushFollow(FOLLOW_rule__AssStmt2__ExprAssignment_2_in_rule__AssStmt2__Group__2__Impl6691);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3324:1: rule__AttrList__Group__0 : rule__AttrList__Group__0__Impl rule__AttrList__Group__1 ;
    public final void rule__AttrList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3328:1: ( rule__AttrList__Group__0__Impl rule__AttrList__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3329:2: rule__AttrList__Group__0__Impl rule__AttrList__Group__1
            {
            pushFollow(FOLLOW_rule__AttrList__Group__0__Impl_in_rule__AttrList__Group__06727);
            rule__AttrList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrList__Group__1_in_rule__AttrList__Group__06730);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3336:1: rule__AttrList__Group__0__Impl : ( () ) ;
    public final void rule__AttrList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3340:1: ( ( () ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3341:1: ( () )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3341:1: ( () )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3342:1: ()
            {
             before(grammarAccess.getAttrListAccess().getAttrListAction_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3343:1: ()
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3345:1: 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3355:1: rule__AttrList__Group__1 : rule__AttrList__Group__1__Impl ;
    public final void rule__AttrList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3359:1: ( rule__AttrList__Group__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3360:2: rule__AttrList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AttrList__Group__1__Impl_in_rule__AttrList__Group__16788);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3366:1: rule__AttrList__Group__1__Impl : ( ( rule__AttrList__Group_1__0 ) ) ;
    public final void rule__AttrList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3370:1: ( ( ( rule__AttrList__Group_1__0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3371:1: ( ( rule__AttrList__Group_1__0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3371:1: ( ( rule__AttrList__Group_1__0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3372:1: ( rule__AttrList__Group_1__0 )
            {
             before(grammarAccess.getAttrListAccess().getGroup_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3373:1: ( rule__AttrList__Group_1__0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3373:2: rule__AttrList__Group_1__0
            {
            pushFollow(FOLLOW_rule__AttrList__Group_1__0_in_rule__AttrList__Group__1__Impl6815);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3387:1: rule__AttrList__Group_1__0 : rule__AttrList__Group_1__0__Impl rule__AttrList__Group_1__1 ;
    public final void rule__AttrList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3391:1: ( rule__AttrList__Group_1__0__Impl rule__AttrList__Group_1__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3392:2: rule__AttrList__Group_1__0__Impl rule__AttrList__Group_1__1
            {
            pushFollow(FOLLOW_rule__AttrList__Group_1__0__Impl_in_rule__AttrList__Group_1__06849);
            rule__AttrList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrList__Group_1__1_in_rule__AttrList__Group_1__06852);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3399:1: rule__AttrList__Group_1__0__Impl : ( ( rule__AttrList__AttrAssignment_1_0 )? ) ;
    public final void rule__AttrList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3403:1: ( ( ( rule__AttrList__AttrAssignment_1_0 )? ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3404:1: ( ( rule__AttrList__AttrAssignment_1_0 )? )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3404:1: ( ( rule__AttrList__AttrAssignment_1_0 )? )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3405:1: ( rule__AttrList__AttrAssignment_1_0 )?
            {
             before(grammarAccess.getAttrListAccess().getAttrAssignment_1_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3406:1: ( rule__AttrList__AttrAssignment_1_0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3406:2: rule__AttrList__AttrAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__AttrList__AttrAssignment_1_0_in_rule__AttrList__Group_1__0__Impl6879);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3416:1: rule__AttrList__Group_1__1 : rule__AttrList__Group_1__1__Impl ;
    public final void rule__AttrList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3420:1: ( rule__AttrList__Group_1__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3421:2: rule__AttrList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AttrList__Group_1__1__Impl_in_rule__AttrList__Group_1__16910);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3427:1: rule__AttrList__Group_1__1__Impl : ( ( rule__AttrList__Group_1_1__0 )* ) ;
    public final void rule__AttrList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3431:1: ( ( ( rule__AttrList__Group_1_1__0 )* ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3432:1: ( ( rule__AttrList__Group_1_1__0 )* )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3432:1: ( ( rule__AttrList__Group_1_1__0 )* )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3433:1: ( rule__AttrList__Group_1_1__0 )*
            {
             before(grammarAccess.getAttrListAccess().getGroup_1_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3434:1: ( rule__AttrList__Group_1_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==42) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3434:2: rule__AttrList__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AttrList__Group_1_1__0_in_rule__AttrList__Group_1__1__Impl6937);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3448:1: rule__AttrList__Group_1_1__0 : rule__AttrList__Group_1_1__0__Impl rule__AttrList__Group_1_1__1 ;
    public final void rule__AttrList__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3452:1: ( rule__AttrList__Group_1_1__0__Impl rule__AttrList__Group_1_1__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3453:2: rule__AttrList__Group_1_1__0__Impl rule__AttrList__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__AttrList__Group_1_1__0__Impl_in_rule__AttrList__Group_1_1__06972);
            rule__AttrList__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrList__Group_1_1__1_in_rule__AttrList__Group_1_1__06975);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3460:1: rule__AttrList__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__AttrList__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3464:1: ( ( ',' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3465:1: ( ',' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3465:1: ( ',' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3466:1: ','
            {
             before(grammarAccess.getAttrListAccess().getCommaKeyword_1_1_0()); 
            match(input,42,FOLLOW_42_in_rule__AttrList__Group_1_1__0__Impl7003); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3479:1: rule__AttrList__Group_1_1__1 : rule__AttrList__Group_1_1__1__Impl ;
    public final void rule__AttrList__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3483:1: ( rule__AttrList__Group_1_1__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3484:2: rule__AttrList__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AttrList__Group_1_1__1__Impl_in_rule__AttrList__Group_1_1__17034);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3490:1: rule__AttrList__Group_1_1__1__Impl : ( ( rule__AttrList__AttrAssignment_1_1_1 ) ) ;
    public final void rule__AttrList__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3494:1: ( ( ( rule__AttrList__AttrAssignment_1_1_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3495:1: ( ( rule__AttrList__AttrAssignment_1_1_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3495:1: ( ( rule__AttrList__AttrAssignment_1_1_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3496:1: ( rule__AttrList__AttrAssignment_1_1_1 )
            {
             before(grammarAccess.getAttrListAccess().getAttrAssignment_1_1_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3497:1: ( rule__AttrList__AttrAssignment_1_1_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3497:2: rule__AttrList__AttrAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__AttrList__AttrAssignment_1_1_1_in_rule__AttrList__Group_1_1__1__Impl7061);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3511:1: rule__AttrAss__Group__0 : rule__AttrAss__Group__0__Impl rule__AttrAss__Group__1 ;
    public final void rule__AttrAss__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3515:1: ( rule__AttrAss__Group__0__Impl rule__AttrAss__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3516:2: rule__AttrAss__Group__0__Impl rule__AttrAss__Group__1
            {
            pushFollow(FOLLOW_rule__AttrAss__Group__0__Impl_in_rule__AttrAss__Group__07095);
            rule__AttrAss__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrAss__Group__1_in_rule__AttrAss__Group__07098);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3523:1: rule__AttrAss__Group__0__Impl : ( ( rule__AttrAss__NameAssignment_0 ) ) ;
    public final void rule__AttrAss__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3527:1: ( ( ( rule__AttrAss__NameAssignment_0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3528:1: ( ( rule__AttrAss__NameAssignment_0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3528:1: ( ( rule__AttrAss__NameAssignment_0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3529:1: ( rule__AttrAss__NameAssignment_0 )
            {
             before(grammarAccess.getAttrAssAccess().getNameAssignment_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3530:1: ( rule__AttrAss__NameAssignment_0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3530:2: rule__AttrAss__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__AttrAss__NameAssignment_0_in_rule__AttrAss__Group__0__Impl7125);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3540:1: rule__AttrAss__Group__1 : rule__AttrAss__Group__1__Impl rule__AttrAss__Group__2 ;
    public final void rule__AttrAss__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3544:1: ( rule__AttrAss__Group__1__Impl rule__AttrAss__Group__2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3545:2: rule__AttrAss__Group__1__Impl rule__AttrAss__Group__2
            {
            pushFollow(FOLLOW_rule__AttrAss__Group__1__Impl_in_rule__AttrAss__Group__17155);
            rule__AttrAss__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttrAss__Group__2_in_rule__AttrAss__Group__17158);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3552:1: rule__AttrAss__Group__1__Impl : ( '=' ) ;
    public final void rule__AttrAss__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3556:1: ( ( '=' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3557:1: ( '=' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3557:1: ( '=' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3558:1: '='
            {
             before(grammarAccess.getAttrAssAccess().getEqualsSignKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__AttrAss__Group__1__Impl7186); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3571:1: rule__AttrAss__Group__2 : rule__AttrAss__Group__2__Impl ;
    public final void rule__AttrAss__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3575:1: ( rule__AttrAss__Group__2__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3576:2: rule__AttrAss__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AttrAss__Group__2__Impl_in_rule__AttrAss__Group__27217);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3582:1: rule__AttrAss__Group__2__Impl : ( ( rule__AttrAss__ExprAssignment_2 ) ) ;
    public final void rule__AttrAss__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3586:1: ( ( ( rule__AttrAss__ExprAssignment_2 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3587:1: ( ( rule__AttrAss__ExprAssignment_2 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3587:1: ( ( rule__AttrAss__ExprAssignment_2 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3588:1: ( rule__AttrAss__ExprAssignment_2 )
            {
             before(grammarAccess.getAttrAssAccess().getExprAssignment_2()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3589:1: ( rule__AttrAss__ExprAssignment_2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3589:2: rule__AttrAss__ExprAssignment_2
            {
            pushFollow(FOLLOW_rule__AttrAss__ExprAssignment_2_in_rule__AttrAss__Group__2__Impl7244);
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


    // $ANTLR start "rule__Disj__Group__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3605:1: rule__Disj__Group__0 : rule__Disj__Group__0__Impl rule__Disj__Group__1 ;
    public final void rule__Disj__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3609:1: ( rule__Disj__Group__0__Impl rule__Disj__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3610:2: rule__Disj__Group__0__Impl rule__Disj__Group__1
            {
            pushFollow(FOLLOW_rule__Disj__Group__0__Impl_in_rule__Disj__Group__07280);
            rule__Disj__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Disj__Group__1_in_rule__Disj__Group__07283);
            rule__Disj__Group__1();

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
    // $ANTLR end "rule__Disj__Group__0"


    // $ANTLR start "rule__Disj__Group__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3617:1: rule__Disj__Group__0__Impl : ( ( rule__Disj__ConjAssignment_0 ) ) ;
    public final void rule__Disj__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3621:1: ( ( ( rule__Disj__ConjAssignment_0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3622:1: ( ( rule__Disj__ConjAssignment_0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3622:1: ( ( rule__Disj__ConjAssignment_0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3623:1: ( rule__Disj__ConjAssignment_0 )
            {
             before(grammarAccess.getDisjAccess().getConjAssignment_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3624:1: ( rule__Disj__ConjAssignment_0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3624:2: rule__Disj__ConjAssignment_0
            {
            pushFollow(FOLLOW_rule__Disj__ConjAssignment_0_in_rule__Disj__Group__0__Impl7310);
            rule__Disj__ConjAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDisjAccess().getConjAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disj__Group__0__Impl"


    // $ANTLR start "rule__Disj__Group__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3634:1: rule__Disj__Group__1 : rule__Disj__Group__1__Impl ;
    public final void rule__Disj__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3638:1: ( rule__Disj__Group__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3639:2: rule__Disj__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Disj__Group__1__Impl_in_rule__Disj__Group__17340);
            rule__Disj__Group__1__Impl();

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
    // $ANTLR end "rule__Disj__Group__1"


    // $ANTLR start "rule__Disj__Group__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3645:1: rule__Disj__Group__1__Impl : ( ( rule__Disj__Group_1__0 )* ) ;
    public final void rule__Disj__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3649:1: ( ( ( rule__Disj__Group_1__0 )* ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3650:1: ( ( rule__Disj__Group_1__0 )* )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3650:1: ( ( rule__Disj__Group_1__0 )* )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3651:1: ( rule__Disj__Group_1__0 )*
            {
             before(grammarAccess.getDisjAccess().getGroup_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3652:1: ( rule__Disj__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==43) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3652:2: rule__Disj__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Disj__Group_1__0_in_rule__Disj__Group__1__Impl7367);
            	    rule__Disj__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getDisjAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disj__Group__1__Impl"


    // $ANTLR start "rule__Disj__Group_1__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3666:1: rule__Disj__Group_1__0 : rule__Disj__Group_1__0__Impl rule__Disj__Group_1__1 ;
    public final void rule__Disj__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3670:1: ( rule__Disj__Group_1__0__Impl rule__Disj__Group_1__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3671:2: rule__Disj__Group_1__0__Impl rule__Disj__Group_1__1
            {
            pushFollow(FOLLOW_rule__Disj__Group_1__0__Impl_in_rule__Disj__Group_1__07402);
            rule__Disj__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Disj__Group_1__1_in_rule__Disj__Group_1__07405);
            rule__Disj__Group_1__1();

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
    // $ANTLR end "rule__Disj__Group_1__0"


    // $ANTLR start "rule__Disj__Group_1__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3678:1: rule__Disj__Group_1__0__Impl : ( '||' ) ;
    public final void rule__Disj__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3682:1: ( ( '||' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3683:1: ( '||' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3683:1: ( '||' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3684:1: '||'
            {
             before(grammarAccess.getDisjAccess().getVerticalLineVerticalLineKeyword_1_0()); 
            match(input,43,FOLLOW_43_in_rule__Disj__Group_1__0__Impl7433); 
             after(grammarAccess.getDisjAccess().getVerticalLineVerticalLineKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disj__Group_1__0__Impl"


    // $ANTLR start "rule__Disj__Group_1__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3697:1: rule__Disj__Group_1__1 : rule__Disj__Group_1__1__Impl ;
    public final void rule__Disj__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3701:1: ( rule__Disj__Group_1__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3702:2: rule__Disj__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Disj__Group_1__1__Impl_in_rule__Disj__Group_1__17464);
            rule__Disj__Group_1__1__Impl();

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
    // $ANTLR end "rule__Disj__Group_1__1"


    // $ANTLR start "rule__Disj__Group_1__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3708:1: rule__Disj__Group_1__1__Impl : ( ( rule__Disj__ConjAssignment_1_1 ) ) ;
    public final void rule__Disj__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3712:1: ( ( ( rule__Disj__ConjAssignment_1_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3713:1: ( ( rule__Disj__ConjAssignment_1_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3713:1: ( ( rule__Disj__ConjAssignment_1_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3714:1: ( rule__Disj__ConjAssignment_1_1 )
            {
             before(grammarAccess.getDisjAccess().getConjAssignment_1_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3715:1: ( rule__Disj__ConjAssignment_1_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3715:2: rule__Disj__ConjAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Disj__ConjAssignment_1_1_in_rule__Disj__Group_1__1__Impl7491);
            rule__Disj__ConjAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDisjAccess().getConjAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disj__Group_1__1__Impl"


    // $ANTLR start "rule__Conj__Group__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3729:1: rule__Conj__Group__0 : rule__Conj__Group__0__Impl rule__Conj__Group__1 ;
    public final void rule__Conj__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3733:1: ( rule__Conj__Group__0__Impl rule__Conj__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3734:2: rule__Conj__Group__0__Impl rule__Conj__Group__1
            {
            pushFollow(FOLLOW_rule__Conj__Group__0__Impl_in_rule__Conj__Group__07525);
            rule__Conj__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conj__Group__1_in_rule__Conj__Group__07528);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3741:1: rule__Conj__Group__0__Impl : ( ( rule__Conj__RelatAssignment_0 ) ) ;
    public final void rule__Conj__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3745:1: ( ( ( rule__Conj__RelatAssignment_0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3746:1: ( ( rule__Conj__RelatAssignment_0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3746:1: ( ( rule__Conj__RelatAssignment_0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3747:1: ( rule__Conj__RelatAssignment_0 )
            {
             before(grammarAccess.getConjAccess().getRelatAssignment_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3748:1: ( rule__Conj__RelatAssignment_0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3748:2: rule__Conj__RelatAssignment_0
            {
            pushFollow(FOLLOW_rule__Conj__RelatAssignment_0_in_rule__Conj__Group__0__Impl7555);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3758:1: rule__Conj__Group__1 : rule__Conj__Group__1__Impl ;
    public final void rule__Conj__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3762:1: ( rule__Conj__Group__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3763:2: rule__Conj__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Conj__Group__1__Impl_in_rule__Conj__Group__17585);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3769:1: rule__Conj__Group__1__Impl : ( ( rule__Conj__Group_1__0 )* ) ;
    public final void rule__Conj__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3773:1: ( ( ( rule__Conj__Group_1__0 )* ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3774:1: ( ( rule__Conj__Group_1__0 )* )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3774:1: ( ( rule__Conj__Group_1__0 )* )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3775:1: ( rule__Conj__Group_1__0 )*
            {
             before(grammarAccess.getConjAccess().getGroup_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3776:1: ( rule__Conj__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==44) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3776:2: rule__Conj__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Conj__Group_1__0_in_rule__Conj__Group__1__Impl7612);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3790:1: rule__Conj__Group_1__0 : rule__Conj__Group_1__0__Impl rule__Conj__Group_1__1 ;
    public final void rule__Conj__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3794:1: ( rule__Conj__Group_1__0__Impl rule__Conj__Group_1__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3795:2: rule__Conj__Group_1__0__Impl rule__Conj__Group_1__1
            {
            pushFollow(FOLLOW_rule__Conj__Group_1__0__Impl_in_rule__Conj__Group_1__07647);
            rule__Conj__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Conj__Group_1__1_in_rule__Conj__Group_1__07650);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3802:1: rule__Conj__Group_1__0__Impl : ( '&&' ) ;
    public final void rule__Conj__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3806:1: ( ( '&&' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3807:1: ( '&&' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3807:1: ( '&&' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3808:1: '&&'
            {
             before(grammarAccess.getConjAccess().getAmpersandAmpersandKeyword_1_0()); 
            match(input,44,FOLLOW_44_in_rule__Conj__Group_1__0__Impl7678); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3821:1: rule__Conj__Group_1__1 : rule__Conj__Group_1__1__Impl ;
    public final void rule__Conj__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3825:1: ( rule__Conj__Group_1__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3826:2: rule__Conj__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Conj__Group_1__1__Impl_in_rule__Conj__Group_1__17709);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3832:1: rule__Conj__Group_1__1__Impl : ( ( rule__Conj__RelatAssignment_1_1 ) ) ;
    public final void rule__Conj__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3836:1: ( ( ( rule__Conj__RelatAssignment_1_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3837:1: ( ( rule__Conj__RelatAssignment_1_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3837:1: ( ( rule__Conj__RelatAssignment_1_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3838:1: ( rule__Conj__RelatAssignment_1_1 )
            {
             before(grammarAccess.getConjAccess().getRelatAssignment_1_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3839:1: ( rule__Conj__RelatAssignment_1_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3839:2: rule__Conj__RelatAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Conj__RelatAssignment_1_1_in_rule__Conj__Group_1__1__Impl7736);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3853:1: rule__Relat__Group__0 : rule__Relat__Group__0__Impl rule__Relat__Group__1 ;
    public final void rule__Relat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3857:1: ( rule__Relat__Group__0__Impl rule__Relat__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3858:2: rule__Relat__Group__0__Impl rule__Relat__Group__1
            {
            pushFollow(FOLLOW_rule__Relat__Group__0__Impl_in_rule__Relat__Group__07770);
            rule__Relat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relat__Group__1_in_rule__Relat__Group__07773);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3865:1: rule__Relat__Group__0__Impl : ( ( rule__Relat__AddAssignment_0 ) ) ;
    public final void rule__Relat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3869:1: ( ( ( rule__Relat__AddAssignment_0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3870:1: ( ( rule__Relat__AddAssignment_0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3870:1: ( ( rule__Relat__AddAssignment_0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3871:1: ( rule__Relat__AddAssignment_0 )
            {
             before(grammarAccess.getRelatAccess().getAddAssignment_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3872:1: ( rule__Relat__AddAssignment_0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3872:2: rule__Relat__AddAssignment_0
            {
            pushFollow(FOLLOW_rule__Relat__AddAssignment_0_in_rule__Relat__Group__0__Impl7800);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3882:1: rule__Relat__Group__1 : rule__Relat__Group__1__Impl ;
    public final void rule__Relat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3886:1: ( rule__Relat__Group__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3887:2: rule__Relat__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Relat__Group__1__Impl_in_rule__Relat__Group__17830);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3893:1: rule__Relat__Group__1__Impl : ( ( rule__Relat__Group_1__0 )* ) ;
    public final void rule__Relat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3897:1: ( ( ( rule__Relat__Group_1__0 )* ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3898:1: ( ( rule__Relat__Group_1__0 )* )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3898:1: ( ( rule__Relat__Group_1__0 )* )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3899:1: ( rule__Relat__Group_1__0 )*
            {
             before(grammarAccess.getRelatAccess().getGroup_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3900:1: ( rule__Relat__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=19 && LA23_0<=21)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3900:2: rule__Relat__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Relat__Group_1__0_in_rule__Relat__Group__1__Impl7857);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3914:1: rule__Relat__Group_1__0 : rule__Relat__Group_1__0__Impl rule__Relat__Group_1__1 ;
    public final void rule__Relat__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3918:1: ( rule__Relat__Group_1__0__Impl rule__Relat__Group_1__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3919:2: rule__Relat__Group_1__0__Impl rule__Relat__Group_1__1
            {
            pushFollow(FOLLOW_rule__Relat__Group_1__0__Impl_in_rule__Relat__Group_1__07892);
            rule__Relat__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Relat__Group_1__1_in_rule__Relat__Group_1__07895);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3926:1: rule__Relat__Group_1__0__Impl : ( ( rule__Relat__Alternatives_1_0 ) ) ;
    public final void rule__Relat__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3930:1: ( ( ( rule__Relat__Alternatives_1_0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3931:1: ( ( rule__Relat__Alternatives_1_0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3931:1: ( ( rule__Relat__Alternatives_1_0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3932:1: ( rule__Relat__Alternatives_1_0 )
            {
             before(grammarAccess.getRelatAccess().getAlternatives_1_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3933:1: ( rule__Relat__Alternatives_1_0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3933:2: rule__Relat__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Relat__Alternatives_1_0_in_rule__Relat__Group_1__0__Impl7922);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3943:1: rule__Relat__Group_1__1 : rule__Relat__Group_1__1__Impl ;
    public final void rule__Relat__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3947:1: ( rule__Relat__Group_1__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3948:2: rule__Relat__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Relat__Group_1__1__Impl_in_rule__Relat__Group_1__17952);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3954:1: rule__Relat__Group_1__1__Impl : ( ( rule__Relat__AddAssignment_1_1 ) ) ;
    public final void rule__Relat__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3958:1: ( ( ( rule__Relat__AddAssignment_1_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3959:1: ( ( rule__Relat__AddAssignment_1_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3959:1: ( ( rule__Relat__AddAssignment_1_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3960:1: ( rule__Relat__AddAssignment_1_1 )
            {
             before(grammarAccess.getRelatAccess().getAddAssignment_1_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3961:1: ( rule__Relat__AddAssignment_1_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3961:2: rule__Relat__AddAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Relat__AddAssignment_1_1_in_rule__Relat__Group_1__1__Impl7979);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3975:1: rule__Add__Group__0 : rule__Add__Group__0__Impl rule__Add__Group__1 ;
    public final void rule__Add__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3979:1: ( rule__Add__Group__0__Impl rule__Add__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3980:2: rule__Add__Group__0__Impl rule__Add__Group__1
            {
            pushFollow(FOLLOW_rule__Add__Group__0__Impl_in_rule__Add__Group__08013);
            rule__Add__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Add__Group__1_in_rule__Add__Group__08016);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3987:1: rule__Add__Group__0__Impl : ( ( rule__Add__MultAssignment_0 ) ) ;
    public final void rule__Add__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3991:1: ( ( ( rule__Add__MultAssignment_0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3992:1: ( ( rule__Add__MultAssignment_0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3992:1: ( ( rule__Add__MultAssignment_0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3993:1: ( rule__Add__MultAssignment_0 )
            {
             before(grammarAccess.getAddAccess().getMultAssignment_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3994:1: ( rule__Add__MultAssignment_0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:3994:2: rule__Add__MultAssignment_0
            {
            pushFollow(FOLLOW_rule__Add__MultAssignment_0_in_rule__Add__Group__0__Impl8043);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4004:1: rule__Add__Group__1 : rule__Add__Group__1__Impl ;
    public final void rule__Add__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4008:1: ( rule__Add__Group__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4009:2: rule__Add__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Add__Group__1__Impl_in_rule__Add__Group__18073);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4015:1: rule__Add__Group__1__Impl : ( ( rule__Add__Group_1__0 )* ) ;
    public final void rule__Add__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4019:1: ( ( ( rule__Add__Group_1__0 )* ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4020:1: ( ( rule__Add__Group_1__0 )* )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4020:1: ( ( rule__Add__Group_1__0 )* )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4021:1: ( rule__Add__Group_1__0 )*
            {
             before(grammarAccess.getAddAccess().getGroup_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4022:1: ( rule__Add__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=22 && LA24_0<=23)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4022:2: rule__Add__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Add__Group_1__0_in_rule__Add__Group__1__Impl8100);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4036:1: rule__Add__Group_1__0 : rule__Add__Group_1__0__Impl rule__Add__Group_1__1 ;
    public final void rule__Add__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4040:1: ( rule__Add__Group_1__0__Impl rule__Add__Group_1__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4041:2: rule__Add__Group_1__0__Impl rule__Add__Group_1__1
            {
            pushFollow(FOLLOW_rule__Add__Group_1__0__Impl_in_rule__Add__Group_1__08135);
            rule__Add__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Add__Group_1__1_in_rule__Add__Group_1__08138);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4048:1: rule__Add__Group_1__0__Impl : ( ( rule__Add__Alternatives_1_0 ) ) ;
    public final void rule__Add__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4052:1: ( ( ( rule__Add__Alternatives_1_0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4053:1: ( ( rule__Add__Alternatives_1_0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4053:1: ( ( rule__Add__Alternatives_1_0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4054:1: ( rule__Add__Alternatives_1_0 )
            {
             before(grammarAccess.getAddAccess().getAlternatives_1_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4055:1: ( rule__Add__Alternatives_1_0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4055:2: rule__Add__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Add__Alternatives_1_0_in_rule__Add__Group_1__0__Impl8165);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4065:1: rule__Add__Group_1__1 : rule__Add__Group_1__1__Impl ;
    public final void rule__Add__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4069:1: ( rule__Add__Group_1__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4070:2: rule__Add__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Add__Group_1__1__Impl_in_rule__Add__Group_1__18195);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4076:1: rule__Add__Group_1__1__Impl : ( ( rule__Add__MultAssignment_1_1 ) ) ;
    public final void rule__Add__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4080:1: ( ( ( rule__Add__MultAssignment_1_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4081:1: ( ( rule__Add__MultAssignment_1_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4081:1: ( ( rule__Add__MultAssignment_1_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4082:1: ( rule__Add__MultAssignment_1_1 )
            {
             before(grammarAccess.getAddAccess().getMultAssignment_1_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4083:1: ( rule__Add__MultAssignment_1_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4083:2: rule__Add__MultAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Add__MultAssignment_1_1_in_rule__Add__Group_1__1__Impl8222);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4097:1: rule__Mult__Group__0 : rule__Mult__Group__0__Impl rule__Mult__Group__1 ;
    public final void rule__Mult__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4101:1: ( rule__Mult__Group__0__Impl rule__Mult__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4102:2: rule__Mult__Group__0__Impl rule__Mult__Group__1
            {
            pushFollow(FOLLOW_rule__Mult__Group__0__Impl_in_rule__Mult__Group__08256);
            rule__Mult__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mult__Group__1_in_rule__Mult__Group__08259);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4109:1: rule__Mult__Group__0__Impl : ( ( rule__Mult__UnaryAssignment_0 ) ) ;
    public final void rule__Mult__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4113:1: ( ( ( rule__Mult__UnaryAssignment_0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4114:1: ( ( rule__Mult__UnaryAssignment_0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4114:1: ( ( rule__Mult__UnaryAssignment_0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4115:1: ( rule__Mult__UnaryAssignment_0 )
            {
             before(grammarAccess.getMultAccess().getUnaryAssignment_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4116:1: ( rule__Mult__UnaryAssignment_0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4116:2: rule__Mult__UnaryAssignment_0
            {
            pushFollow(FOLLOW_rule__Mult__UnaryAssignment_0_in_rule__Mult__Group__0__Impl8286);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4126:1: rule__Mult__Group__1 : rule__Mult__Group__1__Impl ;
    public final void rule__Mult__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4130:1: ( rule__Mult__Group__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4131:2: rule__Mult__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Mult__Group__1__Impl_in_rule__Mult__Group__18316);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4137:1: rule__Mult__Group__1__Impl : ( ( rule__Mult__Group_1__0 )* ) ;
    public final void rule__Mult__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4141:1: ( ( ( rule__Mult__Group_1__0 )* ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4142:1: ( ( rule__Mult__Group_1__0 )* )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4142:1: ( ( rule__Mult__Group_1__0 )* )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4143:1: ( rule__Mult__Group_1__0 )*
            {
             before(grammarAccess.getMultAccess().getGroup_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4144:1: ( rule__Mult__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=24 && LA25_0<=25)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4144:2: rule__Mult__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Mult__Group_1__0_in_rule__Mult__Group__1__Impl8343);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4158:1: rule__Mult__Group_1__0 : rule__Mult__Group_1__0__Impl rule__Mult__Group_1__1 ;
    public final void rule__Mult__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4162:1: ( rule__Mult__Group_1__0__Impl rule__Mult__Group_1__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4163:2: rule__Mult__Group_1__0__Impl rule__Mult__Group_1__1
            {
            pushFollow(FOLLOW_rule__Mult__Group_1__0__Impl_in_rule__Mult__Group_1__08378);
            rule__Mult__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mult__Group_1__1_in_rule__Mult__Group_1__08381);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4170:1: rule__Mult__Group_1__0__Impl : ( ( rule__Mult__Alternatives_1_0 ) ) ;
    public final void rule__Mult__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4174:1: ( ( ( rule__Mult__Alternatives_1_0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4175:1: ( ( rule__Mult__Alternatives_1_0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4175:1: ( ( rule__Mult__Alternatives_1_0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4176:1: ( rule__Mult__Alternatives_1_0 )
            {
             before(grammarAccess.getMultAccess().getAlternatives_1_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4177:1: ( rule__Mult__Alternatives_1_0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4177:2: rule__Mult__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Mult__Alternatives_1_0_in_rule__Mult__Group_1__0__Impl8408);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4187:1: rule__Mult__Group_1__1 : rule__Mult__Group_1__1__Impl ;
    public final void rule__Mult__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4191:1: ( rule__Mult__Group_1__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4192:2: rule__Mult__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Mult__Group_1__1__Impl_in_rule__Mult__Group_1__18438);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4198:1: rule__Mult__Group_1__1__Impl : ( ( rule__Mult__UnaryAssignment_1_1 ) ) ;
    public final void rule__Mult__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4202:1: ( ( ( rule__Mult__UnaryAssignment_1_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4203:1: ( ( rule__Mult__UnaryAssignment_1_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4203:1: ( ( rule__Mult__UnaryAssignment_1_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4204:1: ( rule__Mult__UnaryAssignment_1_1 )
            {
             before(grammarAccess.getMultAccess().getUnaryAssignment_1_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4205:1: ( rule__Mult__UnaryAssignment_1_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4205:2: rule__Mult__UnaryAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Mult__UnaryAssignment_1_1_in_rule__Mult__Group_1__1__Impl8465);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4219:1: rule__Unary__Group__0 : rule__Unary__Group__0__Impl rule__Unary__Group__1 ;
    public final void rule__Unary__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4223:1: ( rule__Unary__Group__0__Impl rule__Unary__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4224:2: rule__Unary__Group__0__Impl rule__Unary__Group__1
            {
            pushFollow(FOLLOW_rule__Unary__Group__0__Impl_in_rule__Unary__Group__08499);
            rule__Unary__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Unary__Group__1_in_rule__Unary__Group__08502);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4231:1: rule__Unary__Group__0__Impl : ( ( rule__Unary__Alternatives_0 )* ) ;
    public final void rule__Unary__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4235:1: ( ( ( rule__Unary__Alternatives_0 )* ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4236:1: ( ( rule__Unary__Alternatives_0 )* )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4236:1: ( ( rule__Unary__Alternatives_0 )* )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4237:1: ( rule__Unary__Alternatives_0 )*
            {
             before(grammarAccess.getUnaryAccess().getAlternatives_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4238:1: ( rule__Unary__Alternatives_0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==23||LA26_0==26) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4238:2: rule__Unary__Alternatives_0
            	    {
            	    pushFollow(FOLLOW_rule__Unary__Alternatives_0_in_rule__Unary__Group__0__Impl8529);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4248:1: rule__Unary__Group__1 : rule__Unary__Group__1__Impl ;
    public final void rule__Unary__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4252:1: ( rule__Unary__Group__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4253:2: rule__Unary__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Unary__Group__1__Impl_in_rule__Unary__Group__18560);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4259:1: rule__Unary__Group__1__Impl : ( ( rule__Unary__AtomAssignment_1 ) ) ;
    public final void rule__Unary__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4263:1: ( ( ( rule__Unary__AtomAssignment_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4264:1: ( ( rule__Unary__AtomAssignment_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4264:1: ( ( rule__Unary__AtomAssignment_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4265:1: ( rule__Unary__AtomAssignment_1 )
            {
             before(grammarAccess.getUnaryAccess().getAtomAssignment_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4266:1: ( rule__Unary__AtomAssignment_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4266:2: rule__Unary__AtomAssignment_1
            {
            pushFollow(FOLLOW_rule__Unary__AtomAssignment_1_in_rule__Unary__Group__1__Impl8587);
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


    // $ANTLR start "rule__Atom__Group__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4280:1: rule__Atom__Group__0 : rule__Atom__Group__0__Impl rule__Atom__Group__1 ;
    public final void rule__Atom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4284:1: ( rule__Atom__Group__0__Impl rule__Atom__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4285:2: rule__Atom__Group__0__Impl rule__Atom__Group__1
            {
            pushFollow(FOLLOW_rule__Atom__Group__0__Impl_in_rule__Atom__Group__08621);
            rule__Atom__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atom__Group__1_in_rule__Atom__Group__08624);
            rule__Atom__Group__1();

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
    // $ANTLR end "rule__Atom__Group__0"


    // $ANTLR start "rule__Atom__Group__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4292:1: rule__Atom__Group__0__Impl : ( () ) ;
    public final void rule__Atom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4296:1: ( ( () ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4297:1: ( () )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4297:1: ( () )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4298:1: ()
            {
             before(grammarAccess.getAtomAccess().getAtomAction_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4299:1: ()
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4301:1: 
            {
            }

             after(grammarAccess.getAtomAccess().getAtomAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group__0__Impl"


    // $ANTLR start "rule__Atom__Group__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4311:1: rule__Atom__Group__1 : rule__Atom__Group__1__Impl ;
    public final void rule__Atom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4315:1: ( rule__Atom__Group__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4316:2: rule__Atom__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Atom__Group__1__Impl_in_rule__Atom__Group__18682);
            rule__Atom__Group__1__Impl();

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
    // $ANTLR end "rule__Atom__Group__1"


    // $ANTLR start "rule__Atom__Group__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4322:1: rule__Atom__Group__1__Impl : ( ( rule__Atom__Alternatives_1 ) ) ;
    public final void rule__Atom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4326:1: ( ( ( rule__Atom__Alternatives_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4327:1: ( ( rule__Atom__Alternatives_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4327:1: ( ( rule__Atom__Alternatives_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4328:1: ( rule__Atom__Alternatives_1 )
            {
             before(grammarAccess.getAtomAccess().getAlternatives_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4329:1: ( rule__Atom__Alternatives_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4329:2: rule__Atom__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Atom__Alternatives_1_in_rule__Atom__Group__1__Impl8709);
            rule__Atom__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group__1__Impl"


    // $ANTLR start "rule__Atom__Group_1_1__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4343:1: rule__Atom__Group_1_1__0 : rule__Atom__Group_1_1__0__Impl rule__Atom__Group_1_1__1 ;
    public final void rule__Atom__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4347:1: ( rule__Atom__Group_1_1__0__Impl rule__Atom__Group_1_1__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4348:2: rule__Atom__Group_1_1__0__Impl rule__Atom__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Atom__Group_1_1__0__Impl_in_rule__Atom__Group_1_1__08743);
            rule__Atom__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atom__Group_1_1__1_in_rule__Atom__Group_1_1__08746);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4355:1: rule__Atom__Group_1_1__0__Impl : ( ( rule__Atom__Var1Assignment_1_1_0 ) ) ;
    public final void rule__Atom__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4359:1: ( ( ( rule__Atom__Var1Assignment_1_1_0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4360:1: ( ( rule__Atom__Var1Assignment_1_1_0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4360:1: ( ( rule__Atom__Var1Assignment_1_1_0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4361:1: ( rule__Atom__Var1Assignment_1_1_0 )
            {
             before(grammarAccess.getAtomAccess().getVar1Assignment_1_1_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4362:1: ( rule__Atom__Var1Assignment_1_1_0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4362:2: rule__Atom__Var1Assignment_1_1_0
            {
            pushFollow(FOLLOW_rule__Atom__Var1Assignment_1_1_0_in_rule__Atom__Group_1_1__0__Impl8773);
            rule__Atom__Var1Assignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getVar1Assignment_1_1_0()); 

            }


            }

        }
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4372:1: rule__Atom__Group_1_1__1 : rule__Atom__Group_1_1__1__Impl ;
    public final void rule__Atom__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4376:1: ( rule__Atom__Group_1_1__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4377:2: rule__Atom__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Atom__Group_1_1__1__Impl_in_rule__Atom__Group_1_1__18803);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4383:1: rule__Atom__Group_1_1__1__Impl : ( ( rule__Atom__Group_1_1_1__0 )? ) ;
    public final void rule__Atom__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4387:1: ( ( ( rule__Atom__Group_1_1_1__0 )? ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4388:1: ( ( rule__Atom__Group_1_1_1__0 )? )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4388:1: ( ( rule__Atom__Group_1_1_1__0 )? )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4389:1: ( rule__Atom__Group_1_1_1__0 )?
            {
             before(grammarAccess.getAtomAccess().getGroup_1_1_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4390:1: ( rule__Atom__Group_1_1_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==45) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4390:2: rule__Atom__Group_1_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Atom__Group_1_1_1__0_in_rule__Atom__Group_1_1__1__Impl8830);
                    rule__Atom__Group_1_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAtomAccess().getGroup_1_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Atom__Group_1_1_1__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4404:1: rule__Atom__Group_1_1_1__0 : rule__Atom__Group_1_1_1__0__Impl rule__Atom__Group_1_1_1__1 ;
    public final void rule__Atom__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4408:1: ( rule__Atom__Group_1_1_1__0__Impl rule__Atom__Group_1_1_1__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4409:2: rule__Atom__Group_1_1_1__0__Impl rule__Atom__Group_1_1_1__1
            {
            pushFollow(FOLLOW_rule__Atom__Group_1_1_1__0__Impl_in_rule__Atom__Group_1_1_1__08865);
            rule__Atom__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atom__Group_1_1_1__1_in_rule__Atom__Group_1_1_1__08868);
            rule__Atom__Group_1_1_1__1();

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
    // $ANTLR end "rule__Atom__Group_1_1_1__0"


    // $ANTLR start "rule__Atom__Group_1_1_1__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4416:1: rule__Atom__Group_1_1_1__0__Impl : ( 'touches' ) ;
    public final void rule__Atom__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4420:1: ( ( 'touches' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4421:1: ( 'touches' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4421:1: ( 'touches' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4422:1: 'touches'
            {
             before(grammarAccess.getAtomAccess().getTouchesKeyword_1_1_1_0()); 
            match(input,45,FOLLOW_45_in_rule__Atom__Group_1_1_1__0__Impl8896); 
             after(grammarAccess.getAtomAccess().getTouchesKeyword_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__Atom__Group_1_1_1__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4435:1: rule__Atom__Group_1_1_1__1 : rule__Atom__Group_1_1_1__1__Impl ;
    public final void rule__Atom__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4439:1: ( rule__Atom__Group_1_1_1__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4440:2: rule__Atom__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Atom__Group_1_1_1__1__Impl_in_rule__Atom__Group_1_1_1__18927);
            rule__Atom__Group_1_1_1__1__Impl();

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
    // $ANTLR end "rule__Atom__Group_1_1_1__1"


    // $ANTLR start "rule__Atom__Group_1_1_1__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4446:1: rule__Atom__Group_1_1_1__1__Impl : ( ( rule__Atom__Var2Assignment_1_1_1_1 ) ) ;
    public final void rule__Atom__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4450:1: ( ( ( rule__Atom__Var2Assignment_1_1_1_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4451:1: ( ( rule__Atom__Var2Assignment_1_1_1_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4451:1: ( ( rule__Atom__Var2Assignment_1_1_1_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4452:1: ( rule__Atom__Var2Assignment_1_1_1_1 )
            {
             before(grammarAccess.getAtomAccess().getVar2Assignment_1_1_1_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4453:1: ( rule__Atom__Var2Assignment_1_1_1_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4453:2: rule__Atom__Var2Assignment_1_1_1_1
            {
            pushFollow(FOLLOW_rule__Atom__Var2Assignment_1_1_1_1_in_rule__Atom__Group_1_1_1__1__Impl8954);
            rule__Atom__Var2Assignment_1_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getVar2Assignment_1_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__Atom__Group_1_2__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4467:1: rule__Atom__Group_1_2__0 : rule__Atom__Group_1_2__0__Impl rule__Atom__Group_1_2__1 ;
    public final void rule__Atom__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4471:1: ( rule__Atom__Group_1_2__0__Impl rule__Atom__Group_1_2__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4472:2: rule__Atom__Group_1_2__0__Impl rule__Atom__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Atom__Group_1_2__0__Impl_in_rule__Atom__Group_1_2__08988);
            rule__Atom__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atom__Group_1_2__1_in_rule__Atom__Group_1_2__08991);
            rule__Atom__Group_1_2__1();

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
    // $ANTLR end "rule__Atom__Group_1_2__0"


    // $ANTLR start "rule__Atom__Group_1_2__0__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4479:1: rule__Atom__Group_1_2__0__Impl : ( '(' ) ;
    public final void rule__Atom__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4483:1: ( ( '(' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4484:1: ( '(' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4484:1: ( '(' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4485:1: '('
            {
             before(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_2_0()); 
            match(input,28,FOLLOW_28_in_rule__Atom__Group_1_2__0__Impl9019); 
             after(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1_2__0__Impl"


    // $ANTLR start "rule__Atom__Group_1_2__1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4498:1: rule__Atom__Group_1_2__1 : rule__Atom__Group_1_2__1__Impl rule__Atom__Group_1_2__2 ;
    public final void rule__Atom__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4502:1: ( rule__Atom__Group_1_2__1__Impl rule__Atom__Group_1_2__2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4503:2: rule__Atom__Group_1_2__1__Impl rule__Atom__Group_1_2__2
            {
            pushFollow(FOLLOW_rule__Atom__Group_1_2__1__Impl_in_rule__Atom__Group_1_2__19050);
            rule__Atom__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Atom__Group_1_2__2_in_rule__Atom__Group_1_2__19053);
            rule__Atom__Group_1_2__2();

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
    // $ANTLR end "rule__Atom__Group_1_2__1"


    // $ANTLR start "rule__Atom__Group_1_2__1__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4510:1: rule__Atom__Group_1_2__1__Impl : ( ( rule__Atom__ExprAssignment_1_2_1 ) ) ;
    public final void rule__Atom__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4514:1: ( ( ( rule__Atom__ExprAssignment_1_2_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4515:1: ( ( rule__Atom__ExprAssignment_1_2_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4515:1: ( ( rule__Atom__ExprAssignment_1_2_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4516:1: ( rule__Atom__ExprAssignment_1_2_1 )
            {
             before(grammarAccess.getAtomAccess().getExprAssignment_1_2_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4517:1: ( rule__Atom__ExprAssignment_1_2_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4517:2: rule__Atom__ExprAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__Atom__ExprAssignment_1_2_1_in_rule__Atom__Group_1_2__1__Impl9080);
            rule__Atom__ExprAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomAccess().getExprAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1_2__1__Impl"


    // $ANTLR start "rule__Atom__Group_1_2__2"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4527:1: rule__Atom__Group_1_2__2 : rule__Atom__Group_1_2__2__Impl ;
    public final void rule__Atom__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4531:1: ( rule__Atom__Group_1_2__2__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4532:2: rule__Atom__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Atom__Group_1_2__2__Impl_in_rule__Atom__Group_1_2__29110);
            rule__Atom__Group_1_2__2__Impl();

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
    // $ANTLR end "rule__Atom__Group_1_2__2"


    // $ANTLR start "rule__Atom__Group_1_2__2__Impl"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4538:1: rule__Atom__Group_1_2__2__Impl : ( ')' ) ;
    public final void rule__Atom__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4542:1: ( ( ')' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4543:1: ( ')' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4543:1: ( ')' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4544:1: ')'
            {
             before(grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_2_2()); 
            match(input,29,FOLLOW_29_in_rule__Atom__Group_1_2__2__Impl9138); 
             after(grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Group_1_2__2__Impl"


    // $ANTLR start "rule__Var__Group__0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4563:1: rule__Var__Group__0 : rule__Var__Group__0__Impl rule__Var__Group__1 ;
    public final void rule__Var__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4567:1: ( rule__Var__Group__0__Impl rule__Var__Group__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4568:2: rule__Var__Group__0__Impl rule__Var__Group__1
            {
            pushFollow(FOLLOW_rule__Var__Group__0__Impl_in_rule__Var__Group__09175);
            rule__Var__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Var__Group__1_in_rule__Var__Group__09178);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4575:1: rule__Var__Group__0__Impl : ( ( rule__Var__NameAssignment_0 ) ) ;
    public final void rule__Var__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4579:1: ( ( ( rule__Var__NameAssignment_0 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4580:1: ( ( rule__Var__NameAssignment_0 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4580:1: ( ( rule__Var__NameAssignment_0 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4581:1: ( rule__Var__NameAssignment_0 )
            {
             before(grammarAccess.getVarAccess().getNameAssignment_0()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4582:1: ( rule__Var__NameAssignment_0 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4582:2: rule__Var__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Var__NameAssignment_0_in_rule__Var__Group__0__Impl9205);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4592:1: rule__Var__Group__1 : rule__Var__Group__1__Impl ;
    public final void rule__Var__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4596:1: ( rule__Var__Group__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4597:2: rule__Var__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Var__Group__1__Impl_in_rule__Var__Group__19235);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4603:1: rule__Var__Group__1__Impl : ( ( rule__Var__Alternatives_1 )? ) ;
    public final void rule__Var__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4607:1: ( ( ( rule__Var__Alternatives_1 )? ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4608:1: ( ( rule__Var__Alternatives_1 )? )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4608:1: ( ( rule__Var__Alternatives_1 )? )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4609:1: ( rule__Var__Alternatives_1 )?
            {
             before(grammarAccess.getVarAccess().getAlternatives_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4610:1: ( rule__Var__Alternatives_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32||LA28_0==46) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4610:2: rule__Var__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__Var__Alternatives_1_in_rule__Var__Group__1__Impl9262);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4624:1: rule__Var__Group_1_0__0 : rule__Var__Group_1_0__0__Impl rule__Var__Group_1_0__1 ;
    public final void rule__Var__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4628:1: ( rule__Var__Group_1_0__0__Impl rule__Var__Group_1_0__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4629:2: rule__Var__Group_1_0__0__Impl rule__Var__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Var__Group_1_0__0__Impl_in_rule__Var__Group_1_0__09297);
            rule__Var__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Var__Group_1_0__1_in_rule__Var__Group_1_0__09300);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4636:1: rule__Var__Group_1_0__0__Impl : ( '[' ) ;
    public final void rule__Var__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4640:1: ( ( '[' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4641:1: ( '[' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4641:1: ( '[' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4642:1: '['
            {
             before(grammarAccess.getVarAccess().getLeftSquareBracketKeyword_1_0_0()); 
            match(input,32,FOLLOW_32_in_rule__Var__Group_1_0__0__Impl9328); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4655:1: rule__Var__Group_1_0__1 : rule__Var__Group_1_0__1__Impl rule__Var__Group_1_0__2 ;
    public final void rule__Var__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4659:1: ( rule__Var__Group_1_0__1__Impl rule__Var__Group_1_0__2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4660:2: rule__Var__Group_1_0__1__Impl rule__Var__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__Var__Group_1_0__1__Impl_in_rule__Var__Group_1_0__19359);
            rule__Var__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Var__Group_1_0__2_in_rule__Var__Group_1_0__19362);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4667:1: rule__Var__Group_1_0__1__Impl : ( ( rule__Var__ExprAssignment_1_0_1 ) ) ;
    public final void rule__Var__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4671:1: ( ( ( rule__Var__ExprAssignment_1_0_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4672:1: ( ( rule__Var__ExprAssignment_1_0_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4672:1: ( ( rule__Var__ExprAssignment_1_0_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4673:1: ( rule__Var__ExprAssignment_1_0_1 )
            {
             before(grammarAccess.getVarAccess().getExprAssignment_1_0_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4674:1: ( rule__Var__ExprAssignment_1_0_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4674:2: rule__Var__ExprAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__Var__ExprAssignment_1_0_1_in_rule__Var__Group_1_0__1__Impl9389);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4684:1: rule__Var__Group_1_0__2 : rule__Var__Group_1_0__2__Impl rule__Var__Group_1_0__3 ;
    public final void rule__Var__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4688:1: ( rule__Var__Group_1_0__2__Impl rule__Var__Group_1_0__3 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4689:2: rule__Var__Group_1_0__2__Impl rule__Var__Group_1_0__3
            {
            pushFollow(FOLLOW_rule__Var__Group_1_0__2__Impl_in_rule__Var__Group_1_0__29419);
            rule__Var__Group_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Var__Group_1_0__3_in_rule__Var__Group_1_0__29422);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4696:1: rule__Var__Group_1_0__2__Impl : ( ']' ) ;
    public final void rule__Var__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4700:1: ( ( ']' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4701:1: ( ']' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4701:1: ( ']' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4702:1: ']'
            {
             before(grammarAccess.getVarAccess().getRightSquareBracketKeyword_1_0_2()); 
            match(input,33,FOLLOW_33_in_rule__Var__Group_1_0__2__Impl9450); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4715:1: rule__Var__Group_1_0__3 : rule__Var__Group_1_0__3__Impl ;
    public final void rule__Var__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4719:1: ( rule__Var__Group_1_0__3__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4720:2: rule__Var__Group_1_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Var__Group_1_0__3__Impl_in_rule__Var__Group_1_0__39481);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4726:1: rule__Var__Group_1_0__3__Impl : ( ( rule__Var__Group_1_0_3__0 )? ) ;
    public final void rule__Var__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4730:1: ( ( ( rule__Var__Group_1_0_3__0 )? ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4731:1: ( ( rule__Var__Group_1_0_3__0 )? )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4731:1: ( ( rule__Var__Group_1_0_3__0 )? )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4732:1: ( rule__Var__Group_1_0_3__0 )?
            {
             before(grammarAccess.getVarAccess().getGroup_1_0_3()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4733:1: ( rule__Var__Group_1_0_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==46) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4733:2: rule__Var__Group_1_0_3__0
                    {
                    pushFollow(FOLLOW_rule__Var__Group_1_0_3__0_in_rule__Var__Group_1_0__3__Impl9508);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4751:1: rule__Var__Group_1_0_3__0 : rule__Var__Group_1_0_3__0__Impl rule__Var__Group_1_0_3__1 ;
    public final void rule__Var__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4755:1: ( rule__Var__Group_1_0_3__0__Impl rule__Var__Group_1_0_3__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4756:2: rule__Var__Group_1_0_3__0__Impl rule__Var__Group_1_0_3__1
            {
            pushFollow(FOLLOW_rule__Var__Group_1_0_3__0__Impl_in_rule__Var__Group_1_0_3__09547);
            rule__Var__Group_1_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Var__Group_1_0_3__1_in_rule__Var__Group_1_0_3__09550);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4763:1: rule__Var__Group_1_0_3__0__Impl : ( '.' ) ;
    public final void rule__Var__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4767:1: ( ( '.' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4768:1: ( '.' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4768:1: ( '.' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4769:1: '.'
            {
             before(grammarAccess.getVarAccess().getFullStopKeyword_1_0_3_0()); 
            match(input,46,FOLLOW_46_in_rule__Var__Group_1_0_3__0__Impl9578); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4782:1: rule__Var__Group_1_0_3__1 : rule__Var__Group_1_0_3__1__Impl ;
    public final void rule__Var__Group_1_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4786:1: ( rule__Var__Group_1_0_3__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4787:2: rule__Var__Group_1_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Var__Group_1_0_3__1__Impl_in_rule__Var__Group_1_0_3__19609);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4793:1: rule__Var__Group_1_0_3__1__Impl : ( ( rule__Var__SubnameAssignment_1_0_3_1 ) ) ;
    public final void rule__Var__Group_1_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4797:1: ( ( ( rule__Var__SubnameAssignment_1_0_3_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4798:1: ( ( rule__Var__SubnameAssignment_1_0_3_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4798:1: ( ( rule__Var__SubnameAssignment_1_0_3_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4799:1: ( rule__Var__SubnameAssignment_1_0_3_1 )
            {
             before(grammarAccess.getVarAccess().getSubnameAssignment_1_0_3_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4800:1: ( rule__Var__SubnameAssignment_1_0_3_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4800:2: rule__Var__SubnameAssignment_1_0_3_1
            {
            pushFollow(FOLLOW_rule__Var__SubnameAssignment_1_0_3_1_in_rule__Var__Group_1_0_3__1__Impl9636);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4814:1: rule__Var__Group_1_1__0 : rule__Var__Group_1_1__0__Impl rule__Var__Group_1_1__1 ;
    public final void rule__Var__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4818:1: ( rule__Var__Group_1_1__0__Impl rule__Var__Group_1_1__1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4819:2: rule__Var__Group_1_1__0__Impl rule__Var__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Var__Group_1_1__0__Impl_in_rule__Var__Group_1_1__09670);
            rule__Var__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Var__Group_1_1__1_in_rule__Var__Group_1_1__09673);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4826:1: rule__Var__Group_1_1__0__Impl : ( '.' ) ;
    public final void rule__Var__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4830:1: ( ( '.' ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4831:1: ( '.' )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4831:1: ( '.' )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4832:1: '.'
            {
             before(grammarAccess.getVarAccess().getFullStopKeyword_1_1_0()); 
            match(input,46,FOLLOW_46_in_rule__Var__Group_1_1__0__Impl9701); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4845:1: rule__Var__Group_1_1__1 : rule__Var__Group_1_1__1__Impl ;
    public final void rule__Var__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4849:1: ( rule__Var__Group_1_1__1__Impl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4850:2: rule__Var__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Var__Group_1_1__1__Impl_in_rule__Var__Group_1_1__19732);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4856:1: rule__Var__Group_1_1__1__Impl : ( ( rule__Var__SubnameAssignment_1_1_1 ) ) ;
    public final void rule__Var__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4860:1: ( ( ( rule__Var__SubnameAssignment_1_1_1 ) ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4861:1: ( ( rule__Var__SubnameAssignment_1_1_1 ) )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4861:1: ( ( rule__Var__SubnameAssignment_1_1_1 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4862:1: ( rule__Var__SubnameAssignment_1_1_1 )
            {
             before(grammarAccess.getVarAccess().getSubnameAssignment_1_1_1()); 
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4863:1: ( rule__Var__SubnameAssignment_1_1_1 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4863:2: rule__Var__SubnameAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Var__SubnameAssignment_1_1_1_in_rule__Var__Group_1_1__1__Impl9759);
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


    // $ANTLR start "rule__Model__GameAssignment_0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4878:1: rule__Model__GameAssignment_0 : ( ruleGame ) ;
    public final void rule__Model__GameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4882:1: ( ( ruleGame ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4883:1: ( ruleGame )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4883:1: ( ruleGame )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4884:1: ruleGame
            {
             before(grammarAccess.getModelAccess().getGameGameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleGame_in_rule__Model__GameAssignment_09798);
            ruleGame();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGameGameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__GameAssignment_0"


    // $ANTLR start "rule__Model__DeclAssignment_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4893:1: rule__Model__DeclAssignment_1 : ( ruleDeclaration ) ;
    public final void rule__Model__DeclAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4897:1: ( ( ruleDeclaration ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4898:1: ( ruleDeclaration )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4898:1: ( ruleDeclaration )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4899:1: ruleDeclaration
            {
             before(grammarAccess.getModelAccess().getDeclDeclarationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDeclaration_in_rule__Model__DeclAssignment_19829);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDeclDeclarationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DeclAssignment_1"


    // $ANTLR start "rule__Model__StmtAssignment_2"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4908:1: rule__Model__StmtAssignment_2 : ( ruleStatementBlock ) ;
    public final void rule__Model__StmtAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4912:1: ( ( ruleStatementBlock ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4913:1: ( ruleStatementBlock )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4913:1: ( ruleStatementBlock )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4914:1: ruleStatementBlock
            {
             before(grammarAccess.getModelAccess().getStmtStatementBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStatementBlock_in_rule__Model__StmtAssignment_29860);
            ruleStatementBlock();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStmtStatementBlockParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StmtAssignment_2"


    // $ANTLR start "rule__Model__BlocksAssignment_3"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4923:1: rule__Model__BlocksAssignment_3 : ( ruleBlock ) ;
    public final void rule__Model__BlocksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4927:1: ( ( ruleBlock ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4928:1: ( ruleBlock )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4928:1: ( ruleBlock )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4929:1: ruleBlock
            {
             before(grammarAccess.getModelAccess().getBlocksBlockParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBlock_in_rule__Model__BlocksAssignment_39891);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getModelAccess().getBlocksBlockParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__BlocksAssignment_3"


    // $ANTLR start "rule__Game__NameAssignment_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4938:1: rule__Game__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Game__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4942:1: ( ( RULE_ID ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4943:1: ( RULE_ID )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4943:1: ( RULE_ID )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4944:1: RULE_ID
            {
             before(grammarAccess.getGameAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Game__NameAssignment_19922); 
             after(grammarAccess.getGameAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__NameAssignment_1"


    // $ANTLR start "rule__Game__AttrAssignment_3"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4953:1: rule__Game__AttrAssignment_3 : ( ruleAttrList ) ;
    public final void rule__Game__AttrAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4957:1: ( ( ruleAttrList ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4958:1: ( ruleAttrList )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4958:1: ( ruleAttrList )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4959:1: ruleAttrList
            {
             before(grammarAccess.getGameAccess().getAttrAttrListParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAttrList_in_rule__Game__AttrAssignment_39953);
            ruleAttrList();

            state._fsp--;

             after(grammarAccess.getGameAccess().getAttrAttrListParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Game__AttrAssignment_3"


    // $ANTLR start "rule__Declaration__VarAssignment_0_0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4968:1: rule__Declaration__VarAssignment_0_0 : ( ruleVarDecl ) ;
    public final void rule__Declaration__VarAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4972:1: ( ( ruleVarDecl ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4973:1: ( ruleVarDecl )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4973:1: ( ruleVarDecl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4974:1: ruleVarDecl
            {
             before(grammarAccess.getDeclarationAccess().getVarVarDeclParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleVarDecl_in_rule__Declaration__VarAssignment_0_09984);
            ruleVarDecl();

            state._fsp--;

             after(grammarAccess.getDeclarationAccess().getVarVarDeclParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declaration__VarAssignment_0_0"


    // $ANTLR start "rule__Declaration__ObjAssignment_0_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4983:1: rule__Declaration__ObjAssignment_0_1 : ( ruleObjDecl ) ;
    public final void rule__Declaration__ObjAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4987:1: ( ( ruleObjDecl ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4988:1: ( ruleObjDecl )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4988:1: ( ruleObjDecl )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4989:1: ruleObjDecl
            {
             before(grammarAccess.getDeclarationAccess().getObjObjDeclParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleObjDecl_in_rule__Declaration__ObjAssignment_0_110015);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:4998:1: rule__VarDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VarDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5002:1: ( ( RULE_ID ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5003:1: ( RULE_ID )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5003:1: ( RULE_ID )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5004:1: RULE_ID
            {
             before(grammarAccess.getVarDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarDecl__NameAssignment_110046); 
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


    // $ANTLR start "rule__VarDecl__ExprAssignment_2_0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5013:1: rule__VarDecl__ExprAssignment_2_0 : ( ruleInit ) ;
    public final void rule__VarDecl__ExprAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5017:1: ( ( ruleInit ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5018:1: ( ruleInit )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5018:1: ( ruleInit )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5019:1: ruleInit
            {
             before(grammarAccess.getVarDeclAccess().getExprInitParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleInit_in_rule__VarDecl__ExprAssignment_2_010077);
            ruleInit();

            state._fsp--;

             after(grammarAccess.getVarDeclAccess().getExprInitParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__ExprAssignment_2_0"


    // $ANTLR start "rule__VarDecl__IntAssignment_2_1_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5028:1: rule__VarDecl__IntAssignment_2_1_1 : ( RULE_INT ) ;
    public final void rule__VarDecl__IntAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5032:1: ( ( RULE_INT ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5033:1: ( RULE_INT )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5033:1: ( RULE_INT )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5034:1: RULE_INT
            {
             before(grammarAccess.getVarDeclAccess().getIntINTTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__VarDecl__IntAssignment_2_1_110108); 
             after(grammarAccess.getVarDeclAccess().getIntINTTerminalRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarDecl__IntAssignment_2_1_1"


    // $ANTLR start "rule__Init__ExprAssignment_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5043:1: rule__Init__ExprAssignment_1 : ( ruleExpr ) ;
    public final void rule__Init__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5047:1: ( ( ruleExpr ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5048:1: ( ruleExpr )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5048:1: ( ruleExpr )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5049:1: ruleExpr
            {
             before(grammarAccess.getInitAccess().getExprExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Init__ExprAssignment_110139);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getInitAccess().getExprExprParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Init__ExprAssignment_1"


    // $ANTLR start "rule__ObjDecl__TypeAssignment_0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5058:1: rule__ObjDecl__TypeAssignment_0 : ( ruleObjType ) ;
    public final void rule__ObjDecl__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5062:1: ( ( ruleObjType ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5063:1: ( ruleObjType )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5063:1: ( ruleObjType )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5064:1: ruleObjType
            {
             before(grammarAccess.getObjDeclAccess().getTypeObjTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleObjType_in_rule__ObjDecl__TypeAssignment_010170);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5073:1: rule__ObjDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ObjDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5077:1: ( ( RULE_ID ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5078:1: ( RULE_ID )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5078:1: ( RULE_ID )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5079:1: RULE_ID
            {
             before(grammarAccess.getObjDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ObjDecl__NameAssignment_110201); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5088:1: rule__ObjDecl__AttrAssignment_2_0_1 : ( ruleAttrList ) ;
    public final void rule__ObjDecl__AttrAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5092:1: ( ( ruleAttrList ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5093:1: ( ruleAttrList )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5093:1: ( ruleAttrList )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5094:1: ruleAttrList
            {
             before(grammarAccess.getObjDeclAccess().getAttrAttrListParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_ruleAttrList_in_rule__ObjDecl__AttrAssignment_2_0_110232);
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


    // $ANTLR start "rule__ObjDecl__IntAssignment_2_1_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5103:1: rule__ObjDecl__IntAssignment_2_1_1 : ( RULE_INT ) ;
    public final void rule__ObjDecl__IntAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5107:1: ( ( RULE_INT ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5108:1: ( RULE_INT )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5108:1: ( RULE_INT )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5109:1: RULE_INT
            {
             before(grammarAccess.getObjDeclAccess().getIntINTTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ObjDecl__IntAssignment_2_1_110263); 
             after(grammarAccess.getObjDeclAccess().getIntINTTerminalRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjDecl__IntAssignment_2_1_1"


    // $ANTLR start "rule__AnimBlock__NameAssignment_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5118:1: rule__AnimBlock__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AnimBlock__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5122:1: ( ( RULE_ID ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5123:1: ( RULE_ID )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5123:1: ( RULE_ID )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5124:1: RULE_ID
            {
             before(grammarAccess.getAnimBlockAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AnimBlock__NameAssignment_110294); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5133:1: rule__AnimBlock__TypeAssignment_3 : ( ruleObjType ) ;
    public final void rule__AnimBlock__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5137:1: ( ( ruleObjType ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5138:1: ( ruleObjType )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5138:1: ( ruleObjType )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5139:1: ruleObjType
            {
             before(grammarAccess.getAnimBlockAccess().getTypeObjTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleObjType_in_rule__AnimBlock__TypeAssignment_310325);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5148:1: rule__AnimBlock__ObjNameAssignment_4 : ( RULE_ID ) ;
    public final void rule__AnimBlock__ObjNameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5152:1: ( ( RULE_ID ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5153:1: ( RULE_ID )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5153:1: ( RULE_ID )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5154:1: RULE_ID
            {
             before(grammarAccess.getAnimBlockAccess().getObjNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AnimBlock__ObjNameAssignment_410356); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5163:1: rule__AnimBlock__StmtAssignment_6 : ( ruleStatementBlock ) ;
    public final void rule__AnimBlock__StmtAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5167:1: ( ( ruleStatementBlock ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5168:1: ( ruleStatementBlock )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5168:1: ( ruleStatementBlock )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5169:1: ruleStatementBlock
            {
             before(grammarAccess.getAnimBlockAccess().getStmtStatementBlockParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleStatementBlock_in_rule__AnimBlock__StmtAssignment_610387);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5178:1: rule__EventBlock__KeyAssignment_1 : ( ruleKeystroke ) ;
    public final void rule__EventBlock__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5182:1: ( ( ruleKeystroke ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5183:1: ( ruleKeystroke )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5183:1: ( ruleKeystroke )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5184:1: ruleKeystroke
            {
             before(grammarAccess.getEventBlockAccess().getKeyKeystrokeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleKeystroke_in_rule__EventBlock__KeyAssignment_110418);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5193:1: rule__EventBlock__StmtAssignment_2 : ( ruleStatementBlock ) ;
    public final void rule__EventBlock__StmtAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5197:1: ( ( ruleStatementBlock ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5198:1: ( ruleStatementBlock )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5198:1: ( ruleStatementBlock )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5199:1: ruleStatementBlock
            {
             before(grammarAccess.getEventBlockAccess().getStmtStatementBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStatementBlock_in_rule__EventBlock__StmtAssignment_210449);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5208:1: rule__StatementBlock__StmtAssignment_1_1 : ( ruleStmt ) ;
    public final void rule__StatementBlock__StmtAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5212:1: ( ( ruleStmt ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5213:1: ( ruleStmt )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5213:1: ( ruleStmt )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5214:1: ruleStmt
            {
             before(grammarAccess.getStatementBlockAccess().getStmtStmtParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleStmt_in_rule__StatementBlock__StmtAssignment_1_110480);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5223:1: rule__ForStmt__Ass1Assignment_2 : ( ruleAssStmt ) ;
    public final void rule__ForStmt__Ass1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5227:1: ( ( ruleAssStmt ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5228:1: ( ruleAssStmt )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5228:1: ( ruleAssStmt )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5229:1: ruleAssStmt
            {
             before(grammarAccess.getForStmtAccess().getAss1AssStmtParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAssStmt_in_rule__ForStmt__Ass1Assignment_210511);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5238:1: rule__ForStmt__ExprAssignment_3 : ( ruleExpr ) ;
    public final void rule__ForStmt__ExprAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5242:1: ( ( ruleExpr ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5243:1: ( ruleExpr )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5243:1: ( ruleExpr )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5244:1: ruleExpr
            {
             before(grammarAccess.getForStmtAccess().getExprExprParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__ForStmt__ExprAssignment_310542);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5253:1: rule__ForStmt__Ass2Assignment_5 : ( ruleAssStmt2 ) ;
    public final void rule__ForStmt__Ass2Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5257:1: ( ( ruleAssStmt2 ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5258:1: ( ruleAssStmt2 )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5258:1: ( ruleAssStmt2 )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5259:1: ruleAssStmt2
            {
             before(grammarAccess.getForStmtAccess().getAss2AssStmt2ParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleAssStmt2_in_rule__ForStmt__Ass2Assignment_510573);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5268:1: rule__ForStmt__StmtAssignment_7 : ( ruleStatementBlock ) ;
    public final void rule__ForStmt__StmtAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5272:1: ( ( ruleStatementBlock ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5273:1: ( ruleStatementBlock )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5273:1: ( ruleStatementBlock )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5274:1: ruleStatementBlock
            {
             before(grammarAccess.getForStmtAccess().getStmtStatementBlockParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleStatementBlock_in_rule__ForStmt__StmtAssignment_710604);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5283:1: rule__IfStmt__ExprAssignment_2 : ( ruleExpr ) ;
    public final void rule__IfStmt__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5287:1: ( ( ruleExpr ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5288:1: ( ruleExpr )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5288:1: ( ruleExpr )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5289:1: ruleExpr
            {
             before(grammarAccess.getIfStmtAccess().getExprExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__IfStmt__ExprAssignment_210635);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5298:1: rule__IfStmt__StmtAssignment_4 : ( ruleStatementBlock ) ;
    public final void rule__IfStmt__StmtAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5302:1: ( ( ruleStatementBlock ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5303:1: ( ruleStatementBlock )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5303:1: ( ruleStatementBlock )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5304:1: ruleStatementBlock
            {
             before(grammarAccess.getIfStmtAccess().getStmtStatementBlockParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleStatementBlock_in_rule__IfStmt__StmtAssignment_410666);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5313:1: rule__IfStmt__ElseAssignment_5 : ( ruleElseStmt ) ;
    public final void rule__IfStmt__ElseAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5317:1: ( ( ruleElseStmt ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5318:1: ( ruleElseStmt )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5318:1: ( ruleElseStmt )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5319:1: ruleElseStmt
            {
             before(grammarAccess.getIfStmtAccess().getElseElseStmtParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleElseStmt_in_rule__IfStmt__ElseAssignment_510697);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5328:1: rule__ElseStmt__StmtAssignment_1 : ( ruleStatementBlock ) ;
    public final void rule__ElseStmt__StmtAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5332:1: ( ( ruleStatementBlock ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5333:1: ( ruleStatementBlock )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5333:1: ( ruleStatementBlock )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5334:1: ruleStatementBlock
            {
             before(grammarAccess.getElseStmtAccess().getStmtStatementBlockParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleStatementBlock_in_rule__ElseStmt__StmtAssignment_110728);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5343:1: rule__AssStmt__VarAssignment_0 : ( ruleVar ) ;
    public final void rule__AssStmt__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5347:1: ( ( ruleVar ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5348:1: ( ruleVar )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5348:1: ( ruleVar )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5349:1: ruleVar
            {
             before(grammarAccess.getAssStmtAccess().getVarVarParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVar_in_rule__AssStmt__VarAssignment_010759);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5358:1: rule__AssStmt__ExprAssignment_2 : ( ruleExpr ) ;
    public final void rule__AssStmt__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5362:1: ( ( ruleExpr ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5363:1: ( ruleExpr )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5363:1: ( ruleExpr )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5364:1: ruleExpr
            {
             before(grammarAccess.getAssStmtAccess().getExprExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__AssStmt__ExprAssignment_210790);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5373:1: rule__AssStmt2__VarAssignment_0 : ( ruleVar ) ;
    public final void rule__AssStmt2__VarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5377:1: ( ( ruleVar ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5378:1: ( ruleVar )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5378:1: ( ruleVar )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5379:1: ruleVar
            {
             before(grammarAccess.getAssStmt2Access().getVarVarParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVar_in_rule__AssStmt2__VarAssignment_010821);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5388:1: rule__AssStmt2__ExprAssignment_2 : ( ruleExpr ) ;
    public final void rule__AssStmt2__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5392:1: ( ( ruleExpr ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5393:1: ( ruleExpr )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5393:1: ( ruleExpr )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5394:1: ruleExpr
            {
             before(grammarAccess.getAssStmt2Access().getExprExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__AssStmt2__ExprAssignment_210852);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5403:1: rule__AttrList__AttrAssignment_1_0 : ( ruleAttrAss ) ;
    public final void rule__AttrList__AttrAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5407:1: ( ( ruleAttrAss ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5408:1: ( ruleAttrAss )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5408:1: ( ruleAttrAss )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5409:1: ruleAttrAss
            {
             before(grammarAccess.getAttrListAccess().getAttrAttrAssParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleAttrAss_in_rule__AttrList__AttrAssignment_1_010883);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5418:1: rule__AttrList__AttrAssignment_1_1_1 : ( ruleAttrAss ) ;
    public final void rule__AttrList__AttrAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5422:1: ( ( ruleAttrAss ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5423:1: ( ruleAttrAss )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5423:1: ( ruleAttrAss )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5424:1: ruleAttrAss
            {
             before(grammarAccess.getAttrListAccess().getAttrAttrAssParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleAttrAss_in_rule__AttrList__AttrAssignment_1_1_110914);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5433:1: rule__AttrAss__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__AttrAss__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5437:1: ( ( RULE_ID ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5438:1: ( RULE_ID )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5438:1: ( RULE_ID )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5439:1: RULE_ID
            {
             before(grammarAccess.getAttrAssAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AttrAss__NameAssignment_010945); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5448:1: rule__AttrAss__ExprAssignment_2 : ( ruleExpr ) ;
    public final void rule__AttrAss__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5452:1: ( ( ruleExpr ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5453:1: ( ruleExpr )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5453:1: ( ruleExpr )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5454:1: ruleExpr
            {
             before(grammarAccess.getAttrAssAccess().getExprExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__AttrAss__ExprAssignment_210976);
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


    // $ANTLR start "rule__Disj__ConjAssignment_0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5463:1: rule__Disj__ConjAssignment_0 : ( ruleConj ) ;
    public final void rule__Disj__ConjAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5467:1: ( ( ruleConj ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5468:1: ( ruleConj )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5468:1: ( ruleConj )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5469:1: ruleConj
            {
             before(grammarAccess.getDisjAccess().getConjConjParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleConj_in_rule__Disj__ConjAssignment_011007);
            ruleConj();

            state._fsp--;

             after(grammarAccess.getDisjAccess().getConjConjParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disj__ConjAssignment_0"


    // $ANTLR start "rule__Disj__ConjAssignment_1_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5478:1: rule__Disj__ConjAssignment_1_1 : ( ruleConj ) ;
    public final void rule__Disj__ConjAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5482:1: ( ( ruleConj ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5483:1: ( ruleConj )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5483:1: ( ruleConj )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5484:1: ruleConj
            {
             before(grammarAccess.getDisjAccess().getConjConjParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleConj_in_rule__Disj__ConjAssignment_1_111038);
            ruleConj();

            state._fsp--;

             after(grammarAccess.getDisjAccess().getConjConjParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disj__ConjAssignment_1_1"


    // $ANTLR start "rule__Conj__RelatAssignment_0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5493:1: rule__Conj__RelatAssignment_0 : ( ruleRelat ) ;
    public final void rule__Conj__RelatAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5497:1: ( ( ruleRelat ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5498:1: ( ruleRelat )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5498:1: ( ruleRelat )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5499:1: ruleRelat
            {
             before(grammarAccess.getConjAccess().getRelatRelatParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleRelat_in_rule__Conj__RelatAssignment_011069);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5508:1: rule__Conj__RelatAssignment_1_1 : ( ruleRelat ) ;
    public final void rule__Conj__RelatAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5512:1: ( ( ruleRelat ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5513:1: ( ruleRelat )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5513:1: ( ruleRelat )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5514:1: ruleRelat
            {
             before(grammarAccess.getConjAccess().getRelatRelatParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleRelat_in_rule__Conj__RelatAssignment_1_111100);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5523:1: rule__Relat__AddAssignment_0 : ( ruleAdd ) ;
    public final void rule__Relat__AddAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5527:1: ( ( ruleAdd ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5528:1: ( ruleAdd )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5528:1: ( ruleAdd )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5529:1: ruleAdd
            {
             before(grammarAccess.getRelatAccess().getAddAddParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAdd_in_rule__Relat__AddAssignment_011131);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5538:1: rule__Relat__AddAssignment_1_1 : ( ruleAdd ) ;
    public final void rule__Relat__AddAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5542:1: ( ( ruleAdd ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5543:1: ( ruleAdd )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5543:1: ( ruleAdd )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5544:1: ruleAdd
            {
             before(grammarAccess.getRelatAccess().getAddAddParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAdd_in_rule__Relat__AddAssignment_1_111162);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5553:1: rule__Add__MultAssignment_0 : ( ruleMult ) ;
    public final void rule__Add__MultAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5557:1: ( ( ruleMult ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5558:1: ( ruleMult )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5558:1: ( ruleMult )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5559:1: ruleMult
            {
             before(grammarAccess.getAddAccess().getMultMultParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleMult_in_rule__Add__MultAssignment_011193);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5568:1: rule__Add__MultAssignment_1_1 : ( ruleMult ) ;
    public final void rule__Add__MultAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5572:1: ( ( ruleMult ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5573:1: ( ruleMult )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5573:1: ( ruleMult )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5574:1: ruleMult
            {
             before(grammarAccess.getAddAccess().getMultMultParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMult_in_rule__Add__MultAssignment_1_111224);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5583:1: rule__Mult__UnaryAssignment_0 : ( ruleUnary ) ;
    public final void rule__Mult__UnaryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5587:1: ( ( ruleUnary ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5588:1: ( ruleUnary )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5588:1: ( ruleUnary )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5589:1: ruleUnary
            {
             before(grammarAccess.getMultAccess().getUnaryUnaryParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleUnary_in_rule__Mult__UnaryAssignment_011255);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5598:1: rule__Mult__UnaryAssignment_1_1 : ( ruleUnary ) ;
    public final void rule__Mult__UnaryAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5602:1: ( ( ruleUnary ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5603:1: ( ruleUnary )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5603:1: ( ruleUnary )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5604:1: ruleUnary
            {
             before(grammarAccess.getMultAccess().getUnaryUnaryParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleUnary_in_rule__Mult__UnaryAssignment_1_111286);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5613:1: rule__Unary__AtomAssignment_1 : ( ruleAtom ) ;
    public final void rule__Unary__AtomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5617:1: ( ( ruleAtom ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5618:1: ( ruleAtom )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5618:1: ( ruleAtom )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5619:1: ruleAtom
            {
             before(grammarAccess.getUnaryAccess().getAtomAtomParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAtom_in_rule__Unary__AtomAssignment_111317);
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


    // $ANTLR start "rule__Atom__IntAssignment_1_0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5628:1: rule__Atom__IntAssignment_1_0 : ( RULE_INT ) ;
    public final void rule__Atom__IntAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5632:1: ( ( RULE_INT ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5633:1: ( RULE_INT )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5633:1: ( RULE_INT )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5634:1: RULE_INT
            {
             before(grammarAccess.getAtomAccess().getIntINTTerminalRuleCall_1_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Atom__IntAssignment_1_011348); 
             after(grammarAccess.getAtomAccess().getIntINTTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__IntAssignment_1_0"


    // $ANTLR start "rule__Atom__Var1Assignment_1_1_0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5643:1: rule__Atom__Var1Assignment_1_1_0 : ( ruleVar ) ;
    public final void rule__Atom__Var1Assignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5647:1: ( ( ruleVar ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5648:1: ( ruleVar )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5648:1: ( ruleVar )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5649:1: ruleVar
            {
             before(grammarAccess.getAtomAccess().getVar1VarParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_ruleVar_in_rule__Atom__Var1Assignment_1_1_011379);
            ruleVar();

            state._fsp--;

             after(grammarAccess.getAtomAccess().getVar1VarParserRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Var1Assignment_1_1_0"


    // $ANTLR start "rule__Atom__Var2Assignment_1_1_1_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5658:1: rule__Atom__Var2Assignment_1_1_1_1 : ( ruleVar ) ;
    public final void rule__Atom__Var2Assignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5662:1: ( ( ruleVar ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5663:1: ( ruleVar )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5663:1: ( ruleVar )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5664:1: ruleVar
            {
             before(grammarAccess.getAtomAccess().getVar2VarParserRuleCall_1_1_1_1_0()); 
            pushFollow(FOLLOW_ruleVar_in_rule__Atom__Var2Assignment_1_1_1_111410);
            ruleVar();

            state._fsp--;

             after(grammarAccess.getAtomAccess().getVar2VarParserRuleCall_1_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__Var2Assignment_1_1_1_1"


    // $ANTLR start "rule__Atom__ExprAssignment_1_2_1"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5673:1: rule__Atom__ExprAssignment_1_2_1 : ( ruleExpr ) ;
    public final void rule__Atom__ExprAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5677:1: ( ( ruleExpr ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5678:1: ( ruleExpr )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5678:1: ( ruleExpr )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5679:1: ruleExpr
            {
             before(grammarAccess.getAtomAccess().getExprExprParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Atom__ExprAssignment_1_2_111441);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getAtomAccess().getExprExprParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atom__ExprAssignment_1_2_1"


    // $ANTLR start "rule__Var__NameAssignment_0"
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5688:1: rule__Var__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Var__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5692:1: ( ( RULE_ID ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5693:1: ( RULE_ID )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5693:1: ( RULE_ID )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5694:1: RULE_ID
            {
             before(grammarAccess.getVarAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Var__NameAssignment_011472); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5703:1: rule__Var__ExprAssignment_1_0_1 : ( ruleExpr ) ;
    public final void rule__Var__ExprAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5707:1: ( ( ruleExpr ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5708:1: ( ruleExpr )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5708:1: ( ruleExpr )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5709:1: ruleExpr
            {
             before(grammarAccess.getVarAccess().getExprExprParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Var__ExprAssignment_1_0_111503);
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5718:1: rule__Var__SubnameAssignment_1_0_3_1 : ( RULE_ID ) ;
    public final void rule__Var__SubnameAssignment_1_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5722:1: ( ( RULE_ID ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5723:1: ( RULE_ID )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5723:1: ( RULE_ID )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5724:1: RULE_ID
            {
             before(grammarAccess.getVarAccess().getSubnameIDTerminalRuleCall_1_0_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Var__SubnameAssignment_1_0_3_111534); 
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
    // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5733:1: rule__Var__SubnameAssignment_1_1_1 : ( RULE_ID ) ;
    public final void rule__Var__SubnameAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5737:1: ( ( RULE_ID ) )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5738:1: ( RULE_ID )
            {
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5738:1: ( RULE_ID )
            // ../org.xtext.mgpl.ui/src-gen/org/xtext/mgpl/ui/contentassist/antlr/internal/InternalMgplDSL.g:5739:1: RULE_ID
            {
             before(grammarAccess.getVarAccess().getSubnameIDTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Var__SubnameAssignment_1_1_111565); 
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
    public static final BitSet FOLLOW_ruleGame_in_entryRuleGame121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGame128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Game__Group__0_in_ruleGame154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0_in_ruleDeclaration214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_entryRuleVarDecl241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDecl248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__0_in_ruleVarDecl274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInit_in_entryRuleInit301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInit308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Init__Group__0_in_ruleInit334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjDecl_in_entryRuleObjDecl361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjDecl368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group__0_in_ruleObjDecl394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Alternatives_in_ruleBlock454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnimBlock_in_entryRuleAnimBlock481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnimBlock488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnimBlock__Group__0_in_ruleAnimBlock514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventBlock_in_entryRuleEventBlock541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventBlock548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventBlock__Group__0_in_ruleEventBlock574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjType_in_entryRuleObjType601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjType608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjType__Alternatives_in_ruleObjType634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeystroke_in_entryRuleKeystroke661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeystroke668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Keystroke__Alternatives_in_ruleKeystroke694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_entryRuleStatementBlock721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatementBlock728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group__0_in_ruleStatementBlock754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStmt_in_entryRuleStmt781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStmt788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stmt__Alternatives_in_ruleStmt814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForStmt_in_entryRuleForStmt841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForStmt848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForStmt__Group__0_in_ruleForStmt874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStmt_in_entryRuleIfStmt901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfStmt908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStmt__Group__0_in_ruleIfStmt934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElseStmt_in_entryRuleElseStmt961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElseStmt968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElseStmt__Group__0_in_ruleElseStmt994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssStmt_in_entryRuleAssStmt1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssStmt1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssStmt__Group__0_in_ruleAssStmt1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssStmt2_in_entryRuleAssStmt21081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssStmt21088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssStmt2__Group__0_in_ruleAssStmt21114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrList_in_entryRuleAttrList1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrList1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrList__Group__0_in_ruleAttrList1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrAss_in_entryRuleAttrAss1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrAss1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrAss__Group__0_in_ruleAttrAss1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisj_in_ruleExpr1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisj_in_entryRuleDisj1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisj1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disj__Group__0_in_ruleDisj1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConj_in_entryRuleConj1380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConj1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conj__Group__0_in_ruleConj1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelat_in_entryRuleRelat1440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelat1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relat__Group__0_in_ruleRelat1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdd_in_entryRuleAdd1500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdd1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Add__Group__0_in_ruleAdd1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMult_in_entryRuleMult1560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMult1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mult__Group__0_in_ruleMult1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnary_in_entryRuleUnary1620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnary1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__Group__0_in_ruleUnary1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom1680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtom1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group__0_in_ruleAtom1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_entryRuleVar1740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group__0_in_ruleVar1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__VarAssignment_0_0_in_rule__Declaration__Alternatives_01809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__ObjAssignment_0_1_in_rule__Declaration__Alternatives_01827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__ExprAssignment_2_0_in_rule__VarDecl__Alternatives_21860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_2_1__0_in_rule__VarDecl__Alternatives_21879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group_2_0__0_in_rule__ObjDecl__Alternatives_21912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group_2_1__0_in_rule__ObjDecl__Alternatives_21930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnimBlock_in_rule__Block__Alternatives1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventBlock_in_rule__Block__Alternatives1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ObjType__Alternatives2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ObjType__Alternatives2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ObjType__Alternatives2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Keystroke__Alternatives2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Keystroke__Alternatives2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Keystroke__Alternatives2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Keystroke__Alternatives2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Keystroke__Alternatives2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStmt_in_rule__Stmt__Alternatives2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForStmt_in_rule__Stmt__Alternatives2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssStmt_in_rule__Stmt__Alternatives2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Relat__Alternatives_1_02269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Relat__Alternatives_1_02289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Relat__Alternatives_1_02309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Add__Alternatives_1_02344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Add__Alternatives_1_02364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Mult__Alternatives_1_02399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Mult__Alternatives_1_02419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Unary__Alternatives_02454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Unary__Alternatives_02474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__IntAssignment_1_0_in_rule__Atom__Alternatives_12508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1_1__0_in_rule__Atom__Alternatives_12526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1_2__0_in_rule__Atom__Alternatives_12544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group_1_0__0_in_rule__Var__Alternatives_12577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group_1_1__0_in_rule__Var__Alternatives_12595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02626 = new BitSet(new long[]{0x0000002080003800L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__GameAssignment_0_in_rule__Model__Group__0__Impl2656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12686 = new BitSet(new long[]{0x0000002080003800L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DeclAssignment_1_in_rule__Model__Group__1__Impl2716 = new BitSet(new long[]{0x0000000080003802L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22747 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__22750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__StmtAssignment_2_in_rule__Model__Group__2__Impl2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__32807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__BlocksAssignment_3_in_rule__Model__Group__3__Impl2834 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_rule__Game__Group__0__Impl_in_rule__Game__Group__02873 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Game__Group__1_in_rule__Game__Group__02876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Game__Group__0__Impl2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Game__Group__1__Impl_in_rule__Game__Group__12935 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Game__Group__2_in_rule__Game__Group__12938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Game__NameAssignment_1_in_rule__Game__Group__1__Impl2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Game__Group__2__Impl_in_rule__Game__Group__22995 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_rule__Game__Group__3_in_rule__Game__Group__22998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Game__Group__2__Impl3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Game__Group__3__Impl_in_rule__Game__Group__33057 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Game__Group__4_in_rule__Game__Group__33060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Game__AttrAssignment_3_in_rule__Game__Group__3__Impl3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Game__Group__4__Impl_in_rule__Game__Group__43117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Game__Group__4__Impl3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__03186 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__03189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Alternatives_0_in_rule__Declaration__Group__0__Impl3216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__13246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Declaration__Group__1__Impl3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__0__Impl_in_rule__VarDecl__Group__03309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__1_in_rule__VarDecl__Group__03312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__VarDecl__Group__0__Impl3340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__1__Impl_in_rule__VarDecl__Group__13371 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__2_in_rule__VarDecl__Group__13374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__NameAssignment_1_in_rule__VarDecl__Group__1__Impl3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__2__Impl_in_rule__VarDecl__Group__23431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Alternatives_2_in_rule__VarDecl__Group__2__Impl3458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_2_1__0__Impl_in_rule__VarDecl__Group_2_1__03494 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_2_1__1_in_rule__VarDecl__Group_2_1__03497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__VarDecl__Group_2_1__0__Impl3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_2_1__1__Impl_in_rule__VarDecl__Group_2_1__13556 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_2_1__2_in_rule__VarDecl__Group_2_1__13559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__IntAssignment_2_1_1_in_rule__VarDecl__Group_2_1__1__Impl3586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_2_1__2__Impl_in_rule__VarDecl__Group_2_1__23616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__VarDecl__Group_2_1__2__Impl3644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Init__Group__0__Impl_in_rule__Init__Group__03681 = new BitSet(new long[]{0x0000000014800030L});
    public static final BitSet FOLLOW_rule__Init__Group__1_in_rule__Init__Group__03684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Init__Group__0__Impl3712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Init__Group__1__Impl_in_rule__Init__Group__13743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Init__ExprAssignment_1_in_rule__Init__Group__1__Impl3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group__0__Impl_in_rule__ObjDecl__Group__03804 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group__1_in_rule__ObjDecl__Group__03807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjDecl__TypeAssignment_0_in_rule__ObjDecl__Group__0__Impl3834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group__1__Impl_in_rule__ObjDecl__Group__13864 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group__2_in_rule__ObjDecl__Group__13867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjDecl__NameAssignment_1_in_rule__ObjDecl__Group__1__Impl3894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group__2__Impl_in_rule__ObjDecl__Group__23924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjDecl__Alternatives_2_in_rule__ObjDecl__Group__2__Impl3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group_2_0__0__Impl_in_rule__ObjDecl__Group_2_0__03987 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group_2_0__1_in_rule__ObjDecl__Group_2_0__03990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ObjDecl__Group_2_0__0__Impl4018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group_2_0__1__Impl_in_rule__ObjDecl__Group_2_0__14049 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group_2_0__2_in_rule__ObjDecl__Group_2_0__14052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjDecl__AttrAssignment_2_0_1_in_rule__ObjDecl__Group_2_0__1__Impl4079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group_2_0__2__Impl_in_rule__ObjDecl__Group_2_0__24109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ObjDecl__Group_2_0__2__Impl4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group_2_1__0__Impl_in_rule__ObjDecl__Group_2_1__04174 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group_2_1__1_in_rule__ObjDecl__Group_2_1__04177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ObjDecl__Group_2_1__0__Impl4205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group_2_1__1__Impl_in_rule__ObjDecl__Group_2_1__14236 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group_2_1__2_in_rule__ObjDecl__Group_2_1__14239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjDecl__IntAssignment_2_1_1_in_rule__ObjDecl__Group_2_1__1__Impl4266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ObjDecl__Group_2_1__2__Impl_in_rule__ObjDecl__Group_2_1__24296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ObjDecl__Group_2_1__2__Impl4324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnimBlock__Group__0__Impl_in_rule__AnimBlock__Group__04361 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AnimBlock__Group__1_in_rule__AnimBlock__Group__04364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__AnimBlock__Group__0__Impl4392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnimBlock__Group__1__Impl_in_rule__AnimBlock__Group__14423 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__AnimBlock__Group__2_in_rule__AnimBlock__Group__14426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnimBlock__NameAssignment_1_in_rule__AnimBlock__Group__1__Impl4453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnimBlock__Group__2__Impl_in_rule__AnimBlock__Group__24483 = new BitSet(new long[]{0x0000000080003800L});
    public static final BitSet FOLLOW_rule__AnimBlock__Group__3_in_rule__AnimBlock__Group__24486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__AnimBlock__Group__2__Impl4514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnimBlock__Group__3__Impl_in_rule__AnimBlock__Group__34545 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AnimBlock__Group__4_in_rule__AnimBlock__Group__34548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnimBlock__TypeAssignment_3_in_rule__AnimBlock__Group__3__Impl4575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnimBlock__Group__4__Impl_in_rule__AnimBlock__Group__44605 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__AnimBlock__Group__5_in_rule__AnimBlock__Group__44608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnimBlock__ObjNameAssignment_4_in_rule__AnimBlock__Group__4__Impl4635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnimBlock__Group__5__Impl_in_rule__AnimBlock__Group__54665 = new BitSet(new long[]{0x0000002080003800L});
    public static final BitSet FOLLOW_rule__AnimBlock__Group__6_in_rule__AnimBlock__Group__54668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__AnimBlock__Group__5__Impl4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnimBlock__Group__6__Impl_in_rule__AnimBlock__Group__64727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnimBlock__StmtAssignment_6_in_rule__AnimBlock__Group__6__Impl4754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventBlock__Group__0__Impl_in_rule__EventBlock__Group__04798 = new BitSet(new long[]{0x000000000007C000L});
    public static final BitSet FOLLOW_rule__EventBlock__Group__1_in_rule__EventBlock__Group__04801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__EventBlock__Group__0__Impl4829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventBlock__Group__1__Impl_in_rule__EventBlock__Group__14860 = new BitSet(new long[]{0x0000002080003800L});
    public static final BitSet FOLLOW_rule__EventBlock__Group__2_in_rule__EventBlock__Group__14863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventBlock__KeyAssignment_1_in_rule__EventBlock__Group__1__Impl4890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventBlock__Group__2__Impl_in_rule__EventBlock__Group__24920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EventBlock__StmtAssignment_2_in_rule__EventBlock__Group__2__Impl4947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group__0__Impl_in_rule__StatementBlock__Group__04983 = new BitSet(new long[]{0x0000002080003800L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group__1_in_rule__StatementBlock__Group__04986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group__1__Impl_in_rule__StatementBlock__Group__15044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group_1__0_in_rule__StatementBlock__Group__1__Impl5071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group_1__0__Impl_in_rule__StatementBlock__Group_1__05105 = new BitSet(new long[]{0x000001C000000010L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group_1__1_in_rule__StatementBlock__Group_1__05108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__StatementBlock__Group_1__0__Impl5136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group_1__1__Impl_in_rule__StatementBlock__Group_1__15167 = new BitSet(new long[]{0x000001C000000010L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group_1__2_in_rule__StatementBlock__Group_1__15170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StatementBlock__StmtAssignment_1_1_in_rule__StatementBlock__Group_1__1__Impl5197 = new BitSet(new long[]{0x0000018000000012L});
    public static final BitSet FOLLOW_rule__StatementBlock__Group_1__2__Impl_in_rule__StatementBlock__Group_1__25228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__StatementBlock__Group_1__2__Impl5256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForStmt__Group__0__Impl_in_rule__ForStmt__Group__05293 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__ForStmt__Group__1_in_rule__ForStmt__Group__05296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ForStmt__Group__0__Impl5324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForStmt__Group__1__Impl_in_rule__ForStmt__Group__15355 = new BitSet(new long[]{0x0000018000000010L});
    public static final BitSet FOLLOW_rule__ForStmt__Group__2_in_rule__ForStmt__Group__15358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ForStmt__Group__1__Impl5386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForStmt__Group__2__Impl_in_rule__ForStmt__Group__25417 = new BitSet(new long[]{0x0000000014800030L});
    public static final BitSet FOLLOW_rule__ForStmt__Group__3_in_rule__ForStmt__Group__25420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForStmt__Ass1Assignment_2_in_rule__ForStmt__Group__2__Impl5447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForStmt__Group__3__Impl_in_rule__ForStmt__Group__35477 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ForStmt__Group__4_in_rule__ForStmt__Group__35480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForStmt__ExprAssignment_3_in_rule__ForStmt__Group__3__Impl5507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForStmt__Group__4__Impl_in_rule__ForStmt__Group__45537 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ForStmt__Group__5_in_rule__ForStmt__Group__45540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ForStmt__Group__4__Impl5568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForStmt__Group__5__Impl_in_rule__ForStmt__Group__55599 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ForStmt__Group__6_in_rule__ForStmt__Group__55602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForStmt__Ass2Assignment_5_in_rule__ForStmt__Group__5__Impl5629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForStmt__Group__6__Impl_in_rule__ForStmt__Group__65659 = new BitSet(new long[]{0x0000002080003800L});
    public static final BitSet FOLLOW_rule__ForStmt__Group__7_in_rule__ForStmt__Group__65662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ForStmt__Group__6__Impl5690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForStmt__Group__7__Impl_in_rule__ForStmt__Group__75721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ForStmt__StmtAssignment_7_in_rule__ForStmt__Group__7__Impl5748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStmt__Group__0__Impl_in_rule__IfStmt__Group__05794 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__IfStmt__Group__1_in_rule__IfStmt__Group__05797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__IfStmt__Group__0__Impl5825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStmt__Group__1__Impl_in_rule__IfStmt__Group__15856 = new BitSet(new long[]{0x0000000014800030L});
    public static final BitSet FOLLOW_rule__IfStmt__Group__2_in_rule__IfStmt__Group__15859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__IfStmt__Group__1__Impl5887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStmt__Group__2__Impl_in_rule__IfStmt__Group__25918 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__IfStmt__Group__3_in_rule__IfStmt__Group__25921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStmt__ExprAssignment_2_in_rule__IfStmt__Group__2__Impl5948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStmt__Group__3__Impl_in_rule__IfStmt__Group__35978 = new BitSet(new long[]{0x0000002080003800L});
    public static final BitSet FOLLOW_rule__IfStmt__Group__4_in_rule__IfStmt__Group__35981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__IfStmt__Group__3__Impl6009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStmt__Group__4__Impl_in_rule__IfStmt__Group__46040 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__IfStmt__Group__5_in_rule__IfStmt__Group__46043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStmt__StmtAssignment_4_in_rule__IfStmt__Group__4__Impl6070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStmt__Group__5__Impl_in_rule__IfStmt__Group__56100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IfStmt__ElseAssignment_5_in_rule__IfStmt__Group__5__Impl6127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElseStmt__Group__0__Impl_in_rule__ElseStmt__Group__06170 = new BitSet(new long[]{0x0000002080003800L});
    public static final BitSet FOLLOW_rule__ElseStmt__Group__1_in_rule__ElseStmt__Group__06173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ElseStmt__Group__0__Impl6201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElseStmt__Group__1__Impl_in_rule__ElseStmt__Group__16232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ElseStmt__StmtAssignment_1_in_rule__ElseStmt__Group__1__Impl6259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssStmt__Group__0__Impl_in_rule__AssStmt__Group__06293 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__AssStmt__Group__1_in_rule__AssStmt__Group__06296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssStmt__VarAssignment_0_in_rule__AssStmt__Group__0__Impl6323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssStmt__Group__1__Impl_in_rule__AssStmt__Group__16353 = new BitSet(new long[]{0x0000000014800030L});
    public static final BitSet FOLLOW_rule__AssStmt__Group__2_in_rule__AssStmt__Group__16356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__AssStmt__Group__1__Impl6384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssStmt__Group__2__Impl_in_rule__AssStmt__Group__26415 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__AssStmt__Group__3_in_rule__AssStmt__Group__26418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssStmt__ExprAssignment_2_in_rule__AssStmt__Group__2__Impl6445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssStmt__Group__3__Impl_in_rule__AssStmt__Group__36475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__AssStmt__Group__3__Impl6503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssStmt2__Group__0__Impl_in_rule__AssStmt2__Group__06542 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__AssStmt2__Group__1_in_rule__AssStmt2__Group__06545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssStmt2__VarAssignment_0_in_rule__AssStmt2__Group__0__Impl6572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssStmt2__Group__1__Impl_in_rule__AssStmt2__Group__16602 = new BitSet(new long[]{0x0000000014800030L});
    public static final BitSet FOLLOW_rule__AssStmt2__Group__2_in_rule__AssStmt2__Group__16605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__AssStmt2__Group__1__Impl6633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssStmt2__Group__2__Impl_in_rule__AssStmt2__Group__26664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssStmt2__ExprAssignment_2_in_rule__AssStmt2__Group__2__Impl6691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrList__Group__0__Impl_in_rule__AttrList__Group__06727 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_rule__AttrList__Group__1_in_rule__AttrList__Group__06730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrList__Group__1__Impl_in_rule__AttrList__Group__16788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrList__Group_1__0_in_rule__AttrList__Group__1__Impl6815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrList__Group_1__0__Impl_in_rule__AttrList__Group_1__06849 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_rule__AttrList__Group_1__1_in_rule__AttrList__Group_1__06852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrList__AttrAssignment_1_0_in_rule__AttrList__Group_1__0__Impl6879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrList__Group_1__1__Impl_in_rule__AttrList__Group_1__16910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrList__Group_1_1__0_in_rule__AttrList__Group_1__1__Impl6937 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__AttrList__Group_1_1__0__Impl_in_rule__AttrList__Group_1_1__06972 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AttrList__Group_1_1__1_in_rule__AttrList__Group_1_1__06975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__AttrList__Group_1_1__0__Impl7003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrList__Group_1_1__1__Impl_in_rule__AttrList__Group_1_1__17034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrList__AttrAssignment_1_1_1_in_rule__AttrList__Group_1_1__1__Impl7061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrAss__Group__0__Impl_in_rule__AttrAss__Group__07095 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__AttrAss__Group__1_in_rule__AttrAss__Group__07098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrAss__NameAssignment_0_in_rule__AttrAss__Group__0__Impl7125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrAss__Group__1__Impl_in_rule__AttrAss__Group__17155 = new BitSet(new long[]{0x0000000014800030L});
    public static final BitSet FOLLOW_rule__AttrAss__Group__2_in_rule__AttrAss__Group__17158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__AttrAss__Group__1__Impl7186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrAss__Group__2__Impl_in_rule__AttrAss__Group__27217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttrAss__ExprAssignment_2_in_rule__AttrAss__Group__2__Impl7244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disj__Group__0__Impl_in_rule__Disj__Group__07280 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Disj__Group__1_in_rule__Disj__Group__07283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disj__ConjAssignment_0_in_rule__Disj__Group__0__Impl7310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disj__Group__1__Impl_in_rule__Disj__Group__17340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disj__Group_1__0_in_rule__Disj__Group__1__Impl7367 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__Disj__Group_1__0__Impl_in_rule__Disj__Group_1__07402 = new BitSet(new long[]{0x0000000014800030L});
    public static final BitSet FOLLOW_rule__Disj__Group_1__1_in_rule__Disj__Group_1__07405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Disj__Group_1__0__Impl7433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disj__Group_1__1__Impl_in_rule__Disj__Group_1__17464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disj__ConjAssignment_1_1_in_rule__Disj__Group_1__1__Impl7491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conj__Group__0__Impl_in_rule__Conj__Group__07525 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Conj__Group__1_in_rule__Conj__Group__07528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conj__RelatAssignment_0_in_rule__Conj__Group__0__Impl7555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conj__Group__1__Impl_in_rule__Conj__Group__17585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conj__Group_1__0_in_rule__Conj__Group__1__Impl7612 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__Conj__Group_1__0__Impl_in_rule__Conj__Group_1__07647 = new BitSet(new long[]{0x0000000014800030L});
    public static final BitSet FOLLOW_rule__Conj__Group_1__1_in_rule__Conj__Group_1__07650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Conj__Group_1__0__Impl7678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conj__Group_1__1__Impl_in_rule__Conj__Group_1__17709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conj__RelatAssignment_1_1_in_rule__Conj__Group_1__1__Impl7736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relat__Group__0__Impl_in_rule__Relat__Group__07770 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_rule__Relat__Group__1_in_rule__Relat__Group__07773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relat__AddAssignment_0_in_rule__Relat__Group__0__Impl7800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relat__Group__1__Impl_in_rule__Relat__Group__17830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relat__Group_1__0_in_rule__Relat__Group__1__Impl7857 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_rule__Relat__Group_1__0__Impl_in_rule__Relat__Group_1__07892 = new BitSet(new long[]{0x0000000014800030L});
    public static final BitSet FOLLOW_rule__Relat__Group_1__1_in_rule__Relat__Group_1__07895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relat__Alternatives_1_0_in_rule__Relat__Group_1__0__Impl7922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relat__Group_1__1__Impl_in_rule__Relat__Group_1__17952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relat__AddAssignment_1_1_in_rule__Relat__Group_1__1__Impl7979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Add__Group__0__Impl_in_rule__Add__Group__08013 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_rule__Add__Group__1_in_rule__Add__Group__08016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Add__MultAssignment_0_in_rule__Add__Group__0__Impl8043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Add__Group__1__Impl_in_rule__Add__Group__18073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Add__Group_1__0_in_rule__Add__Group__1__Impl8100 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_rule__Add__Group_1__0__Impl_in_rule__Add__Group_1__08135 = new BitSet(new long[]{0x0000000014800030L});
    public static final BitSet FOLLOW_rule__Add__Group_1__1_in_rule__Add__Group_1__08138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Add__Alternatives_1_0_in_rule__Add__Group_1__0__Impl8165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Add__Group_1__1__Impl_in_rule__Add__Group_1__18195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Add__MultAssignment_1_1_in_rule__Add__Group_1__1__Impl8222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mult__Group__0__Impl_in_rule__Mult__Group__08256 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_rule__Mult__Group__1_in_rule__Mult__Group__08259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mult__UnaryAssignment_0_in_rule__Mult__Group__0__Impl8286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mult__Group__1__Impl_in_rule__Mult__Group__18316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mult__Group_1__0_in_rule__Mult__Group__1__Impl8343 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_rule__Mult__Group_1__0__Impl_in_rule__Mult__Group_1__08378 = new BitSet(new long[]{0x0000000014800030L});
    public static final BitSet FOLLOW_rule__Mult__Group_1__1_in_rule__Mult__Group_1__08381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mult__Alternatives_1_0_in_rule__Mult__Group_1__0__Impl8408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mult__Group_1__1__Impl_in_rule__Mult__Group_1__18438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mult__UnaryAssignment_1_1_in_rule__Mult__Group_1__1__Impl8465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__Group__0__Impl_in_rule__Unary__Group__08499 = new BitSet(new long[]{0x0000000014800030L});
    public static final BitSet FOLLOW_rule__Unary__Group__1_in_rule__Unary__Group__08502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__Alternatives_0_in_rule__Unary__Group__0__Impl8529 = new BitSet(new long[]{0x0000000004800002L});
    public static final BitSet FOLLOW_rule__Unary__Group__1__Impl_in_rule__Unary__Group__18560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary__AtomAssignment_1_in_rule__Unary__Group__1__Impl8587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group__0__Impl_in_rule__Atom__Group__08621 = new BitSet(new long[]{0x0000000014800030L});
    public static final BitSet FOLLOW_rule__Atom__Group__1_in_rule__Atom__Group__08624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group__1__Impl_in_rule__Atom__Group__18682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Alternatives_1_in_rule__Atom__Group__1__Impl8709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1_1__0__Impl_in_rule__Atom__Group_1_1__08743 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Atom__Group_1_1__1_in_rule__Atom__Group_1_1__08746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Var1Assignment_1_1_0_in_rule__Atom__Group_1_1__0__Impl8773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1_1__1__Impl_in_rule__Atom__Group_1_1__18803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1_1_1__0_in_rule__Atom__Group_1_1__1__Impl8830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1_1_1__0__Impl_in_rule__Atom__Group_1_1_1__08865 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Atom__Group_1_1_1__1_in_rule__Atom__Group_1_1_1__08868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Atom__Group_1_1_1__0__Impl8896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1_1_1__1__Impl_in_rule__Atom__Group_1_1_1__18927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Var2Assignment_1_1_1_1_in_rule__Atom__Group_1_1_1__1__Impl8954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1_2__0__Impl_in_rule__Atom__Group_1_2__08988 = new BitSet(new long[]{0x0000000014800030L});
    public static final BitSet FOLLOW_rule__Atom__Group_1_2__1_in_rule__Atom__Group_1_2__08991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Atom__Group_1_2__0__Impl9019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1_2__1__Impl_in_rule__Atom__Group_1_2__19050 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Atom__Group_1_2__2_in_rule__Atom__Group_1_2__19053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__ExprAssignment_1_2_1_in_rule__Atom__Group_1_2__1__Impl9080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1_2__2__Impl_in_rule__Atom__Group_1_2__29110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Atom__Group_1_2__2__Impl9138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group__0__Impl_in_rule__Var__Group__09175 = new BitSet(new long[]{0x0000400100000000L});
    public static final BitSet FOLLOW_rule__Var__Group__1_in_rule__Var__Group__09178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__NameAssignment_0_in_rule__Var__Group__0__Impl9205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group__1__Impl_in_rule__Var__Group__19235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Alternatives_1_in_rule__Var__Group__1__Impl9262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group_1_0__0__Impl_in_rule__Var__Group_1_0__09297 = new BitSet(new long[]{0x0000000014800030L});
    public static final BitSet FOLLOW_rule__Var__Group_1_0__1_in_rule__Var__Group_1_0__09300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Var__Group_1_0__0__Impl9328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group_1_0__1__Impl_in_rule__Var__Group_1_0__19359 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Var__Group_1_0__2_in_rule__Var__Group_1_0__19362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__ExprAssignment_1_0_1_in_rule__Var__Group_1_0__1__Impl9389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group_1_0__2__Impl_in_rule__Var__Group_1_0__29419 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Var__Group_1_0__3_in_rule__Var__Group_1_0__29422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Var__Group_1_0__2__Impl9450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group_1_0__3__Impl_in_rule__Var__Group_1_0__39481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group_1_0_3__0_in_rule__Var__Group_1_0__3__Impl9508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group_1_0_3__0__Impl_in_rule__Var__Group_1_0_3__09547 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Var__Group_1_0_3__1_in_rule__Var__Group_1_0_3__09550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Var__Group_1_0_3__0__Impl9578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group_1_0_3__1__Impl_in_rule__Var__Group_1_0_3__19609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__SubnameAssignment_1_0_3_1_in_rule__Var__Group_1_0_3__1__Impl9636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group_1_1__0__Impl_in_rule__Var__Group_1_1__09670 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Var__Group_1_1__1_in_rule__Var__Group_1_1__09673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Var__Group_1_1__0__Impl9701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group_1_1__1__Impl_in_rule__Var__Group_1_1__19732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__SubnameAssignment_1_1_1_in_rule__Var__Group_1_1__1__Impl9759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGame_in_rule__Model__GameAssignment_09798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Model__DeclAssignment_19829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_rule__Model__StmtAssignment_29860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__Model__BlocksAssignment_39891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Game__NameAssignment_19922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrList_in_rule__Game__AttrAssignment_39953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_rule__Declaration__VarAssignment_0_09984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjDecl_in_rule__Declaration__ObjAssignment_0_110015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarDecl__NameAssignment_110046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInit_in_rule__VarDecl__ExprAssignment_2_010077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__VarDecl__IntAssignment_2_1_110108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Init__ExprAssignment_110139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjType_in_rule__ObjDecl__TypeAssignment_010170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ObjDecl__NameAssignment_110201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrList_in_rule__ObjDecl__AttrAssignment_2_0_110232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ObjDecl__IntAssignment_2_1_110263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AnimBlock__NameAssignment_110294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjType_in_rule__AnimBlock__TypeAssignment_310325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AnimBlock__ObjNameAssignment_410356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_rule__AnimBlock__StmtAssignment_610387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeystroke_in_rule__EventBlock__KeyAssignment_110418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_rule__EventBlock__StmtAssignment_210449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStmt_in_rule__StatementBlock__StmtAssignment_1_110480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssStmt_in_rule__ForStmt__Ass1Assignment_210511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ForStmt__ExprAssignment_310542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssStmt2_in_rule__ForStmt__Ass2Assignment_510573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_rule__ForStmt__StmtAssignment_710604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__IfStmt__ExprAssignment_210635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_rule__IfStmt__StmtAssignment_410666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElseStmt_in_rule__IfStmt__ElseAssignment_510697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_rule__ElseStmt__StmtAssignment_110728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_rule__AssStmt__VarAssignment_010759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__AssStmt__ExprAssignment_210790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_rule__AssStmt2__VarAssignment_010821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__AssStmt2__ExprAssignment_210852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrAss_in_rule__AttrList__AttrAssignment_1_010883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrAss_in_rule__AttrList__AttrAssignment_1_1_110914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AttrAss__NameAssignment_010945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__AttrAss__ExprAssignment_210976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConj_in_rule__Disj__ConjAssignment_011007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConj_in_rule__Disj__ConjAssignment_1_111038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelat_in_rule__Conj__RelatAssignment_011069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelat_in_rule__Conj__RelatAssignment_1_111100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdd_in_rule__Relat__AddAssignment_011131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdd_in_rule__Relat__AddAssignment_1_111162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMult_in_rule__Add__MultAssignment_011193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMult_in_rule__Add__MultAssignment_1_111224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnary_in_rule__Mult__UnaryAssignment_011255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnary_in_rule__Mult__UnaryAssignment_1_111286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_rule__Unary__AtomAssignment_111317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Atom__IntAssignment_1_011348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_rule__Atom__Var1Assignment_1_1_011379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_rule__Atom__Var2Assignment_1_1_1_111410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Atom__ExprAssignment_1_2_111441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Var__NameAssignment_011472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Var__ExprAssignment_1_0_111503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Var__SubnameAssignment_1_0_3_111534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Var__SubnameAssignment_1_1_111565 = new BitSet(new long[]{0x0000000000000002L});

}