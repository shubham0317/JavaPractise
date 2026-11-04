package kodewala.cloning.employeemanage.day42;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		Department dev =  new Department("Developemnt");
		Employee emp =  new Employee("EMP1", "Shubham", dev);
		
		Employee cloneEmp = (Employee) emp.clone();
		
		System.out.println("Emp dep: " + emp.dept.department);
		System.out.println("Emp dep: " + cloneEmp.dept.department);
		
		emp.dept.department = "Support";
		
		System.out.println("Emp dep: " + emp.dept.department);
		System.out.println("Emp dep: " + cloneEmp.dept.department);
	}
}
