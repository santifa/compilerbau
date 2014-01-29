//Henrik Jürges 751237
//Fritz Meiners 743338

grammar MGPL;

options {
    backtrack=false;
    ASTLabelType=CommonTree;
    output=AST;
    k=1;
}

tokens {
    NOT             = '!';
    OR              = '||';
    AND             = '&&';
    EQUALS          = '==';
    LESS            = '<';
    LEQ             = '<=';
    PLUS            = '+';
    MINUS           = '-';
    MULT            = '*';
    DIV             = '/';
    ATTR;
    ATTR2;
    OBJDECL;
    VARDECL;
    ANIM;
    EVENT;
    ASSIGNMENT;
    PROG;
    STMT;
    STMTBLOCK;
}


// parser rules
prog            : 'game' IDF '(' attrAssList? ')' decl* stmtBlock block* EOF  -> ^(PROG["Game"] IDF) ^(ATTR2["Attribute"] attrAssList?) ^(PROG["Declaration"] decl*) ^(STMT["Statements"] stmtBlock) block*;
decl            : varDecl ';'  -> ^(VARDECL["Variable"] varDecl ) | objDecl ';' -> ^(OBJDECL["Object"] objDecl );
varDecl         : 'int'^ IDF (init? | '['! NUMBER ']'!);
init            : '=' expr;
objDecl         : objType IDF^ '['! (attrAssList? | NUMBER) ']'!;
objType         : 'rectangle' | 'triangle' | 'circle';
attrAssList     : attrAss (',' attrAss)*;
attrAss         : IDF '=' expr -> ^(ATTR ["Attribut"] IDF '='! expr);
block           : animBlock -> ^(ANIM["Animation"] animBlock) | eventBlock -> ^(EVENT["Event"] eventBlock);
animBlock       : 'animation'! IDF '('! objType IDF ')'! stmtBlock;
eventBlock      : 'on' keyStroke stmtBlock;
keyStroke       : 'space' | 'leftarrow' | 'rightarrow' | 'uparrow' | 'downarrow';
stmtBlock       : '{' stmt* '}' -> ^(STMTBLOCK["Statement"] stmt*);
stmt            : ifStmt | forStmt | assStmt;
ifStmt          : 'if'^ '('! expr ')'! stmtBlock (elseStmt)?;
elseStmt        : 'else'^ stmtBlock;
forStmt         : 'for'^ '('! assStmt2 ';'! expr ';'! assStmt2 ')'! stmtBlock;
assStmt2        : var '='^ expr;
assStmt         : var '=' expr ';' -> ^(ASSIGNMENT["Assignment"] var '='! expr);
var             : IDF^ ( '['! expr ']'! ( '.' IDF)? | '.' IDF)?;

// expressions with paran and precedence
expr     : disj;
disj     : conj (OR^ conj)*;
conj     : relat (AND^ relat)*;
relat    : add ((EQUALS | LESS | LEQ)^ add)*;
add      : mult ((PLUS | MINUS)^ mult)*;
mult     : unary ((MULT | DIV)^ unary)*;
unary    : (NOT | MINUS)* atom;
atom     : NUMBER | var ('touches'^ var)? | '(' expr ')';

// lexer rules
IDF              : (LOWCASE | UPCASE) ('_' | DIGIT | LOWCASE | UPCASE)*;
NUMBER           : (DIGIT)+;
fragment LOWCASE : 'a' .. 'z';
fragment UPCASE  : 'A' ..  'Z';
fragment DIGIT   : '0' .. '9';
WS               : (' ' | '\r' | '\t' | '\u000C' | '\n') {skip();};

// comments
SINGLE_COMMENT   : '//' ~('\r' | '\n')* { $channel=HIDDEN;};
