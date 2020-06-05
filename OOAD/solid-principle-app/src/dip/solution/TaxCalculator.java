package dip.solution;

import dip.violation.ILog;

public class TaxCalculator {
	private ILog log;
	public TaxCalculator(ILog log) {
			this.log=log;
	}
	public int calculateTax(int amount,int rate) {
		try {
			int result = amount/rate;
			return result;
				
		} catch (Exception e) {
			log.log("Dont divide by 0");
			return -1;
		
		}
	}
}
