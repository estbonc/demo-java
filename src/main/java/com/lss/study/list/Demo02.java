package com.lss.study.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Demo02 {

	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<String>();
		
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("5");
		
		
		Iterator it = set.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
	
}
