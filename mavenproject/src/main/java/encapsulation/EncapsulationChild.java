package encapsulation;

public class EncapsulationChild {

	public static void main(String[] args) {
		
		EncapsulationParent objParent = new EncapsulationParent();
		objParent.setAge(20);
		System.out.println(objParent.getAge());
		
		objParent.setName("Dev");
		String n = objParent.getName();
		System.out.println(n);

	}

}
