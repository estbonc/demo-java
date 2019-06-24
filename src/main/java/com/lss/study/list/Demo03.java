package com.lss.study.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Demo03 {

	public static void main(String[] args) {

		Set<Dog> set = new TreeSet<Dog>();
		set.add(new Dog("小黑", 18));
		System.out.println("------------------");
		set.add(new Dog("小白", 28));
		System.out.println("------------------");
		set.add(new Dog("小黄", 25));
		System.out.println("------------------");

//		Iterator it = set.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}

		// for each
		for (Dog d : set) {
			System.out.println(d);
		}

	}
}

class Dog implements Comparable {
	public String name;
	public int age;

	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals()");
		try {
			Dog other = (Dog) obj;
			return this.name.equals(other.name) && this.age == other.age;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int res = 1;
		System.out.println("hashCode() = " + res);
		return 1;
	}


	@Override
	public int compareTo(Object o) {
		int res = 0;
		Dog other = (Dog) o;

		res = this.age - other.age;

		System.out.println("compareTo = " + res);
		return res;
	}
}
