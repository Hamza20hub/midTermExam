package string.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */

        //DONE
        String string = "Human brain is a biological learning machine";


        String word = "", small = "", large = "";
        String[] words = new String[100];
        int length = 0;

        string = string + " ";

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                word = word + string.charAt(i);
            } else {
                words[length] = word;
                length++;
                word = "";
            }
        }
        small = large = words[0];

        for (int k = 0; k < length; k++) {

            if (small.length() > words[k].length())
                small = words[k];

            if (large.length() < words[k].length())
                large = words[k];
        }
        System.out.println("Smallest word: " + small);
        System.out.println("Largest word: " + large);
        System.out.println("The length of the largest word is: " + large.length());


    }
}