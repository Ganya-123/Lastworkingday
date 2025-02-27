package Strings;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {

  static boolean isAnagram(String a, String b) {
    Map<Character,Integer> map1=new TreeMap<>();
    Map<Character,Integer> map2=new TreeMap<>();
    for(int i=0;i<a.length();i++){
      if(map1.containsKey(Character.toUpperCase(a.charAt(i)))){
        map1.put(Character.toUpperCase(a.charAt(i)), map1.get(a.charAt(i)).intValue()+1);
      }
      else{
        map1.put(Character.toUpperCase(a.charAt(i)), 1);
      }
    }
    for(int i=0;i<b.length();i++){
      if(map2.containsKey(b.charAt(i))){
        map2.put(b.charAt(i), map2.get(b.charAt(i)).intValue()+1);
      }
      else{
        map2.put(b.charAt(i), 1);
      }
    }
    for(int i=0;i<map1.size()-1;i++){
      if(map1.get(a.charAt(i)).intValue()!=(map2.get(a.charAt(i)).intValue()))
      {
        return false;
      }

  }

    return true;
  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    scan.close();
    boolean ret = isAnagram(a, b);
    System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
  }
}
