package groupBy;

import java.util.List;

public class PersonDept {
  public static void main(String[] args) {
    List<Person> persons = List.of(
      new Person(1, "Alex", 100d, new Department(1, "HR")),
      new Person(2, "Brian", 200d, new Department(1, "HR")),
      new Person(3, "Charles", 900d, new Department(2, "Finance")),
      new Person(4, "Aavid", 200d, new Department(2, "Finance")),
      new Person(5, "Edward", 200d, new Department(2, "Finance")),
      new Person(6, "Frank", 800d, new Department(3, "ADMIN")),
      new Person(7, "George", 900d, new Department(3, "ADMIN")));

    persons.stream().filter(i -> i.getName().startsWith("A")).forEach(i -> System.out.println(i));
  }

}
