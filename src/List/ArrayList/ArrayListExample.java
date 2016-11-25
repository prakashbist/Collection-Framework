package List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	public static void main(String[] args) {
		
		ArrayList<String> countryList = new ArrayList<>();
		
		countryList.add("Nepal");
		countryList.add("China");
		countryList.add("India");
		countryList.add("Nepal");
		
		//Now to traverse in the country list element (using iterator method)
		
		Iterator<String> iterator = countryList.iterator();
		while(iterator.hasNext()){
			String country= iterator.next();
			System.out.println(country);
			if(country.equals("Japan")){
				iterator.remove();
			}
		}
		
		
		//remove element by index
		countryList.remove(3);
		System.out.println(countryList);
		
		//for display using for each loop
		for( String country:countryList){
			System.out.println(country);
		}
		
		
	}

}
