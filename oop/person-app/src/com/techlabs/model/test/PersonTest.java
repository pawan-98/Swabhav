package com.techlabs.model.test;

import com.techlabs.model.Person;

public class PersonTest {
	public static void main(String args[]) {
		
		Person p1 = new Person("abc",50,"Male", 6.5f,100f);
		printInfo(p1);
		p1.doWorkout();
		printInfo(p1);
		p1.doFat();
		printInfo(p1);
		
		Person p2 = new Person (null,50,"dfs",-5f,100f);
		printInfo(p2);
		p2.doWorkout();
		printInfo(p2);
		p2.doFat();
		printInfo(p2);
	}
	public static void printInfo(Person per) {
		System.out.println("Name:-"+per.getName());
		System.out.println("Age:-"+per.getAge());
		System.out.println("Height:-"+per.getHeight());
		System.out.println("Weight:-"+per.getWeight());
		System.out.println("Gender:-"+per.getgender()+"\n");
	}
}
