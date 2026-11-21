package kodewala.exception.project;

public class Employee {

	String name ;
    double salary;
	double bonus;
	double basic;
	
	public void setName(String name) {
		try {
			this.name  =  name;
			System.out.println("Name set done");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error occured");
		} finally {
			
		}
	}
	
	public void setSalary(String salary) {
		try {
			double finalS = Integer.parseInt(salary);
			this.salary  =  finalS;
			System.out.println("Salary set done");
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("Salary should be in number formate");
			
		}finally {
			System.out.println();
		}
	}
	
	public void setBonus(String bonus) {
		try {
			double finalS = Integer.parseInt(bonus);
			this.bonus  =  finalS;
			System.out.println("bonus set done");
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("Bonus should be in number formate");
		}
	}
	
	public void setBasic(String base) {
		try {
			double finalS = Integer.parseInt(base);
			this.basic  =  finalS;
			System.out.println("basic set done");
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("Basic should be in number formate");
		}
	}
}
