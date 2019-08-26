package com.geektime.lss.study.list;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Demo08 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();

		map.put("4", "sda");
		map.put("3", "asd");
		map.put("5", "sda");
		map.put("5", "svc");
		
		
		// 1.
		for(Map.Entry<String, String> entry : map.entrySet()){
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}
		
		// 2.


//		for(String k : map.keySet()){
//			System.out.println(k);
//		}

//		for(String v : map.values()){
//			System.out.println(v);
//		}
		
		// 3.
		
		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
		
		while(it.hasNext()){
			Map.Entry<String, String> entry = it.next();
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}
		
		
		
		
		// 4. 
//		for(String k : map.keySet()){
//			String v = map.get(k);
//			System.out.println(k + "->" + v);
//		}

	}
}
