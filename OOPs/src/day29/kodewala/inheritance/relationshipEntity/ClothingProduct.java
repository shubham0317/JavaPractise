package day29.kodewala.inheritance.relationshipEntity;

public class ClothingProduct  extends Product{

	String materialType;
	String color;
	String size;
	public ClothingProduct(String productName, String description, int quantity, String status, String materialType,
			String color, String size) {
		super(productName, description, quantity, status);
		this.materialType = materialType;
		this.color = color;
		this.size = size;
	}
	
	public void showClothingProductdetails() {
		System.out.println(productName);
		System.out.println(description);
		System.out.println(quantity);
		System.out.println(status);
		System.out.println(materialType);
		System.out.println(color);
		System.out.println(size);
	}
}
