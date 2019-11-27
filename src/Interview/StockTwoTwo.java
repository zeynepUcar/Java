package Interview;

import java.util.*;
public class StockTwoTwo {
    // Input: [1,2,3,4,5]
//    Output: 4
//    Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
//    Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are
//    engaging multiple transactions at the same time. You must sell before buying again.
//    Example 3:

    public static void main(String[] args) {
        int[] prices = new int[]{1,2,3,4,5};
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int p : prices) { // p gives us values, buying price
            min = Math.min(min, p);
            int profit = p - min;
            maxProfit = Math.max(maxProfit, profit);
        }
        System.out.println(maxProfit);





    }




}
