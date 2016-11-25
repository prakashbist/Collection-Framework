package set.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> name = new HashSet<String>();
		name.add("Prakash");
		name.add("Shyam");
		name.add("Jay");
		name.add("Jay");//will remove


		Iterator<String> itr = name.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		
	}

}
