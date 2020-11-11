package com.techlab.action;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor implements SessionAware {
	private SessionMap<String,Object> sessionMap;
	//private HttpSession session =ServletActionContext.getRequest().getSession(false);
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		HttpSession session =ServletActionContext.getRequest().getSession(false);
		String output = "Pre-Processing"; 
	      System.out.println(output);
	      if(session==null ||  session.getAttribute("status") == null) {
				return "input";
			}
	      
	      String result = invocation.invoke();
	      return result;
	     
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		sessionMap=(SessionMap<String, Object>) session;
	}

}
