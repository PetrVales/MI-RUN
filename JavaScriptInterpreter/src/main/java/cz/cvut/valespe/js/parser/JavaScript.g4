grammar JavaScript;

@header{package cz.cvut.valespe.js.parser;}

file: (functionDeclaration | expression | varDeclaration)+;

functionDeclaration
    : 'function' WS? functionName WS? '(' functionParameters? ')' WS? block
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

block
    : '{' (functionDeclaration | expression | varDeclaration)* '}'
    ;

expression
    : ID #id
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

assignmentExpression
    :   ID assignmentOperator expression
    ;

assignmentOperator
    :   ' = ' | ' *= ' | ' /= ' | ' %= ' | ' += ' | ' -= '
    ;

anonymousFunction
    : 'function' '(' functionParameters? ')' block
    ;

varDeclaration
    : 'var' ID
    ;

PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
MOD: '%';
INT: '-'? [0-9]+;
ID: [a-zA-Z$_][a-zA-Z0-9$_]*;
WS : [ \t\r\n]+ -> skip ;
