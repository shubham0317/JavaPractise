package day13.kodewala.practice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the number to check wheter its armstrong or not");
		int num = sc.nextInt();

		int original = num;
		int sum = 0;

		while (num > 0) {
			int digit = num % 10;
			sum += (digit * digit * digit);
			num = num / 10;
		}

		if (original == sum) {
			System.out.println("Its a ArmStrong Number");
		} else {
			System.out.println("Its not a ArmStrong Number");
		}

	}

}
