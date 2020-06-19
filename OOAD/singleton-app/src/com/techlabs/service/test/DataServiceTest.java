package com.techlabs.service.test;

import com.techlabs.service.DataService;

public class DataServiceTest {
	public static void main(String args[]) {
		DataService dataService1 =   DataService.getInstance();
		DataService dataService2 =  DataService.getInstance();
		dataService1.doSomeThing();
		dataService2.doSomeThing();
	}

}
