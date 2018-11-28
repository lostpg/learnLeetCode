// 2018.11.27 
// https://leetcode-cn.com/problems/valid-anagram/description/
// char 支持隐式转换到 int, 因此可以用 hashtable 来计数.
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram{
    public static void main(String[] args) {
        // String s = "anagram", t = "nagaram";
        String s = "rat", t = "car";
        System.out.println(new Solution().isAnagram(s, t));
    }
}

class Solution {
    public boolean isAnagram(String s, String t){
        java.util.HashMap<Character, Integer> hm = new HashMap<>();
        char[] ca = s.toCharArray();
        for (char c: ca) {
            if (hm.containsKey(c) == false)  hm.put(c, 1);
            else hm.put(c, hm.get(c) + 1);
        }
        ca = t.toCharArray();
        for (char c: ca) {
            if (hm.containsKey(c) == false)  return false;
            else hm.put(c, hm.get(c) - 1);
        }
        java.util.Set set = hm.entrySet();
        java.util.Iterator it = set.iterator();
        Map.Entry me;
        while(it.hasNext()) {
            me = (Map.Entry)it.next();
            if ((int)me.getValue() != 0) return false;
        }
        return true;
    }
}
