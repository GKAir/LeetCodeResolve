package com.problem.resolve;

import java.util.Arrays;

/**
 * Created by zhangweizhou
 * Email: zhangweizhou@wanhuchina.com
 * Date:  2017/11/10
 * Time:  17:42
 */
public class MaoPao {

    public static void main(String[] args) {
        int[] arr = {1, 2, 32, 43, 4, 5, 6, 45, 78, 76, 9};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = 0;
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
