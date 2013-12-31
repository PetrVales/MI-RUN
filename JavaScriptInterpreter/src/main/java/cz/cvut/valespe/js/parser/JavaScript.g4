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
    | createInstance #createInstanceExpression
    | thisExpression #thisExpressionExpression
    | messageToInstance #messageToInstanceExpression
    | arrayAccess #arrayAccessExpression
    | ID #id
    | INT #int
    | STRING #string
    | arrayAssignment #arrayAssignmentExpression
    | createArray #array
    | prototypeAssignmentExpression #prototypeAssignmentExpressionExpression
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
    : (ID|INT|STRING)
    ;

createInstance
    : 'new' ID'(' callParams? ')'
    ;

messageToInstance
    : ID'.'ID'(' callParams? ')' #callMethodOnInstance
    | ID'.'ID ASSIGNMENT expression  #setPropertyOnInstance
    | ID'.'ID  #getPropertyOnInstance
    ;

thisExpression
    : 'this.'ID'(' callParams? ')' #thisCallMethod
    | 'this.'ID ASSIGNMENT expression #thisSetterExpression
    | 'this.'ID #thisGetterExpression
    ;

prototypeAssignmentExpression
    :   ID'.prototype' ASSIGNMENT expression #prototypeAssignment
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

createArray
    : '[' callParams? ']'
    ;
arrayAssignment
    : ID'['INT']' ASSIGNMENT expression
    ;
arrayAccess
    : ID'['INT']'
    ;

ASSIGNMENT:'=';
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
MOD: '%';
INT: '-'? [0-9]+;
ID: [a-zA-Z$_][a-zA-Z0-9$_]*;
STRING: '"' [a-zA-Z0-9,./?!+-*$_]* '"';
WS: [ \t\r\n]+ -> skip;
COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;
