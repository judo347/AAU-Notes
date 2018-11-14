

Todo: side 57 CLRS comparison of polylogarithmic and polynomial functions.



# LEK2: Analysing Algorithms 

#### Insertion Sort

Strategy:

- Start with an “empty hand,” say left hand.
- Insert a card in the correct position of left hand, where the numbers are already sorted. 
- Continue until all cards are inserted/sorted. 

![](.\img\110.png)

#### Example: 5, 2, 4, 6, 1, 3

![](.\img\111.png)

![](.\img\112.png)

#### Analysing the insertion sort

- How fast is insertion sort? absolute vs. relative speeds?
  - Absolut speeds depend on specific computers.
  - Relative speeds do not depend on specific computers.
  - In this course, we care about the relative speed.
  - The relationship between the running time and input size.
    - T(n): running time being a function of input size n.

#### The RAM model

- Instructions
  - Primitive or atomic operations.
  - Each takes constant time, depending on the machine.
  - Instructions are executed one after another. 
- We consider instructions commonly found in real computers.
  - Arithmetic (add, subtract, multiply, etc.)
  - Data movement (assignment)
  - Control (branch, subroutine call, return)
  - Comparison
- Data types – integers, characters, and floats

#### Analysis of Insertion Sort

![](.\img\113.png)

- $t_j$ is the number of times of the **while** loop test in line 5 is executed for a specific value of j.
  - $t_j$ is the number of elements in A[1…j-1] which need to be checked in the j-th iteration of the for loop in line 5. 
- $t_j$ may be different for different j.
- $t_j$ may be different for different input instances, e.g., best case or worst case

#### Run time of insertion sort

 ![](.\img\114.png)

![](.\img\115.png)

#### Best/Worst/Average Case

- Suppose algorithm P accepts k different input instances of size n. Let $T_i (n)$ be the time complexity of P on the i-th input instance, for 1 ≤ i ≤ k, and pi being the probability that this instance occurs.
- Worst case time complexity: $W(n) = max_{1≤ i≤ k}Ti_(n)$
  - The **maximum** running time over all k inputs of size n
  - It is the most interesting/important!
- Average case time complexity: $A(n) = Σ_{1≤ i≤ k} p_iT_i(n)$
  - The **expected** running time over all k inputs of size n
  - Need assumptions about statistical distributions of input instances. 
  - E.g., uniform distribution that each instance is equally likely.
- Best case time complexity: $B(n) = min_{1≤ i≤ k}T_i(n)$
  - The **minimum** running time over all k inputs of size n
  - Can be cheating

SLIDE 23!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!