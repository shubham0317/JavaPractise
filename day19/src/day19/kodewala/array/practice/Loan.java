package day19.kodewala.array.practice;

public class Loan {

	private String customerName;
	private String loanId;
	private double loanAmount;
	private int creditScore;
	private String loanStatus;
	public Loan(String customerName, String loanId, double loanAmount, int creditScore, String loanStatus) {
		super();
		this.customerName = customerName;
		this.loanId = loanId;
		this.loanAmount = loanAmount;
		this.creditScore = creditScore;
		this.loanStatus = loanStatus;
	}
	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getLoanId() {
		return loanId;
	}
	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
	public String getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
	
	public void displayCreditScore() {
		System.out.println(customerName + " Credit Score is :" + creditScore);
	}
	
	public void displayStatus() {
		System.out.println(customerName + " Loan Application is: " + loanStatus );
	}
	
	
	
}
