package math.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};

        int n = 0;
        for (int i = 0; i < array.length; i++) {
            n = n + array[i];
        }
        System.out.println(n);

        int n1 = 0;
        for (int j = 1; j <= 10; j++) {
            n1 = n1 + j;
        }

        System.out.println(n1);
        System.out.println("Missing Number: " + (n1 - n));

    }


}