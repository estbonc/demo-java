package com.geektime.lss.study.exception;

import java.util.Scanner;

public class Demo04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入两个数：");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		try {
			// 可能出现问题的代码段
			int res = num1 / num2;	// 1
			String s = null;
			int[] arr = {1};
//			System.out.println(arr[1]);		// 2
//			System.out.println(s.substring(0));	// 3
			System.out.println("两数相除结果为：" + res);
			return;
		} catch (ArithmeticException e) {
			// 出现问题之后，执行的代码段
			System.out.println("除数不能为0！");
		} catch (NullPointerException e) {
			System.out.println("空指针异常！");
		} catch (RuntimeException e) {
			System.out.println("发生了运行时异常");
		} finally {
			// 无论有没有出现问题，都会执行的代码段
			System.out.println("最终执行。");
		}

		System.out.println("我也是最终执行");
	}

}
