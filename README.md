# AlgorithmJava
Basics Alogs every developer should know
Quicksort 

Performance run time is O(log n) for average time and worst case could be O(log n^2)
QuickSort takes less space to sort elements when compared to merge sort
QuickSort chooses a pivot element from the array and elements to the left of pivot element are less than it and elements to right side 
 pivot elements. 
 
 Pseudo code
if(p<r)
 q = partition(p,r) - this partition is to find pivot element
 
 It invokes itself(Quicksort) twice until it completes sorting in its sub-array.
 
 Quicksort(A,p,q-1)
 Quicksort(A,q-1,r) 
 
 * two variables which shows the index of the array are i & j
 * any element can be picked as pivot element
 * Partitioning of the array gives the result of correct index position of the pivot element that we have chosen
 * This index position is used for invoking the quicksort() twice. 
 * The default implementation is not stable. However any sorting algorithm can be made stable by considering indexes as comparison parameter
 * QuickSort is prefered over MergeSort in arrays as it takes no extra space.
 
 

