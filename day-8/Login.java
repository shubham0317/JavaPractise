class Login {

   public static void main(String[] args) {
   
     String userInputName = args[0];
	 String userInputpassword = args[1];
     String username = "Shubham";
	 String password = "12345";
	 
	 if(username.equals(userInputName)  && password.equals(userInputpassword)){
	      System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Credentials");
        }
   
   }

 
}