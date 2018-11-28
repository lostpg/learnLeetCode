// 2018.11.27
// https://leetcode-cn.com/problems/reverse-integer/description/
public class ReverseInteger {
    public static void main(String[] args) {
        int x = 1534236469;
        System.out.println(new Solution().reverse(x));
    }
}

class Solution {
    public int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }
        // Result overflows.
        if (res > 2147483647 || res < -2147483648) {
            return 0;
        } else {
            return (int)res;
        }
    }
}
