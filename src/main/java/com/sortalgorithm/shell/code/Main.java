package com.sortalgorithm.shell.code;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {9, 5, 7, 3, 6, 2, 8, 1, 4};

        System.out.println("[Shell Sort - Ciura]");
        System.out.println("arr       : " + Arrays.toString(arr));
        ShellSort.sort(arr, GapSequence.Ciura);
        System.out.println("sorted arr: " + Arrays.toString(arr));
    }
}
