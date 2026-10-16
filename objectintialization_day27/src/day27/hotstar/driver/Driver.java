package day27.hotstar.driver;

import day27.hotstar.user.User;

public class Driver {
    
	public static void main(String[] args) {
		
		for(int  i = 0; i < 100; i++) {
			User user =  new User("Us1", "Shubham", "Premium User");
		}
		
		System.out.println(" Total number of live users are: " + User.liveUserCount);
		
	}
	
}
