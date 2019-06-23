package com.lss.study.exception;

public class Demo09 {

	public static void main(String[] args) throws Exception {

		Person p = null;
		p.say();			// 有空指针隐患

		new Person("张三", 18);	// 有异常隐患


	}

}



class Person{

	private String name;
	private int age;

	public Person(String name, int age) throws Exception{
		setName(name);
		setAge(age);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	/*
	 * 不允许年龄小于0或者大于150
	 */
	public void setAge(int age) throws Exception  {
		if(age < 0 || age > 150){
			//System.out.println("年龄不合法");
			age = 0;
			// 抛出一个非运行时异常(对象)
			throw new AgeException();
		}else{
			this.age = age;
		}
	}

	public void say(){

	}
}


/**
 * 自定义异常
 */
class AgeException extends Exception{

	public AgeException(){
		super("年龄输入大于150岁了！或者小于0岁了！");
	}

}
