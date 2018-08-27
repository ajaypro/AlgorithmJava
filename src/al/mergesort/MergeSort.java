package al.mergesort;

public class MergeSort {

	public static void sort(int inputArray[]) {
		sort(inputArray, 0, inputArray.length -1);		
	}

	public static void sort(int a[], int start, int end) {
		if(start < end) {
			int mid = (start+end)/2;
			sort(a, start, end);
			sort(a, mid, end);
			merge(a, start, mid, end);
		}	
		return;
	}

	public static void merge(int myArray[], int start, int mid, int end) {

		int tempArray[] = new int [end - start+1];

		// index counter of left position of array
		int leftSlot = start;

		// index counter of right position of array
		int rightSlot = mid+1;

		int k = 0;

		while(leftSlot <= mid && rightSlot <= end) {
			if(myArray[leftSlot] < myArray[rightSlot]) {
				tempArray[k] = myArray[leftSlot];
				leftSlot = leftSlot +1;
			} else{
				tempArray[k] = myArray[rightSlot];
				rightSlot = rightSlot +1;
			}
			k = k+1;	
		}

		if(leftSlot <= mid) {
			while(leftSlot <= mid) {
				tempArray[k] = myArray[leftSlot];
				k = k+1;
			}
		} else if(rightSlot <= end){
			while(rightSlot <= end) {
				tempArray[k] = myArray[rightSlot];
				k= k+1;
			}
		}
		
		//copy over the tempArray to inputArray
		
		for(int i = 0; i< tempArray.length; i++) {
			myArray[start+i] = tempArray[i];
		}
	}
}
