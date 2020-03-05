package com.techlab.thisKeyword;

class Student {
	int rollNo;
	String name;
	float fee;

	Student(int rollNo, String name, float fee) {
		this.rollNo = rollNo;
		this.name = name;
		this.fee = fee;
	}

	void display() {
		System.out.println("Roll number:- " + rollNo + " Name:- " + name + " Fees:- " + fee);
	}
}

public class ThisKeywordTest {
	public static void main(String args[]) {

		Student s1 = new Student(1, "pawan", 5500f);
		Student s2 = new Student(2, "amit", 9500f);
		s1.display();
		s2.display();
	}
}
