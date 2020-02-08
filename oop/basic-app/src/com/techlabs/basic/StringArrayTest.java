package com.techlabs.basic;

public class StringArrayTest {

	public static void main(String args[]) {
		int tempInt = 0;
		String tempString = "";
		String[] names = { "pawan", "tanmay", "tejashree", "murtza", "sejal", "jay", "vinit", "prasad" };
		int arrayLength = names.length;
		System.out.println("Using normal loop:-");
		for (int i = 0; i <= arrayLength - 1; i++) {

			System.out.println(names[i]);
			tempInt = names[i].length();
			if (tempInt > tempString.length()) {
				tempString = names[i];

			}

		}

		System.out.println("Using enhanced loop:-");
		for (String item : names) {

			System.out.println(item);

		}
		System.out.println("Following are names which conatains 'a':- ");

		for (int i = 0; i <= arrayLength - 1; i++) {
			if (names[i].contains("a")) {
				System.out.println(names[i]);

			}

		}

		System.out.println("Longest name is " + tempString);
	}

}
