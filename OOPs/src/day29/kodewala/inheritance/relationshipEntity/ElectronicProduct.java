package day29.kodewala.inheritance.relationshipEntity;

public class ElectronicProduct extends Product {

	
	boolean isWarrenty;
	int warrenty ;
	public ElectronicProduct(String productName, String description, int quantity, String status, boolean isWarrenty,
			int warrenty) {
		super(productName, description, quantity, status);
		this.isWarrenty = isWarrenty;
		this.warrenty = warrenty;
	}
	
	public void showElectronicProductdetails() {
		System.out.println(productName);
		System.out.println(description);
		System.out.println(quantity);
		System.out.println(status);
		System.out.println(isWarrenty);
		System.out.println(warrenty);
	}
	
}
