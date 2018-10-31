# Data structures

#### Abstract Data Types (ADT's)

- An ADT is a specification of
  - a set of data;
  - a set of operations that ca be performed on the data.
    - This operation set is the focus
- ADT is abstract in the sense that it is independent of various concrete implementations.
  - Encapsulates data structures and relevant algorithms.
  - Provides access interface.

#### Data abstractions

- ADT: An entity + opeations that can be performed on it
  - E.g., integer.
  - addition, subtraction, negation, multiplication, division, comparison.
- Advantages
  - Users only need to know what the allowed operations are, not how they are implemented.
  - You can choose the best possible implementation for an ADT when you need to use it.
    - Allows to separate the concerns of correctness and the performance analysis of your algorithms.
- We will learn ADTs of fundamental data structures
  - Arrays, stracks, queues, etc.
  - Focus on operations.

#### Array

Typically, occupies sequential storage locations. Length is determined when created. Each element has a fixed unique index. Any element of the array can be visited or updated by using its index. $O(1)$ = constant time for accessing array. Can be used for implementing other structures like stacks and queues.

#### Stack

- Intuitive view: a pile of things on top of each other.

- An object added to the stack goes on the "top" of the stack (**push**)
- An object removed from the stack is taken from the "top" (**pop**)
- LIFO: last in first out. 

#### Stack ADT

- A stack is a container of object. They are removed and added according to the LIFO.
  - Sequence of elements $<a_1, a_2, ..,a_i>$, but only $a_i$ is accessible as the “top” of the stack.
- Operations:
  - Push(S, x) inserts an element x into the stack S.
  - Pop(S) deletes the element on top of the stack S. (Does not take an element argument.)
  - Stack-Empty(S) return whether the stack is empty.

#### Stack: an array implementation

- Using an array of n elements: S[1..n]
- The array has an attribute *S.top* that indexes the most recently inserted element.
- The stack consists of elements S[1..S.top].
  - S[1] is the element at the bottom
  - S[S.top] is the element at the top.
- Consider a stack with at most 7 elements and after inserting 15, 6, 2 and 9, we have the following:

![](.\img\35.png)

![](.\img\36.png)

With the stack array: $S[] = { 15,6,2,9,17}$

![](.\img\37.png)

#### Stack: Application of stack

- Parenthesis balance checking: $(2+3)-6)*2$
- Push when you see "(" and pop when you see ")"
- This example will stop when you hit the second ")" because you wanna pop and there is nothing to pop. The stack should also be empty when done for the check to return true.

#### Queue + ADT

- Intuitive view: a real-life queue.
- FIFO: first in first out.
- A queue is a container of elements. Elements are inserted an removed according to the FIFO principle.
  - Sequence of elements $<a_1, a_2, ..,a_i>$, but only $a_i$ is accessible as the *head* of the queue.
- Operations
  - Enqueue(Q, x) inserts an element x into the queue Q.
  - Dequeue(Q) deletes the head element in the queue Q. (Does not take an element argument)

#### Queue: An array implementation

- Implement a queue of at most n-1 elements using an array Q[1..n]
- The array has attribute **Q.head** that indexes the head element, i.e., the one has been in the queue the longest. 
- The array has attribute **Q.tail** that indexes the next location at which a newly arriving element will be inserted in the queue.
-  The elements in the queue reside in locations Q.head, Q.head+1, …, Q.tail-1, if we assume location 1 immediately follows location n in a circular order.
- Initially, we have **Q.head = Q.tail**.

![](.\img\38.png)

![](.\img\39.png)

#### Queue: Example

![](.\img\40.png)

#### Linked List

- Intuitive view: a sequence of elements.
- Each element in the lined list is with:
  - On key
  - One or more pointers
- There are different types of linked lists depending on how the elements in the list are linked.

#### Linked list: Singly linked list

- Element
  - A key
  - One pointer: "**next**", which points to the element's successor.
  - The last element's pointer points to a "NIL".
- On additional pointer for the whole list
  - Pointer "**head**": pointing to the first element of the list.

![](.\img\41.png)

Note that; "next" pointers are for elements. E.g., x.next. "head" pointer is for the whole list. E.g., L.head.

- An alternative: circular list
  - The last element's next pointer points to the first element. This gives a circular structure.

#### Linked list: Doubly linked list

- Element 
  - A key
  - Two pointers: "**next**", which points to the element's successor.
  - "**prev**", which points to the elements predecessor.
- Also has the "head" pointer for the whole list.

![](.\img\42.png)

- An alternative: circular list
  - The last elements **next** pointer points to the first element.
  - The first elements **prev** pointer points to the last element.
  - This gives again a circular structure.



SLIDES!!!!!!!!!!!!! , 29-33

SLIDE 31: line 2-4 skal være i den rækkefølge og line 1 skal være før line 4.

SLIDE!!!!!!!!!!!! 36, 38 - 54