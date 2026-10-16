package day29.kodewala.inheritance.relationshipEntity;

public class ProductDriver {

	public static void main(String[] args) {
		Product p1 = new Product("Laptop", "HP laptop with 16GB RAM and 512GB SSD", 10, "Available");
        p1.showProductdetails();
        
        System.out.println("------------------------------------");
        
		ElectronicProduct p2 = new ElectronicProduct("Samsung Laptop", "Samsung laptop with 16GB RAM and 512GB SSD", 15,
				"Available", true, 2);
		p2.showElectronicProductdetails();
		
		System.out.println("------------------------------------");

		ClothingProduct p3 = new ClothingProduct("Cotton T-Shirt", "Regular fit cotton T-shirt", 50, "Available",
				"Cotton", "Black", "L");
		p3.showClothingProductdetails();
	}
}
