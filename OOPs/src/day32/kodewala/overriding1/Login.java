package day32.kodewala.overriding1;

public class Login {

	
	public void doLogin(String mobile, int otp) {
		System.out.println(" Login successful using mobile number and otp");
	}
	
   public void doLogin(String email,  String password) {
	   System.out.println(" Login successful using email  and passsword");
	}
   
   public void doLogin(String gmail) {
	   System.out.println(" Login successful using gmail account");
	}
	
}
