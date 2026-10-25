package day33.kodewala.polymorphism1;


class Employee {
	public void markIn() {
		System.out.println("Employee.markIn() ........ Employee Marking In");
	}
}

class HRManager extends Employee {
	@Override
	public void markIn() {
		System.out.println("HRManager.markIn() ........ HRManager Marking In");
	}
}

public class Driver2 {

	public static void main(String[] args) {
		
		Employee e1  = new HRManager(); 
		e1.markIn(); //Same method will behave differently based on the actual object
		//1. at the time of compilation it will check the method exists in class Employee
		//2. at the time of time execution (while running) it will call the method on actual object
		
	}
}
