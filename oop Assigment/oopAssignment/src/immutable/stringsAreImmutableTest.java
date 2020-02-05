package immutable;

public class stringsAreImmutableTest {
	public static void main(String args[]) {
		String name = "Pawan";
		name.concat(" Chhabria");
		// Chhabria string won't be joined to Pawan string because strings are immutable
		System.out.println(name);
	}

}
