## Sebesta Cap 1

A third potential problem is **operator overloading**, in which a single operator symbol has more than one meaning. Although this is often useful, it can lead to reduced readability if users are allowed to create their own overloading and do not do it sensibly. For example, it is clearly acceptable to overload + to use it for both integer and floating-point addition.

1.1.3 Language evaluation Criteria!!!!





## Sebesta Chap 2





## Fischer Chap 2

2.1 Informal difinition of the ac language. (Described in English)

- **Types**: integer and float. 

- **Keywords**: reserved keywords: f, used to declare a float. i to declare an integer and p to print out a variable.
- **Variables**: Variables are declared prior to using them. 23 possible names (roman letters - f, i and p)

- Integer can be converted to float and not the other way. This happens automatically.

The language will be compiled into the language dc. This is a stack-based calculator.

Informal definitions are too vague to serve as the formal difinition. Here we can use the **context-free grammar (CFG)** to specify our language's syntax and **regular expressions** to specify the basic symbols of the language. CFG is a set of productions or rewriting rules.

![](.\img\15.png)

To improve readability, multiple productions for the same symbol can be specified using an arrow for the first production and bar symbols to separate the rest of the productions. For example, Stmt serves the same role in each of the productions.

These productions indicate that a Stmt can be replaced by one of two strings of symbols. In the first rule, Stmt is rewritten by symbols that represent assignment to an identifier. In the second rule, Stmt is rewritten by symbols that print an identifier’s value.

A terminal is a grammar symbol that cannot be rewritten. For example, the id, assign, and $ symbols have no productions in Figure 2.1 that specify how they can be rewritten. On the other hand, Figure 2.1 does contain productions for the nonterminal symbols Val and Expr. To ease readability in the grammar, we adopt the convention that nonterminals begin with an uppercase letter and terminals are all lowercase letters.

As a special case, the symbol λ denotes the empty or null string string, which indicates that there are no symbols on a production’s RHS. The special symbol $ represents the end of the input stream or file.

From java docs: A *context-free grammar* consists of a number of *productions*. Each production has an abstract symbol called a *nonterminal* as its *left-hand side*, and a sequence of one or more nonterminal and *terminal* symbols as its *right-hand side*. For each grammar, the terminal symbols are drawn from a specified *alphabet*.

From java docs: Starting from a sentence consisting of a single distinguished nonterminal, called the *goal symbol*, a given context-free grammar specifies a language, namely, the set of possible sequences of terminal symbols that can result from repeatedly replacing any nonterminal in the sequence with a right-hand side of a production for which the nonterminal is the left-hand side.

