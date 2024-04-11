package crud.com.in;

import java.sql.Connection;

import crud.com.util.CRUDDelete;
import crud.com.util.CrudInsert;
import crud.com.util.Select;
import crud.com.util.Update;


public class EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// return connection object
		// Insert the data
//		Connection connection = CrudInsert.getConnection();
//		if(connection != null)
//			System.out.println("CRUD: Insert connection is taken..");
		
		// Delete the Data
//		Connection connection1 = CRUDDelete.getConnection();
//		if(connection1 != null)
//			System.out.println("CRUD:connection is taken..");

		// UPDATE the Data
		
//		Connection connection2 = Update.getConnection();
//		if(connection2 != null)
//			System.out.println("CRUD:Update connection is taken..");
		
		// Select the Data	
		Connection connection3 = Select.getConnection();
		if(connection3 != null)
			System.out.println("CRUD:Select connection is taken..");
		

	}

}
