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

