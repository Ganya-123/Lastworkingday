package JavaBrains;

import java.util.HashMap;
import java.util.Map;

public class TargetSumComplexity {
  public static void main(String[] args) {
    int target = 12;
    int num[] = {2, 7, 10, 15};
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < num.length; i++) {
      int value = target - num[i];
      if (map.containsKey(value)) {
        System.out.println(map.get(value) + ":" + i);
      } else {
        map.put(num[i], i);
      }

    }
  }
}
