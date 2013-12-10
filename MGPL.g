grammar MGPL;

options {
	backtrack=false;
}

// token rules -- complete like mgpl enbf a2
tokens {
        GAME        = 'game';
        INT         = 'int';
        DOT         = '.';
        SEMIKOL     = ';';
        OPARAN      = '(';
        CPARAN      = ')';
        OBRACKET    = '[';
        CBRACKET    = ']';
        OCURBRA     = '{';
        CCURBRA     = '}';
        ASSIGN      = '=';
        NOT         = '!';
        OR          = '||';
        AND         = '&&';
        EQUALS      = '==';
        LESS        = '<';
        LEQ         = '<=';
        PLUS        = '+';
        MINUS       = '-';
        MULT        = '*';
        DIV         = '/';
        IF          = 'if';
        ELSE        = 'else';
        FOR         = 'for';
        RECTANGLE   = 'rectangle';
        TRIANGLE    = 'triangle';
        CIRCLE      = 'circle';
        ANIMATION   = 'animation';
        ON          = 'on';
        SPACE       = 'space';
        LEFTARROW   = 'leftarrow';
        RIGHTARROW  = 'rightarrow';
        UPARROW     = 'uparrow';
        DOWNARROW   = 'downarrow';
        TOUCHES     = 'touches';
}

// java header
@header {
package antlr.projekt1;
}

@lexer::header {
package antlr.projekt2;
}

// parser rules
prog        : GAME LDF OPARAN attrAssList? CPARAN decl* stmtBlock block*;
decl        : varDecl SEMIKOL | objDecl SEMIKOL;
varDecl     : ( INT LDF init? ) | ( INT LDF OBRACKET NUMBER CBRACKET );
init        : ASSIGN expr;
objDecl     : objType LDF OPARAN attrAssList? CPARAN | objType LDF OBRACKET NUMBER CBRACKET;
objType     : RECTANGLE | TRIANGLE | CIRCLE;
attrAssList : ( LDF ASSIGN expr ) ( SEMIKOL LDF ASSIGN expr )*;
block       : animBlock | eventBlock;
animBlock   : ANIMATION LDF OPARAN objType LDF CPARAN stmtBlock;
eventBlock  : ON keyStroke stmtBlock;
keyStroke   : SPACE | LEFTARROW | RIGHTARROW | UPARROW | DOWNARROW;
stmtBlock   : OCURBRA stmt* CCURBRA;
stmt        : ifStmt | forStmt | assStmt;
ifStmt      : IF OPARAN expr CPARAN stmtBlock ( ELSE stmtBlock )?;
forStmt     : FOR OPARAN assStmt SEMIKOL expr SEMIKOL assStmt CPARAN stmtBlock;
assStmt     : var ASSIGN expr;
var         : LDF ( OBRACKET expr CBRACKET ( DOT LDF)?  | DOT LDF )?;
expr        : ( NUMBER | var ( TOUCHES var )? | ( MINUS | NOT ) expr | OPARAN expr CPARAN ) ( op expr )*;
op          : OR | AND | EQUALS | LESS | LEQ | PLUS | MINUS | MULT | DIV;

// lexer rules
LDF                 :   ( LOWCASE | UPCASE ) ( '_' | DIGIT | LOWCASE | UPCASE )*;
//CHAR                :   ( LOWCASE | UPCASE );
NUMBER              :   ( DIGIT )+;
//NEGNUMBER         :   ( DIGIT )+;
fragment LOWCASE    :   'a' .. 'z';
fragment UPCASE     :   'A' ..  'Z';
fragment DIGIT      :   '0' .. '9';
WS		    : ( ' ' | '\r' | '\t' | '\u000C' | '\n' ) {skip();};
SINGLE_COMMENT	    : '//' ~( '\r' | '\n' )* 	{ skip();};
