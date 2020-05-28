package srp.solution1.test;

import java.util.UUID;

import srp.solution1.Invoice;
import srp.solution1.InvoicePrinter;

public class InvoiceTest {
	public static void main(String args[]) {
		Invoice invoice = new Invoice(UUID.randomUUID(), "xyz", 100, .15f);
		InvoicePrinter details = new InvoicePrinter(invoice);
		details.print();
	}

}
