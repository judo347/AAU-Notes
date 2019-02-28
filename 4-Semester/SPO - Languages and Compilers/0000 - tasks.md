## Lecture 4

Needed knowledge:

Extended Bakus Naur Form (EBNF):

- [WORD] - is optional parts
- ( + | - ) - Alternative parts are placed inside () and seperated with |
- {WORD} eller {+ | -} - Repetitions 0 - n
- ")" - I will be using " " for making a character not a part of the EBNF

EBNF example: `` <expr> → <term> {(+ | -) <term>}``  ``  <term> → <factor> {(* | /) <factor>}``

### Individual

4) Write EBNF descriptions for the following:

``Declaration -> [privacy-modifier] [final] [static] [const] (<returnType> | void)  <identifier>"("{<type> <identifier>} ")"`` 

a) A java class definition header statement



b) A java method call statement

``<methodCall> -> <identifier> "(" {<var> ,} ")" ;``

``<methodCall> -> <identifier> = <methodCall>``

``<methodCall> -> <type> <identifier> = <methodClass> ``



## Lecture 5

A grammar is ambiguous if one input can produce two trees.

### Individual 

2) For each of the grammars below, describe the language associated with the grammar and determine if the grammar is ambiguous. If the grammar is ambiguous show two parse trees for the same string, otherwise explain why the grammar is not ambiguous.

![](.\img\27.jpg)

