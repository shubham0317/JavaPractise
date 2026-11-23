package kodewala.exception.bankingproject;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

public class BankApp {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {

		BankService sbi = new BankService();

		Address cusAd1 = new Address("Bengaluru", "Karnatka", "560029");
		Customer cus1 = new Customer("CS101", "Shubham", cusAd1);

		Address cusAd2 = new Address("Bengaluru", "Karnatka", "560029");
		Customer cus2 = new Customer("CS102", "Shubham", cusAd1);

		try {
			sbi.createAccount("SBI1011", new BigDecimal("5500.00"), cus1);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		try {
			sbi.createAccount("SBI1012", new BigDecimal("5500.00"), cus2);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		try {
			sbi.depositAmount("SBI1012", new BigDecimal("6"));
		}

		catch (AccountNotFoundException e) {
			System.out.println(e.getMessage());
		}

		try {
			sbi.transferMoney("SBI1011", "SBI1012", new BigDecimal("6"));
		}

		catch (AccountNotFoundException e) {
			System.out.println(e.getMessage());
		}

		sbi.saveData();
		ArrayList<BankAccount> loadedData = (ArrayList<BankAccount>) sbi.loadData();
		sbi.displayAllAccounts(loadedData);

		System.out.println("Transaction completed....");

	}

}
