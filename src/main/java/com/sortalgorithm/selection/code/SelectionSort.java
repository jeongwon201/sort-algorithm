package com.sortalgorithm.selection.code;

class SelectionSort {
    static int[] sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int min_idx = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[min_idx] > nums[j]) {
                    min_idx = j;
                }
            }

            // swap
            int temp = nums[i];
            nums[i] = nums[min_idx];
            nums[min_idx] = temp;
        }

        return nums;
    }
}