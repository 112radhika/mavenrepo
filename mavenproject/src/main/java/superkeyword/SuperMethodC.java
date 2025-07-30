package superkeyword;

public class SuperMethodC extends SuperMethod{

	public static void main(String[] args) {
		
		SuperMethodC obj = new SuperMethodC();
		obj.display();
	}
	
	public void display() {
		System.out.println("Hello");
		super.sum(10,20);
	}

}
