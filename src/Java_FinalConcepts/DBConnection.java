package Java_FinalConcepts;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static void main(String[] args) {

		Connection conn = null;
		Statement state = null;
		String DB_URL = "jdbc:mysql://172.16.167.181/ohdvp42";
		
		String USER = "appUser";
		String PASS = "omm@app789";
		
		try{
			System.out.println("Connection to a selected database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connected database.......");
		}
		catch (Exception e) {
			System.out.println("Bad");
		}
		
	}

}
