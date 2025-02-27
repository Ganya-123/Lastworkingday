package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExp {
  public static void main(String[] args) {
    Calculator calc = (a,b)->System.out.println(a+b);
calc.sum(5,9);

    List<Book> book=new ArrayList<>();
    book.add(new Book(1L,"Autobiography of Ganya"));
    book.add(new Book(2L,"Autobiography of Ganya translated to English"));
    book.add(new Book(3L,"Autobiography of Ganya translated to hindi"));
    book.add(new Book(3L,"Autobiography of Ganya translated to hindi"));
    List<Integer> ls= Arrays.asList(98765,223456756,345678);
    System.out.println(book.stream().findFirst().get());
    System.out.println("--------------------------------");
   // book.stream().filter(i->i.getId()%2==0).forEach(i-> System.out.println(i));
    book.stream().forEach(i-> System.out.println(i));
    System.out.println(book.stream().collect(Collectors.toList()));

    System.out.println(book.stream().collect(Collectors.toSet()));
    System.out.println(ls.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

  }
}
