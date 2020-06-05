package isp.violation;

import isp.violation.IWorker;

public class Robot implements IWorker{

	@Override
	public void startWork() {
		System.out.println("Robot started working");
	}

	@Override
	public void stopWork() {
		System.out.println("Robot stoped working");
	}

	@Override
	public void startEat() {
		throw new RuntimeException("Robos don't eat");	}

	@Override
	public void stopEat() {
		throw new RuntimeException("Robos don't eat");
	}

}
