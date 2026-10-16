package day19.kodewala.array.practice;

public class ProductMain {

	public static void main(String[] args) {
		
		Product p1 =  new Product("Laptop",1,35000,5,"Electronic");
		Product p2 =  new Product("Mobile",2,24000,7,"Electronic");
		Product p3 =  new Product("Ac",3,40000,20,"Electronic");
		Product p4 =  new Product("Earbuds",20,3000,40,"Electronic");
		
		Product products [] = new Product[4];
		
		products[0] = p1;
		products[1] = p2;
		products[2] = p3;
		products[3] = p4;
		
		for (int i = 0; i < products.length; i++ ) {
			if(products[i].getQuantity() < 10) {
				System.out.println("The Quantity of " + products[i].getProductName() + " is " + products[i].getQuantity());
			}
			
			if(products[i].getPrice() < 10000) {
				System.out.println(products[i].getProductName() + " has  price less then 10000");
			}
		}
		
		
	}
	
}
