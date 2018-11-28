// 2018.11.26
// https://leetcode-cn.com/problems/rotate-array/description/
// 几个易错点:
// [1], 2
// [1, 2], 3
// 在 Solution1 下不会错, Solution2 下容易越界.
public class RotateArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6 };
        // int[] nums = { -1 };
        int k = 7;
        new Solution2().rotate(nums, k);
        for (int var : nums)
            System.out.print(var + " ");

    }
}

class Solution1 {
    public void rotate(int[] nums, int k) {
        int tmp1, tmp2, ptr = 0, cnt = 0;
        int len = nums.length;
        for (int i = 0; i != len; ++i) {
            tmp1 = nums[i]; //
            ptr = i;
            do {
                ptr = (ptr + k) % len;
                tmp2 = nums[ptr];
                nums[ptr] = tmp1;
                tmp1 = tmp2;
                cnt++;
            } while (ptr != i && cnt < len);
            if (cnt == len)
                break;
        }
    }
}

class Solution2 {
    public void rotate(int[] nums, int k) {
        if (nums.length > 1) {
            reverse(nums, 0, nums.length);
            reverse(nums, 0, k % nums.length);
            reverse(nums, k % nums.length, nums.length);
        }
    }

    // Reverse elements of index begin ~ end - 1.
    public void reverse(int[] nums, int begin, int end) {
        int half_len = (int) ((end - begin) / 2);
        int tmp;
        for (int i = 0; i < half_len; ++i) {
            tmp = nums[begin + i];
            nums[begin + i] = nums[end - 1 - i];
            nums[end - 1 - i] = tmp;
        }
    }
}
