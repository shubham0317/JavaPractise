package kodewala.exception.day46;

public class Driver {

	public static void main(String[] agrgs) {
		
		InvoiceService is =  new InvoiceService();
		Driver d  = new Driver();
		is.generateInvoice();
		int result  = d.calDiscount(100, 10);
		System.out.println(result);
		
	}
	
	private int calDiscount(int amount, int disc) {
		int finalAmt = 0;
		try  {
			/*
			 * here it should return the 90 discounted price but in finally its getting overrirde
			 */
			finalAmt =  amount - (amount * disc / 100);
			return finalAmt;
		} catch (Exception e) {
			System.out.println(" Some Exception");
			e.printStackTrace();
		}finally {
			
			/*
			 * If you write return in  finally it will overrirde that
			 * previous return 
			 */
			
			finalAmt = 120;
			
		}
		return finalAmt;
	}
}
