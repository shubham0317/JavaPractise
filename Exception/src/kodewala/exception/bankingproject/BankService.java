package kodewala.exception.bankingproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



public class BankService implements Serializable{

	  private static final long serialVersionUID = 1L;
	  private ArrayList<BankAccount> accounts = new ArrayList<>();
	  
	  public void createAccount(String accountNumber, BigDecimal balance,
              Customer customer) {
		  if(accountNumber == null || accountNumber.isBlank()) {
			  throw new IllegalArgumentException("Account number cannot be empty");
		  }
		  
		  
		  for (BankAccount account : accounts) {
		        if (account.getAccountNumber().equals(accountNumber)) {
		            throw new IllegalArgumentException(
		                "Account already exists"
		            );
		   }
	  }
		  
		  

		  
		  accounts.add(new BankAccount(accountNumber, balance, customer));
		  
		  System.out.println("Account created successfully!");
	  }
	  
	  private BankAccount findAccount(String accNo) throws AccountNotFoundException {
		 
		  for (BankAccount a : accounts) {
			  
			  if(a.getAccountNumber().equals(accNo)) {
				  return a;
			  }
		  }
		  throw new AccountNotFoundException("Account not found: " + accNo);
	  }
	  
	  public void  depositAmount(String accNo, BigDecimal amount) throws  AccountNotFoundException{
		  
		 
			  BankAccount account = findAccount(accNo);
			  account.deposit(amount);
			 
		  
	  }
	  
     public void  withDrawMoney(String accNo, BigDecimal amount) throws AccountNotFoundException,InsufficiantBalanceException{
		  
			  BankAccount account = findAccount(accNo);
			  account.withdraw(amount);
			
	  }
     
     public void  transferMoney(String senderAcc, String receiverAcc, BigDecimal amount) throws AccountNotFoundException {
		  
    	    // 1. Validate the transfer amount
    	 if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0) {
    	        throw new IllegalArgumentException(
    	            "Transfer amount must be greater than zero"
    	        );
    	    }
    	 
    	 //2. prevent transfers to the same account
    	 
    	 if(senderAcc != null && senderAcc.equals(receiverAcc)) {
    		 throw new IllegalArgumentException(
    		            "Sender and receiver accounts cannot be the same"
    		        );
    	 }
    	 
    	 // 3. Check whether both accounts exist
    	 
    	 BankAccount sender;
    	 BankAccount receiver ;
    	   try {
    		   sender = findAccount(senderAcc);
    	   } catch (AccountNotFoundException e) {
    		   throw new AccountNotFoundException("Sender's Account not found: " + senderAcc);
    	   }
    	   
    	   try {
    		   receiver = findAccount(receiverAcc);
    	   } catch (AccountNotFoundException e) {
    		   throw new AccountNotFoundException("Reciver's Account not found: " + receiverAcc);
    	   }
    	    
    	    
    	    
    	 // 4. Check whether sender has sufficient balance
    	    if (sender.getBalance().compareTo(amount) < 0) {
    	        throw new InsufficiantBalanceException(
    	            "Insufficient balance for transfer"
    	        );
    	    }
    	  
    	    sender.withdraw(amount);
    	    receiver.deposit(amount);

    	    System.out.println("Money transferred successfully!");
    	    

	  }
     
     public void displayAllAccounts(ArrayList<BankAccount> banks) {
    	 for (BankAccount b : banks) {
    		 System.out.println("Account Holder Name: " + b.getCustomer().getName() + " And Account Number is: " + b.getAccountNumber());
    	 }
     }
     
     public void saveData() {

    	 
    	    try (FileOutputStream fos = new FileOutputStream("bank.ser");
    	         ObjectOutputStream oos = new ObjectOutputStream(fos)) {

    	        oos.writeObject(accounts);
    	        

    	        System.out.println("All Bank account serialized successfully!");

    	    } catch (IOException e) {

    	        System.out.println("Error while saving account data");
    	        e.printStackTrace();

    	    }
    }
     
     
    public List<BankAccount> loadData() throws FileNotFoundException, IOException, ClassNotFoundException {
    	
    	List<BankAccount> ls;
    	
    	try(FileInputStream fis = new FileInputStream("bank.ser");
    			ObjectInputStream ois = new ObjectInputStream(fis)
    		){
    		Object obj = ois.readObject();
    		
    		if (obj instanceof List<?>) {
    			ls = new ArrayList<>();
    			
    			for(Object item : (List<?>) obj) {
    				if (item instanceof BankAccount) {
    					ls.add((BankAccount) item);
    				} else {
    					throw new IOException("Invalid object found in file");
    				}
    			}
    		} else {
    			 throw new IOException("Invalid file format");
    		}
    		 System.out.println("All bank accounts deserialized successfully!");
    	}
    	return ls;
    }
     
     
	  

}
