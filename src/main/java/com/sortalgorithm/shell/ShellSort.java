package com.sortalgorithm.shell;


import com.sortalgorithm.common.CommonMethod;

import java.util.Scanner;

public class ShellSort {
    public static void main(String[] args) throws Exception {

        System.out.println("사용할 Gap Sequence 번호를 입력하세요.");
        System.out.println("1. Ciura");

        Scanner sc = new Scanner(System.in);

        int gs = Integer.parseInt(sc.nextLine());

        int[] gapSequence = null;
        int[] nums = CommonMethod.getArray();

        switch (gs) {
            case 1:
                gapSequence = GapSequence.Ciura;
        }

        shellSort(nums, gapSequence);
        CommonMethod.printArray(nums);
    }

    public static int getGap(int[] gapSequence, int length) {
        int idx = 0;

        while (gapSequence[idx] < length) {
            idx++;
        }

        // 서브 배열의 원소 개수를 최소 2개로 해야하기 때문에 1을 감소해야한다.
        return --idx;
    }

    public static int[] shellSort(int[] nums, int[] gapSequence) {

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