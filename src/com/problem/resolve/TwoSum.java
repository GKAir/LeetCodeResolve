package com.problem.resolve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhangweizhou
 * Email: zhangweizhou@wanhuchina.com
 * Date:  2017/11/10
 * Time:  13:35
 */

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum {

    public static void main(String[] args) throws InterruptedException {

        int target = 10;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] ints = twoSum(arr, target);

        System.out.println(System.nanoTime());
        System.out.println(Arrays.toString(ints));
        System.out.println(System.nanoTime());

    }

    private static int[] twoSum(int[] nums, int target) {
        int temp;
        List<Integer> tempList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            temp = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == temp) {
                    if (!(tempList.contains(i) || tempList.contains(j))) {
                        tempList.add(i);
                        tempList.add(j);
                    }
                }
            }
        }
        int[] arr = new int[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            arr[i] = tempList.get(i);
        }
        return arr;
    }
}
