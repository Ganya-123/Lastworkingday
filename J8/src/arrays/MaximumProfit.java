package arrays;

public class MaximumProfit {
  public static void main(String[] args) {
    int[] prices = {7, 1, 5, 3, 6, 4};
    int maxProfit = findMaxProfit(prices);
    System.out.println(maxProfit);
  }

  private static int findMaxProfit(int[] prices) {
    int maxProfit = 0;
    for (int i = 0; i < prices.length; i++) {
      for (int j = i + 1; j < prices.length; j++) {
        int profitValue = prices[j] - prices[i];
        if (profitValue > 0 && profitValue > maxProfit) {
          maxProfit = profitValue;
        }
      }
    }
    return maxProfit;
  }
}
