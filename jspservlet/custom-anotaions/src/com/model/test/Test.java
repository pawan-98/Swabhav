package com.model.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.techlabs.model.Foo;
import com.techlabs.model.Testing;

public class Test {
	public static void main(String args[])
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Foo foo = new Foo();
		Method[] allMethods = foo.getClass().getMethods();
		String str= new String();
		
		for (Method method : allMethods) {

			Testing annos = method.getAnnotation(Testing.class);
			if (annos != null) {
				if(method.invoke(foo, null) .equals( true)) {
				System.out.println(method.getName()+" has passed the test!");
				}
				else {
					System.out.println(method.getName()+" has failed the test!");
				}
			}
			
		}
	}
}
