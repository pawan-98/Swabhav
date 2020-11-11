package com.techlab.action;

import com.opensymphony.xwork2.Action;

public class JSONAction implements Action {
	private String id;
	private String name;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("action executing");
		
		id="123";
		name = "abc";
		return "success";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
