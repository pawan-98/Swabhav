package forLoop;

public class normalForLoopTest {
	public static void main(String args[]) {
		int[] array = { 1, 4, 9, 16, 25, 36 };

		for (int i = 0; i < array.length;) {

			System.out.println(array[i]);
			i = i + 2;
		}

		array[2] = 55;
		System.out.println(array[2]);
	}

}
