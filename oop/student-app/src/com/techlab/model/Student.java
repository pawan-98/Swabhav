package com.techlab.model;

public class Student {

	private String name;
	private float cgpa;
	private int id;
	private static int count;
	static {
		count= 0;
		System.out.println("inside static block");
	}

	public Student(int id, String name, float cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
		count = count + 1;
		System.out.println("inside constructor");
	}

	public Student(int id, String name) {

		this(id, name, 7.0f);
	}

	public String getName() {

		return name;
	}

	public double getCgpa() {
		return cgpa;

	}

	public int getId() {

		return id;
	}
	public int getCount() {
		return count;
	}
	
	public static int headCount() {

		return count;
	}

}
