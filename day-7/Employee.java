class Employee {

  static String  companyName = "Kodewala";
  String employeeName;
  int employeeId;
  
  void displaySalary(){
   double salary = 95000.25d;
        System.out.println("Company: " + companyName);
        System.out.println("employeeName: " + employeeName);
        System.out.println("employeeId: " + employeeId);
        System.out.println("salary: " + salary);
  }
  
  public static void main(String[] args) {
   Employee emp = new Employee();
   emp.employeeName = "Shubham";
   emp.employeeId = 1;
   emp.displaySalary();
  }

}