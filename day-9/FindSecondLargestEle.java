import java.util.*;
class FindSecondLargestEle{

   public static void main(String[] args) {
   
   int [] arr = {5, 7, 6, 5, 2};
   
   int result = doOperation(arr);
   System.out.println(" Second Max Element is: " + result);
   
   }
   
   static int doOperation(int [] arr)
   {
     int maxEle = Integer.MIN_VALUE;
	 int secondMax = Integer.MIN_VALUE;;
	 for(int i = 0; i < arr.length; i++) {
	   if(arr[i] > maxEle) {
	   secondMax = maxEle;
	   maxEle = arr[i];
	   } else  if(arr[i] > secondMax && arr[i] < maxEle){
		   secondMax = arr[i];
	   }
	 }
	 return secondMax;
   }

}