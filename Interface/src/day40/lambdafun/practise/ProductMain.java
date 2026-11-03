package day40.lambdafun.practise;

import java.util.ArrayList;
import java.util.List;

public class ProductMain {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product(101, "Laptop", 55000, 10, true));
        products.add(new Product(102, "Mouse", 500, 20, true));
        products.add(new Product(103, "Keyboard", 1500, 0, true));
        products.add(new Product(104, "Monitor", 12000, 5, true));
        products.add(new Product(105, "Headphones", 2000, 10, false));

        ProductService service = new ProductService();

        List<Product> availableProducts =
                service.getAvailableProducts(products);

        System.out.println("Available Products:");

        availableProducts.forEach(System.out::println);
    }
}
