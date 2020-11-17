package com.model.test;

import java.lang.reflect.Method;

import com.techlabs.model.Testing;

public class ReflectionTest {
	private static Method[] allMethods;
	public static void main(String[] args) {
		String str= new String();
		allMethods= str.getClass().getMethods();
		
		getGetters(allMethods);
		getSetters(allMethods);
		getAllMethods(allMethods);
	}

	private static void getSetters(Method[] allMethods) {
		// TODO Auto-generated method stub
		for (Method method : allMethods) {
			int firstIndex = method.getName().indexOf("set");
			if(firstIndex==0) {
			System.out.println(method.getName());
			}
			}

		
	}

	private static void getAllMethods(Method[] allMethods) {
		// TODO Auto-generated method stub
		for (Method method : allMethods) {
			System.out.println("All methods :-"+method.getName());
		}
		
	}

	private static void getGetters(Method[] allMethods) {
		// TODO Auto-generated method stub
		for (Method method : allMethods) {
			int firstIndex = method.getName().indexOf("get");
			if(firstIndex==0) {
			System.out.println("Getters:-"+method.getName());
		}
			}
		
	}

}
