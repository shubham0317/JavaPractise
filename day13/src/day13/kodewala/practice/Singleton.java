package day13.kodewala.practice;

public class Singleton {
	
	private static Singleton instance;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		
		if(instance == null) {
			instance = new Singleton();
			System.out.println(" new instance");
		}
		
		return instance;
	}
	
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		Singleton d = Singleton.getInstance();
		
		
		System.out.println(s == d);
	}

}
