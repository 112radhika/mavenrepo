package interfaceexample;

public class Interface2 implements Interface1 {
	public void sum() {
		System.out.println("Hello ..sum method from interface1");
	}
	
	public void display() {
		System.out.println("Hello ..display method from interface1");
	}

	public static void main(String[] args) {
		//Interface2 obj = new Interface2();
		Interface1 obj = new Interface2();
		obj.sum();
		obj.display();
		

	}

}
