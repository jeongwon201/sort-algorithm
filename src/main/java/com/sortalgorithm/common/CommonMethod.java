package com.sortalgorithm.common;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CommonMethod {
    public static int[] getArray() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("정렬할 배열을 입력하세요. ex) 1 3 9 5 8\n");
        bw.flush();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[st.countTokens()];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        return nums;
    }

    public static void printArray(int[] nums) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int num : nums) {
            bw.write(num + " ");
        }

        bw.write("\n");
        bw.flush();
        bw.close();
    }
}
