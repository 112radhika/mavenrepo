package polymorphism;

public class PolyChild extends PolyParent{
	
	void sum(int a, int b) {
		super.sum(2, 3);
		int c = a-b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		PolyChild obj = new PolyChild();
		obj.sum(20, 10);

	}

}
