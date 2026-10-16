package day13.kodewala.constructors2;

public class ProductObject {

	public static void main(String[] args) {
		
		ProductDetails product1 = new  ProductDetails();
		System.out.println("Product 1 Details");
		System.out.println("Product Name: " + product1.productName + ", Product price: " + 
		product1.price + ", Product Quantity: " + product1.quantity + 
		", Product Description: " + product1.description);
		
		System.out.println("------------------------------------");
		
		ProductDetails product2 = new  ProductDetails("Laptop", "This is a Lenovo ideapad 3 laptop");
		System.out.println("Product 2 Details");
		System.out.println("Product Name: " + product2.productName + ", Product price: " + 
		product2.price + ", Product Quantity: " + product2.quantity + 
		", Product Description: " + product2.description);
		
		System.out.println("------------------------------------");
		
		ProductDetails product3 = new  ProductDetails("Samsung s23 ", 50000, " This phone have 16gb ram and 265 gb storage" , 4);
		System.out.println("Product 3 Details");
		System.out.println("Product Name: " + product3.productName + ", Product price: " + 
		product3.price + ", Product Quantity: " + product3.quantity + 
		", Product Description: " + product3.description);
	}
	
}
