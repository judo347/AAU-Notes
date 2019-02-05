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

Slide 23

- Machecode = mostly intell or arm

Slide 24-25 

Slide 30

Skal forstås at hvis et sprog har Type Check så gør det det Reliable.

Java is more Orthogonal then C when we talk about Arrays. In java we can return an Array and in C we cant. 

These are words that we can use to discribe our langauge.

Slide 32-36

Simple Symantax will most likely lead to a simple implementation.

Slide 38-44

Slide 44: this is java

Slide 45-55