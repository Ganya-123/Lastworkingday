package Strings;

import java.util.HashMap;
import java.util.Map;

public class Target {
  public static void main(String[] args) {
    Integer tgt = 6;
    int[] arr = {1, 2, 3, 4, 5};
    Map<Integer, Integer> map = new HashMap<>();// value,index
    for (int i = 0; i < arr.length; i++) {
      int value = tgt - arr[i];
      if (map.containsKey(value)) {
        System.out.println(i + ":" + map.get(value));
      } else {
        map.put(arr[i], i);
      }
    }

  }
}
