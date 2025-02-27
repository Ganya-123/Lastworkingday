package arrays;

public class MaximumProfitComplexity {
  public static void main(String[] args) {
    int[] prices = {7, 1, 5, 3, 6, 4};
    int maxProfit = findMaxProfit(prices);
    System.out.println(maxProfit);
  }

  private static int findMaxProfit(int[] prices) {
    int minValue = Integer.MAX_VALUE;
    int profit = 0;
    for (int dayPrice : prices) {
      if (dayPrice < minValue) {
        minValue = dayPrice;
      } else {
        int dayDifference = dayPrice - minValue;
        if (dayDifference > profit) {
          profit = dayDifference;
        }
      }
    }
    return profit;
  }
}
