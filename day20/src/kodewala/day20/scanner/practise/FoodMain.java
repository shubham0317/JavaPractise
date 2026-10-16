package kodewala.day20.scanner.practise;

public class FoodMain {
	
	public static void main(String[] args) {
		
		Food f1 =  new StreetFood();
		System.out.println(f1.foodName);
		f1.display();
		
		
		StreetFood f2 = new StreetFood();
		System.out.println(f2.foodName);
		f2.display();
	}

	
	
	
}
