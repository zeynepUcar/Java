package Interview;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StockProblemTwo {
    //    Best Time to Buy and Sell Stock II
//    Say you have an array for which the ith element is the price of a given stock on day i.
//
//    Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
//
//    Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
//
//    Example 1:
//
//    Input: [7,1,5,3,6,4]
//    Output: 7
//    Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
//    Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
    public static void main(String[] args) {


    int[] items = new int[]{7,1,5,3,6,4};
        int profit=0;
        // length - 1 dememizin neden en sonuncuyu saydirmak icin rakam arayacak ama yok, onu engellenmek icin
        for (int i=0; i<items.length-1;i++) {
            if(items[i+1]>items[i]) {



                profit+=(items[i+1]-items[i]);
            }
        }
        System.out.println(profit);




    }
}

