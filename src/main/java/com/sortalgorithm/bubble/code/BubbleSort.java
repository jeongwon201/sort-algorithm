package com.sortalgorithm.bubble.code;

class BubbleSort {

    static void sort(int[] nums) {

        for (int round = 1; round < nums.length; round++) {

            for (int idx = 0; idx < nums.length - round; idx++) {
                if (nums[idx] > nums[idx + 1]) {
                    int tmp = nums[idx];
                    nums[idx] = nums[idx + 1];
                    nums[idx + 1] = tmp;
                }
            }
        }
    }

    static void sortWithCondition(int[] nums) {

        for (int round = 1; round < nums.length; round++) {

            boolean swapped = false;

            for (int idx = 0; idx < nums.length - round; idx++) {
                if (nums[idx] > nums[idx + 1]) {
                    int tmp = nums[idx];
                    nums[idx] = nums[idx + 1];
                    nums[idx + 1] = tmp;

                    swapped = true;
                }
            }

            if (swapped == false) {
                break;
            }
        }
    }
}