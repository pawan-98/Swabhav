package com.techlabs.test;

import com.techlabs.model.NotSingleton;
import com.techlabs.model.Singleton;

public class Test {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		Singleton singletonTwo = Singleton.getInstance();
		NotSingleton notSingleton = new NotSingleton();
		NotSingleton notSingletonTwo = new NotSingleton();
	}

}
