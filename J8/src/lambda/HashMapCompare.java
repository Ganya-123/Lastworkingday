package lambda;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HashMapCompare {
  public static void main(String[] args) {
    Map<String,Integer> map=new HashMap<>();
    map.put("ganya",6);

    map.put("bikas",8);
    map.put("Akah",2);
    map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
    System.out.println("**********************************");
    map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).forEach(i-> System.out.println(i));
/////////////////////////////////////

    Map<Book,Integer> emp=new HashMap<>();
    emp.put(new Book(11L,"Autobiography of Ganya"),6);
    emp.put(new Book(5L,"Autobiography of Ganya"),8);
    emp.put(new Book(6L,"Autobiography of Ganya"),2);
    emp.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Book::getId))).forEach(System.out::println);
    Optional.ofNullable(null).orElseThrow(()->new IllegalArgumentException("not found"));
  }
}
