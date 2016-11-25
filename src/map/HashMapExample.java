package map;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(12, "Spring Framework");
		hmap.put(2, "Groovy Framework");
		hmap.put(5, "Collection Framework");
		hmap.put(4,"Java EE ");
		hmap.put(7, "Christanio Ronaldo");
		
		System.out.println(hmap);// print all
		
		String var =hmap.get(2);
		System.out.println(var);// print value of index 2
		
		hmap.remove(2);//remove the value of index 2
		System.out.println(hmap);//print all after removing the value of index 2
		
		System.out.println("****************************");
		
		
		
		
		
		
		
	}	
}		
		