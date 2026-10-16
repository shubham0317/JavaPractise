package day19.kodewala.array;

public class CreateAccount {
	
	public static void main(String[] args) {
		
		SBI user1 = new SBI("Varun", 3000, "5240145322");
		SBI user2 = new SBI("Pratik", 3500, "9830145322");
		SBI user3 = new SBI("Shubham", 1999, "67440145322");
		
		
		SBI users [] = new SBI[3];
		
		users[0] = user1;
		users[1] = user2;
		users[2] = user3;
		
		for(int i = 0; i < users.length; i++) {
			if(users[i].getBalance() < 2000) {
				users[i].displayUser();
			}
		}
		
	}

}
