package Demo;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
  public static void main(String[] args) {
    List<Integer> ls = new ArrayList<>();
    ls.add(0, 1);
    ls.add(1, 2);
    ls.add(2, 3);
    System.out.println(ls);
    ClasA a = new ClasA();
    a.add(7);
  }
}
