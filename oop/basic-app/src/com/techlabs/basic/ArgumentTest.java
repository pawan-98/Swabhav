package com.techlabs.basic;

public class ArgumentTest {

	public static void main(String names[]) {

		int argsLength = names.length;

		for (String name : names) {
			System.out.println(name + " aurionpro");
		}
		System.out.println(names);
		System.out.println(names[0]);
		for (int i = 0; i < argsLength; i++) {
			// names[i] = names[i]+"aurionpro";
			System.out.println(names[i].concat(" aurionpro"));

		}
		System.out.println(names[0]);
		String copyArray[] = names;
		
		//names[0]=names[0]+" aurionpro";
		System.out.println(names);
		System.out.println(copyArray);
		System.out.println(names==copyArray);
		copyArray[2] ="Swabhav Techlabs";
		System.out.println(names[2]);
	
	
	}

}
