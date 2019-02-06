# Language Design and Control Structures

#### Most important open problem in computing

Increasing Programmer Productivity: Write programs quickly, easily and correct. Why: Decreases development cost, time to market and support cost and increases satisfaction.

#### How to increase Programmer productivity

1. Process (Software engeenering)
   - Controlling programmers
   - Good process can yeild up to 20% increase
2. Tools (Verification, static analysis, program generation)
   - Good tools can yield up to 10% increase
3. Better designed Languages --- the center of the univers!
   - Core abstractions, mechanisms, services, guarantees.
   - Affect how programmers approach a task (C vs. Haskell)
   - New languages can yield 700% increase

Compilers are big software and you need to write tests and apply all your current knowledge when developing compilers. 

#### What is a programming Language

- A set of rules that provides a way of telling a computer what operations to perform.
- A set of rules for communicating an algorithm
- A linguistic framework for describing computations
- Symbols, words, rules of grammar, rules of semantics
  - Syntax and Semantics
  - (Libraries, Frameworks, Patterns and Pragmas)

#### Levels of programming languages

Higher-level  program:

```
class Triangle {
    ...
    float surface(){
        return b*h/2;
    }
}
```

Low-level program

```
LOAD r1,b
LOAD r2,h
MUL r1,r2
DIV r1,#2
RET
```

Executable Machine code

```
010010010010010
001010010101001
010010101001010
```

#### Types of programming languages

- First generation (Mostly Intel or ARM)

```
Machine
0000 0001 1001 0010
1100 1001 0010 0100
```

- Second generation

```
Assembly
LOAD x
ADD R1 R2
```

- Third generation 

High-level imperative/object oriented: Fortran, Pascal, Ada, C, C++, Java, C#.

```
public Token scan(){
    while(currentchar ==  '' || currentchar == '\n')
    	....
}
```

- Fourth generation

Database: SQL.

```
select fname, lname
from employee
where department='Sales'
```

- Fifth generation

Functional/logic: Lisp, SML, Haskel, Prolog.

```
fact n = if n == 0 then 1
else n*(fact n-1)

uncle(X,Y) :- parent(Z,Y),brother(X,Z).
```

Other new categories of languages: Aspect Oriented Programming, Agent Oriented Programming,  Intentional Programming, Natural language programming.

#### The Principals paradigms

- Imperative Programming: Fortran, Pascal, C.
- Object-Oriented Programming: Simula, SmallTalk, C++, Java, C#.
- Logic/Declarative Programming: Prolog, SQL.
- Functional/Applicative Programming: Lisp, Scheme, Haskell, SML, F#.
- (Aspect Oriented Programming): AspectJ, AspectC#, Aspect.Net.

Multiparadigm era: all languages start to implement others features so a lot of languages is multi-paradigm.

#### Language evaluation

![](.\img\1.PNG)

These are words that we can use to discribe our langauge. The table shows that if a languages has **Type Check** then it makes that language **Reliable**. Java is more Orthogonal then C when we talk about Arrays. In java we can return an Array and in C we cant. 

#### Programming language as a language

In English a sentence can be vague or ambiguous: I saw the man with a telescope (Who had the telescope) - Take a pinch of salt (How much is a pinch). 

In a programming language a sentence either means one thing or it means nothing.

#### Programming Language Specification

A communication device between people who need to have a common understanding of the PL: language designer, language implementer, language user.

**What to specify:**

Specify what is a **well formed** program

- Syntax
- Contextual contraints (also called static semantics)
  - Scope rules
  - Type rules

Specify what is the meaning of (well formed) programs

- Semantics (also called runtime semantics)

**How to specify**

Formal specification: use some kind of precisely defined formalism.

Informal specification: description in English.

Usually a mix of both (e.g. Java specification)

- Syntax => formal specification using CFG
- Contextual constraints and semantics => informal
- Formal semantics has been retrofitted though

But trend towards more formality (C#, Fortress)

![](.\img\2.png)

A language specification has (at least) three parts

- Syntax of the language: Usually formal in BNF or EBNF + RE for lexams
- Contextual constraints: scope rules (often written in English, but can be formal), type rules (formal or informal)
- Semantics: defined by the implementation, informal descriptions in English, formal using operational or denotational semantics.

Simple Symantics will most likely lead to a simple implementation.

#### Language Processors: What are they?

*A programming language processor is any system (software -or hardware) that manipulates programs.*

Examples: 

- Editors: Emacs.
- Integrated Development Environment (IDE): Eclipse, NetBeans, Visual Studio .NET.
- Translators (e.g. compiler, assembler, disassembler)
- Interpreters

![](.\img\3.png)

![](.\img\4.png)

#### Compilation

**Compilation** is at least a two-step process, in which the original program (source program) is input to the compiler, and a new program (target program) is output from the compiler. The compilation steps can be visualized as the following.

![](.\img\5.png)

![](.\img\6.png)

#### Hybrid compiler / interpreter

![](.\img\7.png)



![](.\img\8.png)

Above shows a compiler that makes code from one language into another, and you can then use that codes compiler to compile into machine code. This is done for Java where .java files are turned into .class files.

#### The phases of a Compiler

![](.\img\9.png)

#### Different phases of a compiler

The different phases can be seen as different transformation steps to transform source code into object code. The different phases correspond roughly to the different parts of the language specification:

- Syntax analysis <-> Syntax
- Contextual analysis <-> Contextual constraints
- Code generation <-> Semantics

#### Multi pass compiler

A multi pass compiler makes several passes over the program. The output of a preceding phase is stored in a data structure and used by subsequent phases.

![](.\img\10.png)

#### Organization of a compiler

![](.\img\11.png)

#### Programming language implementation

![](.\img\12.png)

#### Single pass compiler

A single pass compiler makes a single pass over the source text, parsing, analyzing and generating code all at once.

![](.\img\13.png)

The advantages of a programming language that’s easy to compile: 

- Easier to learn, read, understand
- Have quality compilers on a wide variety of machines
- Better code will be generated
- Fewer compiler bugs
- The compiler will be smaller, cheaper, faster, more reliable, and more widely used
- Better diagnostic messages and program development tools

#### Compiler writing tools

Compiler generators (compiler compilers)

- Scanner generator: JLex (lex, lg)
- Parser generator: JavaCUP (Yacc, pg)
- Front-end generator: SableCC, JavaCC, (COCO/R, ANTLR, ..)
- Code-generation tools

Much of the effort in crafting a compiler lies in writing and debugging the semantic phases (Usually hand-coded).

#### Programming language projects

A good DAT4/SW4/IT8 project group can

- Design a language (or language extensions)
- Define the language syntax using CFG
- Define the language semantics using SOS
- Implement a compiler/interpreter
  - in Java (or C/C++, C#, SML, F#, Scala …)
  - Build a recursive decent parser by hand
  - Or using front-end tools such as Lex/Yacc, JavaCC, SableCC, ..
  - Do code generation for abstract machine
    - JVM (PerlVM or .Net CLR) or new VM
  - Or code generation to some high level language
    - C, Java, C#, SQL, XML
  - Or code generation for some hardware platform
    - MIPS, X86, ARM, ATmega, Z80, …
- (Prove correctness of compiler)
  - Using SOS for Prg. Lang. and VM

![](.\img\14.png)

#### Project Advice

A language design and compiler project is easy to structure.

- Design phase (Lecture 1-5 + 13-14 + 19)
- Front-end development (Lecture 6-9)
- Contextual analysis (Lecture 10-12)
- Code generation or interpretation (Lecture 15-18 + 20)

You will learn the techniques and tools you need in time for you to apply them in your project.