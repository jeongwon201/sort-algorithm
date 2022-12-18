package com.sortalgorithm.bubble.code;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        int[] bubbleSortArr = {9, 5, 7, 3, 6, 2, 8, 1, 4};
        int[] bubbleWithConditionArr = {9, 5, 7, 3, 6, 2, 8, 1, 4};

        System.out.println("[Bubble Sort]");
        System.out.println("arr        : " + Arrays.toString(bubbleSortArr));
        BubbleSort.sort(bubbleSortArr);
        System.out.println("sorted arr : " + Arrays.toString(bubbleSortArr));

        System.out.println();

        System.out.println("[Bubble Sort With Condition]");
        System.out.println("arr        : " + Arrays.toString(bubbleWithConditionArr));
        BubbleSort.sortWithCondition(bubbleWithConditionArr);
        System.out.println("sorted arr : " + Arrays.toString(bubbleWithConditionArr));
    }
}
