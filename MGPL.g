grammar MGPL;

options {
    backtrack=false;
}

// token rules -- complete like mgpl enbf a2
tokens {
    INT         = 'int';
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

// parser rules
prog        : 'game' LDF '(' attrAssList? ')' decl* stmtBlock block*;
decl        : varDecl ';' | objDecl ';' ;
varDecl     : ( INT LDF init? ) | ( INT LDF '[' NUMBER ']' );
init        : ASSIGN expr;
objDecl     : objType LDF '[' attrAssList? ']' | objType LDF '[' NUMBER ']';
objType     : RECTANGLE | TRIANGLE | CIRCLE;
attrAssList : ( LDF ASSIGN expr ) ( ';' LDF ASSIGN expr )*;
block       : animBlock | eventBlock;
animBlock   : ANIMATION LDF '(' objType LDF ')' stmtBlock;
eventBlock  : ON keyStroke stmtBlock;
keyStroke   : SPACE | LEFTARROW | RIGHTARROW | UPARROW | DOWNARROW;
stmtBlock   : '{' stmt* '}' ;
stmt        : ifStmt | forStmt | assStmt;
ifStmt      : IF '(' expr ')' stmtBlock ( ELSE stmtBlock )?;
forStmt     : FOR '(' assStmt ';' expr ';' assStmt ')' stmtBlock;
assStmt     : var ASSIGN expr;
var         : LDF ( '[' expr ']' ( '.' LDF)?  | '.' LDF )?;

// expressions
// expr standard expressions := num | var | ( expr) | not |...
expr        : ( ground |unary ground ) op?;

// ground expressions
ground      : NUMBER | var ( TOUCHES var )? | '(' expr ')' ;

// operator precedence
op          : multExpr;
multExpr    : addExpr ((MULT | DIV) ground)* ;
addExpr     : relatExpr ((MINUS | PLUS) ground)*;
relatExpr   : andExpr ((EQUALS | LESS | LEQ) ground)*;
andExpr     : orExpr (AND ground)*;
orExpr      : OR ground;
unary       : (MINUS | NOT) ;

// lexer rules
LDF                 :   ( LOWCASE | UPCASE ) ( '_' | DIGIT | LOWCASE | UPCASE )*;
NUMBER              :   ( DIGIT )+;
fragment LOWCASE    :   'a' .. 'z';
fragment UPCASE     :   'A' ..  'Z';
fragment DIGIT      :   '0' .. '9';

WS          : ( ' ' | '\r' | '\t' | '\u000C' | '\n' ) {skip();};
// comments
SINGLE_COMMENT      : '//' ~( '\r' | '\n' )*    { skip();};
