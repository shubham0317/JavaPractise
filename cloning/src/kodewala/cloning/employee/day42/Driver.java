package kodewala.cloning.employee.day42;

public class Driver {

 /*
  * This is the example of shallow copy --> 
  */
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address ad =  new Address("16th Main", "BTM", "Bengaluru");
		Employee e1 =  new Employee("Shubham","Emp1",ad);
		
		Employee clonedEmp = (Employee) e1.clone();
		
		System.out.println(e1.address.city);
		e1.address.city = "hyd";
		System.out.println(clonedEmp.address.city);
		System.out.println(e1.address.city);
		
		
		
	}
}
