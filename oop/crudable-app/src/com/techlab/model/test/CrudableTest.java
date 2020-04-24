package com.techlab.model.test;

import com.techlab.model.AddressDB;
import com.techlab.model.CustomerDB;
import com.techlab.model.Database;
import com.techlab.model.ICrudable;
import com.techlab.model.OrderDB;

public class CrudableTest {
	public static void main(String arg[]) {
		Database db = new Database();
		db.doDBOperations(new CustomerDB());
		db.doDBOperations(new AddressDB());
		db.doDBOperations(new OrderDB());
		
	}
	
}
