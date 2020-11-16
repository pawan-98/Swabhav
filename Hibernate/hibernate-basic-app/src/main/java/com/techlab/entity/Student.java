package com.techlab.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Override
	public String toString() {
		return "Student [id="+id+",name="+ name+",cgpa="+ cgpa  +"]";
	}
	
	@Id
	private String id;
	private String name;
	private float cgpa;
	
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
	public float getCgpa() {
		return cgpa;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	
	
}
