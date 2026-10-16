package kodewala.day20.scanner;

import java.util.Scanner;

public class Driver1 {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int price = 0;
    	System.out.println(" Please Enter the price...");
    	
    	if(sc.hasNextInt()) {
    		price = sc.nextInt();
    	} else {
    		System.out.println(" Please enter the price in right format ");
    	}
    	System.out.println(" price: "+ price);
    }
	
	
}
