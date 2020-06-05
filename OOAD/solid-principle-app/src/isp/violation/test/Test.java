package isp.violation.test;

import javax.management.RuntimeErrorException;

import isp.violation.IWorker;
import isp.violation.Manager;
import isp.violation.Robot;

public class Test {
	public static void main(String args[]) {
		Manager manager  = new Manager();
		Robot robot = new Robot();
		atTheCafeteria(manager);
		atTheCafeteria(robot);
		atTheWorkStation(manager);
		atTheWorkStation(robot);
		
	
	}
	public static void atTheCafeteria(IWorker worker) {
		System.out.println("at the cafeteria");
		worker.startEat();
		worker.stopEat();
	}
	public static void atTheWorkStation(IWorker worker) {
		System.out.println("at the work station");
		worker.startWork();
		worker.stopWork();
	}

}
