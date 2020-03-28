package com.techlabs.model;

public class Player {
	private int id;
	private String name;
	private int age;

	/*
	 * public Player(int id, String name, int age) { this(id, name); age = age;
	 * 
	 * }
	 * 
	 * public Player(int id, String name) { this.id = id; this.name = name; this.age
	 * = 18;
	 * 
	 * }
	 */
	public Player(int id, String name, int age) {

		this.id = id;
		this.name = name;
		this.age = 18;
		System.out.println("player created");

	}

	public Player(int id, String name) {
		this(id, name, 18);

	}

	public Player whoIsElder(Player second) {
		if (this.age < second.age) {
			return second;
		}
		return this;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}
}
