package day40.lambdafun.practise;

import java.util.function.Predicate;

public class EmployeeAgeChecker {
 
	public static void main(String[] args) {
		
		Predicate <Integer>  ageChecker = age -> age > 25;
		
		System.out.println("Employee 1: " + ageChecker.test(30));
        System.out.println("Employee 2: " + ageChecker.test(22));
        System.out.println("Employee 3: " + ageChecker.test(25));
        System.out.println("Employee 4: " + ageChecker.test(28));
	}
}
