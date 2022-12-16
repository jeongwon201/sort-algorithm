package com.sortalgorithm.shell.code;

class ShellSort {

    static int getGap(int[] gapSequence, int length) {
        int idx = 0;

        while (gapSequence[idx] < length) {
            idx++;
        }

        // 서브 배열의 원소 개수를 최소 2개로 해야하기 때문에 1을 감소해야한다.
        return --idx;
    }

    static int[] sort(int[] nums, int[] gapSequence) {

        int gapIdx = getGap(gapSequence, nums.length);

        while (gapIdx >= 0) {
            int gap = gapSequence[gapIdx--];

            for (int idx = gap; idx < nums.length; idx++) {
                for (int j = idx; j >= gap && nums[j] < nums[j - gap]; j -= gap) {
                    int tmp = nums[j];
                    nums[j] = nums[j - gap];
                    nums[j - gap] = tmp;
                }
            }
        }

        return nums;
    }
}