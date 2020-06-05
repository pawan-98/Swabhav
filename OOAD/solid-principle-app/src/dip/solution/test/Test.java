package dip.solution.test;

import dip.solution.LogType;
import dip.solution.TaxCalculator;
import dip.solution.TextLogger;

public class Test {
	public static void main(String args[]) {
		TaxCalculator taxCalculator = new TaxCalculator(new TextLogger());
		System.out.println(taxCalculator.calculateTax(10, 5));
		System.out.println(taxCalculator.calculateTax(0, 0));
	}
}
