grammar MGPL;

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

// parser rules
prog        : GAME LDF OPAR attrAssList? CPAR decl* stmtBlock block*;
decl        : varDecl SEMI | objDecl SEMI;
varDecl     : ( INT LDF init? ) | ( INT LDF OBRA NUMBER CBRA );
init        : EQ expr;
objDecl     : objType LDF OPARAN attrAssList? CPARAN | objType LDF OBRACKET NUMBER CBRACKET;
objType     : RECTANGLE | TRIANGLE | CIRCLE;
attrAssList : attrAss SEMIKOL attrAssList | attrAss;
attrAss     : LDF ASSIGN expr;
block       : animBlock | eventBlock;
animBlock   : ANIMATION LDF OPARAN objType LDF CPARAN stmtBlock;
eventBlock  : ON keyStroke stmtBlock;
keyStroke   : SPACE | LEFTARROW | RIGHTARROW | UPARROW | DOWNARROW;
stmtBlock   : OCURBRA stmt* CCURBRA;
stmt        : ifStmt | forStmt | assStmt;
ifStmt      : IF OPARAN exr CPARAN stmtBlock ( ELSE stmtBlock )?;
forStmt     : FOR OPARAN assStmt SEMIKOL expr SEMIKOL assStmt CPARAN stmtBlock;
assStmt     : var ASSIGN expr;
var         : LDF | LDF OBRACKET expr CBRACKET | LDF DOT LDF | LDF OBRACKET expr CBRACKET DOT LDF;
expr        : NUMBER | var | var TOUCHES var | MINUS expr | NOT expr | OPARAN expr CPARAN | expr op expr;
op          : OR | AND | EQUALS | LESS | LEQ | PLUS | MINUS | MULT | DIV;

// lexer rules
LDF                 :   ( CHAR ( '_' | DIGIT | CHAR )+ )+;
CHAR                :   ( LOWCASE | UPCASE );
NUMBER              :   ( DIGIT )+;
//NEGNUMBER         :   ( DIGIT )+;
fragment LOWCASE    :   'a' .. 'z';
fragment UPCASE     :   'A' ..  'Z';
fragment DIGIT      :   '0' .. '9';
