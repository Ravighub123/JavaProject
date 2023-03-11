package Collections;

import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Naina");
		set1.add("Jake");
		set1.add("Lily");
		set1.add("Naina");
		set1.add(null);
		System.out.println("the set is "+set1);
		
		TreeSet<String> set2 = new TreeSet<String>();
		
		set2.add("lenovo");
		set2.add("HP");
		set2.add("Acer");
		
		System.out.println("the treeset is "+set2);
	}

}
