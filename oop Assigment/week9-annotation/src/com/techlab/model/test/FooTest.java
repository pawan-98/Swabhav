package com.techlab.model.test;

import java.lang.reflect.Method;

import com.techlabs.model.Foo;
import com.techlabs.model.NeedToRefactor;

public class FooTest {
	public static void main(String args[]) {
	Foo run = new Foo();
    Method[] allMethods = run.getClass().getMethods();
    
    for (Method method : allMethods) {
    	NeedToRefactor annos = method.getAnnotation(NeedToRefactor.class);
    	if(annos != null) {
    		System.out.println("Need to change "+method.getName());
    	}
    }
	}
}
