package day28.kodewala.fundtransfer;

import java.util.Scanner;

public class FundTransfer {
   
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println(" Enter the details to do fund transfer");
		Bank b1 =  new Bank(sc.next(), sc.next(), sc.nextInt());
		
		b1.doCredit(1000);
		System.out.println(" Your updated  balance is :" + b1.checkBalance());
		
		b1.doDebit(500);
		System.out.println(" Your updated  balance is :" + b1.checkBalance());
		
		b1.checkBalance();
		System.out.println(" Your updated  balance is :" + b1.checkBalance());
	}
	
}
