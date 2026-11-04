package kodewala.markerInterface.day42;

public class DataCleaner{

	public void clean(Object obj) {
		
		if (obj instanceof Cleanable) {
			System.out.println("Allowed to perform data cleaning activity");
		}
		else {
			System.out.println("Not Allowed to perform data cleaning activity");
		}
		
	}
}
