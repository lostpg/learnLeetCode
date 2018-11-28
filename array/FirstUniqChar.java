// 2018.11.27 
// https://leetcode-cn.com/problems/first-unique-character-in-a-string/description/
public class FirstUniqChar {
    public static void main(String[] args) {
        String s = "leetcode";
        String s1 = "";
        System.out.println(new Solution1().firstUniqChar(s));
        System.out.println(new Solution1().firstUniqChar(s1));
    }
}

class Solution {
    public int firstUniqChar(String s) {
        java.util.LinkedHashMap<Character, Integer> hm = new java.util.LinkedHashMap<>();
        int len = s.length();
        for (int i = 0; i != len; ++i) {
            if (hm.containsKey(s.charAt(i)) == false)
                hm.put(s.charAt(i), i);
            else
                hm.put(s.charAt(i), -1);
        }
        java.util.Set set = hm.entrySet();
        java.util.Iterator it = set.iterator();
        Map.Entry me;
        while (it.hasNext()) {
            me = (Map.Entry) it.next();
            if ((int) me.getValue() != -1)
                return (int) me.getValue();
        }
        return -1;
    }
}

class Solution1 {
    public int firstUniqChar(String s) {
        int res = -1;
        int idx;
        for (char c = 'a'; c <= 'z'; ++c) {
            idx = s.indexOf(c);
            // System.out.printf("%c:%d %d%n",c, idx, s.lastIndexOf(c));
            if (idx != -1 && idx == s.lastIndexOf(c))
            res = (res == -1) ? idx : Math.min(res, idx);
        }
        return res;
    }
}
