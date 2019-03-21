grammar Hello;
r : 'hello' ID ;        //match keyword hello followed by an identifier
ID : [a-z]+ ;           //match lower-case identifiers
WD: [ \t\n]+ -> skip ;  //skip spaces, tabs, newlines