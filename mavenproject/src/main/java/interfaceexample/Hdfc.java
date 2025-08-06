package interfaceexample;

public class Hdfc implements Rbi {
	
	public void recurringDeposit(double amount, int periodInMonths) {
		
		double interest = amount* (periodInMonths*(periodInMonths+1))/2 * interestRate/(12*100);
		System.out.println("Interest amount is: "+interest);

		double finalAmount = interest + (amount * periodInMonths);
		System.out.println("Final amount is: "+finalAmount);
	}

	public static void main(String[] args) {
		Hdfc obj = new Hdfc();
		obj.recurringDeposit(2000,12);

	}

}
