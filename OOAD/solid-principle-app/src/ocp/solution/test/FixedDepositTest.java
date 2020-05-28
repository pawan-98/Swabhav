package ocp.solution.test;

import ocp.solution.DiwaliFestival;
import ocp.solution.FixedDeposit;

public class FixedDepositTest {
	public static void main(String args[]) {
	FixedDeposit fd = new FixedDeposit(101, "Pawan", 10000, 45, new DiwaliFestival());

	 printInfo(fd);
}

	public static void printInfo(FixedDeposit fd) {
		System.out.println("Simple Intrest is " + fd.claculateSimpleIntrest());
	}
}
