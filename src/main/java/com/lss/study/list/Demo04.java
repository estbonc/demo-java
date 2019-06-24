package com.lss.study.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo04 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(9);
		list.add(4);
		list.add(8);
		list.add(7);
		list.add(5);
		list.add(6);
		list.add(10);
		list.add(2);
		list.add(1);
		
		Collections.sort(list);
		Collections.reverse(list);
//		Collections.shuffle(list);
		
		for(int i : list){
			System.out.println(i);
		}
	}
}
