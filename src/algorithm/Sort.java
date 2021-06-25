package algorithm;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Vector;

public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */


    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++)
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j - 1] = temp;
                }

        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public int[] mergeSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        if (array.length <= 1) {
            return array;
        }
        int midpoint = array.length / 2;
        int[] left = new int[midpoint];
        int[] right;
        if (array.length % 2 == 0) {
            right = new int[midpoint];

        } else {
            right = new int[midpoint + 1];
        }
        for (int i = 0; i < midpoint; i++) {
            left[i] = array[i];
        }
        for (int j = 0; j < right.length; j++) {
            right[j] = array[midpoint + j];
        }
        int[] result = new int[array.length];
        left = mergeSort(left);
        right = mergeSort(right);
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    private static void merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftPointer, rightPointer, resultPointer;
        leftPointer = rightPointer = resultPointer = 0;
        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {

                    if (left[leftPointer] < right[rightPointer]) {
                        result[resultPointer++] = left[leftPointer++];

                } else{
                    result[resultPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];
            } else if (rightPointer < right.length) {
                result[resultPointer++] = right[rightPointer++];
            }

        }
    }


    public void quickSort(int[] array, int low, int high) {

        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        if (low > high) return;

        int mid = low + (high - low) / 2;
        int pivot = array[mid];
        int i = low;
        int j = high;
        while (i <= j) {
            while (array[i] < pivot)
                i++;
            while (array[j] > pivot)
                j--;
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);
        if (high > i)
            quickSort(array, i, high);

    }





    public int[] heapSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < array.length; i++) {
            minHeap.add(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = minHeap.poll();
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;


    }


    static void bucketSort(float arr[], int n) {
        if (n <= 0)
            return;

        // 1) Create n empty buckets
        @SuppressWarnings("unchecked")
        Vector<Float>[] buckets = new Vector[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new Vector<Float>();

        }

        // 2) Put array elements in different buckets
        for (int i = 0; i < n; i++) {
            float idx = arr[i] * n;
            buckets[(int) idx].add(arr[i]);
        }

        // 3) Sort individual buckets
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        // 4) Concatenate all buckets into arr[]
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }
    }

    // Driver code
    public static void main(String args[]) {
        float arr[] = {(float) 0.897, (float) 0.565,
                (float) 0.656, (float) 0.1234,
                (float) 0.665, (float) 0.3434};

        int n = arr.length;
        bucketSort(arr, n);

        System.out.println("Sorted array is ");
        for (float el : arr) {
            System.out.print(el + " ");
        }
    }


    public int[] shellSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int temp = 0, index, flag = 1;
        int d = list.length;
        while (flag == 1 || (d > 1)) {
            flag = 0;

            for (index = 0; index < (list.length - d); index++) ;
            if (list[index + d] < list[index]) ;
            list[index] = temp;
            flag = 1;
            final long endTime = System.currentTimeMillis();
            final long executionTime = endTime - startTime;
            this.executionTime = executionTime;
            return list;
        } final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
