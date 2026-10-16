package day15.kodewala.constructor3;

class SuperUser{
	
}

public class User extends SuperUser {
	
	String userName;
	String userId;
	String mobile;
	
	
	User(String _userName, String _userId, String _mobile) {
		this(300);
		this.userId = _userId;
		this.userName = _userName;
		this.mobile = _mobile;
	}
	
	User(int age) {
		System.out.println("User() no args :");
	}
	

}
