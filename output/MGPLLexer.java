// $ANTLR 3.5 /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g 2013-12-10 13:31:57

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
    public static final int CPARAN=10;
    public static final int DIGIT=11;
    public static final int DIV=12;
    public static final int DOT=13;
    public static final int DOWNARROW=14;
    public static final int ELSE=15;
    public static final int EQUALS=16;
    public static final int FOR=17;
    public static final int GAME=18;
    public static final int IF=19;
    public static final int INT=20;
    public static final int LDF=21;
    public static final int LEFTARROW=22;
    public static final int LEQ=23;
    public static final int LESS=24;
    public static final int LOWCASE=25;
    public static final int MINUS=26;
    public static final int MULT=27;
    public static final int NOT=28;
    public static final int NUMBER=29;
    public static final int OBRACKET=30;
    public static final int OCURBRA=31;
    public static final int ON=32;
    public static final int OPARAN=33;
    public static final int OR=34;
    public static final int PLUS=35;
    public static final int RECTANGLE=36;
    public static final int RIGHTARROW=37;
    public static final int SEMIKOL=38;
    public static final int SINGLE_COMMENT=39;
    public static final int SPACE=40;
    public static final int TOUCHES=41;
    public static final int TRIANGLE=42;
    public static final int UPARROW=43;
    public static final int UPCASE=44;
    public static final int WS=45;

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
    @Override public String getGrammarFileName() { return "/home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g"; }

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:6:5: ( '&&' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:6:7: '&&'
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:7:11: ( 'animation' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:7:13: 'animation'
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:8:8: ( '=' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:8:10: '='
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:9:10: ( ']' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:9:12: ']'
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:10:9: ( '}' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:10:11: '}'
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:11:8: ( 'circle' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:11:10: 'circle'
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

    // $ANTLR start "CPARAN"
    public final void mCPARAN() throws RecognitionException {
        try {
            int _type = CPARAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:12:8: ( ')' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:12:10: ')'
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:13:5: ( '/' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:13:7: '/'
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:14:5: ( '.' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:14:7: '.'
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:15:11: ( 'downarrow' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:15:13: 'downarrow'
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:16:6: ( 'else' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:16:8: 'else'
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:17:8: ( '==' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:17:10: '=='
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:18:5: ( 'for' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:18:7: 'for'
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:19:6: ( 'game' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:19:8: 'game'
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:20:4: ( 'if' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:20:6: 'if'
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:21:5: ( 'int' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:21:7: 'int'
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:22:11: ( 'leftarrow' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:22:13: 'leftarrow'
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:23:5: ( '<=' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:23:7: '<='
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:24:6: ( '<' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:24:8: '<'
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:25:7: ( '-' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:25:9: '-'
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:26:6: ( '*' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:26:8: '*'
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:27:5: ( '!' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:27:7: '!'
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:28:10: ( '[' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:28:12: '['
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:29:9: ( '{' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:29:11: '{'
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:30:4: ( 'on' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:30:6: 'on'
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:31:8: ( '(' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:31:10: '('
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:32:4: ( '||' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:32:6: '||'
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:33:6: ( '+' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:33:8: '+'
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:34:11: ( 'rectangle' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:34:13: 'rectangle'
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:35:12: ( 'rightarrow' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:35:14: 'rightarrow'
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:36:9: ( ';' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:36:11: ';'
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:37:7: ( 'space' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:37:9: 'space'
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:38:9: ( 'touches' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:38:11: 'touches'
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:39:10: ( 'triangle' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:39:12: 'triangle'
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:40:9: ( 'uparrow' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:40:11: 'uparrow'
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:77:21: ( ( LOWCASE | UPCASE ) ( '_' | DIGIT | LOWCASE | UPCASE )* )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:77:25: ( LOWCASE | UPCASE ) ( '_' | DIGIT | LOWCASE | UPCASE )*
            {
                if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                    input.consume();
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(null,input);
                    recover(mse);
                    throw mse;
                }
                // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:77:46: ( '_' | DIGIT | LOWCASE | UPCASE )*
                loop1:
                while (true) {
                    int alt1=2;
                    int LA1_0 = input.LA(1);
                    if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                        alt1=1;
                    }

                    switch (alt1) {
                    case 1 :
                        // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:79:21: ( ( DIGIT )+ )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:79:25: ( DIGIT )+
            {
                // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:79:25: ( DIGIT )+
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
                        // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:81:21: ( 'a' .. 'z' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:82:21: ( 'A' .. 'Z' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:83:21: ( '0' .. '9' )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:84:9: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:84:11: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
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
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:85:20: ( '//' (~ ( '\\r' | '\\n' ) )* )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:85:22: '//' (~ ( '\\r' | '\\n' ) )*
            {
                match("//");

                // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:85:27: (~ ( '\\r' | '\\n' ) )*
                loop3:
                while (true) {
                    int alt3=2;
                    int LA3_0 = input.LA(1);
                    if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
                        alt3=1;
                    }

                    switch (alt3) {
                    case 1 :
                        // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:
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
        // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:8: ( AND | ANIMATION | ASSIGN | CBRACKET | CCURBRA | CIRCLE | CPARAN | DIV | DOT | DOWNARROW | ELSE | EQUALS | FOR | GAME | IF | INT | LEFTARROW | LEQ | LESS | MINUS | MULT | NOT | OBRACKET | OCURBRA | ON | OPARAN | OR | PLUS | RECTANGLE | RIGHTARROW | SEMIKOL | SPACE | TOUCHES | TRIANGLE | UPARROW | LDF | NUMBER | WS | SINGLE_COMMENT )
        int alt4=39;
        alt4 = dfa4.predict(input);
        switch (alt4) {
        case 1 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:10: AND
            {
                mAND();

            }
            break;
        case 2 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:14: ANIMATION
            {
                mANIMATION();

            }
            break;
        case 3 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:24: ASSIGN
            {
                mASSIGN();

            }
            break;
        case 4 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:31: CBRACKET
            {
                mCBRACKET();

            }
            break;
        case 5 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:40: CCURBRA
            {
                mCCURBRA();

            }
            break;
        case 6 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:48: CIRCLE
            {
                mCIRCLE();

            }
            break;
        case 7 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:55: CPARAN
            {
                mCPARAN();

            }
            break;
        case 8 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:62: DIV
            {
                mDIV();

            }
            break;
        case 9 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:66: DOT
            {
                mDOT();

            }
            break;
        case 10 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:70: DOWNARROW
            {
                mDOWNARROW();

            }
            break;
        case 11 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:80: ELSE
            {
                mELSE();

            }
            break;
        case 12 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:85: EQUALS
            {
                mEQUALS();

            }
            break;
        case 13 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:92: FOR
            {
                mFOR();

            }
            break;
        case 14 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:96: GAME
            {
                mGAME();

            }
            break;
        case 15 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:101: IF
            {
                mIF();

            }
            break;
        case 16 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:104: INT
            {
                mINT();

            }
            break;
        case 17 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:108: LEFTARROW
            {
                mLEFTARROW();

            }
            break;
        case 18 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:118: LEQ
            {
                mLEQ();

            }
            break;
        case 19 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:122: LESS
            {
                mLESS();

            }
            break;
        case 20 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:127: MINUS
            {
                mMINUS();

            }
            break;
        case 21 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:133: MULT
            {
                mMULT();

            }
            break;
        case 22 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:138: NOT
            {
                mNOT();

            }
            break;
        case 23 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:142: OBRACKET
            {
                mOBRACKET();

            }
            break;
        case 24 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:151: OCURBRA
            {
                mOCURBRA();

            }
            break;
        case 25 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:159: ON
            {
                mON();

            }
            break;
        case 26 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:162: OPARAN
            {
                mOPARAN();

            }
            break;
        case 27 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:169: OR
            {
                mOR();

            }
            break;
        case 28 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:172: PLUS
            {
                mPLUS();

            }
            break;
        case 29 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:177: RECTANGLE
            {
                mRECTANGLE();

            }
            break;
        case 30 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:187: RIGHTARROW
            {
                mRIGHTARROW();

            }
            break;
        case 31 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:198: SEMIKOL
            {
                mSEMIKOL();

            }
            break;
        case 32 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:206: SPACE
            {
                mSPACE();

            }
            break;
        case 33 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:212: TOUCHES
            {
                mTOUCHES();

            }
            break;
        case 34 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:220: TRIANGLE
            {
                mTRIANGLE();

            }
            break;
        case 35 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:229: UPARROW
            {
                mUPARROW();

            }
            break;
        case 36 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:237: LDF
            {
                mLDF();

            }
            break;
        case 37 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:241: NUMBER
            {
                mNUMBER();

            }
            break;
        case 38 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:248: WS
            {
                mWS();

            }
            break;
        case 39 :
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:1:251: SINGLE_COMMENT
            {
                mSINGLE_COMMENT();

            }
            break;

        }
    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\2\uffff\1\37\1\44\2\uffff\1\37\1\uffff\1\47\1\uffff\6\37\1\60\5\uffff"+
        "\1\37\3\uffff\1\37\1\uffff\3\37\3\uffff\1\37\2\uffff\1\37\2\uffff\4\37"+
        "\1\76\2\37\2\uffff\1\101\12\37\1\114\1\37\1\uffff\1\116\1\37\1\uffff\11"+
        "\37\1\131\1\uffff\1\132\1\uffff\12\37\2\uffff\3\37\1\150\4\37\1\155\4"+
        "\37\1\uffff\4\37\1\uffff\4\37\1\172\1\37\1\174\5\37\1\uffff\1\u0082\1"+
        "\uffff\1\u0083\1\u0084\1\u0085\1\u0086\1\37\5\uffff\1\u0088\1\uffff";
    static final String DFA4_eofS =
        "\u0089\uffff";
    static final String DFA4_minS =
        "\1\11\1\uffff\1\156\1\75\2\uffff\1\151\1\uffff\1\57\1\uffff\1\157\1\154"+
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
        "\1\175\1\uffff\1\156\1\75\2\uffff\1\151\1\uffff\1\57\1\uffff\1\157\1\154"+
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
        "\1\uffff\1\1\2\uffff\1\4\1\5\1\uffff\1\7\1\uffff\1\11\7\uffff\1\24\1\25"+
        "\1\26\1\27\1\30\1\uffff\1\32\1\33\1\34\1\uffff\1\37\3\uffff\1\44\1\45"+
        "\1\46\1\uffff\1\14\1\3\1\uffff\1\47\1\10\7\uffff\1\22\1\23\15\uffff\1"+
        "\17\2\uffff\1\31\12\uffff\1\15\1\uffff\1\20\12\uffff\1\13\1\16\15\uffff"+
        "\1\40\4\uffff\1\6\14\uffff\1\41\1\uffff\1\43\5\uffff\1\42\1\2\1\12\1\21"+
        "\1\35\1\uffff\1\36";
    static final String DFA4_specialS =
        "\u0089\uffff}>";
    static final String[] DFA4_transitionS = {
        "\2\41\1\uffff\2\41\22\uffff\1\41\1\23\4\uffff\1\1\1\uffff\1\27\1\7\1"+
        "\22\1\31\1\uffff\1\21\1\11\1\10\12\40\1\uffff\1\33\1\20\1\3\3\uffff\32"+
        "\37\1\24\1\uffff\1\4\3\uffff\1\2\1\37\1\6\1\12\1\13\1\14\1\15\1\37\1"+
        "\16\2\37\1\17\2\37\1\26\2\37\1\32\1\34\1\35\1\36\5\37\1\25\1\30\1\5",
        "",
        "\1\42",
        "\1\43",
        "",
        "",
        "\1\45",
        "",
        "\1\46",
        "",
        "\1\50",
        "\1\51",
        "\1\52",
        "\1\53",
        "\1\54\7\uffff\1\55",
        "\1\56",
        "\1\57",
        "",
        "",
        "",
        "",
        "",
        "\1\61",
        "",
        "",
        "",
        "\1\62\3\uffff\1\63",
        "",
        "\1\64",
        "\1\65\2\uffff\1\66",
        "\1\67",
        "",
        "",
        "",
        "\1\70",
        "",
        "",
        "\1\71",
        "",
        "",
        "\1\72",
        "\1\73",
        "\1\74",
        "\1\75",
        "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
        "\1\77",
        "\1\100",
        "",
        "",
        "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
        "\1\102",
        "\1\103",
        "\1\104",
        "\1\105",
        "\1\106",
        "\1\107",
        "\1\110",
        "\1\111",
        "\1\112",
        "\1\113",
        "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
        "\1\115",
        "",
        "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
        "\1\117",
        "",
        "\1\120",
        "\1\121",
        "\1\122",
        "\1\123",
        "\1\124",
        "\1\125",
        "\1\126",
        "\1\127",
        "\1\130",
        "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
        "",
        "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
        "",
        "\1\133",
        "\1\134",
        "\1\135",
        "\1\136",
        "\1\137",
        "\1\140",
        "\1\141",
        "\1\142",
        "\1\143",
        "\1\144",
        "",
        "",
        "\1\145",
        "\1\146",
        "\1\147",
        "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
        "\1\151",
        "\1\152",
        "\1\153",
        "\1\154",
        "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
        "\1\156",
        "\1\157",
        "\1\160",
        "\1\161",
        "",
        "\1\162",
        "\1\163",
        "\1\164",
        "\1\165",
        "",
        "\1\166",
        "\1\167",
        "\1\170",
        "\1\171",
        "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
        "\1\173",
        "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
        "\1\175",
        "\1\176",
        "\1\177",
        "\1\u0080",
        "\1\u0081",
        "",
        "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
        "",
        "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
        "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
        "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
        "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
        "\1\u0087",
        "",
        "",
        "",
        "",
        "",
        "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
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
            return "1:1: Tokens : ( AND | ANIMATION | ASSIGN | CBRACKET | CCURBRA | CIRCLE | CPARAN | DIV | DOT | DOWNARROW | ELSE | EQUALS | FOR | GAME | IF | INT | LEFTARROW | LEQ | LESS | MINUS | MULT | NOT | OBRACKET | OCURBRA | ON | OPARAN | OR | PLUS | RECTANGLE | RIGHTARROW | SEMIKOL | SPACE | TOUCHES | TRIANGLE | UPARROW | LDF | NUMBER | WS | SINGLE_COMMENT );";
        }
    }

}
