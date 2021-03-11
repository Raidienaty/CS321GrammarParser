grammar Language;

//Tokens
PRINT: 'print';
LPARENTHESIS: '(';
RPARENTHESIS: ')';
SEMICOLON: ';';
NUMBER: [0-9]+;

start 
    : statement* EOF
    ;

statement
    : functionCall SEMICOLON
    ;

functionCall
    : printFunction                                     # printFunctionCall
    ;

printFunction
    : PRINT LPARENTHESIS expression RPARENTHESIS
    ;

expression 
    : STRING                                            # stringExpression
    ;

STRING
    : ["] ( ~["\r\n\\] | '\\' ~[\r\n] )* ["]
    | ['] ( ~['\r\n\\] | '\\' ~[\r\n] )* [']
    ;       

Comment
    : ( '//' ~[\r\n]* | '/*' .*? '*/' )+ -> skip
    ;

WhiteSpace
    : [ \t\u000C\r\n]+ -> skip
    ;