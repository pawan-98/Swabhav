package lsp.violation;

public class Rectangle {
	protected int width;
	protected int height;
	
	public Rectangle(int width,int height){
		this.width=width;
		this.height=height;
	}
	public int calculateArea() {
		return width*height;
	}
	public void setWidth(int width) {
		this.width=width;
	}
	public void setheight(int height) {
		this.height=height;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
}
