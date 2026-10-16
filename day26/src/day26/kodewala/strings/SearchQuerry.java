	package day26.kodewala.strings;

public class SearchQuerry {
	
	public StringBuilder generateQuerry(int  salary, String empId) {
		StringBuilder querry =  new StringBuilder("Select * from employee ");
		
		if(salary > 0) {
			querry.append( " Where salary  = " + salary + "; ");
		} else if (empId != null) {
			querry.append( " Where empId  = " + empId+ "; ");
		} else {
			querry.append("; ");
		}
		
		return querry;
	}
      
}
