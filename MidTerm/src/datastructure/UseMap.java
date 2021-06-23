package datastructure;

import com.sun.xml.internal.bind.v2.model.core.ID;
import parser.Student;

import java.util.*;
import java.util.stream.Collectors;
public class UseMap {
	public class Student {
		int id;
		String name;
		double Marks;


		public Student(int id, String name, double Marks) {
			this.id = id;
			this.name = name;
			this.Marks = Marks;
			List<Student> students = new ArrayList<>();
			students.add(new Student(1, "John", 140));
			students.add(new Student(2, "Ron", 250));
			students.add(new Student(3, "Rokcy", 122));
			students.add(new Student(4, "Christina", 120));
			System.out.println(students.stream());



		}

	}

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[Oracle, MySql] to store data and retrieve data.
         */
		//DONE

		Map<String,List<Student>> students = new HashMap<String,List<Student>>();
		System.out.println(students.size());
        Map<String, List<String>> list = new HashMap<String, List<String>>();
        list.put("ID", Arrays.asList("001", "002", "003", "004", "005"));
        list.put("NAME", Arrays.asList("Anhar", "Adnan", "Aklak", "Ashfak", "Ashraf"));
        list.put("Address", Arrays.asList("Sylhet", "Dhaka", "Chittagong", "Khaulna", "Borishal"));
        System.out.println(list);
        Collection<List<String>> value = list.values();
        for (List<String> stringList : value) {
            System.out.println(stringList);

        }


    }




}



