package day15.kodewala.practise;

class Company {
    String companyName;

    Company() {
        this("TCS");
        System.out.println("Company Default Constructor");
    }

    Company(String companyName) {
        this.companyName = companyName;
        System.out.println("Company Parameterized Constructor");
    }
}

class Department extends Company {
    String departmentName;

    Department() {
        this("IT");
        System.out.println("Department Default Constructor");
    }

    Department(String departmentName) {
        super("TCS Bangalore");
        this.departmentName = departmentName;
        System.out.println("Department Parameterized Constructor");
    }
}

class Employee extends Department {
    int employeeId;

    Employee() {
        this(101);
        System.out.println("Employee Default Constructor");
    }

    Employee(int employeeId) {
        super("Development");
        this.employeeId = employeeId;
        System.out.println("Employee Parameterized Constructor");
    }
}

class Manager extends Employee {
    String managerName;

    Manager() {
        this("Amit");
        System.out.println("Manager Default Constructor");
    }

    Manager(String managerName) {
        super(101);
        this.managerName = managerName;
        System.out.println("Manager Parameterized Constructor");
    }
}

public class EmployeeMain extends Manager {

    EmployeeMain() {
        this(75000);
        System.out.println("EmployeeMain Default Constructor");
    }

    EmployeeMain(int salary) {
        super("Rahul");
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        EmployeeMain obj = new EmployeeMain();

        System.out.println("Company: " + obj.companyName);
        System.out.println("Department: " + obj.departmentName);
        System.out.println("Employee ID: " + obj.employeeId);
        System.out.println("Manager: " + obj.managerName);
    }
}
