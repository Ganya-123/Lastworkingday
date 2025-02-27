package arrays;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberofOccurrences {
  public static void main(String[] args) {

    //    Input1: arr = [1,2,2,1,1,3]
    //    Output: true
    //    Input2: arr = [1,2]
    //    Output: false
    int[] arr1 = {1, 2, 2, 1};
    boolean result = findUniqueOccurance(arr1);
    boolean result2 = findUniqueOccurance2(arr1);
    System.out.println(result);
    System.out.println(result2);
  }

  private static boolean findUniqueOccurance(int[] arr1) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr1.length; i++) {
      map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
    }
    int currentValue = Integer.MAX_VALUE;
    int previousValue = Integer.MAX_VALUE;
    for (int value : map.values()) {
      previousValue = currentValue;
      currentValue = value;
      if (previousValue == currentValue) {
        return false;
      }
    }
    return true;
  }

  private static boolean findUniqueOccurance2(int[] arr1) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr1.length; i++) {
      map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
    }
    HashSet<Integer> set = new HashSet<>(map.values());
    return map.size() == set.size();
  }

}
