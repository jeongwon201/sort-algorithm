package com.sortalgorithm.merge.code;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr_recursive = {7, 1, 5, 3, 6, 2, 8, 4};
        int[] arr = {7, 1, 5, 3, 6, 2, 8, 4};

        System.out.println("[Merge Sort - Recursive]");
        System.out.println("arr_recursive:        " + Arrays.toString(arr_recursive));
        MergeSort.sort_recursive(arr_recursive);
        System.out.println("sorted arr_recursive: " + Arrays.toString(arr_recursive));

        System.out.println();
        System.out.println("[Merge Sort]");
        System.out.println("arr:        " + Arrays.toString(arr));
        MergeSort.sort(arr);
        System.out.println("sorted arr: " + Arrays.toString(arr));
    }
}