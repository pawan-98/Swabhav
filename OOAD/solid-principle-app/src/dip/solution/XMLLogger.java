package dip.solution;

import dip.violation.ILog;

public class XMLLogger implements ILog {
	public void log(String e) {
		System.out.println("Error in Xml logger:- "+e);
	}
}
