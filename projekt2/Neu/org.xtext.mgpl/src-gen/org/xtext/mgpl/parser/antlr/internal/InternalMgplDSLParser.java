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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'game'", "'('", "')'", "';'", "'int'", "'='", "'['", "']'", "'animation'", "'on'", "'rectangle'", "'triangle'", "'circle'", "'space'", "'leftarrow'", "'rightarrow'", "'uparrow'", "'downarrow'", "'{'", "'}'", "'for'", "'if'", "'else'", "','", "'||'", "'&&'", "'=='", "'<'", "'<='", "'+'", "'-'", "'*'", "'/'", "'!'", "'touches'", "'.'"
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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:76:1: ruleModel returns [EObject current=null] : (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attr_3_0= ruleAttrList ) ) otherlv_4= ')' ( (lv_decl_5_0= ruleDeclaration ) )* ( (lv_stmt_6_0= ruleStatementBlock ) ) ( (lv_blocks_7_0= ruleBlock ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_attr_3_0 = null;

        EObject lv_decl_5_0 = null;

        EObject lv_stmt_6_0 = null;

        EObject lv_blocks_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:79:28: ( (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attr_3_0= ruleAttrList ) ) otherlv_4= ')' ( (lv_decl_5_0= ruleDeclaration ) )* ( (lv_stmt_6_0= ruleStatementBlock ) ) ( (lv_blocks_7_0= ruleBlock ) )* ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:80:1: (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attr_3_0= ruleAttrList ) ) otherlv_4= ')' ( (lv_decl_5_0= ruleDeclaration ) )* ( (lv_stmt_6_0= ruleStatementBlock ) ) ( (lv_blocks_7_0= ruleBlock ) )* )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:80:1: (otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attr_3_0= ruleAttrList ) ) otherlv_4= ')' ( (lv_decl_5_0= ruleDeclaration ) )* ( (lv_stmt_6_0= ruleStatementBlock ) ) ( (lv_blocks_7_0= ruleBlock ) )* )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:80:3: otherlv_0= 'game' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_attr_3_0= ruleAttrList ) ) otherlv_4= ')' ( (lv_decl_5_0= ruleDeclaration ) )* ( (lv_stmt_6_0= ruleStatementBlock ) ) ( (lv_blocks_7_0= ruleBlock ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleModel122); 

                	newLeafNode(otherlv_0, grammarAccess.getModelAccess().getGameKeyword_0());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:85:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleModel139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleModel156); 

                	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:106:1: ( (lv_attr_3_0= ruleAttrList ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:107:1: (lv_attr_3_0= ruleAttrList )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:107:1: (lv_attr_3_0= ruleAttrList )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:108:3: lv_attr_3_0= ruleAttrList
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getAttrAttrListParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleAttrList_in_ruleModel177);
            lv_attr_3_0=ruleAttrList();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"attr",
                    		lv_attr_3_0, 
                    		"AttrList");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleModel189); 

                	newLeafNode(otherlv_4, grammarAccess.getModelAccess().getRightParenthesisKeyword_4());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:128:1: ( (lv_decl_5_0= ruleDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||(LA1_0>=21 && LA1_0<=23)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:129:1: (lv_decl_5_0= ruleDeclaration )
            	    {
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:129:1: (lv_decl_5_0= ruleDeclaration )
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:130:3: lv_decl_5_0= ruleDeclaration
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getDeclDeclarationParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleModel210);
            	    lv_decl_5_0=ruleDeclaration();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"decl",
            	            		lv_decl_5_0, 
            	            		"Declaration");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:146:3: ( (lv_stmt_6_0= ruleStatementBlock ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:147:1: (lv_stmt_6_0= ruleStatementBlock )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:147:1: (lv_stmt_6_0= ruleStatementBlock )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:148:3: lv_stmt_6_0= ruleStatementBlock
            {
             
            	        newCompositeNode(grammarAccess.getModelAccess().getStmtStatementBlockParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleStatementBlock_in_ruleModel232);
            lv_stmt_6_0=ruleStatementBlock();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelRule());
            	        }
                   		set(
                   			current, 
                   			"stmt",
                    		lv_stmt_6_0, 
                    		"StatementBlock");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:164:2: ( (lv_blocks_7_0= ruleBlock ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=19 && LA2_0<=20)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:165:1: (lv_blocks_7_0= ruleBlock )
            	    {
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:165:1: (lv_blocks_7_0= ruleBlock )
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:166:3: lv_blocks_7_0= ruleBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getBlocksBlockParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBlock_in_ruleModel253);
            	    lv_blocks_7_0=ruleBlock();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"blocks",
            	            		lv_blocks_7_0, 
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


    // $ANTLR start "entryRuleDeclaration"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:190:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:191:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:192:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration290);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration300); 

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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:199:1: ruleDeclaration returns [EObject current=null] : ( ( ( (lv_vari_0_0= ruleVarDecl ) ) | ( (lv_obj_1_0= ruleObjDecl ) ) ) otherlv_2= ';' ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_vari_0_0 = null;

        EObject lv_obj_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:202:28: ( ( ( ( (lv_vari_0_0= ruleVarDecl ) ) | ( (lv_obj_1_0= ruleObjDecl ) ) ) otherlv_2= ';' ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:203:1: ( ( ( (lv_vari_0_0= ruleVarDecl ) ) | ( (lv_obj_1_0= ruleObjDecl ) ) ) otherlv_2= ';' )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:203:1: ( ( ( (lv_vari_0_0= ruleVarDecl ) ) | ( (lv_obj_1_0= ruleObjDecl ) ) ) otherlv_2= ';' )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:203:2: ( ( (lv_vari_0_0= ruleVarDecl ) ) | ( (lv_obj_1_0= ruleObjDecl ) ) ) otherlv_2= ';'
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:203:2: ( ( (lv_vari_0_0= ruleVarDecl ) ) | ( (lv_obj_1_0= ruleObjDecl ) ) )
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
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:203:3: ( (lv_vari_0_0= ruleVarDecl ) )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:203:3: ( (lv_vari_0_0= ruleVarDecl ) )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:204:1: (lv_vari_0_0= ruleVarDecl )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:204:1: (lv_vari_0_0= ruleVarDecl )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:205:3: lv_vari_0_0= ruleVarDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeclarationAccess().getVariVarDeclParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVarDecl_in_ruleDeclaration347);
                    lv_vari_0_0=ruleVarDecl();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
                    	        }
                           		set(
                           			current, 
                           			"vari",
                            		lv_vari_0_0, 
                            		"VarDecl");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:222:6: ( (lv_obj_1_0= ruleObjDecl ) )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:222:6: ( (lv_obj_1_0= ruleObjDecl ) )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:223:1: (lv_obj_1_0= ruleObjDecl )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:223:1: (lv_obj_1_0= ruleObjDecl )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:224:3: lv_obj_1_0= ruleObjDecl
                    {
                     
                    	        newCompositeNode(grammarAccess.getDeclarationAccess().getObjObjDeclParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleObjDecl_in_ruleDeclaration374);
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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleDeclaration387); 

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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:252:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:253:2: (iv_ruleVarDecl= ruleVarDecl EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:254:2: iv_ruleVarDecl= ruleVarDecl EOF
            {
             newCompositeNode(grammarAccess.getVarDeclRule()); 
            pushFollow(FOLLOW_ruleVarDecl_in_entryRuleVarDecl423);
            iv_ruleVarDecl=ruleVarDecl();

            state._fsp--;

             current =iv_ruleVarDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarDecl433); 

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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:261:1: ruleVarDecl returns [EObject current=null] : (otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' ( (lv_expr_3_0= ruleExpr ) ) )? | (otherlv_4= '[' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= ']' ) ) ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;
        Token otherlv_6=null;
        EObject lv_expr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:264:28: ( (otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' ( (lv_expr_3_0= ruleExpr ) ) )? | (otherlv_4= '[' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= ']' ) ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:265:1: (otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' ( (lv_expr_3_0= ruleExpr ) ) )? | (otherlv_4= '[' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= ']' ) ) )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:265:1: (otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' ( (lv_expr_3_0= ruleExpr ) ) )? | (otherlv_4= '[' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= ']' ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:265:3: otherlv_0= 'int' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '=' ( (lv_expr_3_0= ruleExpr ) ) )? | (otherlv_4= '[' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= ']' ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleVarDecl470); 

                	newLeafNode(otherlv_0, grammarAccess.getVarDeclAccess().getIntKeyword_0());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:269:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:270:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:270:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:271:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVarDecl487); 

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

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:287:2: ( (otherlv_2= '=' ( (lv_expr_3_0= ruleExpr ) ) )? | (otherlv_4= '[' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= ']' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==EOF||LA5_0==14||LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:287:3: (otherlv_2= '=' ( (lv_expr_3_0= ruleExpr ) ) )?
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:287:3: (otherlv_2= '=' ( (lv_expr_3_0= ruleExpr ) ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==16) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:287:5: otherlv_2= '=' ( (lv_expr_3_0= ruleExpr ) )
                            {
                            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleVarDecl506); 

                                	newLeafNode(otherlv_2, grammarAccess.getVarDeclAccess().getEqualsSignKeyword_2_0_0());
                                
                            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:291:1: ( (lv_expr_3_0= ruleExpr ) )
                            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:292:1: (lv_expr_3_0= ruleExpr )
                            {
                            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:292:1: (lv_expr_3_0= ruleExpr )
                            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:293:3: lv_expr_3_0= ruleExpr
                            {
                             
                            	        newCompositeNode(grammarAccess.getVarDeclAccess().getExprExprParserRuleCall_2_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleExpr_in_ruleVarDecl527);
                            lv_expr_3_0=ruleExpr();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getVarDeclRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"expr",
                                    		lv_expr_3_0, 
                                    		"Expr");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:310:6: (otherlv_4= '[' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= ']' )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:310:6: (otherlv_4= '[' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= ']' )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:310:8: otherlv_4= '[' ( (lv_value_5_0= RULE_INT ) ) otherlv_6= ']'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleVarDecl548); 

                        	newLeafNode(otherlv_4, grammarAccess.getVarDeclAccess().getLeftSquareBracketKeyword_2_1_0());
                        
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:314:1: ( (lv_value_5_0= RULE_INT ) )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:315:1: (lv_value_5_0= RULE_INT )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:315:1: (lv_value_5_0= RULE_INT )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:316:3: lv_value_5_0= RULE_INT
                    {
                    lv_value_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVarDecl565); 

                    			newLeafNode(lv_value_5_0, grammarAccess.getVarDeclAccess().getValueINTTerminalRuleCall_2_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVarDeclRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_5_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleVarDecl582); 

                        	newLeafNode(otherlv_6, grammarAccess.getVarDeclAccess().getRightSquareBracketKeyword_2_1_2());
                        

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


    // $ANTLR start "entryRuleObjDecl"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:344:1: entryRuleObjDecl returns [EObject current=null] : iv_ruleObjDecl= ruleObjDecl EOF ;
    public final EObject entryRuleObjDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjDecl = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:345:2: (iv_ruleObjDecl= ruleObjDecl EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:346:2: iv_ruleObjDecl= ruleObjDecl EOF
            {
             newCompositeNode(grammarAccess.getObjDeclRule()); 
            pushFollow(FOLLOW_ruleObjDecl_in_entryRuleObjDecl620);
            iv_ruleObjDecl=ruleObjDecl();

            state._fsp--;

             current =iv_ruleObjDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjDecl630); 

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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:353:1: ruleObjDecl returns [EObject current=null] : ( ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_attr_3_0= ruleAttrList ) ) otherlv_4= ')' ) | (otherlv_5= '[' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ']' ) ) ) ;
    public final EObject ruleObjDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_value_6_0=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;

        EObject lv_attr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:356:28: ( ( ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_attr_3_0= ruleAttrList ) ) otherlv_4= ')' ) | (otherlv_5= '[' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ']' ) ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:357:1: ( ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_attr_3_0= ruleAttrList ) ) otherlv_4= ')' ) | (otherlv_5= '[' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ']' ) ) )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:357:1: ( ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_attr_3_0= ruleAttrList ) ) otherlv_4= ')' ) | (otherlv_5= '[' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ']' ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:357:2: ( (lv_type_0_0= ruleObjType ) ) ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= '(' ( (lv_attr_3_0= ruleAttrList ) ) otherlv_4= ')' ) | (otherlv_5= '[' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ']' ) )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:357:2: ( (lv_type_0_0= ruleObjType ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:358:1: (lv_type_0_0= ruleObjType )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:358:1: (lv_type_0_0= ruleObjType )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:359:3: lv_type_0_0= ruleObjType
            {
             
            	        newCompositeNode(grammarAccess.getObjDeclAccess().getTypeObjTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleObjType_in_ruleObjDecl676);
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

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:375:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:376:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:376:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:377:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleObjDecl693); 

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

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:393:2: ( (otherlv_2= '(' ( (lv_attr_3_0= ruleAttrList ) ) otherlv_4= ')' ) | (otherlv_5= '[' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ']' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            else if ( (LA6_0==17) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:393:3: (otherlv_2= '(' ( (lv_attr_3_0= ruleAttrList ) ) otherlv_4= ')' )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:393:3: (otherlv_2= '(' ( (lv_attr_3_0= ruleAttrList ) ) otherlv_4= ')' )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:393:5: otherlv_2= '(' ( (lv_attr_3_0= ruleAttrList ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleObjDecl712); 

                        	newLeafNode(otherlv_2, grammarAccess.getObjDeclAccess().getLeftParenthesisKeyword_2_0_0());
                        
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:397:1: ( (lv_attr_3_0= ruleAttrList ) )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:398:1: (lv_attr_3_0= ruleAttrList )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:398:1: (lv_attr_3_0= ruleAttrList )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:399:3: lv_attr_3_0= ruleAttrList
                    {
                     
                    	        newCompositeNode(grammarAccess.getObjDeclAccess().getAttrAttrListParserRuleCall_2_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttrList_in_ruleObjDecl733);
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

                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleObjDecl745); 

                        	newLeafNode(otherlv_4, grammarAccess.getObjDeclAccess().getRightParenthesisKeyword_2_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:420:6: (otherlv_5= '[' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ']' )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:420:6: (otherlv_5= '[' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ']' )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:420:8: otherlv_5= '[' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleObjDecl765); 

                        	newLeafNode(otherlv_5, grammarAccess.getObjDeclAccess().getLeftSquareBracketKeyword_2_1_0());
                        
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:424:1: ( (lv_value_6_0= RULE_INT ) )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:425:1: (lv_value_6_0= RULE_INT )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:425:1: (lv_value_6_0= RULE_INT )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:426:3: lv_value_6_0= RULE_INT
                    {
                    lv_value_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleObjDecl782); 

                    			newLeafNode(lv_value_6_0, grammarAccess.getObjDeclAccess().getValueINTTerminalRuleCall_2_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getObjDeclRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_6_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleObjDecl799); 

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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:454:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:455:2: (iv_ruleBlock= ruleBlock EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:456:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock837);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock847); 

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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:463:1: ruleBlock returns [EObject current=null] : (this_AnimBlock_0= ruleAnimBlock | this_EventBlock_1= ruleEventBlock ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        EObject this_AnimBlock_0 = null;

        EObject this_EventBlock_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:466:28: ( (this_AnimBlock_0= ruleAnimBlock | this_EventBlock_1= ruleEventBlock ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:467:1: (this_AnimBlock_0= ruleAnimBlock | this_EventBlock_1= ruleEventBlock )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:467:1: (this_AnimBlock_0= ruleAnimBlock | this_EventBlock_1= ruleEventBlock )
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
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:468:5: this_AnimBlock_0= ruleAnimBlock
                    {
                     
                            newCompositeNode(grammarAccess.getBlockAccess().getAnimBlockParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAnimBlock_in_ruleBlock894);
                    this_AnimBlock_0=ruleAnimBlock();

                    state._fsp--;

                     
                            current = this_AnimBlock_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:478:5: this_EventBlock_1= ruleEventBlock
                    {
                     
                            newCompositeNode(grammarAccess.getBlockAccess().getEventBlockParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleEventBlock_in_ruleBlock921);
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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:494:1: entryRuleAnimBlock returns [EObject current=null] : iv_ruleAnimBlock= ruleAnimBlock EOF ;
    public final EObject entryRuleAnimBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnimBlock = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:495:2: (iv_ruleAnimBlock= ruleAnimBlock EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:496:2: iv_ruleAnimBlock= ruleAnimBlock EOF
            {
             newCompositeNode(grammarAccess.getAnimBlockRule()); 
            pushFollow(FOLLOW_ruleAnimBlock_in_entryRuleAnimBlock956);
            iv_ruleAnimBlock=ruleAnimBlock();

            state._fsp--;

             current =iv_ruleAnimBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnimBlock966); 

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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:503:1: ruleAnimBlock returns [EObject current=null] : (otherlv_0= 'animation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleObjType ) ) ( (lv_objName_4_0= RULE_ID ) ) otherlv_5= ')' ( (lv_stmt_6_0= ruleStatementBlock ) ) ) ;
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
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:506:28: ( (otherlv_0= 'animation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleObjType ) ) ( (lv_objName_4_0= RULE_ID ) ) otherlv_5= ')' ( (lv_stmt_6_0= ruleStatementBlock ) ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:507:1: (otherlv_0= 'animation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleObjType ) ) ( (lv_objName_4_0= RULE_ID ) ) otherlv_5= ')' ( (lv_stmt_6_0= ruleStatementBlock ) ) )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:507:1: (otherlv_0= 'animation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleObjType ) ) ( (lv_objName_4_0= RULE_ID ) ) otherlv_5= ')' ( (lv_stmt_6_0= ruleStatementBlock ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:507:3: otherlv_0= 'animation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_type_3_0= ruleObjType ) ) ( (lv_objName_4_0= RULE_ID ) ) otherlv_5= ')' ( (lv_stmt_6_0= ruleStatementBlock ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleAnimBlock1003); 

                	newLeafNode(otherlv_0, grammarAccess.getAnimBlockAccess().getAnimationKeyword_0());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:511:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:512:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:512:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:513:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnimBlock1020); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleAnimBlock1037); 

                	newLeafNode(otherlv_2, grammarAccess.getAnimBlockAccess().getLeftParenthesisKeyword_2());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:533:1: ( (lv_type_3_0= ruleObjType ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:534:1: (lv_type_3_0= ruleObjType )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:534:1: (lv_type_3_0= ruleObjType )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:535:3: lv_type_3_0= ruleObjType
            {
             
            	        newCompositeNode(grammarAccess.getAnimBlockAccess().getTypeObjTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleObjType_in_ruleAnimBlock1058);
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

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:551:2: ( (lv_objName_4_0= RULE_ID ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:552:1: (lv_objName_4_0= RULE_ID )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:552:1: (lv_objName_4_0= RULE_ID )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:553:3: lv_objName_4_0= RULE_ID
            {
            lv_objName_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnimBlock1075); 

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

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleAnimBlock1092); 

                	newLeafNode(otherlv_5, grammarAccess.getAnimBlockAccess().getRightParenthesisKeyword_5());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:573:1: ( (lv_stmt_6_0= ruleStatementBlock ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:574:1: (lv_stmt_6_0= ruleStatementBlock )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:574:1: (lv_stmt_6_0= ruleStatementBlock )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:575:3: lv_stmt_6_0= ruleStatementBlock
            {
             
            	        newCompositeNode(grammarAccess.getAnimBlockAccess().getStmtStatementBlockParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleStatementBlock_in_ruleAnimBlock1113);
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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:599:1: entryRuleEventBlock returns [EObject current=null] : iv_ruleEventBlock= ruleEventBlock EOF ;
    public final EObject entryRuleEventBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventBlock = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:600:2: (iv_ruleEventBlock= ruleEventBlock EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:601:2: iv_ruleEventBlock= ruleEventBlock EOF
            {
             newCompositeNode(grammarAccess.getEventBlockRule()); 
            pushFollow(FOLLOW_ruleEventBlock_in_entryRuleEventBlock1149);
            iv_ruleEventBlock=ruleEventBlock();

            state._fsp--;

             current =iv_ruleEventBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventBlock1159); 

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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:608:1: ruleEventBlock returns [EObject current=null] : (otherlv_0= 'on' ( (lv_key_1_0= ruleKeystroke ) ) ( (lv_stmt_2_0= ruleStatementBlock ) ) ) ;
    public final EObject ruleEventBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;

        EObject lv_stmt_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:611:28: ( (otherlv_0= 'on' ( (lv_key_1_0= ruleKeystroke ) ) ( (lv_stmt_2_0= ruleStatementBlock ) ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:612:1: (otherlv_0= 'on' ( (lv_key_1_0= ruleKeystroke ) ) ( (lv_stmt_2_0= ruleStatementBlock ) ) )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:612:1: (otherlv_0= 'on' ( (lv_key_1_0= ruleKeystroke ) ) ( (lv_stmt_2_0= ruleStatementBlock ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:612:3: otherlv_0= 'on' ( (lv_key_1_0= ruleKeystroke ) ) ( (lv_stmt_2_0= ruleStatementBlock ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleEventBlock1196); 

                	newLeafNode(otherlv_0, grammarAccess.getEventBlockAccess().getOnKeyword_0());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:616:1: ( (lv_key_1_0= ruleKeystroke ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:617:1: (lv_key_1_0= ruleKeystroke )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:617:1: (lv_key_1_0= ruleKeystroke )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:618:3: lv_key_1_0= ruleKeystroke
            {
             
            	        newCompositeNode(grammarAccess.getEventBlockAccess().getKeyKeystrokeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleKeystroke_in_ruleEventBlock1217);
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

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:634:2: ( (lv_stmt_2_0= ruleStatementBlock ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:635:1: (lv_stmt_2_0= ruleStatementBlock )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:635:1: (lv_stmt_2_0= ruleStatementBlock )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:636:3: lv_stmt_2_0= ruleStatementBlock
            {
             
            	        newCompositeNode(grammarAccess.getEventBlockAccess().getStmtStatementBlockParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleStatementBlock_in_ruleEventBlock1238);
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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:660:1: entryRuleObjType returns [String current=null] : iv_ruleObjType= ruleObjType EOF ;
    public final String entryRuleObjType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleObjType = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:661:2: (iv_ruleObjType= ruleObjType EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:662:2: iv_ruleObjType= ruleObjType EOF
            {
             newCompositeNode(grammarAccess.getObjTypeRule()); 
            pushFollow(FOLLOW_ruleObjType_in_entryRuleObjType1275);
            iv_ruleObjType=ruleObjType();

            state._fsp--;

             current =iv_ruleObjType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjType1286); 

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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:669:1: ruleObjType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'rectangle' | kw= 'triangle' | kw= 'circle' ) ;
    public final AntlrDatatypeRuleToken ruleObjType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:672:28: ( (kw= 'rectangle' | kw= 'triangle' | kw= 'circle' ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:673:1: (kw= 'rectangle' | kw= 'triangle' | kw= 'circle' )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:673:1: (kw= 'rectangle' | kw= 'triangle' | kw= 'circle' )
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
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:674:2: kw= 'rectangle'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleObjType1324); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getObjTypeAccess().getRectangleKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:681:2: kw= 'triangle'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleObjType1343); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getObjTypeAccess().getTriangleKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:688:2: kw= 'circle'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleObjType1362); 

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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:701:1: entryRuleKeystroke returns [String current=null] : iv_ruleKeystroke= ruleKeystroke EOF ;
    public final String entryRuleKeystroke() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeystroke = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:702:2: (iv_ruleKeystroke= ruleKeystroke EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:703:2: iv_ruleKeystroke= ruleKeystroke EOF
            {
             newCompositeNode(grammarAccess.getKeystrokeRule()); 
            pushFollow(FOLLOW_ruleKeystroke_in_entryRuleKeystroke1403);
            iv_ruleKeystroke=ruleKeystroke();

            state._fsp--;

             current =iv_ruleKeystroke.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeystroke1414); 

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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:710:1: ruleKeystroke returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'space' | kw= 'leftarrow' | kw= 'rightarrow' | kw= 'uparrow' | kw= 'downarrow' ) ;
    public final AntlrDatatypeRuleToken ruleKeystroke() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:713:28: ( (kw= 'space' | kw= 'leftarrow' | kw= 'rightarrow' | kw= 'uparrow' | kw= 'downarrow' ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:714:1: (kw= 'space' | kw= 'leftarrow' | kw= 'rightarrow' | kw= 'uparrow' | kw= 'downarrow' )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:714:1: (kw= 'space' | kw= 'leftarrow' | kw= 'rightarrow' | kw= 'uparrow' | kw= 'downarrow' )
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
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:715:2: kw= 'space'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleKeystroke1452); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getKeystrokeAccess().getSpaceKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:722:2: kw= 'leftarrow'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleKeystroke1471); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getKeystrokeAccess().getLeftarrowKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:729:2: kw= 'rightarrow'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleKeystroke1490); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getKeystrokeAccess().getRightarrowKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:736:2: kw= 'uparrow'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleKeystroke1509); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getKeystrokeAccess().getUparrowKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:743:2: kw= 'downarrow'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleKeystroke1528); 

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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:756:1: entryRuleStatementBlock returns [EObject current=null] : iv_ruleStatementBlock= ruleStatementBlock EOF ;
    public final EObject entryRuleStatementBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementBlock = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:757:2: (iv_ruleStatementBlock= ruleStatementBlock EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:758:2: iv_ruleStatementBlock= ruleStatementBlock EOF
            {
             newCompositeNode(grammarAccess.getStatementBlockRule()); 
            pushFollow(FOLLOW_ruleStatementBlock_in_entryRuleStatementBlock1568);
            iv_ruleStatementBlock=ruleStatementBlock();

            state._fsp--;

             current =iv_ruleStatementBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatementBlock1578); 

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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:765:1: ruleStatementBlock returns [EObject current=null] : ( () (otherlv_1= '{' ( (lv_stmt_2_0= ruleStmt ) )* otherlv_3= '}' ) ) ;
    public final EObject ruleStatementBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_stmt_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:768:28: ( ( () (otherlv_1= '{' ( (lv_stmt_2_0= ruleStmt ) )* otherlv_3= '}' ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:769:1: ( () (otherlv_1= '{' ( (lv_stmt_2_0= ruleStmt ) )* otherlv_3= '}' ) )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:769:1: ( () (otherlv_1= '{' ( (lv_stmt_2_0= ruleStmt ) )* otherlv_3= '}' ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:769:2: () (otherlv_1= '{' ( (lv_stmt_2_0= ruleStmt ) )* otherlv_3= '}' )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:769:2: ()
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:770:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStatementBlockAccess().getStatementBlockAction_0(),
                        current);
                

            }

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:775:2: (otherlv_1= '{' ( (lv_stmt_2_0= ruleStmt ) )* otherlv_3= '}' )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:775:4: otherlv_1= '{' ( (lv_stmt_2_0= ruleStmt ) )* otherlv_3= '}'
            {
            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleStatementBlock1625); 

                	newLeafNode(otherlv_1, grammarAccess.getStatementBlockAccess().getLeftCurlyBracketKeyword_1_0());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:779:1: ( (lv_stmt_2_0= ruleStmt ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||(LA10_0>=31 && LA10_0<=32)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:780:1: (lv_stmt_2_0= ruleStmt )
            	    {
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:780:1: (lv_stmt_2_0= ruleStmt )
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:781:3: lv_stmt_2_0= ruleStmt
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStatementBlockAccess().getStmtStmtParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStmt_in_ruleStatementBlock1646);
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

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleStatementBlock1659); 

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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:809:1: entryRuleStmt returns [EObject current=null] : iv_ruleStmt= ruleStmt EOF ;
    public final EObject entryRuleStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStmt = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:810:2: (iv_ruleStmt= ruleStmt EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:811:2: iv_ruleStmt= ruleStmt EOF
            {
             newCompositeNode(grammarAccess.getStmtRule()); 
            pushFollow(FOLLOW_ruleStmt_in_entryRuleStmt1696);
            iv_ruleStmt=ruleStmt();

            state._fsp--;

             current =iv_ruleStmt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStmt1706); 

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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:818:1: ruleStmt returns [EObject current=null] : (this_IfStmt_0= ruleIfStmt | this_ForStmt_1= ruleForStmt | this_AssStmt_2= ruleAssStmt ) ;
    public final EObject ruleStmt() throws RecognitionException {
        EObject current = null;

        EObject this_IfStmt_0 = null;

        EObject this_ForStmt_1 = null;

        EObject this_AssStmt_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:821:28: ( (this_IfStmt_0= ruleIfStmt | this_ForStmt_1= ruleForStmt | this_AssStmt_2= ruleAssStmt ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:822:1: (this_IfStmt_0= ruleIfStmt | this_ForStmt_1= ruleForStmt | this_AssStmt_2= ruleAssStmt )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:822:1: (this_IfStmt_0= ruleIfStmt | this_ForStmt_1= ruleForStmt | this_AssStmt_2= ruleAssStmt )
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
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:823:5: this_IfStmt_0= ruleIfStmt
                    {
                     
                            newCompositeNode(grammarAccess.getStmtAccess().getIfStmtParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIfStmt_in_ruleStmt1753);
                    this_IfStmt_0=ruleIfStmt();

                    state._fsp--;

                     
                            current = this_IfStmt_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:833:5: this_ForStmt_1= ruleForStmt
                    {
                     
                            newCompositeNode(grammarAccess.getStmtAccess().getForStmtParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleForStmt_in_ruleStmt1780);
                    this_ForStmt_1=ruleForStmt();

                    state._fsp--;

                     
                            current = this_ForStmt_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:843:5: this_AssStmt_2= ruleAssStmt
                    {
                     
                            newCompositeNode(grammarAccess.getStmtAccess().getAssStmtParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAssStmt_in_ruleStmt1807);
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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:859:1: entryRuleForStmt returns [EObject current=null] : iv_ruleForStmt= ruleForStmt EOF ;
    public final EObject entryRuleForStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStmt = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:860:2: (iv_ruleForStmt= ruleForStmt EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:861:2: iv_ruleForStmt= ruleForStmt EOF
            {
             newCompositeNode(grammarAccess.getForStmtRule()); 
            pushFollow(FOLLOW_ruleForStmt_in_entryRuleForStmt1842);
            iv_ruleForStmt=ruleForStmt();

            state._fsp--;

             current =iv_ruleForStmt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForStmt1852); 

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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:868:1: ruleForStmt returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_ass1_2_0= ruleAssStmt ) ) ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= ';' ( (lv_ass2_5_0= ruleAssStmt2 ) ) otherlv_6= ')' ( (lv_stmt_7_0= ruleStatementBlock ) ) ) ;
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
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:871:28: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_ass1_2_0= ruleAssStmt ) ) ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= ';' ( (lv_ass2_5_0= ruleAssStmt2 ) ) otherlv_6= ')' ( (lv_stmt_7_0= ruleStatementBlock ) ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:872:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_ass1_2_0= ruleAssStmt ) ) ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= ';' ( (lv_ass2_5_0= ruleAssStmt2 ) ) otherlv_6= ')' ( (lv_stmt_7_0= ruleStatementBlock ) ) )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:872:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_ass1_2_0= ruleAssStmt ) ) ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= ';' ( (lv_ass2_5_0= ruleAssStmt2 ) ) otherlv_6= ')' ( (lv_stmt_7_0= ruleStatementBlock ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:872:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_ass1_2_0= ruleAssStmt ) ) ( (lv_expr_3_0= ruleExpr ) ) otherlv_4= ';' ( (lv_ass2_5_0= ruleAssStmt2 ) ) otherlv_6= ')' ( (lv_stmt_7_0= ruleStatementBlock ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleForStmt1889); 

                	newLeafNode(otherlv_0, grammarAccess.getForStmtAccess().getForKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleForStmt1901); 

                	newLeafNode(otherlv_1, grammarAccess.getForStmtAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:880:1: ( (lv_ass1_2_0= ruleAssStmt ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:881:1: (lv_ass1_2_0= ruleAssStmt )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:881:1: (lv_ass1_2_0= ruleAssStmt )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:882:3: lv_ass1_2_0= ruleAssStmt
            {
             
            	        newCompositeNode(grammarAccess.getForStmtAccess().getAss1AssStmtParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAssStmt_in_ruleForStmt1922);
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

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:898:2: ( (lv_expr_3_0= ruleExpr ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:899:1: (lv_expr_3_0= ruleExpr )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:899:1: (lv_expr_3_0= ruleExpr )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:900:3: lv_expr_3_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getForStmtAccess().getExprExprParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleForStmt1943);
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

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleForStmt1955); 

                	newLeafNode(otherlv_4, grammarAccess.getForStmtAccess().getSemicolonKeyword_4());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:920:1: ( (lv_ass2_5_0= ruleAssStmt2 ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:921:1: (lv_ass2_5_0= ruleAssStmt2 )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:921:1: (lv_ass2_5_0= ruleAssStmt2 )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:922:3: lv_ass2_5_0= ruleAssStmt2
            {
             
            	        newCompositeNode(grammarAccess.getForStmtAccess().getAss2AssStmt2ParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleAssStmt2_in_ruleForStmt1976);
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

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleForStmt1988); 

                	newLeafNode(otherlv_6, grammarAccess.getForStmtAccess().getRightParenthesisKeyword_6());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:942:1: ( (lv_stmt_7_0= ruleStatementBlock ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:943:1: (lv_stmt_7_0= ruleStatementBlock )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:943:1: (lv_stmt_7_0= ruleStatementBlock )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:944:3: lv_stmt_7_0= ruleStatementBlock
            {
             
            	        newCompositeNode(grammarAccess.getForStmtAccess().getStmtStatementBlockParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleStatementBlock_in_ruleForStmt2009);
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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:968:1: entryRuleIfStmt returns [EObject current=null] : iv_ruleIfStmt= ruleIfStmt EOF ;
    public final EObject entryRuleIfStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStmt = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:969:2: (iv_ruleIfStmt= ruleIfStmt EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:970:2: iv_ruleIfStmt= ruleIfStmt EOF
            {
             newCompositeNode(grammarAccess.getIfStmtRule()); 
            pushFollow(FOLLOW_ruleIfStmt_in_entryRuleIfStmt2045);
            iv_ruleIfStmt=ruleIfStmt();

            state._fsp--;

             current =iv_ruleIfStmt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfStmt2055); 

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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:977:1: ruleIfStmt returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_stmt_4_0= ruleStatementBlock ) ) ( (lv_else_5_0= ruleElseStmt ) )? ) ;
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
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:980:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_stmt_4_0= ruleStatementBlock ) ) ( (lv_else_5_0= ruleElseStmt ) )? ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:981:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_stmt_4_0= ruleStatementBlock ) ) ( (lv_else_5_0= ruleElseStmt ) )? )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:981:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_stmt_4_0= ruleStatementBlock ) ) ( (lv_else_5_0= ruleElseStmt ) )? )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:981:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ')' ( (lv_stmt_4_0= ruleStatementBlock ) ) ( (lv_else_5_0= ruleElseStmt ) )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleIfStmt2092); 

                	newLeafNode(otherlv_0, grammarAccess.getIfStmtAccess().getIfKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleIfStmt2104); 

                	newLeafNode(otherlv_1, grammarAccess.getIfStmtAccess().getLeftParenthesisKeyword_1());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:989:1: ( (lv_expr_2_0= ruleExpr ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:990:1: (lv_expr_2_0= ruleExpr )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:990:1: (lv_expr_2_0= ruleExpr )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:991:3: lv_expr_2_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getIfStmtAccess().getExprExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleIfStmt2125);
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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleIfStmt2137); 

                	newLeafNode(otherlv_3, grammarAccess.getIfStmtAccess().getRightParenthesisKeyword_3());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1011:1: ( (lv_stmt_4_0= ruleStatementBlock ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1012:1: (lv_stmt_4_0= ruleStatementBlock )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1012:1: (lv_stmt_4_0= ruleStatementBlock )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1013:3: lv_stmt_4_0= ruleStatementBlock
            {
             
            	        newCompositeNode(grammarAccess.getIfStmtAccess().getStmtStatementBlockParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleStatementBlock_in_ruleIfStmt2158);
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

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1029:2: ( (lv_else_5_0= ruleElseStmt ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1030:1: (lv_else_5_0= ruleElseStmt )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1030:1: (lv_else_5_0= ruleElseStmt )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1031:3: lv_else_5_0= ruleElseStmt
                    {
                     
                    	        newCompositeNode(grammarAccess.getIfStmtAccess().getElseElseStmtParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElseStmt_in_ruleIfStmt2179);
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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1055:1: entryRuleElseStmt returns [EObject current=null] : iv_ruleElseStmt= ruleElseStmt EOF ;
    public final EObject entryRuleElseStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseStmt = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1056:2: (iv_ruleElseStmt= ruleElseStmt EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1057:2: iv_ruleElseStmt= ruleElseStmt EOF
            {
             newCompositeNode(grammarAccess.getElseStmtRule()); 
            pushFollow(FOLLOW_ruleElseStmt_in_entryRuleElseStmt2216);
            iv_ruleElseStmt=ruleElseStmt();

            state._fsp--;

             current =iv_ruleElseStmt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElseStmt2226); 

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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1064:1: ruleElseStmt returns [EObject current=null] : (otherlv_0= 'else' ( (lv_stmt_1_0= ruleStatementBlock ) ) ) ;
    public final EObject ruleElseStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_stmt_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1067:28: ( (otherlv_0= 'else' ( (lv_stmt_1_0= ruleStatementBlock ) ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1068:1: (otherlv_0= 'else' ( (lv_stmt_1_0= ruleStatementBlock ) ) )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1068:1: (otherlv_0= 'else' ( (lv_stmt_1_0= ruleStatementBlock ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1068:3: otherlv_0= 'else' ( (lv_stmt_1_0= ruleStatementBlock ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleElseStmt2263); 

                	newLeafNode(otherlv_0, grammarAccess.getElseStmtAccess().getElseKeyword_0());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1072:1: ( (lv_stmt_1_0= ruleStatementBlock ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1073:1: (lv_stmt_1_0= ruleStatementBlock )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1073:1: (lv_stmt_1_0= ruleStatementBlock )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1074:3: lv_stmt_1_0= ruleStatementBlock
            {
             
            	        newCompositeNode(grammarAccess.getElseStmtAccess().getStmtStatementBlockParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStatementBlock_in_ruleElseStmt2284);
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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1098:1: entryRuleAssStmt returns [EObject current=null] : iv_ruleAssStmt= ruleAssStmt EOF ;
    public final EObject entryRuleAssStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssStmt = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1099:2: (iv_ruleAssStmt= ruleAssStmt EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1100:2: iv_ruleAssStmt= ruleAssStmt EOF
            {
             newCompositeNode(grammarAccess.getAssStmtRule()); 
            pushFollow(FOLLOW_ruleAssStmt_in_entryRuleAssStmt2320);
            iv_ruleAssStmt=ruleAssStmt();

            state._fsp--;

             current =iv_ruleAssStmt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssStmt2330); 

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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1107:1: ruleAssStmt returns [EObject current=null] : ( ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ';' ) ;
    public final EObject ruleAssStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_var_0_0 = null;

        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1110:28: ( ( ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ';' ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1111:1: ( ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ';' )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1111:1: ( ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ';' )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1111:2: ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ';'
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1111:2: ( (lv_var_0_0= ruleVar ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1112:1: (lv_var_0_0= ruleVar )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1112:1: (lv_var_0_0= ruleVar )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1113:3: lv_var_0_0= ruleVar
            {
             
            	        newCompositeNode(grammarAccess.getAssStmtAccess().getVarVarParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVar_in_ruleAssStmt2376);
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

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleAssStmt2388); 

                	newLeafNode(otherlv_1, grammarAccess.getAssStmtAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1133:1: ( (lv_expr_2_0= ruleExpr ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1134:1: (lv_expr_2_0= ruleExpr )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1134:1: (lv_expr_2_0= ruleExpr )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1135:3: lv_expr_2_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getAssStmtAccess().getExprExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleAssStmt2409);
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleAssStmt2421); 

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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1163:1: entryRuleAssStmt2 returns [EObject current=null] : iv_ruleAssStmt2= ruleAssStmt2 EOF ;
    public final EObject entryRuleAssStmt2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssStmt2 = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1164:2: (iv_ruleAssStmt2= ruleAssStmt2 EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1165:2: iv_ruleAssStmt2= ruleAssStmt2 EOF
            {
             newCompositeNode(grammarAccess.getAssStmt2Rule()); 
            pushFollow(FOLLOW_ruleAssStmt2_in_entryRuleAssStmt22457);
            iv_ruleAssStmt2=ruleAssStmt2();

            state._fsp--;

             current =iv_ruleAssStmt2; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssStmt22467); 

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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1172:1: ruleAssStmt2 returns [EObject current=null] : ( ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) ) ;
    public final EObject ruleAssStmt2() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_var_0_0 = null;

        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1175:28: ( ( ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1176:1: ( ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1176:1: ( ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1176:2: ( (lv_var_0_0= ruleVar ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1176:2: ( (lv_var_0_0= ruleVar ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1177:1: (lv_var_0_0= ruleVar )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1177:1: (lv_var_0_0= ruleVar )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1178:3: lv_var_0_0= ruleVar
            {
             
            	        newCompositeNode(grammarAccess.getAssStmt2Access().getVarVarParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleVar_in_ruleAssStmt22513);
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

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleAssStmt22525); 

                	newLeafNode(otherlv_1, grammarAccess.getAssStmt2Access().getEqualsSignKeyword_1());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1198:1: ( (lv_expr_2_0= ruleExpr ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1199:1: (lv_expr_2_0= ruleExpr )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1199:1: (lv_expr_2_0= ruleExpr )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1200:3: lv_expr_2_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getAssStmt2Access().getExprExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleAssStmt22546);
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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1224:1: entryRuleAttrList returns [EObject current=null] : iv_ruleAttrList= ruleAttrList EOF ;
    public final EObject entryRuleAttrList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttrList = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1225:2: (iv_ruleAttrList= ruleAttrList EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1226:2: iv_ruleAttrList= ruleAttrList EOF
            {
             newCompositeNode(grammarAccess.getAttrListRule()); 
            pushFollow(FOLLOW_ruleAttrList_in_entryRuleAttrList2582);
            iv_ruleAttrList=ruleAttrList();

            state._fsp--;

             current =iv_ruleAttrList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrList2592); 

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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1233:1: ruleAttrList returns [EObject current=null] : ( () ( ( (lv_attr_1_0= ruleAttrAss ) )? (otherlv_2= ',' ( (lv_attr_3_0= ruleAttrAss ) ) )* ) ) ;
    public final EObject ruleAttrList() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_attr_1_0 = null;

        EObject lv_attr_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1236:28: ( ( () ( ( (lv_attr_1_0= ruleAttrAss ) )? (otherlv_2= ',' ( (lv_attr_3_0= ruleAttrAss ) ) )* ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1237:1: ( () ( ( (lv_attr_1_0= ruleAttrAss ) )? (otherlv_2= ',' ( (lv_attr_3_0= ruleAttrAss ) ) )* ) )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1237:1: ( () ( ( (lv_attr_1_0= ruleAttrAss ) )? (otherlv_2= ',' ( (lv_attr_3_0= ruleAttrAss ) ) )* ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1237:2: () ( ( (lv_attr_1_0= ruleAttrAss ) )? (otherlv_2= ',' ( (lv_attr_3_0= ruleAttrAss ) ) )* )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1237:2: ()
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1238:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAttrListAccess().getAttrListAction_0(),
                        current);
                

            }

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1243:2: ( ( (lv_attr_1_0= ruleAttrAss ) )? (otherlv_2= ',' ( (lv_attr_3_0= ruleAttrAss ) ) )* )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1243:3: ( (lv_attr_1_0= ruleAttrAss ) )? (otherlv_2= ',' ( (lv_attr_3_0= ruleAttrAss ) ) )*
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1243:3: ( (lv_attr_1_0= ruleAttrAss ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1244:1: (lv_attr_1_0= ruleAttrAss )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1244:1: (lv_attr_1_0= ruleAttrAss )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1245:3: lv_attr_1_0= ruleAttrAss
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttrListAccess().getAttrAttrAssParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttrAss_in_ruleAttrList2648);
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

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1261:3: (otherlv_2= ',' ( (lv_attr_3_0= ruleAttrAss ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==34) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1261:5: otherlv_2= ',' ( (lv_attr_3_0= ruleAttrAss ) )
            	    {
            	    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleAttrList2662); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAttrListAccess().getCommaKeyword_1_1_0());
            	        
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1265:1: ( (lv_attr_3_0= ruleAttrAss ) )
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1266:1: (lv_attr_3_0= ruleAttrAss )
            	    {
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1266:1: (lv_attr_3_0= ruleAttrAss )
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1267:3: lv_attr_3_0= ruleAttrAss
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAttrListAccess().getAttrAttrAssParserRuleCall_1_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttrAss_in_ruleAttrList2683);
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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1291:1: entryRuleAttrAss returns [EObject current=null] : iv_ruleAttrAss= ruleAttrAss EOF ;
    public final EObject entryRuleAttrAss() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttrAss = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1292:2: (iv_ruleAttrAss= ruleAttrAss EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1293:2: iv_ruleAttrAss= ruleAttrAss EOF
            {
             newCompositeNode(grammarAccess.getAttrAssRule()); 
            pushFollow(FOLLOW_ruleAttrAss_in_entryRuleAttrAss2722);
            iv_ruleAttrAss=ruleAttrAss();

            state._fsp--;

             current =iv_ruleAttrAss; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttrAss2732); 

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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1300:1: ruleAttrAss returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) ) ;
    public final EObject ruleAttrAss() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1303:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1304:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1304:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1304:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expr_2_0= ruleExpr ) )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1304:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1305:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1305:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1306:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttrAss2774); 

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

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleAttrAss2791); 

                	newLeafNode(otherlv_1, grammarAccess.getAttrAssAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1326:1: ( (lv_expr_2_0= ruleExpr ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1327:1: (lv_expr_2_0= ruleExpr )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1327:1: (lv_expr_2_0= ruleExpr )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1328:3: lv_expr_2_0= ruleExpr
            {
             
            	        newCompositeNode(grammarAccess.getAttrAssAccess().getExprExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleExpr_in_ruleAttrAss2812);
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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1352:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1353:2: (iv_ruleExpr= ruleExpr EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1354:2: iv_ruleExpr= ruleExpr EOF
            {
             newCompositeNode(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr2848);
            iv_ruleExpr=ruleExpr();

            state._fsp--;

             current =iv_ruleExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr2858); 

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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1361:1: ruleExpr returns [EObject current=null] : ( ( (lv_conj_0_0= ruleConj ) ) (otherlv_1= '||' ( (lv_conj_2_0= ruleConj ) ) )* ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_conj_0_0 = null;

        EObject lv_conj_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1364:28: ( ( ( (lv_conj_0_0= ruleConj ) ) (otherlv_1= '||' ( (lv_conj_2_0= ruleConj ) ) )* ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1365:1: ( ( (lv_conj_0_0= ruleConj ) ) (otherlv_1= '||' ( (lv_conj_2_0= ruleConj ) ) )* )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1365:1: ( ( (lv_conj_0_0= ruleConj ) ) (otherlv_1= '||' ( (lv_conj_2_0= ruleConj ) ) )* )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1365:2: ( (lv_conj_0_0= ruleConj ) ) (otherlv_1= '||' ( (lv_conj_2_0= ruleConj ) ) )*
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1365:2: ( (lv_conj_0_0= ruleConj ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1366:1: (lv_conj_0_0= ruleConj )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1366:1: (lv_conj_0_0= ruleConj )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1367:3: lv_conj_0_0= ruleConj
            {
             
            	        newCompositeNode(grammarAccess.getExprAccess().getConjConjParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleConj_in_ruleExpr2904);
            lv_conj_0_0=ruleConj();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExprRule());
            	        }
                   		add(
                   			current, 
                   			"conj",
                    		lv_conj_0_0, 
                    		"Conj");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1383:2: (otherlv_1= '||' ( (lv_conj_2_0= ruleConj ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==35) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1383:4: otherlv_1= '||' ( (lv_conj_2_0= ruleConj ) )
            	    {
            	    otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleExpr2917); 

            	        	newLeafNode(otherlv_1, grammarAccess.getExprAccess().getVerticalLineVerticalLineKeyword_1_0());
            	        
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1387:1: ( (lv_conj_2_0= ruleConj ) )
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1388:1: (lv_conj_2_0= ruleConj )
            	    {
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1388:1: (lv_conj_2_0= ruleConj )
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1389:3: lv_conj_2_0= ruleConj
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExprAccess().getConjConjParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConj_in_ruleExpr2938);
            	    lv_conj_2_0=ruleConj();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExprRule());
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
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleConj"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1413:1: entryRuleConj returns [EObject current=null] : iv_ruleConj= ruleConj EOF ;
    public final EObject entryRuleConj() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConj = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1414:2: (iv_ruleConj= ruleConj EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1415:2: iv_ruleConj= ruleConj EOF
            {
             newCompositeNode(grammarAccess.getConjRule()); 
            pushFollow(FOLLOW_ruleConj_in_entryRuleConj2976);
            iv_ruleConj=ruleConj();

            state._fsp--;

             current =iv_ruleConj; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConj2986); 

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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1422:1: ruleConj returns [EObject current=null] : ( ( (lv_relat_0_0= ruleRelat ) ) (otherlv_1= '&&' ( (lv_relat_2_0= ruleRelat ) ) )* ) ;
    public final EObject ruleConj() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_relat_0_0 = null;

        EObject lv_relat_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1425:28: ( ( ( (lv_relat_0_0= ruleRelat ) ) (otherlv_1= '&&' ( (lv_relat_2_0= ruleRelat ) ) )* ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1426:1: ( ( (lv_relat_0_0= ruleRelat ) ) (otherlv_1= '&&' ( (lv_relat_2_0= ruleRelat ) ) )* )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1426:1: ( ( (lv_relat_0_0= ruleRelat ) ) (otherlv_1= '&&' ( (lv_relat_2_0= ruleRelat ) ) )* )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1426:2: ( (lv_relat_0_0= ruleRelat ) ) (otherlv_1= '&&' ( (lv_relat_2_0= ruleRelat ) ) )*
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1426:2: ( (lv_relat_0_0= ruleRelat ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1427:1: (lv_relat_0_0= ruleRelat )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1427:1: (lv_relat_0_0= ruleRelat )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1428:3: lv_relat_0_0= ruleRelat
            {
             
            	        newCompositeNode(grammarAccess.getConjAccess().getRelatRelatParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleRelat_in_ruleConj3032);
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

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1444:2: (otherlv_1= '&&' ( (lv_relat_2_0= ruleRelat ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==36) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1444:4: otherlv_1= '&&' ( (lv_relat_2_0= ruleRelat ) )
            	    {
            	    otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleConj3045); 

            	        	newLeafNode(otherlv_1, grammarAccess.getConjAccess().getAmpersandAmpersandKeyword_1_0());
            	        
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1448:1: ( (lv_relat_2_0= ruleRelat ) )
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1449:1: (lv_relat_2_0= ruleRelat )
            	    {
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1449:1: (lv_relat_2_0= ruleRelat )
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1450:3: lv_relat_2_0= ruleRelat
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConjAccess().getRelatRelatParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRelat_in_ruleConj3066);
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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1474:1: entryRuleRelat returns [EObject current=null] : iv_ruleRelat= ruleRelat EOF ;
    public final EObject entryRuleRelat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelat = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1475:2: (iv_ruleRelat= ruleRelat EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1476:2: iv_ruleRelat= ruleRelat EOF
            {
             newCompositeNode(grammarAccess.getRelatRule()); 
            pushFollow(FOLLOW_ruleRelat_in_entryRuleRelat3104);
            iv_ruleRelat=ruleRelat();

            state._fsp--;

             current =iv_ruleRelat; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelat3114); 

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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1483:1: ruleRelat returns [EObject current=null] : ( ( (lv_add_0_0= ruleAdd ) ) ( (otherlv_1= '==' | otherlv_2= '<' | otherlv_3= '<=' ) ( (lv_add_4_0= ruleAdd ) ) )* ) ;
    public final EObject ruleRelat() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_add_0_0 = null;

        EObject lv_add_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1486:28: ( ( ( (lv_add_0_0= ruleAdd ) ) ( (otherlv_1= '==' | otherlv_2= '<' | otherlv_3= '<=' ) ( (lv_add_4_0= ruleAdd ) ) )* ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1487:1: ( ( (lv_add_0_0= ruleAdd ) ) ( (otherlv_1= '==' | otherlv_2= '<' | otherlv_3= '<=' ) ( (lv_add_4_0= ruleAdd ) ) )* )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1487:1: ( ( (lv_add_0_0= ruleAdd ) ) ( (otherlv_1= '==' | otherlv_2= '<' | otherlv_3= '<=' ) ( (lv_add_4_0= ruleAdd ) ) )* )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1487:2: ( (lv_add_0_0= ruleAdd ) ) ( (otherlv_1= '==' | otherlv_2= '<' | otherlv_3= '<=' ) ( (lv_add_4_0= ruleAdd ) ) )*
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1487:2: ( (lv_add_0_0= ruleAdd ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1488:1: (lv_add_0_0= ruleAdd )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1488:1: (lv_add_0_0= ruleAdd )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1489:3: lv_add_0_0= ruleAdd
            {
             
            	        newCompositeNode(grammarAccess.getRelatAccess().getAddAddParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAdd_in_ruleRelat3160);
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

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1505:2: ( (otherlv_1= '==' | otherlv_2= '<' | otherlv_3= '<=' ) ( (lv_add_4_0= ruleAdd ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=37 && LA18_0<=39)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1505:3: (otherlv_1= '==' | otherlv_2= '<' | otherlv_3= '<=' ) ( (lv_add_4_0= ruleAdd ) )
            	    {
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1505:3: (otherlv_1= '==' | otherlv_2= '<' | otherlv_3= '<=' )
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
            	            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1505:5: otherlv_1= '=='
            	            {
            	            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleRelat3174); 

            	                	newLeafNode(otherlv_1, grammarAccess.getRelatAccess().getEqualsSignEqualsSignKeyword_1_0_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1510:7: otherlv_2= '<'
            	            {
            	            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleRelat3192); 

            	                	newLeafNode(otherlv_2, grammarAccess.getRelatAccess().getLessThanSignKeyword_1_0_1());
            	                

            	            }
            	            break;
            	        case 3 :
            	            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1515:7: otherlv_3= '<='
            	            {
            	            otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleRelat3210); 

            	                	newLeafNode(otherlv_3, grammarAccess.getRelatAccess().getLessThanSignEqualsSignKeyword_1_0_2());
            	                

            	            }
            	            break;

            	    }

            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1519:2: ( (lv_add_4_0= ruleAdd ) )
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1520:1: (lv_add_4_0= ruleAdd )
            	    {
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1520:1: (lv_add_4_0= ruleAdd )
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1521:3: lv_add_4_0= ruleAdd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRelatAccess().getAddAddParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAdd_in_ruleRelat3232);
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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1545:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1546:2: (iv_ruleAdd= ruleAdd EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1547:2: iv_ruleAdd= ruleAdd EOF
            {
             newCompositeNode(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_ruleAdd_in_entryRuleAdd3270);
            iv_ruleAdd=ruleAdd();

            state._fsp--;

             current =iv_ruleAdd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdd3280); 

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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1554:1: ruleAdd returns [EObject current=null] : ( ( (lv_mult_0_0= ruleMult ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_mult_3_0= ruleMult ) ) )* ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_mult_0_0 = null;

        EObject lv_mult_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1557:28: ( ( ( (lv_mult_0_0= ruleMult ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_mult_3_0= ruleMult ) ) )* ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1558:1: ( ( (lv_mult_0_0= ruleMult ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_mult_3_0= ruleMult ) ) )* )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1558:1: ( ( (lv_mult_0_0= ruleMult ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_mult_3_0= ruleMult ) ) )* )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1558:2: ( (lv_mult_0_0= ruleMult ) ) ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_mult_3_0= ruleMult ) ) )*
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1558:2: ( (lv_mult_0_0= ruleMult ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1559:1: (lv_mult_0_0= ruleMult )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1559:1: (lv_mult_0_0= ruleMult )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1560:3: lv_mult_0_0= ruleMult
            {
             
            	        newCompositeNode(grammarAccess.getAddAccess().getMultMultParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleMult_in_ruleAdd3326);
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

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1576:2: ( (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_mult_3_0= ruleMult ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=40 && LA20_0<=41)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1576:3: (otherlv_1= '+' | otherlv_2= '-' ) ( (lv_mult_3_0= ruleMult ) )
            	    {
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1576:3: (otherlv_1= '+' | otherlv_2= '-' )
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
            	            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1576:5: otherlv_1= '+'
            	            {
            	            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleAdd3340); 

            	                	newLeafNode(otherlv_1, grammarAccess.getAddAccess().getPlusSignKeyword_1_0_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1581:7: otherlv_2= '-'
            	            {
            	            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleAdd3358); 

            	                	newLeafNode(otherlv_2, grammarAccess.getAddAccess().getHyphenMinusKeyword_1_0_1());
            	                

            	            }
            	            break;

            	    }

            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1585:2: ( (lv_mult_3_0= ruleMult ) )
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1586:1: (lv_mult_3_0= ruleMult )
            	    {
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1586:1: (lv_mult_3_0= ruleMult )
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1587:3: lv_mult_3_0= ruleMult
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAddAccess().getMultMultParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMult_in_ruleAdd3380);
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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1611:1: entryRuleMult returns [EObject current=null] : iv_ruleMult= ruleMult EOF ;
    public final EObject entryRuleMult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMult = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1612:2: (iv_ruleMult= ruleMult EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1613:2: iv_ruleMult= ruleMult EOF
            {
             newCompositeNode(grammarAccess.getMultRule()); 
            pushFollow(FOLLOW_ruleMult_in_entryRuleMult3418);
            iv_ruleMult=ruleMult();

            state._fsp--;

             current =iv_ruleMult; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMult3428); 

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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1620:1: ruleMult returns [EObject current=null] : ( ( (lv_unary_0_0= ruleUnary ) ) ( (otherlv_1= '*' | otherlv_2= '/' ) ( (lv_unary_3_0= ruleUnary ) ) )* ) ;
    public final EObject ruleMult() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_unary_0_0 = null;

        EObject lv_unary_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1623:28: ( ( ( (lv_unary_0_0= ruleUnary ) ) ( (otherlv_1= '*' | otherlv_2= '/' ) ( (lv_unary_3_0= ruleUnary ) ) )* ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1624:1: ( ( (lv_unary_0_0= ruleUnary ) ) ( (otherlv_1= '*' | otherlv_2= '/' ) ( (lv_unary_3_0= ruleUnary ) ) )* )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1624:1: ( ( (lv_unary_0_0= ruleUnary ) ) ( (otherlv_1= '*' | otherlv_2= '/' ) ( (lv_unary_3_0= ruleUnary ) ) )* )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1624:2: ( (lv_unary_0_0= ruleUnary ) ) ( (otherlv_1= '*' | otherlv_2= '/' ) ( (lv_unary_3_0= ruleUnary ) ) )*
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1624:2: ( (lv_unary_0_0= ruleUnary ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1625:1: (lv_unary_0_0= ruleUnary )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1625:1: (lv_unary_0_0= ruleUnary )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1626:3: lv_unary_0_0= ruleUnary
            {
             
            	        newCompositeNode(grammarAccess.getMultAccess().getUnaryUnaryParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleUnary_in_ruleMult3474);
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

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1642:2: ( (otherlv_1= '*' | otherlv_2= '/' ) ( (lv_unary_3_0= ruleUnary ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=42 && LA22_0<=43)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1642:3: (otherlv_1= '*' | otherlv_2= '/' ) ( (lv_unary_3_0= ruleUnary ) )
            	    {
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1642:3: (otherlv_1= '*' | otherlv_2= '/' )
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
            	            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1642:5: otherlv_1= '*'
            	            {
            	            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleMult3488); 

            	                	newLeafNode(otherlv_1, grammarAccess.getMultAccess().getAsteriskKeyword_1_0_0());
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1647:7: otherlv_2= '/'
            	            {
            	            otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleMult3506); 

            	                	newLeafNode(otherlv_2, grammarAccess.getMultAccess().getSolidusKeyword_1_0_1());
            	                

            	            }
            	            break;

            	    }

            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1651:2: ( (lv_unary_3_0= ruleUnary ) )
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1652:1: (lv_unary_3_0= ruleUnary )
            	    {
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1652:1: (lv_unary_3_0= ruleUnary )
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1653:3: lv_unary_3_0= ruleUnary
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultAccess().getUnaryUnaryParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnary_in_ruleMult3528);
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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1677:1: entryRuleUnary returns [EObject current=null] : iv_ruleUnary= ruleUnary EOF ;
    public final EObject entryRuleUnary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnary = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1678:2: (iv_ruleUnary= ruleUnary EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1679:2: iv_ruleUnary= ruleUnary EOF
            {
             newCompositeNode(grammarAccess.getUnaryRule()); 
            pushFollow(FOLLOW_ruleUnary_in_entryRuleUnary3566);
            iv_ruleUnary=ruleUnary();

            state._fsp--;

             current =iv_ruleUnary; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnary3576); 

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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1686:1: ruleUnary returns [EObject current=null] : ( (otherlv_0= '!' | otherlv_1= '-' )* ( (lv_atom_2_0= ruleAtom ) ) ) ;
    public final EObject ruleUnary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_atom_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1689:28: ( ( (otherlv_0= '!' | otherlv_1= '-' )* ( (lv_atom_2_0= ruleAtom ) ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1690:1: ( (otherlv_0= '!' | otherlv_1= '-' )* ( (lv_atom_2_0= ruleAtom ) ) )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1690:1: ( (otherlv_0= '!' | otherlv_1= '-' )* ( (lv_atom_2_0= ruleAtom ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1690:2: (otherlv_0= '!' | otherlv_1= '-' )* ( (lv_atom_2_0= ruleAtom ) )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1690:2: (otherlv_0= '!' | otherlv_1= '-' )*
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
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1690:4: otherlv_0= '!'
            	    {
            	    otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleUnary3614); 

            	        	newLeafNode(otherlv_0, grammarAccess.getUnaryAccess().getExclamationMarkKeyword_0_0());
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1695:7: otherlv_1= '-'
            	    {
            	    otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleUnary3632); 

            	        	newLeafNode(otherlv_1, grammarAccess.getUnaryAccess().getHyphenMinusKeyword_0_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1699:3: ( (lv_atom_2_0= ruleAtom ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1700:1: (lv_atom_2_0= ruleAtom )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1700:1: (lv_atom_2_0= ruleAtom )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1701:3: lv_atom_2_0= ruleAtom
            {
             
            	        newCompositeNode(grammarAccess.getUnaryAccess().getAtomAtomParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAtom_in_ruleUnary3655);
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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1725:1: entryRuleAtom returns [EObject current=null] : iv_ruleAtom= ruleAtom EOF ;
    public final EObject entryRuleAtom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtom = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1726:2: (iv_ruleAtom= ruleAtom EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1727:2: iv_ruleAtom= ruleAtom EOF
            {
             newCompositeNode(grammarAccess.getAtomRule()); 
            pushFollow(FOLLOW_ruleAtom_in_entryRuleAtom3691);
            iv_ruleAtom=ruleAtom();

            state._fsp--;

             current =iv_ruleAtom; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtom3701); 

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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1734:1: ruleAtom returns [EObject current=null] : ( ( (lv_value_0_0= RULE_INT ) ) | ( ( (lv_var1_1_0= ruleVar ) ) (otherlv_2= 'touches' ( (lv_var2_3_0= ruleVar ) ) )? ) | (otherlv_4= '(' ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= ')' ) ) ;
    public final EObject ruleAtom() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_var1_1_0 = null;

        EObject lv_var2_3_0 = null;

        EObject lv_expr_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1737:28: ( ( ( (lv_value_0_0= RULE_INT ) ) | ( ( (lv_var1_1_0= ruleVar ) ) (otherlv_2= 'touches' ( (lv_var2_3_0= ruleVar ) ) )? ) | (otherlv_4= '(' ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= ')' ) ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1738:1: ( ( (lv_value_0_0= RULE_INT ) ) | ( ( (lv_var1_1_0= ruleVar ) ) (otherlv_2= 'touches' ( (lv_var2_3_0= ruleVar ) ) )? ) | (otherlv_4= '(' ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= ')' ) )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1738:1: ( ( (lv_value_0_0= RULE_INT ) ) | ( ( (lv_var1_1_0= ruleVar ) ) (otherlv_2= 'touches' ( (lv_var2_3_0= ruleVar ) ) )? ) | (otherlv_4= '(' ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= ')' ) )
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
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1738:2: ( (lv_value_0_0= RULE_INT ) )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1738:2: ( (lv_value_0_0= RULE_INT ) )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1739:1: (lv_value_0_0= RULE_INT )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1739:1: (lv_value_0_0= RULE_INT )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1740:3: lv_value_0_0= RULE_INT
                    {
                    lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtom3743); 

                    			newLeafNode(lv_value_0_0, grammarAccess.getAtomAccess().getValueINTTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_0_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1757:6: ( ( (lv_var1_1_0= ruleVar ) ) (otherlv_2= 'touches' ( (lv_var2_3_0= ruleVar ) ) )? )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1757:6: ( ( (lv_var1_1_0= ruleVar ) ) (otherlv_2= 'touches' ( (lv_var2_3_0= ruleVar ) ) )? )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1757:7: ( (lv_var1_1_0= ruleVar ) ) (otherlv_2= 'touches' ( (lv_var2_3_0= ruleVar ) ) )?
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1757:7: ( (lv_var1_1_0= ruleVar ) )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1758:1: (lv_var1_1_0= ruleVar )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1758:1: (lv_var1_1_0= ruleVar )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1759:3: lv_var1_1_0= ruleVar
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomAccess().getVar1VarParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVar_in_ruleAtom3776);
                    lv_var1_1_0=ruleVar();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtomRule());
                    	        }
                           		set(
                           			current, 
                           			"var1",
                            		lv_var1_1_0, 
                            		"Var");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1775:2: (otherlv_2= 'touches' ( (lv_var2_3_0= ruleVar ) ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==45) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1775:4: otherlv_2= 'touches' ( (lv_var2_3_0= ruleVar ) )
                            {
                            otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleAtom3789); 

                                	newLeafNode(otherlv_2, grammarAccess.getAtomAccess().getTouchesKeyword_1_1_0());
                                
                            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1779:1: ( (lv_var2_3_0= ruleVar ) )
                            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1780:1: (lv_var2_3_0= ruleVar )
                            {
                            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1780:1: (lv_var2_3_0= ruleVar )
                            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1781:3: lv_var2_3_0= ruleVar
                            {
                             
                            	        newCompositeNode(grammarAccess.getAtomAccess().getVar2VarParserRuleCall_1_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleVar_in_ruleAtom3810);
                            lv_var2_3_0=ruleVar();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getAtomRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"var2",
                                    		lv_var2_3_0, 
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
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1798:6: (otherlv_4= '(' ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= ')' )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1798:6: (otherlv_4= '(' ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= ')' )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1798:8: otherlv_4= '(' ( (lv_expr_5_0= ruleExpr ) ) otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleAtom3832); 

                        	newLeafNode(otherlv_4, grammarAccess.getAtomAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1802:1: ( (lv_expr_5_0= ruleExpr ) )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1803:1: (lv_expr_5_0= ruleExpr )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1803:1: (lv_expr_5_0= ruleExpr )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1804:3: lv_expr_5_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getAtomAccess().getExprExprParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleAtom3853);
                    lv_expr_5_0=ruleExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAtomRule());
                    	        }
                           		set(
                           			current, 
                           			"expr",
                            		lv_expr_5_0, 
                            		"Expr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleAtom3865); 

                        	newLeafNode(otherlv_6, grammarAccess.getAtomAccess().getRightParenthesisKeyword_2_2());
                        

                    }


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
    // $ANTLR end "ruleAtom"


    // $ANTLR start "entryRuleVar"
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1832:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1833:2: (iv_ruleVar= ruleVar EOF )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1834:2: iv_ruleVar= ruleVar EOF
            {
             newCompositeNode(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_ruleVar_in_entryRuleVar3902);
            iv_ruleVar=ruleVar();

            state._fsp--;

             current =iv_ruleVar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar3912); 

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
    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1841:1: ruleVar returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '[' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ']' (otherlv_4= '.' ( (lv_subname_5_0= RULE_ID ) ) )? ) | (otherlv_6= '.' ( (lv_subname_7_0= RULE_ID ) ) ) )? ) ;
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
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1844:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '[' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ']' (otherlv_4= '.' ( (lv_subname_5_0= RULE_ID ) ) )? ) | (otherlv_6= '.' ( (lv_subname_7_0= RULE_ID ) ) ) )? ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1845:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '[' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ']' (otherlv_4= '.' ( (lv_subname_5_0= RULE_ID ) ) )? ) | (otherlv_6= '.' ( (lv_subname_7_0= RULE_ID ) ) ) )? )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1845:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '[' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ']' (otherlv_4= '.' ( (lv_subname_5_0= RULE_ID ) ) )? ) | (otherlv_6= '.' ( (lv_subname_7_0= RULE_ID ) ) ) )? )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1845:2: ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= '[' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ']' (otherlv_4= '.' ( (lv_subname_5_0= RULE_ID ) ) )? ) | (otherlv_6= '.' ( (lv_subname_7_0= RULE_ID ) ) ) )?
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1845:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1846:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1846:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1847:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVar3954); 

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

            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1863:2: ( (otherlv_1= '[' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ']' (otherlv_4= '.' ( (lv_subname_5_0= RULE_ID ) ) )? ) | (otherlv_6= '.' ( (lv_subname_7_0= RULE_ID ) ) ) )?
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==17) ) {
                alt27=1;
            }
            else if ( (LA27_0==46) ) {
                alt27=2;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1863:3: (otherlv_1= '[' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ']' (otherlv_4= '.' ( (lv_subname_5_0= RULE_ID ) ) )? )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1863:3: (otherlv_1= '[' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ']' (otherlv_4= '.' ( (lv_subname_5_0= RULE_ID ) ) )? )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1863:5: otherlv_1= '[' ( (lv_expr_2_0= ruleExpr ) ) otherlv_3= ']' (otherlv_4= '.' ( (lv_subname_5_0= RULE_ID ) ) )?
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleVar3973); 

                        	newLeafNode(otherlv_1, grammarAccess.getVarAccess().getLeftSquareBracketKeyword_1_0_0());
                        
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1867:1: ( (lv_expr_2_0= ruleExpr ) )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1868:1: (lv_expr_2_0= ruleExpr )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1868:1: (lv_expr_2_0= ruleExpr )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1869:3: lv_expr_2_0= ruleExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getVarAccess().getExprExprParserRuleCall_1_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExpr_in_ruleVar3994);
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

                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleVar4006); 

                        	newLeafNode(otherlv_3, grammarAccess.getVarAccess().getRightSquareBracketKeyword_1_0_2());
                        
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1889:1: (otherlv_4= '.' ( (lv_subname_5_0= RULE_ID ) ) )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==46) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1889:3: otherlv_4= '.' ( (lv_subname_5_0= RULE_ID ) )
                            {
                            otherlv_4=(Token)match(input,46,FOLLOW_46_in_ruleVar4019); 

                                	newLeafNode(otherlv_4, grammarAccess.getVarAccess().getFullStopKeyword_1_0_3_0());
                                
                            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1893:1: ( (lv_subname_5_0= RULE_ID ) )
                            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1894:1: (lv_subname_5_0= RULE_ID )
                            {
                            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1894:1: (lv_subname_5_0= RULE_ID )
                            // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1895:3: lv_subname_5_0= RULE_ID
                            {
                            lv_subname_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVar4036); 

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
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1912:6: (otherlv_6= '.' ( (lv_subname_7_0= RULE_ID ) ) )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1912:6: (otherlv_6= '.' ( (lv_subname_7_0= RULE_ID ) ) )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1912:8: otherlv_6= '.' ( (lv_subname_7_0= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_46_in_ruleVar4063); 

                        	newLeafNode(otherlv_6, grammarAccess.getVarAccess().getFullStopKeyword_1_1_0());
                        
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1916:1: ( (lv_subname_7_0= RULE_ID ) )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1917:1: (lv_subname_7_0= RULE_ID )
                    {
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1917:1: (lv_subname_7_0= RULE_ID )
                    // ../org.xtext.mgpl/src-gen/org/xtext/mgpl/parser/antlr/internal/InternalMgplDSL.g:1918:3: lv_subname_7_0= RULE_ID
                    {
                    lv_subname_7_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVar4080); 

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
    public static final BitSet FOLLOW_11_in_ruleModel122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleModel139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleModel156 = new BitSet(new long[]{0x0000000400002010L});
    public static final BitSet FOLLOW_ruleAttrList_in_ruleModel177 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleModel189 = new BitSet(new long[]{0x0000000020E08000L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleModel210 = new BitSet(new long[]{0x0000000020E08000L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_ruleModel232 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleModel253 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration290 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_ruleDeclaration347 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleObjDecl_in_ruleDeclaration374 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDeclaration387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_entryRuleVarDecl423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarDecl433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleVarDecl470 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVarDecl487 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_16_in_ruleVarDecl506 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleVarDecl527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleVarDecl548 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVarDecl565 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVarDecl582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjDecl_in_entryRuleObjDecl620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjDecl630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjType_in_ruleObjDecl676 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleObjDecl693 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_12_in_ruleObjDecl712 = new BitSet(new long[]{0x0000000400002010L});
    public static final BitSet FOLLOW_ruleAttrList_in_ruleObjDecl733 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleObjDecl745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleObjDecl765 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleObjDecl782 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleObjDecl799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnimBlock_in_ruleBlock894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventBlock_in_ruleBlock921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnimBlock_in_entryRuleAnimBlock956 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnimBlock966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAnimBlock1003 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnimBlock1020 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAnimBlock1037 = new BitSet(new long[]{0x0000000000E08000L});
    public static final BitSet FOLLOW_ruleObjType_in_ruleAnimBlock1058 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnimBlock1075 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAnimBlock1092 = new BitSet(new long[]{0x0000000020E08000L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_ruleAnimBlock1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventBlock_in_entryRuleEventBlock1149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventBlock1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleEventBlock1196 = new BitSet(new long[]{0x000000001F000000L});
    public static final BitSet FOLLOW_ruleKeystroke_in_ruleEventBlock1217 = new BitSet(new long[]{0x0000000020E08000L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_ruleEventBlock1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjType_in_entryRuleObjType1275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjType1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleObjType1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleObjType1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleObjType1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeystroke_in_entryRuleKeystroke1403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeystroke1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleKeystroke1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleKeystroke1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleKeystroke1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleKeystroke1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleKeystroke1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_entryRuleStatementBlock1568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatementBlock1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleStatementBlock1625 = new BitSet(new long[]{0x00000001C0000010L});
    public static final BitSet FOLLOW_ruleStmt_in_ruleStatementBlock1646 = new BitSet(new long[]{0x00000001C0000010L});
    public static final BitSet FOLLOW_30_in_ruleStatementBlock1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStmt_in_entryRuleStmt1696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStmt1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStmt_in_ruleStmt1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForStmt_in_ruleStmt1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssStmt_in_ruleStmt1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForStmt_in_entryRuleForStmt1842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForStmt1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleForStmt1889 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleForStmt1901 = new BitSet(new long[]{0x0000000180000010L});
    public static final BitSet FOLLOW_ruleAssStmt_in_ruleForStmt1922 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleForStmt1943 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleForStmt1955 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAssStmt2_in_ruleForStmt1976 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleForStmt1988 = new BitSet(new long[]{0x0000000020E08000L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_ruleForStmt2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStmt_in_entryRuleIfStmt2045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfStmt2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleIfStmt2092 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleIfStmt2104 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleIfStmt2125 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleIfStmt2137 = new BitSet(new long[]{0x0000000020E08000L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_ruleIfStmt2158 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleElseStmt_in_ruleIfStmt2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElseStmt_in_entryRuleElseStmt2216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElseStmt2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleElseStmt2263 = new BitSet(new long[]{0x0000000020E08000L});
    public static final BitSet FOLLOW_ruleStatementBlock_in_ruleElseStmt2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssStmt_in_entryRuleAssStmt2320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssStmt2330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_ruleAssStmt2376 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAssStmt2388 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAssStmt2409 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAssStmt2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssStmt2_in_entryRuleAssStmt22457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssStmt22467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_ruleAssStmt22513 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAssStmt22525 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAssStmt22546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrList_in_entryRuleAttrList2582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrList2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttrAss_in_ruleAttrList2648 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleAttrList2662 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttrAss_in_ruleAttrList2683 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleAttrAss_in_entryRuleAttrAss2722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttrAss2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttrAss2774 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAttrAss2791 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAttrAss2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr2848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConj_in_ruleExpr2904 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleExpr2917 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_ruleConj_in_ruleExpr2938 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleConj_in_entryRuleConj2976 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConj2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelat_in_ruleConj3032 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleConj3045 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_ruleRelat_in_ruleConj3066 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleRelat_in_entryRuleRelat3104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelat3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdd_in_ruleRelat3160 = new BitSet(new long[]{0x000000E000000002L});
    public static final BitSet FOLLOW_37_in_ruleRelat3174 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_38_in_ruleRelat3192 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_39_in_ruleRelat3210 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_ruleAdd_in_ruleRelat3232 = new BitSet(new long[]{0x000000E000000002L});
    public static final BitSet FOLLOW_ruleAdd_in_entryRuleAdd3270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdd3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMult_in_ruleAdd3326 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_40_in_ruleAdd3340 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_41_in_ruleAdd3358 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_ruleMult_in_ruleAdd3380 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_ruleMult_in_entryRuleMult3418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMult3428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnary_in_ruleMult3474 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_42_in_ruleMult3488 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_43_in_ruleMult3506 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_ruleUnary_in_ruleMult3528 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_ruleUnary_in_entryRuleUnary3566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnary3576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleUnary3614 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_41_in_ruleUnary3632 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_ruleAtom_in_ruleUnary3655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtom_in_entryRuleAtom3691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtom3701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtom3743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_ruleAtom3776 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45_in_ruleAtom3789 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleVar_in_ruleAtom3810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleAtom3832 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleAtom3853 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAtom3865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_entryRuleVar3902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar3912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVar3954 = new BitSet(new long[]{0x0000400000020002L});
    public static final BitSet FOLLOW_17_in_ruleVar3973 = new BitSet(new long[]{0x0000120000001030L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleVar3994 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleVar4006 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleVar4019 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVar4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleVar4063 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVar4080 = new BitSet(new long[]{0x0000000000000002L});

}