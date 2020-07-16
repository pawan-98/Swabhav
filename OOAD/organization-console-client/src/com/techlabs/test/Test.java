package com.techlabs.test;

import java.net.MalformedURLException;
import java.util.Map;

import com.techlabs.model.Employee;
import com.techlabs.model.OrgHierarchyBuilder;
import com.techlabs.model.UrlLoader;

public class Test {
	public static void main(String args[]) throws MalformedURLException {
		OrgHierarchyBuilder builder = new OrgHierarchyBuilder(new UrlLoader());
		Map<Integer,Employee> employees= builder.getData();
		
		System.out.println(employees.get(builder.getCeo().getId()).show(0));
		System.out.println(employees.get(builder.getCeo().getId()).showXML(0));
	}
}
