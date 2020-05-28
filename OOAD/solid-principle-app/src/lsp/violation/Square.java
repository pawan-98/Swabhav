package lsp.violation;

public class Square extends Rectangle{

	public Square(int side) {
		super(side, side);
	}
	@Override
	public void setheight(int height) {
		this.width=this.height=height;
	}
	@Override
	public void setWidth(int width) {
		this.height=this.width=width;
	}

}
