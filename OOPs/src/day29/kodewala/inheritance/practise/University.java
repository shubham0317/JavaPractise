package day29.kodewala.inheritance.practise;

import java.util.ArrayList;
import java.util.List;

public class University {

	private String universityName;
	private List<Department> departments;
	
	University (String universityName) {
		this.universityName = universityName;
		this.departments = new ArrayList<>();
	}

	

	public void addDepartment(Department department) {
		departments.add(department);
	}
	
	public void displayDepartments() {
        System.out.println("University: " + universityName);
        System.out.println("Departments:");

        for (Department department : departments) {
            System.out.println("- " + department.getDepartment());
        }
    }
	
	
	
}
