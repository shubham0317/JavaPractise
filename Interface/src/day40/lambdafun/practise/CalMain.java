package day40.lambdafun.practise;

public class CalMain {

	public static void main(String [] args) {
		Calculator cal = (a, b) ->  {
			return a + b;
		};
		// Calculator cal = (a, b) -> a + b;
		
		System.out.println(cal.add(5, 6));
	}
}
