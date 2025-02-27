package interviewQuestions;
import java.util.Scanner;

public class Anagrams {

//  static boolean isAnagram(String a, String b) {
//    if(a.length()!= b.length()){
//      return false;
//    }
//    char[] a1=a.toLowerCase().toCharArray();
//    char[]  b1=b.toLowerCase().toCharArray();
//    java.util.Arrays.sort(a1);
//    java.util.Arrays.sort(b1);
//    for(int i=0;i<a1.length;i++){
//      if(a1[i]!=b1[i]){
//        return false;
//      }
//    }
//    return true;
//  }
static boolean isAnagram(String a, String b) {
  if(a.length()!= b.length()) return false;
  a= a.toLowerCase();
  b= b.toLowerCase();
  while(!a.isEmpty())
  {
    String temp = a.substring(0, 1);
    a = a.replaceAll(temp, "");
    b= b.replaceAll(temp, "");
    if(a.length()!=b.length()) return false;
  }
  return true;
}
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
//    String a = scan.next();
//    String b = scan.next();
//    scan.close();
    boolean ret = isAnagram("Ganya", "Ganyaa");
    System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
  }
}
