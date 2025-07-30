package encapsulation;

public class EncapsulationChild1 {

	public static void main(String[] args) {
		EncapsulationParent1 objParent = new EncapsulationParent1();
		objParent.setSubject("English");
		System.out.println(objParent.getSubject());
		
		objParent.setMark(45);
		System.out.println(objParent.getMark());

	}

}
