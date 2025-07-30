package accessspecifier;

public class AccessModifier {
	
	public void publicAccess() {
		System.out.println("This is a public method..");
	}
	
	private void privateAccess() {
		System.out.println("This is a private method..");
	}
	
	protected void protectedAccess() {
		System.out.println("This is a protected method..");
	}
	
	void defaultAccess() {
		System.out.println("This is a public method..");
	}
	

	public static void main(String[] args) {
		
		AccessModifier obj = new AccessModifier();
		obj.publicAccess();
		obj.privateAccess();
		obj.protectedAccess();
		obj.defaultAccess();

	}

}
