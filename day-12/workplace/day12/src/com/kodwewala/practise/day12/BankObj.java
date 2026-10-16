package com.kodwewala.practise.day12;

public class BankObj {
	
	public static void main(String[] args) {
		Bank user1 = new Bank(2000, "shbham" ,1);
		Bank user2 = new Bank(3000, "vikas" ,2);
		Bank user3 = new Bank(4000, "pratik" ,3);
		user1.applyIntrest();
		user2.applyIntrest();
		user3.applyIntrest();
	}

}
