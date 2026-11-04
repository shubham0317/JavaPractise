package kodewala.deepcloning.Employeebackup.day42;


public class Main {
 
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Department dep =  new Department("IT");
		
		Employee emp =  new Employee("Shubham", dep);
		
		Employee cloneEmp = (Employee) emp.clone();
		
		System.out.println(emp.dep.department);
		System.out.println(cloneEmp.dep.department);
		
		emp.dep.department = "Finance";
		
		/*
		 * Here emp department is changed and cloneEmp remain same so the referance for that is created different it
		 * is a deep copy
		 */
		
		System.out.println(emp.dep.department);
		System.out.println(cloneEmp.dep.department);
		
	}
}
