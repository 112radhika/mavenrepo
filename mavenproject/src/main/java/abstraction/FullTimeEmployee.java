package abstraction;

public class FullTimeEmployee extends Employee {
	
	@Override
	public void calculateSalary() {
		double salary = 8 * paymentPerHour;
		System.out.println("Full time Employee Salary: "+salary);
		
	}

	public static void main(String[] args) {
		Contractor objContr = new Contractor();
		objContr.enterHours();
		objContr.calculateSalary();
		FullTimeEmployee objFull = new FullTimeEmployee();
		objFull.calculateSalary();
		
	}

}
