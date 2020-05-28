package facade.pattern.model;

public class MobileStore {
	private IMobile realMe;
	private IMobile xiaomi;
	private IMobile onePlus;
	
	public MobileStore() {
		realMe= new RealMe();
		xiaomi= new Xiaomi();
		onePlus= new OnePlus();
	}
	public void realMeSale() {
		realMe.modelNo();
		realMe.price();
	}
	public void xiaomiSale() {
		xiaomi.modelNo();
		xiaomi.price();
	}
	public void OnePlusSale() {
		onePlus.modelNo();
		onePlus.price();
	}
}
