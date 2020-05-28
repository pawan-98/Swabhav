package singleton.pattern.model.test;

import singleton.pattern.model.Database;

public class DatabaseTest {
	public static void main(String[] args) {
	      Database database;

	      database= Database.getInstance();
	      
	      System.out.println(database.getConnection());
	   }
}
