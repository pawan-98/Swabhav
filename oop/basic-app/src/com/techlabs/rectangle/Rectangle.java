package com.techlabs.rectangle;

public class Rectangle {

	public int width;
	public int height;
	public void checkDimentions() {
		
		if(height<=0) {
			height = 1;
		}
		if(width<=0) {
			width = 1;
		}
	}

	public int calculateArea() {

		int area = width * height;
		return area;
	}

}
