package com.pack;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetToArrayList {

	public static void main(String[] args) {
		HashSet<Integer> hashset = new HashSet<Integer>();
		hashset.add("78");
		hashset.add("23");
		hashset.add("56");
		
		Iterator itr = hashset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());	
		
	}

}
}
