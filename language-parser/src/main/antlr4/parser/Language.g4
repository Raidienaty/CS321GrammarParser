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
    | assignment SEMICOLON                              # assignmentFunctionCall
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
    : addition                                          # additionFunc
    | STRING                                            # stringExpression
    | NUMBER                                            # numberExpression
    | BOOL                                              # boolExpression
    | VARIABLENAME                                      # variableExpression
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