package accessspecifieroutsidepackage;

import accessspecifier.AccessModifier;

public class AccessSpecifierPackageOutside extends AccessModifier {

	public static void main(String[] args) {
		AccessSpecifierPackageOutside obj = new AccessSpecifierPackageOutside();
		obj.publicAccess();
		obj.protectedAccess();
		//obj.privateAccess(); cannot be accessed outside package
		//obj.defaultAccess(); cannot be accessed outside package
		
		AccessModifier obj1 = new AccessModifier();
		obj1.publicAccess();
		//obj1.protectedAccess(); It can be accessed only via child class object

	}

}
