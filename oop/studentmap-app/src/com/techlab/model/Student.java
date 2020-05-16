package com.techlab.model;


public class Student implements Comparable<Student>  {

	private int rollNo;
	private int standard;
	private String name;
	private double cgpa;
	
	public Student(int rollNo,int standard,String name,double cgpa) {
		this.cgpa = cgpa;
		this.rollNo = rollNo;
		this.standard = standard;
		this.cgpa = cgpa;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public int getStandard() {
		return this.standard;
	}
	
	public String getName() {
		return this.name;
	}
	public double getCgpa() {
		return cgpa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollNo;
		result = prime * result + standard;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (rollNo != other.rollNo)
			return false;
		if (standard != other.standard)
			return false;
		return true;
	}

	@Override
	public int compareTo(Student obj) {
		if(this.getStandard() == obj.getStandard() && this.getRollNo()==obj.getRollNo()) {
			return 0;
		}
		else if (this.getStandard()>obj.getStandard() && this.getRollNo()==obj.getRollNo()) {
			return 1;
		}
		else {
			return -1;
		}
	}



}
