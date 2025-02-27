package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {
  public static void main(String[] args) {
    Employee emp1 = new Employee("ghj", 30, 50000);
    Employee emp2 = new Employee("Bob", 25, 60000);
    Employee emp3 = new Employee("Charlie", 25, 55000);
    Employee emp4 = new Employee("Alice", 25, 70000);
    Employee emp5 = new Employee("Bob", 22, 45000);

    List<Employee> employees = new ArrayList<>();
    employees.add(emp1);
    employees.add(emp2);
    employees.add(emp3);
    employees.add(emp4);
    employees.add(emp5);
    // Collections.sort(employees);
    Collections.sort(employees, new AgeCmp());
    employees.stream().forEach(System.out::println);

  }
}
