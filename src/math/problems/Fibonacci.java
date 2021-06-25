package math.problems;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int nToPrint;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter How many numbers you want to print : ");
        nToPrint = scanner.nextInt();

        int current = 1;
        int last = 0;
        System.out.println(last);
        System.out.println(current);

        int lastLast;
        for (int i = 0; i < nToPrint; i++) {
            lastLast = last;
            last = current;
            current = lastLast + last;
            System.out.println(current);
        }


    }
    //Below Part is not required

    public static int length() {
        int length = 0;
        return length;
 //Implement: check the length of the numbers

    }
    }
