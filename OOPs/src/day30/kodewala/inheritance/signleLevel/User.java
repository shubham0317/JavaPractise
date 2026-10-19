package day30.kodewala.inheritance.signleLevel;

public class User {
   String userName;
   
   public void showUser() {
	   System.out.println(userName);
   }
}

class Admin extends User {
	boolean isDashboardAllowed = true;
	public void showUser() {
		   System.out.println(userName + " is allowed to acess dashboard");
	   }
}
