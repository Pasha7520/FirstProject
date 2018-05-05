package Pharmasy;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date ;
import java.util.Scanner ;

import com.mysql.cj.api.jdbc.Statement;
import com.mysql.cj.jdbc.Driver;

public class main {
	public static void main(String[] args) throws Exception {
		
		Scanner scn = new Scanner(System.in);
		User user = new User();
		Menu menu = new Menu();
		Authorization authorization = new Authorization();
		if(authorization.authorization(user)){
			menu.menu(user);
			
		}
		else System.out.println("You aren't authorized");
		
		System.out.println("Bye bye!!")	;
		
	}

}
