# 0Lek11: Strongly Connected Components and Minimum Spanning Trees

## Strongly Connected Components

A strongly connected component of a directed graph G=(V, E) is a maximal set of vertices C⊆V, such that for every pair of vertices u and v in C, they are reachable from each other.
![](.\img\142.png)

Strongly connected componenets are: {a,b,e}, {c,d}, {f,g}, {h}.

#### DFS and Transpose of a graph

- DFS often works as a subroutine in another algorithm: Classifying edges (Lecture 10), Topological sort (Lecture 10), Strongly connected components (now).

- **Transpose of a graph**: Given a graph G=(V,E). Its transpose graph is $G^T=(V,E^T) $, where $E^T=\{(u,v):(v,u)∈E\}$. $G^T$ has the same vertex set as G, but has a different edge set from G, where the directions of the edges are reversed.
- G and $G^T$ have exactly the same strongly connected components. Vertices u and v are reachable from  each other in G if and only if they are reachable from each other in $G^T$.

![](.\img\143.png)

#### Algorithm with Running Example

![](.\img\144.png)

![](.\img\145.png)

Strongly connected components are: {a, b, e}, {c, d}, {f, g}, {h}.

## Minimum Spanning Trees

- **Weighted graph**
  - G=(V, E), with a weight function **w**: E → $\R$(real numbers).
  - Weight function **w** assigns a cost value to each edge in E.
  - E.g., In a graph modelling a road network, the weight of an edge represents the length of a road.
  - E.g., w(e)=10 or w(u, v)=10, given e=(u, v).
- **Path**
  - A sequence of vertices $<v_1,v_2,...,v_k>$ such that vertex $v_{i+1}$ is adjacent to vertex $v_i$ for i = 1 ... k – 1.
  - A sequence of edges $<(v_1,v_2),(v_2,v_3),...,(v_{k-1},v_k)>$.
  - A sequence of edges $<e_1,e_2,...,e_{k-1}>$, where, $e_1=(v_1,v_2)$, $e_2=(v_2,v_3), ...,$ and $e_{k-1}=(v_{k-1},v_k)$
- **Sub-graph**: a subset of vertices and edges

![](.\img\146.png)

- **Connected graph**: Any two vertices in the graph are connected by some path.

![](.\img\147.png)

- **Tree**: connected undirected graph without cycles.

#### Spanning tree

A spanning tree T of a **connected**, **undirected** graph $G=(V,E)$ is a sub-graph of G, satisfying:

- T contains all vertices of G;
- T connects any two vertices of G;
- $T \subseteq E$, and T is acyclic.

T is a tree, since T is acyclic and connects any two vertices of the undirected graph G.

![](.\img\148.png)

#### Spanning tree facts

- If a graph contains |V| vertices, then the spanning tree will contains $|V|-1$ vertices. Each vertex has an edge to it's parent but not the root.

#### Minimum Spanning Tree (MST)

A spanning tree T of a **connected**, **undirected** graph $G=(V,E)$ is a sub-graph of G, satisfying:

- T contains all vertices of G;
- T connects any two vertices of G;
- $T \subseteq E$, and T is acyclic.

There are more than one spanning tree.

For $G=(V,E)$ as a **connected**, **undirected**, **weighted** graph 

- weight function $w:E \rightarrow\R$.
- E.g., $w(e)=10$ or $w(u,v)=10$, given $e=(u,v)$.

MST of a **connected**, **undirected**, **weighted** graph G is a spanning tree T:

- Statisfy all conditions of a spanning tree.
- Have the minimum value of $w(T)=\Sigma_{(u,v)\in T}w(u,v)$ among all possible spanning tree.

Finding MST is an optimization problem.

#### Using MST

A real world problem

- In electronic circuit designs, we need to connect *n* pins together using wires.
- We want to identify a solution that uses the least cost to connect the *n* pins, such that each two pins are reachable from each other.

Can we model it as a graph problem?

- V is a set of *n* pins.
- E is the set of possible wire connections, where each connection links two pins.
- For each edge (u, v), we have a weight w(u, v) specifying the cost to connect pins u and v.

Then the MST of the graph is an optimal solution.

- Identify a solution that uses the least cost ($w(T)=\Sigma_{(u,v)\in T}w(u,v)$) to connect the all n pins using n-1 wires (spanning tree), such that each two pins are reachable from each other. 

### Prim's algorithm

#### Growing MST

Input: Connected, undirected, weighted graph G = (V, E), A weighted function w: E -> $\R$.

Output: An MST A, i.e., a set of edges

Intuition - greedy search:

- Initialize A = $\emptyset$, and A is a subset of some MST, i.e., a tree.
- Add one edge (u, v) to A at a time, such that A $\cup$ {(u, v)} is a subset of some MST.
- Key part:  how to determine an edge (u, v) to add.
  - Edge $(u,v) \in E $ but $(u,v) \notin A$
  - What else? 

![](.\img\149.png)

#### Prim's Algorithm

A special case of the generic MST method.

Input: Connected, undirected, weighted graph G = (V, E), A weight function w: E -> $\R$, A random vertex *r* to start with.

![](.\img\150.png)

Intuition:

- A vertex based algorithm.
- The algorithm maintains a **tree**.
- Add one vertex to a tree at a time, until all are added -- MSP.
- Safe edge: the least weight edge that connects a vertex v not in the tree to a vertex in tree, i.e., greedy feature, -- add v.

Output: MST, where each vertex v has two attributes:

- Parent attribute, **v.parent**: v’s parent in the MST.
- Key attribute, **v.key**: the least weight of any edge connecting v to a vertex in the MST.

v.key, if vertex v is not in the tree (during the search)

- The least weight of any edge connecting v to a vertex in tree

![](.\img\151.png)

Min-priority queue

- Implements the intuition of greedy search. Contains all vertices that are not in the tree. Arrange its vertices by an ascending order of the attribute v.key. Every time, extract vertex v that has the minimum key value. f is the vertex to add, satisfying the intuition of safe edge (c, f).

![](.\img\152.png)

![](.\img\153.png)

![](.\img\154.png)

![](.\img\155.png)

![](.\img\156.png)

![](.\img\157.png)

#### Complexity Analysis

![](.\img\158.png)

### Kruskal's algorithm

#### Disjoint-Set ADT

Maintains a partition of vertices. A collection S of disjoint vertex sets, e.g., $S=\{X,Y \} , X$ and $Y$ are vertex sets, and $X \cap Y = \emptyset$.

Operations of collections S:

![](.\img\159.png)

#### Example of Disjoint-Set

![](.\img\160.png)

#### Kruskal's Algorithm

A special case of the generic MST method.

Input: Connected, undirected, weighted graph G = (V, E), A weight function w: E -> $\R$.

Output: MST.

Intuition: An edge based algorithm. The algorithm maintains a **forest**, where each vertex is treated as a distinct tree in the beginning. Add one edge to from G to MST at a time. Safe edge: the least weight edge among all edges in G that connects two distinct trees in the **forest**, i.e., greedy feature.

![](.\img\161.png)

The algorithm keeps adding a safe edge (u, v) to the MST, if (u, v) satisfies: C1: has the least weight among all edges in G, C2: connects two different trees in the forest – (u, v) is not in MST.

If u and v belong to the same tree of the forest, u and v are a part of MST – adding (u, v) creates a cycle for MST.

![](.\img\162.png)

![](.\img\163.png)

![](.\img\164.png)

![](.\img\165.png)

![](.\img\166.png)

![](.\img\167.png)

### Generic algorithm

A cut of an undirected graph G=(V, E) is a partition of vertices, denoted as **(S, V-S)**, where $S \subset V$.

An edge (u, v)∈ E **crosses** the cut if u is in S and v is in VS, or v is in S and u is in V-S.

**Light edge** is an edge crosses the cut and has the minimum weight of any edge crossing the cut.

![](./img/168.png)

Given a cut **(S, V-S)** as a partition of G=(V, E).

Considering a set A of edges, we say the cut **respects** A if no edge in A crosses the cut. 

![](.\img\169.png)

![](.\img\170.png)

3.1: If an edge belongs A, i.e., a part of MST, it does not cross S to V-S – this makes sure edges in A are not safe edges.

3.2: the light edge (u, v) is safe for A, satisfying:

- (u, v) crosses S to V-S: (u, v) does not belong to A.
- (u, v) has the minimum weight of any edge crossing the cut: greedy.

Essence of the generic algorithm: Find a **possible** cut. Take a light edge.

![](.\img\171.png)

#### Prim’s algorithm vs. Generic alg.

Prim’s alg. maintains a tree A (also the output MST).

The safe edge added to A is always a least-weight edge connecting the tree to a vertex not in tree.

![](.\img\172.png)

Currently, A={(a, b), (b, c), (c, i)}, where A forms a tree. Since A doesn’t cover all vertices, continue to explore.

Current cut (S, V-S) 

- S={a, b, c, i}, vertices that are not in the priority queue. They are all in A.
- V-S={f, g, h, d, e}, vertices that are in the priority queue.
- Cut (S, V-S) respects A.

Light edge (c, f) is added into A.

#### Kruskal’s alg vs. Generic Alg

Kruskal’s alg. maintains a forest S and outputs a MST.

![](.\img\173.png)

The safe edge added to MST is always a least-weight edge connecting two distinct trees in S.

![](.\img\174.png)

We can construct a possible cut (S, V-S) 

- S={a, c, i, f, h, g}.
- V-S={b, d, e}.
- Cut (S, V-S) respects MST.

Given the cut, (a, b) is a light edge and can be added into MST.

- (a, b) has the minimum weight: 4.
- Check S.findSet(a) and S.findSet(b): {a}≠{b}, add (a, b) to MST.
- MST={(h,g), (i,c), (g,f), (a,b)}
- S={{a,b}, {c, i}, {d}, {e}, {f, h, g}}

Mini quiz: what about (c, f), whose weight is also 4?

Given the cut, (c, f) is not a light edge and cannot be added into MST.

- (c, f) does not cross the cut.

Consider a different cut (S, V-S)

- S={h, g, f} and V-S={a, b, c, d, e, i}
- Cut (S, V-S) respects MST.
- (c, f) is a light edge. 

