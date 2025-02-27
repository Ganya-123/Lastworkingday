package interviewQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Duplicate {
  public static void main(String[] args) {
    String input="Ganya Gowda";

    Map<Character,Integer> map=new TreeMap<>();
    for(int i=0;i<input.length();i++){
      if(map.containsKey(input.charAt(i))){
        map.put(input.charAt(i), map.get(input.charAt(i))+1);
      }
      else {
        map.put(input.charAt(i),1);

      }
    }
  //  System.out.println(map);
    map.entrySet().stream().filter(i->i.getValue()>1).forEach(System.out::println);
  }
}
