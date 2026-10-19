package foodorderwebsite.initial;

abstract public class User {

	private String userId;
	private String name;
	private String email;
	public User(String userId, String name, String email) {
		this.userId = userId;
		this.name = name;
		this.email = email;
	}
	
	public void displayDetails() {
		System.out.println(" User Name: " + name);
		System.out.println(" User Id: " + userId);
		System.out.println(" User Email: " + email);
	}
	
	public abstract void showRole();
	
}





