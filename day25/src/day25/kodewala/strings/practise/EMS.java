package day25.kodewala.strings.practise;

public class EMS {
   public static void main(String[] args) {
	   String [] names =  {"Rahul", "Priya", "Amit", "Priya"};
	   int [] salaries = {30000, 45000, 35000, 50000};
	   
	   EMSObj[] employees = {
	            new EMSObj("Rahul", 101, 30000), 
	            new EMSObj("Priya", 102, 45000),
	            new EMSObj("Amit", 103, 35000),
	            new EMSObj("Priya", 104, 50000)
	        };
	   
	   EMSObj highestpaid = employees[0];
	   
	    for (int i = 0 ; i < employees.length; i++) {
	    	if(employees[i].salary >  highestpaid.salary) {
	    		highestpaid = employees[i];
	    	}
	    }
	    
	    highestpaid.displayDetails();
   }
	
}
