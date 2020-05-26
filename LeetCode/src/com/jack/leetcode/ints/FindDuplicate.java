package com.jack.leetcode.ints;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-the-duplicate-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class FindDuplicate {
    public static int findDuplicate(int[] nums) {
        Set<Integer> ret = new HashSet<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (ret.contains(nums[i])) {
                return nums[i];
            } else {
                ret.add(nums[i]);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {3, 1, 3, 4, 2};
        System.out.println(findDuplicate(a));
    }
}
