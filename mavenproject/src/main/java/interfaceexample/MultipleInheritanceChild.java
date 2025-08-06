package interfaceexample;

public class MultipleInheritanceChild implements MultipleInheritParent1,MultipleInheritanceParent2 {
	
	

	public static void main(String[] args) {
		/*MultipleInheritParent1 obj = new MultipleInheritanceChild();
		obj.singing();
		MultipleInheritanceParent2 obj1 = new MultipleInheritanceChild();
		obj1.dancing();
		MultipleInheritanceChild obj2 = new MultipleInheritanceChild();
		obj2.drawing(); if reference is created for each parent method and  child object for accessing child method */
		
		MultipleInheritanceChild obj = new MultipleInheritanceChild();
		obj.singing();
		obj.dancing();
		obj.drawing();

	}

	@Override
	public void dancing() {
		System.out.println("Dancing method from Parent 2");
		
	}

	@Override
	public void singing() {
		System.out.println("Singing method from Parent 1");
		
	}
	
	public void drawing() {
		System.out.println("Child method");
	}

}
