package com.lss.study.exception;

public class Demo06 {

	public static void main(String[] args) {

		try {
			int[] arr = {1};
			System.out.println(arr[1]);
		} finally {
			System.out.println("最终");
		}

		System.out.println("程序正常结束");
	}
	
}
