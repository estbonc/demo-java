package com.lss.study.reflect;

// 获取class对象
public class Demo01 {

	public static void main(String[] args) {
		// 获取Student类的class对象

		// 1. 通过类访问
		Class<?> c1 = Student.class;
		System.out.println(c1);

		// 2. 通过对象访问
		Student s = new Student();
		Class<?> c2 = s.getClass();
		System.out.println(c2);

		// 3. 通过完整类名访问
		try {
			Class<?> c3 = Class.forName("com.lss.study.reflect.Student");
			System.out.println(c3);


			// 验证是否是同一个对象
			System.out.println(c1 == c2);
			System.out.println(c1.toString());
			System.out.println(s.toString());
			System.out.println(c3.toString());
			System.out.println(c2 == c3);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}



	}

}
