package day13.kodewala.practice;

public class Database {

	String dbName, user, password;
	
	Database() {
		this("mydb","root","root@1");
	}
	
	Database(String _dbName, String _user, String _password) {
		this.dbName = _dbName;
		this.user = _user;
		this.password = _password;
		connect();
	}
	
	void connect() {
		System.out.println("Connecting to DB: " + dbName + " as " + user);
	}
	
	public static void main(String[] args) {
		Database db1 =  new Database();
		Database db2 = new Database("companyDb", "root2", "system12");
		
	}
}
