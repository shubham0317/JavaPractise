package day23.kodewala.string;

public class Driver {

	
	public static void main(String[] args) {
		
		
		   /*String object declared using literals it will get stored in string constant pool
		    * firstName address --> xyz321
		    * object with content "Kodewala" already created 
		    * and lastName will refer to  existing object
		    * lastName is also  pointing to address xyz321
	       */
		
         /*
          * by default equals method check the object
          * in case of string it will compare the actual content is same or not 
          */
		
		String firstName = "Kodewala";
		String lastName = "Kodewala";
		
		System.out.println(firstName == lastName);
		
		String city = new String("Kodewala");
		System.out.println(firstName == city);
		
		User u1 = new User("Kodewala");
		User u2  = new User("Kodewala");
		
		
		System.out.println(u1.equals(u2));
		
		
//		int a = 10;
//		int b = 10;
//		System.out.println(a == b);
		
		
		
	}
	
  
	
	
	
}
