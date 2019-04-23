## Fischer Chap 1

![](.\img\17.png)

1. The scanner reads a source ac programas a text file and produces a stream of tokens. For example, strings such as 5 and 3.2 are recognized as inum and fnum tokens. Reserved keywords such as f and p are distinguished from variable names such as a and b. For languages of greater complexity, the techniques presented in Chapter 3 automate much of this task. (Page 40)
2. The parser processes tokens produced by the scanner, determines the syntactic validity of the token stream, and creates an abstract syntax tree (AST) suitable for the compiler’s subsequent activities. Given the simplicity of ac,we write its parser ad hoc using the recursive-descent style presented in Chapter 5. While such parsers work well in many cases, Chapter 6 presents a more popular technique for generating parsers automatically.
3. The AST created by the parsing task is next traversed to create a symbol table. This table associates type and other contextual information with variables used in an ac program. Most programming languages allow the use of an unbounded number of variable names. Techniques for processing symbols are discussed more generally in Chapter 8. This task can be greatly simplified for ac, which allows the use of at most 23 variable names.
4. The AST is next traversed to perform semantic analysis. For ac, such analysis is fairly minimal. For most programming languages, multiple passes over the AST may be required to enforce programming language rules that are difficult to check in the parsing task. Semantic analysis often decorates or transforms portions of an AST as the actual meaning of such portions becomes more clear. For example, an AST node for the + operator may be replaced with the actual meaning of +, which may
   mean floating point or integer addition.
5. Finally, the AST is traversed to generate a translation of the original program. Necessities such as register allocation and opportunities for program optimization may be implemented as phases that precede code generation. For ac, translation is sufficiently simple to be accommodated in a single code-generation pass.

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

2.2.2

The terminal symbols used in the above figure, for instance the *assign* or *id* must be specified. In the input stream *assign* will appear as =, and we call this the actual input character.

![](.\img\16.png)

**An ac program and its parse tree.**

This tree is build by the scanner and the code responsible is shown on page 40.

2.6 Abstract syntax tree

common practice to create an artefact of syntax analysis known as the abstract syntax tree (AST). This structure contains the essential information from a parse tree, but inessential punctuation and delimiters (braces, semicolons, parentheses, etc.) are not included. (p 46)

![](.\img\18.png)

Visitor pattern! Calling a node and doing something, the visitor then moves on to the next and does something.. and so on.

## Fischer Chap 3

### 3.2 Regular Expressions

A set of strings defined by regular expressions is called a **regular set**.For purposes of scanning, a token class is a regular set whose structure is defined by a regular expression. A particular instance of a token class is sometimes called a **lexeme**; however, we simply call a string in a token class an instance of that token. For example, we call the string abc an identifier if it matches the regular expression that defines the set of valid identifier tokens.

Our definition of regular expressions starts with a finite character set, or vocabulary (denoted Σ). This vocabulary is normally the character set used by a computer. Today, the ASCII character set, which contains 128 characters, is very widely used.

An empty, or null, string is allowed (denoted λ). This symbol represents an empty buffer in which no characters have yet been matched. It also represents an optional part of a token. Thus, an integer literal may begin with a plus or minus, or, if it is unsigned, it may begin with λ.

....

Nået til mid p.66

## Fischer Chap 4

### 4.1 Context-Free Grammers (CFG)

A context-free grammar (CFG) is a compact, finite representation of a language, defined by the following four components:

![](.\img\23.png)



For example, the rule that variables must be declared before they are used cannot be expressed because a CFG provides no mechanism for transmitting to the body of a program the exact set of variables that has been declared. In practice, syntactic details that cannot be represented in a CFG are considered part of the static semantics and are checked by semantic routines (along with scope and type rules).

Nået til 4.2 1448

Java declaration of function describes with NBackus-Naur form (BNF):

``Declaration -> [ final ] [ static ] [ const ] Type identifier { , identifier }``

### 4.4 Parsers and Recognizers

When specifying a parsing technique, we must state whether a leftmost or rightmost parse will be produced. The best-known and most widely used top-down and bottom-up parsing strategies are called LL and LR, respectively. These names seem rather arcane, but they reflect how the input is processed and which kind of parse is produced. In both cases, the first character (L) states that the token sequence is processed from left to right. The second letter (L or R) indicates whether a leftmost or rightmost parse is produced. The parsing technique can be further characterized by the number of lookahead symbols (i.e., symbols beyond the current token) that the parser may consult to make parsing choices. LL(1) and LR(1) parsers are the most common, requiring only one symbol of lookahead.

4 DONE

## Chapter 7 - Syntax-Directed Translation

The AST then serves as
a mechanism for conveying information between compiler phases.

In general, there can be no algorithm that determines whether the
languages denoted by two context-free grammars are the same. This means
that when a grammar is modified, it cannot in general be proved that the
modification did not change the language in some unacceptable way.

256: Designing the AST and parser that generates the wanted AST, CAN BE USED IN PROJECT!

Chap 7 -> DONE

## Chapter 8 - Symbol Tables and Declaration Processing (Section 1-4)

8 -> 8.4 DONE

## Chapter 9 - Semantic Analysis

DONE

Nået til Lek14



Missing reads: Chap14, 