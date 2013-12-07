
grammar MGPL;

// token rules -- complete like mgpl enbf a2
tokens {
	GAME 		= 'game';
	INT		= 'int';
	SEMIKOL		= ';';
	OPARAN		= '(';
	CPARAN		= ')';
	OBRACKET	= '[';
	CBRACKET	= ']';
	OCURBRA		= '{';
	CCURBRA		= '}';
	EQUAL		= '=';
	OR		= '||';
	AND		= '&&';
	EQUALS		= '==';
	LESS		= '<';
	LEQ		= '<=';
	PLUS		= '+';
	MINUS		= '-';
	MULT		= '*';
	DIV		= '/';
	IF		= 'if';
	ELSE		= 'else';
	FOR		= 'for';
	RECTANGLE 	= 'rectangle';
	TRIANGLE	= 'triangle';
	CIRCLE		= 'circle';
	ANIMATION	= 'animation';
	ON		= 'on';
	SPACE		= 'space';
	LEFTARROW	= 'leftarrow';
	RIGHTARROW	= 'rightarrow';
	UPARROW		= 'uparrow';
	DOWNARROW	= 'downarrow';
	TOUCHES		= 'touches';
		
}

// parser rules
prog		: GAME LDF OPAR attrAssList? CPAR decl* stmtBlock block*;
decl		: varDecl SEMI | objDecl SEMI;
varDecl 	: ( INT LDF init? ) | ( INT LDF OBRA NUMBER CBRA );
init		: EQ expr;
objDecl		:	;
expr		:	;
attrAssList	:	;
stmtBlock	:	;
block		:	;

// lexer rules
LDF			:	( '_' ( DIGIT | CHAR )+ )+;
CHAR			:	( LOWCASE | UPCASE );
NUMBER			:	( DIGIT )+;
//NEGNUMBER		:	( DIGIT )+;
fragment LOWCASE	:	'a' .. 'z';
fragment UPCASE		:	'A' ..	'Z';	
fragment DIGIT		:	'0' .. '9';

