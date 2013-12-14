// $ANTLR 3.5.1 /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g 2013-12-14 21:32:14

package antlr.projekt2;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MGPLLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public MGPLLexer() {} 
	public MGPLLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public MGPLLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/phrizzel/ponyshit/repo/compilerbau/MGPL.g"; }

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:6:5: ( '&&' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:6:7: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "ANIMATION"
	public final void mANIMATION() throws RecognitionException {
		try {
			int _type = ANIMATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:7:11: ( 'animation' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:7:13: 'animation'
			{
			match("animation"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ANIMATION"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:8:8: ( '=' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:8:10: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "CBRACKET"
	public final void mCBRACKET() throws RecognitionException {
		try {
			int _type = CBRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:9:10: ( ']' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:9:12: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CBRACKET"

	// $ANTLR start "CCURBRA"
	public final void mCCURBRA() throws RecognitionException {
		try {
			int _type = CCURBRA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:10:9: ( '}' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:10:11: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CCURBRA"

	// $ANTLR start "CIRCLE"
	public final void mCIRCLE() throws RecognitionException {
		try {
			int _type = CIRCLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:11:8: ( 'circle' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:11:10: 'circle'
			{
			match("circle"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CIRCLE"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:12:7: ( ',' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:12:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "CPARAN"
	public final void mCPARAN() throws RecognitionException {
		try {
			int _type = CPARAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:13:8: ( ')' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:13:10: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CPARAN"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:14:5: ( '/' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:14:7: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:15:5: ( '.' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:15:7: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "DOWNARROW"
	public final void mDOWNARROW() throws RecognitionException {
		try {
			int _type = DOWNARROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:16:11: ( 'downarrow' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:16:13: 'downarrow'
			{
			match("downarrow"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOWNARROW"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:17:6: ( 'else' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:17:8: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "EQUALS"
	public final void mEQUALS() throws RecognitionException {
		try {
			int _type = EQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:18:8: ( '==' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:18:10: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUALS"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:19:5: ( 'for' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:19:7: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "GAME"
	public final void mGAME() throws RecognitionException {
		try {
			int _type = GAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:20:6: ( 'game' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:20:8: 'game'
			{
			match("game"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GAME"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:21:4: ( 'if' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:21:6: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:22:5: ( 'int' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:22:7: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "LEFTARROW"
	public final void mLEFTARROW() throws RecognitionException {
		try {
			int _type = LEFTARROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:23:11: ( 'leftarrow' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:23:13: 'leftarrow'
			{
			match("leftarrow"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEFTARROW"

	// $ANTLR start "LEQ"
	public final void mLEQ() throws RecognitionException {
		try {
			int _type = LEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:24:5: ( '<=' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:24:7: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEQ"

	// $ANTLR start "LESS"
	public final void mLESS() throws RecognitionException {
		try {
			int _type = LESS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:25:6: ( '<' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:25:8: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:26:7: ( '-' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:26:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "MULT"
	public final void mMULT() throws RecognitionException {
		try {
			int _type = MULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:27:6: ( '*' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:27:8: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULT"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:28:5: ( '!' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:28:7: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "OBRACKET"
	public final void mOBRACKET() throws RecognitionException {
		try {
			int _type = OBRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:29:10: ( '[' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:29:12: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OBRACKET"

	// $ANTLR start "OCURBRA"
	public final void mOCURBRA() throws RecognitionException {
		try {
			int _type = OCURBRA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:30:9: ( '{' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:30:11: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCURBRA"

	// $ANTLR start "ON"
	public final void mON() throws RecognitionException {
		try {
			int _type = ON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:31:4: ( 'on' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:31:6: 'on'
			{
			match("on"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ON"

	// $ANTLR start "OPARAN"
	public final void mOPARAN() throws RecognitionException {
		try {
			int _type = OPARAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:32:8: ( '(' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:32:10: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPARAN"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:33:4: ( '||' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:33:6: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:34:6: ( '+' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:34:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "RECTANGLE"
	public final void mRECTANGLE() throws RecognitionException {
		try {
			int _type = RECTANGLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:35:11: ( 'rectangle' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:35:13: 'rectangle'
			{
			match("rectangle"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RECTANGLE"

	// $ANTLR start "RIGHTARROW"
	public final void mRIGHTARROW() throws RecognitionException {
		try {
			int _type = RIGHTARROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:36:12: ( 'rightarrow' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:36:14: 'rightarrow'
			{
			match("rightarrow"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RIGHTARROW"

	// $ANTLR start "SEMIKOL"
	public final void mSEMIKOL() throws RecognitionException {
		try {
			int _type = SEMIKOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:37:9: ( ';' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:37:11: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMIKOL"

	// $ANTLR start "SPACE"
	public final void mSPACE() throws RecognitionException {
		try {
			int _type = SPACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:38:7: ( 'space' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:38:9: 'space'
			{
			match("space"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SPACE"

	// $ANTLR start "TOUCHES"
	public final void mTOUCHES() throws RecognitionException {
		try {
			int _type = TOUCHES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:39:9: ( 'touches' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:39:11: 'touches'
			{
			match("touches"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TOUCHES"

	// $ANTLR start "TRIANGLE"
	public final void mTRIANGLE() throws RecognitionException {
		try {
			int _type = TRIANGLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:40:10: ( 'triangle' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:40:12: 'triangle'
			{
			match("triangle"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRIANGLE"

	// $ANTLR start "UPARROW"
	public final void mUPARROW() throws RecognitionException {
		try {
			int _type = UPARROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:41:9: ( 'uparrow' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:41:11: 'uparrow'
			{
			match("uparrow"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UPARROW"

	// $ANTLR start "LDF"
	public final void mLDF() throws RecognitionException {
		try {
			int _type = LDF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:92:21: ( ( LOWCASE | UPCASE ) ( '_' | DIGIT | LOWCASE | UPCASE )* )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:92:25: ( LOWCASE | UPCASE ) ( '_' | DIGIT | LOWCASE | UPCASE )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:92:45: ( '_' | DIGIT | LOWCASE | UPCASE )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LDF"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:93:21: ( ( DIGIT )+ )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:93:25: ( DIGIT )+
			{
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:93:25: ( DIGIT )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "LOWCASE"
	public final void mLOWCASE() throws RecognitionException {
		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:94:21: ( 'a' .. 'z' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOWCASE"

	// $ANTLR start "UPCASE"
	public final void mUPCASE() throws RecognitionException {
		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:95:21: ( 'A' .. 'Z' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UPCASE"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:96:21: ( '0' .. '9' )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:97:9: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:97:11: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "SINGLE_COMMENT"
	public final void mSINGLE_COMMENT() throws RecognitionException {
		try {
			int _type = SINGLE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:100:20: ( '//' (~ ( '\\r' | '\\n' ) )* )
			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:100:22: '//' (~ ( '\\r' | '\\n' ) )*
			{
			match("//"); 

			// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:100:27: (~ ( '\\r' | '\\n' ) )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			 skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SINGLE_COMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:8: ( AND | ANIMATION | ASSIGN | CBRACKET | CCURBRA | CIRCLE | COMMA | CPARAN | DIV | DOT | DOWNARROW | ELSE | EQUALS | FOR | GAME | IF | INT | LEFTARROW | LEQ | LESS | MINUS | MULT | NOT | OBRACKET | OCURBRA | ON | OPARAN | OR | PLUS | RECTANGLE | RIGHTARROW | SEMIKOL | SPACE | TOUCHES | TRIANGLE | UPARROW | LDF | NUMBER | WS | SINGLE_COMMENT )
		int alt4=40;
		alt4 = dfa4.predict(input);
		switch (alt4) {
			case 1 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:10: AND
				{
				mAND(); 

				}
				break;
			case 2 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:14: ANIMATION
				{
				mANIMATION(); 

				}
				break;
			case 3 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:24: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 4 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:31: CBRACKET
				{
				mCBRACKET(); 

				}
				break;
			case 5 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:40: CCURBRA
				{
				mCCURBRA(); 

				}
				break;
			case 6 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:48: CIRCLE
				{
				mCIRCLE(); 

				}
				break;
			case 7 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:55: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 8 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:61: CPARAN
				{
				mCPARAN(); 

				}
				break;
			case 9 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:68: DIV
				{
				mDIV(); 

				}
				break;
			case 10 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:72: DOT
				{
				mDOT(); 

				}
				break;
			case 11 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:76: DOWNARROW
				{
				mDOWNARROW(); 

				}
				break;
			case 12 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:86: ELSE
				{
				mELSE(); 

				}
				break;
			case 13 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:91: EQUALS
				{
				mEQUALS(); 

				}
				break;
			case 14 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:98: FOR
				{
				mFOR(); 

				}
				break;
			case 15 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:102: GAME
				{
				mGAME(); 

				}
				break;
			case 16 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:107: IF
				{
				mIF(); 

				}
				break;
			case 17 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:110: INT
				{
				mINT(); 

				}
				break;
			case 18 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:114: LEFTARROW
				{
				mLEFTARROW(); 

				}
				break;
			case 19 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:124: LEQ
				{
				mLEQ(); 

				}
				break;
			case 20 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:128: LESS
				{
				mLESS(); 

				}
				break;
			case 21 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:133: MINUS
				{
				mMINUS(); 

				}
				break;
			case 22 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:139: MULT
				{
				mMULT(); 

				}
				break;
			case 23 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:144: NOT
				{
				mNOT(); 

				}
				break;
			case 24 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:148: OBRACKET
				{
				mOBRACKET(); 

				}
				break;
			case 25 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:157: OCURBRA
				{
				mOCURBRA(); 

				}
				break;
			case 26 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:165: ON
				{
				mON(); 

				}
				break;
			case 27 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:168: OPARAN
				{
				mOPARAN(); 

				}
				break;
			case 28 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:175: OR
				{
				mOR(); 

				}
				break;
			case 29 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:178: PLUS
				{
				mPLUS(); 

				}
				break;
			case 30 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:183: RECTANGLE
				{
				mRECTANGLE(); 

				}
				break;
			case 31 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:193: RIGHTARROW
				{
				mRIGHTARROW(); 

				}
				break;
			case 32 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:204: SEMIKOL
				{
				mSEMIKOL(); 

				}
				break;
			case 33 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:212: SPACE
				{
				mSPACE(); 

				}
				break;
			case 34 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:218: TOUCHES
				{
				mTOUCHES(); 

				}
				break;
			case 35 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:226: TRIANGLE
				{
				mTRIANGLE(); 

				}
				break;
			case 36 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:235: UPARROW
				{
				mUPARROW(); 

				}
				break;
			case 37 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:243: LDF
				{
				mLDF(); 

				}
				break;
			case 38 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:247: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 39 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:254: WS
				{
				mWS(); 

				}
				break;
			case 40 :
				// /home/phrizzel/ponyshit/repo/compilerbau/MGPL.g:1:257: SINGLE_COMMENT
				{
				mSINGLE_COMMENT(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	static final String DFA4_eotS =
		"\2\uffff\1\40\1\45\2\uffff\1\40\2\uffff\1\50\1\uffff\6\40\1\61\5\uffff"+
		"\1\40\3\uffff\1\40\1\uffff\3\40\3\uffff\1\40\2\uffff\1\40\2\uffff\4\40"+
		"\1\77\2\40\2\uffff\1\102\12\40\1\115\1\40\1\uffff\1\117\1\40\1\uffff\11"+
		"\40\1\132\1\uffff\1\133\1\uffff\12\40\2\uffff\3\40\1\151\4\40\1\156\4"+
		"\40\1\uffff\4\40\1\uffff\4\40\1\173\1\40\1\175\5\40\1\uffff\1\u0083\1"+
		"\uffff\1\u0084\1\u0085\1\u0086\1\u0087\1\40\5\uffff\1\u0089\1\uffff";
	static final String DFA4_eofS =
		"\u008a\uffff";
	static final String DFA4_minS =
		"\1\11\1\uffff\1\156\1\75\2\uffff\1\151\2\uffff\1\57\1\uffff\1\157\1\154"+
		"\1\157\1\141\1\146\1\145\1\75\5\uffff\1\156\3\uffff\1\145\1\uffff\1\160"+
		"\1\157\1\160\3\uffff\1\151\2\uffff\1\162\2\uffff\1\167\1\163\1\162\1\155"+
		"\1\60\1\164\1\146\2\uffff\1\60\1\143\1\147\1\141\1\165\1\151\1\141\1\155"+
		"\1\143\1\156\1\145\1\60\1\145\1\uffff\1\60\1\164\1\uffff\1\164\1\150\2"+
		"\143\1\141\1\162\1\141\1\154\1\141\1\60\1\uffff\1\60\1\uffff\2\141\1\164"+
		"\1\145\1\150\1\156\1\162\1\164\1\145\1\162\2\uffff\1\162\1\156\1\141\1"+
		"\60\1\145\1\147\1\157\1\151\1\60\2\162\1\147\1\162\1\uffff\1\163\1\154"+
		"\1\167\1\157\1\uffff\2\157\1\154\1\162\1\60\1\145\1\60\1\156\2\167\1\145"+
		"\1\157\1\uffff\1\60\1\uffff\4\60\1\167\5\uffff\1\60\1\uffff";
	static final String DFA4_maxS =
		"\1\175\1\uffff\1\156\1\75\2\uffff\1\151\2\uffff\1\57\1\uffff\1\157\1\154"+
		"\1\157\1\141\1\156\1\145\1\75\5\uffff\1\156\3\uffff\1\151\1\uffff\1\160"+
		"\1\162\1\160\3\uffff\1\151\2\uffff\1\162\2\uffff\1\167\1\163\1\162\1\155"+
		"\1\172\1\164\1\146\2\uffff\1\172\1\143\1\147\1\141\1\165\1\151\1\141\1"+
		"\155\1\143\1\156\1\145\1\172\1\145\1\uffff\1\172\1\164\1\uffff\1\164\1"+
		"\150\2\143\1\141\1\162\1\141\1\154\1\141\1\172\1\uffff\1\172\1\uffff\2"+
		"\141\1\164\1\145\1\150\1\156\1\162\1\164\1\145\1\162\2\uffff\1\162\1\156"+
		"\1\141\1\172\1\145\1\147\1\157\1\151\1\172\2\162\1\147\1\162\1\uffff\1"+
		"\163\1\154\1\167\1\157\1\uffff\2\157\1\154\1\162\1\172\1\145\1\172\1\156"+
		"\2\167\1\145\1\157\1\uffff\1\172\1\uffff\4\172\1\167\5\uffff\1\172\1\uffff";
	static final String DFA4_acceptS =
		"\1\uffff\1\1\2\uffff\1\4\1\5\1\uffff\1\7\1\10\1\uffff\1\12\7\uffff\1\25"+
		"\1\26\1\27\1\30\1\31\1\uffff\1\33\1\34\1\35\1\uffff\1\40\3\uffff\1\45"+
		"\1\46\1\47\1\uffff\1\15\1\3\1\uffff\1\50\1\11\7\uffff\1\23\1\24\15\uffff"+
		"\1\20\2\uffff\1\32\12\uffff\1\16\1\uffff\1\21\12\uffff\1\14\1\17\15\uffff"+
		"\1\41\4\uffff\1\6\14\uffff\1\42\1\uffff\1\44\5\uffff\1\43\1\2\1\13\1\22"+
		"\1\36\1\uffff\1\37";
	static final String DFA4_specialS =
		"\u008a\uffff}>";
	static final String[] DFA4_transitionS = {
			"\2\42\1\uffff\2\42\22\uffff\1\42\1\24\4\uffff\1\1\1\uffff\1\30\1\10\1"+
			"\23\1\32\1\7\1\22\1\12\1\11\12\41\1\uffff\1\34\1\21\1\3\3\uffff\32\40"+
			"\1\25\1\uffff\1\4\3\uffff\1\2\1\40\1\6\1\13\1\14\1\15\1\16\1\40\1\17"+
			"\2\40\1\20\2\40\1\27\2\40\1\33\1\35\1\36\1\37\5\40\1\26\1\31\1\5",
			"",
			"\1\43",
			"\1\44",
			"",
			"",
			"\1\46",
			"",
			"",
			"\1\47",
			"",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55\7\uffff\1\56",
			"\1\57",
			"\1\60",
			"",
			"",
			"",
			"",
			"",
			"\1\62",
			"",
			"",
			"",
			"\1\63\3\uffff\1\64",
			"",
			"\1\65",
			"\1\66\2\uffff\1\67",
			"\1\70",
			"",
			"",
			"",
			"\1\71",
			"",
			"",
			"\1\72",
			"",
			"",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\100",
			"\1\101",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\116",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\120",
			"",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"",
			"",
			"\1\146",
			"\1\147",
			"\1\150",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"",
			"\1\167",
			"\1\170",
			"\1\171",
			"\1\172",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\174",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\1\u0082",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			"\1\u0088",
			"",
			"",
			"",
			"",
			"",
			"\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
			""
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( AND | ANIMATION | ASSIGN | CBRACKET | CCURBRA | CIRCLE | COMMA | CPARAN | DIV | DOT | DOWNARROW | ELSE | EQUALS | FOR | GAME | IF | INT | LEFTARROW | LEQ | LESS | MINUS | MULT | NOT | OBRACKET | OCURBRA | ON | OPARAN | OR | PLUS | RECTANGLE | RIGHTARROW | SEMIKOL | SPACE | TOUCHES | TRIANGLE | UPARROW | LDF | NUMBER | WS | SINGLE_COMMENT );";
		}
	}

}
