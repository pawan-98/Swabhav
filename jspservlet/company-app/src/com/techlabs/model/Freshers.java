package com.techlabs.model;

public class Freshers {
	private int id;
	private String name;
	private float cgpa;
	private String stream;
	private String college;
	
	public Freshers(int id, String name, float cgpa,String stream,String college) {
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
		this.stream=stream;
		this.college=college;
	
	}
	
	
	public String getStream() {
		return stream;
	}


	public void setStream(String stream) {
		this.stream = stream;
	}


	public String getCollege() {
		return college;
	}


	public void setCollege(String college) {
		this.college = college;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getCgpa() {
		return cgpa;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	
}
