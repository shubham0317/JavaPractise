import java.util.*;
class SelectionSort{

   public static void main(String[] args) {
   
      int [] arr = {5, 6, 9, 1, 2};
	  
	  doSelectionSort(arr);
	  System.out.println(Arrays.toString(arr));
   
   }
   
   static void doSelectionSort( int arr[]){
   for(int i = 0; i < arr.length - 1; i++) {
	  int minIndex = i;
	   for(int j = i + 1; j < arr.length; j++) {
	    if(arr[j] < arr[minIndex]){
		minIndex = j;	
		}
	   }
	   doSwap(arr,i, minIndex);
	 }
   }
   
    static void doSwap(int [] arr, int idx1, int idx2) {
   
      int temp = arr[idx1];
	  arr[idx1] = arr[idx2];
	  arr[idx2] = temp;
   
   }

}