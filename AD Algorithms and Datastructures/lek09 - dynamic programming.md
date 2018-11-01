# Dynamic programming (algorithm type)

#### Recall algorithm design techniques

- Algorithm design techniques so far:
  - Brute-force algorithms
    - Linear search
  - Incremental algorithms
    - Insertion sort
  - Algorithms that use other ADTs (implemented using efficient data structures)
    - Heap sort
  - Divide-and-conquer algorithms
    - Binary search, merge sort, quick sort.

#### Divide and Conquer

- **Divide**: If the input size is too large to deal with in a straightforward manner, divide the problem into two or more **disjoint** sub-problems.
- **Conquer**: Use divide-and-conquer recursively to solve the sub-problems.
- **Combine**: Take the solutions to the sub-problems and combine these solutions into a solution for the original problem.

#### Dynamic Programming

What if the sub-problems overlap?

- Sub-problems share sub-sub-problems 

In this case, a divide-and-conquer algorithm does more work than necessary, because it needs to repeatedly solve the overlapped sub-sub-problems.

Let's see a concrete example - Fibonacci numbers.

#### Fibonacci Numbers

Leonardo Fibinacci (1202):

- We have a rabbit in the beginning
- A rabbit starts producing offspring on the second generation after its birth and produces one child each generation.
- How many rabbits will there be after n generations?

![](.\img\70.png)

$F(n)=F(n-1)+F(n-2)$

$F(0) = 0,F(1)=1$

$0,1,1,2,3,5,8,13,21,34..$

````pseudocode
FibonacciR(n)
01 if n <= 1 then return n
02 else return FibonacciR(n-1) + FibonacciR(n-2)
````

Straightforward recursive procedure is slow! We have two sub problems and their size is one smaller and two smaller.

Let's draw the recursion tree:

![](.\img\71.png)

We keep calculating the same values!

![](.\img\72.png)

![](.\img\73.png)

- Dynamic programming
  - We can calculate F (n) in linear time by remembering solutions to the solved sub-problems
- Compute solution in a bottom-up fashion
- Trade space for time!
  - Linear time!

![](.\img\74.png)

#### Dynamic Programming

Why and when to use DP?

***When sub-problems overlap, a divide-and-conquer algorithm does more work than necessary, because it needs to repeatedly solve the overlapped sub-sub-problems.***

How does DP work?

**A dynamic programming algorithm solves each sub-sub-problem only once and then saves its result (in an array or a hash table), thus avoiding the work of repeatedly solving the common sub-subproblems.**

#### Optimization Problems

- Dynamic programming is typically applied to **optimization problems**.
- Optimization problems can have many possible solutions, each solution has a value, and we wish to find a solution with the optimal (i.e., minimum or maximum) value.
- An algorithm should compute the optimal value plus, if needed, **an** optimal solution.
- Let’s see two concrete examples of optimization problems
  - Rod cutting
  - Longest common subsequences

#### Rod Cutting

- The problem:
  - A steel rod of length n should be cut and sold in pieces.
  - Pieces sold only in integer sizes according to a price table P[1..n].
  - Goal: cut up the rod to maximize profit.

![](.\img\75.png)

#### How to solve rod cutting

![](.\img\76.png)

#### Rod Cutting Recursion

- Recursive top-down solution

![](.\img\77.png)

- Rod-Cut(P, n) calls Rod-Cut(P, *n-i*) n times where *i* starts from *1 to n*.
- Equivalently, Rod-Cut(P, n) calls Rod-Cut(P, *j*) for *j from n-1 to 0*.

SLIDE 29-!!!!!!!!!!!!!!!

