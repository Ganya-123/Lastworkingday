package Strings;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class HashMapp {
  public static void main(String[] args) {
    String value="gabnbyatgowda1";
    char[] arra=value.toCharArray();
    Map<Character,Integer> map=new TreeMap<>();
    for (int i=0;i<arra.length;i++){
      if(map.containsKey(arra[i])){
        map.put(arra[i], map.get(arra[i]).intValue()+1);
      }
      else {
        map.put(arra[i],1);
      }
    }
    System.out.println(map);
  }
}
