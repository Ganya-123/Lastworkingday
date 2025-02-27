package lambda;

import javax.management.MBeanAttributeInfo;
import java.util.ArrayList;
import java.util.List;

public class GradeAverage {
  public static void main(String[] args) {
    List<Employee> employ=new ArrayList<>();
    employ.add(new Employee(1L,"Ganya","A",10000L));
    employ.add(new Employee(2L,"Ganya","B",10000L));
    employ.add(new Employee(3L,"Ganya","A",20000L));
    employ.add(new Employee(4L,"Ganya","C",10000L));
    employ.add(new Employee(5L,"Ganya","A",40000L));

    Double avg=employ.stream().filter(emp->emp.getGrade().equalsIgnoreCase("A")).map(emp->emp.getSalary()).mapToDouble(i->i).average().getAsDouble();

    System.out.println("avg :"+avg);

  }
  }
