package defaultpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Account {
	
	public Connection getConn() throws SQLException{ //when we call this method it tells that it throws an exception
		//if we don't handle it properly.It becomes the responsibility to handle the exception where we call the method 
		String url="jdbc:mysql://localhost:3306";
		String user = "Sandeep";
		String password = "Parihar";
		Connection conn = null;
		conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
	
	public void withdraw(int amount) throws SQLException{
		getConn();
		
	}

}
