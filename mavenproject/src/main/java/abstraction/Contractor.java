package abstraction;

import java.util.Scanner;

public class Contractor extends Employee {
	int workHour;
	
	public void enterHours() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the working hours: ");
		workHour = sc.nextInt();
	}

	@Override
	public void calculateSalary() {
		double salary = workHour * paymentPerHour;
		System.out.println("Contractor Salary: "+salary);
		
	}
	
}
