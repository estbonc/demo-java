package com.lss.study.list;

public class Demo01 {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrList<String>();
//		list.add(100);
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		
		
//		list.remove(2);
		
		for(int i = 0; i < list.size() ; i++){
			String s = list.get(i);
			System.out.println(s);
		}
		
		
	}
	
}
