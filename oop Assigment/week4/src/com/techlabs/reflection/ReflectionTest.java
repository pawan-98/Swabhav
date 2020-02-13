package com.techlabs.reflection;

import java.util.Scanner;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

public class ReflectionTest {

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path:-");
		String input = sc.nextLine();

		Class cls = Class.forName(input);
		applyReflection(cls);

	}

	public static void applyReflection(Class<?> className) throws Exception {
		System.out.println("Class Name:- " + className.getCanonicalName());

		System.out.println("Displaying all the method names:- ");
		Method[] methods = className.getMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		System.out.println("Printing setters:-");
		for (int i = 0; i < methods.length; i++) {
			if (methods[i].getName().startsWith("set")) {
				System.out.println(methods[i].getName());
			}
		}
		System.out.println("Printing getters:-");
		for (int i = 0; i < methods.length; i++) {
			if (methods[i].getName().startsWith("get")) {
				System.out.println(methods[i].getName());
			}
		}
	}

}
