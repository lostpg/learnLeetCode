// 2018.11.27
// https://leetcode-cn.com/problems/plus-one/description/
// 执行用时 0ms, 已经战胜 100.00% 的 java 提交记录.
public class PlusOne {
    public static void main(String[] args) {
        int[] digits = { 0, };
        int[] res = new Solution().plusOne(digits);
        for (int e : res) {
            System.out.print(e + " ");
        }
    }
}

class Solution {
    public int[] plusOne(int[] digits) {
        digits[digits.length - 1] += 1;
        for (int i = digits.length - 1; i > 0; --i) {
            if (digits[i] == 10) {
                digits[i] = 0;
                digits[i - 1] += 1;
            } else {
                break;
            }
        }
        if (digits[0] == 10) {
            digits[0] = 0;
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            System.arraycopy(digits, 0, res, 1, digits.length);
            return res;
        } else {
            return digits;
        }
    }

}
