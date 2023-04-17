package assignment2;

class CreditScore{
	private int creditHistory;
	private double creditUtilization;
	private boolean paymentHistory;
	private double creditScore;
	
	public CreditScore() {
		this.creditHistory= 10;
		this.creditUtilization= 32;
		this.paymentHistory=true;
	}
	
	public void findCreditScore()
	{
		if(paymentHistory==true)
		{
			creditScore = (creditHistory * 15) + (int)(creditUtilization * 30) + 55;
		}
		else {
			creditScore = (creditHistory * 15) + (int)(creditUtilization * 30) + 35;
		}
		
		System.out.println("Your Credit Score: " + creditScore);
	}
}

public class Ques10 {

	public static void main(String[] args) {
		CreditScore credit = new CreditScore();
		credit.findCreditScore();
	}
}