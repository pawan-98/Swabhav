package magicNumber;

public class CalculateAreaOfACircleTest {

	public static void main(String args[]) {
		calculate(7);
	}

	public static void calculate(int radius) {
		// defining value of pi as final because it is never going to change
		final double PI = 3.14;
		System.out.println(PI * radius * radius);

	}

}
