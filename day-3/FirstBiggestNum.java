import java.util.Scanner;
import java.lang.Integer;
public class FirstBiggestNum {
     public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter the size of array");
	   int size = sc.nextInt();
	   
	   
	   int [] arr = new int [size];
	   
	   
	   for (int i = 0; i < arr.length; i++) {
	   	   System.out.println("Enter the " + (i + 1) + " Element");
	       arr[i] = sc.nextInt();
	   }
	   
	   int maxNum = Integer.MIN_VALUE;
	   
	   for (int i = 0; i < arr.length; i++) {
	      if(arr[i] > maxNum) {
		   maxNum = arr[i];
		  }
	   }
	   System.out.println("Max Number is " + maxNum);
	 }
}