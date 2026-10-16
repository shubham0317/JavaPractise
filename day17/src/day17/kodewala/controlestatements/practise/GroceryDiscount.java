package day17.kodewala.controlestatements.practise;

public class GroceryDiscount {

	public int calculateDiscount(int cartAmount) {
		int discount = 0;
		
		if(cartAmount <= 0) {
			return -1;
		} else if(cartAmount < 500){
			return 0;
			
		} else if(cartAmount < 900 && cartAmount >500) {
			
			discount = cartAmount * 5 /100;
			if(discount > 300) {
		          discount =  300;
			}
			return discount;
			
		}else if(cartAmount < 1999 && cartAmount >1000) {
			
			discount = cartAmount * 10 /100;
			if(discount > 300) {
		          discount =  300;
			}
			return discount;
		} else {
			discount = cartAmount * 15 /100;
			if(cartAmount > 300) {
			discount =  300;
			}
			return discount;
		}
	}
	
}
