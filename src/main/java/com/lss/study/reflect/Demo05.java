package com.lss.study.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// 通过反射调用方法
public class Demo05 {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.name = "张三";
		stu.age = 18;

		reflectTest(stu);
	}


	private static void reflectTest(Object obj){
		Class<?> c = obj.getClass();
		try {
			// 拿到 introduce 无参无返回值方法
			Method introduce = c.getMethod("introduce", null);
			// 调用此方法
			introduce.invoke(obj, null);

			// 拿到 say 有参数无返回值方法
			Method say = c.getMethod("say", String.class);
			say.invoke(obj, "反射真简单啊！");

			// 拿到add 有多个参数也有返回值的方法
			Class[] parms = new Class[]{int.class, int.class};
			Method add = c.getMethod("add", parms);
			Object result = add.invoke(null, 3,5);
			System.out.println(result);

			// 拿到 play 这个私有方法
			Method play = c.getDeclaredMethod("play");
			play.setAccessible(true);
			play.invoke(obj);

		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}

	}

}
