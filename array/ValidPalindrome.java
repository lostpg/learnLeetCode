// 2018.11.27
// https://leetcode-cn.com/problems/valid-palindrome/description/
public class ValidPalindrome {
    public static void main(String[] args) {
        // String s = "A man, a plan, a canal: Panama";
        String s = "race a car";
        System.out.println(new Solution().isPalindrome(s));
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0)
            return true;
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder(s.length());
        char[] chs = s.toCharArray();
        for (char c : chs) {
            if (c >= 'a' && c <= 'z' || c >= '0' && c <= '9')
                sb.append(c);
        }
        chs = sb.toString().toCharArray();
        int len = chs.length;
        for (int i = 0; i < len / 2; ++i) {
            if (chs[i] != chs[len - 1 - i])
                return false;
        }
        return true;
    }
}
