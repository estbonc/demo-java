package com.lss.study.reflect;

public class Single {

	private static Single instance = new Single();

	private Single(){
		System.out.println("构造了一个对象");
	}

	public static Single getInstance(){
		return instance;
	}

}
