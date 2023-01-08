package com.sortalgorithm.countring.code;


class CountingSort {

    // 최댓값 구하기
    static int max(int[] arr) {
        int max = 0;
        for (int num : arr) {
            if (max < num) max = num;
        }

        return max;
    }

    static int[] sort(int[] arr) {
        // 입력 배열의 최댓값 구하기
        int max = max(arr);

        int[] sortedNums = new int[arr.length];
        int[] count = new int[max + 1];

        // 입력 배열의 요소 카운트
        for (int num : arr) {
            count[num]++;
        }

        // 카운팅 배열 누적합 구하기
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // 정렬된 출력 배열 구하기
        for (int i = arr.length - 1; i >= 0; i--) {
            int num = arr[i];
            count[num]--;
            sortedNums[count[num]] = num;
        }

        return sortedNums;
    }
}
