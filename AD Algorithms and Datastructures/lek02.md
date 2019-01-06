

Todo: side 57 CLRS comparison of polylogarithmic and polynomial functions.



# LEK2: Analysing Algorithms: 

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

#### Compare Algorthms' Efficiencies

Look at how fast T(n) grows as n grows to a very large number (to the limit). This is called **Asymtotic Complexity**.

#### Asymptotic Analysis

- This is the BIG IDEA of algorithmic analysis.
- Goal: to simplify analysis of running time by getting rid of “details”, which may be affected by specific implementation and hardware. 
  - “rounding” for numbers: 1,000,001 ≈ 1,000,000
  - “rounding” for functions: $3n^2$ ≈ $n^2$

- Basic idea of asymptotic analysis - capturing the essence
  - Ignore machine-dependent constants.
  - Look at the growth of the running time with the size of the input in the limit, instead of the actual running time.
  - Asymptotically more efficient algorithms are best for all but very small inputs.

#### Theta notation $\Theta$

- “Engineering way” of manipulating Θ notation.
  - Ignore its leading constant
    - $T(n)=1000*n^5 = \Theta*(n^5)$
  - Drop its lower order terms
    - $T(n)=n^5 + n^3 + lgn= \Theta (n^5)$



- How to identify lower order terms?
  - Constant < poly-logarithm < polynomial < exponential
  - c                            $lg^kn$                      $n^a$                   $b^n$

![](.\img\116.png)

#### Theta notation $\Theta$

- Mathematical definition
  - Θ(g(n)) is a set of functions {f(n)}.
  - Θ(g(n)) ={f(n): there exists positive constants $c_1$, $c_2$, and $n_0$, s.t. $0 ≤ c_1 g(n) ≤ f(n) ≤ c_2 g(n)$ for all $n ≥ n_0$}.
- f(n)= Θ(g(n)) means f(n) ∈ Θ(g(n))
- Asymptotically tight bound
- f(n) is equal to g(n) within a constant factor. 

#### Big-O Notation O

- Mathematical definition
  - Ο(g(n)) is a set of functions.
  - Ο(g(n)) ={f(n): there exists positive constants c, and $n_0$, s.t. $0 ≤ f(n) ≤ c g(n)$ for all $n ≥ n_0$}.
- f(n)= Ο(g(n)) means f(n) ∈ Ο(g(n))
- Asymptotically upper bound.
- f(n) grows asymptotically slower than g(n).
- Used for worst-case analysis.

#### Big-Omega Notation Ω

- Mathematical definition
  - Ω(g(n)) is a set of functions.
  - Ω(g(n)) ={f(n): there exists positive constants c, and n0, s.t. $0 ≤ c g(n) ≤ f(n)$ for all $n ≥ n_0$}.
- f(n)= Ω(g(n)) means f(n) ∈ Ω(g(n))
- Asymptotically lower bound.
- f(n) grows asymptotically faster than g(n).

- Used for best-case analysis. 

![](.\img\117.png)

#### Common Time Complexities

![](.\img\118.png)

#### Two concepts (Complexity)

- Concrete complexity vs. abstract complexity
  - Concrete complexity refers to the results from the complexity analysis using the RAM model, including many details.
  - Abstract complexity refers to the results from the asymptotic analysis, i.e., using the theta, Big-O, and Big-Omega notation. 
- Example, insertion sort
  - Concrete complexity

![](.\img\119.png)

- Abstract complexity (above ex.)
  - Worst case, average case: $Θ(n^2)$
  - Best case: Θ(n)

- Another example, exercise from Lecture 1, CLRS, 1.2-2. 
  - Insertion sort needs $8n^2$ steps vs. merge sort needs 64nlgn steps.
  - Concrete complexity: 8$n^2​$ vs. 64nlgn
  - Abstract complexity: Θ($n^2$) vs. Θ(nlgn)