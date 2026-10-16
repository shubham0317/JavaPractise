package day13.kodewala.practice;

import java.util.Scanner;

public class Fibonnaci {

      public static void main(String[] args) {
    	  Scanner sc = new Scanner(System.in);
    	  
    	  System.out.print("Enter number of terms: ");
          int n = sc.nextInt();
          
          int a = 0;
          int b = 1;
          
          for(int i = 1; i <= n; i++) {
        	  
        	  System.out.println(a + " ");
        	  
        	  int c = a + b;
        	  a = b;
        	  b = c;
        	  
          }
    	  
      }
	
}
