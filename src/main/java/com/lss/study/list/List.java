package com.lss.study.list;

public interface List<T> {


	void add(T obj);

	void remove(int index);

	T get(int index);

	int size();
	
}
