package polymorphism;

public class PolyChild1 extends PolyParent1{
	
	void calcualtion(int a, int b) {
		super.calculation(10);
		int c = a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		PolyChild1 obj = new PolyChild1();
		obj.calcualtion(1, 2);

	}

}
