// 2018.11.27
// https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/26/
import java.util.ArrayList;
import java.util.Arrays;

public class Intersect {
    public static void main(String[] args) {
        // int[] nums1 = { 1, 2, 2, 1 };
        // int[] nums2 = { 2, 2 };
        int[] nums1 = { 4, 9, 5 };
        int[] nums2 = { 9, 4, 9, 8, 4 };
        int[] res = new Solution().intersect(nums1, nums2);
        for (int e : res) {
            System.out.print(e + " ");
        }
    }
}

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // make sure nums1 is shorter.
        if (nums1.length > nums2.length)
            return intersect(nums2, nums1);
        else {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            ArrayList<Integer> al = new ArrayList<>();
            int ptr = 0;
            for (int e : nums1) {
                for (int i = ptr; i < nums2.length; ++i) {
                    if (e == nums2[i]) {
                        al.add(e);
                        ptr = i + 1;
                        break;
                    }
                }
            }
            int[] res = new int[al.size()];
            ptr = 0;
            for (int e : al) {
                res[ptr++] = e;
            }
            return res;
        }
    }
}
