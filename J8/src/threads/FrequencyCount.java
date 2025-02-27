package threads;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
  public static void main(String[] args) {
//    int arr[] = {1, 1, 1, 2, 2, 2, 2, 11, 3, 3};
//    int expout[] = {2, 2, 2, -1, -1, -1, -1, 3, -1, -1};

    int arr[] = {1, 1, 2, 3, 4, 2, 1};
    int expout[]=   {-1, -1, 1, 2, 2, 1, -1};

    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      if (map.containsKey(arr[i])) {
        map.put(arr[i], map.get(arr[i]) + 1);
      } else {
        map.put(arr[i], 1);
      }
    }
    for (int k = 0; k < arr.length; k++) {
      int output = getposition(k, arr, map);
      arr[k] = output;

    }

    for (int a : arr) {
      System.out.print(a + ":");
    }
  }


  private static int getposition(int k, int[] arr, Map<Integer, Integer> map) {
    for (int j = k + 1; j < arr.length; j++) {
      if (map.get(arr[j]) > map.getOrDefault(arr[k], 0)) {
        return arr[j];
      }
    }
    return -1;
  }

}
