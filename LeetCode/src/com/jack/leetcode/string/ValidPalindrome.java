package com.jack.leetcode.string;

/**
 * @author CrazyJack
 */
public class ValidPalindrome {

    public static boolean validPalindrome(String s) {
        int length = s.length();
        StringBuffer temp = new StringBuffer();
        for (int i = 0; i < length; i++) {
            temp.append(s.charAt(i));
        }
        if (temp.toString().equals(temp.reverse().reverse().toString())) {
            return true;
        }

        int leakPoint = 0;
        for (int i = 0; i < length; i++) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int j = 0; j < length; j++) {
                if (j != leakPoint) {
                    stringBuffer.append(s.charAt(j));
                }
            }
            String asc = stringBuffer.toString();
            String desc = stringBuffer.reverse().toString();
            System.out.println("asc -->" + asc);
            System.out.println("desc -->" + desc);
            if (asc.length() > 1 && asc.equals(desc)) {
                return true;
            }
            leakPoint++;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(validPalindrome("yd"));

    }
}
