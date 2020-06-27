package com.techlabs.factory.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

import com.techlabs.factory.IAutoFactory;
import com.techlabs.factory.IAutomobile;

public class Test {
	public static void main(String args[]) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException, NoSuchMethodException, SecurityException {
		IAutoFactory factory =  injectDependency();
		//System.out.println(factory.getClass());
		IAutomobile auto = factory.make();
		auto.start();
		auto.stop();
	}
	public static IAutoFactory injectDependency() throws IOException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException   {
		FileInputStream fileInputStream = new FileInputStream("src/Dependency/factory.properties");
		Properties property = new Properties();
		property.load(fileInputStream);
		Class class1 = Class.forName( property.getProperty("factory"));
		Method method = class1.getDeclaredMethod("getInstance",null);
		return (IAutoFactory) method.invoke(null,null);
	}
}
