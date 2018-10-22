### 3: Divide and Conquer (Analyzing Recursive ..)

Divide big problems into small problems of the same nature. Then solve the sub-problems recursively until it is so small that you can solve the problem trivially.

#### factorial n!

![3](.\img\3.PNG)

#### Divide-and-conquer

Divide-and-conquer method for algorithm design:

- If the problem size is small enough to solve it in a
  straightforward manner, solve it. Otherwise, do the
  following:
  - **Divide**: Divide the problem into a number of *disjoint* subproblems.
  - **Conquer**: Use divide-and-conquer recursively to solve the subproblems.
  - **Combine**: Take the solutions to the sub-problems and combine
    these solutions into a solution for the original problem.

#### Binary Search

Non-recursive version:

![](.\img\5.png)

Recursive version:

![](.\img\6.png)

#### Recurrences

- Running times of algorithms with **recursive calls** can be described using recurrences.

- A **recurrence** is an equation or inequality that describes a function in terms of its value on smaller inputs.
- Assume that
  - If the problem size is small enough, the problem can be solved in constant time, i.e.., **Θ(1)**.
  - The division of problem yields **a** sub-problems and each subproblem
    is **1/b** the size of the original.
- We have:

![4](.\img\4.png)

#### Recurrence on Binary Search

- a = 1, b=2, having one sub-problem with half elements in
  the array. 
- D(n) = Θ(1), computing the middle index, constant time.
- C(n) = 0, no need to combine. 

$$
T(n)= \\ Θ(1)\:\:\:\:\:\:\:\:\: if\: n=1 \\ T(n/2)+Θ(1)\:\:\:\:\:\:\:\:\:\:\:\:\:\:\:\:\:\:\:otherwise, i.e., if\:\:n>1
$$

#### The Repeated Substitution Method

- Solving recurrences with the repeated substitution method
  - Substitute
  - Expand
  - Substitute
  - Expand
  - ...
- Observe a *pattern* and write how your expression looks
  after the i-th substitution.
- Find out what the value of i should be to get the base case
  of the recurrence T(1).
- Insert the value of T(1) and the expression of i into your
  expression.

![](.\img\7.png)

![](.\img\8.PNG)

![](.\img\9.PNG)

![](.\img\10.PNG)

a = cost of solving trivial case, b = cost of dividing.



#### Merge Sort

- An algorithm that is able to solve the sorting problem and
  uses the divide-and-conquer technique. 
- Assume that we are going to sort a sequence of numbers
  in array A. 
- **Divide**
  - If A has at least two elements (nothing needs to be done if A has
    zero or one elements), remove all the elements from A and put
    them into two sequences, A_1 and A_2 , each containing about half of
    the elements of A. (i.e. A1 contains the first ┌n/2┐ elements and A2
    contains the remaining └ n/2 ┘ elements).
- **Conquer**
  - Sort sequences A1 and A2 using Merge Sort.
- **Combine**
  - Put back the elements into A by merging the sorted sequences A1
    and A2 into one sorted sequence

#### Merge Sort: Algorithm

![](.\img\11.PNG)![](.\img\12.PNG)

![](.\img\13.PNG)

![](.\img\14.PNG)

#### Running Time of Merge Sort

- Write the recurrences 
  - Solving the trivial problem: constant time, Θ(1) 
  - Dividing: constant time, Θ(1) 
  - Combining: linear time, Θ(n)
  - Each division, we get two sub-problems with half size. 
- Thus, we have T(n)=
  - Θ(1)                           if n=1
  - $2T(n/2) + Θ(n)$     if n>1



#### Mini Quiz

- What is the running time of merge sort?



- By solving the recurrence
- T(n)=
  - $Θ(1)$                             if n=1
  - $2T(n/2) + Θ(n)$        if n>1

![](.\img\15.PNG)

- Can we say merge sort is better than insertion sort?
- Yes, run time Θ(nlgn) vs. Θ(n2)
- No, additional space Θ(n) vs. Θ(1) 
  - The merge step requires an additional array with size n
  - 
- We will see another sorting algorithm, Heap Sort, that has
  run time Θ(nlgn) and also Θ(1) additional space. 