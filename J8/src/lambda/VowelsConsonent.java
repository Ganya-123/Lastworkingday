package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VowelsConsonent {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    Character value=sc.next().charAt(0);
    List<Character> vowels= Arrays.asList('a','A','E','e','I','i','O','o','U','u');
    if(vowels.contains(value)){
      System.out.println("Its an vowel");
    }
    else {
      System.out.println("Its an consonent");
    }
  }
}
