package day19.kodewala.array.practice;

public class LoanMain {

	public static void main(String[] args) {
		
		Loan l1 = new Loan("Shubham","L123",50000, 809,"APPROVED");
		Loan l2 = new Loan("Amitesh","L124",60000, 800,"APPROVED");
		Loan l3 = new Loan("Vikas","L154",80000, 600,"PENDING");
		Loan l4 = new Loan("Pratik","L127",70000, 550,"PENDING");
		
		Loan loans[] = new Loan[4];
		
		loans[0] = l1;
		loans[1] = l2;
		loans[2] = l3;
		loans[3] = l4;
		
		int totalLoanAmount = 0;
	     
		for(int i = 0; i < loans.length; i++) {
			if(loans[i].getCreditScore() >= 750) {
				loans[i].displayCreditScore();
			}
			if(loans[i].getLoanStatus().equals("APPROVED")) {
				totalLoanAmount += loans[i].getLoanAmount();
			}
			
			
		}
		System.out.println("Total Loan Aproved by bank is: " + totalLoanAmount);
		
	}
	
	
}
