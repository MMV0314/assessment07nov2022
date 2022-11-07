package com.pack;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ReverseOrderTreeset {

	public static void main(String[] args) {
		TreeSet<String> treeset = new TreeSet<String>();
		treeset.add("1");
		treeset.add("2");
		treeset.add("56");
		treeset.add("45");
		treeset.add("23");
		
		Iterator<String> itr=Set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		System.out.println("treeset is:" +treeset);
		TreeSet<String> treeset2 = (TreeSet<String>)treeset.descendingSet();

	}

}
