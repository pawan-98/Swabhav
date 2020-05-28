package ocp.solution;


public class FixedDeposit {
	private int account;
	private String name;
	private double principle;
	private int duration;
	private IFestival festival;

	public FixedDeposit(int account, String name, double principle, int duration, IFestival festival) {
		this.account = account;
		this.name = name;
		this.principle = principle;
		this.duration = duration;
		this.festival = festival;
	}

	

	public double claculateSimpleIntrest() {
		return principle * duration * festival.getRate();
	}

}
