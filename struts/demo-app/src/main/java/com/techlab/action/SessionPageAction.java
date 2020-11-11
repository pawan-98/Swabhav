package com.techlab.action;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;

public class SessionPageAction implements SessionAware{
	private SessionMap<String,Object> sessionMap;  
	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		sessionMap=(SessionMap<String, Object>) session;
		System.out.println("session");
	}
	
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		 HttpSession session=ServletActionContext.getRequest().getSession(false);  
		 if(session==null || session.getAttribute("count")==null){  
			 sessionMap.put("count",0);
			 System.out.println("exec 0");
	        }  
		 else {
		sessionMap.put("count",(int)session.getAttribute("count")+1);  
		System.out.println("exec +1");
		 }
		return "success";
	}
	 

}
