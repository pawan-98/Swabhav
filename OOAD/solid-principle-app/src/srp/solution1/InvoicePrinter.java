package srp.solution1;

public class InvoicePrinter {
	private Invoice invoice;
	public InvoicePrinter(Invoice invoice) {
		this.invoice=invoice;
	}

	public void print() {
		System.out.println("Total cost is "+ invoice.calculateTotalCost());
	}
	
}
