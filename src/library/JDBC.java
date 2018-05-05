package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.api.jdbc.Statement;
import com.mysql.cj.jdbc.Driver;

public class JDBC {
	private static final ResultSet ResultSet = null;
	public final String URL = "jdbc:mysql://localhost:3306/library?serverTimezone=UTC";
	private final String NAME = "root";
	private final String PASSWORD = "root";
	private Connection connection;
	private Statement statement;
	private ResultSet resultSet;
	
	
	JDBC(String s) throws SQLException{
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		connection = DriverManager.getConnection(URL,NAME,PASSWORD);
		statement = (Statement)connection.createStatement();
		resultSet = statement.executeQuery("SELECT * FROM "+s);
		
	}
	public ResultSet getResultSet(){
		return this.resultSet;
	}
	public void closeConnection(){
		try {
			this.connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void closeStatement(){
		try {
			this.statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Statement getStatement(){
		return this.statement;
	}
}
