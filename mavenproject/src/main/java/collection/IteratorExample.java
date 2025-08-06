package collection;

import java.util.HashSet;
import java.util.*;

public class IteratorExample {

	public static void main(String[] args) {
		
		Set<String> name = new HashSet<String>();
		name.add("Dev");
		name.add("Anu");
		name.add("Manu");
		name.add("Ram");
		System.out.println(name);
		
		/*Iterator<String> i = name.iterator(); //sub of Iterator - hasNext(), next(), remove()
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		i.remove();
		System.out.println(name);*/
		
		for(String j:name) {
			System.out.println(j);
		}
		
	}

}
