class Employee {

    static int employeeCount = 0;

    String name;
    int id;

    Employee() {
        employeeCount++;
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();
        Employee e5 = new Employee();

        System.out.println("Total Employees: " + employeeCount);
    }
}