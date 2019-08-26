package com.geektime.lss.study.exception;

import java.util.Scanner;

public class Demo08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int age = 0;
		boolean success = false;

		do{

			try {
				System.out.println("请输入年龄：");
				age = sc.nextInt();
				success = true;
				Person p = new Person("你", age);
			} catch (java.util.InputMismatchException e) {
//				sc.next();
				sc.nextLine();
				success = false;
			}catch (Exception e) {
				e.printStackTrace();
				System.out.println("年龄不合法");
				success = false;
			}

		}while(!success);


		System.out.println("你的年龄为：" + age);
		
		
	}
	
}
