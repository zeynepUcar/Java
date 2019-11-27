package Interview;

public class ProfitTask {
    //    Example 2:
//
//    Input: [7,6,4,3,1]
//    Output: 0
//    Explanation: In this case, no transaction is done, i.e. max profit = 0.


    public static void main(String[] args) {
        int[] prices = new int[]{7,6,4,3,1};
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