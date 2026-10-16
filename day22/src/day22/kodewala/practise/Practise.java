package day22.kodewala.practise;

public class Practise {

	public static void main(String[] args) {
		int[] arr = {10,5,2,6};
		System.out.println(numSubarrayProductLessThanK(arr,100));
	}
	
	public static int numSubarrayProductLessThanK(int[] nums, int k) {
	    
		if ( k <= 1) {
			return 0;
		}
		
		int count = 0;
		int n = nums.length;
		
		for(int i = 0; i < n; i++) {
			int product = 1;
			for(int j = i ; j >= 0; j--) {
				product *= nums[j];
				
				if(product < k) {
					count++;
				} else {
					break;
				}
			}
		}
		return count;
		
	 }
	
	public static int optimized(int [] nums, int k) {
		
		if(k <= 1) return 0;
		
		int count = 0;
		int left = 0;
		int product = 1;
		
		for(int right = 0;  right < nums.length; right++) {
			
			product *= nums[right];
			
			if(product >= k) {
				product /= nums[left];
				left++;
			}
			count += right - left + 1;
		}
		return count;
	}
	
}
