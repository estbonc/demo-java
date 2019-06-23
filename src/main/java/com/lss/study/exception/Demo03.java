package com.lss.study.exception;

public class Demo03 {

	public static void main(String[] args) {
		
		//test1();
		test2();
		
	}
	
	// StackOverflowError
	private static void test1(){
		int a = 0;
		test1();
	}
	
	// OutOfMemoryError
	private static void test2(){
		while(true){
			int[][][] arr = new int[1024][1024][1024];
		}
	}
	
}
