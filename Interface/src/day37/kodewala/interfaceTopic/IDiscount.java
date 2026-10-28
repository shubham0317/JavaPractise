package day37.kodewala.interfaceTopic;


//java version 1.7 , 7 or before
public interface IDiscount {

	//By default it is public static final means --> its constant only // so we can't add variable in interface
	int MAX_VALUE = 100;
	
	//by default it is public abstract even though i don't write
	public abstract int calculateDiscount(int amount , int rate);
	
	public abstract void calculateDiscountTax(int tax);
	
	public abstract void calculateDiscountTax(int tax, String type);
}
