// 2018.11.25 
// https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/21/
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        // int[] nums = { 1, 1, 2 };
        Solution s = new Solution();
        int len = s.removeDuplicates(nums);
        System.out.println(len);
        for (int e : nums) {
            System.out.print(e + " ");
        }
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        int ptr = 1;
        int len = 1;
        int num_len = nums.length;
        for (; ptr < num_len; ++ptr) {
            if (nums[ptr] != nums[ptr - 1])
                nums[len++] = nums[ptr];
        }
        return len;
    }
}
