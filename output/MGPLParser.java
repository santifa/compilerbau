// $ANTLR 3.5.1 /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g 2013-12-14 21:32:14

package antlr.projekt1;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class MGPLParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ANIMATION", "ASSIGN", 
		"CBRACKET", "CCURBRA", "CIRCLE", "COMMA", "CPARAN", "DIGIT", "DIV", "DOT", 
		"DOWNARROW", "ELSE", "EQUALS", "FOR", "GAME", "IF", "INT", "LDF", "LEFTARROW", 
		"LEQ", "LESS", "LOWCASE", "MINUS", "MULT", "NOT", "NUMBER", "OBRACKET", 
		"OCURBRA", "ON", "OPARAN", "OR", "PLUS", "RECTANGLE", "RIGHTARROW", "SEMIKOL", 
		"SINGLE_COMMENT", "SPACE", "TOUCHES", "TRIANGLE", "UPARROW", "UPCASE", 
		"WS"
	};
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int ANIMATION=5;
	public static final int ASSIGN=6;
	public static final int CBRACKET=7;
	public static final int CCURBRA=8;
	public static final int CIRCLE=9;
	public static final int COMMA=10;
	public static final int CPARAN=11;
	public static final int DIGIT=12;
	public static final int DIV=13;
	public static final int DOT=14;
	public static final int DOWNARROW=15;
	public static final int ELSE=16;
	public static final int EQUALS=17;
	public static final int FOR=18;
	public static final int GAME=19;
	public static final int IF=20;
	public static final int INT=21;
	public static final int LDF=22;
	public static final int LEFTARROW=23;
	public static final int LEQ=24;
	public static final int LESS=25;
	public static final int LOWCASE=26;
	public static final int MINUS=27;
	public static final int MULT=28;
	public static final int NOT=29;
	public static final int NUMBER=30;
	public static final int OBRACKET=31;
	public static final int OCURBRA=32;
	public static final int ON=33;
	public static final int OPARAN=34;
	public static final int OR=35;
	public static final int PLUS=36;
	public static final int RECTANGLE=37;
	public static final int RIGHTARROW=38;
	public static final int SEMIKOL=39;
	public static final int SINGLE_COMMENT=40;
	public static final int SPACE=41;
	public static final int TOUCHES=42;
	public static final int TRIANGLE=43;
	public static final int UPARROW=44;
	public static final int UPCASE=45;
	public static final int WS=46;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "prog", "varDecl", "ifStmt", "assStmt2", "unary", "block", 
		"forStmt", "var", "objType", "keyStroke", "disjunkt", "assStmt", "atom", 
		"stmt", "op", "eventBlock", "objDecl", "stmtBlock", "decl", "konjunkt", 
		"mult", "relat", "animBlock", "init", "expr", "add", "attrAssList"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public MGPLParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public MGPLParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this,port,adaptor);
		setDebugListener(proxy);
		setTokenStream(new DebugTokenStream(input,proxy));
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);
		proxy.setTreeAdaptor(adap);
	}

	public MGPLParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg);
		 
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);

	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

		protected DebugTreeAdaptor adaptor;
		public void setTreeAdaptor(TreeAdaptor adaptor) {
			this.adaptor = new DebugTreeAdaptor(dbg,adaptor);
		}
		public TreeAdaptor getTreeAdaptor() {
			return adaptor;
		}
	@Override public String[] getTokenNames() { return MGPLParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/phrizzel/ponyshit/repo/compilerbau/MGPL.g"; }


	public static class prog_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "prog"
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:59:1: prog : GAME ^ LDF ^ OPARAN ! ( attrAssList )? CPARAN ! ( decl )* stmtBlock ( block )* ;
	public final MGPLParser.prog_return prog() throws RecognitionException {
		MGPLParser.prog_return retval = new MGPLParser.prog_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token GAME1=null;
		Token LDF2=null;
		Token OPARAN3=null;
		Token CPARAN5=null;
		ParserRuleReturnScope attrAssList4 =null;
		ParserRuleReturnScope decl6 =null;
		ParserRuleReturnScope stmtBlock7 =null;
		ParserRuleReturnScope block8 =null;

		CommonTree GAME1_tree=null;
		CommonTree LDF2_tree=null;
		CommonTree OPARAN3_tree=null;
		CommonTree CPARAN5_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "prog");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(59, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:59:13: ( GAME ^ LDF ^ OPARAN ! ( attrAssList )? CPARAN ! ( decl )* stmtBlock ( block )* )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:59:15: GAME ^ LDF ^ OPARAN ! ( attrAssList )? CPARAN ! ( decl )* stmtBlock ( block )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(59,19);
			GAME1=(Token)match(input,GAME,FOLLOW_GAME_in_prog795); 
			GAME1_tree = (CommonTree)adaptor.create(GAME1);
			root_0 = (CommonTree)adaptor.becomeRoot(GAME1_tree, root_0);
			dbg.location(59,24);
			LDF2=(Token)match(input,LDF,FOLLOW_LDF_in_prog798); 
			LDF2_tree = (CommonTree)adaptor.create(LDF2);
			root_0 = (CommonTree)adaptor.becomeRoot(LDF2_tree, root_0);
			dbg.location(59,32);
			OPARAN3=(Token)match(input,OPARAN,FOLLOW_OPARAN_in_prog801); dbg.location(59,34);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:59:34: ( attrAssList )?
			int alt1=2;
			try { dbg.enterSubRule(1);
			try { dbg.enterDecision(1, decisionCanBacktrack[1]);

			int LA1_0 = input.LA(1);
			if ( (LA1_0==LDF) ) {
				alt1=1;
			}
			} finally {dbg.exitDecision(1);}

			switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:59:34: attrAssList
					{
					dbg.location(59,34);
					pushFollow(FOLLOW_attrAssList_in_prog804);
					attrAssList4=attrAssList();
					state._fsp--;

					adaptor.addChild(root_0, attrAssList4.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(59,53);
			CPARAN5=(Token)match(input,CPARAN,FOLLOW_CPARAN_in_prog807); dbg.location(59,55);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:59:55: ( decl )*
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==CIRCLE||LA2_0==INT||LA2_0==RECTANGLE||LA2_0==TRIANGLE) ) {
					alt2=1;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:59:55: decl
					{
					dbg.location(59,55);
					pushFollow(FOLLOW_decl_in_prog810);
					decl6=decl();
					state._fsp--;

					adaptor.addChild(root_0, decl6.getTree());

					}
					break;

				default :
					break loop2;
				}
			}
			} finally {dbg.exitSubRule(2);}
			dbg.location(59,61);
			pushFollow(FOLLOW_stmtBlock_in_prog813);
			stmtBlock7=stmtBlock();
			state._fsp--;

			adaptor.addChild(root_0, stmtBlock7.getTree());
			dbg.location(59,71);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:59:71: ( block )*
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
				int alt3=2;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				int LA3_0 = input.LA(1);
				if ( (LA3_0==ANIMATION||LA3_0==ON) ) {
					alt3=1;
				}

				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:59:71: block
					{
					dbg.location(59,71);
					pushFollow(FOLLOW_block_in_prog815);
					block8=block();
					state._fsp--;

					adaptor.addChild(root_0, block8.getTree());

					}
					break;

				default :
					break loop3;
				}
			}
			} finally {dbg.exitSubRule(3);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(59, 76);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "prog");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "prog"


	public static class decl_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "decl"
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:60:1: decl : ( varDecl SEMIKOL !| objDecl SEMIKOL !);
	public final MGPLParser.decl_return decl() throws RecognitionException {
		MGPLParser.decl_return retval = new MGPLParser.decl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token SEMIKOL10=null;
		Token SEMIKOL12=null;
		ParserRuleReturnScope varDecl9 =null;
		ParserRuleReturnScope objDecl11 =null;

		CommonTree SEMIKOL10_tree=null;
		CommonTree SEMIKOL12_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "decl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(60, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:60:13: ( varDecl SEMIKOL !| objDecl SEMIKOL !)
			int alt4=2;
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==INT) ) {
				alt4=1;
			}
			else if ( (LA4_0==CIRCLE||LA4_0==RECTANGLE||LA4_0==TRIANGLE) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:60:15: varDecl SEMIKOL !
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(60,15);
					pushFollow(FOLLOW_varDecl_in_decl830);
					varDecl9=varDecl();
					state._fsp--;

					adaptor.addChild(root_0, varDecl9.getTree());
					dbg.location(60,30);
					SEMIKOL10=(Token)match(input,SEMIKOL,FOLLOW_SEMIKOL_in_decl832); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:60:34: objDecl SEMIKOL !
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(60,34);
					pushFollow(FOLLOW_objDecl_in_decl837);
					objDecl11=objDecl();
					state._fsp--;

					adaptor.addChild(root_0, objDecl11.getTree());
					dbg.location(60,49);
					SEMIKOL12=(Token)match(input,SEMIKOL,FOLLOW_SEMIKOL_in_decl839); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(60, 49);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "decl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "decl"


	public static class varDecl_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "varDecl"
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:61:1: varDecl : ( INT ^ LDF ( init )? | INT ^ LDF OBRACKET ! NUMBER CBRACKET !);
	public final MGPLParser.varDecl_return varDecl() throws RecognitionException {
		MGPLParser.varDecl_return retval = new MGPLParser.varDecl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token INT13=null;
		Token LDF14=null;
		Token INT16=null;
		Token LDF17=null;
		Token OBRACKET18=null;
		Token NUMBER19=null;
		Token CBRACKET20=null;
		ParserRuleReturnScope init15 =null;

		CommonTree INT13_tree=null;
		CommonTree LDF14_tree=null;
		CommonTree INT16_tree=null;
		CommonTree LDF17_tree=null;
		CommonTree OBRACKET18_tree=null;
		CommonTree NUMBER19_tree=null;
		CommonTree CBRACKET20_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "varDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(61, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:61:13: ( INT ^ LDF ( init )? | INT ^ LDF OBRACKET ! NUMBER CBRACKET !)
			int alt6=2;
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==INT) ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1==LDF) ) {
					int LA6_2 = input.LA(3);
					if ( (LA6_2==OBRACKET) ) {
						alt6=2;
					}
					else if ( (LA6_2==ASSIGN||LA6_2==SEMIKOL) ) {
						alt6=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 2, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:61:15: INT ^ LDF ( init )?
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(61,18);
					INT13=(Token)match(input,INT,FOLLOW_INT_in_varDecl851); 
					INT13_tree = (CommonTree)adaptor.create(INT13);
					root_0 = (CommonTree)adaptor.becomeRoot(INT13_tree, root_0);
					dbg.location(61,20);
					LDF14=(Token)match(input,LDF,FOLLOW_LDF_in_varDecl854); 
					LDF14_tree = (CommonTree)adaptor.create(LDF14);
					adaptor.addChild(root_0, LDF14_tree);
					dbg.location(61,24);
					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:61:24: ( init )?
					int alt5=2;
					try { dbg.enterSubRule(5);
					try { dbg.enterDecision(5, decisionCanBacktrack[5]);

					int LA5_0 = input.LA(1);
					if ( (LA5_0==ASSIGN) ) {
						alt5=1;
					}
					} finally {dbg.exitDecision(5);}

					switch (alt5) {
						case 1 :
							dbg.enterAlt(1);

							// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:61:24: init
							{
							dbg.location(61,24);
							pushFollow(FOLLOW_init_in_varDecl856);
							init15=init();
							state._fsp--;

							adaptor.addChild(root_0, init15.getTree());

							}
							break;

					}
					} finally {dbg.exitSubRule(5);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:61:33: INT ^ LDF OBRACKET ! NUMBER CBRACKET !
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(61,36);
					INT16=(Token)match(input,INT,FOLLOW_INT_in_varDecl862); 
					INT16_tree = (CommonTree)adaptor.create(INT16);
					root_0 = (CommonTree)adaptor.becomeRoot(INT16_tree, root_0);
					dbg.location(61,38);
					LDF17=(Token)match(input,LDF,FOLLOW_LDF_in_varDecl865); 
					LDF17_tree = (CommonTree)adaptor.create(LDF17);
					adaptor.addChild(root_0, LDF17_tree);
					dbg.location(61,50);
					OBRACKET18=(Token)match(input,OBRACKET,FOLLOW_OBRACKET_in_varDecl867); dbg.location(61,52);
					NUMBER19=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_varDecl870); 
					NUMBER19_tree = (CommonTree)adaptor.create(NUMBER19);
					adaptor.addChild(root_0, NUMBER19_tree);
					dbg.location(61,67);
					CBRACKET20=(Token)match(input,CBRACKET,FOLLOW_CBRACKET_in_varDecl872); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(61, 67);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "varDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "varDecl"


	public static class init_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "init"
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:62:1: init : ASSIGN ^ expr ;
	public final MGPLParser.init_return init() throws RecognitionException {
		MGPLParser.init_return retval = new MGPLParser.init_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ASSIGN21=null;
		ParserRuleReturnScope expr22 =null;

		CommonTree ASSIGN21_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "init");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(62, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:62:13: ( ASSIGN ^ expr )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:62:15: ASSIGN ^ expr
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(62,21);
			ASSIGN21=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_init887); 
			ASSIGN21_tree = (CommonTree)adaptor.create(ASSIGN21);
			root_0 = (CommonTree)adaptor.becomeRoot(ASSIGN21_tree, root_0);
			dbg.location(62,23);
			pushFollow(FOLLOW_expr_in_init890);
			expr22=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr22.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(62, 26);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "init");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "init"


	public static class objDecl_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "objDecl"
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:63:1: objDecl : ( objType LDF ^ OPARAN ! ( attrAssList )? CPARAN !| objType LDF ^ OBRACKET ! NUMBER CBRACKET !);
	public final MGPLParser.objDecl_return objDecl() throws RecognitionException {
		MGPLParser.objDecl_return retval = new MGPLParser.objDecl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LDF24=null;
		Token OPARAN25=null;
		Token CPARAN27=null;
		Token LDF29=null;
		Token OBRACKET30=null;
		Token NUMBER31=null;
		Token CBRACKET32=null;
		ParserRuleReturnScope objType23 =null;
		ParserRuleReturnScope attrAssList26 =null;
		ParserRuleReturnScope objType28 =null;

		CommonTree LDF24_tree=null;
		CommonTree OPARAN25_tree=null;
		CommonTree CPARAN27_tree=null;
		CommonTree LDF29_tree=null;
		CommonTree OBRACKET30_tree=null;
		CommonTree NUMBER31_tree=null;
		CommonTree CBRACKET32_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "objDecl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(63, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:63:13: ( objType LDF ^ OPARAN ! ( attrAssList )? CPARAN !| objType LDF ^ OBRACKET ! NUMBER CBRACKET !)
			int alt8=2;
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( (LA8_0==CIRCLE||LA8_0==RECTANGLE||LA8_0==TRIANGLE) ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1==LDF) ) {
					int LA8_2 = input.LA(3);
					if ( (LA8_2==OPARAN) ) {
						alt8=1;
					}
					else if ( (LA8_2==OBRACKET) ) {
						alt8=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 8, 2, input);
							dbg.recognitionException(nvae);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 1, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:63:15: objType LDF ^ OPARAN ! ( attrAssList )? CPARAN !
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(63,15);
					pushFollow(FOLLOW_objType_in_objDecl901);
					objType23=objType();
					state._fsp--;

					adaptor.addChild(root_0, objType23.getTree());
					dbg.location(63,26);
					LDF24=(Token)match(input,LDF,FOLLOW_LDF_in_objDecl903); 
					LDF24_tree = (CommonTree)adaptor.create(LDF24);
					root_0 = (CommonTree)adaptor.becomeRoot(LDF24_tree, root_0);
					dbg.location(63,34);
					OPARAN25=(Token)match(input,OPARAN,FOLLOW_OPARAN_in_objDecl906); dbg.location(63,36);
					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:63:36: ( attrAssList )?
					int alt7=2;
					try { dbg.enterSubRule(7);
					try { dbg.enterDecision(7, decisionCanBacktrack[7]);

					int LA7_0 = input.LA(1);
					if ( (LA7_0==LDF) ) {
						alt7=1;
					}
					} finally {dbg.exitDecision(7);}

					switch (alt7) {
						case 1 :
							dbg.enterAlt(1);

							// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:63:36: attrAssList
							{
							dbg.location(63,36);
							pushFollow(FOLLOW_attrAssList_in_objDecl909);
							attrAssList26=attrAssList();
							state._fsp--;

							adaptor.addChild(root_0, attrAssList26.getTree());

							}
							break;

					}
					} finally {dbg.exitSubRule(7);}
					dbg.location(63,55);
					CPARAN27=(Token)match(input,CPARAN,FOLLOW_CPARAN_in_objDecl912); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:63:59: objType LDF ^ OBRACKET ! NUMBER CBRACKET !
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(63,59);
					pushFollow(FOLLOW_objType_in_objDecl917);
					objType28=objType();
					state._fsp--;

					adaptor.addChild(root_0, objType28.getTree());
					dbg.location(63,70);
					LDF29=(Token)match(input,LDF,FOLLOW_LDF_in_objDecl919); 
					LDF29_tree = (CommonTree)adaptor.create(LDF29);
					root_0 = (CommonTree)adaptor.becomeRoot(LDF29_tree, root_0);
					dbg.location(63,80);
					OBRACKET30=(Token)match(input,OBRACKET,FOLLOW_OBRACKET_in_objDecl922); dbg.location(63,82);
					NUMBER31=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_objDecl925); 
					NUMBER31_tree = (CommonTree)adaptor.create(NUMBER31);
					adaptor.addChild(root_0, NUMBER31_tree);
					dbg.location(63,97);
					CBRACKET32=(Token)match(input,CBRACKET,FOLLOW_CBRACKET_in_objDecl927); 
					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(63, 97);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "objDecl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "objDecl"


	public static class objType_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "objType"
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:64:1: objType : ( RECTANGLE | TRIANGLE | CIRCLE );
	public final MGPLParser.objType_return objType() throws RecognitionException {
		MGPLParser.objType_return retval = new MGPLParser.objType_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set33=null;

		CommonTree set33_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "objType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(64, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:64:13: ( RECTANGLE | TRIANGLE | CIRCLE )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(64,13);
			set33=input.LT(1);
			if ( input.LA(1)==CIRCLE||input.LA(1)==RECTANGLE||input.LA(1)==TRIANGLE ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set33));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(64, 43);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "objType");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "objType"


	public static class attrAssList_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "attrAssList"
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:65:1: attrAssList : LDF ASSIGN ^ expr ( COMMA ! attrAssList )* ;
	public final MGPLParser.attrAssList_return attrAssList() throws RecognitionException {
		MGPLParser.attrAssList_return retval = new MGPLParser.attrAssList_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LDF34=null;
		Token ASSIGN35=null;
		Token COMMA37=null;
		ParserRuleReturnScope expr36 =null;
		ParserRuleReturnScope attrAssList38 =null;

		CommonTree LDF34_tree=null;
		CommonTree ASSIGN35_tree=null;
		CommonTree COMMA37_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "attrAssList");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(65, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:65:13: ( LDF ASSIGN ^ expr ( COMMA ! attrAssList )* )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:65:15: LDF ASSIGN ^ expr ( COMMA ! attrAssList )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(65,15);
			LDF34=(Token)match(input,LDF,FOLLOW_LDF_in_attrAssList954); 
			LDF34_tree = (CommonTree)adaptor.create(LDF34);
			adaptor.addChild(root_0, LDF34_tree);
			dbg.location(65,25);
			ASSIGN35=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_attrAssList956); 
			ASSIGN35_tree = (CommonTree)adaptor.create(ASSIGN35);
			root_0 = (CommonTree)adaptor.becomeRoot(ASSIGN35_tree, root_0);
			dbg.location(65,27);
			pushFollow(FOLLOW_expr_in_attrAssList959);
			expr36=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr36.getTree());
			dbg.location(65,32);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:65:32: ( COMMA ! attrAssList )*
			try { dbg.enterSubRule(9);

			loop9:
			while (true) {
				int alt9=2;
				try { dbg.enterDecision(9, decisionCanBacktrack[9]);

				int LA9_0 = input.LA(1);
				if ( (LA9_0==COMMA) ) {
					alt9=1;
				}

				} finally {dbg.exitDecision(9);}

				switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:65:33: COMMA ! attrAssList
					{
					dbg.location(65,38);
					COMMA37=(Token)match(input,COMMA,FOLLOW_COMMA_in_attrAssList962); dbg.location(65,40);
					pushFollow(FOLLOW_attrAssList_in_attrAssList965);
					attrAssList38=attrAssList();
					state._fsp--;

					adaptor.addChild(root_0, attrAssList38.getTree());

					}
					break;

				default :
					break loop9;
				}
			}
			} finally {dbg.exitSubRule(9);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(65, 52);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "attrAssList");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "attrAssList"


	public static class block_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "block"
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:67:1: block : ( animBlock | eventBlock );
	public final MGPLParser.block_return block() throws RecognitionException {
		MGPLParser.block_return retval = new MGPLParser.block_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope animBlock39 =null;
		ParserRuleReturnScope eventBlock40 =null;


		try { dbg.enterRule(getGrammarFileName(), "block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(67, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:67:13: ( animBlock | eventBlock )
			int alt10=2;
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			int LA10_0 = input.LA(1);
			if ( (LA10_0==ANIMATION) ) {
				alt10=1;
			}
			else if ( (LA10_0==ON) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:67:15: animBlock
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(67,15);
					pushFollow(FOLLOW_animBlock_in_block981);
					animBlock39=animBlock();
					state._fsp--;

					adaptor.addChild(root_0, animBlock39.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:67:27: eventBlock
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(67,27);
					pushFollow(FOLLOW_eventBlock_in_block985);
					eventBlock40=eventBlock();
					state._fsp--;

					adaptor.addChild(root_0, eventBlock40.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(67, 36);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "block");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "block"


	public static class animBlock_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "animBlock"
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:68:1: animBlock : ANIMATION ^ LDF OPARAN ! objType LDF CPARAN ! stmtBlock ;
	public final MGPLParser.animBlock_return animBlock() throws RecognitionException {
		MGPLParser.animBlock_return retval = new MGPLParser.animBlock_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ANIMATION41=null;
		Token LDF42=null;
		Token OPARAN43=null;
		Token LDF45=null;
		Token CPARAN46=null;
		ParserRuleReturnScope objType44 =null;
		ParserRuleReturnScope stmtBlock47 =null;

		CommonTree ANIMATION41_tree=null;
		CommonTree LDF42_tree=null;
		CommonTree OPARAN43_tree=null;
		CommonTree LDF45_tree=null;
		CommonTree CPARAN46_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "animBlock");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(68, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:68:13: ( ANIMATION ^ LDF OPARAN ! objType LDF CPARAN ! stmtBlock )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:68:15: ANIMATION ^ LDF OPARAN ! objType LDF CPARAN ! stmtBlock
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(68,24);
			ANIMATION41=(Token)match(input,ANIMATION,FOLLOW_ANIMATION_in_animBlock994); 
			ANIMATION41_tree = (CommonTree)adaptor.create(ANIMATION41);
			root_0 = (CommonTree)adaptor.becomeRoot(ANIMATION41_tree, root_0);
			dbg.location(68,26);
			LDF42=(Token)match(input,LDF,FOLLOW_LDF_in_animBlock997); 
			LDF42_tree = (CommonTree)adaptor.create(LDF42);
			adaptor.addChild(root_0, LDF42_tree);
			dbg.location(68,36);
			OPARAN43=(Token)match(input,OPARAN,FOLLOW_OPARAN_in_animBlock999); dbg.location(68,38);
			pushFollow(FOLLOW_objType_in_animBlock1002);
			objType44=objType();
			state._fsp--;

			adaptor.addChild(root_0, objType44.getTree());
			dbg.location(68,46);
			LDF45=(Token)match(input,LDF,FOLLOW_LDF_in_animBlock1004); 
			LDF45_tree = (CommonTree)adaptor.create(LDF45);
			adaptor.addChild(root_0, LDF45_tree);
			dbg.location(68,56);
			CPARAN46=(Token)match(input,CPARAN,FOLLOW_CPARAN_in_animBlock1006); dbg.location(68,58);
			pushFollow(FOLLOW_stmtBlock_in_animBlock1009);
			stmtBlock47=stmtBlock();
			state._fsp--;

			adaptor.addChild(root_0, stmtBlock47.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(68, 66);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "animBlock");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "animBlock"


	public static class eventBlock_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "eventBlock"
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:69:1: eventBlock : ON ^ keyStroke stmtBlock ;
	public final MGPLParser.eventBlock_return eventBlock() throws RecognitionException {
		MGPLParser.eventBlock_return retval = new MGPLParser.eventBlock_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ON48=null;
		ParserRuleReturnScope keyStroke49 =null;
		ParserRuleReturnScope stmtBlock50 =null;

		CommonTree ON48_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "eventBlock");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(69, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:69:13: ( ON ^ keyStroke stmtBlock )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:69:15: ON ^ keyStroke stmtBlock
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(69,17);
			ON48=(Token)match(input,ON,FOLLOW_ON_in_eventBlock1017); 
			ON48_tree = (CommonTree)adaptor.create(ON48);
			root_0 = (CommonTree)adaptor.becomeRoot(ON48_tree, root_0);
			dbg.location(69,19);
			pushFollow(FOLLOW_keyStroke_in_eventBlock1020);
			keyStroke49=keyStroke();
			state._fsp--;

			adaptor.addChild(root_0, keyStroke49.getTree());
			dbg.location(69,29);
			pushFollow(FOLLOW_stmtBlock_in_eventBlock1022);
			stmtBlock50=stmtBlock();
			state._fsp--;

			adaptor.addChild(root_0, stmtBlock50.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(69, 37);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "eventBlock");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "eventBlock"


	public static class keyStroke_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "keyStroke"
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:70:1: keyStroke : ( SPACE | LEFTARROW | RIGHTARROW | UPARROW | DOWNARROW );
	public final MGPLParser.keyStroke_return keyStroke() throws RecognitionException {
		MGPLParser.keyStroke_return retval = new MGPLParser.keyStroke_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set51=null;

		CommonTree set51_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "keyStroke");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(70, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:70:13: ( SPACE | LEFTARROW | RIGHTARROW | UPARROW | DOWNARROW )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(70,13);
			set51=input.LT(1);
			if ( input.LA(1)==DOWNARROW||input.LA(1)==LEFTARROW||input.LA(1)==RIGHTARROW||input.LA(1)==SPACE||input.LA(1)==UPARROW ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set51));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				dbg.recognitionException(mse);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(70, 66);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "keyStroke");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "keyStroke"


	public static class stmtBlock_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "stmtBlock"
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:71:1: stmtBlock : OCURBRA ! ( stmt )* CCURBRA !;
	public final MGPLParser.stmtBlock_return stmtBlock() throws RecognitionException {
		MGPLParser.stmtBlock_return retval = new MGPLParser.stmtBlock_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token OCURBRA52=null;
		Token CCURBRA54=null;
		ParserRuleReturnScope stmt53 =null;

		CommonTree OCURBRA52_tree=null;
		CommonTree CCURBRA54_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "stmtBlock");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(71, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:71:13: ( OCURBRA ! ( stmt )* CCURBRA !)
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:71:15: OCURBRA ! ( stmt )* CCURBRA !
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(71,22);
			OCURBRA52=(Token)match(input,OCURBRA,FOLLOW_OCURBRA_in_stmtBlock1056); dbg.location(71,24);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:71:24: ( stmt )*
			try { dbg.enterSubRule(11);

			loop11:
			while (true) {
				int alt11=2;
				try { dbg.enterDecision(11, decisionCanBacktrack[11]);

				int LA11_0 = input.LA(1);
				if ( (LA11_0==FOR||LA11_0==IF||LA11_0==LDF) ) {
					alt11=1;
				}

				} finally {dbg.exitDecision(11);}

				switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:71:24: stmt
					{
					dbg.location(71,24);
					pushFollow(FOLLOW_stmt_in_stmtBlock1059);
					stmt53=stmt();
					state._fsp--;

					adaptor.addChild(root_0, stmt53.getTree());

					}
					break;

				default :
					break loop11;
				}
			}
			} finally {dbg.exitSubRule(11);}
			dbg.location(71,37);
			CCURBRA54=(Token)match(input,CCURBRA,FOLLOW_CCURBRA_in_stmtBlock1062); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(71, 37);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "stmtBlock");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "stmtBlock"


	public static class stmt_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "stmt"
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:72:1: stmt : ( ifStmt | forStmt | assStmt );
	public final MGPLParser.stmt_return stmt() throws RecognitionException {
		MGPLParser.stmt_return retval = new MGPLParser.stmt_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope ifStmt55 =null;
		ParserRuleReturnScope forStmt56 =null;
		ParserRuleReturnScope assStmt57 =null;


		try { dbg.enterRule(getGrammarFileName(), "stmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(72, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:72:13: ( ifStmt | forStmt | assStmt )
			int alt12=3;
			try { dbg.enterDecision(12, decisionCanBacktrack[12]);

			switch ( input.LA(1) ) {
			case IF:
				{
				alt12=1;
				}
				break;
			case FOR:
				{
				alt12=2;
				}
				break;
			case LDF:
				{
				alt12=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(12);}

			switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:72:15: ifStmt
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(72,15);
					pushFollow(FOLLOW_ifStmt_in_stmt1077);
					ifStmt55=ifStmt();
					state._fsp--;

					adaptor.addChild(root_0, ifStmt55.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:72:24: forStmt
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(72,24);
					pushFollow(FOLLOW_forStmt_in_stmt1081);
					forStmt56=forStmt();
					state._fsp--;

					adaptor.addChild(root_0, forStmt56.getTree());

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:72:34: assStmt
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(72,34);
					pushFollow(FOLLOW_assStmt_in_stmt1085);
					assStmt57=assStmt();
					state._fsp--;

					adaptor.addChild(root_0, assStmt57.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(72, 40);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "stmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "stmt"


	public static class ifStmt_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ifStmt"
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:73:1: ifStmt : IF ^ OPARAN ! expr CPARAN ! stmtBlock ( ELSE ^ stmtBlock )? ;
	public final MGPLParser.ifStmt_return ifStmt() throws RecognitionException {
		MGPLParser.ifStmt_return retval = new MGPLParser.ifStmt_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IF58=null;
		Token OPARAN59=null;
		Token CPARAN61=null;
		Token ELSE63=null;
		ParserRuleReturnScope expr60 =null;
		ParserRuleReturnScope stmtBlock62 =null;
		ParserRuleReturnScope stmtBlock64 =null;

		CommonTree IF58_tree=null;
		CommonTree OPARAN59_tree=null;
		CommonTree CPARAN61_tree=null;
		CommonTree ELSE63_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "ifStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(73, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:73:13: ( IF ^ OPARAN ! expr CPARAN ! stmtBlock ( ELSE ^ stmtBlock )? )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:73:15: IF ^ OPARAN ! expr CPARAN ! stmtBlock ( ELSE ^ stmtBlock )?
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(73,17);
			IF58=(Token)match(input,IF,FOLLOW_IF_in_ifStmt1097); 
			IF58_tree = (CommonTree)adaptor.create(IF58);
			root_0 = (CommonTree)adaptor.becomeRoot(IF58_tree, root_0);
			dbg.location(73,25);
			OPARAN59=(Token)match(input,OPARAN,FOLLOW_OPARAN_in_ifStmt1100); dbg.location(73,27);
			pushFollow(FOLLOW_expr_in_ifStmt1103);
			expr60=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr60.getTree());
			dbg.location(73,38);
			CPARAN61=(Token)match(input,CPARAN,FOLLOW_CPARAN_in_ifStmt1105); dbg.location(73,40);
			pushFollow(FOLLOW_stmtBlock_in_ifStmt1108);
			stmtBlock62=stmtBlock();
			state._fsp--;

			adaptor.addChild(root_0, stmtBlock62.getTree());
			dbg.location(73,50);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:73:50: ( ELSE ^ stmtBlock )?
			int alt13=2;
			try { dbg.enterSubRule(13);
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

			int LA13_0 = input.LA(1);
			if ( (LA13_0==ELSE) ) {
				alt13=1;
			}
			} finally {dbg.exitDecision(13);}

			switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:73:52: ELSE ^ stmtBlock
					{
					dbg.location(73,56);
					ELSE63=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStmt1112); 
					ELSE63_tree = (CommonTree)adaptor.create(ELSE63);
					root_0 = (CommonTree)adaptor.becomeRoot(ELSE63_tree, root_0);
					dbg.location(73,58);
					pushFollow(FOLLOW_stmtBlock_in_ifStmt1115);
					stmtBlock64=stmtBlock();
					state._fsp--;

					adaptor.addChild(root_0, stmtBlock64.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(13);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(73, 69);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "ifStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "ifStmt"


	public static class forStmt_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "forStmt"
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:74:1: forStmt : FOR ^ OPARAN ! assStmt2 SEMIKOL ! expr SEMIKOL ! assStmt2 CPARAN ! stmtBlock ;
	public final MGPLParser.forStmt_return forStmt() throws RecognitionException {
		MGPLParser.forStmt_return retval = new MGPLParser.forStmt_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token FOR65=null;
		Token OPARAN66=null;
		Token SEMIKOL68=null;
		Token SEMIKOL70=null;
		Token CPARAN72=null;
		ParserRuleReturnScope assStmt267 =null;
		ParserRuleReturnScope expr69 =null;
		ParserRuleReturnScope assStmt271 =null;
		ParserRuleReturnScope stmtBlock73 =null;

		CommonTree FOR65_tree=null;
		CommonTree OPARAN66_tree=null;
		CommonTree SEMIKOL68_tree=null;
		CommonTree SEMIKOL70_tree=null;
		CommonTree CPARAN72_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "forStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(74, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:74:13: ( FOR ^ OPARAN ! assStmt2 SEMIKOL ! expr SEMIKOL ! assStmt2 CPARAN ! stmtBlock )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:74:15: FOR ^ OPARAN ! assStmt2 SEMIKOL ! expr SEMIKOL ! assStmt2 CPARAN ! stmtBlock
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(74,18);
			FOR65=(Token)match(input,FOR,FOLLOW_FOR_in_forStmt1129); 
			FOR65_tree = (CommonTree)adaptor.create(FOR65);
			root_0 = (CommonTree)adaptor.becomeRoot(FOR65_tree, root_0);
			dbg.location(74,26);
			OPARAN66=(Token)match(input,OPARAN,FOLLOW_OPARAN_in_forStmt1132); dbg.location(74,28);
			pushFollow(FOLLOW_assStmt2_in_forStmt1135);
			assStmt267=assStmt2();
			state._fsp--;

			adaptor.addChild(root_0, assStmt267.getTree());
			dbg.location(74,44);
			SEMIKOL68=(Token)match(input,SEMIKOL,FOLLOW_SEMIKOL_in_forStmt1137); dbg.location(74,46);
			pushFollow(FOLLOW_expr_in_forStmt1140);
			expr69=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr69.getTree());
			dbg.location(74,58);
			SEMIKOL70=(Token)match(input,SEMIKOL,FOLLOW_SEMIKOL_in_forStmt1142); dbg.location(74,60);
			pushFollow(FOLLOW_assStmt2_in_forStmt1145);
			assStmt271=assStmt2();
			state._fsp--;

			adaptor.addChild(root_0, assStmt271.getTree());
			dbg.location(74,75);
			CPARAN72=(Token)match(input,CPARAN,FOLLOW_CPARAN_in_forStmt1147); dbg.location(74,77);
			pushFollow(FOLLOW_stmtBlock_in_forStmt1150);
			stmtBlock73=stmtBlock();
			state._fsp--;

			adaptor.addChild(root_0, stmtBlock73.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(74, 85);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "forStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "forStmt"


	public static class assStmt2_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "assStmt2"
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:75:1: assStmt2 : var ASSIGN ^ expr ;
	public final MGPLParser.assStmt2_return assStmt2() throws RecognitionException {
		MGPLParser.assStmt2_return retval = new MGPLParser.assStmt2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ASSIGN75=null;
		ParserRuleReturnScope var74 =null;
		ParserRuleReturnScope expr76 =null;

		CommonTree ASSIGN75_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "assStmt2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(75, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:75:10: ( var ASSIGN ^ expr )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:75:12: var ASSIGN ^ expr
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(75,12);
			pushFollow(FOLLOW_var_in_assStmt21157);
			var74=var();
			state._fsp--;

			adaptor.addChild(root_0, var74.getTree());
			dbg.location(75,22);
			ASSIGN75=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assStmt21159); 
			ASSIGN75_tree = (CommonTree)adaptor.create(ASSIGN75);
			root_0 = (CommonTree)adaptor.becomeRoot(ASSIGN75_tree, root_0);
			dbg.location(75,24);
			pushFollow(FOLLOW_expr_in_assStmt21162);
			expr76=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr76.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(75, 28);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "assStmt2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "assStmt2"


	public static class assStmt_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "assStmt"
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:76:1: assStmt : var ASSIGN ^ expr SEMIKOL !;
	public final MGPLParser.assStmt_return assStmt() throws RecognitionException {
		MGPLParser.assStmt_return retval = new MGPLParser.assStmt_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ASSIGN78=null;
		Token SEMIKOL80=null;
		ParserRuleReturnScope var77 =null;
		ParserRuleReturnScope expr79 =null;

		CommonTree ASSIGN78_tree=null;
		CommonTree SEMIKOL80_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "assStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(76, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:76:13: ( var ASSIGN ^ expr SEMIKOL !)
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:76:15: var ASSIGN ^ expr SEMIKOL !
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(76,15);
			pushFollow(FOLLOW_var_in_assStmt1174);
			var77=var();
			state._fsp--;

			adaptor.addChild(root_0, var77.getTree());
			dbg.location(76,25);
			ASSIGN78=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assStmt1176); 
			ASSIGN78_tree = (CommonTree)adaptor.create(ASSIGN78);
			root_0 = (CommonTree)adaptor.becomeRoot(ASSIGN78_tree, root_0);
			dbg.location(76,27);
			pushFollow(FOLLOW_expr_in_assStmt1179);
			expr79=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr79.getTree());
			dbg.location(76,39);
			SEMIKOL80=(Token)match(input,SEMIKOL,FOLLOW_SEMIKOL_in_assStmt1181); 
			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(76, 39);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "assStmt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "assStmt"


	public static class var_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "var"
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:77:1: var : LDF ^ ( OBRACKET ! expr CBRACKET ! ( DOT LDF )? | DOT LDF )? ;
	public final MGPLParser.var_return var() throws RecognitionException {
		MGPLParser.var_return retval = new MGPLParser.var_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LDF81=null;
		Token OBRACKET82=null;
		Token CBRACKET84=null;
		Token DOT85=null;
		Token LDF86=null;
		Token DOT87=null;
		Token LDF88=null;
		ParserRuleReturnScope expr83 =null;

		CommonTree LDF81_tree=null;
		CommonTree OBRACKET82_tree=null;
		CommonTree CBRACKET84_tree=null;
		CommonTree DOT85_tree=null;
		CommonTree LDF86_tree=null;
		CommonTree DOT87_tree=null;
		CommonTree LDF88_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "var");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(77, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:77:13: ( LDF ^ ( OBRACKET ! expr CBRACKET ! ( DOT LDF )? | DOT LDF )? )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:77:15: LDF ^ ( OBRACKET ! expr CBRACKET ! ( DOT LDF )? | DOT LDF )?
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(77,18);
			LDF81=(Token)match(input,LDF,FOLLOW_LDF_in_var1197); 
			LDF81_tree = (CommonTree)adaptor.create(LDF81);
			root_0 = (CommonTree)adaptor.becomeRoot(LDF81_tree, root_0);
			dbg.location(77,20);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:77:20: ( OBRACKET ! expr CBRACKET ! ( DOT LDF )? | DOT LDF )?
			int alt15=3;
			try { dbg.enterSubRule(15);
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

			int LA15_0 = input.LA(1);
			if ( (LA15_0==OBRACKET) ) {
				alt15=1;
			}
			else if ( (LA15_0==DOT) ) {
				alt15=2;
			}
			} finally {dbg.exitDecision(15);}

			switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:77:22: OBRACKET ! expr CBRACKET ! ( DOT LDF )?
					{
					dbg.location(77,30);
					OBRACKET82=(Token)match(input,OBRACKET,FOLLOW_OBRACKET_in_var1202); dbg.location(77,32);
					pushFollow(FOLLOW_expr_in_var1205);
					expr83=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr83.getTree());
					dbg.location(77,45);
					CBRACKET84=(Token)match(input,CBRACKET,FOLLOW_CBRACKET_in_var1207); dbg.location(77,47);
					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:77:47: ( DOT LDF )?
					int alt14=2;
					try { dbg.enterSubRule(14);
					try { dbg.enterDecision(14, decisionCanBacktrack[14]);

					int LA14_0 = input.LA(1);
					if ( (LA14_0==DOT) ) {
						alt14=1;
					}
					} finally {dbg.exitDecision(14);}

					switch (alt14) {
						case 1 :
							dbg.enterAlt(1);

							// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:77:49: DOT LDF
							{
							dbg.location(77,49);
							DOT85=(Token)match(input,DOT,FOLLOW_DOT_in_var1212); 
							DOT85_tree = (CommonTree)adaptor.create(DOT85);
							adaptor.addChild(root_0, DOT85_tree);
							dbg.location(77,53);
							LDF86=(Token)match(input,LDF,FOLLOW_LDF_in_var1214); 
							LDF86_tree = (CommonTree)adaptor.create(LDF86);
							adaptor.addChild(root_0, LDF86_tree);

							}
							break;

					}
					} finally {dbg.exitSubRule(14);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:77:62: DOT LDF
					{
					dbg.location(77,62);
					DOT87=(Token)match(input,DOT,FOLLOW_DOT_in_var1221); 
					DOT87_tree = (CommonTree)adaptor.create(DOT87);
					adaptor.addChild(root_0, DOT87_tree);
					dbg.location(77,66);
					LDF88=(Token)match(input,LDF,FOLLOW_LDF_in_var1223); 
					LDF88_tree = (CommonTree)adaptor.create(LDF88);
					adaptor.addChild(root_0, LDF88_tree);

					}
					break;

			}
			} finally {dbg.exitSubRule(15);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(77, 70);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "var");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "var"


	public static class expr_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "expr"
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:80:1: expr : ( OPARAN ! expr CPARAN !| ( op expr )* );
	public final MGPLParser.expr_return expr() throws RecognitionException {
		MGPLParser.expr_return retval = new MGPLParser.expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token OPARAN89=null;
		Token CPARAN91=null;
		ParserRuleReturnScope expr90 =null;
		ParserRuleReturnScope op92 =null;
		ParserRuleReturnScope expr93 =null;

		CommonTree OPARAN89_tree=null;
		CommonTree CPARAN91_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(80, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:80:7: ( OPARAN ! expr CPARAN !| ( op expr )* )
			int alt17=2;
			try { dbg.enterDecision(17, decisionCanBacktrack[17]);

			int LA17_0 = input.LA(1);
			if ( (LA17_0==OPARAN) ) {
				alt17=1;
			}
			else if ( (LA17_0==CBRACKET||(LA17_0 >= COMMA && LA17_0 <= CPARAN)||LA17_0==LDF||LA17_0==MINUS||(LA17_0 >= NOT && LA17_0 <= NUMBER)||LA17_0==SEMIKOL) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(17);}

			switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:80:9: OPARAN ! expr CPARAN !
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(80,15);
					OPARAN89=(Token)match(input,OPARAN,FOLLOW_OPARAN_in_expr1235); dbg.location(80,17);
					pushFollow(FOLLOW_expr_in_expr1238);
					expr90=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr90.getTree());
					dbg.location(80,28);
					CPARAN91=(Token)match(input,CPARAN,FOLLOW_CPARAN_in_expr1240); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:80:32: ( op expr )*
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(80,32);
					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:80:32: ( op expr )*
					try { dbg.enterSubRule(16);

					loop16:
					while (true) {
						int alt16=2;
						try { dbg.enterDecision(16, decisionCanBacktrack[16]);

						switch ( input.LA(1) ) {
						case NOT:
							{
							alt16=1;
							}
							break;
						case NUMBER:
							{
							alt16=1;
							}
							break;
						case LDF:
							{
							alt16=1;
							}
							break;
						case MINUS:
							{
							alt16=1;
							}
							break;
						}
						} finally {dbg.exitDecision(16);}

						switch (alt16) {
						case 1 :
							dbg.enterAlt(1);

							// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:80:33: op expr
							{
							dbg.location(80,33);
							pushFollow(FOLLOW_op_in_expr1246);
							op92=op();
							state._fsp--;

							adaptor.addChild(root_0, op92.getTree());
							dbg.location(80,36);
							pushFollow(FOLLOW_expr_in_expr1248);
							expr93=expr();
							state._fsp--;

							adaptor.addChild(root_0, expr93.getTree());

							}
							break;

						default :
							break loop16;
						}
					}
					} finally {dbg.exitSubRule(16);}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(80, 42);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "expr"


	public static class op_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "op"
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:82:1: op : disjunkt ;
	public final MGPLParser.op_return op() throws RecognitionException {
		MGPLParser.op_return retval = new MGPLParser.op_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope disjunkt94 =null;


		try { dbg.enterRule(getGrammarFileName(), "op");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(82, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:82:4: ( disjunkt )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:82:7: disjunkt
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(82,7);
			pushFollow(FOLLOW_disjunkt_in_op1260);
			disjunkt94=disjunkt();
			state._fsp--;

			adaptor.addChild(root_0, disjunkt94.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(82, 14);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "op");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "op"


	public static class disjunkt_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "disjunkt"
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:83:1: disjunkt : konjunkt ( OR ^ konjunkt )* ;
	public final MGPLParser.disjunkt_return disjunkt() throws RecognitionException {
		MGPLParser.disjunkt_return retval = new MGPLParser.disjunkt_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token OR96=null;
		ParserRuleReturnScope konjunkt95 =null;
		ParserRuleReturnScope konjunkt97 =null;

		CommonTree OR96_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "disjunkt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(83, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:83:11: ( konjunkt ( OR ^ konjunkt )* )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:83:13: konjunkt ( OR ^ konjunkt )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(83,13);
			pushFollow(FOLLOW_konjunkt_in_disjunkt1268);
			konjunkt95=konjunkt();
			state._fsp--;

			adaptor.addChild(root_0, konjunkt95.getTree());
			dbg.location(83,22);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:83:22: ( OR ^ konjunkt )*
			try { dbg.enterSubRule(18);

			loop18:
			while (true) {
				int alt18=2;
				try { dbg.enterDecision(18, decisionCanBacktrack[18]);

				int LA18_0 = input.LA(1);
				if ( (LA18_0==OR) ) {
					alt18=1;
				}

				} finally {dbg.exitDecision(18);}

				switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:83:23: OR ^ konjunkt
					{
					dbg.location(83,25);
					OR96=(Token)match(input,OR,FOLLOW_OR_in_disjunkt1271); 
					OR96_tree = (CommonTree)adaptor.create(OR96);
					root_0 = (CommonTree)adaptor.becomeRoot(OR96_tree, root_0);
					dbg.location(83,27);
					pushFollow(FOLLOW_konjunkt_in_disjunkt1274);
					konjunkt97=konjunkt();
					state._fsp--;

					adaptor.addChild(root_0, konjunkt97.getTree());

					}
					break;

				default :
					break loop18;
				}
			}
			} finally {dbg.exitSubRule(18);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(83, 36);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "disjunkt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "disjunkt"


	public static class konjunkt_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "konjunkt"
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:84:1: konjunkt : relat ( AND ^ relat )* ;
	public final MGPLParser.konjunkt_return konjunkt() throws RecognitionException {
		MGPLParser.konjunkt_return retval = new MGPLParser.konjunkt_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token AND99=null;
		ParserRuleReturnScope relat98 =null;
		ParserRuleReturnScope relat100 =null;

		CommonTree AND99_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "konjunkt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(84, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:84:10: ( relat ( AND ^ relat )* )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:84:12: relat ( AND ^ relat )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(84,12);
			pushFollow(FOLLOW_relat_in_konjunkt1283);
			relat98=relat();
			state._fsp--;

			adaptor.addChild(root_0, relat98.getTree());
			dbg.location(84,18);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:84:18: ( AND ^ relat )*
			try { dbg.enterSubRule(19);

			loop19:
			while (true) {
				int alt19=2;
				try { dbg.enterDecision(19, decisionCanBacktrack[19]);

				int LA19_0 = input.LA(1);
				if ( (LA19_0==AND) ) {
					alt19=1;
				}

				} finally {dbg.exitDecision(19);}

				switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:84:19: AND ^ relat
					{
					dbg.location(84,22);
					AND99=(Token)match(input,AND,FOLLOW_AND_in_konjunkt1286); 
					AND99_tree = (CommonTree)adaptor.create(AND99);
					root_0 = (CommonTree)adaptor.becomeRoot(AND99_tree, root_0);
					dbg.location(84,24);
					pushFollow(FOLLOW_relat_in_konjunkt1289);
					relat100=relat();
					state._fsp--;

					adaptor.addChild(root_0, relat100.getTree());

					}
					break;

				default :
					break loop19;
				}
			}
			} finally {dbg.exitSubRule(19);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(84, 30);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "konjunkt");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "konjunkt"


	public static class relat_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "relat"
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:85:1: relat : add ( ( EQUALS | LESS | LEQ ) ^ add )* ;
	public final MGPLParser.relat_return relat() throws RecognitionException {
		MGPLParser.relat_return retval = new MGPLParser.relat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set102=null;
		ParserRuleReturnScope add101 =null;
		ParserRuleReturnScope add103 =null;

		CommonTree set102_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "relat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(85, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:85:7: ( add ( ( EQUALS | LESS | LEQ ) ^ add )* )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:85:9: add ( ( EQUALS | LESS | LEQ ) ^ add )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(85,9);
			pushFollow(FOLLOW_add_in_relat1298);
			add101=add();
			state._fsp--;

			adaptor.addChild(root_0, add101.getTree());
			dbg.location(85,13);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:85:13: ( ( EQUALS | LESS | LEQ ) ^ add )*
			try { dbg.enterSubRule(20);

			loop20:
			while (true) {
				int alt20=2;
				try { dbg.enterDecision(20, decisionCanBacktrack[20]);

				int LA20_0 = input.LA(1);
				if ( (LA20_0==EQUALS||(LA20_0 >= LEQ && LA20_0 <= LESS)) ) {
					alt20=1;
				}

				} finally {dbg.exitDecision(20);}

				switch (alt20) {
				case 1 :
					dbg.enterAlt(1);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:85:14: ( EQUALS | LESS | LEQ ) ^ add
					{
					dbg.location(85,35);
					set102=input.LT(1);
					set102=input.LT(1);
					if ( input.LA(1)==EQUALS||(input.LA(1) >= LEQ && input.LA(1) <= LESS) ) {
						input.consume();
						root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set102), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(85,37);
					pushFollow(FOLLOW_add_in_relat1314);
					add103=add();
					state._fsp--;

					adaptor.addChild(root_0, add103.getTree());

					}
					break;

				default :
					break loop20;
				}
			}
			} finally {dbg.exitSubRule(20);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(85, 41);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "relat");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "relat"


	public static class add_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "add"
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:86:1: add : mult ( ( PLUS | MINUS ) ^ mult )* ;
	public final MGPLParser.add_return add() throws RecognitionException {
		MGPLParser.add_return retval = new MGPLParser.add_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set105=null;
		ParserRuleReturnScope mult104 =null;
		ParserRuleReturnScope mult106 =null;

		CommonTree set105_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "add");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(86, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:86:5: ( mult ( ( PLUS | MINUS ) ^ mult )* )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:86:7: mult ( ( PLUS | MINUS ) ^ mult )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(86,7);
			pushFollow(FOLLOW_mult_in_add1323);
			mult104=mult();
			state._fsp--;

			adaptor.addChild(root_0, mult104.getTree());
			dbg.location(86,12);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:86:12: ( ( PLUS | MINUS ) ^ mult )*
			try { dbg.enterSubRule(21);

			loop21:
			while (true) {
				int alt21=2;
				try { dbg.enterDecision(21, decisionCanBacktrack[21]);

				int LA21_0 = input.LA(1);
				if ( (LA21_0==MINUS) ) {
					int LA21_2 = input.LA(2);
					if ( (LA21_2==NUMBER) ) {
						alt21=1;
					}
					else if ( (LA21_2==LDF||LA21_2==MINUS||LA21_2==NOT) ) {
						alt21=1;
					}

				}
				else if ( (LA21_0==PLUS) ) {
					alt21=1;
				}

				} finally {dbg.exitDecision(21);}

				switch (alt21) {
				case 1 :
					dbg.enterAlt(1);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:86:13: ( PLUS | MINUS ) ^ mult
					{
					dbg.location(86,27);
					set105=input.LT(1);
					set105=input.LT(1);
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
						input.consume();
						root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set105), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(86,29);
					pushFollow(FOLLOW_mult_in_add1335);
					mult106=mult();
					state._fsp--;

					adaptor.addChild(root_0, mult106.getTree());

					}
					break;

				default :
					break loop21;
				}
			}
			} finally {dbg.exitSubRule(21);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(86, 34);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "add");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "add"


	public static class mult_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "mult"
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:87:1: mult : unary ( ( MULT | DIV ) ^ unary )* ;
	public final MGPLParser.mult_return mult() throws RecognitionException {
		MGPLParser.mult_return retval = new MGPLParser.mult_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set108=null;
		ParserRuleReturnScope unary107 =null;
		ParserRuleReturnScope unary109 =null;

		CommonTree set108_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "mult");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(87, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:87:6: ( unary ( ( MULT | DIV ) ^ unary )* )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:87:8: unary ( ( MULT | DIV ) ^ unary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(87,8);
			pushFollow(FOLLOW_unary_in_mult1344);
			unary107=unary();
			state._fsp--;

			adaptor.addChild(root_0, unary107.getTree());
			dbg.location(87,14);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:87:14: ( ( MULT | DIV ) ^ unary )*
			try { dbg.enterSubRule(22);

			loop22:
			while (true) {
				int alt22=2;
				try { dbg.enterDecision(22, decisionCanBacktrack[22]);

				int LA22_0 = input.LA(1);
				if ( (LA22_0==DIV||LA22_0==MULT) ) {
					alt22=1;
				}

				} finally {dbg.exitDecision(22);}

				switch (alt22) {
				case 1 :
					dbg.enterAlt(1);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:87:15: ( MULT | DIV ) ^ unary
					{
					dbg.location(87,28);
					set108=input.LT(1);
					set108=input.LT(1);
					if ( input.LA(1)==DIV||input.LA(1)==MULT ) {
						input.consume();
						root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set108), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(87,30);
					pushFollow(FOLLOW_unary_in_mult1357);
					unary109=unary();
					state._fsp--;

					adaptor.addChild(root_0, unary109.getTree());

					}
					break;

				default :
					break loop22;
				}
			}
			} finally {dbg.exitSubRule(22);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(87, 36);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "mult");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "mult"


	public static class unary_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unary"
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:88:1: unary : ( ( NOT ^)? atom | MINUS ( NUMBER | var ( TOUCHES ^ var )? ) );
	public final MGPLParser.unary_return unary() throws RecognitionException {
		MGPLParser.unary_return retval = new MGPLParser.unary_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token NOT110=null;
		Token MINUS112=null;
		Token NUMBER113=null;
		Token TOUCHES115=null;
		ParserRuleReturnScope atom111 =null;
		ParserRuleReturnScope var114 =null;
		ParserRuleReturnScope var116 =null;

		CommonTree NOT110_tree=null;
		CommonTree MINUS112_tree=null;
		CommonTree NUMBER113_tree=null;
		CommonTree TOUCHES115_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "unary");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(88, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:88:7: ( ( NOT ^)? atom | MINUS ( NUMBER | var ( TOUCHES ^ var )? ) )
			int alt26=2;
			try { dbg.enterDecision(26, decisionCanBacktrack[26]);

			int LA26_0 = input.LA(1);
			if ( (LA26_0==LDF||(LA26_0 >= NOT && LA26_0 <= NUMBER)) ) {
				alt26=1;
			}
			else if ( (LA26_0==MINUS) ) {
				alt26=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(26);}

			switch (alt26) {
				case 1 :
					dbg.enterAlt(1);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:88:9: ( NOT ^)? atom
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(88,9);
					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:88:9: ( NOT ^)?
					int alt23=2;
					try { dbg.enterSubRule(23);
					try { dbg.enterDecision(23, decisionCanBacktrack[23]);

					int LA23_0 = input.LA(1);
					if ( (LA23_0==NOT) ) {
						alt23=1;
					}
					} finally {dbg.exitDecision(23);}

					switch (alt23) {
						case 1 :
							dbg.enterAlt(1);

							// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:88:10: NOT ^
							{
							dbg.location(88,13);
							NOT110=(Token)match(input,NOT,FOLLOW_NOT_in_unary1367); 
							NOT110_tree = (CommonTree)adaptor.create(NOT110);
							root_0 = (CommonTree)adaptor.becomeRoot(NOT110_tree, root_0);

							}
							break;

					}
					} finally {dbg.exitSubRule(23);}
					dbg.location(88,17);
					pushFollow(FOLLOW_atom_in_unary1372);
					atom111=atom();
					state._fsp--;

					adaptor.addChild(root_0, atom111.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:88:24: MINUS ( NUMBER | var ( TOUCHES ^ var )? )
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(88,24);
					MINUS112=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary1376); 
					MINUS112_tree = (CommonTree)adaptor.create(MINUS112);
					adaptor.addChild(root_0, MINUS112_tree);
					dbg.location(88,30);
					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:88:30: ( NUMBER | var ( TOUCHES ^ var )? )
					int alt25=2;
					try { dbg.enterSubRule(25);
					try { dbg.enterDecision(25, decisionCanBacktrack[25]);

					int LA25_0 = input.LA(1);
					if ( (LA25_0==NUMBER) ) {
						alt25=1;
					}
					else if ( (LA25_0==LDF) ) {
						alt25=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 25, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(25);}

					switch (alt25) {
						case 1 :
							dbg.enterAlt(1);

							// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:88:31: NUMBER
							{
							dbg.location(88,31);
							NUMBER113=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_unary1379); 
							NUMBER113_tree = (CommonTree)adaptor.create(NUMBER113);
							adaptor.addChild(root_0, NUMBER113_tree);

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:88:40: var ( TOUCHES ^ var )?
							{
							dbg.location(88,40);
							pushFollow(FOLLOW_var_in_unary1383);
							var114=var();
							state._fsp--;

							adaptor.addChild(root_0, var114.getTree());
							dbg.location(88,45);
							// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:88:45: ( TOUCHES ^ var )?
							int alt24=2;
							try { dbg.enterSubRule(24);
							try { dbg.enterDecision(24, decisionCanBacktrack[24]);

							int LA24_0 = input.LA(1);
							if ( (LA24_0==TOUCHES) ) {
								alt24=1;
							}
							} finally {dbg.exitDecision(24);}

							switch (alt24) {
								case 1 :
									dbg.enterAlt(1);

									// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:88:46: TOUCHES ^ var
									{
									dbg.location(88,53);
									TOUCHES115=(Token)match(input,TOUCHES,FOLLOW_TOUCHES_in_unary1387); 
									TOUCHES115_tree = (CommonTree)adaptor.create(TOUCHES115);
									root_0 = (CommonTree)adaptor.becomeRoot(TOUCHES115_tree, root_0);
									dbg.location(88,55);
									pushFollow(FOLLOW_var_in_unary1390);
									var116=var();
									state._fsp--;

									adaptor.addChild(root_0, var116.getTree());

									}
									break;

							}
							} finally {dbg.exitSubRule(24);}

							}
							break;

					}
					} finally {dbg.exitSubRule(25);}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(88, 61);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "unary");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "unary"


	public static class atom_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "atom"
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:89:1: atom : ( NUMBER | var ( TOUCHES ^ var )? );
	public final MGPLParser.atom_return atom() throws RecognitionException {
		MGPLParser.atom_return retval = new MGPLParser.atom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token NUMBER117=null;
		Token TOUCHES119=null;
		ParserRuleReturnScope var118 =null;
		ParserRuleReturnScope var120 =null;

		CommonTree NUMBER117_tree=null;
		CommonTree TOUCHES119_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "atom");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(89, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:89:7: ( NUMBER | var ( TOUCHES ^ var )? )
			int alt28=2;
			try { dbg.enterDecision(28, decisionCanBacktrack[28]);

			int LA28_0 = input.LA(1);
			if ( (LA28_0==NUMBER) ) {
				alt28=1;
			}
			else if ( (LA28_0==LDF) ) {
				alt28=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(28);}

			switch (alt28) {
				case 1 :
					dbg.enterAlt(1);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:89:9: NUMBER
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(89,9);
					NUMBER117=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_atom1402); 
					NUMBER117_tree = (CommonTree)adaptor.create(NUMBER117);
					adaptor.addChild(root_0, NUMBER117_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:89:18: var ( TOUCHES ^ var )?
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(89,18);
					pushFollow(FOLLOW_var_in_atom1406);
					var118=var();
					state._fsp--;

					adaptor.addChild(root_0, var118.getTree());
					dbg.location(89,23);
					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:89:23: ( TOUCHES ^ var )?
					int alt27=2;
					try { dbg.enterSubRule(27);
					try { dbg.enterDecision(27, decisionCanBacktrack[27]);

					int LA27_0 = input.LA(1);
					if ( (LA27_0==TOUCHES) ) {
						alt27=1;
					}
					} finally {dbg.exitDecision(27);}

					switch (alt27) {
						case 1 :
							dbg.enterAlt(1);

							// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:89:24: TOUCHES ^ var
							{
							dbg.location(89,31);
							TOUCHES119=(Token)match(input,TOUCHES,FOLLOW_TOUCHES_in_atom1410); 
							TOUCHES119_tree = (CommonTree)adaptor.create(TOUCHES119);
							root_0 = (CommonTree)adaptor.becomeRoot(TOUCHES119_tree, root_0);
							dbg.location(89,33);
							pushFollow(FOLLOW_var_in_atom1413);
							var120=var();
							state._fsp--;

							adaptor.addChild(root_0, var120.getTree());

							}
							break;

					}
					} finally {dbg.exitSubRule(27);}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(89, 37);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atom");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "atom"

	// Delegated rules



	public static final BitSet FOLLOW_GAME_in_prog795 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LDF_in_prog798 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_OPARAN_in_prog801 = new BitSet(new long[]{0x0000000000400800L});
	public static final BitSet FOLLOW_attrAssList_in_prog804 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CPARAN_in_prog807 = new BitSet(new long[]{0x0000082100200200L});
	public static final BitSet FOLLOW_decl_in_prog810 = new BitSet(new long[]{0x0000082100200200L});
	public static final BitSet FOLLOW_stmtBlock_in_prog813 = new BitSet(new long[]{0x0000000200000022L});
	public static final BitSet FOLLOW_block_in_prog815 = new BitSet(new long[]{0x0000000200000022L});
	public static final BitSet FOLLOW_varDecl_in_decl830 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_SEMIKOL_in_decl832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objDecl_in_decl837 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_SEMIKOL_in_decl839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_varDecl851 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LDF_in_varDecl854 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_init_in_varDecl856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_varDecl862 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LDF_in_varDecl865 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_OBRACKET_in_varDecl867 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_NUMBER_in_varDecl870 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CBRACKET_in_varDecl872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_init887 = new BitSet(new long[]{0x0000000468400000L});
	public static final BitSet FOLLOW_expr_in_init890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objType_in_objDecl901 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LDF_in_objDecl903 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_OPARAN_in_objDecl906 = new BitSet(new long[]{0x0000000000400800L});
	public static final BitSet FOLLOW_attrAssList_in_objDecl909 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CPARAN_in_objDecl912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objType_in_objDecl917 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LDF_in_objDecl919 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_OBRACKET_in_objDecl922 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_NUMBER_in_objDecl925 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CBRACKET_in_objDecl927 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LDF_in_attrAssList954 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_attrAssList956 = new BitSet(new long[]{0x0000000468400400L});
	public static final BitSet FOLLOW_expr_in_attrAssList959 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_attrAssList962 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_attrAssList_in_attrAssList965 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_animBlock_in_block981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_eventBlock_in_block985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANIMATION_in_animBlock994 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LDF_in_animBlock997 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_OPARAN_in_animBlock999 = new BitSet(new long[]{0x0000082000000200L});
	public static final BitSet FOLLOW_objType_in_animBlock1002 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LDF_in_animBlock1004 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CPARAN_in_animBlock1006 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_stmtBlock_in_animBlock1009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ON_in_eventBlock1017 = new BitSet(new long[]{0x0000124000808000L});
	public static final BitSet FOLLOW_keyStroke_in_eventBlock1020 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_stmtBlock_in_eventBlock1022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OCURBRA_in_stmtBlock1056 = new BitSet(new long[]{0x0000000000540100L});
	public static final BitSet FOLLOW_stmt_in_stmtBlock1059 = new BitSet(new long[]{0x0000000000540100L});
	public static final BitSet FOLLOW_CCURBRA_in_stmtBlock1062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStmt_in_stmt1077 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStmt_in_stmt1081 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assStmt_in_stmt1085 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifStmt1097 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_OPARAN_in_ifStmt1100 = new BitSet(new long[]{0x0000000468400800L});
	public static final BitSet FOLLOW_expr_in_ifStmt1103 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CPARAN_in_ifStmt1105 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_stmtBlock_in_ifStmt1108 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_ELSE_in_ifStmt1112 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_stmtBlock_in_ifStmt1115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forStmt1129 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_OPARAN_in_forStmt1132 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_assStmt2_in_forStmt1135 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_SEMIKOL_in_forStmt1137 = new BitSet(new long[]{0x0000008468400000L});
	public static final BitSet FOLLOW_expr_in_forStmt1140 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_SEMIKOL_in_forStmt1142 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_assStmt2_in_forStmt1145 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CPARAN_in_forStmt1147 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_stmtBlock_in_forStmt1150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_in_assStmt21157 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_assStmt21159 = new BitSet(new long[]{0x0000000468400000L});
	public static final BitSet FOLLOW_expr_in_assStmt21162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_in_assStmt1174 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_assStmt1176 = new BitSet(new long[]{0x0000008468400000L});
	public static final BitSet FOLLOW_expr_in_assStmt1179 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_SEMIKOL_in_assStmt1181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LDF_in_var1197 = new BitSet(new long[]{0x0000000080004002L});
	public static final BitSet FOLLOW_OBRACKET_in_var1202 = new BitSet(new long[]{0x0000000468400080L});
	public static final BitSet FOLLOW_expr_in_var1205 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_CBRACKET_in_var1207 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_DOT_in_var1212 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LDF_in_var1214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_var1221 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_LDF_in_var1223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPARAN_in_expr1235 = new BitSet(new long[]{0x0000000468400800L});
	public static final BitSet FOLLOW_expr_in_expr1238 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CPARAN_in_expr1240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_op_in_expr1246 = new BitSet(new long[]{0x0000000468400000L});
	public static final BitSet FOLLOW_expr_in_expr1248 = new BitSet(new long[]{0x0000000068400002L});
	public static final BitSet FOLLOW_disjunkt_in_op1260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_konjunkt_in_disjunkt1268 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_OR_in_disjunkt1271 = new BitSet(new long[]{0x0000000068400000L});
	public static final BitSet FOLLOW_konjunkt_in_disjunkt1274 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_relat_in_konjunkt1283 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_konjunkt1286 = new BitSet(new long[]{0x0000000068400000L});
	public static final BitSet FOLLOW_relat_in_konjunkt1289 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_add_in_relat1298 = new BitSet(new long[]{0x0000000003020002L});
	public static final BitSet FOLLOW_set_in_relat1301 = new BitSet(new long[]{0x0000000068400000L});
	public static final BitSet FOLLOW_add_in_relat1314 = new BitSet(new long[]{0x0000000003020002L});
	public static final BitSet FOLLOW_mult_in_add1323 = new BitSet(new long[]{0x0000001008000002L});
	public static final BitSet FOLLOW_set_in_add1326 = new BitSet(new long[]{0x0000000068400000L});
	public static final BitSet FOLLOW_mult_in_add1335 = new BitSet(new long[]{0x0000001008000002L});
	public static final BitSet FOLLOW_unary_in_mult1344 = new BitSet(new long[]{0x0000000010002002L});
	public static final BitSet FOLLOW_set_in_mult1347 = new BitSet(new long[]{0x0000000068400000L});
	public static final BitSet FOLLOW_unary_in_mult1357 = new BitSet(new long[]{0x0000000010002002L});
	public static final BitSet FOLLOW_NOT_in_unary1367 = new BitSet(new long[]{0x0000000040400000L});
	public static final BitSet FOLLOW_atom_in_unary1372 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_unary1376 = new BitSet(new long[]{0x0000000040400000L});
	public static final BitSet FOLLOW_NUMBER_in_unary1379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_in_unary1383 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_TOUCHES_in_unary1387 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_var_in_unary1390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_atom1402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_in_atom1406 = new BitSet(new long[]{0x0000040000000002L});
	public static final BitSet FOLLOW_TOUCHES_in_atom1410 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_var_in_atom1413 = new BitSet(new long[]{0x0000000000000002L});
}
