package com.techlab.action;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.opensymphony.xwork2.Action;

public class BrowserAction implements Action {
	private String date;
	private String msg;
	private String time;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("success");
		date = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
		time = new SimpleDateFormat("HH").format(Calendar.getInstance().getTime());
		return "success";
	}

	public String getDate() {

		System.out.println(date);
		return date;
	}

	public String getMsg() {
		if (Integer.parseInt(time) > 05 && Integer.parseInt(time)<=12) {
			return "good morning";
		} else if (Integer.parseInt(time) > 12 && Integer.parseInt(time)<=20) {
			return "good afternoon";
		}
		return "good night";

	}

}
