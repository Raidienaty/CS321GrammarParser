// Define a grammar called Hello
grammar Hello;

//Tokens
HELLO: 'hello';
ADD: '+';
NUMBER: [0-9]+;
ID : [a-zA-Z]+;           
WHITESPACE : [ \t\r\n]+ -> skip; 

start : expression;

expression : NUMBER
           | left=expression operator=ADD right=expression
           ;
