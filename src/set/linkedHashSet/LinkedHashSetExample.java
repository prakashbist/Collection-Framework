package set.linkedHashSet;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetExample {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> set1=new LinkedHashSet<Integer>();//create linkedhash set
		set1.addAll(Arrays.asList(1,3,5,7,9,2,4,6,8));//put array to list and list to set 
		System.out.println(set1);
		
		System.out.println("************************");
		
		List<Integer> nos=Arrays.asList(1,3,5,7,9,2,4,6,8);//put arry in list
		Set<Integer> set2 =new TreeSet<>();//create treeset
		set2.addAll(nos);//add list in set
		System.out.println(set2);
		
	}

}
