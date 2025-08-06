package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.*; //imports everything in java.util package

public class NonGeneric {

	public static void main(String[] args) {
		
		//add() - used to add elements into list or set
		ArrayList s = new ArrayList(); //LinkedList can also be used
		s.add("Hello");
		s.add(5);
		s.add(10.5f);
		s.add('a');
		s.add(false);
		System.out.println(s);
		
		
		HashSet s1 = new HashSet(); //TreeSet cannot be given in this way
		s1.add("Hello");
		s1.add(5);
		s1.add(10.5f);
		s1.add('a');
		s1.add(false);
		System.out.println(s1);
		

	}

}
