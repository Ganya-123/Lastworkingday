package test.java;

import java.util.ArrayList;
import java.util.List;

public class NumberCombination {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4};
    List<List<Integer>> output = findNumberCombinations(arr);
    System.out.println(output);

  }

  private static List<List<Integer>> findNumberCombinations(int[] arr) {
    int index = 0;
    List<List<Integer>> numberList = new ArrayList<>();
    List<Integer> ls = new ArrayList<>();
    findBacktrack(numberList, arr, index, ls);
    return numberList;
  }

  private static void findBacktrack(List<List<Integer>> numberList, int[] arr, int index, List<Integer> ls) {
    if (ls.size() == 2) {
      numberList.add(new ArrayList<>(ls));
      return;
    }

    for (int i = index; i < arr.length; i++) {
      ls.add(arr[i]);
      findBacktrack(numberList, arr, i + 1, ls);
      ls.removeLast();

    }
  }
}
