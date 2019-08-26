package com.geektime.lss.study.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

// 通过反射获得字段
public class Demo02 {

	public static void main(String[] args) {
		Class<?> c1 = Student.class;

		// 获得所有的字段
		Field[] fields = c1.getFields();

		// 打印所有字段信息
		for(int i = 0; i < fields.length ; i++){
			String modi = Modifier.toString(fields[i].getModifiers());
			System.out.println(modi + " " + fields[i].getType().getSimpleName() + " " + fields[i].getName());
		}

		System.out.println("---------------------------------------------");

		// 获得所有的字段
		Field[] fields2 = c1.getDeclaredFields();

		// 打印所有字段信息
		for(int i = 0; i < fields2.length ; i++){
			String modi = Modifier.toString(fields2[i].getModifiers());
			System.out.println(modi + " " + fields2[i].getType().getSimpleName() + " " + fields2[i].getName());
		}


	}

}
