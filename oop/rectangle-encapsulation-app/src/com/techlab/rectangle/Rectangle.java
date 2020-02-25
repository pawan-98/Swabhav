package com.techlab.rectangle;

public class Rectangle {
	private int height;
	private int width;
	public void checkDimensions() {
		
		height =(height<=0 || height>99)?1:height ;
		width =(width<=0 || width >99)?1:width ;
		
		
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
		
		return width*height;
	}
}
