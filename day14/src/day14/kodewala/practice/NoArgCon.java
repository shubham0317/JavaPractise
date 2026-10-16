package day14.kodewala.practice;

public class NoArgCon {

	 String brand;
	 int price;
	 
	 NoArgCon(){
		 brand = "BMW";
		 price = 10000000;
	 }
	 
	 public static void main(String[] args) {
		 
		 NoArgCon ngc = new NoArgCon();
		 System.out.println(ngc.brand);
		 
		 NoArgCon ngc1 = new NoArgCon();
		 ngc1.brand = "Toyota";
		 System.out.println(ngc1.brand);
		 
		 
	 }
	
}
