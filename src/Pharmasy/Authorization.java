package Pharmasy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.mysql.cj.api.jdbc.Statement;

import java.sql.Connection;

public class Authorization {
	public boolean authorization(User user) throws IOException, SQLException{
		
		
		Scanner scn = new Scanner(System.in);
		boolean enter = true;
		while(enter){
			System.out.println("Enter the login ");
			String login = scn.nextLine();
			System.out.println("Enter the password ");
			String password = scn.nextLine();
			JDBC jdbc = new JDBC("users");
			ResultSet resultSet = jdbc.getResultSet();
			String line = "";
			while(resultSet.next()){
				if(resultSet.getString("login").equals(login)){
					if(resultSet.getString("password").equals(password)){
						
						System.out.println("Hello "+login+"!!");
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
		String again = scn.nextLine();
		if(again.equals("1")){
			enter = true;
		}
		else return false;
		}
		
		/////////////////////////////////////////
		
		return false;
		
	}
	
	
	
		
	
}
