package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		//DONE
		Queue<String> qu = new LinkedList<String>();
		qu.add("Oil");
		qu.add("Onion");
		qu.add("Garlic");
		qu.add("Ginger");
		qu.add("Chicken");
		qu.add("Spices");

		System.out.println(qu);
		System.out.println(qu.peek());
		System.out.println(qu.poll());
		System.out.println(qu);
		System.out.println(qu.size());
		System.out.println(qu.remove());
		System.out.println(qu.size());
		System.out.println(qu.element());
		System.out.println();

		for (int index =0;index< qu.size();index++ ){
			System.out.println(qu.element());
		}
		Iterator it = qu.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}


		}


	}


