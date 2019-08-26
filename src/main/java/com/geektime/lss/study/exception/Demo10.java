package com.geektime.lss.study.exception;

public class Demo10 {

	
	
}


class A{
	
	public void a() throws Exception {
		
	}
	
}

class B extends A{
	
	@Override
	public void a() throws RuntimeException, NullPointerException {
	
	}
	
}
