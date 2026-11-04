package kodewala.cloning.product.day42;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		ShopingCart cart1 = new ShopingCart();
		
		cart1.products.add(new Product("Laptop", 60000));
        cart1.products.add(new Product("Mouse", 1000));
        
        ShopingCart cloneCart = (ShopingCart) cart1.clone();
        
        cart1.products.get(0).price = 55000;
        
        System.out.println(cart1.products.get(0).price);
        System.out.println(cloneCart.products.get(0).price);
        
        

	}
}
