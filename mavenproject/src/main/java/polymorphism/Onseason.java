package polymorphism;

public class Onseason extends Offseason {
	
	void discount(double amount) {
		super.discount(1000);
		double finalAmount = amount - amount * .4;
		System.out.println("Onseason final amount is: "+finalAmount);
	}

	public static void main(String[] args) {
		Onseason obj = new Onseason();
		obj.discount(1000);

	}

}
