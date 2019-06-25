package com.lss.study.list;

import java.util.LinkedList;
import java.util.List;

public class Demo01 {

	public static void main(String[] args) {
		List list = new LinkedList();
		list.add(3);
		list.add(3.14);
		list.add("hello");
		list.add(true);

		System.out.println(list.get(1));
		
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
		
	}
	
}
