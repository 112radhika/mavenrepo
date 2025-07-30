package abstraction;

public class AbstractChild extends AbstractParent{

	public static void main(String[] args) {
		AbstractChild obj = new AbstractChild();
		obj.display();
		obj.sum(10, 20);
		obj.multiply(2, 3);
		obj.area(10);

	}

	@Override //annotation
	public void display() {
		System.out.println("Abstract method from parent..");
		
	}

	@Override
	public void multiply(int x, int y) {
		int z = x*y;
		System.out.println(z);

	}
	
	public void area(int x) {
		
		int area = x*x;
		System.out.println(area);
		
	}
	
	

}
