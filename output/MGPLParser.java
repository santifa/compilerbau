// $ANTLR 3.5 /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g 2013-12-10 13:31:56

package antlr.projekt1;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MGPLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ANIMATION", "ASSIGN",
        "CBRACKET", "CCURBRA", "CIRCLE", "CPARAN", "DIGIT", "DIV", "DOT", "DOWNARROW",
        "ELSE", "EQUALS", "FOR", "GAME", "IF", "INT", "LDF", "LEFTARROW", "LEQ",
        "LESS", "LOWCASE", "MINUS", "MULT", "NOT", "NUMBER", "OBRACKET", "OCURBRA",
        "ON", "OPARAN", "OR", "PLUS", "RECTANGLE", "RIGHTARROW", "SEMIKOL", "SINGLE_COMMENT",
        "SPACE", "TOUCHES", "TRIANGLE", "UPARROW", "UPCASE", "WS"
    };
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public MGPLParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public MGPLParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    @Override public String[] getTokenNames() { return MGPLParser.tokenNames; }
    @Override public String getGrammarFileName() { return "/home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g"; }



    // $ANTLR start "prog"
    // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:56:1: prog : GAME LDF OPARAN ( attrAssList )? CPARAN ( decl )* stmtBlock ( block )* ;
    public final void prog() throws  {
        try {
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:56:13: ( GAME LDF OPARAN ( attrAssList )? CPARAN ( decl )* stmtBlock ( block )* )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:56:15: GAME LDF OPARAN ( attrAssList )? CPARAN ( decl )* stmtBlock ( block )*
            {
                match(input,GAME,FOLLOW_GAME_in_prog769);
                match(input,LDF,FOLLOW_LDF_in_prog771);
                match(input,OPARAN,FOLLOW_OPARAN_in_prog773);
                // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:56:31: ( attrAssList )?
                int alt1=2;
                int LA1_0 = input.LA(1);
                if ( (LA1_0==LDF) ) {
                    alt1=1;
                }
                switch (alt1) {
                case 1 :
                    // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:56:31: attrAssList
                    {
                        pushFollow(FOLLOW_attrAssList_in_prog775);
                        attrAssList();
                        state._fsp--;

                    }
                    break;

                }

                match(input,CPARAN,FOLLOW_CPARAN_in_prog778);
                // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:56:51: ( decl )*
                loop2:
                while (true) {
                    int alt2=2;
                    int LA2_0 = input.LA(1);
                    if ( (LA2_0==CIRCLE||LA2_0==INT||LA2_0==RECTANGLE||LA2_0==TRIANGLE) ) {
                        alt2=1;
                    }

                    switch (alt2) {
                    case 1 :
                        // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:56:51: decl
                        {
                            pushFollow(FOLLOW_decl_in_prog780);
                            decl();
                            state._fsp--;

                        }
                        break;

                    default :
                        break loop2;
                    }
                }

                pushFollow(FOLLOW_stmtBlock_in_prog783);
                stmtBlock();
                state._fsp--;

                // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:56:67: ( block )*
                loop3:
                while (true) {
                    int alt3=2;
                    int LA3_0 = input.LA(1);
                    if ( (LA3_0==ANIMATION||LA3_0==ON) ) {
                        alt3=1;
                    }

                    switch (alt3) {
                    case 1 :
                        // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:56:67: block
                        {
                            pushFollow(FOLLOW_block_in_prog785);
                            block();
                            state._fsp--;

                        }
                        break;

                    default :
                        break loop3;
                    }
                }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "prog"



    // $ANTLR start "decl"
    // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:57:1: decl : ( varDecl SEMIKOL | objDecl SEMIKOL );
    public final void decl() throws NoViableAltException {
        try {
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:57:13: ( varDecl SEMIKOL | objDecl SEMIKOL )
            int alt4=2;
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
                throw nvae;
            }

            switch (alt4) {
            case 1 :
                // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:57:15: varDecl SEMIKOL
                {
                    pushFollow(FOLLOW_varDecl_in_decl800);
                    varDecl();
                    state._fsp--;

                    match(input,SEMIKOL,FOLLOW_SEMIKOL_in_decl802);
                }
                break;
            case 2 :
                // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:57:33: objDecl SEMIKOL
                {
                    pushFollow(FOLLOW_objDecl_in_decl806);
                    objDecl();
                    state._fsp--;

                    match(input,SEMIKOL,FOLLOW_SEMIKOL_in_decl808);
                }
                break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "decl"



    // $ANTLR start "varDecl"
    // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:58:1: varDecl : ( ( INT LDF ( init )? ) | ( INT LDF OBRACKET NUMBER CBRACKET ) );
    public final void varDecl() throws NoViableAltException {
        try {
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:58:13: ( ( INT LDF ( init )? ) | ( INT LDF OBRACKET NUMBER CBRACKET ) )
            int alt6=2;
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
                        throw nvae;
                    } finally {
                        input.rewind(nvaeMark);
                    }
                }

            }

            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);
                throw nvae;
            }

            switch (alt6) {
            case 1 :
                // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:58:15: ( INT LDF ( init )? )
                {
                    // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:58:15: ( INT LDF ( init )? )
                    // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:58:17: INT LDF ( init )?
                    {
                        match(input,INT,FOLLOW_INT_in_varDecl821);
                        match(input,LDF,FOLLOW_LDF_in_varDecl823);
                        // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:58:25: ( init )?
                        int alt5=2;
                        int LA5_0 = input.LA(1);
                        if ( (LA5_0==ASSIGN) ) {
                            alt5=1;
                        }
                        switch (alt5) {
                        case 1 :
                            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:58:25: init
                            {
                                pushFollow(FOLLOW_init_in_varDecl825);
                                init();
                                state._fsp--;

                            }
                            break;

                        }

                    }

                }
                break;
            case 2 :
                // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:58:35: ( INT LDF OBRACKET NUMBER CBRACKET )
                {
                    // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:58:35: ( INT LDF OBRACKET NUMBER CBRACKET )
                    // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:58:37: INT LDF OBRACKET NUMBER CBRACKET
                    {
                        match(input,INT,FOLLOW_INT_in_varDecl834);
                        match(input,LDF,FOLLOW_LDF_in_varDecl836);
                        match(input,OBRACKET,FOLLOW_OBRACKET_in_varDecl838);
                        match(input,NUMBER,FOLLOW_NUMBER_in_varDecl840);
                        match(input,CBRACKET,FOLLOW_CBRACKET_in_varDecl842);
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
            // do for sure before leaving
        }
    }
    // $ANTLR end "varDecl"



    // $ANTLR start "init"
    // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:59:1: init : ASSIGN expr ;
    public final void init() {
        try {
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:59:13: ( ASSIGN expr )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:59:15: ASSIGN expr
            {
                match(input,ASSIGN,FOLLOW_ASSIGN_in_init858);
                pushFollow(FOLLOW_expr_in_init860);
                expr();
                state._fsp--;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "init"



    // $ANTLR start "objDecl"
    // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:60:1: objDecl : ( objType LDF OPARAN ( attrAssList )? CPARAN | objType LDF OBRACKET NUMBER CBRACKET );
    public final void objDecl() throws NoViableAltException {
        try {
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:60:13: ( objType LDF OPARAN ( attrAssList )? CPARAN | objType LDF OBRACKET NUMBER CBRACKET )
            int alt8=2;
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
                        throw nvae;
                    } finally {
                        input.rewind(nvaeMark);
                    }
                }

            }

            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);
                throw nvae;
            }

            switch (alt8) {
            case 1 :
                // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:60:15: objType LDF OPARAN ( attrAssList )? CPARAN
                {
                    pushFollow(FOLLOW_objType_in_objDecl871);
                    objType();
                    state._fsp--;

                    match(input,LDF,FOLLOW_LDF_in_objDecl873);
                    match(input,OPARAN,FOLLOW_OPARAN_in_objDecl875);
                    // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:60:34: ( attrAssList )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);
                    if ( (LA7_0==LDF) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                    case 1 :
                        // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:60:34: attrAssList
                        {
                            pushFollow(FOLLOW_attrAssList_in_objDecl877);
                            attrAssList();
                            state._fsp--;

                        }
                        break;

                    }

                    match(input,CPARAN,FOLLOW_CPARAN_in_objDecl880);
                }
                break;
            case 2 :
                // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:60:56: objType LDF OBRACKET NUMBER CBRACKET
                {
                    pushFollow(FOLLOW_objType_in_objDecl884);
                    objType();
                    state._fsp--;

                    match(input,LDF,FOLLOW_LDF_in_objDecl886);
                    match(input,OBRACKET,FOLLOW_OBRACKET_in_objDecl888);
                    match(input,NUMBER,FOLLOW_NUMBER_in_objDecl890);
                    match(input,CBRACKET,FOLLOW_CBRACKET_in_objDecl892);
                }
                break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "objDecl"



    // $ANTLR start "objType"
    // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:61:1: objType : ( RECTANGLE | TRIANGLE | CIRCLE );
    public final void objType() throws MismatchedSetException {
        try {
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:61:13: ( RECTANGLE | TRIANGLE | CIRCLE )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:
            {
                if ( input.LA(1)==CIRCLE||input.LA(1)==RECTANGLE||input.LA(1)==TRIANGLE ) {
                    input.consume();
                    state.errorRecovery=false;
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(null,input);
                    throw mse;
                }
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "objType"



    // $ANTLR start "attrAssList"
    // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:62:1: attrAssList : ( LDF ASSIGN expr ) ( SEMIKOL LDF ASSIGN expr )* ;
    public final void attrAssList() {
        try {
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:62:13: ( ( LDF ASSIGN expr ) ( SEMIKOL LDF ASSIGN expr )* )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:62:15: ( LDF ASSIGN expr ) ( SEMIKOL LDF ASSIGN expr )*
            {
                // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:62:15: ( LDF ASSIGN expr )
                // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:62:17: LDF ASSIGN expr
                {
                    match(input,LDF,FOLLOW_LDF_in_attrAssList920);
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_attrAssList922);
                    pushFollow(FOLLOW_expr_in_attrAssList924);
                    expr();
                    state._fsp--;

                }

                // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:62:35: ( SEMIKOL LDF ASSIGN expr )*
                loop9:
                while (true) {
                    int alt9=2;
                    int LA9_0 = input.LA(1);
                    if ( (LA9_0==SEMIKOL) ) {
                        alt9=1;
                    }

                    switch (alt9) {
                    case 1 :
                        // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:62:37: SEMIKOL LDF ASSIGN expr
                        {
                            match(input,SEMIKOL,FOLLOW_SEMIKOL_in_attrAssList930);
                            match(input,LDF,FOLLOW_LDF_in_attrAssList932);
                            match(input,ASSIGN,FOLLOW_ASSIGN_in_attrAssList934);
                            pushFollow(FOLLOW_expr_in_attrAssList936);
                            expr();
                            state._fsp--;

                        }
                        break;

                    default :
                        break loop9;
                    }
                }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "attrAssList"



    // $ANTLR start "block"
    // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:63:1: block : ( animBlock | eventBlock );
    public final void block() throws NoViableAltException {
        try {
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:63:13: ( animBlock | eventBlock )
            int alt10=2;
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
                throw nvae;
            }

            switch (alt10) {
            case 1 :
                // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:63:15: animBlock
                {
                    pushFollow(FOLLOW_animBlock_in_block952);
                    animBlock();
                    state._fsp--;

                }
                break;
            case 2 :
                // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:63:27: eventBlock
                {
                    pushFollow(FOLLOW_eventBlock_in_block956);
                    eventBlock();
                    state._fsp--;

                }
                break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "block"



    // $ANTLR start "animBlock"
    // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:64:1: animBlock : ANIMATION LDF OPARAN objType LDF CPARAN stmtBlock ;
    public final void animBlock() {
        try {
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:64:13: ( ANIMATION LDF OPARAN objType LDF CPARAN stmtBlock )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:64:15: ANIMATION LDF OPARAN objType LDF CPARAN stmtBlock
            {
                match(input,ANIMATION,FOLLOW_ANIMATION_in_animBlock965);
                match(input,LDF,FOLLOW_LDF_in_animBlock967);
                match(input,OPARAN,FOLLOW_OPARAN_in_animBlock969);
                pushFollow(FOLLOW_objType_in_animBlock971);
                objType();
                state._fsp--;

                match(input,LDF,FOLLOW_LDF_in_animBlock973);
                match(input,CPARAN,FOLLOW_CPARAN_in_animBlock975);
                pushFollow(FOLLOW_stmtBlock_in_animBlock977);
                stmtBlock();
                state._fsp--;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "animBlock"



    // $ANTLR start "eventBlock"
    // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:65:1: eventBlock : ON keyStroke stmtBlock ;
    public final void eventBlock() throws  {
        try {
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:65:13: ( ON keyStroke stmtBlock )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:65:15: ON keyStroke stmtBlock
            {
                match(input,ON,FOLLOW_ON_in_eventBlock985);
                pushFollow(FOLLOW_keyStroke_in_eventBlock987);
                keyStroke();
                state._fsp--;

                pushFollow(FOLLOW_stmtBlock_in_eventBlock989);
                stmtBlock();
                state._fsp--;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "eventBlock"



    // $ANTLR start "keyStroke"
    // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:66:1: keyStroke : ( SPACE | LEFTARROW | RIGHTARROW | UPARROW | DOWNARROW );
    public final void keyStroke() throws  {
        try {
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:66:13: ( SPACE | LEFTARROW | RIGHTARROW | UPARROW | DOWNARROW )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:
            {
                if ( input.LA(1)==DOWNARROW||input.LA(1)==LEFTARROW||input.LA(1)==RIGHTARROW||input.LA(1)==SPACE||input.LA(1)==UPARROW ) {
                    input.consume();
                    state.errorRecovery=false;
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(null,input);
                    throw mse;
                }
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "keyStroke"



    // $ANTLR start "stmtBlock"
    // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:67:1: stmtBlock : OCURBRA ( stmt )* CCURBRA ;
    public final void stmtBlock() throws  {
        try {
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:67:13: ( OCURBRA ( stmt )* CCURBRA )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:67:15: OCURBRA ( stmt )* CCURBRA
            {
                match(input,OCURBRA,FOLLOW_OCURBRA_in_stmtBlock1023);
                // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:67:23: ( stmt )*
                loop11:
                while (true) {
                    int alt11=2;
                    int LA11_0 = input.LA(1);
                    if ( (LA11_0==FOR||LA11_0==IF||LA11_0==LDF) ) {
                        alt11=1;
                    }

                    switch (alt11) {
                    case 1 :
                        // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:67:23: stmt
                        {
                            pushFollow(FOLLOW_stmt_in_stmtBlock1025);
                            stmt();
                            state._fsp--;

                        }
                        break;

                    default :
                        break loop11;
                    }
                }

                match(input,CCURBRA,FOLLOW_CCURBRA_in_stmtBlock1028);
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "stmtBlock"



    // $ANTLR start "stmt"
    // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:68:1: stmt : ( ifStmt | forStmt | assStmt );
    public final void stmt() throws  {
        try {
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:68:13: ( ifStmt | forStmt | assStmt )
            int alt12=3;
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
                throw nvae;
            }
            switch (alt12) {
            case 1 :
                // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:68:15: ifStmt
                {
                    pushFollow(FOLLOW_ifStmt_in_stmt1042);
                    ifStmt();
                    state._fsp--;

                }
                break;
            case 2 :
                // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:68:24: forStmt
                {
                    pushFollow(FOLLOW_forStmt_in_stmt1046);
                    forStmt();
                    state._fsp--;

                }
                break;
            case 3 :
                // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:68:34: assStmt
                {
                    pushFollow(FOLLOW_assStmt_in_stmt1050);
                    assStmt();
                    state._fsp--;

                }
                break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "stmt"



    // $ANTLR start "ifStmt"
    // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:69:1: ifStmt : IF OPARAN expr CPARAN stmtBlock ( ELSE stmtBlock )? ;
    public final void ifStmt() throws  {
        try {
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:69:13: ( IF OPARAN expr CPARAN stmtBlock ( ELSE stmtBlock )? )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:69:15: IF OPARAN expr CPARAN stmtBlock ( ELSE stmtBlock )?
            {
                match(input,IF,FOLLOW_IF_in_ifStmt1062);
                match(input,OPARAN,FOLLOW_OPARAN_in_ifStmt1064);
                pushFollow(FOLLOW_expr_in_ifStmt1066);
                expr();
                state._fsp--;

                match(input,CPARAN,FOLLOW_CPARAN_in_ifStmt1068);
                pushFollow(FOLLOW_stmtBlock_in_ifStmt1070);
                stmtBlock();
                state._fsp--;

                // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:69:47: ( ELSE stmtBlock )?
                int alt13=2;
                int LA13_0 = input.LA(1);
                if ( (LA13_0==ELSE) ) {
                    alt13=1;
                }
                switch (alt13) {
                case 1 :
                    // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:69:49: ELSE stmtBlock
                    {
                        match(input,ELSE,FOLLOW_ELSE_in_ifStmt1074);
                        pushFollow(FOLLOW_stmtBlock_in_ifStmt1076);
                        stmtBlock();
                        state._fsp--;

                    }
                    break;

                }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "ifStmt"



    // $ANTLR start "forStmt"
    // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:70:1: forStmt : FOR OPARAN assStmt SEMIKOL expr SEMIKOL assStmt CPARAN stmtBlock ;
    public final void forStmt() throws  {
        try {
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:70:13: ( FOR OPARAN assStmt SEMIKOL expr SEMIKOL assStmt CPARAN stmtBlock )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:70:15: FOR OPARAN assStmt SEMIKOL expr SEMIKOL assStmt CPARAN stmtBlock
            {
                match(input,FOR,FOLLOW_FOR_in_forStmt1090);
                match(input,OPARAN,FOLLOW_OPARAN_in_forStmt1092);
                pushFollow(FOLLOW_assStmt_in_forStmt1094);
                assStmt();
                state._fsp--;

                match(input,SEMIKOL,FOLLOW_SEMIKOL_in_forStmt1096);
                pushFollow(FOLLOW_expr_in_forStmt1098);
                expr();
                state._fsp--;

                match(input,SEMIKOL,FOLLOW_SEMIKOL_in_forStmt1100);
                pushFollow(FOLLOW_assStmt_in_forStmt1102);
                assStmt();
                state._fsp--;

                match(input,CPARAN,FOLLOW_CPARAN_in_forStmt1104);
                pushFollow(FOLLOW_stmtBlock_in_forStmt1106);
                stmtBlock();
                state._fsp--;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "forStmt"



    // $ANTLR start "assStmt"
    // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:71:1: assStmt : var ASSIGN expr ;
    public final void assStmt() throws  {
        try {
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:71:13: ( var ASSIGN expr )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:71:15: var ASSIGN expr
            {
                pushFollow(FOLLOW_var_in_assStmt1117);
                var();
                state._fsp--;

                match(input,ASSIGN,FOLLOW_ASSIGN_in_assStmt1119);
                pushFollow(FOLLOW_expr_in_assStmt1121);
                expr();
                state._fsp--;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "assStmt"



    // $ANTLR start "var"
    // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:72:1: var : LDF ( OBRACKET expr CBRACKET ( DOT LDF )? | DOT LDF )? ;
    public final void var() throws  {
        try {
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:72:13: ( LDF ( OBRACKET expr CBRACKET ( DOT LDF )? | DOT LDF )? )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:72:15: LDF ( OBRACKET expr CBRACKET ( DOT LDF )? | DOT LDF )?
            {
                match(input,LDF,FOLLOW_LDF_in_var1136);
                // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:72:19: ( OBRACKET expr CBRACKET ( DOT LDF )? | DOT LDF )?
                int alt15=3;
                int LA15_0 = input.LA(1);
                if ( (LA15_0==OBRACKET) ) {
                    alt15=1;
                }
                else if ( (LA15_0==DOT) ) {
                    alt15=2;
                }
                switch (alt15) {
                case 1 :
                    // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:72:21: OBRACKET expr CBRACKET ( DOT LDF )?
                    {
                        match(input,OBRACKET,FOLLOW_OBRACKET_in_var1140);
                        pushFollow(FOLLOW_expr_in_var1142);
                        expr();
                        state._fsp--;

                        match(input,CBRACKET,FOLLOW_CBRACKET_in_var1144);
                        // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:72:44: ( DOT LDF )?
                        int alt14=2;
                        int LA14_0 = input.LA(1);
                        if ( (LA14_0==DOT) ) {
                            alt14=1;
                        }
                        switch (alt14) {
                        case 1 :
                            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:72:46: DOT LDF
                            {
                                match(input,DOT,FOLLOW_DOT_in_var1148);
                                match(input,LDF,FOLLOW_LDF_in_var1150);
                            }
                            break;

                        }

                    }
                    break;
                case 2 :
                    // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:72:59: DOT LDF
                    {
                        match(input,DOT,FOLLOW_DOT_in_var1157);
                        match(input,LDF,FOLLOW_LDF_in_var1159);
                    }
                    break;

                }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "var"



    // $ANTLR start "expr"
    // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:73:1: expr : ( NUMBER | var ( TOUCHES var )? | ( MINUS | NOT ) expr | OPARAN expr CPARAN ) ( op expr )* ;
    public final void expr() throws  {
        try {
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:73:13: ( ( NUMBER | var ( TOUCHES var )? | ( MINUS | NOT ) expr | OPARAN expr CPARAN ) ( op expr )* )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:73:15: ( NUMBER | var ( TOUCHES var )? | ( MINUS | NOT ) expr | OPARAN expr CPARAN ) ( op expr )*
            {
                // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:73:15: ( NUMBER | var ( TOUCHES var )? | ( MINUS | NOT ) expr | OPARAN expr CPARAN )
                int alt17=4;
                switch ( input.LA(1) ) {
                case NUMBER:
                    {
                        alt17=1;
                    }
                    break;
                case LDF:
                    {
                        alt17=2;
                    }
                    break;
                case MINUS:
                case NOT:
                    {
                        alt17=3;
                    }
                    break;
                case OPARAN:
                    {
                        alt17=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 0, input);
                    throw nvae;
                }
                switch (alt17) {
                case 1 :
                    // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:73:17: NUMBER
                    {
                        match(input,NUMBER,FOLLOW_NUMBER_in_expr1178);
                    }
                    break;
                case 2 :
                    // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:73:26: var ( TOUCHES var )?
                    {
                        pushFollow(FOLLOW_var_in_expr1182);
                        var();
                        state._fsp--;

                        // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:73:30: ( TOUCHES var )?
                        int alt16=2;
                        int LA16_0 = input.LA(1);
                        if ( (LA16_0==TOUCHES) ) {
                            alt16=1;
                        }
                        switch (alt16) {
                        case 1 :
                            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:73:32: TOUCHES var
                            {
                                match(input,TOUCHES,FOLLOW_TOUCHES_in_expr1186);
                                pushFollow(FOLLOW_var_in_expr1188);
                                var();
                                state._fsp--;

                            }
                            break;

                        }

                    }
                    break;
                case 3 :
                    // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:73:49: ( MINUS | NOT ) expr
                    {
                        if ( input.LA(1)==MINUS||input.LA(1)==NOT ) {
                            input.consume();
                            state.errorRecovery=false;
                        }
                        else {
                            MismatchedSetException mse = new MismatchedSetException(null,input);
                            throw mse;
                        }
                        pushFollow(FOLLOW_expr_in_expr1205);
                        expr();
                        state._fsp--;

                    }
                    break;
                case 4 :
                    // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:73:72: OPARAN expr CPARAN
                    {
                        match(input,OPARAN,FOLLOW_OPARAN_in_expr1209);
                        pushFollow(FOLLOW_expr_in_expr1211);
                        expr();
                        state._fsp--;

                        match(input,CPARAN,FOLLOW_CPARAN_in_expr1213);
                    }
                    break;

                }

                // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:73:93: ( op expr )*
                loop18:
                while (true) {
                    int alt18=2;
                    int LA18_0 = input.LA(1);
                    if ( (LA18_0==AND||LA18_0==DIV||LA18_0==EQUALS||(LA18_0 >= LEQ && LA18_0 <= LESS)||(LA18_0 >= MINUS && LA18_0 <= MULT)||(LA18_0 >= OR && LA18_0 <= PLUS)) ) {
                        alt18=1;
                    }

                    switch (alt18) {
                    case 1 :
                        // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:73:95: op expr
                        {
                            pushFollow(FOLLOW_op_in_expr1219);
                            op();
                            state._fsp--;

                            pushFollow(FOLLOW_expr_in_expr1221);
                            expr();
                            state._fsp--;

                        }
                        break;

                    default :
                        break loop18;
                    }
                }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "expr"



    // $ANTLR start "op"
    // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:74:1: op : ( OR | AND | EQUALS | LESS | LEQ | PLUS | MINUS | MULT | DIV );
    public final void op() throws  {
        try {
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:74:13: ( OR | AND | EQUALS | LESS | LEQ | PLUS | MINUS | MULT | DIV )
            // /home/madbone/uni/compilerbau/material/antlr/projekt1/MGPL.g:
            {
                if ( input.LA(1)==AND||input.LA(1)==DIV||input.LA(1)==EQUALS||(input.LA(1) >= LEQ && input.LA(1) <= LESS)||(input.LA(1) >= MINUS && input.LA(1) <= MULT)||(input.LA(1) >= OR && input.LA(1) <= PLUS) ) {
                    input.consume();
                    state.errorRecovery=false;
                }
                else {
                    MismatchedSetException mse = new MismatchedSetException(null,input);
                    throw mse;
                }
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "op"

    // Delegated rules



    public static final BitSet FOLLOW_GAME_in_prog769 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LDF_in_prog771 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_OPARAN_in_prog773 = new BitSet(new long[]{0x0000000000200400L});
    public static final BitSet FOLLOW_attrAssList_in_prog775 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CPARAN_in_prog778 = new BitSet(new long[]{0x0000041080100200L});
    public static final BitSet FOLLOW_decl_in_prog780 = new BitSet(new long[]{0x0000041080100200L});
    public static final BitSet FOLLOW_stmtBlock_in_prog783 = new BitSet(new long[]{0x0000000100000022L});
    public static final BitSet FOLLOW_block_in_prog785 = new BitSet(new long[]{0x0000000100000022L});
    public static final BitSet FOLLOW_varDecl_in_decl800 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_SEMIKOL_in_decl802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objDecl_in_decl806 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_SEMIKOL_in_decl808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_varDecl821 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LDF_in_varDecl823 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_init_in_varDecl825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_varDecl834 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LDF_in_varDecl836 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_OBRACKET_in_varDecl838 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_NUMBER_in_varDecl840 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CBRACKET_in_varDecl842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSIGN_in_init858 = new BitSet(new long[]{0x0000000234200000L});
    public static final BitSet FOLLOW_expr_in_init860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objType_in_objDecl871 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LDF_in_objDecl873 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_OPARAN_in_objDecl875 = new BitSet(new long[]{0x0000000000200400L});
    public static final BitSet FOLLOW_attrAssList_in_objDecl877 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CPARAN_in_objDecl880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objType_in_objDecl884 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LDF_in_objDecl886 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_OBRACKET_in_objDecl888 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_NUMBER_in_objDecl890 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CBRACKET_in_objDecl892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LDF_in_attrAssList920 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ASSIGN_in_attrAssList922 = new BitSet(new long[]{0x0000000234200000L});
    public static final BitSet FOLLOW_expr_in_attrAssList924 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_SEMIKOL_in_attrAssList930 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LDF_in_attrAssList932 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ASSIGN_in_attrAssList934 = new BitSet(new long[]{0x0000000234200000L});
    public static final BitSet FOLLOW_expr_in_attrAssList936 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_animBlock_in_block952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_eventBlock_in_block956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANIMATION_in_animBlock965 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LDF_in_animBlock967 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_OPARAN_in_animBlock969 = new BitSet(new long[]{0x0000041000000200L});
    public static final BitSet FOLLOW_objType_in_animBlock971 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LDF_in_animBlock973 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CPARAN_in_animBlock975 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_stmtBlock_in_animBlock977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_eventBlock985 = new BitSet(new long[]{0x0000092000404000L});
    public static final BitSet FOLLOW_keyStroke_in_eventBlock987 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_stmtBlock_in_eventBlock989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCURBRA_in_stmtBlock1023 = new BitSet(new long[]{0x00000000002A0100L});
    public static final BitSet FOLLOW_stmt_in_stmtBlock1025 = new BitSet(new long[]{0x00000000002A0100L});
    public static final BitSet FOLLOW_CCURBRA_in_stmtBlock1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStmt_in_stmt1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStmt_in_stmt1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assStmt_in_stmt1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStmt1062 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_OPARAN_in_ifStmt1064 = new BitSet(new long[]{0x0000000234200000L});
    public static final BitSet FOLLOW_expr_in_ifStmt1066 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CPARAN_in_ifStmt1068 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_stmtBlock_in_ifStmt1070 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ELSE_in_ifStmt1074 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_stmtBlock_in_ifStmt1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forStmt1090 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_OPARAN_in_forStmt1092 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_assStmt_in_forStmt1094 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_SEMIKOL_in_forStmt1096 = new BitSet(new long[]{0x0000000234200000L});
    public static final BitSet FOLLOW_expr_in_forStmt1098 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_SEMIKOL_in_forStmt1100 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_assStmt_in_forStmt1102 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CPARAN_in_forStmt1104 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_stmtBlock_in_forStmt1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_in_assStmt1117 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ASSIGN_in_assStmt1119 = new BitSet(new long[]{0x0000000234200000L});
    public static final BitSet FOLLOW_expr_in_assStmt1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LDF_in_var1136 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_OBRACKET_in_var1140 = new BitSet(new long[]{0x0000000234200000L});
    public static final BitSet FOLLOW_expr_in_var1142 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_CBRACKET_in_var1144 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_DOT_in_var1148 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LDF_in_var1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_var1157 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LDF_in_var1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_expr1178 = new BitSet(new long[]{0x0000000C0D811012L});
    public static final BitSet FOLLOW_var_in_expr1182 = new BitSet(new long[]{0x0000020C0D811012L});
    public static final BitSet FOLLOW_TOUCHES_in_expr1186 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_var_in_expr1188 = new BitSet(new long[]{0x0000000C0D811012L});
    public static final BitSet FOLLOW_set_in_expr1195 = new BitSet(new long[]{0x0000000234200000L});
    public static final BitSet FOLLOW_expr_in_expr1205 = new BitSet(new long[]{0x0000000C0D811012L});
    public static final BitSet FOLLOW_OPARAN_in_expr1209 = new BitSet(new long[]{0x0000000234200000L});
    public static final BitSet FOLLOW_expr_in_expr1211 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CPARAN_in_expr1213 = new BitSet(new long[]{0x0000000C0D811012L});
    public static final BitSet FOLLOW_op_in_expr1219 = new BitSet(new long[]{0x0000000234200000L});
    public static final BitSet FOLLOW_expr_in_expr1221 = new BitSet(new long[]{0x0000000C0D811012L});
}
