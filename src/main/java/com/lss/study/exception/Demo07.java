package com.lss.study.exception;

public class Demo07 {

	public static void main(String[] args) {
		
		System.out.println(test());
	}
	
	
	private static int test(){
		int a = 0;
		try {
			int[] arr = {1};
			System.out.println(arr[1]);
			return ++a;
		} catch (Exception e) {
			return ++a;
		} finally {
			return ++a;
		}
		
	}
	
}
