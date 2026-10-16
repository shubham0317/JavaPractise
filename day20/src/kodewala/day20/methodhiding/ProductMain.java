package kodewala.day20.methodhiding;

public class ProductMain {

	
	public static void main(String[] args) {
		Product p = new ElectronicsProduct();
		p.applyDisount();
		
		Product p2 = new ClothingProduct();
		p2.applyDisount();
	}
	
	
}
