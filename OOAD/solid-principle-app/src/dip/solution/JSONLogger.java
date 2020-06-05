package dip.solution;

import dip.violation.ILog;

public class JSONLogger implements ILog{
	public void log(String e) {
		System.out.println("Error in Json logger:- "+e);
	}

}
