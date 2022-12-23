package com.sortalgorithm.bubble.code;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        int[] arr = {9, 5, 7, 3, 6, 2, 8, 1, 4};

        System.out.println("[Bubble Sort]");
        System.out.println("arr        : " + Arrays.toString(arr));
        BubbleSort.sort(arr);
        System.out.println("sorted arr : " + Arrays.toString(arr));
    }
}
