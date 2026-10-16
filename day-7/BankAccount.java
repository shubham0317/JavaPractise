class BankAccount{

   static String bankName = "UNION BANK";
   String accountHolder;
   long accountNumber;
   
   void deposit(){
        double balance = 55555.00d;
        System.out.println("bankName: " + bankName);
        System.out.println("accountHolder: " + accountHolder);
        System.out.println("accountNumber: " + accountNumber);
        System.out.println("balance: " + balance);
   
   }
   
   public static void main(String[] args) {
   
   BankAccount b1 = new BankAccount();
   b1.accountHolder = "Shubham";
   b1.accountNumber = 1234567890;
   b1.deposit();
   
   }

}