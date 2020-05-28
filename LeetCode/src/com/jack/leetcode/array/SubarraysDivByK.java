package com.jack.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 A，返回其中元素之和可被 K 整除的（连续、非空）子数组的数目。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 输入：A = [4,5,0,-2,-3,1], K = 5
 * 输出：7
 * 解释：
 * 有 7 个子数组满足其元素之和可被 K = 5 整除：
 * [4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= A.length <= 30000
 * -10000 <= A[i] <= 10000
 * 2 <= K <= 10000
 * <p>
 * <p>
 * 同余定理 只要余数相同 他们一定能被K整除
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/subarray-sums-divisible-by-k
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SubarraysDivByK {
    public static int subarraysDivByK(int[] A, int K) {
        Map<Integer, Integer> record = new HashMap<>();
        record.put(0, 1);
        int sum = 0, ans = 0;
        for (int elem : A) {
            sum += elem;
            int modulus = Math.floorMod(sum, K);
            System.out.println("modulus-->" + modulus);
            int same = record.getOrDefault(modulus, 0);
            System.out.println("same-->" + same);
            ans += same;
            System.out.println("ans-->" + ans);
            record.put(modulus, same + 1);
            System.out.println("-------------");
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {0, 0, 4, 4, 4};
        System.out.println(subarraysDivByK(A, 5));
    }
}
