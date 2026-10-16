package day25.kodewala.strings.practise;

public class FoodObj {

	public static void main(String[] args) {

		Food foods[] = { new Pizaa("Chees Pizza", 170), new Burger("Veg Burger", 70), };

		for (Food f : foods) {
			f.displayProduct();
		}

	}
}
