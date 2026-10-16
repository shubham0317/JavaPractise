class Bank {

    static String bankName = "SBI";
    int balance;
    int accNumber;
    String accountHolder;

    public void withdraw(int amount) {

        if (amount < 1) {
            System.out.println("Enter amount at least 1");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient Balance");
            return;
        } else {
            balance -= amount;
            System.out.println("You have withdrawn: " + amount);
            System.out.println("Remaining balance is: " + balance);
        }

        if (balance < 1000) {
            System.out.println("Warning: Low balance");
        }
    }  
	


    public void deposit(int amount) {

        if (amount < 1) {
            System.out.println("Enter amount at least 1");
            return;
        }

        balance += amount;

        System.out.println("Deposited: " + amount);
        System.out.println("Now your balance is: " + balance);
    }


    public static void main(String[] args) {

        Bank b1 = new Bank();

        b1.balance = 70000;
        b1.accNumber = 54678;
        b1.accountHolder = "Shubham";

        System.out.println("Bank: " + Bank.bankName);
        System.out.println("Account Holder: " + b1.accountHolder);
        System.out.println("Account Number: " + b1.accNumber);
        System.out.println("Initial Balance: " + b1.balance);

        b1.withdraw(5000);

        b1.deposit(10000);
    }
}