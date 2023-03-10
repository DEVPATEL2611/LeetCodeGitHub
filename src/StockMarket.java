//121. Best Time to Buy and Sell Stock
//        Easy
//        24.1K
//        753
//        Companies
//        You are given an array prices where prices[i] is the price of a given stock on the ith day.
//
//        You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//
//        Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
//
//
//
//        Example 1:
//
//        Input: prices = [7,1,5,3,6,4]
//        Output: 5
//        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
//        Example 2:
//
//        Input: prices = [7,6,4,3,1]
//        Output: 0
//        Explanation: In this case, no transactions are done and the max profit = 0.
//
//
//        Constraints:
//
//        1 <= prices.length <= 105
//        0 <= prices[i] <= 104
// link https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();

        }
        int index = maxProfit(nums);
        System.out.println(index);

    }
    public static int maxProfit(int[] prices) {
        if(prices.length<=1){
            return 0;
        }
        int profit = 0;
        int buy = prices[0];
        for (int price : prices) {
            if (price > buy) {
                profit = Math.max(profit, price - buy);
            } else {
                buy = price;
            }
        }
        return profit;
    }
}
