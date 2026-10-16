import java.util.*;
class SwapTwoNumbers {

   public static void main(String[] args) {
   
    int [] arr = {1 , 2, 3, 4, 5};
	
	doSwap(arr, 2, 4);
	System.out.println(Arrays.toString(arr));
	
   
   }
   
   static void doSwap(int [] arr, int idx1, int idx2) {
   
      int temp = arr[idx1];
	  arr[idx1] = arr[idx2];
	  arr[idx2] = temp;
   
   }


}