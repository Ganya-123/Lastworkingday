package emp;

import java.util.*;

public class EmpThre {
  public static void main(String[] args) {
    List<Emp> emp = new ArrayList<>();
    emp.add(new Emp("Ganya", 25000));
    emp.add(new Emp("MAnu", 9000));
//    emp.add(new Emp("bhima", 100));
//    emp.add(new Emp("zebra", 9000));
//    emp.add(new Emp("anu", 25000));
    emp.add(new Emp("Abhi", 7000));
    emp.add(new Emp("Ganya", 25000));
    emp.add(new Emp("MAnu", 9000));
    Set<Emp> set = new HashSet<>();
    emp.stream().filter(i -> set.add(i)).sorted(Comparator.comparing(Emp::getName)).forEach(System.out::println);
  }
}
