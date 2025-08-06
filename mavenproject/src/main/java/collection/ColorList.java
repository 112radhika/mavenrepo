package collection;

import java.util.ArrayList;
import java.util.*;

public class ColorList {

	public static void main(String[] args) {
		
		List<String> color = new ArrayList<String>();
		//1. add() - used to add elements into the array list
		color.add("Red");
		color.add("Blue");
		color.add("Green");
		color.add("Black");
		System.out.println(color);
		
		//[Red, Blue, Green, Black]
		
		//2. get() - used to get elements of particular index
		color.get(2);
		System.out.println(color.get(2)); // Green is o/p
		
		//3. remove() - used to remove the element of particular index
		System.out.println(color.remove(2)); // to see which element got removed
		
		//4. set() - replace the element of particular index
		color.set(0, "White");
		System.out.println(color); //[White, Blue, Black] is new list
		
		//Add a duplicate color again. List allows duplicate
		color.add("White");
		System.out.println(color); // [White, Blue, Black, White]
		
		//5. indexOf() - Only first element index will be returned if there are duplicates
		System.out.println(color.indexOf("White"));
		
		//6. lastIndexOf() - Only last element index will be returned if there are duplicates
		System.out.println(color.lastIndexOf("White")); 
		
		//7. contains() - to check if an element is present in the list. true/false will be result
		System.out.println(color.contains("White"));
		System.out.println(color.contains("Green"));
		
		//8. isEmpty() - to check if list is empty or not
		List<String> color1 = new ArrayList<String>();
		System.out.println(color.isEmpty()); // false
		System.out.println(color1.isEmpty()); // true
		
		//9. size() - to get the size of list
		System.out.println(color.size()); // 4
		System.out.println(color1.size()); // 0
		
		//10. clear() - 
		List<String> color2 = new ArrayList<String>();
		color2.add("Violet");
		color2.add("Indigo");
		System.out.println(color2); // [Violet, Indigo]
		color2.clear();
		System.out.println(color2); // []
		

		
		
		
		



	}

}
