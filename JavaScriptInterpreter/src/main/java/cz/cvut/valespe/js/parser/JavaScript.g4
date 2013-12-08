grammar JavaScript;

@header{package cz.cvut.valespe.js.parser;}

file: (functionDeclaration | expression | varDeclaration)+;

functionDeclaration
    : 'function' WS? functionName WS? '(' functionParameters? ')' WS? functionBody
    ;

functionName
    : ID
    ;
functionParameters
    : functionParameter (',' functionParameter)*
    ;
functionParameter
    : ID
    ;

functionBody
    : '{' (functionDeclaration | expression | varDeclaration)* '}'
    ;

expression
    : functionCall #functionCallExpression
    | ID #id
    | INT #int
    | assignmentExpression #assignmentExpressionExpression
    | anonymousFunction #anonymousFunctionExpression
    | '(' expression ')' #parenthesesExpression
    | expression MUL expression #mulExpression
    | expression DIV expression #divExpression
    | expression MOD expression #modExpression
    | expression PLUS expression #plusExpression
    | expression MINUS expression #minusExpression
    ;

functionCall
    : ID '(' callParams? ')'
    ;
callParams
    : callParam (',' callParam)*
    ;
callParam
    : (ID|INT)
    ;

assignmentExpression
    :   ID ASSIGNMENT expression #assignment
    |   'var' ID ASSIGNMENT expression #varAssignment
    ;


anonymousFunction
    : 'function' '(' functionParameters? ')' functionBody
    ;

varDeclaration
    : 'var' ID
    ;

ASSIGNMENT:'=';
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
MOD: '%';
INT: '-'? [0-9]+;
ID: [a-zA-Z$_][a-zA-Z0-9$_]*;
WS : [ \t\r\n]+ -> skip ;
