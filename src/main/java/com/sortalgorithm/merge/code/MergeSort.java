package com.sortalgorithm.merge.code;

public class MergeSort {

    static int[] sortedArr;

    static void sort_recursive(int[] arr) {
        sortedArr = new int[arr.length];
        recursive(arr, 0, arr.length - 1);
    }

    static void sort(int[] arr) {
        sortedArr = new int[arr.length];

        int right = arr.length - 1;

        for (int size = 1; size <= right; size += size) {

            for (int l = 0; l <= right - size; l += (2 * size)) {
                int low = l;
                int mid = l + size - 1;
                int high = Math.min(l + (2 * size) - 1, right);
                merge(arr, low, mid, high);
            }
        }
    }

    private static void recursive(int arr[], int left, int right) {
        if (left != right) {
            int mid = (left + right) / 2;

            recursive(arr, left, mid);
            recursive(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int l = left;
        int r = mid + 1;
        int idx = left;

        while (l <= mid && r <= right) {
            if (arr[l] <= arr[r]) {
                sortedArr[idx] = arr[l];
                idx++;
                l++;
            } else {
                sortedArr[idx] = arr[r];
                idx++;
                r++;
            }
        }

        if (l > mid) {
            while (r <= right) {
                sortedArr[idx] = arr[r];
                idx++;
                r++;
            }
        } else {
            while (l <= mid) {
                sortedArr[idx] = arr[l];
                idx++;
                l++;
            }
        }

        for (int i = left; i <= right; i++) {
            arr[i] = sortedArr[i];
        }
    }
}
