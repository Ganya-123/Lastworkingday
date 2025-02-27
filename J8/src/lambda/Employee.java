package lambda;

import java.security.PrivateKey;

public class Employee {
  private Long id;
  private String name;
  private String grade;
  private Long salary;

  public Employee(Long id, String name, String grade, Long salary) {
    this.id = id;
    this.name = name;
    this.grade = grade;
    this.salary = salary;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

  public Long getSalary() {
    return salary;
  }

  public void setSalary(Long salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Employee{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", grade='" + grade + '\'' +
      ", salary=" + salary +
      '}';
  }
}
