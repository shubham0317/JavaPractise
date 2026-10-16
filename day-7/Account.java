class Account {

   int amount = 2000;  // Instance Variable --> Belongs to Object
   static int intRate = 5;  //Static Variable --> Belongs to class

   public static void main(String[] args) {
   
   
   //Createing an object of account Class
   Account acc = new Account();
   
   System.out.println(" Balance is: " + acc.amount);
   System.out.println(" Intreset Rate is: " + Account.intRate);
   
   }

}