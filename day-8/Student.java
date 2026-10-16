class Student {

   static String university = "GGU";
   int rollNo;
   String name;
   void displayResult(){
  
    int marks = 300;
	System.out.println("University Name : " + university);
	System.out.println("Studnent rollNo: " + rollNo);
	System.out.println("Student Name: " + name);
	System.out.println("Your marks is: " + marks);
   
   }
   
   public static void main(String[] args) {
    Student s1 = new Student();
	s1.name = "Shubham";
	s1.rollNo = 12;
	s1.displayResult();
   }

}