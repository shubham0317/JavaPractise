package com.kodwewala.practise.day12;

public class FindSecondMax {

	  public static void main(String[] args) {
		  int arr[] = {1, 2 , 5, 4, 7};
		  
		  System.out.println(secondMax(arr));
	  }
	
	  
	  public static int secondMax(int [] arr) {
		  int max = Integer.MIN_VALUE;
		  int secondMax = Integer.MIN_VALUE;
		  
		  for(int i = 0; i < arr.length; i++) {
			  if(arr[i] > max) {
				  secondMax = max;
				  max = arr[i];
			  } else if( arr[i] > secondMax) {
				  secondMax = arr[i];
			  }
		  }
		  return secondMax;
	  }
}
