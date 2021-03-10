// Define a grammar called Printer
grammar Printer;

//Tokens
PRINT: 'print';
LPARENTHESIS: '(';
RPARENTHESIS: ')';
SEMICOLON: ';';
NUMBER: [0-9]+;

PHRASE 
    : ["] ( ~["\r\n\\] | '\\' ~[\r\n] )* ["]
    | ['] ( ~['\r\n\\] | '\\' ~[\r\n] )* [']
    ;       

Comment
    : ( '//' ~[\r\n]* | '/*' .*? '*/' ) -> skip
    ;

Space
    : [ \t\r\n\u000C] -> skip
    ;

start 
    : ( expression )+ EOF
    ;

expression 
    : PRINT                                             # Print
    | LPARENTHESIS expression RPARENTHESIS              # Parenthesis
    | PHRASE                                            # Phrase
    | SEMICOLON                                         # Semicolon
    ;