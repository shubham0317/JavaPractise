import java.util.Scanner;

class CheckNum {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the number to check Odd / Even");
   int num = sc.nextInt();
   if (num % 2 == 0){
   System.out.println(num  + " is Even Num");
   } else {
    System.out.println(num + " is Odd Num");
   }
  }
}