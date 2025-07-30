package encapsulation;

import java.util.Scanner;

public class User {
	
	int pin;
	public void enterPin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your pin");
		pin = sc.nextInt();
	}

	public static void main(String[] args) {
		User objUser = new User();
		objUser.enterPin();
		Bank objBank = new Bank();
		objBank.setPin(objUser.pin);
		objBank.validatePin();
		objBank.getPin();

	}

}
