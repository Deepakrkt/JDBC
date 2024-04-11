package jdbc.pro.in;

import java.sql.Connection;

import jdbc.pro.util.DBUtil;



public class PropertyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// return connection object
		Connection connection = DBUtil.getConnection();
		if(connection != null)
			System.out.println("JDBC:connection with the help of Property is taken..");
		
	}

}
