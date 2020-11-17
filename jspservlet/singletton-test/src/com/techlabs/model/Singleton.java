package com.techlabs.model;

public class Singleton {
	 private static Singleton singleton = new Singleton( );
	 
	 private Singleton() {
		 System.out.println("Singlton object");
	 }
	 public static Singleton getInstance( ) {
	      return singleton;
	   }
}
