package com.jack.leetcode.string;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author CrazyJack
 * @date 2020/05/13/22:18
 */
public class LengthOfLongestSubstring {

	/**
	 * 使用左右两个指针标识字符串的左右边界
	 *
	 * @param s
	 * @return
	 */
	public int lengthOfLongestSubstring(String s) {
		if (s == null) {
			return 0;
		}
		int length = s.length();

		// 使用hash表存储出现过的字符 避免扩容
		Set<Character> characters = new HashSet<>(s.length());
		// 记录又边界位置
		int right = -1;
		// 记录最长字符串字符数
		int charMaxLength = 0;
		for (int i = 0; i < length; i++) {
			if (i != 0) {
				// 左边界不断向右移一位
				characters.remove(s.charAt(i - 1));
			}
			// 未到达最右边界且未出现重复字符时， 右边界不断向右移动
			while (right + 1 < length && !characters.contains(s.charAt(right + 1))) {
				characters.add(s.charAt(right + 1));
				right++;
			}
			charMaxLength = Math.max(charMaxLength, right - i + 1);
		}

		return charMaxLength;

	}
}
