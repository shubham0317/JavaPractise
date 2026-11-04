package kodewala.cloning.product.day42;

import java.util.ArrayList;
import java.util.List;

public class ShopingCart  implements Cloneable {

	List<Product> products = new ArrayList<>();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
	
}
