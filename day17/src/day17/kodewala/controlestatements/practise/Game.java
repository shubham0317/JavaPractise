package day17.kodewala.controlestatements.practise;

public class Game {
	
	public static void main(String[] args) {
	int level = 15;
	boolean premium = true;

	if (level < 1) {
	    System.out.println("Invalid level");
	} 
	else if (level >= 10 && premium) {
	    System.out.println("Boss Level Unlocked!");
	} 
	else if (level >= 10) {
	    System.out.println("Upgrade to Premium");
	} 
	else {
	    System.out.println("Keep Playing!");
	}
	}
	
}
