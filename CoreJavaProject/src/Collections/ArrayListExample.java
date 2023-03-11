package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = { "Priya", "Ravi" };
		System.out.println("Thes econd name is " + names[1]);

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Galaxy");
		list1.add("Samsung");
		list1.add("Samsung");
		list1.add("iPhone");
		list1.add("iPhone");
		list1.add("");
		System.out.println("the list is " + list1);
		System.out.println("the size of the list is " + list1.size());
		System.out.println("the second element of the list is " + list1.get(1));
		System.out.println("the last element of the list is " + list1.get(list1.size() - 1));
		list1.add(1, "realme");
		System.out.println("after adding the list is " + list1);
		list1.set(1, "oneplus");
		System.out.println("after updting the list is " + list1);
		list1.remove(2);
		System.out.println("after updting the list is " + list1);

		for (int i = 0; i < list1.size(); i++) {
			System.out.println("element is " + list1.get(i));
		}

		for (String value : list1) {
			System.out.println("element value is " + value);
		}

		Iterator<String> itr = list1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		Collections.sort(list1);
		System.out.println("After sorting the list " + list1);
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println("After sorting in descending  order " + list1);
	}

}
