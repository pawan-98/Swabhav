package com.techlab.model.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.techlab.model.UnitTestCase;
import com.techlab.model.Foo;

public class FooTest {
	public static void main(String args[]) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Foo run = new Foo();
	    Method[] allMethods = run.getClass().getMethods();
	    Class cls = run.getClass(); 	    
	    Method methodcall2;
	    for (Method method : allMethods) {
	    	com.techlab.model.UnitTestCase annos = method.getAnnotation(UnitTestCase.class);
	    	if(annos != null) {
	    		System.out.println("Unit Test Case "+method.getName());
	    		methodcall2 = cls.getDeclaredMethod(method.getName());
		        System.out.println("Output" + methodcall2.invoke(run));
	    	
	    	}
	    	
	    }
	    
 
		
	}
	
}
