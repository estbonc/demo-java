package com.geektime.lss.study.reflect;

public class Student {

	public String name;
	public int age;

	private int money;
	public static int test;


	public void introduce(){
		System.out.println("我叫" + name + " 今年  "  + age + " 岁 ");
	}

	public void say(String str){
		System.out.println(str);
	}

	public static int add(int num1, int num2){
		return num1 + num2;
	}

	private void play(){
		System.out.println(name + " 在玩王者");
	}

}
