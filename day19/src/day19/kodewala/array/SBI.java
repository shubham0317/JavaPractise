package day19.kodewala.array;

public class SBI {
    
       private String customerName;
       private int balance;
       private String mobileNumber;
       
	   public SBI(String _customerName, int _balance, String _mobileNumber) {
		super();
		this.customerName = _customerName;
		this.balance = _balance;
		this.mobileNumber = _mobileNumber;
	   }

//	   @Override
//	   public String toString() {
//		return "[customerName=" + customerName + ", balance=" + balance + "]";
//	   }

	   public String getCustomerName() {
		   return customerName;
	   }

	   public void setCustomerName(String customerName) {
		   this.customerName = customerName;
	   }

	   public int getBalance() {
		   return balance;
	   }

	   public void setBalance(int balance) {
		   this.balance = balance;
	   }

	   public String getMobileNumber() {
		   return mobileNumber;
	   }

	   public void setMobileNumber(String mobileNumber) {
		   this.mobileNumber = mobileNumber;
	   }
       
	   public void displayUser() {
		   System.out.println(customerName + " balane is " + balance);
	   }
	   
       
	
}
