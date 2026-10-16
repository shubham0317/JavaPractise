class Mobile {


    static String operatingSystem = "IOS";
    String model;
    int ram;
	
	void mobileDetails() {
	    int storage = 128;
        System.out.println("operatingSystem: " + operatingSystem);
        System.out.println("model: " + model);
        System.out.println("ram: " + ram + " GB");
        System.out.println("storage: " + storage + " GB");
	}
	
	
	
	public static void main(String[] args) {
	Mobile m1 = new Mobile();
	m1.model = "Iphone 13";
	m1.ram = 4;
	m1.mobileDetails();
	}

}