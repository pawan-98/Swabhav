package isp.solution.test;

import javax.management.RuntimeErrorException;

import isp.solution.IEat;
import isp.solution.IWorker;
import isp.solution.Manager;
import isp.solution.Robot;


public class Test {
	public static void main(String args[]) {
		Manager manager  = new Manager();
		Robot robot = new Robot();
		atTheCafeteria(manager);
		atTheWorkStation(manager);
		atTheWorkStation(robot);
		
	
	}
	public static void atTheCafeteria(IEat worker) {
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
