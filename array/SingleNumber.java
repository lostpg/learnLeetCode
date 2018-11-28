// 2018.11.27
// https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/25/
// 更简单的方法是 num = 0, 所有数字都与 num 异或一次, 一个数字与自己异或得到 0, 与 0 异或得到自己.
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = { 4, 1, 2, 1, 2 };
        System.out.println(new Solution().singleNumber(nums));
    }
}

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int e: nums) {
            if (hm.containsKey(e)) hm.put(e, 2);
            else hm.put(e, 1);            
        }
        Set set = hm.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()) {
            Map.Entry me = (Map.Entry) it.next();
            if ((int)me.getValue() == 1) return (int)me.getKey();
        }
        return 0;
    }
}
