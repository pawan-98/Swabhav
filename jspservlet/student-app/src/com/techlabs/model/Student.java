package com.techlabs.model;

import java.util.UUID;

public class Student {
	private UUID id;
	private String name;
	private String gender;
	
	public Student(UUID id, String name, String gender) {
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
