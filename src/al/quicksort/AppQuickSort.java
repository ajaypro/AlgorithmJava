package al.quicksort;

import java.util.Arrays;

public class AppQuickSort {

	public static void main(String[] args) {
		int[] myArray = {23, 45, 21, 67, 83, 94, 54};

		quickSort(myArray, 0, myArray.length -1);      
		System.out.println(Arrays.toString(myArray));

	}

	public static void quickSort(int[] a, int start, int end) {
		if(start < end) {
			int pivot = partition(a, start, end);
			quickSort(a, start, pivot -1); // sorts the left half of range.
			quickSort(a, pivot+1, end); // sorts right half of range. 
		}
	}
	
	/*public static int partition(int[] sortArray, int a, int b) {
		
		int p = sortArray[b];
		int i = a - 1;
		for(int j = a; j< b-1; j++) {
			
			if(sortArray[j] < p) {
				i++;
				int ival = sortArray[i];
				int jval = sortArray[j];
				sortArray[j] = ival;
				sortArray[i] = jval;
			}
		}
		int ival = sortArray[i+1];
		sortArray[b] = ival;
		sortArray[i+1] = p;
		
		return i+1;
	}
*/

   public static int partition(int[] a, int start, int end) {

		int pivot = a[end];
		int i = start -1;

		for(int j = start; j <end-1; j++) {

			int temp;

			if(a[j] <= pivot) {
				i++;
				//we are swapping the i & j element's position 
				temp = a[j];
				a[j] = a[i];
				a[i] = temp;		
			}
		}
		int ival= a[i+1];
		a[end] = ival;
		a[i+1] = pivot;
		
		return i+1;
	}

}



