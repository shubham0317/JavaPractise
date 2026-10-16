import java.util.*;
class TwoSumproblem {
 
  public static void main(String[] args) {
  
   int [] arr = {2,7,11,15};
   int target = 9;
   
   int [] result = doTwoSum(arr, target);
   System.out.println(Arrays.toString(result));
  
  }
  
  static int [] doTwoSum(int [] arr, int target) {
    
	int left = 0;
	int right  = arr.length - 1;
	
	while(left < right) {
	int sum = arr[left] + arr[right];
	 if(sum == target) {
	   return new int [] {left , right};
	 } else if(sum > target) {
	  right--;
	 } else {
	   left++;
	 }
	}
	return new int [] {-1 , -1};
  }

}