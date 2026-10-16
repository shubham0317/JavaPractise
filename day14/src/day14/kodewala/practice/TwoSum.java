package day14.kodewala.practice;

import java.util.Arrays;

public class TwoSum {
	
	public static void main(String[] args) {
		int [] num = {1, 2, 3, 5, 6};
		int [] result = doTwoSum(num,7);
		System.out.println(Arrays.toString(result));
		
	}
	
	public  static int [] doTwoSum(int [] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		
		while(left < right) {
			int sum = arr[left] + arr[right];
			if(sum == target) {
				return new int[] {left +1, right + 1};
			} else if(sum > target) {
				right--;
			} else {
				left++;
			}
		}
		return new int[] {-1, -1};
	}

}
