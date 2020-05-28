package facade.pattern.model;

public class OnePlus implements IMobile {

	@Override
	public void modelNo() {
		System.out.println("OnePlus 7");
	}

	@Override
	public void price() {
		System.out.println("60000");
	}

}
