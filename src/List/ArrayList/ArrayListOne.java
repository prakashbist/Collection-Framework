package List.ArrayList;

import java.util.ArrayList;


public class ArrayListOne {
	
	
public static void main(String[] args) {
	
	//Create ArrayList
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	
	//Add numbers on ArrayList
	numbers.add(10);
	numbers.add(39);
	numbers.add(34);
	numbers.add(34);
	
	//Retrieve ArrayList
	System.out.println("Number on index 0 is: "+numbers.get(0));
	
	//Indexed for loop iteration
	System.out.println("All items added are: ");
	for(int i=0;i<numbers.size();i++){
		System.out.println("S["+i+"]:"+numbers.get(i));
		
	}
	
	//Remove
	numbers.remove(numbers.size()-1);
	numbers.remove(0);
	//Indexed for loop iteration
	System.out.println("After removing items. By foreach loop");
	for (Integer num : numbers) {
		System.out.println(num);
	}
	
	
	
}

}
