package com.techlab.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.service.RegisterVM;

public class RegisterAction extends ActionSupport implements ModelDriven<RegisterVM>{
	private RegisterVM vm;
	@Override
	public RegisterVM getModel() {
		// TODO Auto-generated method stub
		vm=new RegisterVM();
		return vm;
	}
	public RegisterVM getVm() {
		return vm;
	}
	public void setVm(RegisterVM vm) {
		this.vm = vm;
	}
	
	@Override
	public void validate() {
		if("".equals(vm.getName())) {
			addFieldError("name", "Name cannot be empty");
		}
		if (vm.getAge()==0) {
			addFieldError("age", "Age cannot be empty");
		}
		if("".equals(vm.getAddress())) {
			addFieldError("address", "Address can not be empty");
		}
		
	}
	
	@Override
	public String execute() throws Exception{
		return "success";
	}
	public String registerDo() {
		String detailsMessage= "Registration Complete! Your details are as follows:-\n";
		String nameMsg= "Name: "+vm.getName() ;
		String ageMsg="Age: "+vm.getAge();
		String addressMsg="Address: "+vm.getAddress();
		detailsMessage+=nameMsg+"\n"+ageMsg+"\n"+addressMsg;
		vm.setMessage(detailsMessage);
		return "success";
	}
}
