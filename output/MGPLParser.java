// $ANTLR 3.5.1 /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g 2013-12-15 15:09:05

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
		"ATTR", "CBRACKET", "CCURBRA", "CIRCLE", "COMMA", "CPARAN", "DIGIT", "DIV", 
		"DOT", "DOWNARROW", "ELSE", "EQUALS", "FOR", "GAME", "IF", "INT", "LDF", 
		"LEFTARROW", "LEQ", "LESS", "LOWCASE", "MINUS", "MULT", "NOT", "NUMBER", 
		"OBRACKET", "OCURBRA", "ON", "OPARAN", "OR", "PLUS", "RECTANGLE", "RIGHTARROW", 
		"SEMIKOL", "SINGLE_COMMENT", "SPACE", "TOUCHES", "TRIANGLE", "UPARROW", 
		"UPCASE", "WS"
	};
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int ANIMATION=5;
	public static final int ASSIGN=6;
	public static final int ATTR=7;
	public static final int CBRACKET=8;
	public static final int CCURBRA=9;
	public static final int CIRCLE=10;
	public static final int COMMA=11;
	public static final int CPARAN=12;
	public static final int DIGIT=13;
	public static final int DIV=14;
	public static final int DOT=15;
	public static final int DOWNARROW=16;
	public static final int ELSE=17;
	public static final int EQUALS=18;
	public static final int FOR=19;
	public static final int GAME=20;
	public static final int IF=21;
	public static final int INT=22;
	public static final int LDF=23;
	public static final int LEFTARROW=24;
	public static final int LEQ=25;
	public static final int LESS=26;
	public static final int LOWCASE=27;
	public static final int MINUS=28;
	public static final int MULT=29;
	public static final int NOT=30;
	public static final int NUMBER=31;
	public static final int OBRACKET=32;
	public static final int OCURBRA=33;
	public static final int ON=34;
	public static final int OPARAN=35;
	public static final int OR=36;
	public static final int PLUS=37;
	public static final int RECTANGLE=38;
	public static final int RIGHTARROW=39;
	public static final int SEMIKOL=40;
	public static final int SINGLE_COMMENT=41;
	public static final int SPACE=42;
	public static final int TOUCHES=43;
	public static final int TRIANGLE=44;
	public static final int UPARROW=45;
	public static final int UPCASE=46;
	public static final int WS=47;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "mult", "forStmt", "expr", "varDecl", "prog", "add", "objType", 
		"unary", "attrAssList", "var", "eventBlock", "assStmt2", "op", "animBlock", 
		"init", "konjunkt", "attrAss", "objDecl", "atom", "block", "stmt", "relat", 
		"assStmt", "keyStroke", "ifStmt", "decl", "stmtBlock"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false
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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:60:1: prog : GAME ^ LDF OPARAN ! ( attrAssList )? CPARAN ! ( decl )* stmtBlock ( block )* ;
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
		dbg.location(60, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:60:14: ( GAME ^ LDF OPARAN ! ( attrAssList )? CPARAN ! ( decl )* stmtBlock ( block )* )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:60:16: GAME ^ LDF OPARAN ! ( attrAssList )? CPARAN ! ( decl )* stmtBlock ( block )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(60,20);
			GAME1=(Token)match(input,GAME,FOLLOW_GAME_in_prog855); 
			GAME1_tree = (CommonTree)adaptor.create(GAME1);
			root_0 = (CommonTree)adaptor.becomeRoot(GAME1_tree, root_0);
			dbg.location(60,22);
			LDF2=(Token)match(input,LDF,FOLLOW_LDF_in_prog858); 
			LDF2_tree = (CommonTree)adaptor.create(LDF2);
			adaptor.addChild(root_0, LDF2_tree);
			dbg.location(60,32);
			OPARAN3=(Token)match(input,OPARAN,FOLLOW_OPARAN_in_prog860); dbg.location(60,34);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:60:34: ( attrAssList )?
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

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:60:34: attrAssList
					{
					dbg.location(60,34);
					pushFollow(FOLLOW_attrAssList_in_prog863);
					attrAssList4=attrAssList();
					state._fsp--;

					adaptor.addChild(root_0, attrAssList4.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(60,53);
			CPARAN5=(Token)match(input,CPARAN,FOLLOW_CPARAN_in_prog866); dbg.location(60,55);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:60:55: ( decl )*
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

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:60:55: decl
					{
					dbg.location(60,55);
					pushFollow(FOLLOW_decl_in_prog869);
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
			dbg.location(60,61);
			pushFollow(FOLLOW_stmtBlock_in_prog872);
			stmtBlock7=stmtBlock();
			state._fsp--;

			adaptor.addChild(root_0, stmtBlock7.getTree());
			dbg.location(60,71);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:60:71: ( block )*
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

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:60:71: block
					{
					dbg.location(60,71);
					pushFollow(FOLLOW_block_in_prog874);
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
		dbg.location(60, 76);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:61:1: decl : ( varDecl SEMIKOL !| objDecl SEMIKOL !);
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
		dbg.location(61, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:61:14: ( varDecl SEMIKOL !| objDecl SEMIKOL !)
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

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:61:16: varDecl SEMIKOL !
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(61,16);
					pushFollow(FOLLOW_varDecl_in_decl890);
					varDecl9=varDecl();
					state._fsp--;

					adaptor.addChild(root_0, varDecl9.getTree());
					dbg.location(61,31);
					SEMIKOL10=(Token)match(input,SEMIKOL,FOLLOW_SEMIKOL_in_decl892); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:62:4: objDecl SEMIKOL !
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(62,4);
					pushFollow(FOLLOW_objDecl_in_decl899);
					objDecl11=objDecl();
					state._fsp--;

					adaptor.addChild(root_0, objDecl11.getTree());
					dbg.location(62,19);
					SEMIKOL12=(Token)match(input,SEMIKOL,FOLLOW_SEMIKOL_in_decl901); 
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
		dbg.location(63, 1);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:64:1: varDecl : ( INT ^ LDF ( init )? | INT ^ LDF OBRACKET ! NUMBER CBRACKET !);
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
		dbg.location(64, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:64:14: ( INT ^ LDF ( init )? | INT ^ LDF OBRACKET ! NUMBER CBRACKET !)
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

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:64:16: INT ^ LDF ( init )?
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(64,19);
					INT13=(Token)match(input,INT,FOLLOW_INT_in_varDecl916); 
					INT13_tree = (CommonTree)adaptor.create(INT13);
					root_0 = (CommonTree)adaptor.becomeRoot(INT13_tree, root_0);
					dbg.location(64,21);
					LDF14=(Token)match(input,LDF,FOLLOW_LDF_in_varDecl919); 
					LDF14_tree = (CommonTree)adaptor.create(LDF14);
					adaptor.addChild(root_0, LDF14_tree);
					dbg.location(64,25);
					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:64:25: ( init )?
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

							// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:64:25: init
							{
							dbg.location(64,25);
							pushFollow(FOLLOW_init_in_varDecl921);
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

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:65:5: INT ^ LDF OBRACKET ! NUMBER CBRACKET !
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(65,8);
					INT16=(Token)match(input,INT,FOLLOW_INT_in_varDecl929); 
					INT16_tree = (CommonTree)adaptor.create(INT16);
					root_0 = (CommonTree)adaptor.becomeRoot(INT16_tree, root_0);
					dbg.location(65,10);
					LDF17=(Token)match(input,LDF,FOLLOW_LDF_in_varDecl932); 
					LDF17_tree = (CommonTree)adaptor.create(LDF17);
					adaptor.addChild(root_0, LDF17_tree);
					dbg.location(65,22);
					OBRACKET18=(Token)match(input,OBRACKET,FOLLOW_OBRACKET_in_varDecl934); dbg.location(65,24);
					NUMBER19=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_varDecl937); 
					NUMBER19_tree = (CommonTree)adaptor.create(NUMBER19);
					adaptor.addChild(root_0, NUMBER19_tree);
					dbg.location(65,39);
					CBRACKET20=(Token)match(input,CBRACKET,FOLLOW_CBRACKET_in_varDecl939); 
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
		dbg.location(66, 1);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:67:1: init : ASSIGN expr ;
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
		dbg.location(67, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:67:14: ( ASSIGN expr )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:67:16: ASSIGN expr
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(67,16);
			ASSIGN21=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_init957); 
			ASSIGN21_tree = (CommonTree)adaptor.create(ASSIGN21);
			adaptor.addChild(root_0, ASSIGN21_tree);
			dbg.location(67,23);
			pushFollow(FOLLOW_expr_in_init959);
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
		dbg.location(67, 26);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:68:1: objDecl : ( objType LDF ^ OPARAN ! ( attrAssList )? CPARAN !| objType LDF ^ OBRACKET ! NUMBER CBRACKET !);
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
		dbg.location(68, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:68:14: ( objType LDF ^ OPARAN ! ( attrAssList )? CPARAN !| objType LDF ^ OBRACKET ! NUMBER CBRACKET !)
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

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:68:16: objType LDF ^ OPARAN ! ( attrAssList )? CPARAN !
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(68,16);
					pushFollow(FOLLOW_objType_in_objDecl971);
					objType23=objType();
					state._fsp--;

					adaptor.addChild(root_0, objType23.getTree());
					dbg.location(68,27);
					LDF24=(Token)match(input,LDF,FOLLOW_LDF_in_objDecl973); 
					LDF24_tree = (CommonTree)adaptor.create(LDF24);
					root_0 = (CommonTree)adaptor.becomeRoot(LDF24_tree, root_0);
					dbg.location(68,35);
					OPARAN25=(Token)match(input,OPARAN,FOLLOW_OPARAN_in_objDecl976); dbg.location(68,37);
					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:68:37: ( attrAssList )?
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

							// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:68:37: attrAssList
							{
							dbg.location(68,37);
							pushFollow(FOLLOW_attrAssList_in_objDecl979);
							attrAssList26=attrAssList();
							state._fsp--;

							adaptor.addChild(root_0, attrAssList26.getTree());

							}
							break;

					}
					} finally {dbg.exitSubRule(7);}
					dbg.location(68,56);
					CPARAN27=(Token)match(input,CPARAN,FOLLOW_CPARAN_in_objDecl982); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:69:4: objType LDF ^ OBRACKET ! NUMBER CBRACKET !
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(69,4);
					pushFollow(FOLLOW_objType_in_objDecl989);
					objType28=objType();
					state._fsp--;

					adaptor.addChild(root_0, objType28.getTree());
					dbg.location(69,15);
					LDF29=(Token)match(input,LDF,FOLLOW_LDF_in_objDecl991); 
					LDF29_tree = (CommonTree)adaptor.create(LDF29);
					root_0 = (CommonTree)adaptor.becomeRoot(LDF29_tree, root_0);
					dbg.location(69,25);
					OBRACKET30=(Token)match(input,OBRACKET,FOLLOW_OBRACKET_in_objDecl994); dbg.location(69,27);
					NUMBER31=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_objDecl997); 
					NUMBER31_tree = (CommonTree)adaptor.create(NUMBER31);
					adaptor.addChild(root_0, NUMBER31_tree);
					dbg.location(69,42);
					CBRACKET32=(Token)match(input,CBRACKET,FOLLOW_CBRACKET_in_objDecl999); 
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
		dbg.location(70, 1);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:71:1: objType : ( RECTANGLE | TRIANGLE | CIRCLE );
	public final MGPLParser.objType_return objType() throws RecognitionException {
		MGPLParser.objType_return retval = new MGPLParser.objType_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set33=null;

		CommonTree set33_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "objType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(71, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:71:14: ( RECTANGLE | TRIANGLE | CIRCLE )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(71,14);
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
		dbg.location(71, 44);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:72:1: attrAssList : attrAss ( COMMA ! attrAss )* ;
	public final MGPLParser.attrAssList_return attrAssList() throws RecognitionException {
		MGPLParser.attrAssList_return retval = new MGPLParser.attrAssList_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token COMMA35=null;
		ParserRuleReturnScope attrAss34 =null;
		ParserRuleReturnScope attrAss36 =null;

		CommonTree COMMA35_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "attrAssList");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(72, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:72:13: ( attrAss ( COMMA ! attrAss )* )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:72:15: attrAss ( COMMA ! attrAss )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(72,15);
			pushFollow(FOLLOW_attrAss_in_attrAssList1029);
			attrAss34=attrAss();
			state._fsp--;

			adaptor.addChild(root_0, attrAss34.getTree());
			dbg.location(72,23);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:72:23: ( COMMA ! attrAss )*
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

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:72:24: COMMA ! attrAss
					{
					dbg.location(72,29);
					COMMA35=(Token)match(input,COMMA,FOLLOW_COMMA_in_attrAssList1032); dbg.location(72,31);
					pushFollow(FOLLOW_attrAss_in_attrAssList1035);
					attrAss36=attrAss();
					state._fsp--;

					adaptor.addChild(root_0, attrAss36.getTree());

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
		dbg.location(72, 40);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "attrAssList");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "attrAssList"


	public static class attrAss_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "attrAss"
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:73:1: attrAss : LDF ASSIGN expr -> ^( ATTR[\"ATTR\"] LDF ASSIGN expr ) ;
	public final MGPLParser.attrAss_return attrAss() throws RecognitionException {
		MGPLParser.attrAss_return retval = new MGPLParser.attrAss_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LDF37=null;
		Token ASSIGN38=null;
		ParserRuleReturnScope expr39 =null;

		CommonTree LDF37_tree=null;
		CommonTree ASSIGN38_tree=null;
		RewriteRuleTokenStream stream_LDF=new RewriteRuleTokenStream(adaptor,"token LDF");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "attrAss");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(73, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:73:9: ( LDF ASSIGN expr -> ^( ATTR[\"ATTR\"] LDF ASSIGN expr ) )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:73:11: LDF ASSIGN expr
			{
			dbg.location(73,11);
			LDF37=(Token)match(input,LDF,FOLLOW_LDF_in_attrAss1045);  
			stream_LDF.add(LDF37);
			dbg.location(73,15);
			ASSIGN38=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_attrAss1047);  
			stream_ASSIGN.add(ASSIGN38);
			dbg.location(73,22);
			pushFollow(FOLLOW_expr_in_attrAss1049);
			expr39=expr();
			state._fsp--;

			stream_expr.add(expr39.getTree());
			// AST REWRITE
			// elements: LDF, ASSIGN, expr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 73:27: -> ^( ATTR[\"ATTR\"] LDF ASSIGN expr )
			{
				dbg.location(73,30);
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:73:30: ^( ATTR[\"ATTR\"] LDF ASSIGN expr )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(73,32);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ATTR, "ATTR"), root_1);
				dbg.location(73,46);
				adaptor.addChild(root_1, stream_LDF.nextNode());dbg.location(73,50);
				adaptor.addChild(root_1, stream_ASSIGN.nextNode());dbg.location(73,57);
				adaptor.addChild(root_1, stream_expr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

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
		dbg.location(73, 61);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "attrAss");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "attrAss"


	public static class block_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "block"
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:74:1: block : ( animBlock | eventBlock );
	public final MGPLParser.block_return block() throws RecognitionException {
		MGPLParser.block_return retval = new MGPLParser.block_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope animBlock40 =null;
		ParserRuleReturnScope eventBlock41 =null;


		try { dbg.enterRule(getGrammarFileName(), "block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(74, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:74:14: ( animBlock | eventBlock )
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

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:74:16: animBlock
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(74,16);
					pushFollow(FOLLOW_animBlock_in_block1077);
					animBlock40=animBlock();
					state._fsp--;

					adaptor.addChild(root_0, animBlock40.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:75:4: eventBlock
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(75,4);
					pushFollow(FOLLOW_eventBlock_in_block1083);
					eventBlock41=eventBlock();
					state._fsp--;

					adaptor.addChild(root_0, eventBlock41.getTree());

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
		dbg.location(76, 1);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:77:1: animBlock : ANIMATION ^ LDF OPARAN ! objType LDF CPARAN ! stmtBlock ;
	public final MGPLParser.animBlock_return animBlock() throws RecognitionException {
		MGPLParser.animBlock_return retval = new MGPLParser.animBlock_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ANIMATION42=null;
		Token LDF43=null;
		Token OPARAN44=null;
		Token LDF46=null;
		Token CPARAN47=null;
		ParserRuleReturnScope objType45 =null;
		ParserRuleReturnScope stmtBlock48 =null;

		CommonTree ANIMATION42_tree=null;
		CommonTree LDF43_tree=null;
		CommonTree OPARAN44_tree=null;
		CommonTree LDF46_tree=null;
		CommonTree CPARAN47_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "animBlock");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(77, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:77:14: ( ANIMATION ^ LDF OPARAN ! objType LDF CPARAN ! stmtBlock )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:77:16: ANIMATION ^ LDF OPARAN ! objType LDF CPARAN ! stmtBlock
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(77,25);
			ANIMATION42=(Token)match(input,ANIMATION,FOLLOW_ANIMATION_in_animBlock1095); 
			ANIMATION42_tree = (CommonTree)adaptor.create(ANIMATION42);
			root_0 = (CommonTree)adaptor.becomeRoot(ANIMATION42_tree, root_0);
			dbg.location(77,27);
			LDF43=(Token)match(input,LDF,FOLLOW_LDF_in_animBlock1098); 
			LDF43_tree = (CommonTree)adaptor.create(LDF43);
			adaptor.addChild(root_0, LDF43_tree);
			dbg.location(77,37);
			OPARAN44=(Token)match(input,OPARAN,FOLLOW_OPARAN_in_animBlock1100); dbg.location(77,39);
			pushFollow(FOLLOW_objType_in_animBlock1103);
			objType45=objType();
			state._fsp--;

			adaptor.addChild(root_0, objType45.getTree());
			dbg.location(77,47);
			LDF46=(Token)match(input,LDF,FOLLOW_LDF_in_animBlock1105); 
			LDF46_tree = (CommonTree)adaptor.create(LDF46);
			adaptor.addChild(root_0, LDF46_tree);
			dbg.location(77,57);
			CPARAN47=(Token)match(input,CPARAN,FOLLOW_CPARAN_in_animBlock1107); dbg.location(77,59);
			pushFollow(FOLLOW_stmtBlock_in_animBlock1110);
			stmtBlock48=stmtBlock();
			state._fsp--;

			adaptor.addChild(root_0, stmtBlock48.getTree());

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
		dbg.location(77, 67);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:78:1: eventBlock : ON ^ keyStroke stmtBlock ;
	public final MGPLParser.eventBlock_return eventBlock() throws RecognitionException {
		MGPLParser.eventBlock_return retval = new MGPLParser.eventBlock_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ON49=null;
		ParserRuleReturnScope keyStroke50 =null;
		ParserRuleReturnScope stmtBlock51 =null;

		CommonTree ON49_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "eventBlock");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(78, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:78:14: ( ON ^ keyStroke stmtBlock )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:78:16: ON ^ keyStroke stmtBlock
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(78,18);
			ON49=(Token)match(input,ON,FOLLOW_ON_in_eventBlock1119); 
			ON49_tree = (CommonTree)adaptor.create(ON49);
			root_0 = (CommonTree)adaptor.becomeRoot(ON49_tree, root_0);
			dbg.location(78,20);
			pushFollow(FOLLOW_keyStroke_in_eventBlock1122);
			keyStroke50=keyStroke();
			state._fsp--;

			adaptor.addChild(root_0, keyStroke50.getTree());
			dbg.location(78,30);
			pushFollow(FOLLOW_stmtBlock_in_eventBlock1124);
			stmtBlock51=stmtBlock();
			state._fsp--;

			adaptor.addChild(root_0, stmtBlock51.getTree());

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
		dbg.location(78, 38);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:79:1: keyStroke : ( SPACE | LEFTARROW | RIGHTARROW | UPARROW | DOWNARROW );
	public final MGPLParser.keyStroke_return keyStroke() throws RecognitionException {
		MGPLParser.keyStroke_return retval = new MGPLParser.keyStroke_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set52=null;

		CommonTree set52_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "keyStroke");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(79, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:79:14: ( SPACE | LEFTARROW | RIGHTARROW | UPARROW | DOWNARROW )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(79,14);
			set52=input.LT(1);
			if ( input.LA(1)==DOWNARROW||input.LA(1)==LEFTARROW||input.LA(1)==RIGHTARROW||input.LA(1)==SPACE||input.LA(1)==UPARROW ) {
				input.consume();
				adaptor.addChild(root_0, (CommonTree)adaptor.create(set52));
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
		dbg.location(84, 1);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:85:1: stmtBlock : OCURBRA ! ( stmt )* CCURBRA !;
	public final MGPLParser.stmtBlock_return stmtBlock() throws RecognitionException {
		MGPLParser.stmtBlock_return retval = new MGPLParser.stmtBlock_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token OCURBRA53=null;
		Token CCURBRA55=null;
		ParserRuleReturnScope stmt54 =null;

		CommonTree OCURBRA53_tree=null;
		CommonTree CCURBRA55_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "stmtBlock");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(85, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:85:14: ( OCURBRA ! ( stmt )* CCURBRA !)
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:85:16: OCURBRA ! ( stmt )* CCURBRA !
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(85,23);
			OCURBRA53=(Token)match(input,OCURBRA,FOLLOW_OCURBRA_in_stmtBlock1170); dbg.location(85,25);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:85:25: ( stmt )*
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

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:85:25: stmt
					{
					dbg.location(85,25);
					pushFollow(FOLLOW_stmt_in_stmtBlock1173);
					stmt54=stmt();
					state._fsp--;

					adaptor.addChild(root_0, stmt54.getTree());

					}
					break;

				default :
					break loop11;
				}
			}
			} finally {dbg.exitSubRule(11);}
			dbg.location(85,38);
			CCURBRA55=(Token)match(input,CCURBRA,FOLLOW_CCURBRA_in_stmtBlock1176); 
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
		dbg.location(85, 38);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:86:1: stmt : ( ifStmt | forStmt | assStmt );
	public final MGPLParser.stmt_return stmt() throws RecognitionException {
		MGPLParser.stmt_return retval = new MGPLParser.stmt_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope ifStmt56 =null;
		ParserRuleReturnScope forStmt57 =null;
		ParserRuleReturnScope assStmt58 =null;


		try { dbg.enterRule(getGrammarFileName(), "stmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(86, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:86:14: ( ifStmt | forStmt | assStmt )
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

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:86:16: ifStmt
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(86,16);
					pushFollow(FOLLOW_ifStmt_in_stmt1192);
					ifStmt56=ifStmt();
					state._fsp--;

					adaptor.addChild(root_0, ifStmt56.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:87:4: forStmt
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(87,4);
					pushFollow(FOLLOW_forStmt_in_stmt1198);
					forStmt57=forStmt();
					state._fsp--;

					adaptor.addChild(root_0, forStmt57.getTree());

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:88:4: assStmt
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(88,4);
					pushFollow(FOLLOW_assStmt_in_stmt1204);
					assStmt58=assStmt();
					state._fsp--;

					adaptor.addChild(root_0, assStmt58.getTree());

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
		dbg.location(89, 1);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:90:1: ifStmt : IF ^ OPARAN ! expr CPARAN ! stmtBlock ( ELSE ^ stmtBlock )? ;
	public final MGPLParser.ifStmt_return ifStmt() throws RecognitionException {
		MGPLParser.ifStmt_return retval = new MGPLParser.ifStmt_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token IF59=null;
		Token OPARAN60=null;
		Token CPARAN62=null;
		Token ELSE64=null;
		ParserRuleReturnScope expr61 =null;
		ParserRuleReturnScope stmtBlock63 =null;
		ParserRuleReturnScope stmtBlock65 =null;

		CommonTree IF59_tree=null;
		CommonTree OPARAN60_tree=null;
		CommonTree CPARAN62_tree=null;
		CommonTree ELSE64_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "ifStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(90, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:90:14: ( IF ^ OPARAN ! expr CPARAN ! stmtBlock ( ELSE ^ stmtBlock )? )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:90:16: IF ^ OPARAN ! expr CPARAN ! stmtBlock ( ELSE ^ stmtBlock )?
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(90,18);
			IF59=(Token)match(input,IF,FOLLOW_IF_in_ifStmt1219); 
			IF59_tree = (CommonTree)adaptor.create(IF59);
			root_0 = (CommonTree)adaptor.becomeRoot(IF59_tree, root_0);
			dbg.location(90,26);
			OPARAN60=(Token)match(input,OPARAN,FOLLOW_OPARAN_in_ifStmt1222); dbg.location(90,28);
			pushFollow(FOLLOW_expr_in_ifStmt1225);
			expr61=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr61.getTree());
			dbg.location(90,39);
			CPARAN62=(Token)match(input,CPARAN,FOLLOW_CPARAN_in_ifStmt1227); dbg.location(90,41);
			pushFollow(FOLLOW_stmtBlock_in_ifStmt1230);
			stmtBlock63=stmtBlock();
			state._fsp--;

			adaptor.addChild(root_0, stmtBlock63.getTree());
			dbg.location(90,51);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:90:51: ( ELSE ^ stmtBlock )?
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

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:90:53: ELSE ^ stmtBlock
					{
					dbg.location(90,57);
					ELSE64=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStmt1234); 
					ELSE64_tree = (CommonTree)adaptor.create(ELSE64);
					root_0 = (CommonTree)adaptor.becomeRoot(ELSE64_tree, root_0);
					dbg.location(90,59);
					pushFollow(FOLLOW_stmtBlock_in_ifStmt1237);
					stmtBlock65=stmtBlock();
					state._fsp--;

					adaptor.addChild(root_0, stmtBlock65.getTree());

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
		dbg.location(90, 70);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:91:1: forStmt : FOR ^ OPARAN ! assStmt2 SEMIKOL ! expr SEMIKOL ! assStmt2 CPARAN ! stmtBlock ;
	public final MGPLParser.forStmt_return forStmt() throws RecognitionException {
		MGPLParser.forStmt_return retval = new MGPLParser.forStmt_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token FOR66=null;
		Token OPARAN67=null;
		Token SEMIKOL69=null;
		Token SEMIKOL71=null;
		Token CPARAN73=null;
		ParserRuleReturnScope assStmt268 =null;
		ParserRuleReturnScope expr70 =null;
		ParserRuleReturnScope assStmt272 =null;
		ParserRuleReturnScope stmtBlock74 =null;

		CommonTree FOR66_tree=null;
		CommonTree OPARAN67_tree=null;
		CommonTree SEMIKOL69_tree=null;
		CommonTree SEMIKOL71_tree=null;
		CommonTree CPARAN73_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "forStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(91, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:91:14: ( FOR ^ OPARAN ! assStmt2 SEMIKOL ! expr SEMIKOL ! assStmt2 CPARAN ! stmtBlock )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:91:16: FOR ^ OPARAN ! assStmt2 SEMIKOL ! expr SEMIKOL ! assStmt2 CPARAN ! stmtBlock
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(91,19);
			FOR66=(Token)match(input,FOR,FOLLOW_FOR_in_forStmt1252); 
			FOR66_tree = (CommonTree)adaptor.create(FOR66);
			root_0 = (CommonTree)adaptor.becomeRoot(FOR66_tree, root_0);
			dbg.location(91,27);
			OPARAN67=(Token)match(input,OPARAN,FOLLOW_OPARAN_in_forStmt1255); dbg.location(91,29);
			pushFollow(FOLLOW_assStmt2_in_forStmt1258);
			assStmt268=assStmt2();
			state._fsp--;

			adaptor.addChild(root_0, assStmt268.getTree());
			dbg.location(91,45);
			SEMIKOL69=(Token)match(input,SEMIKOL,FOLLOW_SEMIKOL_in_forStmt1260); dbg.location(91,47);
			pushFollow(FOLLOW_expr_in_forStmt1263);
			expr70=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr70.getTree());
			dbg.location(91,59);
			SEMIKOL71=(Token)match(input,SEMIKOL,FOLLOW_SEMIKOL_in_forStmt1265); dbg.location(91,61);
			pushFollow(FOLLOW_assStmt2_in_forStmt1268);
			assStmt272=assStmt2();
			state._fsp--;

			adaptor.addChild(root_0, assStmt272.getTree());
			dbg.location(91,76);
			CPARAN73=(Token)match(input,CPARAN,FOLLOW_CPARAN_in_forStmt1270); dbg.location(91,78);
			pushFollow(FOLLOW_stmtBlock_in_forStmt1273);
			stmtBlock74=stmtBlock();
			state._fsp--;

			adaptor.addChild(root_0, stmtBlock74.getTree());

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
		dbg.location(91, 86);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:92:1: assStmt2 : var ASSIGN ^ expr ;
	public final MGPLParser.assStmt2_return assStmt2() throws RecognitionException {
		MGPLParser.assStmt2_return retval = new MGPLParser.assStmt2_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ASSIGN76=null;
		ParserRuleReturnScope var75 =null;
		ParserRuleReturnScope expr77 =null;

		CommonTree ASSIGN76_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "assStmt2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(92, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:92:11: ( var ASSIGN ^ expr )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:92:13: var ASSIGN ^ expr
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(92,13);
			pushFollow(FOLLOW_var_in_assStmt21281);
			var75=var();
			state._fsp--;

			adaptor.addChild(root_0, var75.getTree());
			dbg.location(92,23);
			ASSIGN76=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assStmt21283); 
			ASSIGN76_tree = (CommonTree)adaptor.create(ASSIGN76);
			root_0 = (CommonTree)adaptor.becomeRoot(ASSIGN76_tree, root_0);
			dbg.location(92,25);
			pushFollow(FOLLOW_expr_in_assStmt21286);
			expr77=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr77.getTree());

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
		dbg.location(92, 29);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:93:1: assStmt : var ASSIGN ^ expr SEMIKOL !;
	public final MGPLParser.assStmt_return assStmt() throws RecognitionException {
		MGPLParser.assStmt_return retval = new MGPLParser.assStmt_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token ASSIGN79=null;
		Token SEMIKOL81=null;
		ParserRuleReturnScope var78 =null;
		ParserRuleReturnScope expr80 =null;

		CommonTree ASSIGN79_tree=null;
		CommonTree SEMIKOL81_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "assStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(93, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:93:14: ( var ASSIGN ^ expr SEMIKOL !)
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:93:16: var ASSIGN ^ expr SEMIKOL !
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(93,16);
			pushFollow(FOLLOW_var_in_assStmt1299);
			var78=var();
			state._fsp--;

			adaptor.addChild(root_0, var78.getTree());
			dbg.location(93,26);
			ASSIGN79=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assStmt1301); 
			ASSIGN79_tree = (CommonTree)adaptor.create(ASSIGN79);
			root_0 = (CommonTree)adaptor.becomeRoot(ASSIGN79_tree, root_0);
			dbg.location(93,28);
			pushFollow(FOLLOW_expr_in_assStmt1304);
			expr80=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr80.getTree());
			dbg.location(93,40);
			SEMIKOL81=(Token)match(input,SEMIKOL,FOLLOW_SEMIKOL_in_assStmt1306); 
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
		dbg.location(93, 40);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:94:1: var : LDF ^ ( OBRACKET ! expr CBRACKET ! ( DOT LDF )? | DOT LDF )? ;
	public final MGPLParser.var_return var() throws RecognitionException {
		MGPLParser.var_return retval = new MGPLParser.var_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token LDF82=null;
		Token OBRACKET83=null;
		Token CBRACKET85=null;
		Token DOT86=null;
		Token LDF87=null;
		Token DOT88=null;
		Token LDF89=null;
		ParserRuleReturnScope expr84 =null;

		CommonTree LDF82_tree=null;
		CommonTree OBRACKET83_tree=null;
		CommonTree CBRACKET85_tree=null;
		CommonTree DOT86_tree=null;
		CommonTree LDF87_tree=null;
		CommonTree DOT88_tree=null;
		CommonTree LDF89_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "var");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(94, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:94:14: ( LDF ^ ( OBRACKET ! expr CBRACKET ! ( DOT LDF )? | DOT LDF )? )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:95:2: LDF ^ ( OBRACKET ! expr CBRACKET ! ( DOT LDF )? | DOT LDF )?
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(95,5);
			LDF82=(Token)match(input,LDF,FOLLOW_LDF_in_var1326); 
			LDF82_tree = (CommonTree)adaptor.create(LDF82);
			root_0 = (CommonTree)adaptor.becomeRoot(LDF82_tree, root_0);
			dbg.location(95,7);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:95:7: ( OBRACKET ! expr CBRACKET ! ( DOT LDF )? | DOT LDF )?
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

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:95:9: OBRACKET ! expr CBRACKET ! ( DOT LDF )?
					{
					dbg.location(95,17);
					OBRACKET83=(Token)match(input,OBRACKET,FOLLOW_OBRACKET_in_var1331); dbg.location(95,19);
					pushFollow(FOLLOW_expr_in_var1334);
					expr84=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr84.getTree());
					dbg.location(95,32);
					CBRACKET85=(Token)match(input,CBRACKET,FOLLOW_CBRACKET_in_var1336); dbg.location(95,34);
					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:95:34: ( DOT LDF )?
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

							// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:95:36: DOT LDF
							{
							dbg.location(95,36);
							DOT86=(Token)match(input,DOT,FOLLOW_DOT_in_var1341); 
							DOT86_tree = (CommonTree)adaptor.create(DOT86);
							adaptor.addChild(root_0, DOT86_tree);
							dbg.location(95,40);
							LDF87=(Token)match(input,LDF,FOLLOW_LDF_in_var1343); 
							LDF87_tree = (CommonTree)adaptor.create(LDF87);
							adaptor.addChild(root_0, LDF87_tree);

							}
							break;

					}
					} finally {dbg.exitSubRule(14);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:96:5: DOT LDF
					{
					dbg.location(96,5);
					DOT88=(Token)match(input,DOT,FOLLOW_DOT_in_var1352); 
					DOT88_tree = (CommonTree)adaptor.create(DOT88);
					adaptor.addChild(root_0, DOT88_tree);
					dbg.location(96,9);
					LDF89=(Token)match(input,LDF,FOLLOW_LDF_in_var1354); 
					LDF89_tree = (CommonTree)adaptor.create(LDF89);
					adaptor.addChild(root_0, LDF89_tree);

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
		dbg.location(97, 1);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:100:1: expr : ( OPARAN ! expr CPARAN !| ( op ( OPARAN ! expr CPARAN !)? )* );
	public final MGPLParser.expr_return expr() throws RecognitionException {
		MGPLParser.expr_return retval = new MGPLParser.expr_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token OPARAN90=null;
		Token CPARAN92=null;
		Token OPARAN94=null;
		Token CPARAN96=null;
		ParserRuleReturnScope expr91 =null;
		ParserRuleReturnScope op93 =null;
		ParserRuleReturnScope expr95 =null;

		CommonTree OPARAN90_tree=null;
		CommonTree CPARAN92_tree=null;
		CommonTree OPARAN94_tree=null;
		CommonTree CPARAN96_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(100, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:100:7: ( OPARAN ! expr CPARAN !| ( op ( OPARAN ! expr CPARAN !)? )* )
			int alt18=2;
			try { dbg.enterDecision(18, decisionCanBacktrack[18]);

			int LA18_0 = input.LA(1);
			if ( (LA18_0==OPARAN) ) {
				alt18=1;
			}
			else if ( (LA18_0==CBRACKET||(LA18_0 >= COMMA && LA18_0 <= CPARAN)||LA18_0==LDF||(LA18_0 >= NOT && LA18_0 <= NUMBER)||LA18_0==SEMIKOL) ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(18);}

			switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:100:10: OPARAN ! expr CPARAN !
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(100,16);
					OPARAN90=(Token)match(input,OPARAN,FOLLOW_OPARAN_in_expr1369); dbg.location(100,18);
					pushFollow(FOLLOW_expr_in_expr1372);
					expr91=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr91.getTree());
					dbg.location(100,29);
					CPARAN92=(Token)match(input,CPARAN,FOLLOW_CPARAN_in_expr1374); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:100:32: ( op ( OPARAN ! expr CPARAN !)? )*
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(100,32);
					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:100:32: ( op ( OPARAN ! expr CPARAN !)? )*
					try { dbg.enterSubRule(17);

					loop17:
					while (true) {
						int alt17=2;
						try { dbg.enterDecision(17, decisionCanBacktrack[17]);

						int LA17_0 = input.LA(1);
						if ( (LA17_0==LDF||(LA17_0 >= NOT && LA17_0 <= NUMBER)) ) {
							alt17=1;
						}

						} finally {dbg.exitDecision(17);}

						switch (alt17) {
						case 1 :
							dbg.enterAlt(1);

							// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:100:33: op ( OPARAN ! expr CPARAN !)?
							{
							dbg.location(100,33);
							pushFollow(FOLLOW_op_in_expr1379);
							op93=op();
							state._fsp--;

							adaptor.addChild(root_0, op93.getTree());
							dbg.location(100,36);
							// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:100:36: ( OPARAN ! expr CPARAN !)?
							int alt16=2;
							try { dbg.enterSubRule(16);
							try { dbg.enterDecision(16, decisionCanBacktrack[16]);

							int LA16_0 = input.LA(1);
							if ( (LA16_0==OPARAN) ) {
								alt16=1;
							}
							} finally {dbg.exitDecision(16);}

							switch (alt16) {
								case 1 :
									dbg.enterAlt(1);

									// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:100:37: OPARAN ! expr CPARAN !
									{
									dbg.location(100,43);
									OPARAN94=(Token)match(input,OPARAN,FOLLOW_OPARAN_in_expr1382); dbg.location(100,45);
									pushFollow(FOLLOW_expr_in_expr1385);
									expr95=expr();
									state._fsp--;

									adaptor.addChild(root_0, expr95.getTree());
									dbg.location(100,56);
									CPARAN96=(Token)match(input,CPARAN,FOLLOW_CPARAN_in_expr1387); 
									}
									break;

							}
							} finally {dbg.exitSubRule(16);}

							}
							break;

						default :
							break loop17;
						}
					}
					} finally {dbg.exitSubRule(17);}

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
		dbg.location(100, 62);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:101:1: op : konjunkt ( OR ^ konjunkt )* ;
	public final MGPLParser.op_return op() throws RecognitionException {
		MGPLParser.op_return retval = new MGPLParser.op_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token OR98=null;
		ParserRuleReturnScope konjunkt97 =null;
		ParserRuleReturnScope konjunkt99 =null;

		CommonTree OR98_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "op");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(101, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:101:5: ( konjunkt ( OR ^ konjunkt )* )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:101:7: konjunkt ( OR ^ konjunkt )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(101,7);
			pushFollow(FOLLOW_konjunkt_in_op1402);
			konjunkt97=konjunkt();
			state._fsp--;

			adaptor.addChild(root_0, konjunkt97.getTree());
			dbg.location(101,16);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:101:16: ( OR ^ konjunkt )*
			try { dbg.enterSubRule(19);

			loop19:
			while (true) {
				int alt19=2;
				try { dbg.enterDecision(19, decisionCanBacktrack[19]);

				int LA19_0 = input.LA(1);
				if ( (LA19_0==OR) ) {
					alt19=1;
				}

				} finally {dbg.exitDecision(19);}

				switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:101:17: OR ^ konjunkt
					{
					dbg.location(101,19);
					OR98=(Token)match(input,OR,FOLLOW_OR_in_op1405); 
					OR98_tree = (CommonTree)adaptor.create(OR98);
					root_0 = (CommonTree)adaptor.becomeRoot(OR98_tree, root_0);
					dbg.location(101,21);
					pushFollow(FOLLOW_konjunkt_in_op1408);
					konjunkt99=konjunkt();
					state._fsp--;

					adaptor.addChild(root_0, konjunkt99.getTree());

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
		dbg.location(101, 30);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "op");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "op"


	public static class konjunkt_return extends ParserRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "konjunkt"
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:102:1: konjunkt : relat ( AND ^ relat )* ;
	public final MGPLParser.konjunkt_return konjunkt() throws RecognitionException {
		MGPLParser.konjunkt_return retval = new MGPLParser.konjunkt_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token AND101=null;
		ParserRuleReturnScope relat100 =null;
		ParserRuleReturnScope relat102 =null;

		CommonTree AND101_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "konjunkt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(102, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:102:10: ( relat ( AND ^ relat )* )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:102:12: relat ( AND ^ relat )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(102,12);
			pushFollow(FOLLOW_relat_in_konjunkt1417);
			relat100=relat();
			state._fsp--;

			adaptor.addChild(root_0, relat100.getTree());
			dbg.location(102,18);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:102:18: ( AND ^ relat )*
			try { dbg.enterSubRule(20);

			loop20:
			while (true) {
				int alt20=2;
				try { dbg.enterDecision(20, decisionCanBacktrack[20]);

				int LA20_0 = input.LA(1);
				if ( (LA20_0==AND) ) {
					alt20=1;
				}

				} finally {dbg.exitDecision(20);}

				switch (alt20) {
				case 1 :
					dbg.enterAlt(1);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:102:19: AND ^ relat
					{
					dbg.location(102,22);
					AND101=(Token)match(input,AND,FOLLOW_AND_in_konjunkt1420); 
					AND101_tree = (CommonTree)adaptor.create(AND101);
					root_0 = (CommonTree)adaptor.becomeRoot(AND101_tree, root_0);
					dbg.location(102,24);
					pushFollow(FOLLOW_relat_in_konjunkt1423);
					relat102=relat();
					state._fsp--;

					adaptor.addChild(root_0, relat102.getTree());

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
		dbg.location(102, 30);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:103:1: relat : add ( ( EQUALS | LESS | LEQ ) ^ add )* ;
	public final MGPLParser.relat_return relat() throws RecognitionException {
		MGPLParser.relat_return retval = new MGPLParser.relat_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set104=null;
		ParserRuleReturnScope add103 =null;
		ParserRuleReturnScope add105 =null;

		CommonTree set104_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "relat");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(103, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:103:7: ( add ( ( EQUALS | LESS | LEQ ) ^ add )* )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:103:9: add ( ( EQUALS | LESS | LEQ ) ^ add )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(103,9);
			pushFollow(FOLLOW_add_in_relat1432);
			add103=add();
			state._fsp--;

			adaptor.addChild(root_0, add103.getTree());
			dbg.location(103,13);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:103:13: ( ( EQUALS | LESS | LEQ ) ^ add )*
			try { dbg.enterSubRule(21);

			loop21:
			while (true) {
				int alt21=2;
				try { dbg.enterDecision(21, decisionCanBacktrack[21]);

				int LA21_0 = input.LA(1);
				if ( (LA21_0==EQUALS||(LA21_0 >= LEQ && LA21_0 <= LESS)) ) {
					alt21=1;
				}

				} finally {dbg.exitDecision(21);}

				switch (alt21) {
				case 1 :
					dbg.enterAlt(1);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:103:14: ( EQUALS | LESS | LEQ ) ^ add
					{
					dbg.location(103,35);
					set104=input.LT(1);
					set104=input.LT(1);
					if ( input.LA(1)==EQUALS||(input.LA(1) >= LEQ && input.LA(1) <= LESS) ) {
						input.consume();
						root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set104), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(103,37);
					pushFollow(FOLLOW_add_in_relat1448);
					add105=add();
					state._fsp--;

					adaptor.addChild(root_0, add105.getTree());

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
		dbg.location(103, 41);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:104:1: add : mult ( ( PLUS | MINUS ) ^ mult )* ;
	public final MGPLParser.add_return add() throws RecognitionException {
		MGPLParser.add_return retval = new MGPLParser.add_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set107=null;
		ParserRuleReturnScope mult106 =null;
		ParserRuleReturnScope mult108 =null;

		CommonTree set107_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "add");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(104, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:104:5: ( mult ( ( PLUS | MINUS ) ^ mult )* )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:104:7: mult ( ( PLUS | MINUS ) ^ mult )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(104,7);
			pushFollow(FOLLOW_mult_in_add1457);
			mult106=mult();
			state._fsp--;

			adaptor.addChild(root_0, mult106.getTree());
			dbg.location(104,12);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:104:12: ( ( PLUS | MINUS ) ^ mult )*
			try { dbg.enterSubRule(22);

			loop22:
			while (true) {
				int alt22=2;
				try { dbg.enterDecision(22, decisionCanBacktrack[22]);

				int LA22_0 = input.LA(1);
				if ( (LA22_0==MINUS||LA22_0==PLUS) ) {
					alt22=1;
				}

				} finally {dbg.exitDecision(22);}

				switch (alt22) {
				case 1 :
					dbg.enterAlt(1);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:104:13: ( PLUS | MINUS ) ^ mult
					{
					dbg.location(104,27);
					set107=input.LT(1);
					set107=input.LT(1);
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
						input.consume();
						root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set107), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(104,29);
					pushFollow(FOLLOW_mult_in_add1469);
					mult108=mult();
					state._fsp--;

					adaptor.addChild(root_0, mult108.getTree());

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
		dbg.location(104, 34);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:105:1: mult : unary ( ( MULT | DIV ) ^ unary )* ;
	public final MGPLParser.mult_return mult() throws RecognitionException {
		MGPLParser.mult_return retval = new MGPLParser.mult_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set110=null;
		ParserRuleReturnScope unary109 =null;
		ParserRuleReturnScope unary111 =null;

		CommonTree set110_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "mult");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(105, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:105:6: ( unary ( ( MULT | DIV ) ^ unary )* )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:105:8: unary ( ( MULT | DIV ) ^ unary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(105,8);
			pushFollow(FOLLOW_unary_in_mult1478);
			unary109=unary();
			state._fsp--;

			adaptor.addChild(root_0, unary109.getTree());
			dbg.location(105,14);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:105:14: ( ( MULT | DIV ) ^ unary )*
			try { dbg.enterSubRule(23);

			loop23:
			while (true) {
				int alt23=2;
				try { dbg.enterDecision(23, decisionCanBacktrack[23]);

				int LA23_0 = input.LA(1);
				if ( (LA23_0==DIV||LA23_0==MULT) ) {
					alt23=1;
				}

				} finally {dbg.exitDecision(23);}

				switch (alt23) {
				case 1 :
					dbg.enterAlt(1);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:105:15: ( MULT | DIV ) ^ unary
					{
					dbg.location(105,28);
					set110=input.LT(1);
					set110=input.LT(1);
					if ( input.LA(1)==DIV||input.LA(1)==MULT ) {
						input.consume();
						root_0 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(set110), root_0);
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}dbg.location(105,30);
					pushFollow(FOLLOW_unary_in_mult1491);
					unary111=unary();
					state._fsp--;

					adaptor.addChild(root_0, unary111.getTree());

					}
					break;

				default :
					break loop23;
				}
			}
			} finally {dbg.exitSubRule(23);}

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
		dbg.location(105, 36);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:106:1: unary : ( NOT ^)? atom ;
	public final MGPLParser.unary_return unary() throws RecognitionException {
		MGPLParser.unary_return retval = new MGPLParser.unary_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token NOT112=null;
		ParserRuleReturnScope atom113 =null;

		CommonTree NOT112_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "unary");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(106, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:106:7: ( ( NOT ^)? atom )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:106:9: ( NOT ^)? atom
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(106,9);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:106:9: ( NOT ^)?
			int alt24=2;
			try { dbg.enterSubRule(24);
			try { dbg.enterDecision(24, decisionCanBacktrack[24]);

			int LA24_0 = input.LA(1);
			if ( (LA24_0==NOT) ) {
				alt24=1;
			}
			} finally {dbg.exitDecision(24);}

			switch (alt24) {
				case 1 :
					dbg.enterAlt(1);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:106:10: NOT ^
					{
					dbg.location(106,13);
					NOT112=(Token)match(input,NOT,FOLLOW_NOT_in_unary1501); 
					NOT112_tree = (CommonTree)adaptor.create(NOT112);
					root_0 = (CommonTree)adaptor.becomeRoot(NOT112_tree, root_0);

					}
					break;

			}
			} finally {dbg.exitSubRule(24);}
			dbg.location(106,17);
			pushFollow(FOLLOW_atom_in_unary1506);
			atom113=atom();
			state._fsp--;

			adaptor.addChild(root_0, atom113.getTree());

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
		dbg.location(106, 21);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:107:1: atom : ( NUMBER | var ( TOUCHES ^ var )? );
	public final MGPLParser.atom_return atom() throws RecognitionException {
		MGPLParser.atom_return retval = new MGPLParser.atom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token NUMBER114=null;
		Token TOUCHES116=null;
		ParserRuleReturnScope var115 =null;
		ParserRuleReturnScope var117 =null;

		CommonTree NUMBER114_tree=null;
		CommonTree TOUCHES116_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "atom");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(107, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:107:7: ( NUMBER | var ( TOUCHES ^ var )? )
			int alt26=2;
			try { dbg.enterDecision(26, decisionCanBacktrack[26]);

			int LA26_0 = input.LA(1);
			if ( (LA26_0==NUMBER) ) {
				alt26=1;
			}
			else if ( (LA26_0==LDF) ) {
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

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:107:9: NUMBER
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(107,9);
					NUMBER114=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_atom1515); 
					NUMBER114_tree = (CommonTree)adaptor.create(NUMBER114);
					adaptor.addChild(root_0, NUMBER114_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:108:4: var ( TOUCHES ^ var )?
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(108,4);
					pushFollow(FOLLOW_var_in_atom1521);
					var115=var();
					state._fsp--;

					adaptor.addChild(root_0, var115.getTree());
					dbg.location(108,9);
					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:108:9: ( TOUCHES ^ var )?
					int alt25=2;
					try { dbg.enterSubRule(25);
					try { dbg.enterDecision(25, decisionCanBacktrack[25]);

					int LA25_0 = input.LA(1);
					if ( (LA25_0==TOUCHES) ) {
						alt25=1;
					}
					} finally {dbg.exitDecision(25);}

					switch (alt25) {
						case 1 :
							dbg.enterAlt(1);

							// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:108:10: TOUCHES ^ var
							{
							dbg.location(108,17);
							TOUCHES116=(Token)match(input,TOUCHES,FOLLOW_TOUCHES_in_atom1525); 
							TOUCHES116_tree = (CommonTree)adaptor.create(TOUCHES116);
							root_0 = (CommonTree)adaptor.becomeRoot(TOUCHES116_tree, root_0);
							dbg.location(108,19);
							pushFollow(FOLLOW_var_in_atom1528);
							var117=var();
							state._fsp--;

							adaptor.addChild(root_0, var117.getTree());

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
		dbg.location(109, 1);

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



	public static final BitSet FOLLOW_GAME_in_prog855 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LDF_in_prog858 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_OPARAN_in_prog860 = new BitSet(new long[]{0x0000000000801000L});
	public static final BitSet FOLLOW_attrAssList_in_prog863 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CPARAN_in_prog866 = new BitSet(new long[]{0x0000104200400400L});
	public static final BitSet FOLLOW_decl_in_prog869 = new BitSet(new long[]{0x0000104200400400L});
	public static final BitSet FOLLOW_stmtBlock_in_prog872 = new BitSet(new long[]{0x0000000400000022L});
	public static final BitSet FOLLOW_block_in_prog874 = new BitSet(new long[]{0x0000000400000022L});
	public static final BitSet FOLLOW_varDecl_in_decl890 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_SEMIKOL_in_decl892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objDecl_in_decl899 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_SEMIKOL_in_decl901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_varDecl916 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LDF_in_varDecl919 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_init_in_varDecl921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_varDecl929 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LDF_in_varDecl932 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_OBRACKET_in_varDecl934 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_NUMBER_in_varDecl937 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CBRACKET_in_varDecl939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_init957 = new BitSet(new long[]{0x00000008C0800000L});
	public static final BitSet FOLLOW_expr_in_init959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objType_in_objDecl971 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LDF_in_objDecl973 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_OPARAN_in_objDecl976 = new BitSet(new long[]{0x0000000000801000L});
	public static final BitSet FOLLOW_attrAssList_in_objDecl979 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CPARAN_in_objDecl982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objType_in_objDecl989 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LDF_in_objDecl991 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_OBRACKET_in_objDecl994 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_NUMBER_in_objDecl997 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CBRACKET_in_objDecl999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attrAss_in_attrAssList1029 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_COMMA_in_attrAssList1032 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_attrAss_in_attrAssList1035 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_LDF_in_attrAss1045 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_attrAss1047 = new BitSet(new long[]{0x00000008C0800000L});
	public static final BitSet FOLLOW_expr_in_attrAss1049 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_animBlock_in_block1077 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_eventBlock_in_block1083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANIMATION_in_animBlock1095 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LDF_in_animBlock1098 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_OPARAN_in_animBlock1100 = new BitSet(new long[]{0x0000104000000400L});
	public static final BitSet FOLLOW_objType_in_animBlock1103 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LDF_in_animBlock1105 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CPARAN_in_animBlock1107 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_stmtBlock_in_animBlock1110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ON_in_eventBlock1119 = new BitSet(new long[]{0x0000248001010000L});
	public static final BitSet FOLLOW_keyStroke_in_eventBlock1122 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_stmtBlock_in_eventBlock1124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OCURBRA_in_stmtBlock1170 = new BitSet(new long[]{0x0000000000A80200L});
	public static final BitSet FOLLOW_stmt_in_stmtBlock1173 = new BitSet(new long[]{0x0000000000A80200L});
	public static final BitSet FOLLOW_CCURBRA_in_stmtBlock1176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStmt_in_stmt1192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStmt_in_stmt1198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assStmt_in_stmt1204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifStmt1219 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_OPARAN_in_ifStmt1222 = new BitSet(new long[]{0x00000008C0801000L});
	public static final BitSet FOLLOW_expr_in_ifStmt1225 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CPARAN_in_ifStmt1227 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_stmtBlock_in_ifStmt1230 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_ELSE_in_ifStmt1234 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_stmtBlock_in_ifStmt1237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forStmt1252 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_OPARAN_in_forStmt1255 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_assStmt2_in_forStmt1258 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_SEMIKOL_in_forStmt1260 = new BitSet(new long[]{0x00000108C0800000L});
	public static final BitSet FOLLOW_expr_in_forStmt1263 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_SEMIKOL_in_forStmt1265 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_assStmt2_in_forStmt1268 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CPARAN_in_forStmt1270 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_stmtBlock_in_forStmt1273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_in_assStmt21281 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_assStmt21283 = new BitSet(new long[]{0x00000008C0800000L});
	public static final BitSet FOLLOW_expr_in_assStmt21286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_in_assStmt1299 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_assStmt1301 = new BitSet(new long[]{0x00000108C0800000L});
	public static final BitSet FOLLOW_expr_in_assStmt1304 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_SEMIKOL_in_assStmt1306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LDF_in_var1326 = new BitSet(new long[]{0x0000000100008002L});
	public static final BitSet FOLLOW_OBRACKET_in_var1331 = new BitSet(new long[]{0x00000008C0800100L});
	public static final BitSet FOLLOW_expr_in_var1334 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CBRACKET_in_var1336 = new BitSet(new long[]{0x0000000000008002L});
	public static final BitSet FOLLOW_DOT_in_var1341 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LDF_in_var1343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_var1352 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_LDF_in_var1354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPARAN_in_expr1369 = new BitSet(new long[]{0x00000008C0801000L});
	public static final BitSet FOLLOW_expr_in_expr1372 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CPARAN_in_expr1374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_op_in_expr1379 = new BitSet(new long[]{0x00000008C0800002L});
	public static final BitSet FOLLOW_OPARAN_in_expr1382 = new BitSet(new long[]{0x00000008C0801000L});
	public static final BitSet FOLLOW_expr_in_expr1385 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_CPARAN_in_expr1387 = new BitSet(new long[]{0x00000000C0800002L});
	public static final BitSet FOLLOW_konjunkt_in_op1402 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_OR_in_op1405 = new BitSet(new long[]{0x00000000C0800000L});
	public static final BitSet FOLLOW_konjunkt_in_op1408 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_relat_in_konjunkt1417 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_konjunkt1420 = new BitSet(new long[]{0x00000000C0800000L});
	public static final BitSet FOLLOW_relat_in_konjunkt1423 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_add_in_relat1432 = new BitSet(new long[]{0x0000000006040002L});
	public static final BitSet FOLLOW_set_in_relat1435 = new BitSet(new long[]{0x00000000C0800000L});
	public static final BitSet FOLLOW_add_in_relat1448 = new BitSet(new long[]{0x0000000006040002L});
	public static final BitSet FOLLOW_mult_in_add1457 = new BitSet(new long[]{0x0000002010000002L});
	public static final BitSet FOLLOW_set_in_add1460 = new BitSet(new long[]{0x00000000C0800000L});
	public static final BitSet FOLLOW_mult_in_add1469 = new BitSet(new long[]{0x0000002010000002L});
	public static final BitSet FOLLOW_unary_in_mult1478 = new BitSet(new long[]{0x0000000020004002L});
	public static final BitSet FOLLOW_set_in_mult1481 = new BitSet(new long[]{0x00000000C0800000L});
	public static final BitSet FOLLOW_unary_in_mult1491 = new BitSet(new long[]{0x0000000020004002L});
	public static final BitSet FOLLOW_NOT_in_unary1501 = new BitSet(new long[]{0x0000000080800000L});
	public static final BitSet FOLLOW_atom_in_unary1506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_atom1515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_in_atom1521 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_TOUCHES_in_atom1525 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_var_in_atom1528 = new BitSet(new long[]{0x0000000000000002L});
}
