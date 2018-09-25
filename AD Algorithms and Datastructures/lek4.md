# Divide-and-conquer: Solving Recurrences & Correctness of Algorithms

$$
T(1)=3 \\
T(n)=T(n-1)+3n, when \ n>1 \\
Expand:\\
T(n-1)=T(n-2)+3(n-1) \\
Substitude: \\
T(n)=T(n-2)+3(n-1)+3n \\
Expand: \\
T(n-2)=T(n-3)+3(n-2) \\
Substitude: \\
T(n)=T(n-3)+3(n-2)+3(n-1)+3n\\
\\
i=T(n-2)+3\sum_{k= something}^{n} k
$$

Above example has to be fixed!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!



### Recursion tree

- A recursion tree is a convenient way to visualize what
  happens when a recurrence is iterated 
- Each **node** represents the cost of a single sub-problem.
- Sum the costs within the each level of the tree to obtain a
  set of **per-level costs**. 
- Sum all the per-level costs to determine the **total cost** of
  all levels of the recursion. 

Example: $T(n)=3*T(n/4)+\theta(n^2)=3*T(n/4)+c*n^2$

![](.\img\16.png)

![](.\img\17.png)

![](.\img\18.png)

- Sum all the per-level costs to determine the **total cost** of
  all levels of the recursion. 
- T(n) = level 1 cost + level 2 cost + level 3 cost + … + level $log_4n$ cost + level $log_4n+1$ cost

![](.\img\19.png)

### Key steps of using recursion trees

- $T(n)=aT(n/b)+D(n)+C(n)$
- How many levels are there in the tree
  - $log_bn+1$
- What is the cost per non-leaf level?
  - Depends on the cost of divide and combining.
- What is the cost for the leaf level?
  - Depends on how many leave nodes are there: $n^{log_ba}$
  - Each leave node has constant cost.
- Sum the per level costs into the final cost. 

Example:
$$
Recursion \ tree \ for: \ T(n)=T(n-1)+3n \\
3n \rightarrow 3(n-1) \rightarrow 3(n-2) \rightarrow 3(n-3) \ ... \ 3(n-(i-1))
$$
It only has on note on each level because T(n) is not * with anything. *i* is the level. Total levels = n.  At level n $T(n) = 3$ base case. 

To solve these you can either use recursion trees or repeated substitution method.

### The master method (exam)

SLIDE 19!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

SLIDE 22 + 23 + 24 + 25 + 26 + 27 + 28 + 35 - 39