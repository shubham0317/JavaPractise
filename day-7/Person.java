class Person{

  static String country = "INDIA";
  String name;
  int age;
  
  void personDetail(){
  System.out.println("Country : " + country);
  System.out.println("name : " + name);
  System.out.println("age : " + age);
  System.out.println("--------------------");
  }
  
  public static void main(String[] args) {
  
    System.out.println("Perosn 1");
    Person p1 = new Person();
	p1.name = "Shubham";
	p1.age = 22;
	p1.personDetail();
	
	
	System.out.println("Perosn 2");
    Person p2 = new Person();
	p2.name = "Rahul";
	p2.age = 23;
	p2.personDetail();
	
	System.out.println("Perosn 3");
    Person p3 = new Person();
	p3.name = "Deepti";
	p3.age = 21;
	p3.personDetail();
  
  }

}