class CheckCompliation 
{
   public static void main(String[] args) 
   {
     int a = 10;
	 if(a = 10) {  //compilation error int cant be converted to boolean
	  System.out.println("Hello");  
	 }
   }
}