package kodewala.exception.bankingproject;

public class InsufficiantBalanceException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public InsufficiantBalanceException(String msg) {
		super(msg);
	}
	
	

}
