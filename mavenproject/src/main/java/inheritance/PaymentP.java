package inheritance;

import java.util.Scanner;

public class PaymentP {
	/*double basicPay = 20000;
	double bonus = 5000;		
	double deduction = 1500;*/
	
	double basicPay, bonus, deduction;
	
	void getInput() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter basic pay: ");
		basicPay = sc.nextDouble();
		System.out.println("Enter bonus: ");
		bonus = sc.nextDouble();
		System.out.println("Enter deduction: ");
		deduction = sc.nextDouble();
	}
}
