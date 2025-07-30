package inheritance;

public class TotalSalary extends HraPfCalculation{

	public static void main(String[] args) {
		TotalSalary obj = new TotalSalary();
		obj.getInput();
		obj.calculation();
		obj.totalSalaryCal();

	}
	
	public void totalSalaryCal() {
		double total = basicPay + hra + bonus - pf - deduction;
		System.out.println("Salary Slip");
		System.out.println("******************");
		System.out.print("Basic pay: "+basicPay+"\n"+"HRA: "+hra+"\n"+"Bonus: "+bonus+"	\n"
		+"Deduction: "+deduction+"\n"+"PF: "+pf+"\n"+"Total Salary: "+total);
	}

}
