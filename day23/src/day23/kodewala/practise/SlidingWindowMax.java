package day23.kodewala.practise;

import java.util.Arrays;

public class SlidingWindowMax {

	public static void main(String[] args) {
		int [] arr = {1,3,-1,-3,5,3,6,7};
		
		int [] res = doOperation(arr,3);
		System.out.println(Arrays.toString(res));
	}
	
	public static int[]  doOperation(int[] nums, int k) {
		
		int n = nums.length;
		int [] result = new int[n - k + 1];
		for(int i = 0; i < n - k + 1; i++) {
			int max = nums[i];
			for (int j = i; j < i + k; j++) {
				max = Math.max(max, nums[j]);
			}
			result[i] = max;
		}
		
		return result;
	}
	
}
