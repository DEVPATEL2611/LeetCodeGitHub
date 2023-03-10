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
