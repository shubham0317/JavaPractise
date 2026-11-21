package kodewala.exception.thowsthrowday.day47;

public class Driver {

	public static void main(String [] args) {

//		System.out.println("Driver.main().. START");
//		AccountMgmt am = new AccountMgmt();
//		am.openAccount(null);
//		System.out.println("Driver.main().. END");
		
		System.out.println("Driver.main()......START");
		PaymentMgmt pm =  new PaymentMgmt();
		
		try {
			pm.doPayment("435567", 6000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Driver.main()......END");
	}
}
