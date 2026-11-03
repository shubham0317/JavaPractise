package day40.com.employeeMgmt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class EmployeeBackupService {

	public void saveEmployee(List <Employee> employees) throws IOException {
			FileOutputStream fis  = new FileOutputStream("emplyeeData.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fis);
			oos.writeObject(employees);
			System.out.println("Employee data serialized successfully!");
			oos.close();
	}
	
	public List<Employee> loadEmployee() throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("/Users/shubhamchandrakar/Downloads/Kodewala/Serilization/emplyeeData.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ArrayList<Employee> emLoad = (ArrayList<Employee>) ois.readObject();
		return emLoad;
		
	}
	
	public void updateEmpsSal(List<Employee> elist, double salary, String eid) throws IOException {
		
		for(Employee e : elist) {
			
			if(e.getEmployeeId().equals(eid)) {
				e.setSalary(salary);
			}
		}
		
		saveEmployee(elist);
	}
}
