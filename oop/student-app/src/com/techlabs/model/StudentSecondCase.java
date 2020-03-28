package com.techlabs.model;

public class StudentSecondCase {
	private String name;
	private float cgpa;
	private int id;
	private static int count;
	static {
		count= 0;
	}

	public StudentSecondCase(int id, String name, float cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
		count = count + 1;

	}

	public StudentSecondCase(int id, String name) {

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

}
