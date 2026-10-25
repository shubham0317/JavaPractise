package day34.kodewala.polymorphism2;

public class Client {

	public static void main(String[] args) {
		
		Flight f = new Flight();
		
        InfrequentTraveller p1 =  new InfrequentTraveller();
		f.userFlying(p1);
		
		
		FrequentTraveller p2 = new FrequentTraveller();
		f.userFlying(p2);
		
		WeekendTraveller p3 = new WeekendTraveller();
		f.userFlying(p3);
		
	}
}
