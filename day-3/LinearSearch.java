import java.util.Scanner;
class LinearSearch {

     public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size = sc.nextInt();
		int arr [] = new int [size];
		
		for (int i = 0; i < arr.length; i++) {
		System.out.println("Enter the " + i + " Element");
		  arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the Target Element");
		int target = sc.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
		if(arr[i] == target){
		 System.out.println("Element Found at index " + i);
		 return;
		}
		}
		System.out.println("The Target Element is not present in the Array");
	 }

}