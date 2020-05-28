package facade.pattern.model;

public class Xiaomi  implements IMobile{

	@Override
	public void modelNo() {
		System.out.println("Mi 6");
	}

	@Override
	public void price() {
		System.out.println("12000");
	}

}
