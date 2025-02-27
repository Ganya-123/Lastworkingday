package arrays;

import java.util.HashMap;
import java.util.Map;

public class SumofUniqueElements {
  public static void main(String[] args) {
    /* Input: nums = [1,2,3,2]
    Output: 4
    Explanation: The unique elements are [1,3], and the sum is 4.
    Example 2:

    Input: nums = [1,1,1,1,1]
    Output: 0
    Explanation: There are no unique elements, and the sum is 0.*/
    int[] arr1 = {1, 2, 3, 2};
    int sum = findSumOfUnique(arr1);
    int sum2 = sumOfUnique(arr1);
    System.out.println(sum);
    System.out.println(sum2);
  }

  private static int findSumOfUnique(int[] arr1) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr1.length; i++) {
      map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
    }
    int sum = 0;
    for (Map.Entry<Integer, Integer> individualValue : map.entrySet()) {
      if (individualValue.getValue() == 1) {
        sum = sum + individualValue.getKey();
      }
    }
    return sum;
  }
// Advance method
  public static int sumOfUnique(int[] nums) {
    // Since nums[i] is between 1 and 100 in question mentioned

    int[] array = new int[101];
    for (int i : nums) {
      array[i] = array[i] + 1;
    }
    int sum=0;
    for(int i=0;i<nums.length;i++){
      if(array[i]==1){
        sum=sum+i;
      }
    }
    return sum;
  }
}
