# Heapsort and ADTs

#### Heap

- Binary heap data structure A
  - Array
  - Can be viewed as a nerly complete binary tree
    - All levels, except the lowest one, are completely filled
  - Heap property
    - The root is greater than or equal to all its children, and the left and right subtrees are again binary heaps (max-heap)
    - The root is less than or equal to all its children, and the left and right subtrees are again binary heaps (min-heap)
- Two attributes
  - A.length: the number of elements in the array
  - A.heapsize: the number of elements in the heap that is stored in the array
    - 1 <= A.heapsize <= A.length
    - A[1..A.length] may contain many elements, but only the elements in A[1..A.heap-size] are valid elements of the heap

![](.\img\28.png)

#### Parent, left child, and right child

![](.\img\29.png)

Remember! Left = left child!

#### Maintaining the heap property

- Heapify
  - Input: Array A and an index i into the array.
  - Assume:
    - Binary trees rooted at Left(i) and Right(i) are heaps
  - But, A[i] might be smaller than its two children, thus violating the heap property. 
  - The method Heapify makes A a heap by moving A[i] down the heap until the heap property is satisfied again.

![](.\img\30.png)

#### Example: Heapify(A,2)

![](.\img\31.png)

#### Analysis of Heapify

- We need to ask ourselves the following questions.
  - Is Heapify a recursive algorithm or not?
  - If yes, write down the recurrence and solve the recurrence.
  - If not, use the RAM model.

SLIDE 17 + 18!!!!!!!!!!!

Worst case is where one side has 2/3 of elements and the other has 1/3 of it

SLIDE 19!!!!!!!!!!

#### Some Notes

- Sometimes, it is more important to write down a correct recurrence than solving the recurrence
- How many sub-problems and what is the size of each sub-problem
  - Quick sort: best case vs. worst case
  - Heapify: the largest size sub-problem
- What is the cost of dividing and combining
  - Quick sort: partition, dividing phase.
  - Merge sort: merge, combining phase.

SLIDE 20!!!!!!!!!!

The leafs in the tree is already/always heaps. So call heap on the first element with children.

SLIDE 21 + 22 + 23 + 33!!!!!!!!!!!!!!!!!!!!!!

