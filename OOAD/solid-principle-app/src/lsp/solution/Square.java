package lsp.solution;

public class Square implements IShape{
	private int side;
	public Square(int side) {
		this.side=side;
	}
	public int getWidth() {
		return side;
	}
	public int getHeight() {
		return side;
	}
	

	@Override
	public int getArea() {
		return side*side;
		
	}

}
