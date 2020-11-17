package com.techlab.action;

import org.apache.struts2.ServletActionContext;

import com.captcha.botdetect.web.servlet.Captcha;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.techlab.service.RegisterFormService;

public class RegisterFormAction extends ActionSupport {
		private String firstName;
		private String lastName;
		private String to;
		private String age;
		
	   private RegisterFormService registerFormService;
	   private boolean tempVar;
	   private String captchaCode;

	   public String getCaptchaCode() {
	     return captchaCode;
	   }

	   public void setCaptchaCode(String captchaCode) {
	     this.captchaCode = captchaCode;
	   }
	   
	   @Override
		public String execute() throws Exception {
			// TODO Auto-generated method stub
		   registerFormService= new RegisterFormService();
		   tempVar=registerFormService.sendEmail(firstName, lastName, to, age);
		   if(tempVar=true) {
			   return "success";
		   }
			return "input";
		}
	   
	   public void validate() {
		    Captcha captcha = Captcha.load(ServletActionContext.getRequest(), "exampleCaptcha");
		    System.out.println(captcha);
		    System.out.println(captchaCode);
		    boolean isHuman = captcha.validate(captchaCode);
		    if (!isHuman) {
		      addFieldError("captchaCode", "Incorrect code");
		      System.out.println("not human");
		    }
		   // System.out.println(captcha.get);
		    System.out.println("human");
		    
		    captchaCode = null;
		  }
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public RegisterFormService getRegisterFormService() {
		return registerFormService;
	}
	public void setRegisterFormService(RegisterFormService registerFormService) {
		this.registerFormService = registerFormService;
	}
	public boolean isTempVar() {
		return tempVar;
	}
	public void setTempVar(boolean tempVar) {
		this.tempVar = tempVar;
	}
	
}
