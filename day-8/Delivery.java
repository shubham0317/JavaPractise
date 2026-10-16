class Dilevery {

    static String companyName = "BLINKIT";
	int amount;
	void displayDileveryOffer(){
	System.out.println("Welcome to " + companyName);
	System.out.println("If your order is greater than 199 you will get free dilevery");
	String message = amount > 199? " You are eligible to get free delivery": "Final price is " + (amount + 30);
    System.out.println(message);
	}
	
	public static void main(String[] args) {
	
	 Dilevery d1 = new Dilevery();
	 d1.amount = Integer.parseInt(args[0]);
	 d1.displayDileveryOffer();
	
	}

}