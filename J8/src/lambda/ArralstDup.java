package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArralstDup {
  public static void main(String[] args) {
    List<Integer> al=new ArrayList<>();
    al.add(1);
    al.add(2);
    al.add(1);
    al.add(3);
   Set<Integer> set= al.stream().collect(Collectors.toSet());
    System.out.println(set);
  }
}
