
package kodewala.exception.bankingproject;

import java.io.Serializable;
import java.math.BigDecimal;




public class BankAccount implements BankOperations, Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    private String accountNumber;
    private BigDecimal balance;
    private Customer customer;

    // Constructor
    public BankAccount(String accountNumber, BigDecimal balance,
                       Customer customer) {

        setAccountNumber(accountNumber);
        setBalance(balance);
        setCustomer(customer);
    }

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber != null && !accountNumber.isBlank()) {
            this.accountNumber = accountNumber;
        } else {
            throw new IllegalArgumentException(
                "Account number cannot be null or blank"
            );
        }
    }

    public BigDecimal getBalance() {
        return balance;
    }

    private void setBalance(BigDecimal balance) {
    	if (balance == null || balance.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException(
                "Balance cannot be null or negative"
            );
        }

        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        if (customer != null) {
            this.customer = customer;
        } else {
            throw new IllegalArgumentException(
                "Customer cannot be null"
            );
        }
    }

    // Deposit Money
    @Override
    public void deposit(BigDecimal amount) throws IllegalArgumentException {

        if (amount == null) {
            throw new IllegalArgumentException(
                "Deposit amount cannot be null"
            );
        }
        
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException(
                "Deposit amount must be greater than zero"
            );
        }

        balance = balance.add(amount);

        System.out.println("Amount deposited successfully!");
        System.out.println("Updated balance: " + balance);
    }

    // Withdraw Money
    @Override
    public void withdraw(BigDecimal amount) throws IllegalArgumentException , InsufficiantBalanceException{

    	if (amount == null) {
            throw new IllegalArgumentException(
                "Withdrawal amount cannot be null"
            );
        }
        
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException(
                "Withdrawal amount must be greater than zero"
            );
        }
        
        if(amount.compareTo(balance) > 0) {
        	throw new InsufficiantBalanceException("Insufficient balance!");
        }

        balance = balance.subtract(amount);

        System.out.println("Amount withdrawn successfully!");
        System.out.println("Updated balance: " + balance);
    }
    
    

    // Check Balance
    @Override
    public void checkBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
    
    
    
    @Override
    public Object clone() throws CloneNotSupportedException {
    	
    	BankAccount clonedBankAccount = (BankAccount)super.clone();
    	if (this.customer != null) {
            clonedBankAccount.customer =
                (Customer) this.customer.clone();
        }
    	return clonedBankAccount;
    	
    }
    
    public String toString() {

        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", customer=" + customer +
                '}';
    }
    
    
}
