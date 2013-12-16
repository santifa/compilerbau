//Henrik Jürges 751237
//Fritz Meiners 743338

grammar MGPL;

options {
	backtrack=false;
	ASTLabelType=CommonTree;
	output=AST;
	k=3;
}

// token rules
tokens {
        GAME       		= 'game';
        INT         		= 'int';
        DOT         		= '.';
        COMMA		=',';
        SEMIKOL     	= ';';
        OPARAN      	= '(';
        CPARAN      	= ')';
        OBRACKET    	= '[';
        CBRACKET    	= ']';
        OCURBRA     	= '{';
        CCURBRA     	= '}';
        ASSIGN      	= '=';
        NOT         		= '!';
        OR          		= '||';
        AND         		= '&&';
        EQUALS      	= '==';
        LESS        		= '<';
        LEQ         		= '<=';
        PLUS        	= '+';
        MINUS       	= '-';
        MULT        	= '*';
        DIV         		= '/';
        IF          		= 'if';
        ELSE        		= 'else';
        FOR         		= 'for';
        RECTANGLE   	= 'rectangle';
        TRIANGLE    	= 'triangle';
        CIRCLE      	= 'circle';
        ANIMATION   	= 'animation';
        ON          		= 'on';
        SPACE       	= 'space';
        LEFTARROW   	= 'leftarrow';
        RIGHTARROW  	= 'rightarrow';
        UPARROW     	= 'uparrow';
        DOWNARROW   	= 'downarrow';
        TOUCHES     	= 'touches';
        ATTR;
        ATTR2;
        OBJDECL;
        VARDECL;
        ANIM;
        EVENT;
        ASSIGNMENT;
        PROG;
        STMT;
}

// java header
@header {
package antlr.projekt1;
}

@lexer::header {
package antlr.projekt2;
}

// parser rules
prog        	: GAME LDF OPARAN attrAssList? CPARAN decl* stmtBlock block*  -> ^(PROG["Game"] LDF) ^(ATTR2["Attribute"] attrAssList?) ^(PROG["Declaration"] decl*) ^(STMT["Statements"] stmtBlock) block*;
decl        	: varDecl SEMIKOL  -> ^(VARDECL["Variable"] varDecl )
	| objDecl SEMIKOL -> ^(OBJDECL["Object"] objDecl ) ;
varDecl     	: INT^ LDF init? 
	|  INT^ LDF OBRACKET! NUMBER CBRACKET! ;
init        	: ASSIGN expr ;
objDecl     	: objType LDF^ OPARAN! attrAssList? CPARAN! 
	| objType LDF^ OBRACKET! NUMBER CBRACKET! ;
objType     	: RECTANGLE | TRIANGLE | CIRCLE;
attrAssList	: attrAss (COMMA attrAss)* ;
attrAss	: LDF ASSIGN expr -> ^(ATTR ["Attribut"] LDF ASSIGN expr) ;
block       	: animBlock -> ^(ANIM["Animation"] animBlock) 
	| eventBlock -> ^(EVENT["Event"] eventBlock);
animBlock   	: ANIMATION! LDF OPARAN! objType LDF CPARAN! stmtBlock ;
eventBlock  	: ON^ keyStroke stmtBlock ;
keyStroke   	: SPACE 
	| LEFTARROW 
	| RIGHTARROW 
	| UPARROW 
	| DOWNARROW ;
stmtBlock   	: OCURBRA! stmt* CCURBRA! ;
stmt        	: ifStmt 
	| forStmt 
	| assStmt;
ifStmt      	: IF^ OPARAN! expr CPARAN! stmtBlock ( ELSE^ stmtBlock )?;
forStmt    	 : FOR^ OPARAN! assStmt2 SEMIKOL! expr SEMIKOL! assStmt2 CPARAN! stmtBlock;
assStmt2 	: var ASSIGN^ expr ;
assStmt     	: var ASSIGN expr SEMIKOL -> ^(ASSIGNMENT["Assignment"] var ASSIGN expr);
var         	:	 
	LDF^ ( OBRACKET! expr CBRACKET! ( DOT LDF)? 
	|  DOT LDF)?
	;

// expressions with paran and precedence
expr 	:  OPARAN! expr CPARAN! 
	| (op (OPARAN! expr CPARAN!)? )* ;
op 	: konjunkt (OR^ konjunkt)* ;
konjunkt	: relat (AND^ relat)* ;
relat	: add ((EQUALS | LESS | LEQ)^ add)* ;
add	: mult ((PLUS | MINUS)^ mult)* ;
mult	: unary (( MULT | DIV)^ unary)* ;
unary	: (NOT^ | MINUS^)? atom ;
atom 	: NUMBER 
	| var  (TOUCHES^ var)? ;

// lexer rules 
LDF                 		:   (LOWCASE | UPCASE ) ( '_' | DIGIT | LOWCASE | UPCASE )* ;
NUMBER              	:   (DIGIT)+ ;
fragment LOWCASE    	:   'a' .. 'z' ;
fragment UPCASE     	:   'A' ..  'Z' ;
fragment DIGIT      	:   '0' .. '9' ;
WS		: ( ' ' | '\r' | '\t' | '\u000C' | '\n' ) {skip();} ;

// comments
SINGLE_COMMENT	: '//' ~( '\r' | '\n' )* 	{ skip();};
