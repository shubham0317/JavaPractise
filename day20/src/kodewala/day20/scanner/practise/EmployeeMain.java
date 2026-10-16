package kodewala.day20.scanner.practise;

public class EmployeeMain {

	
	public static void main(String[] args) {
//		Employee e1 = new Manager("Shubham",6000000,"IT");
//		e1.display();
//		
		Employee e2 = new Manager("Vikas", 50000, "IT");
		e2.calculateSalary();
	    System.out.println(e2.workh);
		e2.displayW();
		
		Manager m = new Manager("Vikas", 50000, "IT");
		System.out.println(m.workh);
		m.displayW();
		
//		Employee e3 = new Developers("Amitesh", 500000, "Backend dev");
		//e3.calculateSalary();
//		System.out.println(e3.workh);
		
		
		
	}
	
	
}
