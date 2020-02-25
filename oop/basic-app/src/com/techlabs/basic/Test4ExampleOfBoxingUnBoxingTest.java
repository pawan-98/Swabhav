package com.techlabs.basic;

public class Test4ExampleOfBoxingUnBoxingTest {
	public static void main(String args[]) {
		
		int i1 = 1;
		int i2 = 1;
		System.out.println("i1==2:"+(i1==i2));
		
		Integer num1 = 1;
		int num2 = 1;
		System.out.println("num1==num2:"+(num1==num2));
		
		Integer one = new Integer(1);
		Integer anotherOne =new Integer(1);
		System.out.println("one =anotherOne:"+ (one==anotherOne));
		System.out.println(one.hashCode());
		System.out.println(anotherOne.hashCode());
		
		
		Integer object =new Integer(1);
		int refrenceVariable = 1;
		System.out.println("object==refrenceVariable:"+  (object==refrenceVariable));
		
		Integer oneNumber = new Integer(1);
		int num = oneNumber;
		System.out.println(oneNumber==num);
		
		
	}

}
