package abstraction;

public abstract class AbstractParent {
	
	public abstract void display();

	public abstract void multiply(int x, int y);
	
	public void sum(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}

}