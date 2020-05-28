package ocp.violation;

public class FixedDeposit {

	private int account;
	private String name;
	private double principle;
	private int duration;
	private FestivalType festival;

	public FixedDeposit(int account, String name, double principle, int duration, FestivalType festival) {
		this.account = account;
		this.name = name;
		this.principle = principle;
		this.duration = duration;
		this.festival = festival;
	}

	public float calculateRate() {
		if (festival == FestivalType.DIWALI) {
			return 0.08f;
		} else if (festival == FestivalType.NORMAL) {
			return 0.07f;
		} else {
			return 0.09f;
		}
	}

	public double claculateSimpleIntrest() {
		return principle * duration * calculateRate();
	}

}