package superkeyword;

public class SuperVariableC extends SuperVariable{
	String color = "Blue";

	public static void main(String[] args) {
		SuperVariableC obj = new SuperVariableC();
		obj.colorPrint();

	}
	
	public void colorPrint() {
		System.out.println(color);
		System.out.println(super.color);

	}

}
