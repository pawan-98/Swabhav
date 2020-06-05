package dip.violation.test;

import dip.violation.LogType;
import dip.violation.TaxCalculator;

public class Test {
	public static void main(String args[]) {
		TaxCalculator taxCalculator = new TaxCalculator(LogType.TEXT);
		System.out.println(taxCalculator.calculateTax(10, 5));
		System.out.println(taxCalculator.calculateTax(0, 0));
	}
}
