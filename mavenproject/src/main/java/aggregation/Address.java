package aggregation;

public class Address {
	
	String address;
	Student obj;
	
	Address(String address, Student obj){
		this.address = address;
		this.obj = obj;
		System.out.println(address);
	}

	public static void main(String[] args) {
		Student obj1 = new Student("Radhika",23);
		Address obj2 = new Address("Kayamkulam Alappuzha 690533",obj1);

	}

}
