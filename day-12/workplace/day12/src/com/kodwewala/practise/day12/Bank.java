package com.kodwewala.practise.day12;

public class Bank {
   
	static int interest  = 10;
	int balance ;
	String accountHolder;
	int time ;
	
	Bank(int balance , String accountHolder, int time) {
		this.balance = balance;
		this.accountHolder = accountHolder;
		this.time = time;
	}
	
	void applyIntrest() {
		int si = balance * time *  interest / 100;
		System.out.println("Intrest for " + accountHolder + " is : " + si);
	}
	
}
