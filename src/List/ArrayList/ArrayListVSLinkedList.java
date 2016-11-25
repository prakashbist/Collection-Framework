package List.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVSLinkedList {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		
		doTiming("ArrayList",arrayList);
		doTiming("LinkedList",linkedList);
		
	}
	
	private static void doTiming(String type, List<Integer> list){
		
		long start1=System.currentTimeMillis();
		
		for(int i=0;i<1E5;i++){
			//Adding items at the end of the list
			  list.add(i);
			//Adding items at elsewhere in the list
			 //list.add(0,i);
			//Adding items 100 elements form the end of the list
			//list.add(list.size()-5,i);
			
		}
		long end1=System.currentTimeMillis();
		
		System.out.println("Time taken:" +(end1-start1)+ "ms for "+type);
		
				
		
	}
	

}
