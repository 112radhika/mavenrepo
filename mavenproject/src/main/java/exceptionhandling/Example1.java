package exceptionhandling;

public class Example1 {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b= 0;
			int c = a/b;
			System.out.println(c);
		}
		//catch is used to handle the exception
		/*catch(ArithmeticException e) {
			System.out.println("Exception Handled :Division by zero is not possible");
		}*/
		finally {
			int d = 10;
			int e = 5;
			int f = d/e;
			System.out.println(f);
		}

	}	

}
