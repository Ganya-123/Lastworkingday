package interviewQuestions;

public class UpperLowerCase {
  public static void main(String[] args) {
    String input="i love my country i love my country";
    String a=input.substring(0,input.length()/2).toLowerCase();
    String b=input.substring(input.length()/2,input.length()).toUpperCase();
    System.out.println(a+b);
  }
}
