package math.problems;

import javafx.scene.transform.Scale;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int number;
        long factorial = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("enter number :");
        number = input.nextInt();
        input.close();

        if (number < 1) {
            System.out.println("Cant find the Factorial of Negative number ");
        } else if (number <= 1)
            System.out.printf(" %d != %d", number, factorial);

        else {
            for (int counter = number; counter >= 2; counter--) {
                factorial = factorial * counter;
            }

        }
        System.out.printf(" %d != %d",number, factorial);
    }

}

