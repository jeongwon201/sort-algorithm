package com.sortalgorithm.bubble.code;

class BubbleSort {

    static void sort(int[] arr) {

        for (int round = 1; round < arr.length; round++) {

            boolean swapped = false;

            for (int idx = 0; idx < arr.length - round; idx++) {
                if (arr[idx] > arr[idx + 1]) {
                    int tmp = arr[idx];
                    arr[idx] = arr[idx + 1];
                    arr[idx + 1] = tmp;

                    swapped = true;
                }
            }

            if (swapped == false) {
                break;
            }
        }
    }
}