package library;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Authorization {
	Scanner scn = new Scanner(System.in);
	boolean enter = true;
	int repeat = 0;
	public boolean authorization(User user) throws SQLException{
		while(enter){
		System.out.println("Enter the login ");
		String login = scn.nextLine();
		System.out.println("Enter the password");
		String password = scn.nextLine();
		JDBC jdbc = new JDBC("authorization");
		ResultSet resultSet = jdbc.getResultSet();
		String line ="";
		while(resultSet.next()){
			if(resultSet.getString("login").equals(login)){
				if(resultSet.getString("password").equals(password)){
					System.out.println("Hello "+ login);
					user.setName(login);
					user.setPassword(password);
					return true;
				}
			}
			
		}
		jdbc.closeStatement();
		jdbc.closeConnection();
		System.out.println("Incorrect login or password");
		System.out.println("Want to try agein ?if yes press \"1\",if not press\"2\"");
		repeat = scn.nextInt();
		if(repeat == 1){
			
		}
		else return false;
		}
		return false;
	}

}
