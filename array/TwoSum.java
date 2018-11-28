// 2018.11.27
// https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/29/

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 3,2,4 };
        int target = 6;
        int[] res = new Solution().twoSum(nums, target);
        for (int e : res)
            System.out.print(e + " ");
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int partner = 0;
        for (int i = 0; i != nums.length; ++i) {
            partner = target - nums[i];
            for (int j = i + 1; j != nums.length; ++j) {
                if (partner == nums[j])
                    return new int[] { i, j };
            }
        }
        return new int[] { 0, 0 };
    }
}
