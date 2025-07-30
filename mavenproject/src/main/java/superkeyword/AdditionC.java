package superkeyword;

public class AdditionC extends AdditionP{

	public static void main(String[] args) {
		AdditionC obj = new AdditionC();
		obj.division();

	}
	
	public void division() {
		int c = super.sum(11, 20);
		if(c%10 == 0) {
			System.out.println("Divisible by 10");
		}
		else {
			System.out.println("Not divisible by 10");
		}
	}

}
