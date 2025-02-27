package threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortNamesByLength {
  public static void main(String[] args) {
    List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Christopher", "Daniel"));


    names.sort(Comparator.comparingInt(String::length).reversed());
//    names.sort(Comparator.comparingInt(String::length).reversed());

    //names.sort(Comparator.comparingInt(String::length));

    System.out.println(names);
  }
}
