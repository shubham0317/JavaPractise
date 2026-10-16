import java.util.*;
class BubbleSort {

   public static void main(String[] args) {
   int arr[] = {5, 4, 7, 3, 1};
   doBuubleSort(arr);
   System.out.println(Arrays.toString(arr));
   
   }
   
  static  void doBuubleSort(int [] arr) {
   
    for(int i = 0; i < arr.length - 1; i++) {
	
	  for(int j = 0; j < arr.length - 1 - i; j++) {
	    if(arr[j] > arr[j + 1]) {
		 doSwap(arr, j , j + 1);
		}
	  }
	
	}
   
   }
   
   static void doSwap(int [] arr, int idx1, int idx2) {
   
      int temp = arr[idx1];
	  arr[idx1] = arr[idx2];
	  arr[idx2] = temp;
   
   }

}