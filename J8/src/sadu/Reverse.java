package sadu;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Reverse {
  public static void main(String[] args) {
    List<Integer> ls = Arrays.asList(5, 2, 6, 4, 9, 8);
    ls.stream().sorted(Comparator.reverseOrder()).forEach(i-> System.out.println(i));

  }
}
