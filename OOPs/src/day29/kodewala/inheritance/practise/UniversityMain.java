package day29.kodewala.inheritance.practise;

public class UniversityMain {

	public static void main(String[] args) {
		University u1 = new University("Guru Ghasidas University");
		
		Department d1 =  new Department("Computer Science");
		Department d2 =  new Department("BTech");
		Department d3 =  new Department("Maths");
		
		u1.addDepartment(d1);
		u1.addDepartment(d2);
		u1.addDepartment(d3);
		
		u1.displayDepartments();
		
	}
}
