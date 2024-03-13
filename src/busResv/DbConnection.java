package busResv;

import java.sql.*;

public class DbConnection {
	
	private static final String url = "jdbc:mysql://localhost:3306/busresv";
	private static final  String user="root";
	private static final String pass="1305";
	
	 public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, user, pass);
		 
		 
	 }
}
