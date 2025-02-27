package Strings;

import java.util.Arrays;

public class StringReverse {
  public static void main(String[] args) {
    String input="Ganya ht gowda";
    StringBuilder builder=new StringBuilder(input);
    System.out.println( builder.reverse());
    String output="";
    System.out.println(output.length());
    for(int i=input.length()-1;i>=0;i--){
      output=output+input.charAt(i);
    }
    System.out.println(input.length());
    System.out.println(output.length());
    if(input.equals(output)){
      System.out.println("Palindrome");
    }

    char[] charArray=input.toCharArray();
    int start=0;
    int end=charArray.length-1;
    while(start<end){
      char temp=input.charAt(start);
      charArray[start]=charArray[end];
      charArray[end]=temp;
      start++;
      end--;
    }
    System.out.println("charArray :"+ new String(charArray));
  }
}
