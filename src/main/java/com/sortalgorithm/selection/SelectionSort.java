package com.sortalgorithm.selection;


import com.sortalgorithm.common.CommonMethod;

public class SelectionSort {
    public static void main(String[] args) throws Exception {

        int[] nums = CommonMethod.getArray();
        selectionSort(nums);

        CommonMethod.printArray(nums);
    }

    public static int[] selectionSort(int[] nums) {
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