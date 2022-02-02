package Day3;

import java.util.HashMap;

public class Solution6 {
    public static void main(String[] args) {
        int[] prices = new int[]{7,6,4,3,1};
        System.out.println(new Solution6().maxProfit(prices));
    }

    /**
     * 动态规划
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        for (int i=1;i<prices.length;i++){
            if (min > prices[i]){
                min = prices[i];
            }
            max = Math.max(max,prices[i]-min);
        }
        return max;
    }
}
