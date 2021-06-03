# 2 - Multitape Turing machines, Nondeterministic Turing machines, Emnumerators, Church-Turing Thesis

What happens if we modify the definition of the Turing machine - can we then recognize more langs? No! The notion of the TM is *robust*.

![](.\img2\20.png)

A 1-tape Turing machine can emulate multiple tape machines!! It is slower, but have the same power. On a 1-tape machine, switching between sections/tapes and moving a part of the tape is more expensive.

![](.\img2\21.png)

You use one tape to store the instructions, and one for the input string. The machine then search the instructions when needed.

![](.\img2\22.png)

This expansion allows for multiple actions for the same char.

![](.\img2\23.png)

If the tree just has to lead to at least one accepting state.

![](.\img2\24.png)

![](.\img2\25.png)

The address tape, contains addresses referring to previous slide. (lexicog... is listed to the left)

![](.\img2\26.png)

PART 3 done!