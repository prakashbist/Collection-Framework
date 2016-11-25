package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapOne {

	// HashMap do not maintain order
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(4, "four");
		map.put(3, "three");
		map.put(1, "one");
		map.put(2, "two");
		map.put(4, "overrided four");

		System.out.println(map.get(4));

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ":" + value);
		}

	}
}
