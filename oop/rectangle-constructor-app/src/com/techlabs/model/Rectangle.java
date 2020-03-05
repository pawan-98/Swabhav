package com.techlabs.model;

public class Rectangle {

	private int width;
	private int height;
	private String colour;

	public Rectangle(int pwidth, int pheight, String pcolour) {
		colour = checkColour(pcolour);
		height = checkHeight(pheight);
		width = checkWidth(pwidth);
	}

	public Rectangle(int pwidth, int pheight) {
		colour = "red";
		height = checkHeight(pheight);
		width = checkWidth(pwidth);
	}

	private int checkWidth(int pwidth) {
		if (pwidth < 0) {
			pwidth = 1;
		}
		return pwidth;
	}

	private int checkHeight(int pheight) {
		if (pheight < 0) {
			pheight = 1;
		}
		return pheight;
	}

	private String checkColour(String pcolour) {
		if (pcolour == null) {
			pcolour = "red";
			return pcolour;
		}
		
		if (!pcolour.equalsIgnoreCase("red") && !pcolour.equalsIgnoreCase("green") && !pcolour.equalsIgnoreCase("blue")) {
			pcolour = "red";
		}
		return pcolour;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public String getColour() {
		return colour;
	}

	public int calculateArea() {
		return height * width;
	}

}
