package com.techlabs.basic;
import java.util.Scanner;
import java.lang.reflect.*;

public class ReflectionTest {

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		//eg inputs:-"java.lang.System"
		System.out.println("Enter the path:-");
		String input = sc.nextLine();

		Class cls = Class.forName(input);
		applyReflection(cls);

	}

	public static void applyReflection(Class<?> className) throws Exception {
		System.out.println("Class Name:- " + className.getCanonicalName());

		System.out.println("Displaying all the method names with access specifier:- ");
		Method[] methods = className.getMethods();
		for (Method method : methods) {
			System.out.println(Modifier.toString(method.getModifiers()) +" "+ method.getName());
			System.out.println( "Return Type: " +method.getReturnType());
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
