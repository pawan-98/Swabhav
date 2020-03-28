package com.techlabs.model;

public class Student {

	private String name;
	private double cgpa;
	private int id;
	private static int count = 0;

	public Student(int id, String name, double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
		count = count + 1;

	}

	public Student(int id, String name) {

		this(id, name, 7.0);
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
}
