# Sorting

Bubble sort, selection sort and quick sort.

### Bubble sort

- Popular but inefficient.
- Works by swapping elements:
  - The heaviest bubble goes to the bottom.
  - Or the lightest bubble goes to the top.
- In-place sorting. Uses on temp value.
- Complexity: $\Theta(n^2)$

![](.\img\24.png)







SLIDE 11!!!!!!!!!!!!!

### Intertion sort

- **In-place** sorting.
  - Only a **constant** number of elements of the input array are ever stored outside the array.

- Worst case complexity: $\Theta(n^2)$

### Merge sort

- Uses divide-and-conquer technique.

- Worst case complexity: $\Theta(n*lg(n))$ (Better than interstion sort)
- Not in-place sorting.
  - Merge stop: Uses extra memory for sorting

### Selection Sort

- Search elements *i* trough *n* and select the smallest number
  - Swap it with the element in location *i*.
- Continue until nothing left to search.

![](.\img\25.png)

### Quick Sort

- Uses divide-and-conquer
- **In-place**
- Very practical, average performance Θ (n log n), but worst case still Θ (n^2).
- Divide:
  - Pick an random element, called a pivot, from the array.
  - Reorder the array so that
    - All elements which are less than the pivot come before the pivot (i.e., on the left side of the pivot), and 
    - All elements greater than the pivot come after it (i.e., on the right side of the pivot). 
    - Equal values can go either way.
    - After this partitioning, the pivot is in its final position. 
  - This is called partition operation
- Conquer: 
  - Recursively call quick sort to sort the 2 subarrays
- Combine:
  - Trival since sorting is done in place.

SLIDE 24+25+26!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

SIDE 31 + 32

Slide 33 

- Recurrences: $T(n)=T(n-1)+\Theta(n)$

Slide 36 + 37 + 38



MINI QUIZ TABLE SLIDE 41 lecfture done