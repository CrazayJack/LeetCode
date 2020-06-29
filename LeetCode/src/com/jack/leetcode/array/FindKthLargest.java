package com.jack.leetcode.array;

import java.util.Arrays;

/**
 * 找到第K大的数字
 *
 * @author crazyjack262
 * @date 2020-06-29 09:19
 */
public class FindKthLargest {
    public static int findKthLargest(int[] nums, int k) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);

        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        int[] nums = {2, 1};
        System.out.println(findKthLargest(nums, 2));
    }
}
