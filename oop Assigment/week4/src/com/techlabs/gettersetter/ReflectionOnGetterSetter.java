package com.techlabs.gettersetter;

import java.lang.reflect.Method;

public class ReflectionOnGetterSetter {
	public static void main(String args[]) throws Exception {
		Person objectOfPerson = new Person();
		Class cls = objectOfPerson.getClass();

		Method[] methods = cls.getMethods();
		System.out.println("Printing getters");
		for (int i = 0; i < methods.length; i++) {
			if (methods[i].getName().startsWith("set")) {
				System.out.println(methods[i].getName());
			}
		}
		System.out.println("Printing getters");
		for (int i = 0; i < methods.length; i++) {
			if (methods[i].getName().startsWith("get")) {
				System.out.println(methods[i].getName());
			}
		}

	}

}
