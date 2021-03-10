// Define a grammar called Hello
grammar Printer;

//Tokens
PRINT: 'print';
LPARENTHESIS: '(';
RPARENTHESIS: ')';
QUOTE: '"';
SEMICOLON: ';';
NUMBER: [0-9]+;
PHRASE : [a-zA-Z]+;           
WHITESPACE : [ \t\r\n]+ -> skip; 

start : expression;

expression 
    : PRINT                                             # Print
    | '(' inner=expression ')'                          # Parenthesis
    | '"' inner=expression '"'                          # Quote
    | PHRASE                                            # Phrase
    | SEMICOLON                                         # Semicolon
    ;