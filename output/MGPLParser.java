// $ANTLR 3.5.1 /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g 2013-12-16 17:08:35

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ANIM", "ANIMATION", "ASSIGN", 
		"ASSIGNMENT", "ATTR", "ATTR2", "CBRACKET", "CCURBRA", "CIRCLE", "COMMA", 
		"CPARAN", "DIGIT", "DIV", "DOT", "DOWNARROW", "ELSE", "EQUALS", "EVENT", 
		"FOR", "GAME", "IF", "INT", "LDF", "LEFTARROW", "LEQ", "LESS", "LOWCASE", 
		"MINUS", "MULT", "NOT", "NUMBER", "OBJDECL", "OBRACKET", "OCURBRA", "ON", 
		"OPARAN", "OR", "PLUS", "PROG", "RECTANGLE", "RIGHTARROW", "SEMIKOL", 
		"SINGLE_COMMENT", "SPACE", "STMT", "TOUCHES", "TRIANGLE", "UPARROW", "UPCASE", 
		"VARDECL", "WS"
	};
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int ANIM=5;
	public static final int ANIMATION=6;
	public static final int ASSIGN=7;
	public static final int ASSIGNMENT=8;
	public static final int ATTR=9;
	public static final int ATTR2=10;
	public static final int CBRACKET=11;
	public static final int CCURBRA=12;
	public static final int CIRCLE=13;
	public static final int COMMA=14;
	public static final int CPARAN=15;
	public static final int DIGIT=16;
	public static final int DIV=17;
	public static final int DOT=18;
	public static final int DOWNARROW=19;
	public static final int ELSE=20;
	public static final int EQUALS=21;
	public static final int EVENT=22;
	public static final int FOR=23;
	public static final int GAME=24;
	public static final int IF=25;
	public static final int INT=26;
	public static final int LDF=27;
	public static final int LEFTARROW=28;
	public static final int LEQ=29;
	public static final int LESS=30;
	public static final int LOWCASE=31;
	public static final int MINUS=32;
	public static final int MULT=33;
	public static final int NOT=34;
	public static final int NUMBER=35;
	public static final int OBJDECL=36;
	public static final int OBRACKET=37;
	public static final int OCURBRA=38;
	public static final int ON=39;
	public static final int OPARAN=40;
	public static final int OR=41;
	public static final int PLUS=42;
	public static final int PROG=43;
	public static final int RECTANGLE=44;
	public static final int RIGHTARROW=45;
	public static final int SEMIKOL=46;
	public static final int SINGLE_COMMENT=47;
	public static final int SPACE=48;
	public static final int STMT=49;
	public static final int TOUCHES=50;
	public static final int TRIANGLE=51;
	public static final int UPARROW=52;
	public static final int UPCASE=53;
	public static final int VARDECL=54;
	public static final int WS=55;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "assStmt", "expr", "animBlock", "objType", "decl", "op", 
		"prog", "assStmt2", "block", "ifStmt", "objDecl", "relat", "konjunkt", 
		"atom", "varDecl", "stmt", "attrAss", "stmtBlock", "var", "keyStroke", 
		"attrAssList", "eventBlock", "init", "mult", "forStmt", "unary", "add"
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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:72:1: prog : GAME LDF OPARAN ( attrAssList )? CPARAN ( decl )* stmtBlock ( block )* -> ^( PROG[\"Game\"] LDF ) ^( ATTR2[\"Attribute\"] ( attrAssList )? ) ^( PROG[\"Declaration\"] ( decl )* ) ^( STMT[\"Statements\"] stmtBlock ) ( block )* ;
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
		RewriteRuleTokenStream stream_OPARAN=new RewriteRuleTokenStream(adaptor,"token OPARAN");
		RewriteRuleTokenStream stream_CPARAN=new RewriteRuleTokenStream(adaptor,"token CPARAN");
		RewriteRuleTokenStream stream_GAME=new RewriteRuleTokenStream(adaptor,"token GAME");
		RewriteRuleTokenStream stream_LDF=new RewriteRuleTokenStream(adaptor,"token LDF");
		RewriteRuleSubtreeStream stream_attrAssList=new RewriteRuleSubtreeStream(adaptor,"rule attrAssList");
		RewriteRuleSubtreeStream stream_stmtBlock=new RewriteRuleSubtreeStream(adaptor,"rule stmtBlock");
		RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
		RewriteRuleSubtreeStream stream_decl=new RewriteRuleSubtreeStream(adaptor,"rule decl");

		try { dbg.enterRule(getGrammarFileName(), "prog");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(72, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:72:14: ( GAME LDF OPARAN ( attrAssList )? CPARAN ( decl )* stmtBlock ( block )* -> ^( PROG[\"Game\"] LDF ) ^( ATTR2[\"Attribute\"] ( attrAssList )? ) ^( PROG[\"Declaration\"] ( decl )* ) ^( STMT[\"Statements\"] stmtBlock ) ( block )* )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:72:16: GAME LDF OPARAN ( attrAssList )? CPARAN ( decl )* stmtBlock ( block )*
			{
			dbg.location(72,16);
			GAME1=(Token)match(input,GAME,FOLLOW_GAME_in_prog952);  
			stream_GAME.add(GAME1);
			dbg.location(72,21);
			LDF2=(Token)match(input,LDF,FOLLOW_LDF_in_prog954);  
			stream_LDF.add(LDF2);
			dbg.location(72,25);
			OPARAN3=(Token)match(input,OPARAN,FOLLOW_OPARAN_in_prog956);  
			stream_OPARAN.add(OPARAN3);
			dbg.location(72,32);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:72:32: ( attrAssList )?
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

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:72:32: attrAssList
					{
					dbg.location(72,32);
					pushFollow(FOLLOW_attrAssList_in_prog958);
					attrAssList4=attrAssList();
					state._fsp--;

					stream_attrAssList.add(attrAssList4.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(72,45);
			CPARAN5=(Token)match(input,CPARAN,FOLLOW_CPARAN_in_prog961);  
			stream_CPARAN.add(CPARAN5);
			dbg.location(72,52);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:72:52: ( decl )*
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

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:72:52: decl
					{
					dbg.location(72,52);
					pushFollow(FOLLOW_decl_in_prog963);
					decl6=decl();
					state._fsp--;

					stream_decl.add(decl6.getTree());
					}
					break;

				default :
					break loop2;
				}
			}
			} finally {dbg.exitSubRule(2);}
			dbg.location(72,58);
			pushFollow(FOLLOW_stmtBlock_in_prog966);
			stmtBlock7=stmtBlock();
			state._fsp--;

			stream_stmtBlock.add(stmtBlock7.getTree());dbg.location(72,68);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:72:68: ( block )*
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

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:72:68: block
					{
					dbg.location(72,68);
					pushFollow(FOLLOW_block_in_prog968);
					block8=block();
					state._fsp--;

					stream_block.add(block8.getTree());
					}
					break;

				default :
					break loop3;
				}
			}
			} finally {dbg.exitSubRule(3);}

			// AST REWRITE
			// elements: LDF, stmtBlock, block, decl, attrAssList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 72:76: -> ^( PROG[\"Game\"] LDF ) ^( ATTR2[\"Attribute\"] ( attrAssList )? ) ^( PROG[\"Declaration\"] ( decl )* ) ^( STMT[\"Statements\"] stmtBlock ) ( block )*
			{
				dbg.location(72,79);
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:72:79: ^( PROG[\"Game\"] LDF )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(72,81);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROG, "Game"), root_1);
				dbg.location(72,94);
				adaptor.addChild(root_1, stream_LDF.nextNode());
				adaptor.addChild(root_0, root_1);
				}
				dbg.location(72,99);
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:72:99: ^( ATTR2[\"Attribute\"] ( attrAssList )? )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(72,101);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ATTR2, "Attribute"), root_1);
				dbg.location(72,120);
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:72:120: ( attrAssList )?
				if ( stream_attrAssList.hasNext() ) {
					dbg.location(72,120);
					adaptor.addChild(root_1, stream_attrAssList.nextTree());
				}
				stream_attrAssList.reset();

				adaptor.addChild(root_0, root_1);
				}
				dbg.location(72,134);
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:72:134: ^( PROG[\"Declaration\"] ( decl )* )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(72,136);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROG, "Declaration"), root_1);
				dbg.location(72,156);
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:72:156: ( decl )*
				while ( stream_decl.hasNext() ) {
					dbg.location(72,156);
					adaptor.addChild(root_1, stream_decl.nextTree());
				}
				stream_decl.reset();

				adaptor.addChild(root_0, root_1);
				}
				dbg.location(72,163);
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:72:163: ^( STMT[\"Statements\"] stmtBlock )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(72,165);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STMT, "Statements"), root_1);
				dbg.location(72,184);
				adaptor.addChild(root_1, stream_stmtBlock.nextTree());
				adaptor.addChild(root_0, root_1);
				}
				dbg.location(72,195);
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:72:195: ( block )*
				while ( stream_block.hasNext() ) {
					dbg.location(72,195);
					adaptor.addChild(root_0, stream_block.nextTree());
				}
				stream_block.reset();

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
		dbg.location(72, 200);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:73:1: decl : ( varDecl SEMIKOL -> ^( VARDECL[\"Variable\"] varDecl ) | objDecl SEMIKOL -> ^( OBJDECL[\"Object\"] objDecl ) );
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
		RewriteRuleTokenStream stream_SEMIKOL=new RewriteRuleTokenStream(adaptor,"token SEMIKOL");
		RewriteRuleSubtreeStream stream_objDecl=new RewriteRuleSubtreeStream(adaptor,"rule objDecl");
		RewriteRuleSubtreeStream stream_varDecl=new RewriteRuleSubtreeStream(adaptor,"rule varDecl");

		try { dbg.enterRule(getGrammarFileName(), "decl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(73, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:73:14: ( varDecl SEMIKOL -> ^( VARDECL[\"Variable\"] varDecl ) | objDecl SEMIKOL -> ^( OBJDECL[\"Object\"] objDecl ) )
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

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:73:16: varDecl SEMIKOL
					{
					dbg.location(73,16);
					pushFollow(FOLLOW_varDecl_in_decl1020);
					varDecl9=varDecl();
					state._fsp--;

					stream_varDecl.add(varDecl9.getTree());dbg.location(73,24);
					SEMIKOL10=(Token)match(input,SEMIKOL,FOLLOW_SEMIKOL_in_decl1022);  
					stream_SEMIKOL.add(SEMIKOL10);

					// AST REWRITE
					// elements: varDecl
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 73:33: -> ^( VARDECL[\"Variable\"] varDecl )
					{
						dbg.location(73,36);
						// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:73:36: ^( VARDECL[\"Variable\"] varDecl )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(73,38);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VARDECL, "Variable"), root_1);
						dbg.location(73,58);
						adaptor.addChild(root_1, stream_varDecl.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:74:4: objDecl SEMIKOL
					{
					dbg.location(74,4);
					pushFollow(FOLLOW_objDecl_in_decl1038);
					objDecl11=objDecl();
					state._fsp--;

					stream_objDecl.add(objDecl11.getTree());dbg.location(74,12);
					SEMIKOL12=(Token)match(input,SEMIKOL,FOLLOW_SEMIKOL_in_decl1040);  
					stream_SEMIKOL.add(SEMIKOL12);

					// AST REWRITE
					// elements: objDecl
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 74:20: -> ^( OBJDECL[\"Object\"] objDecl )
					{
						dbg.location(74,23);
						// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:74:23: ^( OBJDECL[\"Object\"] objDecl )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(74,25);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OBJDECL, "Object"), root_1);
						dbg.location(74,43);
						adaptor.addChild(root_1, stream_objDecl.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

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
		dbg.location(74, 52);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:75:1: varDecl : ( INT ^ LDF ( init )? | INT ^ LDF OBRACKET ! NUMBER CBRACKET !);
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
		dbg.location(75, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:75:14: ( INT ^ LDF ( init )? | INT ^ LDF OBRACKET ! NUMBER CBRACKET !)
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

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:75:16: INT ^ LDF ( init )?
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(75,19);
					INT13=(Token)match(input,INT,FOLLOW_INT_in_varDecl1063); 
					INT13_tree = (CommonTree)adaptor.create(INT13);
					root_0 = (CommonTree)adaptor.becomeRoot(INT13_tree, root_0);
					dbg.location(75,21);
					LDF14=(Token)match(input,LDF,FOLLOW_LDF_in_varDecl1066); 
					LDF14_tree = (CommonTree)adaptor.create(LDF14);
					adaptor.addChild(root_0, LDF14_tree);
					dbg.location(75,25);
					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:75:25: ( init )?
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

							// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:75:25: init
							{
							dbg.location(75,25);
							pushFollow(FOLLOW_init_in_varDecl1068);
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

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:76:5: INT ^ LDF OBRACKET ! NUMBER CBRACKET !
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(76,8);
					INT16=(Token)match(input,INT,FOLLOW_INT_in_varDecl1076); 
					INT16_tree = (CommonTree)adaptor.create(INT16);
					root_0 = (CommonTree)adaptor.becomeRoot(INT16_tree, root_0);
					dbg.location(76,10);
					LDF17=(Token)match(input,LDF,FOLLOW_LDF_in_varDecl1079); 
					LDF17_tree = (CommonTree)adaptor.create(LDF17);
					adaptor.addChild(root_0, LDF17_tree);
					dbg.location(76,22);
					OBRACKET18=(Token)match(input,OBRACKET,FOLLOW_OBRACKET_in_varDecl1081); dbg.location(76,24);
					NUMBER19=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_varDecl1084); 
					NUMBER19_tree = (CommonTree)adaptor.create(NUMBER19);
					adaptor.addChild(root_0, NUMBER19_tree);
					dbg.location(76,39);
					CBRACKET20=(Token)match(input,CBRACKET,FOLLOW_CBRACKET_in_varDecl1086); 
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
		dbg.location(76, 40);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:77:1: init : ASSIGN expr ;
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
		dbg.location(77, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:77:14: ( ASSIGN expr )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:77:16: ASSIGN expr
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(77,16);
			ASSIGN21=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_init1103); 
			ASSIGN21_tree = (CommonTree)adaptor.create(ASSIGN21);
			adaptor.addChild(root_0, ASSIGN21_tree);
			dbg.location(77,23);
			pushFollow(FOLLOW_expr_in_init1105);
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
		dbg.location(77, 27);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:78:1: objDecl : ( objType LDF ^ OPARAN ! ( attrAssList )? CPARAN !| objType LDF ^ OBRACKET ! NUMBER CBRACKET !);
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
		dbg.location(78, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:78:14: ( objType LDF ^ OPARAN ! ( attrAssList )? CPARAN !| objType LDF ^ OBRACKET ! NUMBER CBRACKET !)
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

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:78:16: objType LDF ^ OPARAN ! ( attrAssList )? CPARAN !
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(78,16);
					pushFollow(FOLLOW_objType_in_objDecl1118);
					objType23=objType();
					state._fsp--;

					adaptor.addChild(root_0, objType23.getTree());
					dbg.location(78,27);
					LDF24=(Token)match(input,LDF,FOLLOW_LDF_in_objDecl1120); 
					LDF24_tree = (CommonTree)adaptor.create(LDF24);
					root_0 = (CommonTree)adaptor.becomeRoot(LDF24_tree, root_0);
					dbg.location(78,35);
					OPARAN25=(Token)match(input,OPARAN,FOLLOW_OPARAN_in_objDecl1123); dbg.location(78,37);
					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:78:37: ( attrAssList )?
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

							// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:78:37: attrAssList
							{
							dbg.location(78,37);
							pushFollow(FOLLOW_attrAssList_in_objDecl1126);
							attrAssList26=attrAssList();
							state._fsp--;

							adaptor.addChild(root_0, attrAssList26.getTree());

							}
							break;

					}
					} finally {dbg.exitSubRule(7);}
					dbg.location(78,56);
					CPARAN27=(Token)match(input,CPARAN,FOLLOW_CPARAN_in_objDecl1129); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:79:4: objType LDF ^ OBRACKET ! NUMBER CBRACKET !
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(79,4);
					pushFollow(FOLLOW_objType_in_objDecl1136);
					objType28=objType();
					state._fsp--;

					adaptor.addChild(root_0, objType28.getTree());
					dbg.location(79,15);
					LDF29=(Token)match(input,LDF,FOLLOW_LDF_in_objDecl1138); 
					LDF29_tree = (CommonTree)adaptor.create(LDF29);
					root_0 = (CommonTree)adaptor.becomeRoot(LDF29_tree, root_0);
					dbg.location(79,25);
					OBRACKET30=(Token)match(input,OBRACKET,FOLLOW_OBRACKET_in_objDecl1141); dbg.location(79,27);
					NUMBER31=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_objDecl1144); 
					NUMBER31_tree = (CommonTree)adaptor.create(NUMBER31);
					adaptor.addChild(root_0, NUMBER31_tree);
					dbg.location(79,42);
					CBRACKET32=(Token)match(input,CBRACKET,FOLLOW_CBRACKET_in_objDecl1146); 
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
		dbg.location(79, 43);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:80:1: objType : ( RECTANGLE | TRIANGLE | CIRCLE );
	public final MGPLParser.objType_return objType() throws RecognitionException {
		MGPLParser.objType_return retval = new MGPLParser.objType_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set33=null;

		CommonTree set33_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "objType");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(80, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:80:14: ( RECTANGLE | TRIANGLE | CIRCLE )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(80,14);
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
		dbg.location(80, 44);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:81:1: attrAssList : attrAss ( COMMA attrAss )* ;
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
		dbg.location(81, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:81:13: ( attrAss ( COMMA attrAss )* )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:81:15: attrAss ( COMMA attrAss )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(81,15);
			pushFollow(FOLLOW_attrAss_in_attrAssList1175);
			attrAss34=attrAss();
			state._fsp--;

			adaptor.addChild(root_0, attrAss34.getTree());
			dbg.location(81,23);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:81:23: ( COMMA attrAss )*
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

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:81:24: COMMA attrAss
					{
					dbg.location(81,24);
					COMMA35=(Token)match(input,COMMA,FOLLOW_COMMA_in_attrAssList1178); 
					COMMA35_tree = (CommonTree)adaptor.create(COMMA35);
					adaptor.addChild(root_0, COMMA35_tree);
					dbg.location(81,30);
					pushFollow(FOLLOW_attrAss_in_attrAssList1180);
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
		dbg.location(81, 39);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:82:1: attrAss : LDF ASSIGN expr -> ^( ATTR[\"Attribut\"] LDF ASSIGN expr ) ;
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
		dbg.location(82, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:82:9: ( LDF ASSIGN expr -> ^( ATTR[\"Attribut\"] LDF ASSIGN expr ) )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:82:11: LDF ASSIGN expr
			{
			dbg.location(82,11);
			LDF37=(Token)match(input,LDF,FOLLOW_LDF_in_attrAss1190);  
			stream_LDF.add(LDF37);
			dbg.location(82,15);
			ASSIGN38=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_attrAss1192);  
			stream_ASSIGN.add(ASSIGN38);
			dbg.location(82,22);
			pushFollow(FOLLOW_expr_in_attrAss1194);
			expr39=expr();
			state._fsp--;

			stream_expr.add(expr39.getTree());
			// AST REWRITE
			// elements: ASSIGN, expr, LDF
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 82:27: -> ^( ATTR[\"Attribut\"] LDF ASSIGN expr )
			{
				dbg.location(82,30);
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:82:30: ^( ATTR[\"Attribut\"] LDF ASSIGN expr )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(82,32);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ATTR, "Attribut"), root_1);
				dbg.location(82,50);
				adaptor.addChild(root_1, stream_LDF.nextNode());dbg.location(82,54);
				adaptor.addChild(root_1, stream_ASSIGN.nextNode());dbg.location(82,61);
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
		dbg.location(82, 66);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:83:1: block : ( animBlock -> ^( ANIM[\"Animation\"] animBlock ) | eventBlock -> ^( EVENT[\"Event\"] eventBlock ) );
	public final MGPLParser.block_return block() throws RecognitionException {
		MGPLParser.block_return retval = new MGPLParser.block_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		ParserRuleReturnScope animBlock40 =null;
		ParserRuleReturnScope eventBlock41 =null;

		RewriteRuleSubtreeStream stream_eventBlock=new RewriteRuleSubtreeStream(adaptor,"rule eventBlock");
		RewriteRuleSubtreeStream stream_animBlock=new RewriteRuleSubtreeStream(adaptor,"rule animBlock");

		try { dbg.enterRule(getGrammarFileName(), "block");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(83, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:83:14: ( animBlock -> ^( ANIM[\"Animation\"] animBlock ) | eventBlock -> ^( EVENT[\"Event\"] eventBlock ) )
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

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:83:16: animBlock
					{
					dbg.location(83,16);
					pushFollow(FOLLOW_animBlock_in_block1223);
					animBlock40=animBlock();
					state._fsp--;

					stream_animBlock.add(animBlock40.getTree());
					// AST REWRITE
					// elements: animBlock
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 83:26: -> ^( ANIM[\"Animation\"] animBlock )
					{
						dbg.location(83,29);
						// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:83:29: ^( ANIM[\"Animation\"] animBlock )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(83,31);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ANIM, "Animation"), root_1);
						dbg.location(83,49);
						adaptor.addChild(root_1, stream_animBlock.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:84:4: eventBlock
					{
					dbg.location(84,4);
					pushFollow(FOLLOW_eventBlock_in_block1238);
					eventBlock41=eventBlock();
					state._fsp--;

					stream_eventBlock.add(eventBlock41.getTree());
					// AST REWRITE
					// elements: eventBlock
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (CommonTree)adaptor.nil();
					// 84:15: -> ^( EVENT[\"Event\"] eventBlock )
					{
						dbg.location(84,18);
						// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:84:18: ^( EVENT[\"Event\"] eventBlock )
						{
						CommonTree root_1 = (CommonTree)adaptor.nil();
						dbg.location(84,20);
						root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EVENT, "Event"), root_1);
						dbg.location(84,35);
						adaptor.addChild(root_1, stream_eventBlock.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

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
		dbg.location(84, 45);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:85:1: animBlock : ANIMATION LDF OPARAN ! objType LDF CPARAN ! stmtBlock ;
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
		dbg.location(85, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:85:14: ( ANIMATION LDF OPARAN ! objType LDF CPARAN ! stmtBlock )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:85:16: ANIMATION LDF OPARAN ! objType LDF CPARAN ! stmtBlock
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(85,16);
			ANIMATION42=(Token)match(input,ANIMATION,FOLLOW_ANIMATION_in_animBlock1257); 
			ANIMATION42_tree = (CommonTree)adaptor.create(ANIMATION42);
			adaptor.addChild(root_0, ANIMATION42_tree);
			dbg.location(85,26);
			LDF43=(Token)match(input,LDF,FOLLOW_LDF_in_animBlock1259); 
			LDF43_tree = (CommonTree)adaptor.create(LDF43);
			adaptor.addChild(root_0, LDF43_tree);
			dbg.location(85,36);
			OPARAN44=(Token)match(input,OPARAN,FOLLOW_OPARAN_in_animBlock1261); dbg.location(85,38);
			pushFollow(FOLLOW_objType_in_animBlock1264);
			objType45=objType();
			state._fsp--;

			adaptor.addChild(root_0, objType45.getTree());
			dbg.location(85,46);
			LDF46=(Token)match(input,LDF,FOLLOW_LDF_in_animBlock1266); 
			LDF46_tree = (CommonTree)adaptor.create(LDF46);
			adaptor.addChild(root_0, LDF46_tree);
			dbg.location(85,56);
			CPARAN47=(Token)match(input,CPARAN,FOLLOW_CPARAN_in_animBlock1268); dbg.location(85,58);
			pushFollow(FOLLOW_stmtBlock_in_animBlock1271);
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
		dbg.location(85, 67);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:86:1: eventBlock : ON ^ keyStroke stmtBlock ;
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
		dbg.location(86, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:86:14: ( ON ^ keyStroke stmtBlock )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:86:16: ON ^ keyStroke stmtBlock
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(86,18);
			ON49=(Token)match(input,ON,FOLLOW_ON_in_eventBlock1281); 
			ON49_tree = (CommonTree)adaptor.create(ON49);
			root_0 = (CommonTree)adaptor.becomeRoot(ON49_tree, root_0);
			dbg.location(86,20);
			pushFollow(FOLLOW_keyStroke_in_eventBlock1284);
			keyStroke50=keyStroke();
			state._fsp--;

			adaptor.addChild(root_0, keyStroke50.getTree());
			dbg.location(86,30);
			pushFollow(FOLLOW_stmtBlock_in_eventBlock1286);
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
		dbg.location(86, 39);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:87:1: keyStroke : ( SPACE | LEFTARROW | RIGHTARROW | UPARROW | DOWNARROW );
	public final MGPLParser.keyStroke_return keyStroke() throws RecognitionException {
		MGPLParser.keyStroke_return retval = new MGPLParser.keyStroke_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token set52=null;

		CommonTree set52_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "keyStroke");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(87, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:87:14: ( SPACE | LEFTARROW | RIGHTARROW | UPARROW | DOWNARROW )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(87,14);
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
		dbg.location(91, 13);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:92:1: stmtBlock : OCURBRA ! ( stmt )* CCURBRA !;
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
		dbg.location(92, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:92:14: ( OCURBRA ! ( stmt )* CCURBRA !)
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:92:16: OCURBRA ! ( stmt )* CCURBRA !
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(92,23);
			OCURBRA53=(Token)match(input,OCURBRA,FOLLOW_OCURBRA_in_stmtBlock1332); dbg.location(92,25);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:92:25: ( stmt )*
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

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:92:25: stmt
					{
					dbg.location(92,25);
					pushFollow(FOLLOW_stmt_in_stmtBlock1335);
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
			dbg.location(92,38);
			CCURBRA55=(Token)match(input,CCURBRA,FOLLOW_CCURBRA_in_stmtBlock1338); 
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
		dbg.location(92, 39);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:93:1: stmt : ( ifStmt | forStmt | assStmt );
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
		dbg.location(93, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:93:14: ( ifStmt | forStmt | assStmt )
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

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:93:16: ifStmt
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(93,16);
					pushFollow(FOLLOW_ifStmt_in_stmt1355);
					ifStmt56=ifStmt();
					state._fsp--;

					adaptor.addChild(root_0, ifStmt56.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:94:4: forStmt
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(94,4);
					pushFollow(FOLLOW_forStmt_in_stmt1361);
					forStmt57=forStmt();
					state._fsp--;

					adaptor.addChild(root_0, forStmt57.getTree());

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:95:4: assStmt
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(95,4);
					pushFollow(FOLLOW_assStmt_in_stmt1367);
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
		dbg.location(95, 10);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:96:1: ifStmt : IF ^ OPARAN ! expr CPARAN ! stmtBlock ( ELSE ^ stmtBlock )? ;
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
		dbg.location(96, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:96:14: ( IF ^ OPARAN ! expr CPARAN ! stmtBlock ( ELSE ^ stmtBlock )? )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:96:16: IF ^ OPARAN ! expr CPARAN ! stmtBlock ( ELSE ^ stmtBlock )?
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(96,18);
			IF59=(Token)match(input,IF,FOLLOW_IF_in_ifStmt1380); 
			IF59_tree = (CommonTree)adaptor.create(IF59);
			root_0 = (CommonTree)adaptor.becomeRoot(IF59_tree, root_0);
			dbg.location(96,26);
			OPARAN60=(Token)match(input,OPARAN,FOLLOW_OPARAN_in_ifStmt1383); dbg.location(96,28);
			pushFollow(FOLLOW_expr_in_ifStmt1386);
			expr61=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr61.getTree());
			dbg.location(96,39);
			CPARAN62=(Token)match(input,CPARAN,FOLLOW_CPARAN_in_ifStmt1388); dbg.location(96,41);
			pushFollow(FOLLOW_stmtBlock_in_ifStmt1391);
			stmtBlock63=stmtBlock();
			state._fsp--;

			adaptor.addChild(root_0, stmtBlock63.getTree());
			dbg.location(96,51);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:96:51: ( ELSE ^ stmtBlock )?
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

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:96:53: ELSE ^ stmtBlock
					{
					dbg.location(96,57);
					ELSE64=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStmt1395); 
					ELSE64_tree = (CommonTree)adaptor.create(ELSE64);
					root_0 = (CommonTree)adaptor.becomeRoot(ELSE64_tree, root_0);
					dbg.location(96,59);
					pushFollow(FOLLOW_stmtBlock_in_ifStmt1398);
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
		dbg.location(96, 70);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:97:1: forStmt : FOR ^ OPARAN ! assStmt2 SEMIKOL ! expr SEMIKOL ! assStmt2 CPARAN ! stmtBlock ;
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
		dbg.location(97, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:97:14: ( FOR ^ OPARAN ! assStmt2 SEMIKOL ! expr SEMIKOL ! assStmt2 CPARAN ! stmtBlock )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:97:16: FOR ^ OPARAN ! assStmt2 SEMIKOL ! expr SEMIKOL ! assStmt2 CPARAN ! stmtBlock
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(97,19);
			FOR66=(Token)match(input,FOR,FOLLOW_FOR_in_forStmt1413); 
			FOR66_tree = (CommonTree)adaptor.create(FOR66);
			root_0 = (CommonTree)adaptor.becomeRoot(FOR66_tree, root_0);
			dbg.location(97,27);
			OPARAN67=(Token)match(input,OPARAN,FOLLOW_OPARAN_in_forStmt1416); dbg.location(97,29);
			pushFollow(FOLLOW_assStmt2_in_forStmt1419);
			assStmt268=assStmt2();
			state._fsp--;

			adaptor.addChild(root_0, assStmt268.getTree());
			dbg.location(97,45);
			SEMIKOL69=(Token)match(input,SEMIKOL,FOLLOW_SEMIKOL_in_forStmt1421); dbg.location(97,47);
			pushFollow(FOLLOW_expr_in_forStmt1424);
			expr70=expr();
			state._fsp--;

			adaptor.addChild(root_0, expr70.getTree());
			dbg.location(97,59);
			SEMIKOL71=(Token)match(input,SEMIKOL,FOLLOW_SEMIKOL_in_forStmt1426); dbg.location(97,61);
			pushFollow(FOLLOW_assStmt2_in_forStmt1429);
			assStmt272=assStmt2();
			state._fsp--;

			adaptor.addChild(root_0, assStmt272.getTree());
			dbg.location(97,76);
			CPARAN73=(Token)match(input,CPARAN,FOLLOW_CPARAN_in_forStmt1431); dbg.location(97,78);
			pushFollow(FOLLOW_stmtBlock_in_forStmt1434);
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
		dbg.location(97, 86);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:98:1: assStmt2 : var ASSIGN ^ expr ;
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
		dbg.location(98, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:98:11: ( var ASSIGN ^ expr )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:98:13: var ASSIGN ^ expr
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(98,13);
			pushFollow(FOLLOW_var_in_assStmt21442);
			var75=var();
			state._fsp--;

			adaptor.addChild(root_0, var75.getTree());
			dbg.location(98,23);
			ASSIGN76=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assStmt21444); 
			ASSIGN76_tree = (CommonTree)adaptor.create(ASSIGN76);
			root_0 = (CommonTree)adaptor.becomeRoot(ASSIGN76_tree, root_0);
			dbg.location(98,25);
			pushFollow(FOLLOW_expr_in_assStmt21447);
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
		dbg.location(98, 29);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:99:1: assStmt : var ASSIGN expr SEMIKOL -> ^( ASSIGNMENT[\"Assignment\"] var ASSIGN expr ) ;
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
		RewriteRuleTokenStream stream_SEMIKOL=new RewriteRuleTokenStream(adaptor,"token SEMIKOL");
		RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
		RewriteRuleSubtreeStream stream_var=new RewriteRuleSubtreeStream(adaptor,"rule var");
		RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");

		try { dbg.enterRule(getGrammarFileName(), "assStmt");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(99, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:99:14: ( var ASSIGN expr SEMIKOL -> ^( ASSIGNMENT[\"Assignment\"] var ASSIGN expr ) )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:99:16: var ASSIGN expr SEMIKOL
			{
			dbg.location(99,16);
			pushFollow(FOLLOW_var_in_assStmt1460);
			var78=var();
			state._fsp--;

			stream_var.add(var78.getTree());dbg.location(99,20);
			ASSIGN79=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assStmt1462);  
			stream_ASSIGN.add(ASSIGN79);
			dbg.location(99,27);
			pushFollow(FOLLOW_expr_in_assStmt1464);
			expr80=expr();
			state._fsp--;

			stream_expr.add(expr80.getTree());dbg.location(99,32);
			SEMIKOL81=(Token)match(input,SEMIKOL,FOLLOW_SEMIKOL_in_assStmt1466);  
			stream_SEMIKOL.add(SEMIKOL81);

			// AST REWRITE
			// elements: expr, ASSIGN, var
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (CommonTree)adaptor.nil();
			// 99:40: -> ^( ASSIGNMENT[\"Assignment\"] var ASSIGN expr )
			{
				dbg.location(99,43);
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:99:43: ^( ASSIGNMENT[\"Assignment\"] var ASSIGN expr )
				{
				CommonTree root_1 = (CommonTree)adaptor.nil();
				dbg.location(99,45);
				root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGNMENT, "Assignment"), root_1);
				dbg.location(99,70);
				adaptor.addChild(root_1, stream_var.nextTree());dbg.location(99,74);
				adaptor.addChild(root_1, stream_ASSIGN.nextNode());dbg.location(99,81);
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
		dbg.location(99, 85);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:100:1: var : LDF ^ ( OBRACKET ! expr CBRACKET ! ( DOT LDF )? | DOT LDF )? ;
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
		dbg.location(100, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:100:14: ( LDF ^ ( OBRACKET ! expr CBRACKET ! ( DOT LDF )? | DOT LDF )? )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:101:2: LDF ^ ( OBRACKET ! expr CBRACKET ! ( DOT LDF )? | DOT LDF )?
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(101,5);
			LDF82=(Token)match(input,LDF,FOLLOW_LDF_in_var1498); 
			LDF82_tree = (CommonTree)adaptor.create(LDF82);
			root_0 = (CommonTree)adaptor.becomeRoot(LDF82_tree, root_0);
			dbg.location(101,7);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:101:7: ( OBRACKET ! expr CBRACKET ! ( DOT LDF )? | DOT LDF )?
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

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:101:9: OBRACKET ! expr CBRACKET ! ( DOT LDF )?
					{
					dbg.location(101,17);
					OBRACKET83=(Token)match(input,OBRACKET,FOLLOW_OBRACKET_in_var1503); dbg.location(101,19);
					pushFollow(FOLLOW_expr_in_var1506);
					expr84=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr84.getTree());
					dbg.location(101,32);
					CBRACKET85=(Token)match(input,CBRACKET,FOLLOW_CBRACKET_in_var1508); dbg.location(101,34);
					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:101:34: ( DOT LDF )?
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

							// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:101:36: DOT LDF
							{
							dbg.location(101,36);
							DOT86=(Token)match(input,DOT,FOLLOW_DOT_in_var1513); 
							DOT86_tree = (CommonTree)adaptor.create(DOT86);
							adaptor.addChild(root_0, DOT86_tree);
							dbg.location(101,40);
							LDF87=(Token)match(input,LDF,FOLLOW_LDF_in_var1515); 
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

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:102:5: DOT LDF
					{
					dbg.location(102,5);
					DOT88=(Token)match(input,DOT,FOLLOW_DOT_in_var1524); 
					DOT88_tree = (CommonTree)adaptor.create(DOT88);
					adaptor.addChild(root_0, DOT88_tree);
					dbg.location(102,9);
					LDF89=(Token)match(input,LDF,FOLLOW_LDF_in_var1526); 
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
		dbg.location(103, 1);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:106:1: expr : ( OPARAN ! expr CPARAN !| ( op ( OPARAN ! expr CPARAN !)? )* );
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
		dbg.location(106, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:106:7: ( OPARAN ! expr CPARAN !| ( op ( OPARAN ! expr CPARAN !)? )* )
			int alt18=2;
			try { dbg.enterDecision(18, decisionCanBacktrack[18]);

			int LA18_0 = input.LA(1);
			if ( (LA18_0==OPARAN) ) {
				alt18=1;
			}
			else if ( (LA18_0==CBRACKET||(LA18_0 >= COMMA && LA18_0 <= CPARAN)||LA18_0==LDF||LA18_0==MINUS||(LA18_0 >= NOT && LA18_0 <= NUMBER)||LA18_0==SEMIKOL) ) {
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

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:106:10: OPARAN ! expr CPARAN !
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(106,16);
					OPARAN90=(Token)match(input,OPARAN,FOLLOW_OPARAN_in_expr1541); dbg.location(106,18);
					pushFollow(FOLLOW_expr_in_expr1544);
					expr91=expr();
					state._fsp--;

					adaptor.addChild(root_0, expr91.getTree());
					dbg.location(106,29);
					CPARAN92=(Token)match(input,CPARAN,FOLLOW_CPARAN_in_expr1546); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:107:4: ( op ( OPARAN ! expr CPARAN !)? )*
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(107,4);
					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:107:4: ( op ( OPARAN ! expr CPARAN !)? )*
					try { dbg.enterSubRule(17);

					loop17:
					while (true) {
						int alt17=2;
						try { dbg.enterDecision(17, decisionCanBacktrack[17]);

						int LA17_0 = input.LA(1);
						if ( (LA17_0==LDF||LA17_0==MINUS||(LA17_0 >= NOT && LA17_0 <= NUMBER)) ) {
							alt17=1;
						}

						} finally {dbg.exitDecision(17);}

						switch (alt17) {
						case 1 :
							dbg.enterAlt(1);

							// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:107:5: op ( OPARAN ! expr CPARAN !)?
							{
							dbg.location(107,5);
							pushFollow(FOLLOW_op_in_expr1554);
							op93=op();
							state._fsp--;

							adaptor.addChild(root_0, op93.getTree());
							dbg.location(107,8);
							// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:107:8: ( OPARAN ! expr CPARAN !)?
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

									// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:107:9: OPARAN ! expr CPARAN !
									{
									dbg.location(107,15);
									OPARAN94=(Token)match(input,OPARAN,FOLLOW_OPARAN_in_expr1557); dbg.location(107,17);
									pushFollow(FOLLOW_expr_in_expr1560);
									expr95=expr();
									state._fsp--;

									adaptor.addChild(root_0, expr95.getTree());
									dbg.location(107,28);
									CPARAN96=(Token)match(input,CPARAN,FOLLOW_CPARAN_in_expr1562); 
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
		dbg.location(107, 34);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:108:1: op : konjunkt ( OR ^ konjunkt )* ;
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
		dbg.location(108, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:108:5: ( konjunkt ( OR ^ konjunkt )* )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:108:7: konjunkt ( OR ^ konjunkt )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(108,7);
			pushFollow(FOLLOW_konjunkt_in_op1577);
			konjunkt97=konjunkt();
			state._fsp--;

			adaptor.addChild(root_0, konjunkt97.getTree());
			dbg.location(108,16);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:108:16: ( OR ^ konjunkt )*
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

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:108:17: OR ^ konjunkt
					{
					dbg.location(108,19);
					OR98=(Token)match(input,OR,FOLLOW_OR_in_op1580); 
					OR98_tree = (CommonTree)adaptor.create(OR98);
					root_0 = (CommonTree)adaptor.becomeRoot(OR98_tree, root_0);
					dbg.location(108,21);
					pushFollow(FOLLOW_konjunkt_in_op1583);
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
		dbg.location(108, 31);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:109:1: konjunkt : relat ( AND ^ relat )* ;
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
		dbg.location(109, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:109:10: ( relat ( AND ^ relat )* )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:109:12: relat ( AND ^ relat )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(109,12);
			pushFollow(FOLLOW_relat_in_konjunkt1593);
			relat100=relat();
			state._fsp--;

			adaptor.addChild(root_0, relat100.getTree());
			dbg.location(109,18);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:109:18: ( AND ^ relat )*
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

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:109:19: AND ^ relat
					{
					dbg.location(109,22);
					AND101=(Token)match(input,AND,FOLLOW_AND_in_konjunkt1596); 
					AND101_tree = (CommonTree)adaptor.create(AND101);
					root_0 = (CommonTree)adaptor.becomeRoot(AND101_tree, root_0);
					dbg.location(109,24);
					pushFollow(FOLLOW_relat_in_konjunkt1599);
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
		dbg.location(109, 31);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:110:1: relat : add ( ( EQUALS | LESS | LEQ ) ^ add )* ;
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
		dbg.location(110, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:110:7: ( add ( ( EQUALS | LESS | LEQ ) ^ add )* )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:110:9: add ( ( EQUALS | LESS | LEQ ) ^ add )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(110,9);
			pushFollow(FOLLOW_add_in_relat1609);
			add103=add();
			state._fsp--;

			adaptor.addChild(root_0, add103.getTree());
			dbg.location(110,13);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:110:13: ( ( EQUALS | LESS | LEQ ) ^ add )*
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

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:110:14: ( EQUALS | LESS | LEQ ) ^ add
					{
					dbg.location(110,35);
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
					}dbg.location(110,37);
					pushFollow(FOLLOW_add_in_relat1625);
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
		dbg.location(110, 42);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:111:1: add : mult ( ( PLUS | MINUS ) ^ mult )* ;
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
		dbg.location(111, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:111:5: ( mult ( ( PLUS | MINUS ) ^ mult )* )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:111:7: mult ( ( PLUS | MINUS ) ^ mult )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(111,7);
			pushFollow(FOLLOW_mult_in_add1635);
			mult106=mult();
			state._fsp--;

			adaptor.addChild(root_0, mult106.getTree());
			dbg.location(111,12);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:111:12: ( ( PLUS | MINUS ) ^ mult )*
			try { dbg.enterSubRule(22);

			loop22:
			while (true) {
				int alt22=2;
				try { dbg.enterDecision(22, decisionCanBacktrack[22]);

				int LA22_0 = input.LA(1);
				if ( (LA22_0==MINUS) ) {
					int LA22_10 = input.LA(2);
					if ( (LA22_10==NUMBER) ) {
						alt22=1;
					}
					else if ( (LA22_10==LDF||LA22_10==MINUS||LA22_10==NOT) ) {
						alt22=1;
					}

				}
				else if ( (LA22_0==PLUS) ) {
					alt22=1;
				}

				} finally {dbg.exitDecision(22);}

				switch (alt22) {
				case 1 :
					dbg.enterAlt(1);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:111:13: ( PLUS | MINUS ) ^ mult
					{
					dbg.location(111,27);
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
					}dbg.location(111,29);
					pushFollow(FOLLOW_mult_in_add1647);
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
		dbg.location(111, 35);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:112:1: mult : unary ( ( MULT | DIV ) ^ unary )* ;
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
		dbg.location(112, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:112:6: ( unary ( ( MULT | DIV ) ^ unary )* )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:112:8: unary ( ( MULT | DIV ) ^ unary )*
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(112,8);
			pushFollow(FOLLOW_unary_in_mult1657);
			unary109=unary();
			state._fsp--;

			adaptor.addChild(root_0, unary109.getTree());
			dbg.location(112,14);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:112:14: ( ( MULT | DIV ) ^ unary )*
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

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:112:15: ( MULT | DIV ) ^ unary
					{
					dbg.location(112,28);
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
					}dbg.location(112,30);
					pushFollow(FOLLOW_unary_in_mult1670);
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
		dbg.location(112, 37);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:113:1: unary : ( NOT ^| MINUS ^)? atom ;
	public final MGPLParser.unary_return unary() throws RecognitionException {
		MGPLParser.unary_return retval = new MGPLParser.unary_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token NOT112=null;
		Token MINUS113=null;
		ParserRuleReturnScope atom114 =null;

		CommonTree NOT112_tree=null;
		CommonTree MINUS113_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "unary");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(113, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:113:7: ( ( NOT ^| MINUS ^)? atom )
			dbg.enterAlt(1);

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:113:9: ( NOT ^| MINUS ^)? atom
			{
			root_0 = (CommonTree)adaptor.nil();


			dbg.location(113,9);
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:113:9: ( NOT ^| MINUS ^)?
			int alt24=3;
			try { dbg.enterSubRule(24);
			try { dbg.enterDecision(24, decisionCanBacktrack[24]);

			int LA24_0 = input.LA(1);
			if ( (LA24_0==NOT) ) {
				alt24=1;
			}
			else if ( (LA24_0==MINUS) ) {
				alt24=2;
			}
			} finally {dbg.exitDecision(24);}

			switch (alt24) {
				case 1 :
					dbg.enterAlt(1);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:113:10: NOT ^
					{
					dbg.location(113,13);
					NOT112=(Token)match(input,NOT,FOLLOW_NOT_in_unary1681); 
					NOT112_tree = (CommonTree)adaptor.create(NOT112);
					root_0 = (CommonTree)adaptor.becomeRoot(NOT112_tree, root_0);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:113:17: MINUS ^
					{
					dbg.location(113,22);
					MINUS113=(Token)match(input,MINUS,FOLLOW_MINUS_in_unary1686); 
					MINUS113_tree = (CommonTree)adaptor.create(MINUS113);
					root_0 = (CommonTree)adaptor.becomeRoot(MINUS113_tree, root_0);

					}
					break;

			}
			} finally {dbg.exitSubRule(24);}
			dbg.location(113,26);
			pushFollow(FOLLOW_atom_in_unary1691);
			atom114=atom();
			state._fsp--;

			adaptor.addChild(root_0, atom114.getTree());

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
		dbg.location(113, 30);

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
	// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:114:1: atom : ( NUMBER | var ( TOUCHES ^ var )? );
	public final MGPLParser.atom_return atom() throws RecognitionException {
		MGPLParser.atom_return retval = new MGPLParser.atom_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		Token NUMBER115=null;
		Token TOUCHES117=null;
		ParserRuleReturnScope var116 =null;
		ParserRuleReturnScope var118 =null;

		CommonTree NUMBER115_tree=null;
		CommonTree TOUCHES117_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "atom");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(114, 0);

		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:114:7: ( NUMBER | var ( TOUCHES ^ var )? )
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

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:114:9: NUMBER
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(114,9);
					NUMBER115=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_atom1700); 
					NUMBER115_tree = (CommonTree)adaptor.create(NUMBER115);
					adaptor.addChild(root_0, NUMBER115_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:115:4: var ( TOUCHES ^ var )?
					{
					root_0 = (CommonTree)adaptor.nil();


					dbg.location(115,4);
					pushFollow(FOLLOW_var_in_atom1706);
					var116=var();
					state._fsp--;

					adaptor.addChild(root_0, var116.getTree());
					dbg.location(115,9);
					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:115:9: ( TOUCHES ^ var )?
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

							// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:115:10: TOUCHES ^ var
							{
							dbg.location(115,17);
							TOUCHES117=(Token)match(input,TOUCHES,FOLLOW_TOUCHES_in_atom1710); 
							TOUCHES117_tree = (CommonTree)adaptor.create(TOUCHES117);
							root_0 = (CommonTree)adaptor.becomeRoot(TOUCHES117_tree, root_0);
							dbg.location(115,19);
							pushFollow(FOLLOW_var_in_atom1713);
							var118=var();
							state._fsp--;

							adaptor.addChild(root_0, var118.getTree());

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
		dbg.location(115, 24);

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



	public static final BitSet FOLLOW_GAME_in_prog952 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_LDF_in_prog954 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_OPARAN_in_prog956 = new BitSet(new long[]{0x0000000008008000L});
	public static final BitSet FOLLOW_attrAssList_in_prog958 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CPARAN_in_prog961 = new BitSet(new long[]{0x0008104004002000L});
	public static final BitSet FOLLOW_decl_in_prog963 = new BitSet(new long[]{0x0008104004002000L});
	public static final BitSet FOLLOW_stmtBlock_in_prog966 = new BitSet(new long[]{0x0000008000000042L});
	public static final BitSet FOLLOW_block_in_prog968 = new BitSet(new long[]{0x0000008000000042L});
	public static final BitSet FOLLOW_varDecl_in_decl1020 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_SEMIKOL_in_decl1022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objDecl_in_decl1038 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_SEMIKOL_in_decl1040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_varDecl1063 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_LDF_in_varDecl1066 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_init_in_varDecl1068 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_varDecl1076 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_LDF_in_varDecl1079 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_OBRACKET_in_varDecl1081 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_NUMBER_in_varDecl1084 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBRACKET_in_varDecl1086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ASSIGN_in_init1103 = new BitSet(new long[]{0x0000010D08000000L});
	public static final BitSet FOLLOW_expr_in_init1105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objType_in_objDecl1118 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_LDF_in_objDecl1120 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_OPARAN_in_objDecl1123 = new BitSet(new long[]{0x0000000008008000L});
	public static final BitSet FOLLOW_attrAssList_in_objDecl1126 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CPARAN_in_objDecl1129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_objType_in_objDecl1136 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_LDF_in_objDecl1138 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_OBRACKET_in_objDecl1141 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_NUMBER_in_objDecl1144 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBRACKET_in_objDecl1146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_attrAss_in_attrAssList1175 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_COMMA_in_attrAssList1178 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_attrAss_in_attrAssList1180 = new BitSet(new long[]{0x0000000000004002L});
	public static final BitSet FOLLOW_LDF_in_attrAss1190 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASSIGN_in_attrAss1192 = new BitSet(new long[]{0x0000010D08000000L});
	public static final BitSet FOLLOW_expr_in_attrAss1194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_animBlock_in_block1223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_eventBlock_in_block1238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANIMATION_in_animBlock1257 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_LDF_in_animBlock1259 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_OPARAN_in_animBlock1261 = new BitSet(new long[]{0x0008100000002000L});
	public static final BitSet FOLLOW_objType_in_animBlock1264 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_LDF_in_animBlock1266 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CPARAN_in_animBlock1268 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_stmtBlock_in_animBlock1271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ON_in_eventBlock1281 = new BitSet(new long[]{0x0011200010080000L});
	public static final BitSet FOLLOW_keyStroke_in_eventBlock1284 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_stmtBlock_in_eventBlock1286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OCURBRA_in_stmtBlock1332 = new BitSet(new long[]{0x000000000A801000L});
	public static final BitSet FOLLOW_stmt_in_stmtBlock1335 = new BitSet(new long[]{0x000000000A801000L});
	public static final BitSet FOLLOW_CCURBRA_in_stmtBlock1338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifStmt_in_stmt1355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forStmt_in_stmt1361 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assStmt_in_stmt1367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifStmt1380 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_OPARAN_in_ifStmt1383 = new BitSet(new long[]{0x0000010D08008000L});
	public static final BitSet FOLLOW_expr_in_ifStmt1386 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CPARAN_in_ifStmt1388 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_stmtBlock_in_ifStmt1391 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_ELSE_in_ifStmt1395 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_stmtBlock_in_ifStmt1398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_in_forStmt1413 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_OPARAN_in_forStmt1416 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_assStmt2_in_forStmt1419 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_SEMIKOL_in_forStmt1421 = new BitSet(new long[]{0x0000410D08000000L});
	public static final BitSet FOLLOW_expr_in_forStmt1424 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_SEMIKOL_in_forStmt1426 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_assStmt2_in_forStmt1429 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CPARAN_in_forStmt1431 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_stmtBlock_in_forStmt1434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_in_assStmt21442 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASSIGN_in_assStmt21444 = new BitSet(new long[]{0x0000010D08000000L});
	public static final BitSet FOLLOW_expr_in_assStmt21447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_in_assStmt1460 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ASSIGN_in_assStmt1462 = new BitSet(new long[]{0x0000410D08000000L});
	public static final BitSet FOLLOW_expr_in_assStmt1464 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_SEMIKOL_in_assStmt1466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LDF_in_var1498 = new BitSet(new long[]{0x0000002000040002L});
	public static final BitSet FOLLOW_OBRACKET_in_var1503 = new BitSet(new long[]{0x0000010D08000800L});
	public static final BitSet FOLLOW_expr_in_var1506 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CBRACKET_in_var1508 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_DOT_in_var1513 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_LDF_in_var1515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOT_in_var1524 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_LDF_in_var1526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPARAN_in_expr1541 = new BitSet(new long[]{0x0000010D08008000L});
	public static final BitSet FOLLOW_expr_in_expr1544 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CPARAN_in_expr1546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_op_in_expr1554 = new BitSet(new long[]{0x0000010D08000002L});
	public static final BitSet FOLLOW_OPARAN_in_expr1557 = new BitSet(new long[]{0x0000010D08008000L});
	public static final BitSet FOLLOW_expr_in_expr1560 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_CPARAN_in_expr1562 = new BitSet(new long[]{0x0000000D08000002L});
	public static final BitSet FOLLOW_konjunkt_in_op1577 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_OR_in_op1580 = new BitSet(new long[]{0x0000000D08000000L});
	public static final BitSet FOLLOW_konjunkt_in_op1583 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_relat_in_konjunkt1593 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_konjunkt1596 = new BitSet(new long[]{0x0000000D08000000L});
	public static final BitSet FOLLOW_relat_in_konjunkt1599 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_add_in_relat1609 = new BitSet(new long[]{0x0000000060200002L});
	public static final BitSet FOLLOW_set_in_relat1612 = new BitSet(new long[]{0x0000000D08000000L});
	public static final BitSet FOLLOW_add_in_relat1625 = new BitSet(new long[]{0x0000000060200002L});
	public static final BitSet FOLLOW_mult_in_add1635 = new BitSet(new long[]{0x0000040100000002L});
	public static final BitSet FOLLOW_set_in_add1638 = new BitSet(new long[]{0x0000000D08000000L});
	public static final BitSet FOLLOW_mult_in_add1647 = new BitSet(new long[]{0x0000040100000002L});
	public static final BitSet FOLLOW_unary_in_mult1657 = new BitSet(new long[]{0x0000000200020002L});
	public static final BitSet FOLLOW_set_in_mult1660 = new BitSet(new long[]{0x0000000D08000000L});
	public static final BitSet FOLLOW_unary_in_mult1670 = new BitSet(new long[]{0x0000000200020002L});
	public static final BitSet FOLLOW_NOT_in_unary1681 = new BitSet(new long[]{0x0000000808000000L});
	public static final BitSet FOLLOW_MINUS_in_unary1686 = new BitSet(new long[]{0x0000000808000000L});
	public static final BitSet FOLLOW_atom_in_unary1691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMBER_in_atom1700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_var_in_atom1706 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_TOUCHES_in_atom1710 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_var_in_atom1713 = new BitSet(new long[]{0x0000000000000002L});
}
