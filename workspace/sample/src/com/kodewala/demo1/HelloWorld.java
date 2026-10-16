package com.kodewala.demo1;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello world From Eclipse IDE...");
		int amount = 200;
		System.out.println(amount);
		Scanner sc = new Scanner(System.in);
		String name  = args[0];
		System.out.println(name);
		doSomething();
	}

	public static void doSomething() {
		System.out.println("Helloe world do something");
	}

}
