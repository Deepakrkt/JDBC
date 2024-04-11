package jdbc.com.in;

import java.sql.Connection;

import jdbc.com.util.DBUtil;
import jdbc.com.util.DBUtil2;
import jdbc.com.util.DBUtil3;

public class EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// return connection object
		Connection connection = DBUtil.getConnection();
		if(connection != null)
			System.out.println("JDBC:connection 1 is taken..");
		Connection connection2 = DBUtil2.getConnection();
		if(connection2 != null)
			System.out.println("JDBC:connection 2 is taken..");
		
		Connection connection3 = DBUtil3.getConnection();
		if(connection3 != null)
			System.out.println("JDBC:connection 3 is taken..");

	}

}
