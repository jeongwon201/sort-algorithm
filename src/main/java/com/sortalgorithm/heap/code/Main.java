package com.sortalgorithm.heap.code;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 3, 1, 11};

        System.out.println("[Heap Sort]");
        System.out.println("arr:        " + Arrays.toString(arr));
        HeapSort.sort(arr);
        System.out.println("sorted arr: " + Arrays.toString(arr));
    }
}
