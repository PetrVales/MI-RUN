// Define a grammar called Hello
grammar Hello;

@header{package org.antlr.v4.runtime;}

r  : 'hello' ID ;         // match keyword hello followed by an identifier
ID : [a-z]+ ;             // match lower-case identifiers
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines