package com.sortalgorithm.countring.code;


class CountingSort {

    // 최댓값 구하기
    static int max(int[] nums) {
        int max = 0;
        for (int num : nums) {
            if (max < num) max = num;
        }

        return max;
    }

    static int[] sort(int[] nums) {
        // 입력 배열의 최댓값 구하기
        int max = max(nums);

        int[] sortedNums = new int[nums.length];
        int[] count = new int[max + 1];

        // 입력 배열의 요소 카운트
        for (int num : nums) {
            count[num]++;
        }

        // 카운팅 배열 누적합 구하기
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // 정렬된 출력 배열 구하기
        for (int i = nums.length - 1; i >= 0; i--) {
            int num = nums[i];
            count[num]--;
            sortedNums[count[num]] = num;
        }

        return sortedNums;
    }
}
