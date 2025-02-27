package threads;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCount2 {
  public static void main(String[] args) {
//    int arr[] = {1, 1, 1, 2, 2, 2, 2, 11, 3, 3};
//    int expout[] = {2, 2, 2, -1, -1, -1, -1, 3, -1, -1};

    int arr[] = {1, 1, 2, 3, 4, 2, 1};
    int expout[] = {-1, -1, 1, 2, 2, 1, -1};

    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      if (map.containsKey(arr[i])) {
        map.put(arr[i], map.get(arr[i]) + 1);
      } else {
        map.put(arr[i], 1);
      }
    }
    for (int k = 0; k < arr.length; k++) {
      int temp = arr[k];
      arr[k] = -1;


      for (int l = k + 1; l < arr.length; l++) {
        if (map.getOrDefault(arr[l], 0) > map.getOrDefault(temp, 0)) {
          arr[k] = arr[l];
          break;
        }

      }
    }
    for (int a : arr) {
      System.out.print(a + ":");
    }
  }


}
