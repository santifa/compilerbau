package org.xtext.mgpl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.mgpl.services.MgplDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMgplDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'game'", "'('", "')'", "';'", "'int'", "'['", "']'", "'='", "'animation'", "'on'", "'rectangle'", "'triangle'", "'circle'", "'space'", "'leftarrow'", "'rightarrow'", "'uparrow'", "'downarrow'", "'{'", "'}'", "'for'", "'if'", "'else'", "','", "'||'", "'&&'", "'=='", "'<'", "'<='", "'+'", "'-'", "'*'", "'/'", "'!'", "'touches'", "'.'"
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
    public String getGrammarFileName() { return "../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g"; }



     	private MgplDSLGrammarAccess grammarAccess;
     	
        public InternalMgplDSLParser(TokenStream input, MgplDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected MgplDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_game_0_0= ruleGame ) ) ( (lv_decl_1_0= ruleDeclaration ) )* ( (lv_stmt_2_0= ruleStatementBlock ) ) ( (lv_blocks_3_0= ruleBlock ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_game_0_0 = null;

        EObject lv_decl_1_0 = null;

        EObject lv_stmt_2_0 = null;

        EObject lv_blocks_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:79:28: ( ( ( (lv_game_0_0= ruleGame ) ) ( (lv_decl_1_0= ruleDeclaration ) )* ( (lv_stmt_2_0= ruleStatementBlock ) ) ( (lv_blocks_3_0= ruleBlock ) )* ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:80:1: ( ( (lv_game_0_0= ruleGame ) ) ( (lv_decl_1_0= ruleDeclaration ) )* ( (lv_stmt_2_0= ruleStatementBlock ) ) ( (lv_blocks_3_0= ruleBlock ) )* )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:80:1: ( ( (lv_game_0_0= ruleGame ) ) ( (lv_decl_1_0= ruleDeclaration ) )* ( (lv_stmt_2_0= ruleStatementBlock ) ) ( (lv_blocks_3_0= ruleBlock ) )* )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:80:2: ( (lv_game_0_0= ruleGame ) ) ( (lv_decl_1_0= ruleDeclaration ) )* ( (lv_stmt_2_0= ruleStatementBlock ) ) ( (lv_blocks_3_0= ruleBlock ) )*
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:80:2: ( (lv_game_0_0= ruleGame ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:81:1: (lv_game_0_0= ruleGame )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:81:1: (lv_game_0_0= ruleGame )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:82:3: lv_game_0_0= ruleGame
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getGameGameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleGame_in_ruleModel131);
            lv_game_0_0=ruleGame();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"game",
                    		lv_game_0_0, 
                    		"Game");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:98:2: ( (lv_decl_1_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||(LA1_0>=21 && LA1_0<=23)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:99:1: (lv_decl_1_0= ruleDeclaration )
            	    {
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:99:1: (lv_decl_1_0= ruleDeclaration )
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:100:3: lv_decl_1_0= ruleDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getDeclDeclarationParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleModel152);
            	    lv_decl_1_0=ruleDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"decl",
            	            		lv_decl_1_0, 
            	            		"Declaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:116:3: ( (lv_stmt_2_0= ruleStatementBlock ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:117:1: (lv_stmt_2_0= ruleStatementBlock )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:117:1: (lv_stmt_2_0= ruleStatementBlock )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:118:3: lv_stmt_2_0= ruleStatementBlock
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getStmtStatementBlockParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStatementBlock_in_ruleModel174);
            lv_stmt_2_0=ruleStatementBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"stmt",
                    		lv_stmt_2_0, 
                    		"StatementBlock");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:134:2: ( (lv_blocks_3_0= ruleBlock ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=19 && LA2_0<=20)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:135:1: (lv_blocks_3_0= ruleBlock )
            	    {
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:135:1: (lv_blocks_3_0= ruleBlock )
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:136:3: lv_blocks_3_0= ruleBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getBlocksBlockParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBlock_in_ruleModel195);
            	    lv_blocks_3_0=ruleBlock();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"blocks",
            	            		lv_blocks_3_0, 
            	            		"Block");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGame"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:160:1: entryRuleGame returns [EObject current=null] : iv_ruleGame= ruleGame EOF ;
    public final EObject entryRuleGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGame = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:161:2: (iv_ruleGame= ruleGame EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:162:2: iv_ruleGame= ruleGame EOF
            {
             newCompositeNode(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_ruleGame_in_entryRuleGame232);
            iv_ruleGame=ruleGame();

            state._fsp--;

             current =iv_ruleGame; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGame242); 

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
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:169:1: ruleGame returns [EObject current=null] : (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attr_3_0= ruleAttrList ) ) otherlv_4= ')' ) ;
    public final EObject ruleGame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:172:28: ( (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attr_3_0= ruleAttrList ) ) otherlv_4= ')' ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:173:1: (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attr_3_0= ruleAttrList ) ) otherlv_4= ')' )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:173:1: (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attr_3_0= ruleAttrList ) ) otherlv_4= ')' )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:173:3: otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attr_3_0= ruleAttrList ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleGame279); 

                	newLeafNode(otherlv_0, grammarAccess.getGameAccess().getGameKeyword_0());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:177:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:178:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:178:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:179:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGame296); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGameAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGameRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGame313); 

                	newLeafNode(otherlv_2, grammarAccess.getGameAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:199:1: ( (lv_attr_3_0= ruleAttrList ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:200:1: (lv_attr_3_0= ruleAttrList )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:200:1: (lv_attr_3_0= ruleAttrList )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:201:3: lv_attr_3_0= ruleAttrList
            {
             
            	        newCompositeNode(grammarAccess.getGameAccess().getAttrAttrListParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAttrList_in_ruleGame334);
            lv_attr_3_0=ruleAttrList();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGameRule());
            	        }
                   		set(
                   			current, 
                   			"attr",
                    		lv_attr_3_0, 
                    		"AttrList");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleGame346); 

                	newLeafNode(otherlv_4, grammarAccess.getGameAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRuleDeclaration"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:229:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:230:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:231:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration382);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration392); 

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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:238:1: ruleDeclaration returns [EObject current=null] : ( ( ( (lv_var_0_0= ruleVarDecl ) ) | ( (lv_obj_1_0= ruleObjDecl ) ) ) otherlv_2= ';' ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_var_0_0 = null;

        EObject lv_obj_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:241:28: ( ( ( ( (lv_var_0_0= ruleVarDecl ) ) | ( (lv_obj_1_0= ruleObjDecl ) ) ) otherlv_2= ';' ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:242:1: ( ( ( (lv_var_0_0= ruleVarDecl ) ) | ( (lv_obj_1_0= ruleObjDecl ) ) ) otherlv_2= ';' )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:242:1: ( ( ( (lv_var_0_0= ruleVarDecl ) ) | ( (lv_obj_1_0= ruleObjDecl ) ) ) otherlv_2= ';' )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:242:2: ( ( (lv_var_0_0= ruleVarDecl ) ) | ( (lv_obj_1_0= ruleObjDecl ) ) ) otherlv_2= ';'
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:242:2: ( ( (lv_var_0_0= ruleVarDecl ) ) | ( (lv_obj_1_0= ruleObjDecl ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=21 && LA3_0<=23)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:242:3: ( (lv_var_0_0= ruleVarDecl ) )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:242:3: ( (lv_var_0_0= ruleVarDecl ) )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:243:1: (lv_var_0_0= ruleVarDecl )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:243:1: (lv_var_0_0= ruleVarDecl )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:244:3: lv_var_0_0= ruleVarDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeclarationAccess().getVarVarDeclParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVarDecl_in_ruleDeclaration439);
                    lv_var_0_0=ruleVarDecl();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"var",
                            		lv_var_0_0, 
                            		"VarDecl");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:261:6: ( (lv_obj_1_0= ruleObjDecl ) )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:261:6: ( (lv_obj_1_0= ruleObjDecl ) )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:262:1: (lv_obj_1_0= ruleObjDecl )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:262:1: (lv_obj_1_0= ruleObjDecl )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:263:3: lv_obj_1_0= ruleObjDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeclarationAccess().getObjObjDeclParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleObjDecl_in_ruleDeclaration466);
                    lv_obj_1_0=ruleObjDecl();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"obj",
                            		lv_obj_1_0, 
                            		"ObjDecl");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleDeclaration479); 

                	newLeafNode(otherlv_2, grammarAccess.getDeclarationAccess().getSemicolonKeyword_1());
                

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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleVarDecl"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:291:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:292:2: (iv_ruleVarDecl= ruleVarDecl EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:293:2: iv_ruleVarDecl= ruleVarDecl EOF
            {
             newCompositeNode(grammarAccess.getVarDeclRule()); 
            pushFollow(FOLLOW_ruleVarDecl_in_entryRuleVarDecl515);
            iv_ruleVarDecl=ruleVarDecl();

            state._fsp--;

             current =iv_ruleVarDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDecl525); 

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
    // $ANTLR end "entryRuleVarDecl"


    // $ANTLR start "ruleVarDecl"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:300:1: ruleVarDecl returns [EObject current=null] : (otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_expr_2_0= ruleInit ) )? | (otherlv_3= '[' ( (lv_int_4_0= RULE_INT ) ) otherlv_5= ']' ) ) ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token lv_int_4_0=null;
        Token otherlv_5=null;
        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:303:28: ( (otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_expr_2_0= ruleInit ) )? | (otherlv_3= '[' ( (lv_int_4_0= RULE_INT ) ) otherlv_5= ']' ) ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:304:1: (otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_expr_2_0= ruleInit ) )? | (otherlv_3= '[' ( (lv_int_4_0= RULE_INT ) ) otherlv_5= ']' ) ) )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:304:1: (otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_expr_2_0= ruleInit ) )? | (otherlv_3= '[' ( (lv_int_4_0= RULE_INT ) ) otherlv_5= ']' ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:304:3: otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_expr_2_0= ruleInit ) )? | (otherlv_3= '[' ( (lv_int_4_0= RULE_INT ) ) otherlv_5= ']' ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleVarDecl562); 

                	newLeafNode(otherlv_0, grammarAccess.getVarDeclAccess().getIntKeyword_0());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:308:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:309:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:309:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:310:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarDecl579); 

            			newLeafNode(lv_name_1_0, grammarAccess.getVarDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVarDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:326:2: ( ( (lv_expr_2_0= ruleInit ) )? | (otherlv_3= '[' ( (lv_int_4_0= RULE_INT ) ) otherlv_5= ']' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==EOF||LA5_0==14||LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:326:3: ( (lv_expr_2_0= ruleInit ) )?
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:326:3: ( (lv_expr_2_0= ruleInit ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==18) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:327:1: (lv_expr_2_0= ruleInit )
                            {
                            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:327:1: (lv_expr_2_0= ruleInit )
                            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:328:3: lv_expr_2_0= ruleInit
                            {
                             
                            	        newCompositeNode(grammarAccess.getVarDeclAccess().getExprInitParserRuleCall_2_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleInit_in_ruleVarDecl606);
                            lv_expr_2_0=ruleInit();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getVarDeclRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"expr",
                                    		lv_expr_2_0, 
                                    		"Init");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:345:6: (otherlv_3= '[' ( (lv_int_4_0= RULE_INT ) ) otherlv_5= ']' )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:345:6: (otherlv_3= '[' ( (lv_int_4_0= RULE_INT ) ) otherlv_5= ']' )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:345:8: otherlv_3= '[' ( (lv_int_4_0= RULE_INT ) ) otherlv_5= ']'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleVarDecl626); 

                        	newLeafNode(otherlv_3, grammarAccess.getVarDeclAccess().getLeftSquareBracketKeyword_2_1_0());
                        
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:349:1: ( (lv_int_4_0= RULE_INT ) )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:350:1: (lv_int_4_0= RULE_INT )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:350:1: (lv_int_4_0= RULE_INT )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:351:3: lv_int_4_0= RULE_INT
                    {
                    lv_int_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVarDecl643); 

                    			newLeafNode(lv_int_4_0, grammarAccess.getVarDeclAccess().getIntINTTerminalRuleCall_2_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVarDeclRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"int",
                            		lv_int_4_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleVarDecl660); 

                        	newLeafNode(otherlv_5, grammarAccess.getVarDeclAccess().getRightSquareBracketKeyword_2_1_2());
                        

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
    // $ANTLR end "ruleVarDecl"


    // $ANTLR start "entryRuleInit"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:379:1: entryRuleInit returns [EObject current=null] : iv_ruleInit= ruleInit EOF ;
    public final EObject entryRuleInit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInit = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:380:2: (iv_ruleInit= ruleInit EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:381:2: iv_ruleInit= ruleInit EOF
            {
             newCompositeNode(grammarAccess.getInitRule()); 
            pushFollow(FOLLOW_ruleInit_in_entryRuleInit698);
            iv_ruleInit=ruleInit();

            state._fsp--;

             current =iv_ruleInit; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInit708); 

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
    // $ANTLR end "entryRuleInit"


    // $ANTLR start "ruleInit"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:388:1: ruleInit returns [EObject current=null] : (otherlv_0= '=' ( (lv_expr_1_0= ruleExpr ) ) ) ;
    public final EObject ruleInit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:391:28: ( (otherlv_0= '=' ( (lv_expr_1_0= ruleExpr ) ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:392:1: (otherlv_0= '=' ( (lv_expr_1_0= ruleExpr ) ) )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:392:1: (otherlv_0= '=' ( (lv_expr_1_0= ruleExpr ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:392:3: otherlv_0= '=' ( (lv_expr_1_0= ruleExpr ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleInit745); 

                	newLeafNode(otherlv_0, grammarAccess.getInitAccess().getEqualsSignKeyword_0());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:396:1: ( (lv_expr_1_0= ruleExpr ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:397:1: (lv_expr_1_0= ruleExpr )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:397:1: (lv_expr_1_0= ruleExpr )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:398:3: lv_expr_1_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getInitAccess().getExprExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleInit766);
            lv_expr_1_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInitRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_1_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleInit"


    // $ANTLR start "entryRuleObjDecl"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:422:1: entryRuleObjDecl returns [EObject current=null] : iv_ruleObjDecl= ruleObjDecl EOF ;
    public final EObject entryRuleObjDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjDecl = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:423:2: (iv_ruleObjDecl= ruleObjDecl EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:424:2: iv_ruleObjDecl= ruleObjDecl EOF
            {
             newCompositeNode(grammarAccess.getObjDeclRule()); 
            pushFollow(FOLLOW_ruleObjDecl_in_entryRuleObjDecl802);
            iv_ruleObjDecl=ruleObjDecl();

            state._fsp--;

             current =iv_ruleObjDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjDecl812); 

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
    // $ANTLR end "entryRuleObjDecl"


    // $ANTLR start "ruleObjDecl"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:431:1: ruleObjDecl returns [EObject current=null] : ( ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_attr_3_0= ruleAttrList ) ) otherlv_4= ')' ) | (otherlv_5= '[' ( (lv_int_6_0= RULE_INT ) ) otherlv_7= ']' ) ) ) ;
    public final EObject ruleObjDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_int_6_0=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;

        EObject lv_attr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:434:28: ( ( ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_attr_3_0= ruleAttrList ) ) otherlv_4= ')' ) | (otherlv_5= '[' ( (lv_int_6_0= RULE_INT ) ) otherlv_7= ']' ) ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:435:1: ( ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_attr_3_0= ruleAttrList ) ) otherlv_4= ')' ) | (otherlv_5= '[' ( (lv_int_6_0= RULE_INT ) ) otherlv_7= ']' ) ) )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:435:1: ( ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_attr_3_0= ruleAttrList ) ) otherlv_4= ')' ) | (otherlv_5= '[' ( (lv_int_6_0= RULE_INT ) ) otherlv_7= ']' ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:435:2: ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_attr_3_0= ruleAttrList ) ) otherlv_4= ')' ) | (otherlv_5= '[' ( (lv_int_6_0= RULE_INT ) ) otherlv_7= ']' ) )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:435:2: ( (lv_type_0_0= ruleObjType ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:436:1: (lv_type_0_0= ruleObjType )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:436:1: (lv_type_0_0= ruleObjType )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:437:3: lv_type_0_0= ruleObjType
            {
             
            	        newCompositeNode(grammarAccess.getObjDeclAccess().getTypeObjTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleObjType_in_ruleObjDecl858);
            lv_type_0_0=ruleObjType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getObjDeclRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"ObjType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:453:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:454:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:454:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:455:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjDecl875); 

            			newLeafNode(lv_name_1_0, grammarAccess.getObjDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getObjDeclRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:471:2: ( (otherlv_2= '(' ( (lv_attr_3_0= ruleAttrList ) ) otherlv_4= ')' ) | (otherlv_5= '[' ( (lv_int_6_0= RULE_INT ) ) otherlv_7= ']' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:471:3: (otherlv_2= '(' ( (lv_attr_3_0= ruleAttrList ) ) otherlv_4= ')' )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:471:3: (otherlv_2= '(' ( (lv_attr_3_0= ruleAttrList ) ) otherlv_4= ')' )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:471:5: otherlv_2= '(' ( (lv_attr_3_0= ruleAttrList ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleObjDecl894); 

                        	newLeafNode(otherlv_2, grammarAccess.getObjDeclAccess().getLeftParenthesisKeyword_2_0_0());
                        
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:475:1: ( (lv_attr_3_0= ruleAttrList ) )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:476:1: (lv_attr_3_0= ruleAttrList )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:476:1: (lv_attr_3_0= ruleAttrList )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:477:3: lv_attr_3_0= ruleAttrList
                    {
                     
                    	        newCompositeNode(grammarAccess.getObjDeclAccess().getAttrAttrListParserRuleCall_2_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttrList_in_ruleObjDecl915);
                    lv_attr_3_0=ruleAttrList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getObjDeclRule());
                    	        }
                           		set(
                           			current, 
                           			"attr",
                            		lv_attr_3_0, 
                            		"AttrList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleObjDecl927); 

                        	newLeafNode(otherlv_4, grammarAccess.getObjDeclAccess().getRightParenthesisKeyword_2_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:498:6: (otherlv_5= '[' ( (lv_int_6_0= RULE_INT ) ) otherlv_7= ']' )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:498:6: (otherlv_5= '[' ( (lv_int_6_0= RULE_INT ) ) otherlv_7= ']' )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:498:8: otherlv_5= '[' ( (lv_int_6_0= RULE_INT ) ) otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleObjDecl947); 

                        	newLeafNode(otherlv_5, grammarAccess.getObjDeclAccess().getLeftSquareBracketKeyword_2_1_0());
                        
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:502:1: ( (lv_int_6_0= RULE_INT ) )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:503:1: (lv_int_6_0= RULE_INT )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:503:1: (lv_int_6_0= RULE_INT )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:504:3: lv_int_6_0= RULE_INT
                    {
                    lv_int_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleObjDecl964); 

                    			newLeafNode(lv_int_6_0, grammarAccess.getObjDeclAccess().getIntINTTerminalRuleCall_2_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getObjDeclRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"int",
                            		lv_int_6_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleObjDecl981); 

                        	newLeafNode(otherlv_7, grammarAccess.getObjDeclAccess().getRightSquareBracketKeyword_2_1_2());
                        

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
    // $ANTLR end "ruleObjDecl"


    // $ANTLR start "entryRuleBlock"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:532:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:533:2: (iv_ruleBlock= ruleBlock EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:534:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock1019);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock1029); 

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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:541:1: ruleBlock returns [EObject current=null] : (this_AnimBlock_0= ruleAnimBlock | this_EventBlock_1= ruleEventBlock ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        EObject this_AnimBlock_0 = null;

        EObject this_EventBlock_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:544:28: ( (this_AnimBlock_0= ruleAnimBlock | this_EventBlock_1= ruleEventBlock ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:545:1: (this_AnimBlock_0= ruleAnimBlock | this_EventBlock_1= ruleEventBlock )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:545:1: (this_AnimBlock_0= ruleAnimBlock | this_EventBlock_1= ruleEventBlock )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:546:5: this_AnimBlock_0= ruleAnimBlock
                    {
                     
                            newCompositeNode(grammarAccess.getBlockAccess().getAnimBlockParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAnimBlock_in_ruleBlock1076);
                    this_AnimBlock_0=ruleAnimBlock();

                    state._fsp--;

                     
                            current = this_AnimBlock_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:556:5: this_EventBlock_1= ruleEventBlock
                    {
                     
                            newCompositeNode(grammarAccess.getBlockAccess().getEventBlockParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEventBlock_in_ruleBlock1103);
                    this_EventBlock_1=ruleEventBlock();

                    state._fsp--;

                     
                            current = this_EventBlock_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleAnimBlock"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:572:1: entryRuleAnimBlock returns [EObject current=null] : iv_ruleAnimBlock= ruleAnimBlock EOF ;
    public final EObject entryRuleAnimBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnimBlock = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:573:2: (iv_ruleAnimBlock= ruleAnimBlock EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:574:2: iv_ruleAnimBlock= ruleAnimBlock EOF
            {
             newCompositeNode(grammarAccess.getAnimBlockRule()); 
            pushFollow(FOLLOW_ruleAnimBlock_in_entryRuleAnimBlock1138);
            iv_ruleAnimBlock=ruleAnimBlock();

            state._fsp--;

             current =iv_ruleAnimBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnimBlock1148); 

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
    // $ANTLR end "entryRuleAnimBlock"


    // $ANTLR start "ruleAnimBlock"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:581:1: ruleAnimBlock returns [EObject current=null] : (otherlv_0= 'animation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleObjType ) ) ( (lv_objName_4_0= RULE_ID ) ) otherlv_5= ')' ( (lv_stmt_6_0= ruleStatementBlock ) ) ) ;
    public final EObject ruleAnimBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_objName_4_0=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;

        EObject lv_stmt_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:584:28: ( (otherlv_0= 'animation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleObjType ) ) ( (lv_objName_4_0= RULE_ID ) ) otherlv_5= ')' ( (lv_stmt_6_0= ruleStatementBlock ) ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:585:1: (otherlv_0= 'animation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleObjType ) ) ( (lv_objName_4_0= RULE_ID ) ) otherlv_5= ')' ( (lv_stmt_6_0= ruleStatementBlock ) ) )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:585:1: (otherlv_0= 'animation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleObjType ) ) ( (lv_objName_4_0= RULE_ID ) ) otherlv_5= ')' ( (lv_stmt_6_0= ruleStatementBlock ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:585:3: otherlv_0= 'animation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleObjType ) ) ( (lv_objName_4_0= RULE_ID ) ) otherlv_5= ')' ( (lv_stmt_6_0= ruleStatementBlock ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleAnimBlock1185); 

                	newLeafNode(otherlv_0, grammarAccess.getAnimBlockAccess().getAnimationKeyword_0());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:589:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:590:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:590:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:591:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnimBlock1202); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAnimBlockAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnimBlockRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleAnimBlock1219); 

                	newLeafNode(otherlv_2, grammarAccess.getAnimBlockAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:611:1: ( (lv_type_3_0= ruleObjType ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:612:1: (lv_type_3_0= ruleObjType )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:612:1: (lv_type_3_0= ruleObjType )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:613:3: lv_type_3_0= ruleObjType
            {
             
            	        newCompositeNode(grammarAccess.getAnimBlockAccess().getTypeObjTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleObjType_in_ruleAnimBlock1240);
            lv_type_3_0=ruleObjType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnimBlockRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"ObjType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:629:2: ( (lv_objName_4_0= RULE_ID ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:630:1: (lv_objName_4_0= RULE_ID )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:630:1: (lv_objName_4_0= RULE_ID )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:631:3: lv_objName_4_0= RULE_ID
            {
            lv_objName_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnimBlock1257); 

            			newLeafNode(lv_objName_4_0, grammarAccess.getAnimBlockAccess().getObjNameIDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnimBlockRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"objName",
                    		lv_objName_4_0, 
                    		"ID");
            	    

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleAnimBlock1274); 

                	newLeafNode(otherlv_5, grammarAccess.getAnimBlockAccess().getRightParenthesisKeyword_5());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:651:1: ( (lv_stmt_6_0= ruleStatementBlock ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:652:1: (lv_stmt_6_0= ruleStatementBlock )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:652:1: (lv_stmt_6_0= ruleStatementBlock )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:653:3: lv_stmt_6_0= ruleStatementBlock
            {
             
            	        newCompositeNode(grammarAccess.getAnimBlockAccess().getStmtStatementBlockParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleStatementBlock_in_ruleAnimBlock1295);
            lv_stmt_6_0=ruleStatementBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAnimBlockRule());
            	        }
                   		set(
                   			current, 
                   			"stmt",
                    		lv_stmt_6_0, 
                    		"StatementBlock");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleAnimBlock"


    // $ANTLR start "entryRuleEventBlock"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:677:1: entryRuleEventBlock returns [EObject current=null] : iv_ruleEventBlock= ruleEventBlock EOF ;
    public final EObject entryRuleEventBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventBlock = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:678:2: (iv_ruleEventBlock= ruleEventBlock EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:679:2: iv_ruleEventBlock= ruleEventBlock EOF
            {
             newCompositeNode(grammarAccess.getEventBlockRule()); 
            pushFollow(FOLLOW_ruleEventBlock_in_entryRuleEventBlock1331);
            iv_ruleEventBlock=ruleEventBlock();

            state._fsp--;

             current =iv_ruleEventBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventBlock1341); 

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
    // $ANTLR end "entryRuleEventBlock"


    // $ANTLR start "ruleEventBlock"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:686:1: ruleEventBlock returns [EObject current=null] : (otherlv_0= 'on' ( (lv_key_1_0= ruleKeystroke ) ) ( (lv_stmt_2_0= ruleStatementBlock ) ) ) ;
    public final EObject ruleEventBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;

        EObject lv_stmt_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:689:28: ( (otherlv_0= 'on' ( (lv_key_1_0= ruleKeystroke ) ) ( (lv_stmt_2_0= ruleStatementBlock ) ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:690:1: (otherlv_0= 'on' ( (lv_key_1_0= ruleKeystroke ) ) ( (lv_stmt_2_0= ruleStatementBlock ) ) )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:690:1: (otherlv_0= 'on' ( (lv_key_1_0= ruleKeystroke ) ) ( (lv_stmt_2_0= ruleStatementBlock ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:690:3: otherlv_0= 'on' ( (lv_key_1_0= ruleKeystroke ) ) ( (lv_stmt_2_0= ruleStatementBlock ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleEventBlock1378); 

                	newLeafNode(otherlv_0, grammarAccess.getEventBlockAccess().getOnKeyword_0());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:694:1: ( (lv_key_1_0= ruleKeystroke ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:695:1: (lv_key_1_0= ruleKeystroke )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:695:1: (lv_key_1_0= ruleKeystroke )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:696:3: lv_key_1_0= ruleKeystroke
            {
             
            	        newCompositeNode(grammarAccess.getEventBlockAccess().getKeyKeystrokeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleKeystroke_in_ruleEventBlock1399);
            lv_key_1_0=ruleKeystroke();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEventBlockRule());
            	        }
                   		set(
                   			current, 
                   			"key",
                    		lv_key_1_0, 
                    		"Keystroke");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:712:2: ( (lv_stmt_2_0= ruleStatementBlock ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:713:1: (lv_stmt_2_0= ruleStatementBlock )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:713:1: (lv_stmt_2_0= ruleStatementBlock )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:714:3: lv_stmt_2_0= ruleStatementBlock
            {
             
            	        newCompositeNode(grammarAccess.getEventBlockAccess().getStmtStatementBlockParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStatementBlock_in_ruleEventBlock1420);
            lv_stmt_2_0=ruleStatementBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEventBlockRule());
            	        }
                   		set(
                   			current, 
                   			"stmt",
                    		lv_stmt_2_0, 
                    		"StatementBlock");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleEventBlock"


    // $ANTLR start "entryRuleObjType"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:738:1: entryRuleObjType returns [String current=null] : iv_ruleObjType= ruleObjType EOF ;
    public final String entryRuleObjType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleObjType = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:739:2: (iv_ruleObjType= ruleObjType EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:740:2: iv_ruleObjType= ruleObjType EOF
            {
             newCompositeNode(grammarAccess.getObjTypeRule()); 
            pushFollow(FOLLOW_ruleObjType_in_entryRuleObjType1457);
            iv_ruleObjType=ruleObjType();

            state._fsp--;

             current =iv_ruleObjType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjType1468); 

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
    // $ANTLR end "entryRuleObjType"


    // $ANTLR start "ruleObjType"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:747:1: ruleObjType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'rectangle' | kw= 'triangle' | kw= 'circle' ) ;
    public final AntlrDatatypeRuleToken ruleObjType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:750:28: ( (kw= 'rectangle' | kw= 'triangle' | kw= 'circle' ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:751:1: (kw= 'rectangle' | kw= 'triangle' | kw= 'circle' )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:751:1: (kw= 'rectangle' | kw= 'triangle' | kw= 'circle' )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 23:
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
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:752:2: kw= 'rectangle'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleObjType1506); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getObjTypeAccess().getRectangleKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:759:2: kw= 'triangle'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleObjType1525); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getObjTypeAccess().getTriangleKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:766:2: kw= 'circle'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleObjType1544); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getObjTypeAccess().getCircleKeyword_2()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleObjType"


    // $ANTLR start "entryRuleKeystroke"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:779:1: entryRuleKeystroke returns [String current=null] : iv_ruleKeystroke= ruleKeystroke EOF ;
    public final String entryRuleKeystroke() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeystroke = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:780:2: (iv_ruleKeystroke= ruleKeystroke EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:781:2: iv_ruleKeystroke= ruleKeystroke EOF
            {
             newCompositeNode(grammarAccess.getKeystrokeRule()); 
            pushFollow(FOLLOW_ruleKeystroke_in_entryRuleKeystroke1585);
            iv_ruleKeystroke=ruleKeystroke();

            state._fsp--;

             current =iv_ruleKeystroke.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeystroke1596); 

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
    // $ANTLR end "entryRuleKeystroke"


    // $ANTLR start "ruleKeystroke"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:788:1: ruleKeystroke returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'space' | kw= 'leftarrow' | kw= 'rightarrow' | kw= 'uparrow' | kw= 'downarrow' ) ;
    public final AntlrDatatypeRuleToken ruleKeystroke() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:791:28: ( (kw= 'space' | kw= 'leftarrow' | kw= 'rightarrow' | kw= 'uparrow' | kw= 'downarrow' ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:792:1: (kw= 'space' | kw= 'leftarrow' | kw= 'rightarrow' | kw= 'uparrow' | kw= 'downarrow' )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:792:1: (kw= 'space' | kw= 'leftarrow' | kw= 'rightarrow' | kw= 'uparrow' | kw= 'downarrow' )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt9=1;
                }
                break;
            case 25:
                {
                alt9=2;
                }
                break;
            case 26:
                {
                alt9=3;
                }
                break;
            case 27:
                {
                alt9=4;
                }
                break;
            case 28:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:793:2: kw= 'space'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleKeystroke1634); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getKeystrokeAccess().getSpaceKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:800:2: kw= 'leftarrow'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleKeystroke1653); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getKeystrokeAccess().getLeftarrowKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:807:2: kw= 'rightarrow'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleKeystroke1672); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getKeystrokeAccess().getRightarrowKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:814:2: kw= 'uparrow'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleKeystroke1691); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getKeystrokeAccess().getUparrowKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:821:2: kw= 'downarrow'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleKeystroke1710); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getKeystrokeAccess().getDownarrowKeyword_4()); 
                        

                    }
                    break;

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
    // $ANTLR end "ruleKeystroke"


    // $ANTLR start "entryRuleStatementBlock"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:834:1: entryRuleStatementBlock returns [EObject current=null] : iv_ruleStatementBlock= ruleStatementBlock EOF ;
    public final EObject entryRuleStatementBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementBlock = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:835:2: (iv_ruleStatementBlock= ruleStatementBlock EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:836:2: iv_ruleStatementBlock= ruleStatementBlock EOF
            {
             newCompositeNode(grammarAccess.getStatementBlockRule()); 
            pushFollow(FOLLOW_ruleStatementBlock_in_entryRuleStatementBlock1750);
            iv_ruleStatementBlock=ruleStatementBlock();

            state._fsp--;

             current =iv_ruleStatementBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatementBlock1760); 

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
    // $ANTLR end "entryRuleStatementBlock"


    // $ANTLR start "ruleStatementBlock"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:843:1: ruleStatementBlock returns [EObject current=null] : ( () (otherlv_1= '{' ( (lv_stmt_2_0= ruleStmt ) )* otherlv_3= '}' ) ) ;
    public final EObject ruleStatementBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_stmt_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:846:28: ( ( () (otherlv_1= '{' ( (lv_stmt_2_0= ruleStmt ) )* otherlv_3= '}' ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:847:1: ( () (otherlv_1= '{' ( (lv_stmt_2_0= ruleStmt ) )* otherlv_3= '}' ) )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:847:1: ( () (otherlv_1= '{' ( (lv_stmt_2_0= ruleStmt ) )* otherlv_3= '}' ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:847:2: () (otherlv_1= '{' ( (lv_stmt_2_0= ruleStmt ) )* otherlv_3= '}' )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:847:2: ()
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:848:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStatementBlockAccess().getStatementBlockAction_0(),
                        current);
                

            }

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:853:2: (otherlv_1= '{' ( (lv_stmt_2_0= ruleStmt ) )* otherlv_3= '}' )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:853:4: otherlv_1= '{' ( (lv_stmt_2_0= ruleStmt ) )* otherlv_3= '}'
            {
            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleStatementBlock1807); 

                	newLeafNode(otherlv_1, grammarAccess.getStatementBlockAccess().getLeftCurlyBracketKeyword_1_0());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:857:1: ( (lv_stmt_2_0= ruleStmt ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||(LA10_0>=31 && LA10_0<=32)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:858:1: (lv_stmt_2_0= ruleStmt )
            	    {
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:858:1: (lv_stmt_2_0= ruleStmt )
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:859:3: lv_stmt_2_0= ruleStmt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatementBlockAccess().getStmtStmtParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStmt_in_ruleStatementBlock1828);
            	    lv_stmt_2_0=ruleStmt();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStatementBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"stmt",
            	            		lv_stmt_2_0, 
            	            		"Stmt");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleStatementBlock1841); 

                	newLeafNode(otherlv_3, grammarAccess.getStatementBlockAccess().getRightCurlyBracketKeyword_1_2());
                

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
    // $ANTLR end "ruleStatementBlock"


    // $ANTLR start "entryRuleStmt"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:887:1: entryRuleStmt returns [EObject current=null] : iv_ruleStmt= ruleStmt EOF ;
    public final EObject entryRuleStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStmt = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:888:2: (iv_ruleStmt= ruleStmt EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:889:2: iv_ruleStmt= ruleStmt EOF
            {
             newCompositeNode(grammarAccess.getStmtRule()); 
            pushFollow(FOLLOW_ruleStmt_in_entryRuleStmt1878);
            iv_ruleStmt=ruleStmt();

            state._fsp--;

             current =iv_ruleStmt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStmt1888); 

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
    // $ANTLR end "entryRuleStmt"


    // $ANTLR start "ruleStmt"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:896:1: ruleStmt returns [EObject current=null] : (this_IfStmt_0= ruleIfStmt | this_ForStmt_1= ruleForStmt | this_AssStmt_2= ruleAssStmt ) ;
    public final EObject ruleStmt() throws RecognitionException {
        EObject current = null;

        EObject this_IfStmt_0 = null;

        EObject this_ForStmt_1 = null;

        EObject this_AssStmt_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:899:28: ( (this_IfStmt_0= ruleIfStmt | this_ForStmt_1= ruleForStmt | this_AssStmt_2= ruleAssStmt ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:900:1: (this_IfStmt_0= ruleIfStmt | this_ForStmt_1= ruleForStmt | this_AssStmt_2= ruleAssStmt )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:900:1: (this_IfStmt_0= ruleIfStmt | this_ForStmt_1= ruleForStmt | this_AssStmt_2= ruleAssStmt )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt11=1;
                }
                break;
            case 31:
                {
                alt11=2;
                }
                break;
            case RULE_ID:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:901:5: this_IfStmt_0= ruleIfStmt
                    {
                     
                            newCompositeNode(grammarAccess.getStmtAccess().getIfStmtParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIfStmt_in_ruleStmt1935);
                    this_IfStmt_0=ruleIfStmt();

                    state._fsp--;

                     
                            current = this_IfStmt_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:911:5: this_ForStmt_1= ruleForStmt
                    {
                     
                            newCompositeNode(grammarAccess.getStmtAccess().getForStmtParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleForStmt_in_ruleStmt1962);
                    this_ForStmt_1=ruleForStmt();

                    state._fsp--;

                     
                            current = this_ForStmt_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:921:5: this_AssStmt_2= ruleAssStmt
                    {
                     
                            newCompositeNode(grammarAccess.getStmtAccess().getAssStmtParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAssStmt_in_ruleStmt1989);
                    this_AssStmt_2=ruleAssStmt();

                    state._fsp--;

                     
                            current = this_AssStmt_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

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
    // $ANTLR end "ruleStmt"


    // $ANTLR start "entryRuleForStmt"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:937:1: entryRuleForStmt returns [EObject current=null] : iv_ruleForStmt= ruleForStmt EOF ;
    public final EObject entryRuleForStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStmt = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:938:2: (iv_ruleForStmt= ruleForStmt EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:939:2: iv_ruleForStmt= ruleForStmt EOF
            {
             newCompositeNode(grammarAccess.getForStmtRule()); 
            pushFollow(FOLLOW_ruleForStmt_in_entryRuleForStmt2024);
            iv_ruleForStmt=ruleForStmt();

            state._fsp--;

             current =iv_ruleForStmt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForStmt2034); 

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
    // $ANTLR end "entryRuleForStmt"


    // $ANTLR start "ruleForStmt"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:946:1: ruleForStmt returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_ass1_2_0= ruleAssStmt ) ) ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= ';' ( (lv_ass2_5_0= ruleAssStmt2 ) ) otherlv_6= ')' ( (lv_stmt_7_0= ruleStatementBlock ) ) ) ;
    public final EObject ruleForStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_ass1_2_0 = null;

        EObject lv_expr_3_0 = null;

        EObject lv_ass2_5_0 = null;

        EObject lv_stmt_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:949:28: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_ass1_2_0= ruleAssStmt ) ) ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= ';' ( (lv_ass2_5_0= ruleAssStmt2 ) ) otherlv_6= ')' ( (lv_stmt_7_0= ruleStatementBlock ) ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:950:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_ass1_2_0= ruleAssStmt ) ) ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= ';' ( (lv_ass2_5_0= ruleAssStmt2 ) ) otherlv_6= ')' ( (lv_stmt_7_0= ruleStatementBlock ) ) )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:950:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_ass1_2_0= ruleAssStmt ) ) ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= ';' ( (lv_ass2_5_0= ruleAssStmt2 ) ) otherlv_6= ')' ( (lv_stmt_7_0= ruleStatementBlock ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:950:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_ass1_2_0= ruleAssStmt ) ) ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= ';' ( (lv_ass2_5_0= ruleAssStmt2 ) ) otherlv_6= ')' ( (lv_stmt_7_0= ruleStatementBlock ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleForStmt2071); 

                	newLeafNode(otherlv_0, grammarAccess.getForStmtAccess().getForKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleForStmt2083); 

                	newLeafNode(otherlv_1, grammarAccess.getForStmtAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:958:1: ( (lv_ass1_2_0= ruleAssStmt ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:959:1: (lv_ass1_2_0= ruleAssStmt )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:959:1: (lv_ass1_2_0= ruleAssStmt )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:960:3: lv_ass1_2_0= ruleAssStmt
            {
             
            	        newCompositeNode(grammarAccess.getForStmtAccess().getAss1AssStmtParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAssStmt_in_ruleForStmt2104);
            lv_ass1_2_0=ruleAssStmt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForStmtRule());
            	        }
                   		set(
                   			current, 
                   			"ass1",
                    		lv_ass1_2_0, 
                    		"AssStmt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:976:2: ( (lv_expr_3_0= ruleExpr ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:977:1: (lv_expr_3_0= ruleExpr )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:977:1: (lv_expr_3_0= ruleExpr )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:978:3: lv_expr_3_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getForStmtAccess().getExprExprParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleForStmt2125);
            lv_expr_3_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForStmtRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_3_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleForStmt2137); 

                	newLeafNode(otherlv_4, grammarAccess.getForStmtAccess().getSemicolonKeyword_4());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:998:1: ( (lv_ass2_5_0= ruleAssStmt2 ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:999:1: (lv_ass2_5_0= ruleAssStmt2 )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:999:1: (lv_ass2_5_0= ruleAssStmt2 )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1000:3: lv_ass2_5_0= ruleAssStmt2
            {
             
            	        newCompositeNode(grammarAccess.getForStmtAccess().getAss2AssStmt2ParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleAssStmt2_in_ruleForStmt2158);
            lv_ass2_5_0=ruleAssStmt2();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForStmtRule());
            	        }
                   		set(
                   			current, 
                   			"ass2",
                    		lv_ass2_5_0, 
                    		"AssStmt2");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleForStmt2170); 

                	newLeafNode(otherlv_6, grammarAccess.getForStmtAccess().getRightParenthesisKeyword_6());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1020:1: ( (lv_stmt_7_0= ruleStatementBlock ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1021:1: (lv_stmt_7_0= ruleStatementBlock )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1021:1: (lv_stmt_7_0= ruleStatementBlock )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1022:3: lv_stmt_7_0= ruleStatementBlock
            {
             
            	        newCompositeNode(grammarAccess.getForStmtAccess().getStmtStatementBlockParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleStatementBlock_in_ruleForStmt2191);
            lv_stmt_7_0=ruleStatementBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getForStmtRule());
            	        }
                   		set(
                   			current, 
                   			"stmt",
                    		lv_stmt_7_0, 
                    		"StatementBlock");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleForStmt"


    // $ANTLR start "entryRuleIfStmt"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1046:1: entryRuleIfStmt returns [EObject current=null] : iv_ruleIfStmt= ruleIfStmt EOF ;
    public final EObject entryRuleIfStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStmt = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1047:2: (iv_ruleIfStmt= ruleIfStmt EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1048:2: iv_ruleIfStmt= ruleIfStmt EOF
            {
             newCompositeNode(grammarAccess.getIfStmtRule()); 
            pushFollow(FOLLOW_ruleIfStmt_in_entryRuleIfStmt2227);
            iv_ruleIfStmt=ruleIfStmt();

            state._fsp--;

             current =iv_ruleIfStmt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfStmt2237); 

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
    // $ANTLR end "entryRuleIfStmt"


    // $ANTLR start "ruleIfStmt"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1055:1: ruleIfStmt returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_stmt_4_0= ruleStatementBlock ) ) ( (lv_else_5_0= ruleElseStmt ) )? ) ;
    public final EObject ruleIfStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expr_2_0 = null;

        EObject lv_stmt_4_0 = null;

        EObject lv_else_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1058:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_stmt_4_0= ruleStatementBlock ) ) ( (lv_else_5_0= ruleElseStmt ) )? ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1059:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_stmt_4_0= ruleStatementBlock ) ) ( (lv_else_5_0= ruleElseStmt ) )? )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1059:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_stmt_4_0= ruleStatementBlock ) ) ( (lv_else_5_0= ruleElseStmt ) )? )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1059:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_stmt_4_0= ruleStatementBlock ) ) ( (lv_else_5_0= ruleElseStmt ) )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleIfStmt2274); 

                	newLeafNode(otherlv_0, grammarAccess.getIfStmtAccess().getIfKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleIfStmt2286); 

                	newLeafNode(otherlv_1, grammarAccess.getIfStmtAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1067:1: ( (lv_expr_2_0= ruleExpr ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1068:1: (lv_expr_2_0= ruleExpr )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1068:1: (lv_expr_2_0= ruleExpr )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1069:3: lv_expr_2_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getIfStmtAccess().getExprExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleIfStmt2307);
            lv_expr_2_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfStmtRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_2_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleIfStmt2319); 

                	newLeafNode(otherlv_3, grammarAccess.getIfStmtAccess().getRightParenthesisKeyword_3());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1089:1: ( (lv_stmt_4_0= ruleStatementBlock ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1090:1: (lv_stmt_4_0= ruleStatementBlock )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1090:1: (lv_stmt_4_0= ruleStatementBlock )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1091:3: lv_stmt_4_0= ruleStatementBlock
            {
             
            	        newCompositeNode(grammarAccess.getIfStmtAccess().getStmtStatementBlockParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStatementBlock_in_ruleIfStmt2340);
            lv_stmt_4_0=ruleStatementBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIfStmtRule());
            	        }
                   		set(
                   			current, 
                   			"stmt",
                    		lv_stmt_4_0, 
                    		"StatementBlock");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1107:2: ( (lv_else_5_0= ruleElseStmt ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1108:1: (lv_else_5_0= ruleElseStmt )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1108:1: (lv_else_5_0= ruleElseStmt )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1109:3: lv_else_5_0= ruleElseStmt
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfStmtAccess().getElseElseStmtParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElseStmt_in_ruleIfStmt2361);
                    lv_else_5_0=ruleElseStmt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIfStmtRule());
                    	        }
                           		set(
                           			current, 
                           			"else",
                            		lv_else_5_0, 
                            		"ElseStmt");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleIfStmt"


    // $ANTLR start "entryRuleElseStmt"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1133:1: entryRuleElseStmt returns [EObject current=null] : iv_ruleElseStmt= ruleElseStmt EOF ;
    public final EObject entryRuleElseStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseStmt = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1134:2: (iv_ruleElseStmt= ruleElseStmt EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1135:2: iv_ruleElseStmt= ruleElseStmt EOF
            {
             newCompositeNode(grammarAccess.getElseStmtRule()); 
            pushFollow(FOLLOW_ruleElseStmt_in_entryRuleElseStmt2398);
            iv_ruleElseStmt=ruleElseStmt();

            state._fsp--;

             current =iv_ruleElseStmt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElseStmt2408); 

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
    // $ANTLR end "entryRuleElseStmt"


    // $ANTLR start "ruleElseStmt"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1142:1: ruleElseStmt returns [EObject current=null] : (otherlv_0= 'else' ( (lv_stmt_1_0= ruleStatementBlock ) ) ) ;
    public final EObject ruleElseStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_stmt_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1145:28: ( (otherlv_0= 'else' ( (lv_stmt_1_0= ruleStatementBlock ) ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1146:1: (otherlv_0= 'else' ( (lv_stmt_1_0= ruleStatementBlock ) ) )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1146:1: (otherlv_0= 'else' ( (lv_stmt_1_0= ruleStatementBlock ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1146:3: otherlv_0= 'else' ( (lv_stmt_1_0= ruleStatementBlock ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleElseStmt2445); 

                	newLeafNode(otherlv_0, grammarAccess.getElseStmtAccess().getElseKeyword_0());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1150:1: ( (lv_stmt_1_0= ruleStatementBlock ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1151:1: (lv_stmt_1_0= ruleStatementBlock )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1151:1: (lv_stmt_1_0= ruleStatementBlock )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1152:3: lv_stmt_1_0= ruleStatementBlock
            {
             
            	        newCompositeNode(grammarAccess.getElseStmtAccess().getStmtStatementBlockParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStatementBlock_in_ruleElseStmt2466);
            lv_stmt_1_0=ruleStatementBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getElseStmtRule());
            	        }
                   		set(
                   			current, 
                   			"stmt",
                    		lv_stmt_1_0, 
                    		"StatementBlock");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleElseStmt"


    // $ANTLR start "entryRuleAssStmt"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1176:1: entryRuleAssStmt returns [EObject current=null] : iv_ruleAssStmt= ruleAssStmt EOF ;
    public final EObject entryRuleAssStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssStmt = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1177:2: (iv_ruleAssStmt= ruleAssStmt EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1178:2: iv_ruleAssStmt= ruleAssStmt EOF
            {
             newCompositeNode(grammarAccess.getAssStmtRule()); 
            pushFollow(FOLLOW_ruleAssStmt_in_entryRuleAssStmt2502);
            iv_ruleAssStmt=ruleAssStmt();

            state._fsp--;

             current =iv_ruleAssStmt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssStmt2512); 

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
    // $ANTLR end "entryRuleAssStmt"


    // $ANTLR start "ruleAssStmt"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1185:1: ruleAssStmt returns [EObject current=null] : ( ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ';' ) ;
    public final EObject ruleAssStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_var_0_0 = null;

        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1188:28: ( ( ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ';' ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1189:1: ( ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ';' )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1189:1: ( ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ';' )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1189:2: ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ';'
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1189:2: ( (lv_var_0_0= ruleVar ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1190:1: (lv_var_0_0= ruleVar )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1190:1: (lv_var_0_0= ruleVar )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1191:3: lv_var_0_0= ruleVar
            {
             
            	        newCompositeNode(grammarAccess.getAssStmtAccess().getVarVarParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVar_in_ruleAssStmt2558);
            lv_var_0_0=ruleVar();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssStmtRule());
            	        }
                   		set(
                   			current, 
                   			"var",
                    		lv_var_0_0, 
                    		"Var");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleAssStmt2570); 

                	newLeafNode(otherlv_1, grammarAccess.getAssStmtAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1211:1: ( (lv_expr_2_0= ruleExpr ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1212:1: (lv_expr_2_0= ruleExpr )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1212:1: (lv_expr_2_0= ruleExpr )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1213:3: lv_expr_2_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getAssStmtAccess().getExprExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleAssStmt2591);
            lv_expr_2_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssStmtRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_2_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleAssStmt2603); 

                	newLeafNode(otherlv_3, grammarAccess.getAssStmtAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleAssStmt"


    // $ANTLR start "entryRuleAssStmt2"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1241:1: entryRuleAssStmt2 returns [EObject current=null] : iv_ruleAssStmt2= ruleAssStmt2 EOF ;
    public final EObject entryRuleAssStmt2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssStmt2 = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1242:2: (iv_ruleAssStmt2= ruleAssStmt2 EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1243:2: iv_ruleAssStmt2= ruleAssStmt2 EOF
            {
             newCompositeNode(grammarAccess.getAssStmt2Rule()); 
            pushFollow(FOLLOW_ruleAssStmt2_in_entryRuleAssStmt22639);
            iv_ruleAssStmt2=ruleAssStmt2();

            state._fsp--;

             current =iv_ruleAssStmt2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssStmt22649); 

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
    // $ANTLR end "entryRuleAssStmt2"


    // $ANTLR start "ruleAssStmt2"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1250:1: ruleAssStmt2 returns [EObject current=null] : ( ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) ) ;
    public final EObject ruleAssStmt2() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_var_0_0 = null;

        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1253:28: ( ( ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1254:1: ( ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1254:1: ( ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1254:2: ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1254:2: ( (lv_var_0_0= ruleVar ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1255:1: (lv_var_0_0= ruleVar )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1255:1: (lv_var_0_0= ruleVar )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1256:3: lv_var_0_0= ruleVar
            {
             
            	        newCompositeNode(grammarAccess.getAssStmt2Access().getVarVarParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVar_in_ruleAssStmt22695);
            lv_var_0_0=ruleVar();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssStmt2Rule());
            	        }
                   		set(
                   			current, 
                   			"var",
                    		lv_var_0_0, 
                    		"Var");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleAssStmt22707); 

                	newLeafNode(otherlv_1, grammarAccess.getAssStmt2Access().getEqualsSignKeyword_1());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1276:1: ( (lv_expr_2_0= ruleExpr ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1277:1: (lv_expr_2_0= ruleExpr )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1277:1: (lv_expr_2_0= ruleExpr )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1278:3: lv_expr_2_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getAssStmt2Access().getExprExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleAssStmt22728);
            lv_expr_2_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssStmt2Rule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_2_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleAssStmt2"


    // $ANTLR start "entryRuleAttrList"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1302:1: entryRuleAttrList returns [EObject current=null] : iv_ruleAttrList= ruleAttrList EOF ;
    public final EObject entryRuleAttrList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttrList = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1303:2: (iv_ruleAttrList= ruleAttrList EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1304:2: iv_ruleAttrList= ruleAttrList EOF
            {
             newCompositeNode(grammarAccess.getAttrListRule()); 
            pushFollow(FOLLOW_ruleAttrList_in_entryRuleAttrList2764);
            iv_ruleAttrList=ruleAttrList();

            state._fsp--;

             current =iv_ruleAttrList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrList2774); 

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
    // $ANTLR end "entryRuleAttrList"


    // $ANTLR start "ruleAttrList"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1311:1: ruleAttrList returns [EObject current=null] : ( () ( ( (lv_attr_1_0= ruleAttrAss ) )? (otherlv_2= ',' ( (lv_attr_3_0= ruleAttrAss ) ) )* ) ) ;
    public final EObject ruleAttrList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_attr_1_0 = null;

        EObject lv_attr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1314:28: ( ( () ( ( (lv_attr_1_0= ruleAttrAss ) )? (otherlv_2= ',' ( (lv_attr_3_0= ruleAttrAss ) ) )* ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1315:1: ( () ( ( (lv_attr_1_0= ruleAttrAss ) )? (otherlv_2= ',' ( (lv_attr_3_0= ruleAttrAss ) ) )* ) )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1315:1: ( () ( ( (lv_attr_1_0= ruleAttrAss ) )? (otherlv_2= ',' ( (lv_attr_3_0= ruleAttrAss ) ) )* ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1315:2: () ( ( (lv_attr_1_0= ruleAttrAss ) )? (otherlv_2= ',' ( (lv_attr_3_0= ruleAttrAss ) ) )* )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1315:2: ()
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1316:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAttrListAccess().getAttrListAction_0(),
                        current);
                

            }

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1321:2: ( ( (lv_attr_1_0= ruleAttrAss ) )? (otherlv_2= ',' ( (lv_attr_3_0= ruleAttrAss ) ) )* )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1321:3: ( (lv_attr_1_0= ruleAttrAss ) )? (otherlv_2= ',' ( (lv_attr_3_0= ruleAttrAss ) ) )*
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1321:3: ( (lv_attr_1_0= ruleAttrAss ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1322:1: (lv_attr_1_0= ruleAttrAss )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1322:1: (lv_attr_1_0= ruleAttrAss )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1323:3: lv_attr_1_0= ruleAttrAss
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttrListAccess().getAttrAttrAssParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttrAss_in_ruleAttrList2830);
                    lv_attr_1_0=ruleAttrAss();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttrListRule());
                    	        }
                           		add(
                           			current, 
                           			"attr",
                            		lv_attr_1_0, 
                            		"AttrAss");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1339:3: (otherlv_2= ',' ( (lv_attr_3_0= ruleAttrAss ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==34) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1339:5: otherlv_2= ',' ( (lv_attr_3_0= ruleAttrAss ) )
            	    {
            	    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleAttrList2844); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAttrListAccess().getCommaKeyword_1_1_0());
            	        
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1343:1: ( (lv_attr_3_0= ruleAttrAss ) )
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1344:1: (lv_attr_3_0= ruleAttrAss )
            	    {
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1344:1: (lv_attr_3_0= ruleAttrAss )
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1345:3: lv_attr_3_0= ruleAttrAss
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAttrListAccess().getAttrAttrAssParserRuleCall_1_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttrAss_in_ruleAttrList2865);
            	    lv_attr_3_0=ruleAttrAss();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAttrListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attr",
            	            		lv_attr_3_0, 
            	            		"AttrAss");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


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
    // $ANTLR end "ruleAttrList"


    // $ANTLR start "entryRuleAttrAss"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1369:1: entryRuleAttrAss returns [EObject current=null] : iv_ruleAttrAss= ruleAttrAss EOF ;
    public final EObject entryRuleAttrAss() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttrAss = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1370:2: (iv_ruleAttrAss= ruleAttrAss EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1371:2: iv_ruleAttrAss= ruleAttrAss EOF
            {
             newCompositeNode(grammarAccess.getAttrAssRule()); 
            pushFollow(FOLLOW_ruleAttrAss_in_entryRuleAttrAss2904);
            iv_ruleAttrAss=ruleAttrAss();

            state._fsp--;

             current =iv_ruleAttrAss; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrAss2914); 

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
    // $ANTLR end "entryRuleAttrAss"


    // $ANTLR start "ruleAttrAss"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1378:1: ruleAttrAss returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) ) ;
    public final EObject ruleAttrAss() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1381:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1382:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1382:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1382:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1382:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1383:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1383:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1384:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttrAss2956); 

            			newLeafNode(lv_name_0_0, grammarAccess.getAttrAssAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttrAssRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleAttrAss2973); 

                	newLeafNode(otherlv_1, grammarAccess.getAttrAssAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1404:1: ( (lv_expr_2_0= ruleExpr ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1405:1: (lv_expr_2_0= ruleExpr )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1405:1: (lv_expr_2_0= ruleExpr )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1406:3: lv_expr_2_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getAttrAssAccess().getExprExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleAttrAss2994);
            lv_expr_2_0=ruleExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttrAssRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_2_0, 
                    		"Expr");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleAttrAss"


    // $ANTLR start "entryRuleExpr"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1430:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1431:2: (iv_ruleExpr= ruleExpr EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1432:2: iv_ruleExpr= ruleExpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr3030);
            iv_ruleExpr=ruleExpr();

            state._fsp--;

             current =iv_ruleExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr3040); 

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
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1439:1: ruleExpr returns [EObject current=null] : this_Disj_0= ruleDisj ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject this_Disj_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1442:28: (this_Disj_0= ruleDisj )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1444:5: this_Disj_0= ruleDisj
            {
             
                    newCompositeNode(grammarAccess.getExprAccess().getDisjParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleDisj_in_ruleExpr3086);
            this_Disj_0=ruleDisj();

            state._fsp--;

             
                    current = this_Disj_0; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleDisj"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1460:1: entryRuleDisj returns [EObject current=null] : iv_ruleDisj= ruleDisj EOF ;
    public final EObject entryRuleDisj() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisj = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1461:2: (iv_ruleDisj= ruleDisj EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1462:2: iv_ruleDisj= ruleDisj EOF
            {
             newCompositeNode(grammarAccess.getDisjRule()); 
            pushFollow(FOLLOW_ruleDisj_in_entryRuleDisj3120);
            iv_ruleDisj=ruleDisj();

            state._fsp--;

             current =iv_ruleDisj; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisj3130); 

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
    // $ANTLR end "entryRuleDisj"


    // $ANTLR start "ruleDisj"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1469:1: ruleDisj returns [EObject current=null] : ( ( (lv_conj_0_0= ruleConj ) ) (otherlv_1= '||' ( (lv_conj_2_0= ruleConj ) ) )* ) ;
    public final EObject ruleDisj() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_conj_0_0 = null;

        EObject lv_conj_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1472:28: ( ( ( (lv_conj_0_0= ruleConj ) ) (otherlv_1= '||' ( (lv_conj_2_0= ruleConj ) ) )* ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1473:1: ( ( (lv_conj_0_0= ruleConj ) ) (otherlv_1= '||' ( (lv_conj_2_0= ruleConj ) ) )* )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1473:1: ( ( (lv_conj_0_0= ruleConj ) ) (otherlv_1= '||' ( (lv_conj_2_0= ruleConj ) ) )* )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1473:2: ( (lv_conj_0_0= ruleConj ) ) (otherlv_1= '||' ( (lv_conj_2_0= ruleConj ) ) )*
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1473:2: ( (lv_conj_0_0= ruleConj ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1474:1: (lv_conj_0_0= ruleConj )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1474:1: (lv_conj_0_0= ruleConj )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1475:3: lv_conj_0_0= ruleConj
            {
             
            	        newCompositeNode(grammarAccess.getDisjAccess().getConjConjParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleConj_in_ruleDisj3176);
            lv_conj_0_0=ruleConj();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDisjRule());
            	        }
                   		add(
                   			current, 
                   			"conj",
                    		lv_conj_0_0, 
                    		"Conj");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1491:2: (otherlv_1= '||' ( (lv_conj_2_0= ruleConj ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==35) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1491:4: otherlv_1= '||' ( (lv_conj_2_0= ruleConj ) )
            	    {
            	    otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleDisj3189); 

            	        	newLeafNode(otherlv_1, grammarAccess.getDisjAccess().getVerticalLineVerticalLineKeyword_1_0());
            	        
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1495:1: ( (lv_conj_2_0= ruleConj ) )
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1496:1: (lv_conj_2_0= ruleConj )
            	    {
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1496:1: (lv_conj_2_0= ruleConj )
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1497:3: lv_conj_2_0= ruleConj
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDisjAccess().getConjConjParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConj_in_ruleDisj3210);
            	    lv_conj_2_0=ruleConj();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDisjRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"conj",
            	            		lv_conj_2_0, 
            	            		"Conj");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "ruleDisj"


    // $ANTLR start "entryRuleConj"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1521:1: entryRuleConj returns [EObject current=null] : iv_ruleConj= ruleConj EOF ;
    public final EObject entryRuleConj() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConj = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1522:2: (iv_ruleConj= ruleConj EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1523:2: iv_ruleConj= ruleConj EOF
            {
             newCompositeNode(grammarAccess.getConjRule()); 
            pushFollow(FOLLOW_ruleConj_in_entryRuleConj3248);
            iv_ruleConj=ruleConj();

            state._fsp--;

             current =iv_ruleConj; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConj3258); 

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
    // $ANTLR end "entryRuleConj"


    // $ANTLR start "ruleConj"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1530:1: ruleConj returns [EObject current=null] : ( ( (lv_relat_0_0= ruleRelat ) ) (otherlv_1= '&&' ( (lv_relat_2_0= ruleRelat ) ) )* ) ;
    public final EObject ruleConj() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_relat_0_0 = null;

        EObject lv_relat_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1533:28: ( ( ( (lv_relat_0_0= ruleRelat ) ) (otherlv_1= '&&' ( (lv_relat_2_0= ruleRelat ) ) )* ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1534:1: ( ( (lv_relat_0_0= ruleRelat ) ) (otherlv_1= '&&' ( (lv_relat_2_0= ruleRelat ) ) )* )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1534:1: ( ( (lv_relat_0_0= ruleRelat ) ) (otherlv_1= '&&' ( (lv_relat_2_0= ruleRelat ) ) )* )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1534:2: ( (lv_relat_0_0= ruleRelat ) ) (otherlv_1= '&&' ( (lv_relat_2_0= ruleRelat ) ) )*
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1534:2: ( (lv_relat_0_0= ruleRelat ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1535:1: (lv_relat_0_0= ruleRelat )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1535:1: (lv_relat_0_0= ruleRelat )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1536:3: lv_relat_0_0= ruleRelat
            {
             
            	        newCompositeNode(grammarAccess.getConjAccess().getRelatRelatParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleRelat_in_ruleConj3304);
            lv_relat_0_0=ruleRelat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConjRule());
            	        }
                   		add(
                   			current, 
                   			"relat",
                    		lv_relat_0_0, 
                    		"Relat");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1552:2: (otherlv_1= '&&' ( (lv_relat_2_0= ruleRelat ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==36) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1552:4: otherlv_1= '&&' ( (lv_relat_2_0= ruleRelat ) )
            	    {
            	    otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleConj3317); 

            	        	newLeafNode(otherlv_1, grammarAccess.getConjAccess().getAmpersandAmpersandKeyword_1_0());
            	        
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1556:1: ( (lv_relat_2_0= ruleRelat ) )
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1557:1: (lv_relat_2_0= ruleRelat )
            	    {
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1557:1: (lv_relat_2_0= ruleRelat )
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1558:3: lv_relat_2_0= ruleRelat
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConjAccess().getRelatRelatParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRelat_in_ruleConj3338);
            	    lv_relat_2_0=ruleRelat();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConjRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"relat",
            	            		lv_relat_2_0, 
            	            		"Relat");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "ruleConj"


    // $ANTLR start "entryRuleRelat"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1582:1: entryRuleRelat returns [EObject current=null] : iv_ruleRelat= ruleRelat EOF ;
    public final EObject entryRuleRelat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelat = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1583:2: (iv_ruleRelat= ruleRelat EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1584:2: iv_ruleRelat= ruleRelat EOF
            {
             newCompositeNode(grammarAccess.getRelatRule()); 
            pushFollow(FOLLOW_ruleRelat_in_entryRuleRelat3376);
            iv_ruleRelat=ruleRelat();

            state._fsp--;

             current =iv_ruleRelat; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelat3386); 

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
    // $ANTLR end "entryRuleRelat"


    // $ANTLR start "ruleRelat"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1591:1: ruleRelat returns [EObject current=null] : ( ( (lv_add_0_0= ruleAdd ) ) ( (otherlv_1= '==' | otherlv_2= '<' | otherlv_3= '<=' ) ( (lv_add_4_0= ruleAdd ) ) )* ) ;
    public final EObject ruleRelat() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_add_0_0 = null;

        EObject lv_add_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1594:28: ( ( ( (lv_add_0_0= ruleAdd ) ) ( (otherlv_1= '==' | otherlv_2= '<' | otherlv_3= '<=' ) ( (lv_add_4_0= ruleAdd ) ) )* ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1595:1: ( ( (lv_add_0_0= ruleAdd ) ) ( (otherlv_1= '==' | otherlv_2= '<' | otherlv_3= '<=' ) ( (lv_add_4_0= ruleAdd ) ) )* )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1595:1: ( ( (lv_add_0_0= ruleAdd ) ) ( (otherlv_1= '==' | otherlv_2= '<' | otherlv_3= '<=' ) ( (lv_add_4_0= ruleAdd ) ) )* )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1595:2: ( (lv_add_0_0= ruleAdd ) ) ( (otherlv_1= '==' | otherlv_2= '<' | otherlv_3= '<=' ) ( (lv_add_4_0= ruleAdd ) ) )*
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1595:2: ( (lv_add_0_0= ruleAdd ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1596:1: (lv_add_0_0= ruleAdd )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1596:1: (lv_add_0_0= ruleAdd )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1597:3: lv_add_0_0= ruleAdd
            {
             
            	        newCompositeNode(grammarAccess.getRelatAccess().getAddAddParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAdd_in_ruleRelat3432);
            lv_add_0_0=ruleAdd();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRelatRule());
            	        }
                   		add(
                   			current, 
                   			"add",
                    		lv_add_0_0, 
                    		"Add");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1613:2: ( (otherlv_1= '==' | otherlv_2= '<' | otherlv_3= '<=' ) ( (lv_add_4_0= ruleAdd ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=37 && LA18_0<=39)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1613:3: (otherlv_1= '==' | otherlv_2= '<' | otherlv_3= '<=' ) ( (lv_add_4_0= ruleAdd ) )
            	    {
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1613:3: (otherlv_1= '==' | otherlv_2= '<' | otherlv_3= '<=' )
            	    int alt17=3;
            	    switch ( input.LA(1) ) {
            	    case 37:
            	        {
            	        alt17=1;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt17=2;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt17=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt17) {
            	        case 1 :
            	            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1613:5: otherlv_1= '=='
            	            {
            	            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleRelat3446); 

            	                	newLeafNode(otherlv_1, grammarAccess.getRelatAccess().getEqualsSignEqualsSignKeyword_1_0_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1618:7: otherlv_2= '<'
            	            {
            	            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleRelat3464); 

            	                	newLeafNode(otherlv_2, grammarAccess.getRelatAccess().getLessThanSignKeyword_1_0_1());
            	                

            	            }
            	            break;
            	        case 3 :
            	            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1623:7: otherlv_3= '<='
            	            {
            	            otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleRelat3482); 

            	                	newLeafNode(otherlv_3, grammarAccess.getRelatAccess().getLessThanSignEqualsSignKeyword_1_0_2());
            	                

            	            }
            	            break;

            	    }

            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1627:2: ( (lv_add_4_0= ruleAdd ) )
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1628:1: (lv_add_4_0= ruleAdd )
            	    {
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1628:1: (lv_add_4_0= ruleAdd )
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1629:3: lv_add_4_0= ruleAdd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRelatAccess().getAddAddParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAdd_in_ruleRelat3504);
            	    lv_add_4_0=ruleAdd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRelatRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"add",
            	            		lv_add_4_0, 
            	            		"Add");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // $ANTLR end "ruleRelat"


    // $ANTLR start "entryRuleAdd"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1653:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1654:2: (iv_ruleAdd= ruleAdd EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1655:2: iv_ruleAdd= ruleAdd EOF
            {
             newCompositeNode(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_ruleAdd_in_entryRuleAdd3542);
            iv_ruleAdd=ruleAdd();

            state._fsp--;

             current =iv_ruleAdd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdd3552); 

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
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1662:1: ruleAdd returns [EObject current=null] : ( ( (lv_mult_0_0= ruleMult ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_mult_3_0= ruleMult ) ) )* ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_mult_0_0 = null;

        EObject lv_mult_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1665:28: ( ( ( (lv_mult_0_0= ruleMult ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_mult_3_0= ruleMult ) ) )* ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1666:1: ( ( (lv_mult_0_0= ruleMult ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_mult_3_0= ruleMult ) ) )* )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1666:1: ( ( (lv_mult_0_0= ruleMult ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_mult_3_0= ruleMult ) ) )* )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1666:2: ( (lv_mult_0_0= ruleMult ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_mult_3_0= ruleMult ) ) )*
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1666:2: ( (lv_mult_0_0= ruleMult ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1667:1: (lv_mult_0_0= ruleMult )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1667:1: (lv_mult_0_0= ruleMult )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1668:3: lv_mult_0_0= ruleMult
            {
             
            	        newCompositeNode(grammarAccess.getAddAccess().getMultMultParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMult_in_ruleAdd3598);
            lv_mult_0_0=ruleMult();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAddRule());
            	        }
                   		add(
                   			current, 
                   			"mult",
                    		lv_mult_0_0, 
                    		"Mult");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1684:2: ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_mult_3_0= ruleMult ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=40 && LA20_0<=41)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1684:3: (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_mult_3_0= ruleMult ) )
            	    {
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1684:3: (otherlv_1= '+' | otherlv_2= '-' )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==40) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==41) ) {
            	        alt19=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1684:5: otherlv_1= '+'
            	            {
            	            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleAdd3612); 

            	                	newLeafNode(otherlv_1, grammarAccess.getAddAccess().getPlusSignKeyword_1_0_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1689:7: otherlv_2= '-'
            	            {
            	            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleAdd3630); 

            	                	newLeafNode(otherlv_2, grammarAccess.getAddAccess().getHyphenMinusKeyword_1_0_1());
            	                

            	            }
            	            break;

            	    }

            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1693:2: ( (lv_mult_3_0= ruleMult ) )
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1694:1: (lv_mult_3_0= ruleMult )
            	    {
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1694:1: (lv_mult_3_0= ruleMult )
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1695:3: lv_mult_3_0= ruleMult
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAddAccess().getMultMultParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMult_in_ruleAdd3652);
            	    lv_mult_3_0=ruleMult();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAddRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"mult",
            	            		lv_mult_3_0, 
            	            		"Mult");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleMult"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1719:1: entryRuleMult returns [EObject current=null] : iv_ruleMult= ruleMult EOF ;
    public final EObject entryRuleMult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMult = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1720:2: (iv_ruleMult= ruleMult EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1721:2: iv_ruleMult= ruleMult EOF
            {
             newCompositeNode(grammarAccess.getMultRule()); 
            pushFollow(FOLLOW_ruleMult_in_entryRuleMult3690);
            iv_ruleMult=ruleMult();

            state._fsp--;

             current =iv_ruleMult; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMult3700); 

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
    // $ANTLR end "entryRuleMult"


    // $ANTLR start "ruleMult"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1728:1: ruleMult returns [EObject current=null] : ( ( (lv_unary_0_0= ruleUnary ) ) ( (otherlv_1= '*' | otherlv_2= '/' ) ( (lv_unary_3_0= ruleUnary ) ) )* ) ;
    public final EObject ruleMult() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_unary_0_0 = null;

        EObject lv_unary_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1731:28: ( ( ( (lv_unary_0_0= ruleUnary ) ) ( (otherlv_1= '*' | otherlv_2= '/' ) ( (lv_unary_3_0= ruleUnary ) ) )* ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1732:1: ( ( (lv_unary_0_0= ruleUnary ) ) ( (otherlv_1= '*' | otherlv_2= '/' ) ( (lv_unary_3_0= ruleUnary ) ) )* )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1732:1: ( ( (lv_unary_0_0= ruleUnary ) ) ( (otherlv_1= '*' | otherlv_2= '/' ) ( (lv_unary_3_0= ruleUnary ) ) )* )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1732:2: ( (lv_unary_0_0= ruleUnary ) ) ( (otherlv_1= '*' | otherlv_2= '/' ) ( (lv_unary_3_0= ruleUnary ) ) )*
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1732:2: ( (lv_unary_0_0= ruleUnary ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1733:1: (lv_unary_0_0= ruleUnary )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1733:1: (lv_unary_0_0= ruleUnary )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1734:3: lv_unary_0_0= ruleUnary
            {
             
            	        newCompositeNode(grammarAccess.getMultAccess().getUnaryUnaryParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleUnary_in_ruleMult3746);
            lv_unary_0_0=ruleUnary();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultRule());
            	        }
                   		add(
                   			current, 
                   			"unary",
                    		lv_unary_0_0, 
                    		"Unary");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1750:2: ( (otherlv_1= '*' | otherlv_2= '/' ) ( (lv_unary_3_0= ruleUnary ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=42 && LA22_0<=43)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1750:3: (otherlv_1= '*' | otherlv_2= '/' ) ( (lv_unary_3_0= ruleUnary ) )
            	    {
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1750:3: (otherlv_1= '*' | otherlv_2= '/' )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==42) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==43) ) {
            	        alt21=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1750:5: otherlv_1= '*'
            	            {
            	            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleMult3760); 

            	                	newLeafNode(otherlv_1, grammarAccess.getMultAccess().getAsteriskKeyword_1_0_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1755:7: otherlv_2= '/'
            	            {
            	            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleMult3778); 

            	                	newLeafNode(otherlv_2, grammarAccess.getMultAccess().getSolidusKeyword_1_0_1());
            	                

            	            }
            	            break;

            	    }

            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1759:2: ( (lv_unary_3_0= ruleUnary ) )
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1760:1: (lv_unary_3_0= ruleUnary )
            	    {
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1760:1: (lv_unary_3_0= ruleUnary )
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1761:3: lv_unary_3_0= ruleUnary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultAccess().getUnaryUnaryParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnary_in_ruleMult3800);
            	    lv_unary_3_0=ruleUnary();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"unary",
            	            		lv_unary_3_0, 
            	            		"Unary");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // $ANTLR end "ruleMult"


    // $ANTLR start "entryRuleUnary"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1785:1: entryRuleUnary returns [EObject current=null] : iv_ruleUnary= ruleUnary EOF ;
    public final EObject entryRuleUnary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnary = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1786:2: (iv_ruleUnary= ruleUnary EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1787:2: iv_ruleUnary= ruleUnary EOF
            {
             newCompositeNode(grammarAccess.getUnaryRule()); 
            pushFollow(FOLLOW_ruleUnary_in_entryRuleUnary3838);
            iv_ruleUnary=ruleUnary();

            state._fsp--;

             current =iv_ruleUnary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnary3848); 

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
    // $ANTLR end "entryRuleUnary"


    // $ANTLR start "ruleUnary"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1794:1: ruleUnary returns [EObject current=null] : ( (otherlv_0= '!' | otherlv_1= '-' )* ( (lv_atom_2_0= ruleAtom ) ) ) ;
    public final EObject ruleUnary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_atom_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1797:28: ( ( (otherlv_0= '!' | otherlv_1= '-' )* ( (lv_atom_2_0= ruleAtom ) ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1798:1: ( (otherlv_0= '!' | otherlv_1= '-' )* ( (lv_atom_2_0= ruleAtom ) ) )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1798:1: ( (otherlv_0= '!' | otherlv_1= '-' )* ( (lv_atom_2_0= ruleAtom ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1798:2: (otherlv_0= '!' | otherlv_1= '-' )* ( (lv_atom_2_0= ruleAtom ) )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1798:2: (otherlv_0= '!' | otherlv_1= '-' )*
            loop23:
            do {
                int alt23=3;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==44) ) {
                    alt23=1;
                }
                else if ( (LA23_0==41) ) {
                    alt23=2;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1798:4: otherlv_0= '!'
            	    {
            	    otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleUnary3886); 

            	        	newLeafNode(otherlv_0, grammarAccess.getUnaryAccess().getExclamationMarkKeyword_0_0());
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1803:7: otherlv_1= '-'
            	    {
            	    otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleUnary3904); 

            	        	newLeafNode(otherlv_1, grammarAccess.getUnaryAccess().getHyphenMinusKeyword_0_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1807:3: ( (lv_atom_2_0= ruleAtom ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1808:1: (lv_atom_2_0= ruleAtom )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1808:1: (lv_atom_2_0= ruleAtom )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1809:3: lv_atom_2_0= ruleAtom
            {
             
            	        newCompositeNode(grammarAccess.getUnaryAccess().getAtomAtomParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAtom_in_ruleUnary3927);
            lv_atom_2_0=ruleAtom();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUnaryRule());
            	        }
                   		set(
                   			current, 
                   			"atom",
                    		lv_atom_2_0, 
                    		"Atom");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleUnary"


    // $ANTLR start "entryRuleAtom"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1833:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1834:2: (iv_ruleAtom= ruleAtom EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1835:2: iv_ruleAtom= ruleAtom EOF
            {
             newCompositeNode(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_ruleAtom_in_entryRuleAtom3963);
            iv_ruleAtom=ruleAtom();

            state._fsp--;

             current =iv_ruleAtom; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtom3973); 

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
    // $ANTLR end "entryRuleAtom"


    // $ANTLR start "ruleAtom"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1842:1: ruleAtom returns [EObject current=null] : ( () ( ( (lv_int_1_0= RULE_INT ) ) | ( ( (lv_var1_2_0= ruleVar ) ) (otherlv_3= 'touches' ( (lv_var2_4_0= ruleVar ) ) )? ) | (otherlv_5= '(' ( (lv_expr_6_0= ruleExpr ) ) otherlv_7= ')' ) ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token lv_int_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_var1_2_0 = null;

        EObject lv_var2_4_0 = null;

        EObject lv_expr_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1845:28: ( ( () ( ( (lv_int_1_0= RULE_INT ) ) | ( ( (lv_var1_2_0= ruleVar ) ) (otherlv_3= 'touches' ( (lv_var2_4_0= ruleVar ) ) )? ) | (otherlv_5= '(' ( (lv_expr_6_0= ruleExpr ) ) otherlv_7= ')' ) ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1846:1: ( () ( ( (lv_int_1_0= RULE_INT ) ) | ( ( (lv_var1_2_0= ruleVar ) ) (otherlv_3= 'touches' ( (lv_var2_4_0= ruleVar ) ) )? ) | (otherlv_5= '(' ( (lv_expr_6_0= ruleExpr ) ) otherlv_7= ')' ) ) )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1846:1: ( () ( ( (lv_int_1_0= RULE_INT ) ) | ( ( (lv_var1_2_0= ruleVar ) ) (otherlv_3= 'touches' ( (lv_var2_4_0= ruleVar ) ) )? ) | (otherlv_5= '(' ( (lv_expr_6_0= ruleExpr ) ) otherlv_7= ')' ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1846:2: () ( ( (lv_int_1_0= RULE_INT ) ) | ( ( (lv_var1_2_0= ruleVar ) ) (otherlv_3= 'touches' ( (lv_var2_4_0= ruleVar ) ) )? ) | (otherlv_5= '(' ( (lv_expr_6_0= ruleExpr ) ) otherlv_7= ')' ) )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1846:2: ()
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1847:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAtomAccess().getAtomAction_0(),
                        current);
                

            }

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1852:2: ( ( (lv_int_1_0= RULE_INT ) ) | ( ( (lv_var1_2_0= ruleVar ) ) (otherlv_3= 'touches' ( (lv_var2_4_0= ruleVar ) ) )? ) | (otherlv_5= '(' ( (lv_expr_6_0= ruleExpr ) ) otherlv_7= ')' ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt25=1;
                }
                break;
            case RULE_ID:
                {
                alt25=2;
                }
                break;
            case 12:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1852:3: ( (lv_int_1_0= RULE_INT ) )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1852:3: ( (lv_int_1_0= RULE_INT ) )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1853:1: (lv_int_1_0= RULE_INT )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1853:1: (lv_int_1_0= RULE_INT )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1854:3: lv_int_1_0= RULE_INT
                    {
                    lv_int_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtom4025); 

                    			newLeafNode(lv_int_1_0, grammarAccess.getAtomAccess().getIntINTTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"int",
                            		lv_int_1_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1871:6: ( ( (lv_var1_2_0= ruleVar ) ) (otherlv_3= 'touches' ( (lv_var2_4_0= ruleVar ) ) )? )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1871:6: ( ( (lv_var1_2_0= ruleVar ) ) (otherlv_3= 'touches' ( (lv_var2_4_0= ruleVar ) ) )? )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1871:7: ( (lv_var1_2_0= ruleVar ) ) (otherlv_3= 'touches' ( (lv_var2_4_0= ruleVar ) ) )?
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1871:7: ( (lv_var1_2_0= ruleVar ) )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1872:1: (lv_var1_2_0= ruleVar )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1872:1: (lv_var1_2_0= ruleVar )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1873:3: lv_var1_2_0= ruleVar
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomAccess().getVar1VarParserRuleCall_1_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVar_in_ruleAtom4058);
                    lv_var1_2_0=ruleVar();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtomRule());
                    	        }
                           		set(
                           			current, 
                           			"var1",
                            		lv_var1_2_0, 
                            		"Var");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1889:2: (otherlv_3= 'touches' ( (lv_var2_4_0= ruleVar ) ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==45) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1889:4: otherlv_3= 'touches' ( (lv_var2_4_0= ruleVar ) )
                            {
                            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleAtom4071); 

                                	newLeafNode(otherlv_3, grammarAccess.getAtomAccess().getTouchesKeyword_1_1_1_0());
                                
                            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1893:1: ( (lv_var2_4_0= ruleVar ) )
                            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1894:1: (lv_var2_4_0= ruleVar )
                            {
                            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1894:1: (lv_var2_4_0= ruleVar )
                            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1895:3: lv_var2_4_0= ruleVar
                            {
                             
                            	        newCompositeNode(grammarAccess.getAtomAccess().getVar2VarParserRuleCall_1_1_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleVar_in_ruleAtom4092);
                            lv_var2_4_0=ruleVar();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getAtomRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"var2",
                                    		lv_var2_4_0, 
                                    		"Var");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1912:6: (otherlv_5= '(' ( (lv_expr_6_0= ruleExpr ) ) otherlv_7= ')' )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1912:6: (otherlv_5= '(' ( (lv_expr_6_0= ruleExpr ) ) otherlv_7= ')' )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1912:8: otherlv_5= '(' ( (lv_expr_6_0= ruleExpr ) ) otherlv_7= ')'
                    {
                    otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleAtom4114); 

                        	newLeafNode(otherlv_5, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_2_0());
                        
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1916:1: ( (lv_expr_6_0= ruleExpr ) )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1917:1: (lv_expr_6_0= ruleExpr )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1917:1: (lv_expr_6_0= ruleExpr )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1918:3: lv_expr_6_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomAccess().getExprExprParserRuleCall_1_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleAtom4135);
                    lv_expr_6_0=ruleExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtomRule());
                    	        }
                           		set(
                           			current, 
                           			"expr",
                            		lv_expr_6_0, 
                            		"Expr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleAtom4147); 

                        	newLeafNode(otherlv_7, grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_2_2());
                        

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
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleVar"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1946:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1947:2: (iv_ruleVar= ruleVar EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1948:2: iv_ruleVar= ruleVar EOF
            {
             newCompositeNode(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_ruleVar_in_entryRuleVar4185);
            iv_ruleVar=ruleVar();

            state._fsp--;

             current =iv_ruleVar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar4195); 

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
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1955:1: ruleVar returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '[' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ']' (otherlv_4= '.' ( (lv_subname_5_0= RULE_ID ) ) )? ) | (otherlv_6= '.' ( (lv_subname_7_0= RULE_ID ) ) ) )? ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_subname_5_0=null;
        Token otherlv_6=null;
        Token lv_subname_7_0=null;
        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1958:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '[' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ']' (otherlv_4= '.' ( (lv_subname_5_0= RULE_ID ) ) )? ) | (otherlv_6= '.' ( (lv_subname_7_0= RULE_ID ) ) ) )? ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1959:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '[' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ']' (otherlv_4= '.' ( (lv_subname_5_0= RULE_ID ) ) )? ) | (otherlv_6= '.' ( (lv_subname_7_0= RULE_ID ) ) ) )? )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1959:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '[' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ']' (otherlv_4= '.' ( (lv_subname_5_0= RULE_ID ) ) )? ) | (otherlv_6= '.' ( (lv_subname_7_0= RULE_ID ) ) ) )? )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1959:2: ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '[' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ']' (otherlv_4= '.' ( (lv_subname_5_0= RULE_ID ) ) )? ) | (otherlv_6= '.' ( (lv_subname_7_0= RULE_ID ) ) ) )?
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1959:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1960:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1960:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1961:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVar4237); 

            			newLeafNode(lv_name_0_0, grammarAccess.getVarAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVarRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1977:2: ( (otherlv_1= '[' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ']' (otherlv_4= '.' ( (lv_subname_5_0= RULE_ID ) ) )? ) | (otherlv_6= '.' ( (lv_subname_7_0= RULE_ID ) ) ) )?
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==16) ) {
                alt27=1;
            }
            else if ( (LA27_0==46) ) {
                alt27=2;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1977:3: (otherlv_1= '[' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ']' (otherlv_4= '.' ( (lv_subname_5_0= RULE_ID ) ) )? )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1977:3: (otherlv_1= '[' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ']' (otherlv_4= '.' ( (lv_subname_5_0= RULE_ID ) ) )? )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1977:5: otherlv_1= '[' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ']' (otherlv_4= '.' ( (lv_subname_5_0= RULE_ID ) ) )?
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleVar4256); 

                        	newLeafNode(otherlv_1, grammarAccess.getVarAccess().getLeftSquareBracketKeyword_1_0_0());
                        
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1981:1: ( (lv_expr_2_0= ruleExpr ) )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1982:1: (lv_expr_2_0= ruleExpr )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1982:1: (lv_expr_2_0= ruleExpr )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1983:3: lv_expr_2_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getVarAccess().getExprExprParserRuleCall_1_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleVar4277);
                    lv_expr_2_0=ruleExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVarRule());
                    	        }
                           		set(
                           			current, 
                           			"expr",
                            		lv_expr_2_0, 
                            		"Expr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleVar4289); 

                        	newLeafNode(otherlv_3, grammarAccess.getVarAccess().getRightSquareBracketKeyword_1_0_2());
                        
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:2003:1: (otherlv_4= '.' ( (lv_subname_5_0= RULE_ID ) ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==46) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:2003:3: otherlv_4= '.' ( (lv_subname_5_0= RULE_ID ) )
                            {
                            otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleVar4302); 

                                	newLeafNode(otherlv_4, grammarAccess.getVarAccess().getFullStopKeyword_1_0_3_0());
                                
                            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:2007:1: ( (lv_subname_5_0= RULE_ID ) )
                            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:2008:1: (lv_subname_5_0= RULE_ID )
                            {
                            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:2008:1: (lv_subname_5_0= RULE_ID )
                            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:2009:3: lv_subname_5_0= RULE_ID
                            {
                            lv_subname_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVar4319); 

                            			newLeafNode(lv_subname_5_0, grammarAccess.getVarAccess().getSubnameIDTerminalRuleCall_1_0_3_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getVarRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"subname",
                                    		lv_subname_5_0, 
                                    		"ID");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:2026:6: (otherlv_6= '.' ( (lv_subname_7_0= RULE_ID ) ) )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:2026:6: (otherlv_6= '.' ( (lv_subname_7_0= RULE_ID ) ) )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:2026:8: otherlv_6= '.' ( (lv_subname_7_0= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_46_in_ruleVar4346); 

                        	newLeafNode(otherlv_6, grammarAccess.getVarAccess().getFullStopKeyword_1_1_0());
                        
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:2030:1: ( (lv_subname_7_0= RULE_ID ) )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:2031:1: (lv_subname_7_0= RULE_ID )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:2031:1: (lv_subname_7_0= RULE_ID )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:2032:3: lv_subname_7_0= RULE_ID
                    {
                    lv_subname_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVar4363); 

                    			newLeafNode(lv_subname_7_0, grammarAccess.getVarAccess().getSubnameIDTerminalRuleCall_1_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVarRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"subname",
                            		lv_subname_7_0, 
                            		"ID");
                    	    

                    }


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
    // $ANTLR end "ruleVar"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGame_in_ruleModel131 = new BitSet(new long[]{0x0000000020E08000L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleModel152 = new BitSet(new long[]{0x0000000020E08000L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_ruleModel174 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleModel195 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_ruleGame_in_entryRuleGame232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGame242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleGame279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGame296 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGame313 = new BitSet(new long[]{0x0000000400002010L});
    public static final BitSet FOLLOW_ruleAttrList_in_ruleGame334 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleGame346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_ruleDeclaration439 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleObjDecl_in_ruleDeclaration466 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDeclaration479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_entryRuleVarDecl515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDecl525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleVarDecl562 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarDecl579 = new BitSet(new long[]{0x0000000000050002L});
    public static final BitSet FOLLOW_ruleInit_in_ruleVarDecl606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleVarDecl626 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVarDecl643 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVarDecl660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInit_in_entryRuleInit698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInit708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleInit745 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleInit766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjDecl_in_entryRuleObjDecl802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjDecl812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjType_in_ruleObjDecl858 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjDecl875 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_12_in_ruleObjDecl894 = new BitSet(new long[]{0x0000000400002010L});
    public static final BitSet FOLLOW_ruleAttrList_in_ruleObjDecl915 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleObjDecl927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleObjDecl947 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleObjDecl964 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleObjDecl981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock1019 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock1029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnimBlock_in_ruleBlock1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventBlock_in_ruleBlock1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnimBlock_in_entryRuleAnimBlock1138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnimBlock1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAnimBlock1185 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnimBlock1202 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAnimBlock1219 = new BitSet(new long[]{0x0000000000E08000L});
    public static final BitSet FOLLOW_ruleObjType_in_ruleAnimBlock1240 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnimBlock1257 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAnimBlock1274 = new BitSet(new long[]{0x0000000020E08000L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_ruleAnimBlock1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventBlock_in_entryRuleEventBlock1331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventBlock1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleEventBlock1378 = new BitSet(new long[]{0x000000001F000000L});
    public static final BitSet FOLLOW_ruleKeystroke_in_ruleEventBlock1399 = new BitSet(new long[]{0x0000000020E08000L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_ruleEventBlock1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjType_in_entryRuleObjType1457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjType1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleObjType1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleObjType1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleObjType1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeystroke_in_entryRuleKeystroke1585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeystroke1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleKeystroke1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleKeystroke1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleKeystroke1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleKeystroke1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleKeystroke1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_entryRuleStatementBlock1750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatementBlock1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleStatementBlock1807 = new BitSet(new long[]{0x00000001C0000010L});
    public static final BitSet FOLLOW_ruleStmt_in_ruleStatementBlock1828 = new BitSet(new long[]{0x00000001C0000010L});
    public static final BitSet FOLLOW_30_in_ruleStatementBlock1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStmt_in_entryRuleStmt1878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStmt1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStmt_in_ruleStmt1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForStmt_in_ruleStmt1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssStmt_in_ruleStmt1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForStmt_in_entryRuleForStmt2024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForStmt2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleForStmt2071 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleForStmt2083 = new BitSet(new long[]{0x0000000180000010L});
    public static final BitSet FOLLOW_ruleAssStmt_in_ruleForStmt2104 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleForStmt2125 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleForStmt2137 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAssStmt2_in_ruleForStmt2158 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleForStmt2170 = new BitSet(new long[]{0x0000000020E08000L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_ruleForStmt2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStmt_in_entryRuleIfStmt2227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfStmt2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleIfStmt2274 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleIfStmt2286 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleIfStmt2307 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleIfStmt2319 = new BitSet(new long[]{0x0000000020E08000L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_ruleIfStmt2340 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleElseStmt_in_ruleIfStmt2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElseStmt_in_entryRuleElseStmt2398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElseStmt2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleElseStmt2445 = new BitSet(new long[]{0x0000000020E08000L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_ruleElseStmt2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssStmt_in_entryRuleAssStmt2502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssStmt2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_ruleAssStmt2558 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAssStmt2570 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAssStmt2591 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAssStmt2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssStmt2_in_entryRuleAssStmt22639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssStmt22649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_ruleAssStmt22695 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAssStmt22707 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAssStmt22728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrList_in_entryRuleAttrList2764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrList2774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrAss_in_ruleAttrList2830 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleAttrList2844 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttrAss_in_ruleAttrList2865 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleAttrAss_in_entryRuleAttrAss2904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrAss2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttrAss2956 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAttrAss2973 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAttrAss2994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr3030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisj_in_ruleExpr3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisj_in_entryRuleDisj3120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisj3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConj_in_ruleDisj3176 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleDisj3189 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_ruleConj_in_ruleDisj3210 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleConj_in_entryRuleConj3248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConj3258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelat_in_ruleConj3304 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleConj3317 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_ruleRelat_in_ruleConj3338 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleRelat_in_entryRuleRelat3376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelat3386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdd_in_ruleRelat3432 = new BitSet(new long[]{0x000000E000000002L});
    public static final BitSet FOLLOW_37_in_ruleRelat3446 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_38_in_ruleRelat3464 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_39_in_ruleRelat3482 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_ruleAdd_in_ruleRelat3504 = new BitSet(new long[]{0x000000E000000002L});
    public static final BitSet FOLLOW_ruleAdd_in_entryRuleAdd3542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdd3552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMult_in_ruleAdd3598 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_40_in_ruleAdd3612 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_41_in_ruleAdd3630 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_ruleMult_in_ruleAdd3652 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_ruleMult_in_entryRuleMult3690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMult3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnary_in_ruleMult3746 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_42_in_ruleMult3760 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_43_in_ruleMult3778 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_ruleUnary_in_ruleMult3800 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_ruleUnary_in_entryRuleUnary3838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnary3848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleUnary3886 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_41_in_ruleUnary3904 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleUnary3927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom3963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtom3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtom4025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_ruleAtom4058 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleAtom4071 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVar_in_ruleAtom4092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleAtom4114 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtom4135 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAtom4147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_entryRuleVar4185 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar4195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVar4237 = new BitSet(new long[]{0x0000400000010002L});
    public static final BitSet FOLLOW_16_in_ruleVar4256 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleVar4277 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVar4289 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleVar4302 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVar4319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleVar4346 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVar4363 = new BitSet(new long[]{0x0000000000000002L});

}