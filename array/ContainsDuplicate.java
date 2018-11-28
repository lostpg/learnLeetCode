// 2018.11.26
// https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/24/

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(new Solution().containsDuplicate(nums));
    }
}

class Solution {
    public boolean containsDuplicate(int[] nums) {
        java.util.HashSet<Integer> hs = new java.util.HashSet<>();
        for(int e : nums) {
            if (hs.contains(e)) {
                return true;
            } else {
                hs.add(e);
            }
        }
        return false;
    }
}
