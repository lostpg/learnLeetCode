// 2018.11.27
// https://leetcode-cn.com/problems/reverse-string/description/
public class ReverseString{
    public static void main(String[] args) {
        String input = "hello";
        String input1 = "A man, a plan, acanal: Panama";
        System.out.println(new Solution().reverseString(input));
        System.out.println(new Solution().reverseString(input1));
    }
}

class Solution {
    public String reverseString(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
}
