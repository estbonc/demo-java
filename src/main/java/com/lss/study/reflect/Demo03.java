package com.lss.study.reflect;


import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

// 拿到所有的方法
public class Demo03 {

	public static void main(String[] args) {
		Student stu = new Student();
		Class<?> c = stu.getClass();

		// 获得所有的方法
		Method[] methods = c.getDeclaredMethods();
		for(int i = 0; i < methods.length; i++){
			// 访问修饰符
			String modi = Modifier.toString(methods[i].getModifiers());
			// 返回值
			String returnType = methods[i].getReturnType().getSimpleName();
			// 方法名
			String mName = methods[i].getName();
			// 参数列表
			String paraList = "(";
			Class<?>[] parameterTypes = methods[i].getParameterTypes();
			for(int j = 0; j < parameterTypes.length ; j ++){
				paraList += parameterTypes[j].getSimpleName();
				if(j < methods[i].getParameterTypes().length - 1){
					paraList += ",";
				}
			}
			paraList += ")";
			System.out.println(modi + " " + returnType + " " + mName + " " + paraList);
		}



	}

}
