package day27.kodewala.staticbloc;

public class User {
    
	 String userName;
	 String userId;
	 String mobileNo;
	 
	 static 
	 {
		 System.out.println("I am in static init Block");
	 }

	 public User(String userName, String userId, String mobileNo) {
		super();
		 System.out.println("User " +userName+"  " + userId +"  " +mobileNo +" " +  "Constructor");
		this.userName = userName;
		this.userId = userId;
		this.mobileNo = mobileNo;
	 }
	 
	 
	
}
