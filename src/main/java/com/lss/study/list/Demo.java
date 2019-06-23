package com.lss.study.list;

public class Demo {

	public static void main(String[] args) {
		
		
		List<String> list = new LinkList<String>();
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		
		list.remove(2);
		
		for(int i = 0; i < list.size() ; i++){
			System.out.println(list.get(i));
		}
		
		
	}
	
}
