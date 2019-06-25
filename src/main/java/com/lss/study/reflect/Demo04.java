package com.lss.study.reflect;

import java.lang.reflect.Field;

public class Demo04 {

	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("com.lss.study.reflect.Student");
			// 通过反射的方式，构造一个类的对象(调用的是无参构造)
			Object student = c.newInstance();

			// 拿出 name 这个字段
			Field name = c.getField("name");

			// 修改 student 对象中的 name 字段
			name.set(student, "张三");

			// 取出这个字段并打印
			Object obj = name.get(student);
			System.out.println(obj);

			// 设置 age 字段
			Field age = c.getField("age");
			age.set(student, 18);

			// 设置 私有 money 字段
			Field money = c.getDeclaredField("age");
			// 设置访问权限为允许访问
			money.setAccessible(true);
			money.set(student, 500);
			System.out.println(money.get(student));


		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}

	}

}
