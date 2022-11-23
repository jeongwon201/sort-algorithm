package com.sortalgorithm.bubble;


import com.sortalgorithm.common.CommonMethod;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) throws Exception {

        System.out.println("사용할 정렬의 번호를 입력하세요.");
        System.out.println("1. 버블 정렬");
        System.out.println("2. 조건이 추가된 버블 정렬");

        Scanner sc = new Scanner(System.in);

        int s = Integer.parseInt(sc.nextLine());

        int[] nums = CommonMethod.getArray();


        switch (s) {
            case 1:
                bubbleSort(nums);
            case 2:
                bubbleSortWithCondition(nums);
        }

        CommonMethod.printArray(nums);
    }

    public static int[] bubbleSort(int[] nums) {

        for (int round = 1; round < nums.length; round++) {

            for (int idx = 0; idx < nums.length - round; idx++) {
                if (nums[idx] > nums[idx + 1]) {
                    int tmp = nums[idx];
                    nums[idx] = nums[idx + 1];
                    nums[idx + 1] = tmp;
                }
            }
        }

        return nums;
    }

    public static int[] bubbleSortWithCondition(int[] nums) {

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

        return nums;
    }
}
