package crud.com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudInsert {
	private static final String DB_DRIVER_CLASS="com.mysql.cj.jdbc.Driver";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD="Sonu@89";
	private static final String DB_URL="jdbc:mysql://localhost:3306/employee";
	
	private static Connection connection = null;
	static{
		try {
			Class.forName(DB_DRIVER_CLASS);
			connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
			
			Statement st = connection.createStatement();
			
			String query = "INSERT INTO EMP_TABLE(EMP_ID,EMP_NAME) VALUES(4,'JIM')";
			int count =  st.executeUpdate(query);
			
			if(count == 0) {
				System.out.println("Record Not Inserted");
			}else {
				System.out.println("Record Inserted");
			}
			
		}
		
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection(){
		return connection;
	}

}
