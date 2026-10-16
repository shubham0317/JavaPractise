import java.util.Scanner;

class StudentDetails{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter your Name");
	String name = sc.nextLine();
	System.out.println("Enter your Age");
	int age = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter your Address");
	String address = sc.nextLine();
	
	System.out.println("Student Name is " + name + ", age is " + age + " and lives in " +address);
   }
}
