package com.sortalgorithm.binaryinsertion.code;

public class BinaryInsertionSort {

    static void sort(int[] arr) {

        int incLength = getAscending(arr, 0, arr.length);
        binaryInsertionSort(arr, 0, arr.length, incLength);
    }

    static void binaryInsertionSort(int[] arr, int lo, int hi, int start) {
        if (lo == start) {
            start++;
        }

        for (; start < hi; start++) {
            int target = arr[start];

            int loc = binarySearch(arr, target, lo, start);

            int j = start - 1;

            while (j >= loc) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[loc] = target;
        }
    }

    static int binarySearch(int[] arr, int key, int lo, int hi) {
        int mid;

        while (lo < hi) {
            mid = lo + ((hi - lo) / 2);
            if (key < arr[mid]) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }

        return lo;
    }

    static int getAscending(int[] arr, int lo, int hi) {
        int limit = lo + 1;

        if (limit == hi) {
            return 1;
        }

        if (arr[lo] <= arr[limit]) {
            while (limit < hi && arr[limit - 1] <= arr[limit]) {
                limit++;
            }
        } else {
            while (limit < hi && arr[limit - 1] > arr[limit]) {
                limit++;
            }
            reverse(arr, lo, limit);
        }

        return limit - lo;
    }

    static void reverse(int[] arr, int lo, int hi) {
        hi--;

        while (lo < hi) {
            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;
            lo++;
            hi--;
        }
    }
}
