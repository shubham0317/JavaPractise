package kodewala.exception.day46;

public class InvoiceService {

      public void generateInvoice() {
    	  /*
    	   * Get customers and orders details from database 
    	   * connect with database --> create database connection
    	   * get details from database
    	   */
    	  
    	  try {
    		  connectDatabase();
    		  String name = "Shubham";
    		  name.lastIndexOf('a');
    		  System.out.println("Generating an invoices...");
    	  } catch (Exception e) {
    		  System.out.println(" Some exception occured ");
    		  e.printStackTrace();
    	  }finally {
    		  System.out.println(" I am inside the finally block");
    		  closeDbConnection();
    	  }
    	  
    	  
      }
      
      private void connectDatabase() 
      {
    	  System.out.println("Connecting to DB...");
      }
      
      private void closeDbConnection() {
    	  
    	  System.out.println("Connection closed...");
      }
	
}
