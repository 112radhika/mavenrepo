package superkeyword;

public class SuperConstructorC extends SuperConstructorP{
	
	public SuperConstructorC() {
		super(10, 20);
		System.out.println("Child constructor");
		
	}

	public static void main(String[] args) {
		SuperConstructorC obj = new SuperConstructorC();

	}

}
