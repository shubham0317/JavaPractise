package day36.kodewala.revise.polymorphism;

class Delivery {
	public void doDelivery() {
		System.out.println("Delivery.doDelivery....Delivery");
	}
}

class ExpressBee extends Delivery {
	@Override
	public void doDelivery() {
		System.out.println("ExpressBee.doDelivery....ExpressBee");
	}
}

class Ekart extends Delivery {
	@Override
	public void doDelivery() {
		System.out.println("Ekart.doDelivery....Ekart");
	}
}



public class Driver {
public static void main(String[] args) {
	
	Delivery delivery =  new Delivery();
	
	//Compile time --> It will check the method in compile time
	//Runtime --> It will check the method of Delivery class
	delivery.doDelivery();
	
	
	Delivery d1 = (Delivery) new ExpressBee();
	//Compile time --> It will check the method in compile time
	//Runtime --> It will check the method of ExpressBee class
	d1.doDelivery();
	
	Delivery d3  = new ExpressBee();
	ExpressBee eb =  (ExpressBee)d3;
	eb.doDelivery();
	
}
	
}
