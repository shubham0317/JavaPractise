package kodewala.exception.bankingproject;

import java.math.BigDecimal;

public interface BankOperations {

	void deposit(BigDecimal amount);
	void withdraw(BigDecimal amount) throws InsufficiantBalanceException;
	void checkBalance();
	
}
