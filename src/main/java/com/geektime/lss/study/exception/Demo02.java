package com.geektime.lss.study.exception;

public class Demo02 {

	public static void main(String[] args) {
		test02();

	}

	// ArithmeticException
	private static void test01(){
		int a = 5;
		int b = 0;

		System.out.println(a/b);
	}

	// 数组下标越界 ArrayIndexOutOfBoundsException:
	private static void test02(){
		int[] arr = {1,2,3};
		System.out.println(arr[3]);
	}

	// 空指针异常 NullPointerException
	private static void test03(){
		String s = null;
		System.out.println(s.substring(0)
				.substring(0)
				.substring(0));
	}
}
