package groupBy;

import java.util.Arrays;
import java.util.List;

public class Startswith1 {
  public static void main(String[] args) {

    List<Integer> ls = Arrays.asList(11, 42, 13, 23, 26, 18);

    ls.stream()
        .map(i -> String.valueOf(i))
        .filter(i -> i.startsWith("1"))
        .forEach(System.out::println);
  }
}
