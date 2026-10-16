package day19.kodewala.array.practice;

public class OrderMain {

	public static void main(String[] args) {
		
		Order order1 = new Order("Rahul", "OD123", "PIZZA", 250,"DELIVERD");
		Order order2 = new Order("Shubham", "OD456", "BURGER", 140,"PENDING");
		Order order3 = new Order("Amitesh", "OD789", "MOMOS", 70,"DELIVERD");
		Order order4 = new Order("Pratik", "OD258", "Kdhai Paneer", 300,"DELIVERD");
		
		Order orders[] = new Order[4];
		
		orders[0] = order1;
		orders[1] = order2;
		orders[2] = order3;
		orders[3] = order4;
		
		int deliverdOrderAmount = 0;
		
		for (int i = 0; i < orders.length; i++) {
			
			
			
			if(orders[i].getStatus().equals("PENDING")) {
				orders[i].displayStatus();
			}
			
			if(orders[i].getStatus().equals("DELIVERD")) {
				deliverdOrderAmount += orders[i].getAmount();
			}
		}
		System.out.println(" Toltal amount of sucessfull order is: " + deliverdOrderAmount);
		
	}
	
}
