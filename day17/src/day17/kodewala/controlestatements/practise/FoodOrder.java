package day17.kodewala.controlestatements.practise;

public class FoodOrder {

	public int calculateDiscount(int cartAmount) {
		int discount = 0;
		
		if(cartAmount <= 0) {
			return -1;
		} else if(cartAmount < 300){
			return 0;
			
		} else if(cartAmount <= 799 && cartAmount >=300) {
			System.out.println("Congratualations you are eligible for 5% discount upto 250");
			discount = cartAmount * 5 /100;
			if(discount > 250) {
		          discount =  250;
			}
			return discount;
			
		}else if(cartAmount <= 1499 && cartAmount >= 800) {
			System.out.println("Congratualations you are eligible for 10% discount upto 250");
			discount = cartAmount * 10 /100;
			if(discount > 250) {
		          discount =  250;
			}
			return discount;
		} else {
			System.out.println("Congratualations you are eligible for 20% discount upto 250");
			discount = cartAmount * 20 /100;
			if(cartAmount > 250) {
			discount =  250;
			}
			return discount;
		}
	}
	
	
}
