package masteringPro;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateInArrayWithTimeCom3 {
  public static void main(String[] args) {
    int arr[] = {1, 2, 2, 3, 4, 4, 5, 5, 5};
    Set<Integer> set = new HashSet<>();
//    for (int i = 0; i < arr.length; i++) {
//      if (set.add(arr[i])) {
//        System.out.print(" " + arr[i]);
//      }
//    }
    Arrays.stream(arr).filter(i -> !set.add(i)).distinct().forEach(i -> System.out.print(" " + i));
  }
}
