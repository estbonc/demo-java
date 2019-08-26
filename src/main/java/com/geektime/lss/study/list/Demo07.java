package com.geektime.lss.study.list;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo07 {

	public static void main(String[] args) {
		
		Map<String, String> map = new LinkedHashMap<String, String>();
		
		map.put("4", "sda");
		map.put("3", "asd");
		map.put("5", "sda");
		map.put("5", "svc");
		
//		System.out.println(map.size());
		
//		System.out.println(map.get("5"));
		
		
//		Set<String> keySet = map.keySet();
//		for(String s : keySet){
//			System.out.println(s);
//		}
		
		for(String k : map.keySet()){
			String v = map.get(k);
			System.out.println(k + "->" + v);
		}
		
		
	}
	
}
