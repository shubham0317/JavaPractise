package day25.kodewala.strings.practise;

public class ProductMain {
    public static void main(String[] args) {
    	
    	String products [] = {
    			 "Laptop", "Mouse", "Keyboard",
    	            "Monitor", "Laptop"
    	};
    	
    	String search =  new String("Laptop");
    	
    	int count = 0;
    	
    	for (String product: products) {
    		if(product.equals(search)) {
    			count++;
    		}
    	}
    	
    	System.out.println("Laptop count: " + count);
    	
    	Product[] productArray = {
                new Product("Laptop", 50000),
                new Product("Mouse", 500),
                new Product("Keyboard", 1200)
            };
         
    	  for (Product p : productArray) {
              p.displayDetails();
          }
    }
}
