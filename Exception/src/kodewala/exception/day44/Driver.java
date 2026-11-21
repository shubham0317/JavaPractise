package kodewala.exception.day44;

public class Driver {

	
	public static void main(String[] args) {
		
		System.out.println("Driver.main().....START");
		
		String name = args[0];
		int marks = Integer.parseInt(args[1]);
		
		System.out.println(name);
		System.out.println(marks);
		
		
		
		doSomeThing();
		System.out.println("Driver.main()..END");
	}
	
	public static void doSomeThing() {
		
		System.out.println("Driver.doSomeThing.....START");
		
		try {
			
		
		int amount = 100;
		int part  = 0;
		int total = amount/part;
		String name = null;
		
		System.out.println(name.length());
		System.out.println("After calculation");
		System.out.println(total);
		} catch (ArithmeticException e) {
			System.out.println("Number cann't divisible by zero");
			e.printStackTrace();
			
		} catch (NullPointerException e) {
			System.out.println(" Name cannot be null");
			e.printStackTrace();
		}
		
		System.out.println("Driver.doSomeThing.....END");
	}
}
