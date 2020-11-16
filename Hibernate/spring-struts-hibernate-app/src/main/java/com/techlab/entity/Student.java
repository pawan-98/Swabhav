package com.techlab.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private String id;
	private String name;
	private String gender;
	public Student() {
	}
	public Student(String id, String name, String gender) {
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	
	@Id
	public String getId() {
		return id;
	}
	public void setId(String id) {
		
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
