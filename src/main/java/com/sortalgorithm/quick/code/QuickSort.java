package com.sortalgorithm.quick.code;

public class QuickSort {

    static void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int lo, int hi) {
        if (lo >= hi) {
            return;
        }

        medianSort(arr, lo, hi);
        int pivot = partition(arr, lo, hi);

        quickSort(arr, lo, pivot - 1);
        quickSort(arr, pivot + 1, hi);
    }

    private static int partition(int[] arr, int left, int right) {
        int lo = left;
        int hi = right;
        int pivot = arr[left];

        while (lo < hi) {
            while (arr[hi] > pivot && lo < hi) {
                hi--;
            }

            while (arr[lo] <= pivot && lo < hi) {
                lo++;
            }

            swap(arr, lo, hi);
        }

        swap(arr, left, lo);

        return lo;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void medianSort(int[] arr, int start, int end) {
        int mid = (start + end) / 2;

        if (arr[start] > arr[mid]) {
            swap(arr, end, mid);
        }

        if (arr[start] > arr[end]) {
            swap(arr, start, end);
        }

        if (arr[mid] > arr[end]) {
            swap(arr, mid, end);
        }

        swap(arr, mid, start);
    }
}
