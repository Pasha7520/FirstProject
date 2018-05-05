package library;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class main {

	public static void main(String[] args) throws SQLException {
		JDBC jdbc = new JDBC("person");
		/*User user = new User();
		JDBC jdbc = new JDBC("person where position <> 'Cleaner'");
		ResultSet resultSet = jdbc.getResultSet();
		Statement statement = jdbc.getStatement();
		String login ;
		String personId;
		List<String> logList = new ArrayList();
		List<String> persList = new ArrayList();
		while(resultSet.next()){
			login = resultSet.getString("person_name")+"_"+resultSet.getString("person_sername");
			personId = resultSet.getString("id");
			
			logList.add(login);
			persList.add(personId);
			System.out.println(login);
		
			
		
		}
		
		for(int i =0; i<logList.size(); i++){
			statement.execute("insert into authorization (id,login,password,person_id) value (null,'"+logList.get(i)+"','7520',"+persList.get(i)+ ");");
		}
		//statement.execute("insert into authorization (id,login,password,person_id) value (null,'"+login+"','7520',"+personId+ ");");
		
		
		jdbc.closeStatement();
		jdbc.closeConnection();*/
		
	}

}
