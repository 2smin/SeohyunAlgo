package week1.pjnw1236;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        printInsertionSortProcess(arr);
        /*
        [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
        [9, 10, 8, 7, 6, 5, 4, 3, 2, 1]
        [9, 8, 10, 7, 6, 5, 4, 3, 2, 1]
        [8, 9, 10, 7, 6, 5, 4, 3, 2, 1]
        [8, 9, 7, 10, 6, 5, 4, 3, 2, 1]
        [8, 7, 9, 10, 6, 5, 4, 3, 2, 1]
        [7, 8, 9, 10, 6, 5, 4, 3, 2, 1]
        [7, 8, 9, 6, 10, 5, 4, 3, 2, 1]
        [7, 8, 6, 9, 10, 5, 4, 3, 2, 1]
        [7, 6, 8, 9, 10, 5, 4, 3, 2, 1]
        [6, 7, 8, 9, 10, 5, 4, 3, 2, 1]
        [6, 7, 8, 9, 5, 10, 4, 3, 2, 1]
        [6, 7, 8, 5, 9, 10, 4, 3, 2, 1]
        [6, 7, 5, 8, 9, 10, 4, 3, 2, 1]
        [6, 5, 7, 8, 9, 10, 4, 3, 2, 1]
        [5, 6, 7, 8, 9, 10, 4, 3, 2, 1]
        [5, 6, 7, 8, 9, 4, 10, 3, 2, 1]
        [5, 6, 7, 8, 4, 9, 10, 3, 2, 1]
        [5, 6, 7, 4, 8, 9, 10, 3, 2, 1]
        [5, 6, 4, 7, 8, 9, 10, 3, 2, 1]
        [5, 4, 6, 7, 8, 9, 10, 3, 2, 1]
        [4, 5, 6, 7, 8, 9, 10, 3, 2, 1]
        [4, 5, 6, 7, 8, 9, 3, 10, 2, 1]
        [4, 5, 6, 7, 8, 3, 9, 10, 2, 1]
        [4, 5, 6, 7, 3, 8, 9, 10, 2, 1]
        [4, 5, 6, 3, 7, 8, 9, 10, 2, 1]
        [4, 5, 3, 6, 7, 8, 9, 10, 2, 1]
        [4, 3, 5, 6, 7, 8, 9, 10, 2, 1]
        [3, 4, 5, 6, 7, 8, 9, 10, 2, 1]
        [3, 4, 5, 6, 7, 8, 9, 2, 10, 1]
        [3, 4, 5, 6, 7, 8, 2, 9, 10, 1]
        [3, 4, 5, 6, 7, 2, 8, 9, 10, 1]
        [3, 4, 5, 6, 2, 7, 8, 9, 10, 1]
        [3, 4, 5, 2, 6, 7, 8, 9, 10, 1]
        [3, 4, 2, 5, 6, 7, 8, 9, 10, 1]
        [3, 2, 4, 5, 6, 7, 8, 9, 10, 1]
        [2, 3, 4, 5, 6, 7, 8, 9, 10, 1]
        [2, 3, 4, 5, 6, 7, 8, 9, 1, 10]
        [2, 3, 4, 5, 6, 7, 8, 1, 9, 10]
        [2, 3, 4, 5, 6, 7, 1, 8, 9, 10]
        [2, 3, 4, 5, 6, 1, 7, 8, 9, 10]
        [2, 3, 4, 5, 1, 6, 7, 8, 9, 10]
        [2, 3, 4, 1, 5, 6, 7, 8, 9, 10]
        [2, 3, 1, 4, 5, 6, 7, 8, 9, 10]
        [2, 1, 3, 4, 5, 6, 7, 8, 9, 10]
        [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
         */
    }

    public static void printInsertionSortProcess(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        for (int i=1; i<n; i++) {
            for (int j=i-1; j>=0; j--) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
    }
}