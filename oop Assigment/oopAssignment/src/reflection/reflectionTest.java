package reflection;

import java.lang.reflect.Method;

import java.lang.reflect.Constructor;

class Test {

	public Test() {

		System.out.println("This is a constructor");
	}

	public void methodOne() {
		System.out.println("This is just a method");
	}

	public void methodTwo() {
		System.out.println("This is just a method");

	}

}

public class reflectionTest {
	public static void main(String args[]) throws Exception {
		Test objectOfTest = new Test();
		Class cls = objectOfTest.getClass();
		System.out.println("Class name:-" + objectOfTest.getClass().getName());
		Constructor constructor = cls.getConstructor();

		System.out.println("Constructor name:-" + constructor);

		System.out.println("Following are name of the methods in Test class:-");
		Method[] methods = cls.getMethods();

		for (Method method : methods) {
			System.out.println(method.getName());
		}
	}
}
