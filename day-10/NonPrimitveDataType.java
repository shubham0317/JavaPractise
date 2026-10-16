class NonPrimitveDataType 
{
   
      String name;
	  int [] number;
	  Student student;
	  
	  
   public static void main(String[] args) 
   {
     NonPrimitveDataType np = new NonPrimitveDataType();
	     System.out.println("String default value: " + np.name);
        System.out.println("Array default value: " + np.number);
        System.out.println("Object default value: " + np.student);
		   System.out.println(np.name == null);
        System.out.println(np.number == null);
        System.out.println(np.student == null);
   }
   

}
class Student {
}