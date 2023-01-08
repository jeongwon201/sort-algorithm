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

    // 카운팅 정렬 응용하기
    // 누적합 과정을 생략하고 바로 결과를 출력합니다.
    static void sort_2(int[] a, int range) {
        int[] arr = new int[101]; // 수의 범위 : 0 ~ 100

        for (int i = 0; i < 50; i++) {	// 수열의 크기 : 50
            arr[(int) (Math.random() * 101)]++;	// 0 ~ 100, 계수를 하기 때문에 ++ 로 1씩 증가
        }

        for(int i = 0; i < arr.length; i++) {

            while(arr[i]-- > 0) {	// arr 값이 0보타 클 경우
                System.out.print(i + " ");
            }
        }
    }
}
