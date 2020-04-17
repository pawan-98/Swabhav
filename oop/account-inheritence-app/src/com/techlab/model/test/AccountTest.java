package com.techlab.model.test;

import java.io.ObjectInputStream.GetField;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.techlab.model.Account;
import com.techlab.model.CurrentAccount;
import com.techlab.model.SavingsAccount;

public class AccountTest {
	public static void main(String args[]) throws ParseException {
	
//
//		String sDate1="15/04/2020";  
//	    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
//	    System.out.println(date1);
//	    
	    
//		code for date to str
//	    SimpleDateFormat formatte = new SimpleDateFormat("MM/dd/yyyy");  
//	    String strDate = formatte.format(date1);  
//	    System.out.println("Date Format with MM/dd/yyyy : "+strDate);  
//	    
//		
		Account acc1 = new SavingsAccount(101, "pawan", 7000,"03/19/2011","04/20/2011");
		acc1.withdraw(700);
		
		Account acc2 = new CurrentAccount(102, "amit", 7000,"05/16/2011","03/15/2011");
		acc2.withdraw(8000);
		
		printInfo(acc1);
		printInfo(acc2);
	
	}
	public static void printInfo(Account acc) {
		System.out.println("Account:- "+ acc.getAccNo());
		System.out.println("Balance:- "+ acc.getBalnce());
		System.out.println("Name:-"+ acc.getName());
		System.out.println("Date of creation:- "+ acc.getCreationDate());
		System.out.println("Date of birth:-"+ acc.getDateOfBirth());
		
	}

}
