package comparable;

import comparator.IdComparator;
import comparator.NameComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {
  public static void main(String[] args) {
    List<Student> ls=new ArrayList<>();
    ls.add(new Student(1,"Ganya"));
    ls.add(new Student(2,"Abhi"));
    ls.add(new Student(4,"Cat"));
    ls.add(new Student(3,"Bharth"));
    ls.add(new Student(1,"Abhi"));
    Collections.sort(ls);
    System.out.println(ls);
    System.out.println("---------------------------------------");
    Collections.sort(ls,new IdComparator());
    System.out.println(ls);


  }
  }
