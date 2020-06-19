package com.techlabs.service.test;

import com.techlabs.service.DataService;

public class DataServiceTest {
	public static void main(String args[]) {
		DataService dataService1 =   DataService.INSTANCE;
		DataService dataService2 =  DataService.INSTANCE;
		dataService1.doSomeThing();
		dataService2.doSomeThing();
	}

}
