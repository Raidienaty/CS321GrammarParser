grammar Language;

//Tokens
PRINT: 'print';
LPARENTHESIS: '(';
RPARENTHESIS: ')';
SEMICOLON: ';';
TRUE: 'true';
FALSE: 'false';

start
    : statement* EOF
    ;

statement
    : functionCall SEMICOLON                            # generalFunctionCall
    | assignment SEMICOLON                              # assignmentFunctionCall
    | addition SEMICOLON                                # additionFunc
    ;

assignment
    : VARIABLENAME '=' expression                       # assignmentFunc
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

addition
    : VARIABLENAME '+' VARIABLENAME
    | NUMBER '+' NUMBER
    ;

STRING
    : ["] ( ~["\r\n\\] | '\\' ~[\r\n] )* ["]
    | ['] ( ~['\r\n\\] | '\\' ~[\r\n] )* [']
    ;

VARIABLENAME
    : [a-zA-Z]+
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
    : TRUE
    | FALSE
    ;

fragment INT
    : [1-9] (DIGIT+)?
    | '0'
    ;

fragment DIGIT
    : [0-9]
    ;