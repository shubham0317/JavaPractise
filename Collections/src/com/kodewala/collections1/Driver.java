package com.kodewala.collections1;

public class Driver {
	
	
	public static void main(String[] args) {
		int price [] = {100, 200, 300, 400, 500, 1000, 1500};
		
		
		for (int index = 0 ; index < price.length; index++) {
			
			
			int currentPrice = price[index];
			
			if(currentPrice > 1000) {
				System.out.println(currentPrice);
			}
		}
		
		
	}

	
	
	
	
	
}
