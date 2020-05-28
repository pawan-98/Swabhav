package ocp.violation.test;

import ocp.violation.FestivalType;
import ocp.violation.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
			
		FixedDeposit fd = new FixedDeposit(101, "Pawan", 10000, 45, FestivalType.DIWALI);
		printInfo(fd);
	}
	public static void  printInfo(FixedDeposit fd) {
	System.out.println("Simple Intrest is "+fd.claculateSimpleIntrest());	
	}

}
