package day27.kodewala.practise;

public class Demo {
	
	static {
		System.out.println(" This is a static block");
	}
	
	{
		System.out.println(" This is a instance block");
	}
	
	Demo(){
		System.out.println(" This is a constructor Demo");
	}

	public static void main(String[] args) {
		System.out.println(" Main method started ");
		
		System.out.println("---------------------");
		
		Demo d1 =  new Demo();
		
		System.out.println("---------------------");
		Demo d2 = new Demo();
		
		System.out.println("---------------------");
		
		System.out.println(" Main method ended ");
	}
}
