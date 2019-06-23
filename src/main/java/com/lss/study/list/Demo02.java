package com.lss.study.list;

public class Demo02 {

	public static void main(String[] args) {
		
		String[] arr = {"1","2","3"};
		List<String> list = new ArrList<String>();
		
		// ���þ�̬���ͷ���
		ArrList.<String>copyArrToList(arr, list);
		
		
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));
		}
		
	}
	
}
