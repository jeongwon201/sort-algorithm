package com.sortalgorithm.heap.code;

public class HeapSort {

    static void sort(int[] arr) {

        if (arr.length < 2) {
            throw new RuntimeException("길이가 2 이상인 배열만 정렬이 가능합니다.");
        }

        // 가장 마지막 노드의 부모 노드의 서브 트리부터 최대 힙으로 만들어간다.
        int lastOfParentIdx = ((arr.length - 1) - 1) / 2;

        for (int i = lastOfParentIdx; i >= 0; i--) {
            heapify(arr, i, arr.length - 1);
        }

        for (int idx = arr.length - 1; idx > 0; idx--) {

            // 가장 먼저 최대 힙을 구성한 후 정렬까지 SWAP 과정은 항상 일어난다.
            swap(arr, 0, idx);

            // SWAP 후 가장 마지막 노드를 제외한 나머지 노드를 다시 최대 힙으로 구성한다.
            heapify(arr, 0, idx - 1);
        }
    }

    static void heapify(int[] arr, int parent, int last) {
        int left, right, big;

        while ((parent * 2) + 1 <= last) {
            left = (parent * 2) + 1;
            right = (parent * 2) + 2;
            big = parent;

            if (arr[left] > arr[big]) {
                big = left;
            }

            // 오른쪽 노드의 유무를 판단하기 위해 마지막 인덱스와 비교하는 조건이 추가되었다.
            if (right <= last && arr[right] > arr[big]) {
                big = right;
            }

            // 미리 선언해 부모 노드의 인덱스로 초기화해둔 big 이 parent 와 같지 않다면,
            // 왼쪽 또는 오른쪽 자식이 더 크다는 의미이므로, SWAP 수행 후 자식 노드의 서브 트리가
            // 최대 힙의 조건을 만족하는 지 확인하기 위해, parent를 자식 노드의 인덱스로 변경해준다.
            if (big != parent) {
                swap(arr, parent, big);
                parent = big;
            } else {
                return;
            }
        }
    }

    static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
