package kodewala.cloning.employee.day42;

public class Employee implements Cloneable{

	String name;
	String empCode;
	Address address;
	
	public Employee(String name, String empCode, Address address) {
		super();
		this.name = name;
		this.empCode = empCode;
		this.address = address;
	}
	
	
   /*
    * Shallow copy
    */
//	@Override
//	public Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}
//
	
   /*
    * Deep copy
    */
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		Employee e = (Employee) super.clone();
		e.address = (Address) address.clone();
		return e;
	}
	
}
