package day28.kodewala.practise;

public class SqlQuery {

	public static void main(String[] args) {
		StringBuilder query = new StringBuilder("SELECT * FROM employee WHERE 1 = 1");
		
		boolean filterDepartment = true;
		
		if(filterDepartment) {
			query.append(" AND department = 'IT' ");
		}
		
		
		boolean filterBySalary = true;
		
		
		if(filterBySalary) {
			query.append(" AND salary > 50000; ");
		}
		System.out.println(query.toString());
	}
}
