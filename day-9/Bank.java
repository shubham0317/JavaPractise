import java.util.*;
class Bank {
  
  String accountHolder;
  int balance;

  void withdraw(int amount) {
  
  if(amount < 1) {
   System.out.println("Minimum withdrawal should be 1");
   return;
   } 
   if(balance < amount) {
   System.out.println("Insufficient balance");
   return;
   }
   balance -= amount;
   checkBal();
  }
  
  void deposit(int amount){
   if(amount < 1) {
   System.out.println("Minimum deposit dhould be 1");
   return;
   } 
   balance += amount;
   checkBal();
  }
  
  void checkBal(){
   System.out.println("Your balance is " + balance);
  }
 
  public static void main(String[] args) {
  Scanner sc =  new Scanner(System.in);
   Bank b1 = new Bank();
   b1.accountHolder = "Shubham";
   b1.balance = 100;
   System.out.println(" Write what you want to do with balance");
   String operation = sc.next().toLowerCase();
   
   if(operation.equals("withdraw")){
	System.out.println(" Enter the amount ");
    b1.withdraw(sc.nextInt());
   } else if(operation.equals("deposit")) {
	   System.out.println(" Enter the amount ");
    b1.deposit(sc.nextInt());
   }else if(operation.equals("balance")){
   b1.checkBal();
   } else {
   System.out.println(" For now we have only three facility. Thank you");
   }
  
  }

}