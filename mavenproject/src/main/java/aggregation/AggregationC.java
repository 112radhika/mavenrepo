package aggregation;

public class AggregationC {
	
	String name;
	AggregationP obj;
	
	AggregationC(String n, AggregationP ob){
		this.name = n;
		this.obj = ob;
		
	}
	void display() {
		System.out.println(name);
		obj.print();

	}

	public static void main(String[] args) {
		AggregationP objParent = new AggregationP(30,"test@gmail.com");
		AggregationC objChild = new AggregationC("Radhika",objParent );
		objChild.display();
	}

}
