package interviewQuestions;

import java.util.Scanner;

public class SortArrayNames {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of names u want to sort");
    int n = sc.nextInt();
    System.out.println("Enter the number of names u want to sort");
    String names[] = new String[n];
    for (int i = 0; i < n; i++) {
      names[i] = sc.next();
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (names[i].compareTo(names[j]) < 1) {
          String temp = names[i];
          names[i] = names[j];
          names[j] = temp;

        }
      }
    }
    for (int i = 0; i < n; i++) {
      System.out.println(names[i]);
    }
  }
}
