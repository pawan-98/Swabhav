package dip.solution;

import dip.violation.ILog;

public class TextLogger implements ILog{
	public void log(String e) {
		System.out.println("Error in text logger:- "+e);
	}

}
