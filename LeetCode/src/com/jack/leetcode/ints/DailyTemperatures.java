package com.jack.leetcode.ints;

/**
 * @author crazyjack262
 * @date 2020-06-11 09:55
 */
public class DailyTemperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] temp = new int[temperatures.length];
        int max = 0;
        for (int i = 0; i < temperatures.length; i++) {
            int temperature = temperatures[i];
            if (temperature > max) {
                max = temperature;
            }
            temp[i] = max;
        }
        return null;
    }

    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        dailyTemperatures(temperatures);
    }
}
