package datastructure;

import sun.nio.cs.StandardCharsets;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class DataReader {

	public static void main(String[] args) throws IOException {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.(Optional)
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = "/Users/anharuzzaman/Desktop/self-driving-car.txt";

			BufferedReader bufferedReader=null;

			try {
				File myObj = new File(textFile);
				Scanner myReader = new Scanner(myObj);
				while (myReader.hasNextLine()) {
					String data = myReader.nextLine();
					System.out.println(data);
				}
			}catch (IOException e) {
				System.out.println(e.getMessage());
			}
			finally {

			}
			System.out.println("Content of List:");
			System.out.println();
			// reading text file into ArrayList in Java 6
			BufferedReader bufReader = new BufferedReader(new FileReader(textFile));
			LinkedList<String> listOfLines = new LinkedList<>();
			String line = bufReader.readLine();
			while (line != null) {
				listOfLines.add(line);
				line = bufReader.readLine();

			}
			bufReader.close();
			System.out.println("Content of LinkedLiList:");
			System.out.println(listOfLines);
//			for (int i = 1; i <= listOfLines.size(); i++) {
//				System.out.println(listOfLines.get(i));
//			}
				listOfLines.add("This was taugh");
				listOfLines.add("took me over 2 hours");
				listOfLines.add("not sure how good i did!!!");
				System.out.println(listOfLines);

				//System.out.println(listOfLines);

		Iterator it = listOfLines.iterator();
		it.hasNext();

			}

		}




