package com.techlabs.model.test;

import com.techlabs.model.Player;

public class PlayerTest {
	public static void main(String args[]) {

		Player sachin = new Player(101, "sachin", 45);
		Player virat = new Player(102, "virat");
		printInfo(sachin);
		printInfo(virat);
		
		Player temp =sachin.whoIsElder(virat);
		System.out.println("Elder player is "+ temp.getName());
		System.out.println("Displaying hashcode of temp "+temp.hashCode());
		System.out.println("Displaying hashcode of sachin "+ sachin.hashCode());
		System.out.println("Displaying hashcode of virat "+ virat.hashCode());
		
	}

	public static void printInfo(Player player) {
		System.out.println("Age:- " + player.getAge());
		System.out.println("Name:- " + player.getName());
		System.out.println("id:- " + player.getId());
	}
}
