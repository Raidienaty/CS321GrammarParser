grammar Language;

//Tokens
PRINT: 'print';
LPARENTHESIS: '(';
RPARENTHESIS: ')';
SEMICOLON: ';';

start 
    : statement* EOF
    ;

statement
    : functionCall SEMICOLON                            # generalFunctionCall
    | assignment SEMICOLON                              # assingment
    ;

assignment
    : VARIABLENAME '=' expression
    ;

functionCall
    : printFunction                                     # printFunctionCall
    ;

printFunction
    : PRINT LPARENTHESIS expression RPARENTHESIS
    ;

expression 
    : STRING                                            # stringExpression
    | NUMBER                                            # numberExpression
    | BOOL                                              # boolExpression
    ;

STRING
    : ["] ( ~["\r\n\\] | '\\' ~[\r\n] )* ["]
    | ['] ( ~['\r\n\\] | '\\' ~[\r\n] )* [']
    ;   

VARIABLENAME
    : [a-zA-Z]+
    ;    

DATATYPE
    : 'int'
    | 'double'
    | 'string'
    | 'bool'
    ;

COMMENT
    : ( '//' ~[\r\n]* | '/*' .*? '*/' )+ -> skip
    ;

WHITESPACE
    : [ \t\u000C\r\n]+ -> skip
    ;

NUMBER
    : INT ( '.' DIGIT+ )?
    ;

BOOL
    : 'true'
    | 'false'
    ;

fragment INT
    : [1-9] (DIGIT+)?
    | '0'
    ;

fragment DIGIT
    : [0-9]
    ;