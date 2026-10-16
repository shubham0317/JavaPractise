import java.util.Scanner;
class FibNum {

  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number to get fibonaci series upto there");
  
  int n = sc.nextInt();
  
  int a = 0;
  int b = 1;
  
  for (int i = 0; i < n; i++) {
	System.out.println(a + " ");
	int c = a + b;
	a = b;
	b = c;
  }
  
  }

}