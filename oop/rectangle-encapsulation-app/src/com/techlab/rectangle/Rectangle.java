package com.techlab.rectangle;

public class Rectangle {
	private int height;
	private int width;
	public static final int UPPER_LIMIT=0;
	public static final int LOWER_LIMIT=99;
	
	public void checkDimensions() {
		
		height =(height<=LOWER_LIMIT || height>UPPER_LIMIT)?1:height ;
		width =(width<=LOWER_LIMIT || width >UPPER_LIMIT)?1:width ;
		
		
	}

	public int getHeight() {
		
		return height;
	}

	public int getWidth() {
		
		return width;
	}

	public void setHeight(int inputHeight) {
		height = inputHeight;
	}

	public void setWidth(int inputWidth) {
		width = inputWidth;

	}
	public int calculateArea() {
		checkDimensions();
		
		return width*height;
	}
}
