package kodewala.functionalInterface.referance.day42;

@FunctionalInterface
public interface Calculator {

	int calculate(int a, int b);
	public static int add(int a, int b) {
	    return a + b;
	}
}


