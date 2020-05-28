package facade.pattern.model;

public class RealMe implements IMobile {

	@Override
	public void modelNo() {
		System.out.println("Real Me X");
	}

	@Override
	public void price() {
		System.out.println("70000");
	}

}
