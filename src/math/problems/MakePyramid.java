package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */
        pyramid(6);
    }
    public static void pyramid(int heights) {
        for (int i = 0; i < heights; i++) {

            for (int j = heights-i; j > 0; j--) {
                System.out.print(" ");

            }

            for (int k=0;k<=i;k++){
                System.out.print("*");
            }
            for (int l = 0;l<i;l++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}




