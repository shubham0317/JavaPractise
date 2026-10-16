class Discount {

    static String companyName = "ZEPTO";
	int amount;
	void displayDiscount(){
	System.out.println("Welcome to " + companyName);
	System.out.println("If your order is greater than 500 you will get discount of 50");
	String message = amount > 500? "Discounted price will be " +(amount - 50): "Add  " + (500 - amount) + " more to get discount";
    System.out.println(message);
	}
	
	public static void main(String[] args) {
	
	 Discount d1 = new Discount();
	 d1.amount = Integer.parseInt(args[0]);
	 d1.displayDiscount();
	
	}

}