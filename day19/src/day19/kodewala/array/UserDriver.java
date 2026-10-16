package day19.kodewala.array;

import java.util.Arrays;

public class UserDriver {

	public static void main(String[] args) {
		User user1 = new User("Kodewala", "7845123691");
		User user2 = new User("Varun", "7145278362");
		User user3 = new User("Pratik", "7845123694");
		User user4 = new User("vika", "7845123000");
		User user5 = new User("Amitesh", "784512241");

		User users[] = new User[5];

		users[0] = user1;
		users[1] = user2;
		users[2] = user3;
		users[3] = user4;
		users[4] = user5;

		System.out.println(Arrays.toString(users));
	}

}
