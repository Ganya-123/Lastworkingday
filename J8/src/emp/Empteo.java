package emp;

import java.util.ArrayList;
import java.util.List;

public class Empteo {
  public static void main(String[] args) {
    List<Emp> emp = new ArrayList<>();
    emp.add(new Emp("Ganya", 25000));
    emp.add(new Emp("MAnu", 9000));
    emp.add(new Emp("bhima", 100));
    emp.add(new Emp("zebra", 9000));
    emp.add(new Emp("anu", 25000));
    emp.add(new Emp("ruta", 7000));
    emp.stream().filter(i -> i.getSalary() < 10000).map(i -> (i.getSalary() / 10) + i.getSalary()).forEach(System.out::println);
  }
}
