#### Exercise 1 (from re-exam 2010)

![](.\img\43.png)

1.1. DoSomething(10)= 

```pseudocode
line 4: sk = 1,2,3,4,5,6,7,8,9,10
line 5: st = 10,9,8,7,6,5,4,3,2,1
line 6: i = 10
line 7: runs unstil sk.top is greater than 1.
line 8: 1->10 do sk.push(st.pop)) :so it moves st untop of sk
line 8: sk = 1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10
line 8: st = []
line 9: i = 9
line 10: 1->9 do st.push(sk.pop())
line 10: sk = 1,2,3,4,5,6,7,8,9,10,1
line 10: st = 10,9,8,7,6,5,4,3,2
line 7: sk.top() is now 1 and while loop has ended
line 11: return st.top() = 2
```

1.2 The running time of DoSomething is: n because the loops only run one time.

#### Exercise 2 (from exam and re-exam 2010)

2.1 Which of the four arrays is NOT a max-heap?

I draw them to see it:

![](.\img\44.png)

2.2 Consider the QuickSort(A,p,r) algorithm sown on page 171, CLRS. Let p = 1 and r = 9. Assume that the array A[p..r] is $5,1,3,6,8,7,9,12,11$

 After the call to q = Partition(A,p,r), i.e., line2 and just before the two recursive calls of Quicksort(A,p,q-1) and Quicksort(A,q+1,r), i.e., lines 3 and 4. Which of the following four values is a possible value of q returned by Partition(A,p,r)?

![](.\img\45.png)

```pseudocode
line 00: p = 1, r = 9, A= 5,1,3,6,8,7,9,12,11
line 02: call Partition(A,p,r)
line 01: x = 11
line 02: i = 0
line 03: j = 1->8: j = 1
line 04: if(A[j] <= x) : 5 < 11
line 05: i = 1
line 06: switch A[1] med A[1]
line 03: j=2
line 04: if(1 < 11)
line 05: i=2
line 06: switch A[2] with A[2]
runs until j = 8: i = 7
line 04: if(12 <= 11) FALSE 
line 07: switch A[8] with [9] : A: 5,1,3,6,8,7,9,12,11
line 08: return i + 1: 7 + 1 = 8
Soooooo q = 8
```

My answer is 8.

#### Exercise 3

3.1 (from exam 2010)

Consider a double hashing method given by this function:

$h(k,i)=(k+ih'(k)) \: mod \: 11$ where $h'(k) = 1 + (k \: mod \: 10)$.

Here k is the key to be inserted and i is the probe number (i = 0,1,......,10). Insert keys 21,32,43,8,14 (in this order) into the hash table A[0..10]  below:

Probe means that if you crash (a spot is taken), then i increases by one.

$h(k,i)=(k+i*(1 + (k \: mod \: 10)) \: mod \: 11$

$h(21,0)= (21 + 0 * (21 \: mod \: 10)) \: mod \: 11 = 21 \: mod \: 11 = 10$ **SET VALUE!**

$h(32,0)= (32 + 0 * (32 \: mod \: 10)) \: mod \: 11 = 32 \: mod \: 11=10$ **CRASH!**

$h(32,1)= (32 + 1 * (32 \: mod \: 10)) \: mod \: 11 = 32+1*2 \: mod \: 11=34 \: mod \: 11=1$ **SET VALUE**

$h(43,0)= (43 + 0 * (43 \: mod \: 10)) \: mod \: 11 = 43 \: mod \: 11 = 10$ **CRASH!**

$h(43,1)= (43 + 1 * (43 \: mod \: 10)) \: mod \: 11 = 43+1*3 \: mod \: 11 =46 \: mod \: 11 = 2$ **SET VALUE**

$h(8,0)= (8 + 0 * (8 \: mod \: 10)) \: mod \: 11 = 8 \:  mod \: 11 = 8$ **SET VALUE!**

$h(14,0)= (14 + 0 * (14 \: mod \: 10)) \: mod \: 11 = 14 \: mod \: 11=3$ **SET VALUE**

![](.\img\46.png)

3.2 (from re-exam 2012)

Which one of the following four sequences is a sequence printed by a post-order tree walk of this binary tree?

*Postorder tree walk visits each node after visiting its children.*

So the order is: D,E,B,G,H,F,C,A. So answer d is the correct one.

3. (from re-exam 2003)

Consider a set of integers: 3, 9, 1, 7, 5, 6, 2. In the left box, draw a binary search tree of the smallest possible height storing all these integers. In the right box, draw a binary search tree of the largest possible height storing all these integers.

Binary-search-tree properties: 

- let x be a node in a binary search tree.
- If y is a node in the left subtree of x, then y.key <= x.key.
- If y is a node in the right subtree of x, then y.key>=x.key.

And that means that the left child is smaller than parent and right child is larger.

The answer is switches.

![](.\img\47.jpg)



