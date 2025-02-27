package lambda;

import java.io.LineNumberInputStream;
import java.util.Arrays;
import java.util.List;

public class ReduceImp {
  public static void main(String[] args) {
  List<Integer> number = Arrays.asList(88,91, 33, 11, 18, 90);
  int sum=number.stream().reduce((a,b)->a<b?a:b).get();
    System.out.println("sum :"+sum);

    List<String > word = Arrays.asList("Ganya Gowda","Adi","qwertyuioprtyu","erty");
String value=    word.stream().reduce((a,b)->a.length()>b.length()?a:b).get();
    System.out.println("value :"+value);
}}
