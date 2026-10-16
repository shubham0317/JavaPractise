package day14.kodewala.constructor;


class Invoice extends Object {
	static int gst = 18;
	
	int amount;
	String itemName;
	String billingAddress;
	String customerId;
	String customerName;
	
	public Invoice(int _amount, String _itemName, String _billingAddress, String _customerId, String _customerName) {
		this.amount = _amount;
		this.itemName = _itemName;
		this.billingAddress = _billingAddress;
		this.customerId = _customerId;
		this.customerName = _customerName;
	}
	
	
	
}

public class Driver {
	
	public static void main(String[] args) {
		
		/* Invoice inv1 = new Invoice(180000,"Iphone 18", "Kodewala BTM 2nd Stange Bengaluru", "C4321", "kodewala");
		System.out.println(" First Invoice: " +  inv1.amount + " , " + inv1.customerId + " , " + inv1.gst);
		
		Invoice.gst  += 1;
		
		Invoice inv2 = new Invoice(20000,"Oppo", "Kodewala BTM 2nd Stange Bengaluru", "C5321", "shubham");
		System.out.println(" Second Invoice: " +  inv2.amount + " , " + inv2.customerId + " , " + inv2.gst);
		System.out.println(" First Invoice: " +  inv1.amount + " , " + inv1.customerId + " , " + inv1.gst);
		*/
		
		Notification ns = new Notification();
		ns.sendNotification("sms");
		ns.sendNotification("email");
		ns.sendNotification("other");
	}

}
