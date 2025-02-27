package Strings;

public class OccuranceOfFirstString {
  public static void main(String[] args) {
    String haystack = "sadbutsade";
    String needle = "de";
    int output = findPosition(haystack, needle);
    System.out.println(output);
  }

  private static int findPosition(String haystack, String needle) {
 //   return haystack.indexOf(needle);// direct but interviewer  ight not accept this;
    for(int i=0;i<=haystack.length()-needle.length();i++){
      String subst=haystack.substring(i,i+needle.length());
      if(subst.equals(needle)){
        return i;
      }
    }
    return -1;
  }
}
