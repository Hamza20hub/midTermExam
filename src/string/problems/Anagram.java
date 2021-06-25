package string.problems;

import java.util.Arrays;
import java.util.Locale;

/**
 * Created by mrahman on 04/22/17.
 */
//DONE
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
    String first = "Christin";
    String second = "Christen";

    boolean isAnagram = isAnagram(first,second);
        System.out.println(isAnagram);


    }

    private static boolean isAnagram(String first, String second) {
      char[]fstWord=  first.toLowerCase().replace(" ","").toCharArray();
        char[] sndWord=second.toLowerCase().replace(" ","").toCharArray();

        Arrays.sort(fstWord);
        Arrays.sort(sndWord);
        return Arrays.equals(fstWord,sndWord);

    }


}
