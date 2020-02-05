package dry;

public class withoutDryTest {
	public static void main(String args[]) {
		int numOne = 1, numTwo = 2, numThree = 3, numFour = 4, numFive = 5, numSix = 6, numSeven = 7, numEight = 8,
				resultOne, resultTwo, resultThree, resultFour;

		resultOne = numOne + numTwo;
		System.out.println(resultOne);

		resultTwo = numThree + numFour;
		System.out.println(resultTwo);

		resultThree = numFive + numSix;
		System.out.println(resultThree);

		resultFour = numSeven + numEight;
		System.out.println(resultFour);
	}

}
