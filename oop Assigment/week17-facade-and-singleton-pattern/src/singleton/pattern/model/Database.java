package singleton.pattern.model;

public class Database {
	private static Database databaseObject;

	private Database() {
	}
 
	public static Database getInstance() {

		if (databaseObject == null) {
			databaseObject = new Database();
		}

		return databaseObject;
	}

	public String getConnection() {
		return "Connection to database has been successfull!";
	}

}
