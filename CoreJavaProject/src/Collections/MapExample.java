package Collections;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap <String,Integer> basket =new HashMap<String,Integer>();
		basket.put("Item1",1);
		basket.put("Item2",5);
		basket.put("Item3", 2);
		basket.put("Item4", 2);
		System.out.println("The map is"+basket);
		basket.put("Item3", 4);
		System.out.println("The map is"+basket);
	
		basket.remove("Item2");
		System.out.println("The map is"+basket);
		
		basket.put("Item5", null);
		System.out.println("The map is"+basket);
		basket.put("null",4);
		System.out.println("The map is"+basket);
	/*	for(String item:basket.keySet()) {
			
			System.out.println("Item name is"+item);
			System.out.println("Item Quantity is "+basket.get(item));
	}*/
			
			for (Integer val: basket.values())
			{
				System.out.println("The value is "+ val);
			}
			
		
	}
	

}
