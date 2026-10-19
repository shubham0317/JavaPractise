package foodorderwebsite.initial;

public class Admin extends User{

	private String adminLevel;

	public Admin(String userId,String name, String email, String adminLevel) {
		super(userId,name,email);
		this.adminLevel = adminLevel;
	}
	
	@Override
	public void displayDetails() {
		super.displayDetails();

        System.out.println("Admin Level "
                + adminLevel);
    
	}
	
	@Override
	public void showRole() {
		System.out.println("Admin");
	};
}
