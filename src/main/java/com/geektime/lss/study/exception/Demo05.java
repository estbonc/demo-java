package com.geektime.lss.study.exception;

public class Demo05 {

	public static void main(String[] args) {
		try {
			int[] arr = {1};
			System.out.println(arr[1]);

		} catch (NullPointerException e) {
			System.out.println("空指针");
		} finally {
			System.out.println("最终执行。");
		}
		System.out.println("程序正常结束");
	}
	
}
