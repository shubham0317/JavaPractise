package day24.kodewala.string.practise;

public class Practise8 {
	static String changeName(String name) {
	    return name = "Amit";
	}

	public static void main(String[] args) {
	    String name = "Rahul";

	    System.out.println(changeName(name));

	    System.out.println(name);
	}
}
