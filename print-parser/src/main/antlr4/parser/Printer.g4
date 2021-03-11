// Define a grammar called Printer
grammar Printer;

//Tokens
PRINT: 'print';
LPARENTHESIS: '(';
RPARENTHESIS: ')';
SEMICOLON: ';';
NUMBER: [0-9]+;

start 
    : functionCall* EOF
    ;

functionCall
    : printFunction SEMICOLON
    ;

printFunction
    : PRINT LPARENTHESIS expression RPARENTHESIS
    ;

expression 
    : PHRASE                                            # Phrase
    ;

PHRASE 
    : ["] ( ~["\r\n\\] | '\\' ~[\r\n] )* ["]
    | ['] ( ~['\r\n\\] | '\\' ~[\r\n] )* [']
    ;       

Comment
    : ( '//' ~[\r\n]* | '/*' .*? '*/' )+ -> skip
    ;

WhiteSpace
    : [ \t\u000C\r\n]+ -> skip
    ;