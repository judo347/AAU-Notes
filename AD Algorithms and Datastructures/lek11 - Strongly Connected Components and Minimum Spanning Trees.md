# Lek11: Strongly Connected Components and Minimum Spanning Trees

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
  - G=(V, E), with a weight function **w**: E → R(real numbers).
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

A spanning tree T of a connected, undirected graph $G=(V,E)$ is a sub-graph of G, satisfying:

- T contains all vertices of G;
- T connects any two vertices of G;
- $T \subseteq E$, and T is acyclic.

T is a tree, since T is acyclic and connects any two vertices of the undirected graph G.

![](.\img\148.png)

SLIDE 17!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

### Prim's algorithm

### Kruskal's algorithm

### Generic algorithm

