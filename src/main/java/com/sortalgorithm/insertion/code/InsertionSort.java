package com.sortalgorithm.insertion.code;


class InsertionSort {

    static int[] sort(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            int target = nums[i];

            int prevIdx = i - 1;

            while (prevIdx >= 0 && target < nums[prevIdx]) {
                nums[prevIdx + 1] = nums[prevIdx];
                prevIdx--;
            }

            nums[prevIdx + 1] = target;
        }

        return nums;
    }
}
