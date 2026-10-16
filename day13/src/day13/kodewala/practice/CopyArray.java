package day13.kodewala.practice;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 4, 5};
		int [] copyArr = new int[arr.length];
		
		for(int i = 0; i < arr.length ; i++) {
			copyArr[i] = arr[i];
		}
		
		System.out.println(Arrays.toString(copyArr));
	}
	
}
