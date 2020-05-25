package string;

/**
 * 回文验证
 */
public class IsPalindrome {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            stringBuffer.append(s.charAt(i));
        }
        if (s.equals(stringBuffer.reverse().toString())) {
            return true;
        }
        return false;
    }

}
