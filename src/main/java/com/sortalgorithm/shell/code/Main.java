package com.sortalgorithm.shell.code;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {9, 5, 7, 3, 6, 2, 8, 1, 4};

        System.out.println("arr              : " + Arrays.toString(arr));
        System.out.println("sorted arr(shell): " + Arrays.toString(ShellSort.sort(arr, GapSequence.Ciura)));
    }
}
