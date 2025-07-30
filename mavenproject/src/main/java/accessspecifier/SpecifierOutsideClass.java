package accessspecifier;

public class SpecifierOutsideClass extends AccessModifier{

	public static void main(String[] args) {
		SpecifierOutsideClass obj = new SpecifierOutsideClass();
		obj.publicAccess();
		obj.protectedAccess();
		obj.defaultAccess();
		//obj.privateAccess(); it will not be visible from outside the class

	}

}
