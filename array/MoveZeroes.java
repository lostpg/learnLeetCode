// 2018.11.27
// https://leetcode-cn.com/problems/move-zeroes/description/

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 0, 0, 0 };
        new Solution().moveZeroes(nums);
        for (int e : nums)
            System.out.print(e + " ");
    }
}

class Solution {
    public void moveZeroes(int[] nums) {
        int cnt_zeroes = 0; // number of zeroes
        for (int i = 0; i != nums.length; ++i) {
            if (nums[i] == 0) {
                cnt_zeroes++;
            } else {
                nums[i - cnt_zeroes] = nums[i];
            }
        }
        for (int i = nums.length - cnt_zeroes; i < nums.length; ++i) {
            nums[i] = 0;
        }
    }
}
