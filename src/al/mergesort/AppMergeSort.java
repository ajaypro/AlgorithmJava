package al.mergesort;

public class AppMergeSort {
	
	
	public static void main(String []args) {
		
		int [] mergeArray = {5,3,5,7,12,7,23, 14, 17};
	  MergeSort sorter = new MergeSort();
	  sorter.sort(mergeArray);
	  
	  for(int t=0; t< mergeArray.length; t++) {
		  System.out.println(mergeArray[t]);
	  }
	}

}
