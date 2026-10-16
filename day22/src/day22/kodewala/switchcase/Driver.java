package day22.kodewala.switchcase;

public class Driver {

	public static void main(String[] args) {
		Driver driver = new Driver();
		int day = Integer.parseInt(args[0]);
		driver.identifyDay(day);
	}

	public void identifyDay(int numbers) {
		switch (numbers) {
		case 1:
			System.out.println("MON");
			break;

		case 2:
			System.out.println("TUE");
			break;

		case 3:
			System.out.println("WED");
			break;

		case 4:
			System.out.println("THU");
			break;

		case 5:
			System.out.println("FRI");
			break;

		case 6:
			System.out.println("SAT");
			break;

		case 7:
			System.out.println("SUN");
			break;

		default:
			System.out.println("Invalid day please enter valid day between[1 -7]");
			break;

		}

	}

}
