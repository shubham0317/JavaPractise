class Student {
 
 
      static String collegeName = "GGU";
	  String name;
	  int age;
	  
	  void studentMarks() {
	  
	   int marks = 80;

        System.out.println("College: " + collegeName);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
	  
	  }
 
 
 
    public static void main(String[] args) {
	
	  Student s1 = new Student();
	  s1.name = "Shubham";
	  s1.age = 20;
	  s1.studentMarks();
	  
	
	}

}