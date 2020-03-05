package com.techlab.circle.test;

import com.techlab.circle.Circle;
import java.lang.reflect.Method;

class order {

}

public class CircleReflectionTest {
	public static void main(String args[]) {

		order orders[] = new order[5];
		// System.out.println(orders[0]);
		displayMethodsInfo(Circle.class);
		displayMethodsInfo(CircleReflectionTest.class);
		displayMethodsInfo(Integer.class);
		System.out.println(new Circle().calculateArea());
	}

	public static void displayMethodsInfo(Class className) {

		Method[] methods = className.getDeclaredMethods();

		for (Method method : methods) {
			System.out.println(method.getName());
		}
		System.out.println("Number of methods " + methods.length);

	}

}
