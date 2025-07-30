package abstraction;

public class AbstractChild1 extends AbstarctParent1 {

	public static void main(String[] args) {
		AbstarctParent1 obj = new AbstractChild1();
		obj.display();
		//obj.show(); child methods can't be accessed using reference, it can be accessed only via child object 

	}

	@Override
	public void display() {
		System.out.println("Creating reference instaed of child obj..");
		
	}
	
	public void show() {
		System.out.println("Child class method..");
	}

}
