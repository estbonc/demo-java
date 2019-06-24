package com.lss.study.reflect;

import java.lang.reflect.Constructor;

// 尝试用反射破坏单例模式
public class Demo06 {

	public static void main(String[] args) {

		// 使用单例模式
		Single s = Single.getInstance();
		Single.getInstance();
		Single.getInstance();

		try {
			// 通过反射的方式构造新对象
			Class<?> c = s.getClass();
			// 不行 因为私有的无法这样调用
//			c.newInstance();

			// 获得 c 中所有构造器 - 不能获取私有的
			Constructor<?>[] constructors = c.getConstructors();
			System.out.println(constructors.length);

			Constructor<?>[] constructors2 = c.getDeclaredConstructors();
			System.out.println(constructors2.length);

			// 获取那个无参的私有构造器
			Constructor<?> constructor = c.getDeclaredConstructor();
			constructor.setAccessible(true);
			Object newInstance = constructor.newInstance();




		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
