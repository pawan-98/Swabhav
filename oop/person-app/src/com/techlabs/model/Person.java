package com.techlabs.model;

public class Person {
	private String name;
	private int age;
	private String gender;
	private float height;
	private float weight;

	public Person(String pname, int page, String pgender, float pheight, float pweight) {
		name = checkName(pname);
		age = checkAge(page);
		gender = checkGender(pgender);
		height = checkHeight(pheight);
		weight = checkWeight(pweight);
		age = checkAge(page);

	}

	private String checkName(String pname) {
		if (pname == null) {
			pname = "unknown";
		}
		return pname;
	}

	private float checkWeight(float pweight) {
		if (pweight <= 0) {
			pweight = 1;
		}
		return pweight;
	}

	private float checkHeight(float pheight) {
		if (pheight <= 0) {
			pheight = 1;
		}
		return pheight;
	}

	private String checkGender(String pgender) {
		if (!pgender.equalsIgnoreCase("male") && !pgender.equalsIgnoreCase("female")
				&& !pgender.equalsIgnoreCase("other")) {
			pgender = "other";
		}
		return pgender;
	}

	private int checkAge(int page) {
		if (page <= 0) {
			page = 1;
		}
		return page;
	}

	public void doWorkout() {
		weight = weight - weight * (0.02f);

	}

	public void doFat() {
		weight = weight + weight * (0.05f);
	}

	public float getWeight() {
		return weight;
	}

	public float getHeight() {
		return height;
	}

	public String getgender() {
		return gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}
