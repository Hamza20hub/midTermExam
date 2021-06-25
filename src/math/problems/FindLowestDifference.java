package math.problems;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        int[] pair = findSmallestDifferencePair_Naive(array1, array2);
        System.out.println("Lowest difference::" + (pair[0] - pair[1]));

    }

    public static int[] findSmallestDifferencePair_Naive(int[] array1, int[] array2) {
        double smallestDiff = Double.MAX_VALUE;
        int[] smallestDiffPair = new int[2];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                int currentDiff = Math.abs(array1[i] - array2[j]);
                if (currentDiff < smallestDiff) {
                    smallestDiff = currentDiff;
                    smallestDiffPair[0] = array1[i];
                    smallestDiffPair[1] = array2[j];
                }
            }
        }
        return smallestDiffPair;
    }


}



