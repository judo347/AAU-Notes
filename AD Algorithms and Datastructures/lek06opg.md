**Run the heapsort algorithm on the following array of numbers:  (5, 13, 2, 25, 7, 17, 20, 8, 4). Give the state of the array (a) after the *BuildMaxHeap* operation, and (b) after three iterations of the loop.**

![](.\img\32.png)

a:

​	   	  5

​        13	            2

​    25	 7	 17	   20

8	4

​	   	  5

​        13	            20

​    25	 7	 17	   2

8	4

​	   	  5

​        25	            20

​    13	 7	 17	   2

8	4

​	   	  25

​        5	            20

​    13	 7	 17	   2

8	4

​	   	  25

​        13 	            20

​    5	     7	       17	       2

8	4

​	   	  25

​        13 	            20

​    8	     7	       17	       2

5	4

A = 25, 13, 20, 8, 7, 17, 2, 5, 4

The array is now a heap



![](.\img\33.png)

b:

​	   	  25

​        13 	            20

​    8	     7	       17	       2

5	4

Exchange 25 <-> 4

​	   	  4

​        13 	            20

​    8	     7	       17	       2

5	**25**

Heapify(A,1)

​	   	  20

​        13 	            4

​    8	     7	       17	       2

5	**25**

​	   	  20

​        13 	            17

​    8	     7	       4	       2

5	**25**

Exchange 20 <-> 5

​	   	  5

​        13 	            17

​    8	     7	       4	       2

**20**	**25**

Heapify(A,1)

​	   	  17

​        13 	            5

​    8	     7	       4	       2

**20**	**25**

Exchange 17 <-> 2

​	   	  2

​        13 	            5

​    8	     7	       4	   **17**

**20**	**25**

So 3rd iteration: (2,13,5,8,7,4,17,20,25)

