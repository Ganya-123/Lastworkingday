package lambda;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayLst {
  public static void main(String[] args) {
    List<Integer> ls=new ArrayList<>();
    ls.add(0,4);
    ls.add(3);
    ls.add(2,2);
    ls.add(5);
    ls.add(1,3);
    ls.add(1,6);
    ls.add(1,5);
    System.out.println(ls);
    System.out.println(ls.get(2));
    System.out.println("---------------------------");
    System.out.println(ls.stream().filter(i->i%2!=0).collect(Collectors.toList()));

    Set<Integer> set=new HashSet<>();
    set.add(3);
    set.add(0);
    set.add(3);
    set.add(2);
    set.add(5);
    set.add(1);
    set.add(1);
    set.add(1);
    set.add(01);
    set.add(null);
    set.add(null);
    System.out.println(set);

    Set<Integer> treeSet=new TreeSet<>();
    treeSet.add(0);
    treeSet.add(3);
    treeSet.add(2);
    treeSet.add(5);
    treeSet.add(1);
    treeSet.add(1);
    treeSet.add(1);
    set.add(null);
    set.add(null);
    System.out.println(set);


  }
}
