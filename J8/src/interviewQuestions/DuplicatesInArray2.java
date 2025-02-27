package interviewQuestions;

import java.util.*;

public class DuplicatesInArray2 {
  public static void main(String[] args) {
    List<Integer> ls = new ArrayList<>(Arrays.asList(1, 2, 3,5, 4, 5, 6, 6,6, 7, 5));

    Set<Integer> set=new HashSet<>();
    ls.stream().filter(i->!set.add(i)).distinct().forEach(System.out::println);
  }
}
