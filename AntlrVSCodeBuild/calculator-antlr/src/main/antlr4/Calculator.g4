// Define a grammar called Calculator
grammar Calculator;

//Tokens
HELLO: 'hello';
ADD: '+';
REMOVE: '-';
NUMBER: [0-9]+;
ID : [a-zA-Z]+;           
WHITESPACE : [ \t\r\n]+ -> skip; 

start : expression;

expression : NUMBER
           | left=expression operator=ADD right=expression
           ;
