package com.techlab.model.test;

import java.util.Objects;

import com.techlab.model.Boy;
import com.techlab.model.Infant;
import com.techlab.model.Kid;
import com.techlab.model.Man;

public class ManTest {

	public static void main(String args[]) {
		case1();
		case2();
		case3();
		case4();
		case5();
	}
	
	public static void case1() {
		Man x;
		x= new Man();
		x.play();
	}
	
	public static void case2() {
		Boy y;
		y = new Boy();
		y.play();
	}
	public static void case3(){
		Man x;
		x = new Boy();
		x.walk();
	}
	
	public static void case4() {
		atThePark(new Man());
		atThePark(new Kid());
		atThePark(new Infant());
		atThePark(new Boy());
		
	}
	public static void case5() {
		Object x;
		x= 10;
		System.out.println(x.getClass());
		
		x="hello";
		System.out.println(x.getClass());
		
		x= 10>20;
		System.out.println(x.getClass());		
		
		x= new Integer(20);
		System.out.println(x.getClass());
	}
	public static void atThePark(Man x) {
		System.out.println("at the park");
		x.play();
	}
	
}
