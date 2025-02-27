package groupBy;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount {
  public static void main(String[] args) {
    String input = "ilovejavatechie";

    // group by character
    Map<String, List<String>> map1 = Arrays.stream(input.split("")).collect(Collectors.groupingBy(i -> i));
    System.out.println(map1);

    Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream().forEach(i-> System.out.println(i));

    // group by count
    Map<String, Long> map2 = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    System.out.println("count of each elements" + map2);

//duplicate elements
    List<String> ls = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(i -> i.getValue() > 1).map(i -> i.getKey()).collect(Collectors.toList());

    System.out.println("duplicate elements" + ls);

    //unique elements
    List<String> ls2 = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(i -> i.getValue() == 1).map(i -> i.getKey()).collect(Collectors.toList());
    System.out.println("unique elements" + ls2);

    //First non repeating element here we have used LinkedHashMap to maintain insertion order
    Optional<String> ls3 = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(i -> i.getValue() == 1).map(i -> i.getKey()).findFirst();
    System.out.println(ls3.get());

    ///oRRRR
    String ls4 = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(i -> i.getValue() == 1).findFirst().get().getKey();
    System.out.println(ls4);
  }
}
