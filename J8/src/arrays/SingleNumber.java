package arrays;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
  public static void main(String[] args){
    Set<Integer> set = new HashSet<>();
    Integer nums[] = {4, 1, 2, 1, 2};
    for (int i : nums) {
      boolean result = set.add(i);
      if (!result) {
        set.remove(i);
      }
    }
    System.out.println(set.iterator().next());
  }
}
