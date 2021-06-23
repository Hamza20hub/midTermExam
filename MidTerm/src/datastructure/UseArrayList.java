package datastructure;

import java.util.ArrayList;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		//DONE
		ArrayList <String>users = new ArrayList<String>();
		users.add("Ashraf");
		users.add("Ahab");
		users.add("Ehsan");
		users.add("Asana");
		users.add("Anwar");
		System.out.println(users);
		users.remove(2);
		users.remove(1);
		System.out.println(users);
		System.out.println(users.get(0));

	}

}
