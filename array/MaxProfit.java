// 2018.11.26
// https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/22/
public class MaxProfit {
    public static void main(String[] args) {
        // int[] prices = { 7, 1, 5, 3, 6, 4 };
        // int[] prices = { 1, 2, 3, 4, 5 };
        int[] prices = { 7, 6, 4, 3, 1 };
        int p = new Solution().maxProfit(prices);
        System.out.println(p);
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int[] profits = new int[prices.length];
        int ptr = 1;
        for (int len = prices.length; ptr < len; ++ptr) {
            profits[ptr] = prices[ptr] - prices[ptr - 1];
        }
        for (int e : profits) {
            if (e > 0)
                profit += e;
        }
        return profit;
    }
}
