package com.sortalgorithm.insertion.code;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {9, 5, 7, 3, 6, 2, 8, 1, 4};

        System.out.println("[Insertion Sort]");
        System.out.println("arr       : " + Arrays.toString(arr));
        InsertionSort.sort(arr);
        System.out.println("sorted arr: " + Arrays.toString(arr));
    }
}
