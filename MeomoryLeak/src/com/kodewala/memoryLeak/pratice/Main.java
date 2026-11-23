package com.kodewala.memoryLeak.pratice;




public class Main {
 
	public static void main(String[] args) {
		
		Employee e =  new Employee(1, "Shubham");
		System.out.println(e.empName);
		Employee e2 = e;
		
        /*
         * Now this object is eligible for GarbageCollection because we are nullifying the object	
         */
		e =  null;
		e2 = null;
		try {
			//System.out.println(e.empName);
			System.out.println(e2.empName);
			
		} catch(NullPointerException a) {
			System.out.println(a.getMessage());
			a.printStackTrace(); 
		}
		System.out.println("END");
		
		
		Employee e1 = new Employee(101, "R");
		Employee e21 = new Employee(102, "S");
		Employee e3 = e1;

		e1 = e21;
		e21 = null;
		
		System.out.println(e1.id);
		System.out.println(e21.id);
		System.out.println(e3.id);
		
	}
}
