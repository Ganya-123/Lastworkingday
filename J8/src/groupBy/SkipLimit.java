package groupBy;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SkipLimit {
  public static void main(String[] args) {
    IntStream.range(0, 10).skip(1).limit(5).forEach(i -> System.out.println(i));

    System.out.println("--------------------");
    Stream.iterate(0, i -> i + 1).limit(20).forEach(i -> System.out.println(i));
  }
}
