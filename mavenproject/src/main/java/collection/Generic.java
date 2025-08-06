package collection;

import java.util.*;

public class Generic {

	public static void main(String[] args) {
		
		//List<String>s = new ArrayList<String>(); // Commonly used
		//ArrayList<String>s = new ArrayList<String>();
		LinkedList<String>s = new LinkedList<String>(); //ArrayList can also be used
		s.add("Red");
		s.add("Green");
		s.add("Blue");
		s.add("Yellow");
		System.out.println(s);
		
		Set<Integer>s1 = new TreeSet<Integer>(); //HashSet can also be used
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(9);
		s1.add(10);
		System.out.println(s1);


	}

}
