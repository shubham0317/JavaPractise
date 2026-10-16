import java.util.Scanner;

class CheckAge {
   public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter Your Age");
   int age = sc.nextInt();
   if (age < 0){
   System.out.println("Enter a valid age");
   return;
   } 
   if (age < 18) {
   System.out.println("You Are Not Eligible To Vote");
   } else {
   System.out.println("You Are Eligible To Vote");
   }
   }
}