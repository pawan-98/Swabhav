package lsp.solution.test;

import lsp.solution.IShape;
import lsp.solution.Rectangle;
import lsp.solution.Square;

public class Test {
	public static void main(String args[]) {
		Rectangle rectangle = new Rectangle(100, 200);
		printArea(rectangle);
		printArea(new Square(50));
		
	}
	public static void printArea(IShape shape) {
		
		System.out.println(shape.getArea());
	}

}
