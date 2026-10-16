package kodewala.day20.scanner;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Please Enter the name: ");
		
		String name = sc.nextLine();
		
		sc.nextLine();
		
		System.out.println(" Pls enter delivery address ");
		
		int price = sc.nextInt();

		sc.close();
		
	}
 
}
