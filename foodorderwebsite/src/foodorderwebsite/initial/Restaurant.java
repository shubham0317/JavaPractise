package foodorderwebsite.initial;

import java.util.List;
import java.util.Objects;
import java.util.ArrayList;

public class Restaurant {

	private String resturantId;
	private String name;
	private final List<FoodItem> menu;
	public Restaurant(String resturantId, String name) {
		super();
		this.resturantId = resturantId;
		this.name = name;
		this.menu = new ArrayList<FoodItem>();
	}
	
	public void addFoodItem(FoodItem foodItem) {
		menu.add(Objects.requireNonNull(
	            foodItem, "Food item cannot be null"
		        ));
	}
	
	public void displayMenu() {
		 System.out.println("Restaurant: " + name);
		for(FoodItem foodItem: menu) {
			foodItem.displayDetails();
		}
	}
	
}
