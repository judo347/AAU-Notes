### 3: Divide and Conquer (Analyzing Recursive ..)

Divide big problems into small problems of the same nature. Then solve the sub-problems recursively until it is so small that you can solve the problem trivially.

#### factorial n!

![3](.\img\3.PNG)

TODo SLIDE 10

TODO SLIDE 11-12

#### Recurrences

- Running times of algorithms with recursive calls can be described using recurrences.

- A recurrence is an equantion or inequality that describes a function in terms of its value on smaller inputs.
- Assume that
  - If the problem size is small enough, the problem can be solved in constant time, i.e.., Theta(1).
  - The division of problem yields a sub-problems and each subproblem
    is 1/b the size of the original.
- We have:

![4](.\img\4.png)

#### Recurrence on Binary Search

TODO SLIDE 15 - 16 - 17  - 18

a = cost of solving trivial case, b = cost of dividing.

#### Merge Sort

todo slide 26 - 27

todo slide 50 - 51 

todo slide 53 - 54 - 55 - 56