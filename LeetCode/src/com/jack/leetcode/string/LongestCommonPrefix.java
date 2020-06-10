package com.jack.leetcode.string;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author crazyjack262
 * @date 2020-06-10 14:39
 */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] str) {
        if (str.length == 0) {
            return "";
        }
        String prefix = str[0];
        for (int i = 1; i < str.length; i++) {
            String s = str[i];
            while (s.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.equals("")) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String b = "flow";
        System.out.println(b.indexOf("ow"));
        String[] test = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(test));
    }
}
