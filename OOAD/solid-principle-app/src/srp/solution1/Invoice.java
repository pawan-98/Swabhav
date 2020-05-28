package srp.solution1;

import java.util.UUID;

public class Invoice {
	private UUID id;
	private String name;
	private double cost;
	private float discountPercentage;
	private static final float GST = 0.18f;
	
	public Invoice(UUID id,String name,double cost,float discountPercentage) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.discountPercentage = discountPercentage;
		}
	public double calculateTax() {
		return cost*GST;
	}
	
	public double calculateDiscountAmount() {
		return cost*discountPercentage;
	}
	
	public double calculateTotalCost() {
		return cost-calculateDiscountAmount()+calculateTax();
	}
	
}
