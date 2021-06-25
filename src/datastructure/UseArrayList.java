package datastructure;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		String url ="jdbc:mysql://localhost:3306/testdb";
		String user = "root";
		String pass = "Hamza@2020";


		/*
		 * Demonstrate how to use ArrayList that includes add,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		//DONE
		ArrayList<String> users = new ArrayList<String>();
		users.add("Ashraf");
		users.add("Ahab");
		users.add("Ehsan");
		users.add("Asana");
		users.add("Anwar");
		System.out.println(users);
		users.remove(2);

		System.out.println(users);
		System.out.println(users.get(0));
		System.out.println("-----------");
		for (String usr : users)
			System.out.println(usr + " ");
		System.out.println("-----------");
		int i= 0;
while (i< users.size()){
	System.out.println(users.get(i++)+" ");

}
//--------------------------------------------------------------------------\\
		try {
			Connection myConnect = DriverManager.getConnection(url, user, pass);
			Statement myStat = myConnect.createStatement();
			String sql= "select * from userArray";
			ResultSet rs = myStat.executeQuery(sql);
		}catch (SQLException e){
			e.printStackTrace();
		}


	}
}
