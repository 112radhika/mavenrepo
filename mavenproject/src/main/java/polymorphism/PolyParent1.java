package polymorphism;

public class PolyParent1 {
	
	void calculation(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	
	void calculation(int a) {
		this.calculation(10, 20);
		int c = a*a;
		System.out.println(c);
	}

}
