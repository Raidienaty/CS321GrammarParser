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
    | subtraction                                       # subtractionFunc
    | division                                          # divisionFunc
    | multiplication                                    # multiplicationFunc
    | modulus                                           # modulusFunc
    | square                                            # squareFunc
    | squareRoot                                        # squareRootFunc
    ;

addition
    : VARIABLENAME '+' VARIABLENAME
    | NUMBER '+' NUMBER
    | VARIABLENAME '+' NUMBER
    | NUMBER '+' VARIABLENAME
    ;

subtraction
    : VARIABLENAME '-' VARIABLENAME
    | NUMBER '-' NUMBER
    | VARIABLENAME '-' NUMBER
    | NUMBER '-' VARIABLENAME
    ;

multiplication
    : VARIABLENAME '*' VARIABLENAME
    | NUMBER '*' NUMBER
    | VARIABLENAME '*' NUMBER
    | NUMBER '*' VARIABLENAME
    ;

division
    : VARIABLENAME '/' VARIABLENAME
    | NUMBER '/' NUMBER
    | VARIABLENAME '/' NUMBER
    | NUMBER '/' VARIABLENAME
    ;

modulus
    : VARIABLENAME '%' VARIABLENAME
    | NUMBER '%' NUMBER
    | VARIABLENAME '%' NUMBER
    | NUMBER '%' VARIABLENAME
    ;
square
    : VARIABLENAME '^' VARIABLENAME
    | NUMBER '^' NUMBER
    | VARIABLENAME '^' VARIABLENAME
    | NUMBER '^' VARIABLENAME
    ;
squareRoot
    : '/*' VARIABLENAME
    | '/*' NUMBER
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