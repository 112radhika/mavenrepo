package exceptionhandling;

public class Example2 {
	
	public static void division(int a, int b) throws ArithmeticException
	{
		if(b==0) {
			//System.out.println("Invalid condition");
			throw new ArithmeticException("invalid!");
		}
		else {
			int c = a/b;
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		try {
			Example2.division(10,0);
		}
		catch(ArithmeticException e) {
			
		}

	}

}
