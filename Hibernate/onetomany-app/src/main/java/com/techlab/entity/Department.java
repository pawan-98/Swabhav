package com.techlab.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;

@Entity
public class Department {
	@Id
	private int id;
	private String name;
	
	@OneToMany(mappedBy = "dept",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private Set<Employee> employees= new HashSet<Employee>();

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name +",employees= " +employees.toString()+"]";
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

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
}
