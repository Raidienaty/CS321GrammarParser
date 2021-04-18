grammar Language;

//Tokens
PRINT: 'print';
ASSIGNMENT: '=';
LPARENTHESIS: '(';
RPARENTHESIS: ')';
SEMICOLON: ';';

//math tokens
ADD: '+';
SUBTRACT: '-';
MULTIPLY: '*';
DIVIDE: '/';
MODULUS: '%';
POWER: '^';

//if statement tokens
OR: '||';
AND: '&&';
EQUIVALENT: '==';
NOTEQUIVALENT: '!=';
GREATERTHANEQUALS: '>=';
LESSTHANEQUALS: '<=';
GREATERTHAN: '>';
LESSTHAN: '<';
NOT: '!';

start
    : statement* EOF
    ;

statement
    : functionCall SEMICOLON
    | assignment SEMICOLON
    | ifStatement
    | forLoop
    | whileLoop
    ;

assignment
    : VARIABLENAME '=' expression                           # assignmentFunc
    | VARIABLENAME '++'                                     # addOneFunc
    | VARIABLENAME '--'                                     # subtractOneFunc
    ;

functionCall
    : PRINT LPARENTHESIS expression RPARENTHESIS            # printFunctionCall
    ;

ifStatement
    : ifStatementContext ( elseIf )* ( elseStatement )?
    ;

ifStatementContext
    : 'if' LPARENTHESIS expression RPARENTHESIS '{' (statement)* '}'
    ;

elseIf
    : 'else if' LPARENTHESIS expression RPARENTHESIS '{' (statement)* '}'
    ;

elseStatement
    : 'else' '{' ( statement )* '}'
    ;

forLoop
    : 'for' LPARENTHESIS forLoopContext RPARENTHESIS '{' (statement)* '}'
    ;

forLoopContext
    : assignment SEMICOLON expression SEMICOLON assignment
    ;

whileLoop
    : 'while' LPARENTHESIS expression RPARENTHESIS '{' (statement)* '}'
    ;

expression
    : STRING                                                # stringExpression
    | NUMBER                                                # numberExpression
    | BOOL                                                  # boolExpression
    | VARIABLENAME                                          # variableExpression
    | expression '+' expression                             # additionFunc
    | expression '-' expression                             # subtractionFunc
    | expression '*' expression                             # multiplicationFunc
    | expression '/' expression                             # divisionFunc
    | expression '%' expression                             # modulusFunc
    | expression '^' expression                             # powerFunc
    | 'sqrt' LPARENTHESIS expression RPARENTHESIS           # squareRootFunc
    | expression op=( '<' | '>' | '>=' | '<=' ) expression  # comparisonExpression
    | expression op=( '==' | '!=' ) expression              # equivalenceExpression
    | expression '&&' expression                            # andExpression
    | expression '||' expression                            # orExpression
    | '!' expression                                        # notExpression
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