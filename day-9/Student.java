class Student {

    String college;
    String department;
    String name;
    int age;

    Student(String college, String department, String name, int age) {
        this.college = college;
        this.department = department;
        this.name = name;
        this.age = age;
    }

    void displayStudent() {
        System.out.println("College Name is " + college);
        System.out.println("Department Name is " + department);
        System.out.println("Student Name is " + name);
        System.out.println("Age is " + age);
    }

    static void greet(String name, String department) {
        System.out.println("This is " + name + " enrolled in "
                + department + " Department");
    }

    public static void main(String[] args) {

        Student s1 = new Student("GGU", "CSIT", "Shubham", 23);
        Student s2 = new Student("GGU", "CSIT", "Rahul", 21);

        s1.displayStudent();
        s2.displayStudent();

        greet(s1.name, s1.department);
        greet(s2.name, s2.department);
    }
}