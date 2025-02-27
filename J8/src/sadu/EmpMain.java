package sadu;

import java.util.ArrayList;
import java.util.List;

public class EmpMain {
  public static void main(String[] args) {
    List<Emp> emp = new ArrayList<>();
    emp.add(new Emp("Ganya", 23456));

    emp.add(new Emp("Abi", 54321));
    emp.add(new Emp("zen", 12456));
    emp.add(new Emp("Man", 5432));
    emp.stream().filter(i -> i.getSalary() > 10000).map(i -> i.getName()).forEach(System.out::println);
  }
}
