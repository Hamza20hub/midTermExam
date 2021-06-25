package math.problems;

import java.util.ArrayList;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[ Oracle, MySql] to store data and retrieve data.
		 *
		 */
		//DONE
		System.out.println( findPrime(2,1000000));

	}
public static ArrayList<Integer>findPrime(int start, int end ){
		ArrayList<Integer>primes= new ArrayList<Integer>();
		for (int n = start;n<end;n++){
			boolean prime =true;

			int i=2;
			while (i<=n/2){
				if (n%i==0){
					 prime=false;
					 break;
				}
				i++;
			}
			if (prime){
				primes.add(n);
			}
		}
		return primes;
}
}
