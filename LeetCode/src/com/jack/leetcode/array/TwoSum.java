package com.jack.leetcode.array;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * 来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/two-sum 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author CrazyJack262
 * @date 2020/05/10/23:18
 */
public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int[] ret = new int[2];
		for (int i = 0; i < nums.length; i++) {
			int temp = nums[i];
			int subTemp = target - temp;
			ret[0] = i;
			for (int j = i + 1; j < nums.length; j++) {
				int code = nums[j];
				if (code == subTemp) {
					ret[1] = j;
					return ret;
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		TwoSum twoSum = new TwoSum();
		twoSum.twoSum(nums, target);
	}
}
