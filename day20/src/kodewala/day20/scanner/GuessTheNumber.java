package kodewala.day20.scanner;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	  // Guess the lucky number between 0 and 100
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Random random = new Random();

        int luckyNumber = random.nextInt(101); // 0 to 100

        //System.out.println("Random number: " + number);

      
        int userEntered = 0;

        while (luckyNumber != userEntered) {

            System.out.println("Please enter the number...");
            userEntered = sc.nextInt();

            if (userEntered == luckyNumber) {
                System.out.println("You won!!!!");
            }
            else if (userEntered > luckyNumber) {
                System.err.println("You enterd bigger number please try again");
            } else {
            	 System.err.println("You enterd smaller number please try again");
            }
        }

        sc.close();
    }
	
}
