package day22.kodewala.practise;

interface Payment {
void pay(double amount);
void refund (double amount);

}

abstract class BasePayment implements Payment {
	
	protected String transactionId;
	
	BasePayment(String transactionId){
		this.transactionId = transactionId;
	}
	
	
	protected void validateAmount(double amount) {
		if(amount <= 0) {
			throw new IllegalArgumentException (
			"Amount must be greater than 0"
			);
			
		}
	}
	  protected void logPayment() {
	        System.out.println(
	            "Transaction ID: " + transactionId
	        );
	  }
	  
	  
	  @Override
	    public void refund(double amount) {
	        validateAmount(amount);

	        System.out.println(
	            "Refunding ₹" + amount
	        );

	        logPayment();
	    }
	  
	  // Different for every payment method
	    @Override
	    public abstract void pay(double amount);
}



class CreditCardPayment extends BasePayment {
	
	CreditCardPayment(String transactionId) {
		super(transactionId);
	}
	
	public void pay(double amount) {
		validateAmount(amount);
	
	
	 System.out.println(
	            "Processing Credit Card payment of ₹" + amount
	        );
	 
	 logPayment();
	}
}


class UPIPayment extends BasePayment {
	UPIPayment(String transactionId) {
        super(transactionId);
    }
	
	public void pay(double amount) {
		validateAmount(amount);
		
		System.out.println(
	            "Processing UPI payment of ₹" + amount
	        );
		
		logPayment();
	}
	
}

class NetBankingPayment extends BasePayment {

    NetBankingPayment(String transactionId) {
        super(transactionId);
    }

    @Override
    public void pay(double amount) {

        validateAmount(amount);

        System.out.println(
            "Processing Net Banking payment of ₹" + amount
        );

        logPayment();
    }
}













