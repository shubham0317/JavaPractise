package day40.lambdafun.practise;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProductService {

	public List<Product> getAvailableProducts(List<Product> products) {
		
		Predicate<Product> priceCheck =
                product -> product.getPrice() > 1000;

        Predicate<Product> stockCheck =
                product -> product.getStock() > 0;

        Predicate<Product> activeCheck =
                product -> product.isActive();

        Predicate<Product> eligibility =
                priceCheck.and(stockCheck).and(activeCheck);
        
        return products.stream()
                .filter(eligibility)
                .collect(Collectors.toList());
    }
	
}
