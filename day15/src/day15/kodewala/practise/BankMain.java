package day15.kodewala.practise;

class Bank {
    String bankName;

    Bank() {
        this("SBI");
        System.out.println("Bank Default Constructor");
    }

    Bank(String bankName) {
        this.bankName = bankName;
        System.out.println("Bank Parameterized Constructor");
    }
}

class Account extends Bank {
    int accountNumber;

    Account() {
        this(1001);
        System.out.println("Account Default Constructor");
    }

    Account(int accountNumber) {
        super("State Bank of India");
        this.accountNumber = accountNumber;
        System.out.println("Account Parameterized Constructor");
    }
}

class Customer extends Account {
    String customerName;

    Customer() {
        this("Shubham");
        System.out.println("Customer Default Constructor");
    }

    Customer(String customerName) {
        super(1001);
        this.customerName = customerName;
        System.out.println("Customer Parameterized Constructor");
    }
}

class Branch extends Customer {
    String branchName;

    Branch() {
        this("Bangalore");
        System.out.println("Branch Default Constructor");
    }

    Branch(String branchName) {
        super("Rahul");
        this.branchName = branchName;
        System.out.println("Branch Parameterized Constructor");
    }
}

public class BankMain extends Branch {

    BankMain() {
        this(50000);
        System.out.println("BankMain Default Constructor");
    }

    BankMain(int balance) {
        super("MG Road Branch");
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        BankMain obj = new BankMain();

        System.out.println("Bank: " + obj.bankName);
        System.out.println("Account: " + obj.accountNumber);
        System.out.println("Customer: " + obj.customerName);
        System.out.println("Branch: " + obj.branchName);
    }
}
