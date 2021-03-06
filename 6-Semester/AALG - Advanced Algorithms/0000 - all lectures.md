Maybe insert agenda in each, or keywords enough?

# 01 - Introduction & Dynamic Programming

#### Exam

Written. No computer. Calculator allowed. All printed notes and books are allowed.

Exam: two parts:

- Multiple choices
- 1-3 Open problems, each with sub problems. 
  - Given a real world problem, write pseudo code, give complexity
    analysis, etc.

#### Slides

Slide 12: Mini quiz: b and d. b: lower bound, it runs faster then this. d: upper bound, no faster than this. (b and d = correct)

Slide 21-22

Slide 23: two sub-problems - it calls itself two times. They are disjoint. T(n) = Første er trivial case. Second = recurrences.

Slide 24-25

Slide 26: Both overlapping sub-problems and optimal substrucutre has to be fulfilled for DP to work. Optimal substructure: is YES = use dynamic programming, if no - then dont. 

Slide 27-29

Slide 31-34

Recursion tree of specific case to see if sub problems are overlapping. This is done to identify if DP can be used.

![](.\img\1.png)

Red markings are overlapping sub-problems.

Slide 35: Complexity: Number of sub-problems: n*m, Number of choices per sub-problem: 3. 

$3 * m * n = \theta (m*n)$

Slide 36-37

Slide 38: First column, then first row. 

Slide 39: D = delete, R = replace, R = remove

Slide 40: Each element in table is a sub-problem. And each problem has 3 choices, the one above, the one to the left?.... UNSURE! about the last.

Slide 41-42

# 02 - All pairs Shortest Paths

Slide 3

Slide 5-12

Slide 13

| 0    | 8    | 3    | 1        | INFinity |
| ---- | ---- | ---- | -------- | -------- |
| 8    | 0    | 4    | INFinity | 2        |
| 3    |      |      |          |          |
|      |      |      |          |          |
|      |      |      |          |          |



| NILL | 5    | 2    | 1    | 3    |
| ---- | ---- | ---- | ---- | ---- |
|      |      |      |      |      |
|      |      |      |      |      |
|      |      |      |      |      |
|      |      |      |      |      |

Missing matrix

Maybe replace with slide drawings?

Slide 15 - Most important part!

Slide 16

Slide 17: It does not matter if we add more vertices to a shortest path.. it is still the shortest.

Slide 18-19

Slide 20: Rød firkant i matrix: i = 1, j = 4. $w_{1 \: 4}$ = $ \infin $ ... så row og column i matrix w.

Slide 21-26

Slide 28

Slide 29: $d^{(x)}(y, z)$ : x = allowed intermediate vertex, y = from vertex, z = to vertex. Maybe p = allowed mediated vertices? 

Slide 30: base case: no allowed intermediate vertexes - this gives us the weight.

Slide 31-40

Slide 42-44

# 03 - Flow Networks and Maximum Flow

Slide 4-7

Slide 8: Antiparallel: two edges between the same two nodes, but they go opposite ways.

Slide 9

Slide 11-13

Slide 14: Simple path: no loops allowed. Maybe also no one node two times in the same path?

Slide 15

Slide 16: and edge with only one number, is the capacity -> flow/capacity || capacity.

Slide 18-27

Slide 28-31 ??? LOOK THROUGH

Slide 32-34, 36-42, 44-45

Slide 47: University example: couble be L: course, R = Undervisere, Hver underviser kan undervise i flere fag, men kun én ad gangen. 

Slide 48 -> slides? consider

# 04 - Greedy Algorithms

Slide 4: [1,3) is that the activity starts at 1 and ends before 3.

Slide 5-6

Slide 7: The spots which are X or 0, is always this.

Slide 8-18

Slide 20-26

SLides ???

Slide 29: Not recursive, use RAM model

Slide 30-32

Slides ???

# 08 - Computational Geometry Algorithms: Range Searching

Slide 4-5

|      |           | Runtime (Build) | Runtime (Query)  | SPACE       |
| ---- | --------- | --------------- | ---------------- | ----------- |
| 1D   | BST       | $O(n*lg*n)$     | $\Theta(lg*n+k)$ | $\Theta(n)$ |
| 2D   | KDTree    |                 |                  |             |
| KD   | RangeTree |                 |                  |             |

Slide 7-16

Slide 18-19

Slide 20: k = output

Slide 22-30

Slide 32-34

Slide 36-

todooo

# 09 - External-memory algorithms and data structures

## External memory

Hard disks (magnetic)

![](.\img\100.png)

![](.\img\101.png)

![](.\img\102.png)

![](.\img\103.png)

## B-trees, $B^+$-trees, and R-trees

We want a wide and short tree and NOT a tall slim tree.

![](.\img\104.png)

![](.\img\105.png)

![](.\img\106.png)

![](.\img\107.png)

![](.\img\108.png)

![](.\img\109.png)

![](.\img\110.png)

![](.\img\111.png)

![](.\img\112.png)

![](.\img\113.png)

![](.\img\114.png)

![](.\img\115.png)

![](.\img\116.png)

![](.\img\117.png)

![](.\img\118.png)

![](.\img\119.png)

![](.\img\120.png)

TODO SLIDES