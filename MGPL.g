grammar MGPL;

options {
	backtrack=false;
	ASTLabelType=CommonTree;
	output=AST;
}

// token rules
tokens {
        GAME        = 'game';
        INT         = 'int';
        DOT         = '.';
        COMMA	=',';
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
prog        : GAME^ LDF^ OPARAN! attrAssList? CPARAN! decl* stmtBlock block*;
decl        : varDecl SEMIKOL! | objDecl SEMIKOL!;
varDecl     : INT^ LDF init? |  INT^ LDF OBRACKET! NUMBER CBRACKET!;
init        : ASSIGN^ expr;
objDecl     : objType LDF^ OPARAN! attrAssList? CPARAN! | objType LDF^ OBRACKET! NUMBER CBRACKET!;
objType     : RECTANGLE | TRIANGLE | CIRCLE;
attrAssList	: LDF ASSIGN^ expr (COMMA! attrAssList)*;
//attrAss	: LDF ASSIGN expr; 
block       : animBlock | eventBlock;
animBlock   : ANIMATION^ LDF OPARAN! objType LDF CPARAN! stmtBlock;
eventBlock  : ON^ keyStroke stmtBlock;
keyStroke   : SPACE | LEFTARROW | RIGHTARROW | UPARROW | DOWNARROW;
stmtBlock   : OCURBRA! stmt* CCURBRA!;
stmt        : ifStmt | forStmt | assStmt;
ifStmt      : IF^ OPARAN! expr CPARAN! stmtBlock ( ELSE^ stmtBlock )?;
forStmt     : FOR^ OPARAN! assStmt2 SEMIKOL! expr SEMIKOL! assStmt2 CPARAN! stmtBlock;
assStmt2 : var ASSIGN^ expr ;
assStmt     : var ASSIGN^ expr SEMIKOL!;
var         : LDF^ ( OBRACKET! expr CBRACKET! ( DOT LDF)? |  DOT LDF)?;

// expressions with paran and precedence
expr 	: OPARAN! expr CPARAN! | (op expr)* ;
//paran	: atom | OPARAN op atom CPARAN;
op	:  disjunkt;
disjunkt 	: konjunkt (OR^ konjunkt)*;
konjunkt	: relat (AND^ relat)*;
relat	: add ((EQUALS | LESS | LEQ)^ add)*;
add	: mult ((PLUS | MINUS)^ mult)*;
mult	: unary (( MULT | DIV)^ unary)*;
unary	: (NOT^)? atom | MINUS (NUMBER | var  (TOUCHES^ var)?) ;
atom 	: NUMBER | var  (TOUCHES^ var)?;

// lexer rules 
LDF                 :   (LOWCASE | UPCASE ) ( '_' | DIGIT | LOWCASE | UPCASE )*;
NUMBER              :   (DIGIT)+;
fragment LOWCASE    :   'a' .. 'z';
fragment UPCASE     :   'A' ..  'Z';
fragment DIGIT      :   '0' .. '9';
WS		    : ( ' ' | '\r' | '\t' | '\u000C' | '\n' ) {skip();};

// comments
SINGLE_COMMENT	    : '//' ~( '\r' | '\n' )* 	{ skip();};