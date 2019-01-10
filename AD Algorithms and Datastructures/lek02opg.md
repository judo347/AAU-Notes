#### Lecture 2

**3.1-1**

**Let f(n) and g(n) be asymptotically nonnegative functions. Using the basic definition of Θ-notation, prove that $max(f(n), g(n)) = Θ(f(n) + g(n))$.**

trivially : 46

**3.1-4 **

**Is $2^{n+1} = O(2^n)) $? Is $2^{2n} = O(2^n)$? **

$2^{n+1}=2*2^n=O(2^n)$ 

$2^{2n}=4^n$ IS NOT $O(2^n)$

**2 By Getting rid of the asymtotically insignificant parts of the expressions, give a simplified asymtotic tight bounds (theta notation) for the following running times. Here $k >=1, e > 0, c >1$ are constants** 

- **1. $0.001n^2 + 70000n$**

  $Θ(n2)$

- **2. $2^n + n^{10000}$**
  $\theta(2^n)$

- **3. $n^k+c^n$**
  $\theta(c^n)$ Because any exponential function dominates any polynomial function.

- **4. $lg^kn+n^e$**
  $\theta(n^e)​$

- **5. $2^n + 2^{n/2}$**
  $\theta(2^n)$

- **6. $n{lg*c}+c^{lg*n}$**
  $\theta(c^{lg*n})=\theta(n^{lg*c})$ because $n^{lg*c}=c^{lg*n}$

**Exercise 2.1 Consider the following algorithm:**

![1](.\img\1.PNG)

**What is DoSomething(8)? What is the (asymptotic) running time of DoSomething?**

| Lines number | Algorithm                              | cost    | times                           |
| ------------ | -------------------------------------- | ------- | ------------------------------- |
| 1            | $A:int[1..n]$                          | c1 = 0  |                                 |
| 2            | $for \: i \leftarrow 1\: to\: n$       | c2      | n                               |
| 3            | $do \: A[i] \leftarrow i$              | c3      | n-1                             |
| 4            | $i \leftarrow n$                       | c4 = 0  |                                 |
| 5            | $while \:i > 1 \:do$                   | c5      | $\sum_{j=2}^{n}{t_j}$           |
| 6            | $x \leftarrow A[1]$                    | c6      | $\sum_{j=2}^{n}{t_j-1}$         |
| 7            | $for \: j \leftarrow 1 \: to \: n -1 $ | c7      | $n$ + noget af det ovenstående? |
| 8            | $do \: A[j] \leftarrow A[j+1]$         | c8      | $n-1$                           |
| 9            | $A[n] \leftarrow x$                    | c9      | $\sum_{j=2}^{n}{t_j-1}$         |
| 10           | $i \leftarrow [i/2]$                   | c10     | $\sum_{j=2}^{n}{t_j-1}$         |
| 11           | $return \: A[1]$                       | c11 = 0 |                                 |

Udregnet forkert

Svar = $O(n*lg*n)$



**Exercise 2.2 - Consider the following algorithm: **

![2](.\img\2.PNG)

**Assume that A is with size 8x8, how does A look like after FillTable(A)? What is the (asymtotic) running time of FillTable?**

Runtime = $O(n^2)$
