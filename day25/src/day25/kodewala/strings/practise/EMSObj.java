package day25.kodewala.strings.practise;

public class EMSObj {

	String name;
	int  salary;
	int id;

	public EMSObj(String name, int id ,int salary) {
		super();
		this.name = name;
		this.salary = salary;
		this.id = id;
	}

	void displayDetails() {
		System.out.println("Emplyee name is "  + name + " Salary is:  " + salary + " and id is " + id);
	}

}
