package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoDArrayAverage {
  public static void main(String[] args) {
    String[][] students = {
      {"A", "85"},
      {"B", "92"},
      {"A", "78"},
      {"B", "89"},
      {"C", "89"}

    };
    int average = 0;
    String avgName = "";
    Map<String, List<Integer>> map = new HashMap<>();
    for (String[] arr : students) {
      String name = arr[0];
      int val = Integer.parseInt(arr[1]);
      if (!map.containsKey(name)) {
        map.put(name, new ArrayList<>());
      }
      map.get(name).add(val);
    }
    for (Map.Entry<String, List<Integer>> indVal : map.entrySet()) {
      String name = indVal.getKey();
      List<Integer> marksLst = indVal.getValue();
      int totalmarks = 0;
      for (int i : marksLst) {
        totalmarks = totalmarks + i;
      }
      int averageind = totalmarks / marksLst.size();
      if (averageind > average) {
        avgName = name;
        average = averageind;
      }
    }
    System.out.println(average);
    System.out.println(avgName);
  }
}
