package emp;

import java.util.Objects;

public class Emp {
  private String name;
  private int salary;

  public Emp(String name, int salary) {
    this.salary = salary;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Emp{" +
      "name='" + name + '\'' +
      ", salary=" + salary +
      '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Emp emp)) return false;
    return getSalary() == emp.getSalary() && Objects.equals(getName(), emp.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), getSalary());
  }
}
