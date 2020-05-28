package lsp.violation.test;

import lsp.violation.Rectangle;
import lsp.violation.Square;

public class Test {
	public static void main(String args[]) {
		Rectangle rectangle = new Rectangle(100, 200);
		shouldNotChangeWidth_IfModified(rectangle);
		shouldNotChangeWidth_IfModified(new Square(50));
		
	}
	public static void shouldNotChangeWidth_IfModified(Rectangle rectangle) {
		int beforeWidth,afterWidth;
		beforeWidth = rectangle.getWidth();
		rectangle.setheight(rectangle.getHeight()+10);
		afterWidth=rectangle.getWidth();
		System.out.println(beforeWidth==afterWidth);
	}

}
